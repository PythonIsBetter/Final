import java.io.*;
import java.sql.*;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class shoppingCartServlet extends HttpServlet
{
	private   Connection conn =null;
	private   Statement stmt;
	private String departure = "";
	private String destination = "";
	private String company="";
	private String flightnumber="";
	private String leavetime="";
	private String arrivetime="";
	private String jixing="";
	private String price="";
	private String name="";
	private String year="";
	private String month="";
	private String day="";
	private String departurecity="";
	private String destinationcity="";
	private boolean haveTheSame=false;
	private static final long serialVersionUID = 1L;
	
    public shoppingCartServlet() 
    {
        super();
    }
    
    protected boolean check(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	request. setCharacterEncoding("utf-8");
    	response.setContentType("text/html;charset=utf-8");
		response.setHeader("content-type","text/html;charset=utf-8");
		
    	flightnumber=request.getParameter("flightnumber");
    	year=request.getParameter("year");
    	month=request.getParameter("month");
    	day=request.getParameter("day");
    	name=request.getParameter("name");
    	try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/account";    //每个用户名对应一个表
			conn = DriverManager.getConnection(url, "root","18918067039");
			stmt = conn.createStatement(); //创建Statement对象
			
			String query = "select * from "+name+";";
			ResultSet result = stmt.executeQuery(query);
			ResultSetMetaData rm = result.getMetaData();//获取数据库中字段的名称、字段的值和属性
			
			while (result.next())
			{
				String Mysql_flightnumber=result.getString("flightnumber");
				String Mysql_year=result.getString("year");
				String Mysql_month=result.getString("month");
				String Mysql_day=result.getString("day");
				if(Mysql_flightnumber.equals(flightnumber)&&Mysql_year.equals(year)&&Mysql_month.equals(month)&&Mysql_day.equals(day))
					{
					haveTheSame=true;
					break;
					}
				else
					haveTheSame=false;
			}

			stmt.close();
			conn.close();
		}
		catch (SQLException e)
        {
            e.printStackTrace();
        }
		catch(ClassNotFoundException e1)
		{
            e1.printStackTrace();
        }
    	return true;
    }
    
    protected void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	request. setCharacterEncoding("utf-8");
    	response.setContentType("text/html;charset=utf-8");
		response.setHeader("content-type","text/html;charset=utf-8");
		
    	departure=request.getParameter("departure");
    	destination=request.getParameter("destination");
    	company=request.getParameter("company");
    	flightnumber=request.getParameter("flightnumber");
    	leavetime=request.getParameter("leavetime");
    	arrivetime=request.getParameter("arrivetime");
    	jixing=request.getParameter("jixing");
    	price=request.getParameter("price");
    	name=request.getParameter("name");
    	year=request.getParameter("year");
    	month=request.getParameter("month");
    	day=request.getParameter("day");
    	departurecity=request.getParameter("departurecity");
    	destinationcity=request.getParameter("destinationcity");
    	try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/account";    //每个用户名对应一个表
			conn = DriverManager.getConnection(url, "root","18918067039");
			stmt = conn.createStatement(); //创建Statement对象
			
			 //向info表中插入数据
			String s1="insert "+ name+" values('"+year+"','"+month+"','"+day+"','"+company+"','"+flightnumber+"','"+ departure+"','"+ destination+"','"+ leavetime+"','"+arrivetime+"','"+ jixing+"','"+price+"','"+departurecity+"','"+destinationcity+"'); ";
			stmt.executeUpdate(s1);

			stmt.close();
			conn.close();
		}
		catch (SQLException e)
        {
            e.printStackTrace();
        }
		catch(ClassNotFoundException e1)
		{
            e1.printStackTrace();
        }
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	request. setCharacterEncoding("utf-8");
    	response.setContentType("text/html;charset=utf-8");
		response.setHeader("content-type","text/html;charset=utf-8");
		check(request,response);
		if(!haveTheSame)
			add(request,response);
		
		//数据库操作
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/account";    //每个用户名对应一个表
			conn = DriverManager.getConnection(url, "root","18918067039");
			stmt = conn.createStatement(); //创建Statement对象
		
			String query = "select * from "+name+";";
			ResultSet result = stmt.executeQuery(query);
			ResultSetMetaData rm = result.getMetaData();//获取数据库中字段的名称、字段的值和属性
		    List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();//存放数据库中的数据
			//对获得的查询结果进行处理，对Result类的对象进行操作
			while (result.next())
			{
				Map<String, Object> m = new HashMap<String, Object>();//使用Map的键值对，来对数据库中的字段和字段对应的值进行存储
		        for (int i = 1; i <= rm.getColumnCount(); i++) 
		        {//rm.getColumnCount()是字段的个数
		            m.put(rm.getColumnName(i), result.getObject(i));//rm.getColumnName(i)遍历的是字段的名称，rs.getObject(i)遍历是字段对应的值
		        }
		        list.add(m);//把Map集合的键值存放到List集合中
			}
			request.setAttribute("lists", list);
			//关闭连接和声明
			stmt.close();
			conn.close();
			
		}
		catch (SQLException e)
       {
           e.printStackTrace();
       }
		catch(ClassNotFoundException e1)
		{
           e1.printStackTrace();
       }
    	RequestDispatcher rd =null;
    	/*PrintWriter pw=response.getWriter();
    	pw.write(name);*/
    	request.setAttribute("name",name);
    	rd = request.getRequestDispatcher("shoppingCart.jsp");
		rd.forward(request,response);
	}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
	doGet(request, response);
}
}
