/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ops;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author anele
 */
public class DataConnect {
    
    public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/OPS", "root", "");
                        System.out.println("Connected");
			return con;
		} catch (Exception ex) {
			System.out.println("Database.getConnection() Error -->"
					+ ex.getMessage());
			return null;
		}
	}

	public static void close(Connection con) {
		try {
			con.close();
		} catch (Exception ex) {
		}
	}
    public static void main(String [] args){
        DataConnect.getConnection();
    }
    
}
