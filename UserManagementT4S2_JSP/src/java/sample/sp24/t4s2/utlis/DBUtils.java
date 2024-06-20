/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.sp24.t4s2.utlis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class DBUtils {

    // Thông tin kết nối cơ sở dữ liệu
    private static final String DB_NAME = "UserManagement";
    private static final String DB_USER_NAME = "admin";
    private static final String DB_PASSWORD = "123456";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection conn = null;

        // Đăng ký driver JDBC
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        // URL kết nối
        String url = "jdbc:sqlserver://localhost:1433;databaseName=" + DB_NAME;

        // Mở kết nối
        conn = DriverManager.getConnection(url, DB_USER_NAME, DB_PASSWORD);

        return conn;
    }

    public static void main(String[] args) {
        try (Connection conn = getConnection()) {
            if (conn != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
