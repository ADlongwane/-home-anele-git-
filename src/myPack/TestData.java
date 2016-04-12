package myPack;


	//STEP 1. Import required packages
	import java.sql.*;

	public class TestData {
	   // JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/Order_Processing";

	   //  Database credentials
	   static final String USER = "username";
	   static final String PASS = "password";
	 
	   public static Connection getConnection() throws Exception{
	        try{
	            String driver = "com.mysql.jdbc.Driver";
	            String url = "jdbc:mysql://localhost://Order_Processing/Anele";
	            String username = "Anele";
	            String password = "root";
	            Class.forName(driver); 
	            Connection conn = DriverManager.getConnection(url,username,password);
	            System.out.println("Connected");
	            return conn;
	        } catch(Exception e){
	            System.out.println(e.getMessage());
	        } 
	        return null;
	    }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   public static void main(String[] args) {
	   Connection conn = null;
	   Statement stmt = null;
	   try{
	      //STEP 2: Register JDBC driver
	      Class.forName("com.mysql.jdbc.Driver");

	      //STEP 3: Open a connection
	      System.out.println("Connecting to a selected database...");
	      conn = DriverManager.getConnection(DB_URL, USER, PASS);
	      System.out.println("Connected database successfully...");
	      
	      //STEP 4: Execute a query
	    //  System.out.println("Inserting records into the table...");
	      stmt = conn.createStatement();
	      
	      String sql = "INSERT INTO Registration " +
	                   "VALUES (100, 'Zara', 'Ali', 18)";
	      stmt.executeUpdate(sql);
	  
	      stmt.executeUpdate(sql);
	      System.out.println("Inserted records into the table...");

	   }catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }catch(Exception e){
	      //Handle errors for Class.forName
	      e.printStackTrace();
	   }finally{
	      //finally block used to close resources
	      try{
	         if(stmt!=null)
	            conn.close();
	      }catch(SQLException se){
	      }// do nothing
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }//end finally try
	   }//end try
	   System.out.println("Goodbye!");
	}//end main
	}//end JDBCExample
