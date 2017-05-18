package Final.Result.Bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class personInformation
{
	private static Connection conn =null;
	private static Statement stmt;
	private static String accountName="";
	private static String accountPassword="";
	private static String flightNumber="";
	public static  Connection getConnection() throws SQLException,java.lang.ClassNotFoundException//�������ݿ�
{
	try
	{
        Class.forName("com.mysql.jdbc.Driver");
	}
	catch(ClassNotFoundException e1)
	{
        e1.printStackTrace();
    }
    String url="jdbc:mysql://localhost:3306/flight";    //JDBC��URL    
    
    try 
    {
        conn = DriverManager.getConnection(url, "root","18918067039");
        //����һ��Statement����
        stmt = conn.createStatement(); //����Statement����
        stmt.close();
        conn.close();
    } 
    catch (SQLException e)
    {
        e.printStackTrace();
    }
    return conn;
}

public static   void insertInformation() throws ClassNotFoundException, SQLException//�����ݿ�д����Ϣ
{
	 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flight", "root","18918067039");
	stmt = conn.createStatement();
	 //����������Ϊinfo���������û���������
	stmt.executeUpdate("create table person (accountName varchar(100) not null, accountPassword varchar(100) not null); ");
	 //��info���в�������
	stmt.executeUpdate("insert person values('250','250');");
	 
}

public static   void inquiryInformation() throws ClassNotFoundException, SQLException//��ѯ����
{
	String query = "select * from person";
	 ResultSet result = stmt.executeQuery(query);
	 //�Ի�õĲ�ѯ������д�����Result��Ķ�����в���
	 while (result.next())
	 {
		 accountName = result.getString("accountName");
		 accountPassword = result.getString("accountPassword");
	 System.out.println(accountName+"  ");
	 }
	 //�ر����Ӻ�����
	 stmt.close();
	 conn.close();
}

public static void main(String[] args)
{
	try
	{
		getConnection();
		insertInformation();
		inquiryInformation();
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
}
