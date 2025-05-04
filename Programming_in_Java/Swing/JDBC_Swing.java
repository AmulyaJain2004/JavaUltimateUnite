import javax.swing.*;
import java.sql.*;

public class JDBC_Swing {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String pwd = "@#amulyajain2004";

        Connection con = null;
        Statement stmt = null;

        try {
            con = DriverManager.getConnection(url, user, pwd);
            System.out.println("Connection successful: " + con);
            stmt = con.createStatement();
            String dbName = "employee_db";
            // String createDbSql = "CREATE DATABASE IF NOT EXISTS " + dbName; 
            // stmt.executeUpdate(createDbSql);
            String useDbSql = "USE " + dbName;
            stmt.executeUpdate(useDbSql);
            // String sql = "CREATE TABLE IF NOT EXISTS employee (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(50), salary float(10,2))";
            // stmt.executeUpdate(sql);
            String insertSql = "INSERT INTO employee (name, salary) VALUES ('John Doe', 50000.00)";
            stmt.executeUpdate(insertSql);
            String selectSql = "SELECT * FROM employee";
            ResultSet rs = stmt.executeQuery(selectSql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                float salary = rs.getFloat("salary");
                System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
                JOptionPane.showMessageDialog(null, "ID: " + id + ", Name: " + name + ", Salary: " + salary);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
