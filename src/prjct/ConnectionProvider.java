package prjct;
import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionProvider {
public static Connection getcon(){
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelbookingsystem","root","");
return con;


}
catch(Exception e)
{
return null;

}
}    
}
