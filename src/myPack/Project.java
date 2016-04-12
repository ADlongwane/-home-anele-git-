package myPack;
// Author: Anele Dlongwane


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import javax.management.Query;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class Project {
	
	   
	
	 
	   public static void main (String[] args) {
		   
		   
		   Statement stmt = null;
		   
		 
		   
	        try{
	            String driver = "com.mysql.jdbc.Driver";
	            String url = "jdbc:mysql://localhost:3306/Order_Processing";
	            String username = "root";
	            Class.forName(driver); 
	            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Order_Processing","root","");
	            System.out.println("Connected");
	            
	     
		           
		        // inserting the data into the database
		           stmt = (Statement) conn.createStatement();
		           stmt.executeUpdate("INSERT INTO Customer " + "VALUES (510, 'Cheese Burger', 'Hola', 19120212)");
		           
		  	  // deleting data from the database
		        //   stmt = (Statement) conn.createStatement();
		         //  stmt.executeUpdate("DELETE FROM Customer WHERE Customer_ID = 558841");

		        
		         
		      // Retrieving data from the database
		        String sql = "SELECT * FROM Customer Where Customer_ID Like 79120212)";
		        				
		           ResultSet rs = stmt.executeQuery(sql);
		           
		           
		      //Updating a Record from the database
		           stmt = (Statement) conn.createStatement();
		           stmt.executeUpdate("UPDATE Customer SET Customer_Name = 'Anel', Customer_Surname = 'Lee' WHERE Customer_ID = 2");
		           
		            Retrieving data from the database
			        String sql1 = "SELECT * FROM Customer Where Customer_ID LIKE 79120212)";
			        				
			          ResultSet rs1 = stmt.executeQuery(sql);
			                
		       
		           
		           while(rs.next()){
		               //Retrieve by column name
		               int id  = rs.getInt("Customer_ID");
		               String Customer_Name = rs.getString("Customer_Name");
		               String Customer_Surname = rs.getString("Customer_Surname");
		               int Phone = rs.getInt("Phone");
		              
		               
		               
		               

		               //Display records
		               System.out.println("------------------------Database Records----------------------------------");
		               System.out.print("Customer_ID : "+" "+" " + id);
		               System.out.print("Customer_Name : " + Customer_Name);
		               System.out.print("Customer_Surname : " +" "+ Customer_Surname);
		               System.out.println("Phone: " + Phone);
		               
		               
		               
		           }
		           
	           
	         
	           rs.close();
	  	System.out.println("Rows affected: " );
	  	      
	  	
		      System.out.println();
	  	  
	            
	            
	        } catch(Exception e){
	            System.out.println(e.getMessage());
	        } 
	        
	    }
}
