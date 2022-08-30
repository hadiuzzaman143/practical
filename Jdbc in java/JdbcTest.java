import java.sql.DriverManager;
import java.sql.*;  

public class JdbcTest 
{
    public static void main(String args[])
{  
try
{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306","root", null);  
//here sonoo is database name, root is username and password  

Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from emp");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(5)+"  "+rs.getString(4));  
con.close();  
}catch(Exception e)
{ 
    System.out.println(e);
}  
}  
}
   