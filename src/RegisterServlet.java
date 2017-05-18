import java.io.*;
import java.sql.*;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet
{
	private   Connection conn =null;
	private   Statement stmt;
	private   String userName="";
	private   String userPassword="";
	boolean isFind=true;
	private static final long serialVersionUID = 1L;
	
    public RegisterServlet() 
    {
        super();
    }
    
    protected void check(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	response.setContentType("text/html;charset=UTF-8");
    	request.setCharacterEncoding("UTF-8");
		
		String name=request.getParameter("name");
		
		//���ݿ����
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/flight";    //JDBC��URL    
			conn = DriverManager.getConnection(url, "root","18918067039");
			stmt = conn.createStatement(); //����Statement����
		
			String query = "select * from person";
			ResultSet result = stmt.executeQuery(query);
			ResultSetMetaData rm = result.getMetaData();//��ȡ���ݿ����ֶε����ơ��ֶε�ֵ������
		   
			while (result.next())
			{
				String Mysql_name=result.getString("accountName");
				if(Mysql_name.equals(name))
					{
					isFind=true;
					break;
					}
				else
					isFind=false;
			}
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
    }
    
    protected void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	response.setContentType("text/html;charset=UTF-8");
    	request.setCharacterEncoding("UTF-8");
    	try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/flight";    //JDBC��URL    
			conn = DriverManager.getConnection(url, "root","18918067039");
			stmt = conn.createStatement(); //����Statement����
		
			String query = "select * from person";
			ResultSet result = stmt.executeQuery(query);
			ResultSetMetaData rm = result.getMetaData();//��ȡ���ݿ����ֶε����ơ��ֶε�ֵ������
			String add="insert person values('"+request.getParameter("name")+"','"+request.getParameter("password")+"');";
			stmt.executeUpdate(add);
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
    }
    
    protected void create(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	response.setContentType("text/html;charset=UTF-8");
    	request.setCharacterEncoding("UTF-8");
    	String name=request.getParameter("name");
		//���ݿ����
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/account";    //ÿ���û�����Ӧһ����
			conn = DriverManager.getConnection(url, "root","18918067039");
			stmt = conn.createStatement(); //����Statement����
			
			String s1="create table "+ name+" (year varchar(100) not null, month varchar(100) not null, day varchar(100) not null, company varchar(100) not null, flightnumber varchar(100) not null, departure varchar(100) not null, destination varchar(100) not null , leavetime varchar(100) not null, arrivetime varchar(100) not null,jixing varchar(100) not null,price varchar(100) not null, departurecity varchar(100) not null, destinationcity varchar(100) not null); ";
			stmt.executeUpdate(s1);
			System.out.println("�����ɹ�");
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
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	check(request,response);
    	RequestDispatcher rd =null;
    	request.setAttribute("name",request.getParameter("name"));
    	if(isFind)
			rd = request.getRequestDispatcher("Register1.jsp");
		else
			{
			add(request,response);
			create(request,response);
			rd = request.getRequestDispatcher("Foreground2.jsp");
			}
		rd.forward(request,response);
	}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
	doGet(request, response);
}
}
