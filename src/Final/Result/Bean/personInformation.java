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
	public static  Connection getConnection() throws SQLException,java.lang.ClassNotFoundException//链接数据库
{
	try
	{
        Class.forName("com.mysql.jdbc.Driver");
	}
	catch(ClassNotFoundException e1)
	{
        e1.printStackTrace();
    }
    String url="jdbc:mysql://localhost:3306/flight";    //JDBC的URL    
    
    try 
    {
        conn = DriverManager.getConnection(url, "root","18918067039");
        //创建一个Statement对象
        stmt = conn.createStatement(); //创建Statement对象
        stmt.close();
        conn.close();
    } 
    catch (SQLException e)
    {
        e.printStackTrace();
    }
    return conn;
}

public static   void insertInformation() throws ClassNotFoundException, SQLException//向数据库写入信息
{
	 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flight", "root","18918067039");
	stmt = conn.createStatement();
	 //创建表，名字为info，包含了用户名，密码
	stmt.executeUpdate("create table person (accountName varchar(100) not null, accountPassword varchar(100) not null); ");
	 //向info表中插入数据
	stmt.executeUpdate("insert person values('250','250');");
	 
}

public static   void inquiryInformation() throws ClassNotFoundException, SQLException//查询数据
{
	String query = "select * from person";
	 ResultSet result = stmt.executeQuery(query);
	 //对获得的查询结果进行处理，对Result类的对象进行操作
	 while (result.next())
	 {
		 accountName = result.getString("accountName");
		 accountPassword = result.getString("accountPassword");
	 System.out.println(accountName+"  ");
	 }
	 //关闭连接和声明
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
