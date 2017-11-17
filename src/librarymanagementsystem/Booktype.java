/*package librarymanagementsystem;
import java.sql.*;
public class Booktype {
    public static void main(String arg[])throws Exception{
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    Connection con=DriverManager.getConnection("jdbc:odbc:Library");
    Statement st=con.createStatement();
    ResultSet result=st.executeQuery("select * from BookType");
    while(result.next()){
    int typeId=result.getInt("type_id");
    String type=result.getString("type");
    String remark=result.getString("remarks");
    
    System.out.print("TypeId:"+typeId+"\t");
    System.out.print("Type:"+type+"\t");
    System.out.println("Remarks:"+remark+"\t");
    }
    }
}*/
