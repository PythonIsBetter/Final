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

	stmt.executeUpdate("create table cityIATA (city varchar(100) not null, IATA varchar(100) not null); ");
	stmt.executeUpdate("insert cityIATA values('����','KMG');");
	stmt.executeUpdate("insert cityIATA values('�Ϻ�','PVG');");
	stmt.executeUpdate("insert cityIATA values('����','CAN');");
	stmt.executeUpdate("insert cityIATA values('����','PEK');");
	stmt.executeUpdate("insert cityIATA values('����','XMN');");
	stmt.executeUpdate("insert cityIATA values('�Ͼ�','NKG');");
	stmt.executeUpdate("insert cityIATA values('�ɶ�','CTU');");
	stmt.executeUpdate("insert cityIATA values('����','SZX');");
	stmt.executeUpdate("insert cityIATA values('̨��','TPE');");
	stmt.executeUpdate("insert cityIATA values('���','HKG');");
	stmt.executeUpdate("insert cityIATA values('Ϥ��','SYD');");
	stmt.executeUpdate("insert cityIATA values('�¼���','SIN');");
	stmt.executeUpdate("insert cityIATA values('�ϰ�','DXB');");
	stmt.executeUpdate("insert cityIATA values('����','NRT');");
	stmt.executeUpdate("insert cityIATA values('�׶�','ICN');");
	stmt.executeUpdate("insert cityIATA values('��¡��','KUL');");
	stmt.executeUpdate("insert cityIATA values('����','HGH');");
	stmt.executeUpdate("insert cityIATA values('����','BKK');");
	stmt.executeUpdate("insert cityIATA values('��ɼ�','LAX');");
	stmt.executeUpdate("insert cityIATA values('ŦԼ','JFK');");
	stmt.executeUpdate("insert cityIATA values('����','LXA');");
	stmt.executeUpdate("insert cityIATA values('����','SYX');");
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
