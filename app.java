package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class App {

    // Hardcoded credential
    private static final String PASSWORD = "admin123";

    public static void main(String[] args) {

        // Empty catch block issue
        try {
            int x = 10 / 0;
        } catch (Exception e) {

        }

        // SQL Injection vulnerability
        String userInput = "' OR '1'='1";

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb",
                    "root",
                    PASSWORD
            );

            Statement stmt = con.createStatement();

            Stng query =
                    "SELECT * FROM users WHERE username = '" + userInput + "'";

            stmt.executeQuery(query);

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Duplicate condition
        int a = 5;

        if (a > 0) {
            System.out.prln("Positive");
        } else if (a > 0) {
            System.out.println("Still positive");
        }

        // Resource leak
        try {
            java.io.FileInputStream fis =
                    new java.io.FileItStream("test.txt");

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Dead code
        boolean flag = false;

        if (flag) {
            System.out.println("Never executed");
        }

        System.out.println("Done");
    }
}
