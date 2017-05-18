import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.*;

public class ResultServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	private   Connection conn =null;
	private   Statement stmt;
	private   String company="";
	private   String flightnumber="";
	private   String departure="";
	private   String destination="";
	private   String leavetime="";
	private   String arrivetime="";
	private   String jixing="";
	private   String price="";
	private   String departureIATA="";
	private   String destinationIATA="";
	
    public ResultServlet()
    {
        super();
    }
    
    protected void getIATA(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	response.setContentType("text/html;charset=UTF-8");
    	request.setCharacterEncoding("UTF-8");
    	
    	String departure=request.getParameter("departure");
    	String destination=request.getParameter("destination");
    	
    	try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/flight";    //JDBC的URL    
			conn = DriverManager.getConnection(url, "root","18918067039");
			stmt = conn.createStatement(); //创建Statement对象
		
			String query1 = "select * from cityIATA where city='"+departure+"';";
			ResultSet result1 = stmt.executeQuery(query1);
			if(result1.next())
				departureIATA=result1.getString("IATA");
			
			String query2 = "select * from cityIATA where city='"+destination+"';";
			ResultSet result2 = stmt.executeQuery(query2);
			if(result2.next())
				destinationIATA=result2.getString("IATA");
			
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
	}
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	response.setContentType("text/html;charset=UTF-8");
    	request.setCharacterEncoding("UTF-8");
    	
    	getIATA(request,response);
    	
		RequestDispatcher rd = request.getRequestDispatcher("Result.jsp");
   
		request.setAttribute("departure",request.getParameter("departure"));
		 request.setAttribute("destination",request.getParameter("destination"));
		 request.setAttribute("year",request.getParameter("year"));
		 request.setAttribute("month",request.getParameter("month"));
		 request.setAttribute("day",request.getParameter("day"));
		
		//数据库操作
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/flight";    //JDBC的URL    
			conn = DriverManager.getConnection(url, "root","18918067039");
			stmt = conn.createStatement(); //创建Statement对象
		
			String query = "select * from "+departureIATA+"TO"+destinationIATA+";";
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
		rd.forward(request,response);
	}
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
		doGet(request, response);
	}

}
