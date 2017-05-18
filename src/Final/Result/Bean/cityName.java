package Final.Result.Bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class cityName
{
	private static Connection conn =null;
	private static Statement stmt;
	private static String city="";
	private static String IATA="";
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

	stmt.executeUpdate("create table cityIATA (city varchar(100) not null, IATA varchar(100) not null); ");
	stmt.executeUpdate("insert cityIATA values('昆明','KMG');");
	stmt.executeUpdate("insert cityIATA values('上海','PVG');");
	stmt.executeUpdate("insert cityIATA values('广州','CAN');");
	stmt.executeUpdate("insert cityIATA values('北京','PEK');");
	stmt.executeUpdate("insert cityIATA values('厦门','XMN');");
	stmt.executeUpdate("insert cityIATA values('南京','NKG');");
	stmt.executeUpdate("insert cityIATA values('成都','CTU');");
	stmt.executeUpdate("insert cityIATA values('深圳','SZX');");
	stmt.executeUpdate("insert cityIATA values('台北','TPE');");
	stmt.executeUpdate("insert cityIATA values('香港','HKG');");
	stmt.executeUpdate("insert cityIATA values('悉尼','SYD');");
	stmt.executeUpdate("insert cityIATA values('新加坡','SIN');");
	stmt.executeUpdate("insert cityIATA values('迪拜','DXB');");
	stmt.executeUpdate("insert cityIATA values('东京','NRT');");
	stmt.executeUpdate("insert cityIATA values('首尔','ICN');");
	stmt.executeUpdate("insert cityIATA values('吉隆坡','KUL');");
	stmt.executeUpdate("insert cityIATA values('杭州','HGH');");
	stmt.executeUpdate("insert cityIATA values('曼谷','BKK');");
	stmt.executeUpdate("insert cityIATA values('洛杉矶','LAX');");
	stmt.executeUpdate("insert cityIATA values('纽约','JFK');");
	stmt.executeUpdate("insert cityIATA values('拉萨','LXA');");
	stmt.executeUpdate("insert cityIATA values('三亚','SYX');");
}

public static void main(String[] args)
{
	try
	{
		getConnection();
		insertInformation();
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
