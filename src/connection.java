/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SATISH
 */
  import java.sql.*;
public class connection {
  
 

    public  Connection con;
    public  Statement st;
    public ResultSet rs;
    /**
     *
     * @param args
     * @throws SQLException
     */
 public connection()
            {
      try
      {
  
       Class.forName("oracle.jdbc.driver.OracleDriver");
        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe", "system" , "password");
      }
      catch(Exception e)
      {
            System.out.println(e);
      }
}
}
    

