package prjct;
import java.sql.*;
import javax.swing.JOptionPane;

public class insertupdatedelete {
public static void setdata(String Query,String msg){
 
   Connection con=null;
Statement st=null;
try
{
con=ConnectionProvider.getcon();
st=con.createStatement();
st.executeUpdate(Query);
if(!msg.equals(""))
 JOptionPane.showMessageDialog(null, msg);
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(null, e);
            }

finally
{
try
{}
catch(Exception e)
{}
}


}    
}
