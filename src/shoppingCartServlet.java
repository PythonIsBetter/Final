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
			String url="jdbc:mysql://localhost:3306/account";    //ÿ���û�����Ӧһ����
			conn = DriverManager.getConnection(url, "root","18918067039");
			stmt = conn.createStatement(); //����Statement����
			
			String query = "select * from "+name+";";
			ResultSet result = stmt.executeQuery(query);
			ResultSetMetaData rm = result.getMetaData();//��ȡ���ݿ����ֶε����ơ��ֶε�ֵ������
			
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
			String url="jdbc:mysql://localhost:3306/account";    //ÿ���û�����Ӧһ����
			conn = DriverManager.getConnection(url, "root","18918067039");
			stmt = conn.createStatement(); //����Statement����
			
			 //��info���в�������
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
		
		//���ݿ����
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/account";    //ÿ���û�����Ӧһ����
			conn = DriverManager.getConnection(url, "root","18918067039");
			stmt = conn.createStatement(); //����Statement����
		
			String query = "select * from "+name+";";
			ResultSet result = stmt.executeQuery(query);
			ResultSetMetaData rm = result.getMetaData();//��ȡ���ݿ����ֶε����ơ��ֶε�ֵ������
		    List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();//������ݿ��е�����
			//�Ի�õĲ�ѯ������д�����Result��Ķ�����в���
			while (result.next())
			{
				Map<String, Object> m = new HashMap<String, Object>();//ʹ��Map�ļ�ֵ�ԣ��������ݿ��е��ֶκ��ֶζ�Ӧ��ֵ���д洢
		        for (int i = 1; i <= rm.getColumnCount(); i++) 
		        {//rm.getColumnCount()���ֶεĸ���
		            m.put(rm.getColumnName(i), result.getObject(i));//rm.getColumnName(i)���������ֶε����ƣ�rs.getObject(i)�������ֶζ�Ӧ��ֵ
		        }
		        list.add(m);//��Map���ϵļ�ֵ��ŵ�List������
			}
			request.setAttribute("lists", list);
			//�ر����Ӻ�����
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
