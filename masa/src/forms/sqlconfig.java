package forms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class sqlconfig {
public static void main(String[]args)
{
	String userQuery = "";
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conForCreatingDatabase = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
        Statement databaseCreate = conForCreatingDatabase.createStatement();
        String createDatabase = "CREATE DATABASE IF NOT EXISTS masa_db;";
        databaseCreate.executeUpdate(createDatabase);
        Thread.sleep(1000);
        conForCreatingDatabase.close();
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/masa_db","root","");
        Statement stmt = con.createStatement();
        String createAccTable = "CREATE TABLE IF NOT EXISTS userAccounts(\n" +
                "userID INT AUTO_INCREMENT PRIMARY KEY,\n" +
                "userName VARCHAR(20),\n" +
                "passcode VARCHAR(20),\n" +
                "isAdmin TINYINT(1) DEFAULT 0,\n" +
                "created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP);";
        String createsystemLogs = "CREATE TABLE IF NOT EXISTS systemLogs(\n" +
                "logID INT AUTO_INCREMENT PRIMARY KEY,\n" +
                "isDataConfigDone TINYINT(1),\n" +
                "announcement LONGTEXT,\n" +
                "created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP);";
        String insertAccAdmin = "INSERT INTO userAccounts(userName, passcode, isAdmin) SELECT 'admin', 'admin', 1 WHERE NOT EXISTS(SELECT userID FROM userAccounts WHERE userID=1)";
        stmt.executeUpdate(createAccTable);
        Thread.sleep(1000);
        stmt.executeUpdate(createsystemLogs);
        Thread.sleep(1000);
        stmt.executeUpdate(insertAccAdmin);
        ResultSet rs = stmt.executeQuery("SELECT COUNT(*) AS haveRecord FROM systemlogs;");
        if(rs.next())
        {
            if(rs.getInt("haveRecord") == 0)
            {
               String insertSystemLog = "INSERT INTO systemLogs(isDataConfigDone) SELECT 1 WHERE NOT EXISTS(SELECT logID FROM systemLogs WHERE logID=1)";
               stmt.executeUpdate(insertSystemLog);
               JOptionPane.showMessageDialog(null, "Database configuration success!!");
            }
        }
        con.close();
        stmt.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
}
