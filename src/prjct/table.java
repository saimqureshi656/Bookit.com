
package prjct;

import java.sql.*;
import javax.swing.JOptionPane;

public class table {
public static void main(String[] args){

Connection con=null;
Statement st=null;
try
{
con=ConnectionProvider.getcon();
st=con.createStatement();
//st.executeUpdate("create table users(name varchar(200),email varchar(200),password varchar(200),securityquestion varchar(500),answer varchar(200),address varchar(200),status varchar(20))");
st.executeUpdate("create table card(roomNO varchar(200),CardNumber varchar(200),CardHolderName varchar(200),CVV varchar(200),ExpirayDate varchar(200))");
//st.executeUpdate("create table Customerdetails(ID int AUTO_INCREMENT primary Key,Hotelname varchar(200),Name varchar(200),CNIC varchar(200),Email varchar(50),MobileNumber varchar(30),Nationality varchar(200),Gender varchar(50),Address varchar(500),CheckINdate varchar(50),CheckOutdate varchar(50),RoomNO varchar(20),Bed varchar(200),RoomType varchar(200),PricePerDay int(10),TotalAmount varchar(200))");
//st.executeUpdate("create table product(ID int AUTO_INCREMENT primary Key,Name varchar(200),Category varchar(200),Price varchar(200))");
JOptionPane.showMessageDialog(null, "table created sucessfully");

}
catch(Exception e)      
{
    JOptionPane.showMessageDialog(null, e);
}


finally
{
try
{
    con.close();
    st.close();
}
catch(Exception e)      
{}

}



}    
}
