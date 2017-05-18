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
	
	public static void insertInformation() throws ClassNotFoundException, SQLException//�����ݿ�д����Ϣ
	{
		 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flight", "root","18918067039");
		stmt = conn.createStatement();
		 //����������Ϊinfo�������˺��չ�˾������ţ������أ�Ŀ�ĵأ����ʱ�䣬����ʱ�䣬���ͣ��۸�
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
		
		//��info���в�������
		stmt.executeUpdate("insert KMGToPVG values('�Ϻ�����','FM9452','��ˮ����   ','���Ż��� T2','13:50','16:55','����B767�����ͻ���','1920');");
		stmt.executeUpdate("insert KMGToPVG values('���麽��','HO1092','��ˮ����   ','���Ż��� T2','20:45','23:50','�տ�A320�����ͻ���','1400');");
		stmt.executeUpdate("insert KMGToPVG values('���麽��','HO1094','��ˮ����   ','���Ż��� T2','08:35','11:40','�տ�A320�����ͻ���','1400');");
		stmt.executeUpdate("insert KMGToPVG values('��������','MU5588','��ˮ����   ','�ֶ����� T1','16:15','21:15','�տ�A321�����ͻ���','1920');");
		stmt.executeUpdate("insert KMGToPVG values('��������','MU756','��ˮ����   ','�ֶ����� T1','09:10','12:10','�տ�A332�����ͻ���','1920');");
		stmt.executeUpdate("insert KMGToPVG values('��������','KY8283','��ˮ����   ','�ֶ����� T2','08:00','1055','����B738�����ͻ���','2270');");
		stmt.executeUpdate("insert KMGToPVG values('�Ϸ�����','CZ6800','��ˮ����   ','�ֶ����� T2','20:10','23:10','�տ�A320�����ͻ���','1430');");
		stmt.executeUpdate("insert KMGToPVG values('�Ϻ�����','FM9454','��ˮ����   ','���Ż��� T2','16:45','20:00','����B737�����ͻ���','1920');");
		stmt.executeUpdate("insert KMGToPVG values('��������','MU5825','��ˮ����   ','���Ż��� T2','11:00','14:05','����B738�����ͻ���','1920');");
		stmt.executeUpdate("insert KMGToPVG values('��������','MU5813','��ˮ����   ','���Ż��� T2','17:30','20:35','����B738�����ͻ���','1920');");
		
		stmt.executeUpdate("insert PVGToCAN values('��������','MU5307','���Ż��� T2','���ƻ���   ','14:30','17:05','����B739�����ͻ���','1230');");
		stmt.executeUpdate("insert PVGToCAN values('�Ϸ�����','CZ3175','�ֶ����� T2','���ƻ���   ','18:15','20:25','�տ�A320�����ͻ���','690');");
		stmt.executeUpdate("insert PVGToCAN values('�й�����','CA1865','�ֶ����� T2','���ƻ���   ','16:55','19:40','�տ�A321�����ͻ���','740');");
		stmt.executeUpdate("insert PVGToCAN values('�Ϸ�����','CZ3526','���Ż��� T2','���ƻ���   ','16:50','19:30','�տ�A33G�����ͻ���','690');");
		stmt.executeUpdate("insert PVGToCAN values('�Ϻ�����','FM9311','���Ż��� T2','���ƻ���   ','17:30','20:05','�տ�A333�����ͻ���','690');");
		stmt.executeUpdate("insert PVGToCAN values('�Ϸ�����','CZ3538','���Ż��� T2','���ƻ���   ','14:50','17:25','����B787�����ͻ���','690');");
		stmt.executeUpdate("insert PVGToCAN values('��������','MU5311','�ֶ����� T1','���ƻ���   ','16:10','18:55','�տ�A320�����ͻ���','690');");
		stmt.executeUpdate("insert PVGToCAN values('�й�����','CA1830','���Ż��� T2','���ƻ���   ','19:50','22:25','�տ�A333�����ͻ���','620');");
		stmt.executeUpdate("insert PVGToCAN values('�Ϸ�����','CZ3569','���Ż��� T2','���ƻ���   ','08:50','11:25','����B77W�����ͻ���','820');");
		stmt.executeUpdate("insert PVGToCAN values('�Ϸ�����','CZ3610','�ֶ����� T2','���ƻ���   ','20:50','23:35','�տ�A320�����ͻ���','820');");

		stmt.executeUpdate("insert PEKToXMN values('���ź���','MF8170','�׶����� T2','������� T3','21:20','00:20','����B738�����ͻ���','890');");
		stmt.executeUpdate("insert PEKToXMN values('ɽ������','SC1152','�׶����� T3','������� T4','20:35','00:50','����B738�����ͻ���','510');");
		stmt.executeUpdate("insert PEKToXMN values('�й�����','CA1801','�׶����� T3','������� T4','20:05','23:10','����B738�����ͻ���','880');");
		stmt.executeUpdate("insert PEKToXMN values('�й�����','CA1815','�׶����� T3','������� T4','16:20','19:25','�տ�A321�����ͻ���','1130');");
		stmt.executeUpdate("insert PEKToXMN values('���ź���','MF8106','�׶����� T2','������� T3','18:55','22:05','����B757�����ͻ���','1070');");
		stmt.executeUpdate("insert PEKToXMN values('�׶�����','JD5375','�׶����� T1','������� T4','08:55','12:00','�տ�A330�����ͻ���','775');");
		stmt.executeUpdate("insert PEKToXMN values('ɽ������','SC4994','�׶����� T3','������� T4','07:55','10:55','����B738�����ͻ���','620');");
		stmt.executeUpdate("insert PEKToXMN values('���Ϻ���','HU7191','�׶����� T1','������� T4','08:40','11:40','����B767�����ͻ���','820');");
		stmt.executeUpdate("insert PEKToXMN values('���ź���','MF8118','�׶����� T2','������� T3','10:55','14:00','����B738�����ͻ���','1410');");
		stmt.executeUpdate("insert PEKToXMN values('���ź���','MF8102','�׶����� T2','������� T3','16:05','19:05','����B787�����ͻ���','1410');");

		stmt.executeUpdate("insert NKGToPEK values('��������','MU2786','»�ڻ��� T2','�׶����� T2','08:30','10:20','�տ�A320�����ͻ���','370');");
		stmt.executeUpdate("insert NKGToPEK values('�й�����','CA1818','»�ڻ��� T2','�׶����� T3','11:45','13:45','����B738�����ͻ���','370');");
		stmt.executeUpdate("insert NKGToPEK values('��������','MU2821','»�ڻ��� T2','�׶����� T2','12:50','14:45','�տ�A320�����ͻ���','370');");
		stmt.executeUpdate("insert NKGToPEK values('��������','MU2786','»�ڻ��� T2','�׶����� T2','08:30','10:20','�տ�A320�����ͻ���','370');");
		stmt.executeUpdate("insert NKGToPEK values('�й�����','CA1848','»�ڻ��� T2','�׶����� T3','13:55','15:50','����B738�����ͻ���','370');");
		stmt.executeUpdate("insert NKGToPEK values('��������','MU2841','»�ڻ��� T2','�׶����� T2','17:00','18:55','�տ�A320�����ͻ���','370');");
		stmt.executeUpdate("insert NKGToPEK values('�й�����','CA1562','»�ڻ��� T2','�׶����� T3','17:20','19:20','����B738�����ͻ���','370');");
		stmt.executeUpdate("insert NKGToPEK values('��������','MU2851','»�ڻ��� T2','�׶����� T2','18:20','20:25','�տ�A320�����ͻ���','370');");
		stmt.executeUpdate("insert NKGToPEK values('��������','MU2861','»�ڻ��� T2','�׶����� T2','20:15','22:15','�տ�A320�����ͻ���','370');");
		stmt.executeUpdate("insert NKGToPEK values('�й�����','CA1504','»�ڻ��� T2','�׶����� T3','20:40','22:40','�տ�A321�����ͻ���','370');");

		stmt.executeUpdate("insert CTUToSZX values('���ں���','ZH9410','˫������ T2','�������� T3','17:40','20:20','�տ�A320�����ͻ���','1480');");
		stmt.executeUpdate("insert CTUToSZX values('���ں���','ZH9406','˫������ T2','�������� T3','15:20','17:55','�տ�A320�����ͻ���','1480');");
		stmt.executeUpdate("insert CTUToSZX values('���Ϻ���','HU7742','˫������ T2','�������� T3','19:30','21:45','����B738�����ͻ���','1465');");
		stmt.executeUpdate("insert CTUToSZX values('�й�����','CA4383','˫������ T2','�������� T3','16:30','18:55','�տ�A330�����ͻ���','1480');");
		stmt.executeUpdate("insert CTUToSZX values('�Ϸ�����','CZ3454','˫������ T2','�������� T3','16:35','19:00','�տ�A321�����ͻ���','1480');");
		stmt.executeUpdate("insert CTUToSZX values('��������','MU5319','˫������ T2','�������� T3','15:40','18:15','�տ�A320�����ͻ���','1470');");
		stmt.executeUpdate("insert CTUToSZX values('�й�����','CA4325','˫������ T2','�������� T3','09:30','11:55','�տ�A330�����ͻ���','1480');");
		stmt.executeUpdate("insert CTUToSZX values('�Ϸ�����','CZ3458','˫������ T2','�������� T3','11:50','14:20','�տ�A330�����ͻ���','1480');");
		stmt.executeUpdate("insert CTUToSZX values('�Ĵ�����','3U8703','˫������ T1','�������� T3','11:35','14:00','�տ�A321�����ͻ���','3400');");
		stmt.executeUpdate("insert CTUToSZX values('���ں���','ZH9404','˫������ T2','�������� T3','09:00','11:30','�տ�A320�����ͻ���','1480');");

		stmt.executeUpdate("insert PVGToTPE values('���麽��','HO1309','�ֶ����� T2','��԰���� T1','09:50','11:50','�տ�A320�����ͻ���','2461');");
		stmt.executeUpdate("insert PVGToTPE values('�й�����','CA191','�ֶ����� T2','��԰���� T2','08:00','09:55','�տ�A333�����ͻ���','2764');");
		stmt.executeUpdate("insert PVGToTPE values('�й�����','CA195','�ֶ����� T2','��԰���� T2','14:30','16:25','�տ�A333�����ͻ���','3064');");
		stmt.executeUpdate("insert PVGToTPE values('�л�����','CI504','�ֶ����� T1','��԰���� T2','19:50','22:00','����B744�����ͻ���','2773');");
		stmt.executeUpdate("insert PVGToTPE values('�Ϻ�����','FM801','�ֶ����� T1','��ɽ���� T1','09:10','11:05','����B738�����ͻ���','3474');");
		stmt.executeUpdate("insert PVGToTPE values('���ٺ���','BR721','�ֶ����� T2','��԰���� T2','20:10','22:05','����B77W�����ͻ���','3285');");
		stmt.executeUpdate("insert PVGToTPE values('��������','MU5097','���Ż��� T1','��ɽ���� T1','14:20','16:15','�տ�A333�����ͻ���','3546');");
		stmt.executeUpdate("insert PVGToTPE values('�Ϸ�����','CZ3095','�ֶ����� T2','��԰���� T2','14:15','16:10','�տ�A320�����ͻ���','3690');");
		stmt.executeUpdate("insert PVGToTPE values('�л�����','CI502','�ֶ����� T1','��԰���� T2','12:05','14:05','����B77W�����ͻ���','4803');");
		stmt.executeUpdate("insert PVGToTPE values('�л�����','CI202','���Ż��� T1','��ɽ���� T1','16:15','18:15','�տ�A333�����ͻ���','4803');");
		stmt.executeUpdate("insert PVGToTPE values('���ٺ���','B7501','�ֶ����� T2','��ɽ���� T1','11:15','13:10','�տ�A321�����ͻ���','5230');");

		stmt.executeUpdate("insert PEKToHKG values('��ۺ���','HX337','�׶����� T2','��ۻ��� T1','12:15','15:55','�տ�A333�����ͻ���','1264');");
		stmt.executeUpdate("insert PEKToHKG values('��ۺ���','HX313','�׶����� T2','��ۻ��� T1','19:55','23:30','�տ�A333�����ͻ���','1264');");
		stmt.executeUpdate("insert PEKToHKG values('�й�����','CA109','�׶����� T3','��ۻ��� T1','13:00','16:25','�տ�A33A�����ͻ���','1321');");
		stmt.executeUpdate("insert PEKToHKG values('�Ϸ�����','CZ310','�׶����� T2','��ۻ��� T1','09:05','12:40','�տ�A321�����ͻ���','1924');");
		stmt.executeUpdate("insert PEKToHKG values('�й�����','CA111','�׶����� T3','��ۻ��� T1','09:30','15:55','�տ�A33A�����ͻ���','2401');");
		stmt.executeUpdate("insert PEKToHKG values('��̩��������','KA993','�׶����� T3','��ۻ��� T1','18:30','22:10','�տ�A333�����ͻ���','2495');");
		stmt.executeUpdate("insert PEKToHKG values('��̩��������','KA937','�׶����� T3','��ۻ��� T1','07:30','11:10','�տ�A333�����ͻ���','2844');");
		stmt.executeUpdate("insert PEKToHKG values('��̩����','CX347','�׶����� T2','��ۻ��� T1','10:00','13:50','�տ�A333�����ͻ���','3694');");
		stmt.executeUpdate("insert PEKToHKG values('�й�����','CA107','�׶����� T3','��ۻ��� T1','18:30','22:05','�տ�A320�����ͻ���','2461');");
		stmt.executeUpdate("insert PEKToHKG values('��̩����','CX331','�׶����� T2','��ۻ��� T1','16:30','20:15','�տ�A333�����ͻ���','3458');");
		stmt.executeUpdate("insert PEKToHKG values('��̩��������','KA903','�׶����� T3','��ۻ��� T1','19:30','23:10','�տ�A333�����ͻ���','2495');");

		stmt.executeUpdate("insert CANToSYD values('�Ϸ�����','CZ301','���ƻ���   ','��˹����ʷ��˹���� T1','08:25','20:40','�տ�A33A�����ͻ���','3920');");
		stmt.executeUpdate("insert CANToSYD values('�Ϸ�����','CZ601','���ƻ���   ','��˹����ʷ��˹���� T1','18:20','06:45','�տ�A33A�����ͻ���','3920');");
		stmt.executeUpdate("insert CANToSYD values('�Ϸ�����','CZ325','���ƻ���   ','��˹����ʷ��˹���� T1','21:00','09:25','�տ�A380�����ͻ���','3920');");

		stmt.executeUpdate("insert PEKToSIN values('�й�����','CA975','�׶����� T3','���˻��� T1','00:10','06:30','�տ�A33A�����ͻ���','2898');");
		stmt.executeUpdate("insert PEKToSIN values('�й�����','CA969','�׶����� T3','���˻��� T1','15:35','21:55','�տ�A33A�����ͻ���','2898');");
		stmt.executeUpdate("insert PEKToSIN values('�¼��º���','SQ807','�׶����� T3','���˻��� T1','16:40','23:20','�տ�A388�����ͻ���','3807');");
		stmt.executeUpdate("insert PEKToSIN values('�¼��º���','SQ801','�׶����� T3','���˻��� T1','00:10','06:45','����B773�����ͻ���','3935');");
		stmt.executeUpdate("insert PEKToSIN values('�¼��º���','SQ805','�׶����� T3','���˻��� T1','08:45','15:20','����B772�����ͻ���','3935');");

		stmt.executeUpdate("insert PVGToDXB values('��������','MU755','�ֶ����� T1','�ϰݻ��� T1','10:25','19:15','�տ�A33E�����ͻ���','2688');");
		stmt.executeUpdate("insert PVGToDXB values('����������','EK305','�ֶ����� T2','�ϰݻ��� T3','06:15','12:20','����B77W�����ͻ���','3330');");
		stmt.executeUpdate("insert PVGToDXB values('����������','EK303','�ֶ����� T2','�ϰݻ��� T3','23:00','05:15','�տ�A388�����ͻ���','3716');");
	
		stmt.executeUpdate("insert PVGToNRT values('���麽��','HO1385','�ֶ����� T2','����������ʺ�վ¥','21:40','01:10','�տ�A320�����ͻ���','891');");
		stmt.executeUpdate("insert PVGToNRT values('ȫ�տ�','NH968','�ֶ����� T2','����������ʺ�վ¥','01:45','05:25','����B788�����ͻ���','1440');");
		stmt.executeUpdate("insert PVGToNRT values('ȫ�տ�','NH922','�ֶ����� T2','������� T1','10:15','14:00','����B763�����ͻ���','1934');");
		stmt.executeUpdate("insert PVGToNRT values('ȫ�տ�','NH960','�ֶ����� T2','������� T1','17:25','21:00','����B789�����ͻ���','1934');");
		stmt.executeUpdate("insert PVGToNRT values('�й�����','CA929','�ֶ����� T2','������� T1','09:55','13:50','�տ�A33A�����ͻ���','2158');");
		stmt.executeUpdate("insert PVGToNRT values('�й�����','CA157','�ֶ����� T2','������� T1','17:20','21:00','����B738�����ͻ���','2158');");
		stmt.executeUpdate("insert PVGToNRT values('��������','MU523','�ֶ����� T1','������� T2','09:10','12:50','�տ�A333�����ͻ���','2213');");
		stmt.executeUpdate("insert PVGToNRT values('��������','MU575','�ֶ����� T1','����������ʺ�վ¥','17:10','20:50','�տ�A325�����ͻ���','2213');");
		stmt.executeUpdate("insert PVGToNRT values('�ձ�����','JL872','�ֶ����� T1','������� T2','08:50','12:35','����B767�����ͻ���','2349');");
		stmt.executeUpdate("insert PVGToNRT values('�ձ�����','JL082','���Ż��� T1','����������ʺ�վ¥','13:05','16:45','����B777�����ͻ���','2585');");

		stmt.executeUpdate("insert PEKToICN values('�Ϸ�����','CZ317','�׶����� T2','���ֻ������ʺ�վ¥','08:10','11:30','�տ�A321�����ͻ���','1278');");
		stmt.executeUpdate("insert PEKToICN values('���Ǻ���','OZ365','�׶����� T3','���ֻ������ʺ�վ¥','11:10','14:10','�տ�A333�����ͻ���','1441');");
		stmt.executeUpdate("insert PEKToICN values('���Ǻ���','OZ334','�׶����� T3','�ʴ�����   ','15:30','18:25','�տ�A333�����ͻ���','1441');");
		stmt.executeUpdate("insert PEKToICN values('�й�����','CA135','�׶����� T3','�ʴ�����   ','07:15','10:30','����B738�����ͻ���','1448');");
		stmt.executeUpdate("insert PEKToICN values('�й�����','CA131','�׶����� T3','�ʴ�����   ','11:05','14:15','�տ�A33A�����ͻ���','1448');");
		stmt.executeUpdate("insert PEKToICN values('�й�����','CA125','�׶����� T3','�ʴ�����   ','13:25','16:35','�տ�A33A�����ͻ���','1448');");
		stmt.executeUpdate("insert PEKToICN values('�Ϸ�����','CZ315','�׶����� T2','�ʴ�����   ','19:10','22:10','�տ�A321�����ͻ���','1479');");
		stmt.executeUpdate("insert PEKToICN values('�󺫺���','KE2852','�׶����� T2','���ֻ������ʺ�վ¥','11:50','15:05','����B772�����ͻ���','1479');");
		stmt.executeUpdate("insert PEKToICN values('�󺫺���','KE854','�׶����� T2','�ʴ�����   ','21:15','00:20','����B772�����ͻ���','1479');");
		stmt.executeUpdate("insert PEKToICN values('�й�����','CA123','�׶����� T3','�ʴ�����   ','08:30','11:35','�տ�A33A�����ͻ���','1448');");

		stmt.executeUpdate("insert KULToCAN values('���������Ǻ�','AK118','��¡�»��� T2','���ƻ���   ','20:30','00:30','�տ�A320�����ͻ���','461');");
		stmt.executeUpdate("insert KULToCAN values('���������Ǻ�','AK116','��¡�»��� T2','���ƻ���   ','15:55','20:05','�տ�A320�����ͻ���','508');");
		stmt.executeUpdate("insert KULToCAN values('�Ϸ�����','CZ366','��¡�»��� M ','���ƻ���   ','08:55','13:00','�տ�A320�����ͻ���','786');");
		stmt.executeUpdate("insert KULToCAN values('�Ϸ�����','CZ350','��¡�»��� M ','���ƻ���   ','13:25','17:30','����B73G�����ͻ���','786');");
		stmt.executeUpdate("insert KULToCAN values('�������Ǻ���','MH376','��¡�»��� M ','���ƻ���   ','09:00','13:10','����B738�����ͻ���','1091');");
		stmt.executeUpdate("insert KULToCAN values('�Ϸ�����','CZ3048','��¡�»��� M ','���ƻ���   ','18:00','22:05','�տ�A320�����ͻ���','1096');");
		stmt.executeUpdate("insert KULToCAN values('���������Ǻ�','AK112','��¡�»��� T2','���ƻ���   ','05:30','09:35','�տ�A320�����ͻ���','508');");

		stmt.executeUpdate("insert HGHToCTU values('��������','MU5500','��ɽ���� T3','˫������ T2','12:45','15:45','�տ�A320�����ͻ���','920');");
		stmt.executeUpdate("insert HGHToCTU values('�Ϸ�����','CZ6344','��ɽ���� T3','˫������ T2','20:20','00:10','ERJ-190�����ͻ���','1690');");
		stmt.executeUpdate("insert HGHToCTU values('�й�����','CA4520','��ɽ���� T1','˫������ T2','11:10','13:55','�տ�A321�����ͻ���','1670');");
		stmt.executeUpdate("insert HGHToCTU values('�Ĵ�����','MU5500','��ɽ���� T3','˫������ T1','20:55','23:45','�տ�A320�����ͻ���','1659');");
		stmt.executeUpdate("insert HGHToCTU values('��������','MU2252','��ɽ���� T3','˫������ T2','10:55','14:10','�տ�A320�����ͻ���','920');");
		stmt.executeUpdate("insert HGHToCTU values('�й�����','CA1745','��ɽ���� T1','˫������ T2','17:15','20:05','�տ�A321�����ͻ���','1670');");
		stmt.executeUpdate("insert HGHToCTU values('�й�����','CA1741','��ɽ���� T1','˫������ T2','07:55','10:45','�տ�A321�����ͻ���','1670');");

		stmt.executeUpdate("insert KMGToBKK values('ɽ������','SC8885','��ˮ����   ','�������ջ���','01:15','01:40','����B738�����ͻ���','492');");
		stmt.executeUpdate("insert KMGToBKK values('̩�����ʺ���','TG613','��ˮ����   ','�������ջ���','15:20','16:35','�տ�A330�����ͻ���','814');");
		stmt.executeUpdate("insert KMGToBKK values('��������','MU741','��ˮ����   ','�������ջ���','13:35','14:55','����B73E�����ͻ���','1158');");
		stmt.executeUpdate("insert KMGToBKK values('��������','MU5077','��ˮ����   ','�������ջ���','18:35','19:55','�տ�A320�����ͻ���','1198');");
		stmt.executeUpdate("insert KMGToBKK values('̩�����޺���','FD583','��ˮ����   ','�������� T1','13:20','15:00','�տ�A320�����ͻ���','524');");
		stmt.executeUpdate("insert KMGToBKK values('��������','8L9597','��ˮ����   ','�������ջ���','23:50','01:30','����B737�����ͻ���','425');");

		stmt.executeUpdate("insert LAXToPVG values('��������','DL185','��ɼ���� T5','�ֶ����� T1','12:40','18:55','����B777�����ͻ���','2203');");
		stmt.executeUpdate("insert LAXToPVG values('��������','AA183','��ɼ���� T4','�ֶ����� T2','09:40','15:55','����B788�����ͻ���','2419');");
		stmt.executeUpdate("insert LAXToPVG values('���Ϻ���','UA198','��ɼ���� T7','�ֶ����� T2','12:45','18:35','����B789�����ͻ���','2443');");
		stmt.executeUpdate("insert LAXToPVG values('��������','MU586','��ɼ���� B','�ֶ����� T1','11:30','17:30','����B773�����ͻ���','4153');");
		stmt.executeUpdate("insert LAXToPVG values('��������','MU578','��ɼ���� B','�ֶ����� T1','00:05','06:10','����B773�����ͻ���','4153');");

		stmt.executeUpdate("insert LAXToJFK values('��������','DL1180','��ɼ���� T5','����ϻ��� T4','07:15','15:52','����B75W�����ͻ���','925');");
		stmt.executeUpdate("insert LAXToJFK values('��������','DL1197','��ɼ���� T5','����ϻ��� T4','13:00','21:36','����B764�����ͻ���','925');");
		stmt.executeUpdate("insert LAXToJFK values('����˹�Ӻ���','AS1156','��ɼ���� T3','Ŧ�߿˻��� A','07:00','15:05','�տ�A320�����ͻ���','915');");
		stmt.executeUpdate("insert LAXToJFK values('����˹�Ӻ���','AS1412','��ɼ���� T3','����ϻ��� T4','13:45','22:00','�տ�A320�����ͻ���','915');");
		stmt.executeUpdate("insert LAXToJFK values('ά����������','VX404','��ɼ���� T3','����ϻ��� T4','07:35','15:45','�տ�A320�����ͻ���','945');");
		stmt.executeUpdate("insert LAXToJFK values('ά����������','VX418','��ɼ���� T3','����ϻ��� T4','21:35','05:40','�տ�A320�����ͻ���','945');");
		stmt.executeUpdate("insert LAXToJFK values('���Ϻ���','UA1961','��ɼ���� T7','Ŧ�߿˻��� C','06:00','14:10','����B757�����ͻ���','955');");
		stmt.executeUpdate("insert LAXToJFK values('���Ϻ���','UA247','��ɼ���� T7','Ŧ�߿˻��� C','07:00','15:19','����B752�����ͻ���','955');");
		stmt.executeUpdate("insert LAXToJFK values('��������','AA034','��ɼ���� T4','����ϻ��� T8','112:45','21:21','�տ�A320�����ͻ���','1349');");
		stmt.executeUpdate("insert LAXToJFK values('��������','AA180','��ɼ���� T4','����ϻ��� T8','16:30','00:58','�տ�A320�����ͻ���','1349');");

		stmt.executeUpdate("insert LXAToCTU values('�Ĵ�����','3U8720','���»���   ','˫������ T1','16:20','18:30','�տ�A319�����ͻ���','780');");
		stmt.executeUpdate("insert LXAToCTU values('���غ���','TV9804','���»���   ','˫������ T2','13:40','15:40','�տ�A319�����ͻ���','827');");
		stmt.executeUpdate("insert LXAToCTU values('���غ���','TV9824','���»���   ','˫������ T2','20:30','22:30','�տ�A319�����ͻ���','827');");
		stmt.executeUpdate("insert LXAToCTU values('���غ���','TV9854','���»���   ','˫������ T2','09:40','11:40','�տ�A330�����ͻ���','827');");
		stmt.executeUpdate("insert LXAToCTU values('�й�����','CA4111','���»���   ','˫������ T2','16:05','18:10','�տ�A319�����ͻ���','650');");
		stmt.executeUpdate("insert LXAToCTU values('�Ĵ�����','3U8658','���»���   ','˫������ T2','10:50','12:45','�տ�A319�����ͻ���','780');");
		stmt.executeUpdate("insert LXAToCTU values('�й�����','CA4404','���»���   ','˫������ T2','17:15','19:25','�տ�A319�����ͻ���','650');");
		stmt.executeUpdate("insert LXAToCTU values('�й�����','CA4402','���»���   ','˫������ T2','10:55','12:55','�տ�A330�����ͻ���','650');");
		stmt.executeUpdate("insert LXAToCTU values('�Ĵ�����','3U8696','���»���   ','˫������ T2','15:30','17:25','�տ�A319�����ͻ���','780');");
		stmt.executeUpdate("insert LXAToCTU values('���غ���','TV9881','���»���   ','˫������ T2','07:40','09:40','�տ�A319�����ͻ���','827');");

		stmt.executeUpdate("insert SZXToKMG values('��������','MU5764','�������� T3','��ˮ����   ','07:20','10:00','����B739�����ͻ���','630');");
		stmt.executeUpdate("insert SZXToKMG values('���Ϻ���','HU7163','�������� T3','��ˮ����   ','07:35','10:10','����B738�����ͻ���','780');");
		stmt.executeUpdate("insert SZXToKMG values('�Ϸ�����','CZ3459','�������� T3','��ˮ����   ','08:00','10:35','�տ�A321�����ͻ���','310');");
		stmt.executeUpdate("insert SZXToKMG values('��������','DZ6265','�������� T3','��ˮ����   ','06:00','08:50','����B738�����ͻ���','1524');");
		stmt.executeUpdate("insert SZXToKMG values('�Ϸ�����','CZ3451','�������� T3','��ˮ����   ','13:35','16:15','�տ�A320�����ͻ���','780');");
		stmt.executeUpdate("insert SZXToKMG values('�Ϸ�����','CZ6923','�������� T3','��ˮ����   ','18:20','21:10','�տ�A321�����ͻ���','320');");
		stmt.executeUpdate("insert SZXToKMG values('��������','KY8220','�������� T3','��ˮ����   ','08:35','11:20','����B738�����ͻ���','592');");
		stmt.executeUpdate("insert SZXToKMG values('��������','MU5762','�������� T3','��ˮ����   ','11:45','14:25','�տ�A320�����ͻ���','760');");
		stmt.executeUpdate("insert SZXToKMG values('��������','MU5760','�������� T3','��ˮ����   ','21:05','23:45','����B739�����ͻ���','530');");
		stmt.executeUpdate("insert SZXToKMG values('���ں���','ZH9413','�������� T3','��ˮ����   ','11:35','14:15','����B738�����ͻ���','610');");

		stmt.executeUpdate("insert SYXToPEK values('���Ϻ���','HU7180','��˻���   ','�׶����� T1','21:10','01:00','����B787�����ͻ���','2265');");
		stmt.executeUpdate("insert SYXToPEK values('�Ϸ�����','CZ6713','��˻���   ','�׶����� T2','19:40','23:30','�տ�A333�����ͻ���','1800');");
		stmt.executeUpdate("insert SYXToPEK values('�й�����','CA1378','��˻���   ','�׶����� T3','18:00','21:50','����B738�����ͻ���','1740');");
		stmt.executeUpdate("insert SYXToPEK values('�й�����','KN5892','��˻���   ','��Է����   ','19:30','23:15','����B737�����ͻ���','2013');");
		stmt.executeUpdate("insert SYXToPEK values('�׶�����','JD5578','��˻���   ','�׶����� T1','21:00','00:55','�տ�A330�����ͻ���','2300');");
		stmt.executeUpdate("insert SYXToPEK values('�Ϸ�����','CZ6711','��˻���   ','�׶����� T2','09:00','12:45','�տ�A33G�����ͻ���','2265');");
		stmt.executeUpdate("insert SYXToPEK values('���Ϻ���','HU7280','��˻���   ','�׶����� T1','17:10','20:55','�տ�A333�����ͻ���','2265');");
		stmt.executeUpdate("insert SYXToPEK values('�й�����','CA1804','��˻���   ','�׶����� T3','14:55','18:45','����B777�����ͻ���','2500');");
		stmt.executeUpdate("insert SYXToPEK values('�й�����','KN5828','��˻���   ','��Է����   ','12:30','16:15','����B737�����ͻ���','2013');");
		stmt.executeUpdate("insert SYXToPEK values('���Ϻ���','HU7080','��˻���   ','�׶����� T1','13:25','17:20','����B767�����ͻ���','2515');");
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
