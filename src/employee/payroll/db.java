/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.payroll;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.JOptionPane;

/**
 *
 * @author vishal
 */
public class db {
    Connection connection = null;
    public static Connection java_db() {
        String url = "jdbc:mysql://localhost:3306/employee-payroll-management-system";
        String username = "root";
        String password = "vishal";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            return connection;
        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println("Connection failed.");
              JOptionPane.showMessageDialog(null, e);
              return null;
        }
    }
}
