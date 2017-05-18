import java.io.*;
import java.sql.*;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyShoppingCartServlet extends HttpServlet
{
	private   Connection conn =null;
	private   Statement stmt;
	private String name="";
	private static final long serialVersionUID = 1L;
	
    public MyShoppingCartServlet() 
    {
        super();
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	request. setCharacterEncoding("utf-8");
    	response.setContentType("text/html;charset=utf-8");
		response.setHeader("content-type","text/html;charset=utf-8");
		name=new String(request.getParameter("username").getBytes("ISO-8859-1"),"utf-8");
		
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
    	request.setAttribute("name",name);
    	rd = request.getRequestDispatcher("shoppingCart.jsp");
		rd.forward(request,response);
	}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
	doGet(request, response);
}
}
