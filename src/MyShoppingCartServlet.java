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
    	request.setAttribute("name",name);
    	rd = request.getRequestDispatcher("shoppingCart.jsp");
		rd.forward(request,response);
	}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
	doGet(request, response);
}
}
