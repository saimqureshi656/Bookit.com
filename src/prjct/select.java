  package prjct;
import java.sql.*;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class select {
    public static ResultSet getData(String query)
    {
    
    Connection con=null;
    ResultSet rs=null;
    Statement st=null;
    try
    {
    con=ConnectionProvider.getcon();
    st=con.createStatement();
    rs=st.executeQuery(query);
    return rs;
    
    }
    catch(Exception e)
    {
    JOptionPane.showMessageDialog(null, e);
    return null;
    }
    
    }
}
