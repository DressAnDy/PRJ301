/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

    // Thông tin kết nối cơ sở dữ liệu
    private static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=UserManagement";
    private static final String USER = "sa";
    private static final String PASSWORD = "1234";

    public static void main(String[] args) {
        Connection conn = null;
        try {
            // Mở kết nối (không cần đăng ký driver cho JDBC 4.x)
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);

            // Kiểm tra kết nối thành công
            if (conn != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
