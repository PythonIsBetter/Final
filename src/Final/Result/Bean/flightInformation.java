package Final.Result.Bean;
import java.sql.*;
import java.util.*;
import java.lang.*;

public class flightInformation
{
	private static Connection conn =null;
	private static Statement stmt;
	private static String company="";
	private static String flightnumber="";
	private static String departure="";
	private static String destination="";
	private static String leavetime="";
	private static String arrivetime="";
	private static String jixing="";
	private static String price="";
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
	
	public static void insertInformation() throws ClassNotFoundException, SQLException//向数据库写入信息
	{
		 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flight", "root","18918067039");
		stmt = conn.createStatement();
		 //创建表，名字为info，包含了航空公司，航班号，出发地，目的地，起飞时间，到达时间，机型，价格
		stmt.executeUpdate("create table KMGToPVG (company varchar(100) not null, flightnumber varchar(100) not null, departure varchar(100) not null, destination varchar(100) not null , leavetime varchar(100) not null, arrivetime varchar(100) not null, jixing varchar(100) not null,price varchar(100) not null); ");
		stmt.executeUpdate("create table PVGToCAN (company varchar(100) not null, flightnumber varchar(100) not null, departure varchar(100) not null, destination varchar(100) not null , leavetime varchar(100) not null, arrivetime varchar(100) not null, jixing varchar(100) not null,price varchar(100) not null); ");
		stmt.executeUpdate("create table PEKToXMN (company varchar(100) not null, flightnumber varchar(100) not null, departure varchar(100) not null, destination varchar(100) not null , leavetime varchar(100) not null, arrivetime varchar(100) not null, jixing varchar(100) not null,price varchar(100) not null); ");
		stmt.executeUpdate("create table NKGToPEK (company varchar(100) not null, flightnumber varchar(100) not null, departure varchar(100) not null, destination varchar(100) not null , leavetime varchar(100) not null, arrivetime varchar(100) not null, jixing varchar(100) not null,price varchar(100) not null); ");
		stmt.executeUpdate("create table CTUToSZX (company varchar(100) not null, flightnumber varchar(100) not null, departure varchar(100) not null, destination varchar(100) not null , leavetime varchar(100) not null, arrivetime varchar(100) not null, jixing varchar(100) not null,price varchar(100) not null); ");
		stmt.executeUpdate("create table PVGToTPE (company varchar(100) not null, flightnumber varchar(100) not null, departure varchar(100) not null, destination varchar(100) not null , leavetime varchar(100) not null, arrivetime varchar(100) not null, jixing varchar(100) not null,price varchar(100) not null); ");
		stmt.executeUpdate("create table PEKToHKG (company varchar(100) not null, flightnumber varchar(100) not null, departure varchar(100) not null, destination varchar(100) not null , leavetime varchar(100) not null, arrivetime varchar(100) not null, jixing varchar(100) not null,price varchar(100) not null); ");
		stmt.executeUpdate("create table CANToSYD (company varchar(100) not null, flightnumber varchar(100) not null, departure varchar(100) not null, destination varchar(100) not null , leavetime varchar(100) not null, arrivetime varchar(100) not null, jixing varchar(100) not null,price varchar(100) not null); ");
		stmt.executeUpdate("create table PEKToSIN (company varchar(100) not null, flightnumber varchar(100) not null, departure varchar(100) not null, destination varchar(100) not null , leavetime varchar(100) not null, arrivetime varchar(100) not null, jixing varchar(100) not null,price varchar(100) not null); ");
		stmt.executeUpdate("create table PVGToDXB (company varchar(100) not null, flightnumber varchar(100) not null, departure varchar(100) not null, destination varchar(100) not null , leavetime varchar(100) not null, arrivetime varchar(100) not null, jixing varchar(100) not null,price varchar(100) not null); ");
		
		stmt.executeUpdate("create table PVGToNRT (company varchar(100) not null, flightnumber varchar(100) not null, departure varchar(100) not null, destination varchar(100) not null , leavetime varchar(100) not null, arrivetime varchar(100) not null, jixing varchar(100) not null,price varchar(100) not null); ");
		stmt.executeUpdate("create table PEKToICN (company varchar(100) not null, flightnumber varchar(100) not null, departure varchar(100) not null, destination varchar(100) not null , leavetime varchar(100) not null, arrivetime varchar(100) not null, jixing varchar(100) not null,price varchar(100) not null); ");
		stmt.executeUpdate("create table KULToCAN (company varchar(100) not null, flightnumber varchar(100) not null, departure varchar(100) not null, destination varchar(100) not null , leavetime varchar(100) not null, arrivetime varchar(100) not null, jixing varchar(100) not null,price varchar(100) not null); ");
		stmt.executeUpdate("create table HGHToCTU (company varchar(100) not null, flightnumber varchar(100) not null, departure varchar(100) not null, destination varchar(100) not null , leavetime varchar(100) not null, arrivetime varchar(100) not null, jixing varchar(100) not null,price varchar(100) not null); ");
		stmt.executeUpdate("create table KMGToBKK (company varchar(100) not null, flightnumber varchar(100) not null, departure varchar(100) not null, destination varchar(100) not null , leavetime varchar(100) not null, arrivetime varchar(100) not null, jixing varchar(100) not null,price varchar(100) not null); ");
		stmt.executeUpdate("create table LAXToPVG (company varchar(100) not null, flightnumber varchar(100) not null, departure varchar(100) not null, destination varchar(100) not null , leavetime varchar(100) not null, arrivetime varchar(100) not null, jixing varchar(100) not null,price varchar(100) not null); ");
		stmt.executeUpdate("create table LAXToJFK (company varchar(100) not null, flightnumber varchar(100) not null, departure varchar(100) not null, destination varchar(100) not null , leavetime varchar(100) not null, arrivetime varchar(100) not null, jixing varchar(100) not null,price varchar(100) not null); ");
		stmt.executeUpdate("create table LXAToCTU (company varchar(100) not null, flightnumber varchar(100) not null, departure varchar(100) not null, destination varchar(100) not null , leavetime varchar(100) not null, arrivetime varchar(100) not null, jixing varchar(100) not null,price varchar(100) not null); ");
		stmt.executeUpdate("create table SZXToKMG (company varchar(100) not null, flightnumber varchar(100) not null, departure varchar(100) not null, destination varchar(100) not null , leavetime varchar(100) not null, arrivetime varchar(100) not null, jixing varchar(100) not null,price varchar(100) not null); ");
		stmt.executeUpdate("create table SYXToPEK (company varchar(100) not null, flightnumber varchar(100) not null, departure varchar(100) not null, destination varchar(100) not null , leavetime varchar(100) not null, arrivetime varchar(100) not null, jixing varchar(100) not null,price varchar(100) not null); ");
		
		//向info表中插入数据
		stmt.executeUpdate("insert KMGToPVG values('上海航空','FM9452','长水机场   ','虹桥机场 T2','13:50','16:55','波音B767（大型机）','1920');");
		stmt.executeUpdate("insert KMGToPVG values('吉祥航空','HO1092','长水机场   ','虹桥机场 T2','20:45','23:50','空客A320（中型机）','1400');");
		stmt.executeUpdate("insert KMGToPVG values('吉祥航空','HO1094','长水机场   ','虹桥机场 T2','08:35','11:40','空客A320（中型机）','1400');");
		stmt.executeUpdate("insert KMGToPVG values('东方航空','MU5588','长水机场   ','浦东机场 T1','16:15','21:15','空客A321（中型机）','1920');");
		stmt.executeUpdate("insert KMGToPVG values('东方航空','MU756','长水机场   ','浦东机场 T1','09:10','12:10','空客A332（大型机）','1920');");
		stmt.executeUpdate("insert KMGToPVG values('昆明航空','KY8283','长水机场   ','浦东机场 T2','08:00','1055','波音B738（中型机）','2270');");
		stmt.executeUpdate("insert KMGToPVG values('南方航空','CZ6800','长水机场   ','浦东机场 T2','20:10','23:10','空客A320（中型机）','1430');");
		stmt.executeUpdate("insert KMGToPVG values('上海航空','FM9454','长水机场   ','虹桥机场 T2','16:45','20:00','波音B737（中型机）','1920');");
		stmt.executeUpdate("insert KMGToPVG values('东方航空','MU5825','长水机场   ','虹桥机场 T2','11:00','14:05','波音B738（中型机）','1920');");
		stmt.executeUpdate("insert KMGToPVG values('东方航空','MU5813','长水机场   ','虹桥机场 T2','17:30','20:35','波音B738（中型机）','1920');");
		
		stmt.executeUpdate("insert PVGToCAN values('东方航空','MU5307','虹桥机场 T2','白云机场   ','14:30','17:05','波音B739（中型机）','1230');");
		stmt.executeUpdate("insert PVGToCAN values('南方航空','CZ3175','浦东机场 T2','白云机场   ','18:15','20:25','空客A320（中型机）','690');");
		stmt.executeUpdate("insert PVGToCAN values('中国国航','CA1865','浦东机场 T2','白云机场   ','16:55','19:40','空客A321（中型机）','740');");
		stmt.executeUpdate("insert PVGToCAN values('南方航空','CZ3526','虹桥机场 T2','白云机场   ','16:50','19:30','空客A33G（大型机）','690');");
		stmt.executeUpdate("insert PVGToCAN values('上海航空','FM9311','虹桥机场 T2','白云机场   ','17:30','20:05','空客A333（大型机）','690');");
		stmt.executeUpdate("insert PVGToCAN values('南方航空','CZ3538','虹桥机场 T2','白云机场   ','14:50','17:25','波音B787（大型机）','690');");
		stmt.executeUpdate("insert PVGToCAN values('东方航空','MU5311','浦东机场 T1','白云机场   ','16:10','18:55','空客A320（中型机）','690');");
		stmt.executeUpdate("insert PVGToCAN values('中国国航','CA1830','虹桥机场 T2','白云机场   ','19:50','22:25','空客A333（大型机）','620');");
		stmt.executeUpdate("insert PVGToCAN values('南方航空','CZ3569','虹桥机场 T2','白云机场   ','08:50','11:25','波音B77W（大型机）','820');");
		stmt.executeUpdate("insert PVGToCAN values('南方航空','CZ3610','浦东机场 T2','白云机场   ','20:50','23:35','空客A320（中型机）','820');");

		stmt.executeUpdate("insert PEKToXMN values('厦门航空','MF8170','首都机场 T2','高崎机场 T3','21:20','00:20','波音B738（中型机）','890');");
		stmt.executeUpdate("insert PEKToXMN values('山东航空','SC1152','首都机场 T3','高崎机场 T4','20:35','00:50','波音B738（中型机）','510');");
		stmt.executeUpdate("insert PEKToXMN values('中国国航','CA1801','首都机场 T3','高崎机场 T4','20:05','23:10','波音B738（中型机）','880');");
		stmt.executeUpdate("insert PEKToXMN values('中国国航','CA1815','首都机场 T3','高崎机场 T4','16:20','19:25','空客A321（中型机）','1130');");
		stmt.executeUpdate("insert PEKToXMN values('厦门航空','MF8106','首都机场 T2','高崎机场 T3','18:55','22:05','波音B757（中型机）','1070');");
		stmt.executeUpdate("insert PEKToXMN values('首都航空','JD5375','首都机场 T1','高崎机场 T4','08:55','12:00','空客A330（大型机）','775');");
		stmt.executeUpdate("insert PEKToXMN values('山东航空','SC4994','首都机场 T3','高崎机场 T4','07:55','10:55','波音B738（中型机）','620');");
		stmt.executeUpdate("insert PEKToXMN values('海南航空','HU7191','首都机场 T1','高崎机场 T4','08:40','11:40','波音B767（大型机）','820');");
		stmt.executeUpdate("insert PEKToXMN values('厦门航空','MF8118','首都机场 T2','高崎机场 T3','10:55','14:00','波音B738（中型机）','1410');");
		stmt.executeUpdate("insert PEKToXMN values('厦门航空','MF8102','首都机场 T2','高崎机场 T3','16:05','19:05','波音B787（大型机）','1410');");

		stmt.executeUpdate("insert NKGToPEK values('东方航空','MU2786','禄口机场 T2','首都机场 T2','08:30','10:20','空客A320（中型机）','370');");
		stmt.executeUpdate("insert NKGToPEK values('中国国航','CA1818','禄口机场 T2','首都机场 T3','11:45','13:45','波音B738（中型机）','370');");
		stmt.executeUpdate("insert NKGToPEK values('东方航空','MU2821','禄口机场 T2','首都机场 T2','12:50','14:45','空客A320（中型机）','370');");
		stmt.executeUpdate("insert NKGToPEK values('东方航空','MU2786','禄口机场 T2','首都机场 T2','08:30','10:20','空客A320（中型机）','370');");
		stmt.executeUpdate("insert NKGToPEK values('中国国航','CA1848','禄口机场 T2','首都机场 T3','13:55','15:50','波音B738（中型机）','370');");
		stmt.executeUpdate("insert NKGToPEK values('东方航空','MU2841','禄口机场 T2','首都机场 T2','17:00','18:55','空客A320（中型机）','370');");
		stmt.executeUpdate("insert NKGToPEK values('中国国航','CA1562','禄口机场 T2','首都机场 T3','17:20','19:20','波音B738（中型机）','370');");
		stmt.executeUpdate("insert NKGToPEK values('东方航空','MU2851','禄口机场 T2','首都机场 T2','18:20','20:25','空客A320（中型机）','370');");
		stmt.executeUpdate("insert NKGToPEK values('东方航空','MU2861','禄口机场 T2','首都机场 T2','20:15','22:15','空客A320（中型机）','370');");
		stmt.executeUpdate("insert NKGToPEK values('中国国航','CA1504','禄口机场 T2','首都机场 T3','20:40','22:40','空客A321（中型机）','370');");

		stmt.executeUpdate("insert CTUToSZX values('深圳航空','ZH9410','双流机场 T2','宝安机场 T3','17:40','20:20','空客A320（中型机）','1480');");
		stmt.executeUpdate("insert CTUToSZX values('深圳航空','ZH9406','双流机场 T2','宝安机场 T3','15:20','17:55','空客A320（中型机）','1480');");
		stmt.executeUpdate("insert CTUToSZX values('海南航空','HU7742','双流机场 T2','宝安机场 T3','19:30','21:45','波音B738（中型机）','1465');");
		stmt.executeUpdate("insert CTUToSZX values('中国国航','CA4383','双流机场 T2','宝安机场 T3','16:30','18:55','空客A330（大型机）','1480');");
		stmt.executeUpdate("insert CTUToSZX values('南方航空','CZ3454','双流机场 T2','宝安机场 T3','16:35','19:00','空客A321（中型机）','1480');");
		stmt.executeUpdate("insert CTUToSZX values('东方航空','MU5319','双流机场 T2','宝安机场 T3','15:40','18:15','空客A320（中型机）','1470');");
		stmt.executeUpdate("insert CTUToSZX values('中国国航','CA4325','双流机场 T2','宝安机场 T3','09:30','11:55','空客A330（大型机）','1480');");
		stmt.executeUpdate("insert CTUToSZX values('南方航空','CZ3458','双流机场 T2','宝安机场 T3','11:50','14:20','空客A330（大型机）','1480');");
		stmt.executeUpdate("insert CTUToSZX values('四川航空','3U8703','双流机场 T1','宝安机场 T3','11:35','14:00','空客A321（中型机）','3400');");
		stmt.executeUpdate("insert CTUToSZX values('深圳航空','ZH9404','双流机场 T2','宝安机场 T3','09:00','11:30','空客A320（中型机）','1480');");

		stmt.executeUpdate("insert PVGToTPE values('吉祥航空','HO1309','浦东机场 T2','桃园机场 T1','09:50','11:50','空客A320（中型机）','2461');");
		stmt.executeUpdate("insert PVGToTPE values('中国国航','CA191','浦东机场 T2','桃园机场 T2','08:00','09:55','空客A333（大型机）','2764');");
		stmt.executeUpdate("insert PVGToTPE values('中国国航','CA195','浦东机场 T2','桃园机场 T2','14:30','16:25','空客A333（大型机）','3064');");
		stmt.executeUpdate("insert PVGToTPE values('中华航空','CI504','浦东机场 T1','桃园机场 T2','19:50','22:00','波音B744（大型机）','2773');");
		stmt.executeUpdate("insert PVGToTPE values('上海航空','FM801','浦东机场 T1','松山机场 T1','09:10','11:05','波音B738（中型机）','3474');");
		stmt.executeUpdate("insert PVGToTPE values('长荣航空','BR721','浦东机场 T2','桃园机场 T2','20:10','22:05','波音B77W（大型机）','3285');");
		stmt.executeUpdate("insert PVGToTPE values('东方航空','MU5097','虹桥机场 T1','松山机场 T1','14:20','16:15','空客A333（大型机）','3546');");
		stmt.executeUpdate("insert PVGToTPE values('南方航空','CZ3095','浦东机场 T2','桃园机场 T2','14:15','16:10','空客A320（中型机）','3690');");
		stmt.executeUpdate("insert PVGToTPE values('中华航空','CI502','浦东机场 T1','桃园机场 T2','12:05','14:05','波音B77W（大型机）','4803');");
		stmt.executeUpdate("insert PVGToTPE values('中华航空','CI202','虹桥机场 T1','松山机场 T1','16:15','18:15','空客A333（大型机）','4803');");
		stmt.executeUpdate("insert PVGToTPE values('立荣航空','B7501','浦东机场 T2','松山机场 T1','11:15','13:10','空客A321（中型机）','5230');");

		stmt.executeUpdate("insert PEKToHKG values('香港航空','HX337','首都机场 T2','香港机场 T1','12:15','15:55','空客A333（大型机）','1264');");
		stmt.executeUpdate("insert PEKToHKG values('香港航空','HX313','首都机场 T2','香港机场 T1','19:55','23:30','空客A333（大型机）','1264');");
		stmt.executeUpdate("insert PEKToHKG values('中国国航','CA109','首都机场 T3','香港机场 T1','13:00','16:25','空客A33A（大型机）','1321');");
		stmt.executeUpdate("insert PEKToHKG values('南方航空','CZ310','首都机场 T2','香港机场 T1','09:05','12:40','空客A321（中型机）','1924');");
		stmt.executeUpdate("insert PEKToHKG values('中国国航','CA111','首都机场 T3','香港机场 T1','09:30','15:55','空客A33A（大型机）','2401');");
		stmt.executeUpdate("insert PEKToHKG values('国泰港龙航空','KA993','首都机场 T3','香港机场 T1','18:30','22:10','空客A333（大型机）','2495');");
		stmt.executeUpdate("insert PEKToHKG values('国泰港龙航空','KA937','首都机场 T3','香港机场 T1','07:30','11:10','空客A333（大型机）','2844');");
		stmt.executeUpdate("insert PEKToHKG values('国泰航空','CX347','首都机场 T2','香港机场 T1','10:00','13:50','空客A333（大型机）','3694');");
		stmt.executeUpdate("insert PEKToHKG values('中国国航','CA107','首都机场 T3','香港机场 T1','18:30','22:05','空客A320（中型机）','2461');");
		stmt.executeUpdate("insert PEKToHKG values('国泰航空','CX331','首都机场 T2','香港机场 T1','16:30','20:15','空客A333（大型机）','3458');");
		stmt.executeUpdate("insert PEKToHKG values('国泰港龙航空','KA903','首都机场 T3','香港机场 T1','19:30','23:10','空客A333（大型机）','2495');");

		stmt.executeUpdate("insert CANToSYD values('南方航空','CZ301','白云机场   ','金斯福德史密斯机场 T1','08:25','20:40','空客A33A（大型机）','3920');");
		stmt.executeUpdate("insert CANToSYD values('南方航空','CZ601','白云机场   ','金斯福德史密斯机场 T1','18:20','06:45','空客A33A（大型机）','3920');");
		stmt.executeUpdate("insert CANToSYD values('南方航空','CZ325','白云机场   ','金斯福德史密斯机场 T1','21:00','09:25','空客A380（大型机）','3920');");

		stmt.executeUpdate("insert PEKToSIN values('中国国航','CA975','首都机场 T3','樟宜机场 T1','00:10','06:30','空客A33A（大型机）','2898');");
		stmt.executeUpdate("insert PEKToSIN values('中国国航','CA969','首都机场 T3','樟宜机场 T1','15:35','21:55','空客A33A（大型机）','2898');");
		stmt.executeUpdate("insert PEKToSIN values('新加坡航空','SQ807','首都机场 T3','樟宜机场 T1','16:40','23:20','空客A388（大型机）','3807');");
		stmt.executeUpdate("insert PEKToSIN values('新加坡航空','SQ801','首都机场 T3','樟宜机场 T1','00:10','06:45','波音B773（大型机）','3935');");
		stmt.executeUpdate("insert PEKToSIN values('新加坡航空','SQ805','首都机场 T3','樟宜机场 T1','08:45','15:20','波音B772（大型机）','3935');");

		stmt.executeUpdate("insert PVGToDXB values('东方航空','MU755','浦东机场 T1','迪拜机场 T1','10:25','19:15','空客A33E（大型机）','2688');");
		stmt.executeUpdate("insert PVGToDXB values('阿联酋航空','EK305','浦东机场 T2','迪拜机场 T3','06:15','12:20','波音B77W（大型机）','3330');");
		stmt.executeUpdate("insert PVGToDXB values('阿联酋航空','EK303','浦东机场 T2','迪拜机场 T3','23:00','05:15','空客A388（大型机）','3716');");
	
		stmt.executeUpdate("insert PVGToNRT values('吉祥航空','HO1385','浦东机场 T2','羽田机场国际航站楼','21:40','01:10','空客A320（中型机）','891');");
		stmt.executeUpdate("insert PVGToNRT values('全日空','NH968','浦东机场 T2','羽田机场国际航站楼','01:45','05:25','波音B788（大型机）','1440');");
		stmt.executeUpdate("insert PVGToNRT values('全日空','NH922','浦东机场 T2','成田机场 T1','10:15','14:00','波音B763（大型机）','1934');");
		stmt.executeUpdate("insert PVGToNRT values('全日空','NH960','浦东机场 T2','成田机场 T1','17:25','21:00','波音B789（大型机）','1934');");
		stmt.executeUpdate("insert PVGToNRT values('中国国航','CA929','浦东机场 T2','成田机场 T1','09:55','13:50','空客A33A（大型机）','2158');");
		stmt.executeUpdate("insert PVGToNRT values('中国国航','CA157','浦东机场 T2','成田机场 T1','17:20','21:00','波音B738（中型机）','2158');");
		stmt.executeUpdate("insert PVGToNRT values('东方航空','MU523','浦东机场 T1','成田机场 T2','09:10','12:50','空客A333（大型机）','2213');");
		stmt.executeUpdate("insert PVGToNRT values('东方航空','MU575','浦东机场 T1','羽田机场国际航站楼','17:10','20:50','空客A325（中型机）','2213');");
		stmt.executeUpdate("insert PVGToNRT values('日本航空','JL872','浦东机场 T1','成田机场 T2','08:50','12:35','波音B767（大型机）','2349');");
		stmt.executeUpdate("insert PVGToNRT values('日本航空','JL082','虹桥机场 T1','羽田机场国际航站楼','13:05','16:45','波音B777（大型机）','2585');");

		stmt.executeUpdate("insert PEKToICN values('南方航空','CZ317','首都机场 T2','金浦机场国际航站楼','08:10','11:30','空客A321（中型机）','1278');");
		stmt.executeUpdate("insert PEKToICN values('韩亚航空','OZ365','首都机场 T3','金浦机场国际航站楼','11:10','14:10','空客A333（大型机）','1441');");
		stmt.executeUpdate("insert PEKToICN values('韩亚航空','OZ334','首都机场 T3','仁川机场   ','15:30','18:25','空客A333（大型机）','1441');");
		stmt.executeUpdate("insert PEKToICN values('中国国航','CA135','首都机场 T3','仁川机场   ','07:15','10:30','波音B738（中型机）','1448');");
		stmt.executeUpdate("insert PEKToICN values('中国国航','CA131','首都机场 T3','仁川机场   ','11:05','14:15','空客A33A（大型机）','1448');");
		stmt.executeUpdate("insert PEKToICN values('中国国航','CA125','首都机场 T3','仁川机场   ','13:25','16:35','空客A33A（大型机）','1448');");
		stmt.executeUpdate("insert PEKToICN values('南方航空','CZ315','首都机场 T2','仁川机场   ','19:10','22:10','空客A321（中型机）','1479');");
		stmt.executeUpdate("insert PEKToICN values('大韩航空','KE2852','首都机场 T2','金浦机场国际航站楼','11:50','15:05','波音B772（大型机）','1479');");
		stmt.executeUpdate("insert PEKToICN values('大韩航空','KE854','首都机场 T2','仁川机场   ','21:15','00:20','波音B772（大型机）','1479');");
		stmt.executeUpdate("insert PEKToICN values('中国国航','CA123','首都机场 T3','仁川机场   ','08:30','11:35','空客A33A（大型机）','1448');");

		stmt.executeUpdate("insert KULToCAN values('马来西亚亚航','AK118','吉隆坡机场 T2','白云机场   ','20:30','00:30','空客A320（中型机）','461');");
		stmt.executeUpdate("insert KULToCAN values('马来西亚亚航','AK116','吉隆坡机场 T2','白云机场   ','15:55','20:05','空客A320（中型机）','508');");
		stmt.executeUpdate("insert KULToCAN values('南方航空','CZ366','吉隆坡机场 M ','白云机场   ','08:55','13:00','空客A320（中型机）','786');");
		stmt.executeUpdate("insert KULToCAN values('南方航空','CZ350','吉隆坡机场 M ','白云机场   ','13:25','17:30','波音B73G（中型机）','786');");
		stmt.executeUpdate("insert KULToCAN values('马来西亚航空','MH376','吉隆坡机场 M ','白云机场   ','09:00','13:10','波音B738（中型机）','1091');");
		stmt.executeUpdate("insert KULToCAN values('南方航空','CZ3048','吉隆坡机场 M ','白云机场   ','18:00','22:05','空客A320（中型机）','1096');");
		stmt.executeUpdate("insert KULToCAN values('马来西亚亚航','AK112','吉隆坡机场 T2','白云机场   ','05:30','09:35','空客A320（中型机）','508');");

		stmt.executeUpdate("insert HGHToCTU values('东方航空','MU5500','萧山机场 T3','双流机场 T2','12:45','15:45','空客A320（中型机）','920');");
		stmt.executeUpdate("insert HGHToCTU values('南方航空','CZ6344','萧山机场 T3','双流机场 T2','20:20','00:10','ERJ-190（中型机）','1690');");
		stmt.executeUpdate("insert HGHToCTU values('中国国航','CA4520','萧山机场 T1','双流机场 T2','11:10','13:55','空客A321（中型机）','1670');");
		stmt.executeUpdate("insert HGHToCTU values('四川航空','MU5500','萧山机场 T3','双流机场 T1','20:55','23:45','空客A320（中型机）','1659');");
		stmt.executeUpdate("insert HGHToCTU values('东方航空','MU2252','萧山机场 T3','双流机场 T2','10:55','14:10','空客A320（中型机）','920');");
		stmt.executeUpdate("insert HGHToCTU values('中国国航','CA1745','萧山机场 T1','双流机场 T2','17:15','20:05','空客A321（中型机）','1670');");
		stmt.executeUpdate("insert HGHToCTU values('中国国航','CA1741','萧山机场 T1','双流机场 T2','07:55','10:45','空客A321（中型机）','1670');");

		stmt.executeUpdate("insert KMGToBKK values('山东航空','SC8885','长水机场   ','素万那普机场','01:15','01:40','波音B738（中型机）','492');");
		stmt.executeUpdate("insert KMGToBKK values('泰国国际航空','TG613','长水机场   ','素万那普机场','15:20','16:35','空客A330（大型机）','814');");
		stmt.executeUpdate("insert KMGToBKK values('东方航空','MU741','长水机场   ','素万那普机场','13:35','14:55','波音B73E（中型机）','1158');");
		stmt.executeUpdate("insert KMGToBKK values('东方航空','MU5077','长水机场   ','素万那普机场','18:35','19:55','空客A320（中型机）','1198');");
		stmt.executeUpdate("insert KMGToBKK values('泰国亚洲航空','FD583','长水机场   ','廊曼机场 T1','13:20','15:00','空客A320（中型机）','524');");
		stmt.executeUpdate("insert KMGToBKK values('祥鹏航空','8L9597','长水机场   ','素万那普机场','23:50','01:30','波音B737（中型机）','425');");

		stmt.executeUpdate("insert LAXToPVG values('达美航空','DL185','洛杉矶机场 T5','浦东机场 T1','12:40','18:55','波音B777（大型机）','2203');");
		stmt.executeUpdate("insert LAXToPVG values('美国航空','AA183','洛杉矶机场 T4','浦东机场 T2','09:40','15:55','波音B788（大型机）','2419');");
		stmt.executeUpdate("insert LAXToPVG values('联合航空','UA198','洛杉矶机场 T7','浦东机场 T2','12:45','18:35','波音B789（大型机）','2443');");
		stmt.executeUpdate("insert LAXToPVG values('东方航空','MU586','洛杉矶机场 B','浦东机场 T1','11:30','17:30','波音B773（大型机）','4153');");
		stmt.executeUpdate("insert LAXToPVG values('东方航空','MU578','洛杉矶机场 B','浦东机场 T1','00:05','06:10','波音B773（大型机）','4153');");

		stmt.executeUpdate("insert LAXToJFK values('达美航空','DL1180','洛杉矶机场 T5','肯尼迪机场 T4','07:15','15:52','波音B75W（中型机）','925');");
		stmt.executeUpdate("insert LAXToJFK values('达美航空','DL1197','洛杉矶机场 T5','肯尼迪机场 T4','13:00','21:36','波音B764（大型机）','925');");
		stmt.executeUpdate("insert LAXToJFK values('阿拉斯加航空','AS1156','洛杉矶机场 T3','纽瓦克机场 A','07:00','15:05','空客A320（中型机）','915');");
		stmt.executeUpdate("insert LAXToJFK values('阿拉斯加航空','AS1412','洛杉矶机场 T3','肯尼迪机场 T4','13:45','22:00','空客A320（中型机）','915');");
		stmt.executeUpdate("insert LAXToJFK values('维珍美国航空','VX404','洛杉矶机场 T3','肯尼迪机场 T4','07:35','15:45','空客A320（中型机）','945');");
		stmt.executeUpdate("insert LAXToJFK values('维珍美国航空','VX418','洛杉矶机场 T3','肯尼迪机场 T4','21:35','05:40','空客A320（中型机）','945');");
		stmt.executeUpdate("insert LAXToJFK values('联合航空','UA1961','洛杉矶机场 T7','纽瓦克机场 C','06:00','14:10','波音B757（中型机）','955');");
		stmt.executeUpdate("insert LAXToJFK values('联合航空','UA247','洛杉矶机场 T7','纽瓦克机场 C','07:00','15:19','波音B752（中型机）','955');");
		stmt.executeUpdate("insert LAXToJFK values('美国航空','AA034','洛杉矶机场 T4','肯尼迪机场 T8','112:45','21:21','空客A320（中型机）','1349');");
		stmt.executeUpdate("insert LAXToJFK values('美国航空','AA180','洛杉矶机场 T4','肯尼迪机场 T8','16:30','00:58','空客A320（中型机）','1349');");

		stmt.executeUpdate("insert LXAToCTU values('四川航空','3U8720','贡嘎机场   ','双流机场 T1','16:20','18:30','空客A319（中型机）','780');");
		stmt.executeUpdate("insert LXAToCTU values('西藏航空','TV9804','贡嘎机场   ','双流机场 T2','13:40','15:40','空客A319（中型机）','827');");
		stmt.executeUpdate("insert LXAToCTU values('西藏航空','TV9824','贡嘎机场   ','双流机场 T2','20:30','22:30','空客A319（中型机）','827');");
		stmt.executeUpdate("insert LXAToCTU values('西藏航空','TV9854','贡嘎机场   ','双流机场 T2','09:40','11:40','空客A330（大型机）','827');");
		stmt.executeUpdate("insert LXAToCTU values('中国国航','CA4111','贡嘎机场   ','双流机场 T2','16:05','18:10','空客A319（中型机）','650');");
		stmt.executeUpdate("insert LXAToCTU values('四川航空','3U8658','贡嘎机场   ','双流机场 T2','10:50','12:45','空客A319（中型机）','780');");
		stmt.executeUpdate("insert LXAToCTU values('中国国航','CA4404','贡嘎机场   ','双流机场 T2','17:15','19:25','空客A319（中型机）','650');");
		stmt.executeUpdate("insert LXAToCTU values('中国国航','CA4402','贡嘎机场   ','双流机场 T2','10:55','12:55','空客A330（大型机）','650');");
		stmt.executeUpdate("insert LXAToCTU values('四川航空','3U8696','贡嘎机场   ','双流机场 T2','15:30','17:25','空客A319（中型机）','780');");
		stmt.executeUpdate("insert LXAToCTU values('西藏航空','TV9881','贡嘎机场   ','双流机场 T2','07:40','09:40','空客A319（中型机）','827');");

		stmt.executeUpdate("insert SZXToKMG values('东方航空','MU5764','宝安机场 T3','长水机场   ','07:20','10:00','波音B739（中型机）','630');");
		stmt.executeUpdate("insert SZXToKMG values('海南航空','HU7163','宝安机场 T3','长水机场   ','07:35','10:10','波音B738（中型机）','780');");
		stmt.executeUpdate("insert SZXToKMG values('南方航空','CZ3459','宝安机场 T3','长水机场   ','08:00','10:35','空客A321（中型机）','310');");
		stmt.executeUpdate("insert SZXToKMG values('东海航空','DZ6265','宝安机场 T3','长水机场   ','06:00','08:50','波音B738（中型机）','1524');");
		stmt.executeUpdate("insert SZXToKMG values('南方航空','CZ3451','宝安机场 T3','长水机场   ','13:35','16:15','空客A320（中型机）','780');");
		stmt.executeUpdate("insert SZXToKMG values('南方航空','CZ6923','宝安机场 T3','长水机场   ','18:20','21:10','空客A321（中型机）','320');");
		stmt.executeUpdate("insert SZXToKMG values('昆明航空','KY8220','宝安机场 T3','长水机场   ','08:35','11:20','波音B738（中型机）','592');");
		stmt.executeUpdate("insert SZXToKMG values('东方航空','MU5762','宝安机场 T3','长水机场   ','11:45','14:25','空客A320（中型机）','760');");
		stmt.executeUpdate("insert SZXToKMG values('东方航空','MU5760','宝安机场 T3','长水机场   ','21:05','23:45','波音B739（中型机）','530');");
		stmt.executeUpdate("insert SZXToKMG values('深圳航空','ZH9413','宝安机场 T3','长水机场   ','11:35','14:15','波音B738（中型机）','610');");

		stmt.executeUpdate("insert SYXToPEK values('海南航空','HU7180','凤凰机场   ','首都机场 T1','21:10','01:00','波音B787（大型机）','2265');");
		stmt.executeUpdate("insert SYXToPEK values('南方航空','CZ6713','凤凰机场   ','首都机场 T2','19:40','23:30','空客A333（大型机）','1800');");
		stmt.executeUpdate("insert SYXToPEK values('中国国航','CA1378','凤凰机场   ','首都机场 T3','18:00','21:50','波音B738（中型机）','1740');");
		stmt.executeUpdate("insert SYXToPEK values('中国联航','KN5892','凤凰机场   ','南苑机场   ','19:30','23:15','波音B737（中型机）','2013');");
		stmt.executeUpdate("insert SYXToPEK values('首都航空','JD5578','凤凰机场   ','首都机场 T1','21:00','00:55','空客A330（大型机）','2300');");
		stmt.executeUpdate("insert SYXToPEK values('南方航空','CZ6711','凤凰机场   ','首都机场 T2','09:00','12:45','空客A33G（大型机）','2265');");
		stmt.executeUpdate("insert SYXToPEK values('海南航空','HU7280','凤凰机场   ','首都机场 T1','17:10','20:55','空客A333（大型机）','2265');");
		stmt.executeUpdate("insert SYXToPEK values('中国国航','CA1804','凤凰机场   ','首都机场 T3','14:55','18:45','波音B777（大型机）','2500');");
		stmt.executeUpdate("insert SYXToPEK values('中国联航','KN5828','凤凰机场   ','南苑机场   ','12:30','16:15','波音B737（中型机）','2013');");
		stmt.executeUpdate("insert SYXToPEK values('海南航空','HU7080','凤凰机场   ','首都机场 T1','13:25','17:20','波音B767（大型机）','2515');");
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
