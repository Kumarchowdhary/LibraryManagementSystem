package librarymanagementsystem;
import java.util.Vector;
import java.sql.*;
import javax.swing.JOptionPane;

public class DBManager {
    static Connection con=null;
    public static void main(String arg[])throws Exception{
        init();
    }
    public static void init()throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagementsystem","root","");
        
    
    }
    static{
        try{
            init();
        }catch(Exception e){}
    }
    
    
    
    public static String getTypeName(int typeId)throws Exception
    {
        String type_Name = "";
        
        Statement st=null;
        st=con.createStatement();
        String query="select * from BookType where type_id = "+typeId+"";
        ResultSet result = st.executeQuery(query);
        try{
            while(result.next())
            {
                type_Name = result.getString("type");
            }
            return type_Name;
        }
        finally{
            if(st==null)st.close();
        }
    }
    
    
    
    public static String getTypeId(int book_id) throws Exception
    {
        int type_id = 0;
        String book_title = "";
        
        Statement st=null;
        st=con.createStatement();
        String query="select * from Books where book_id = "+book_id+"";
        ResultSet result = st.executeQuery(query);
        try{
            while(result.next())
            {
                type_id = result.getInt("type_id");
                book_title = result.getString("book_title");
            }
            return type_id+":"+book_title;
        }
        finally{
            if(st==null)st.close();
        }
    }
    
    
    
    
    public static int getBookId(String issue_id) throws Exception
    {
        int book_id = 0;
        Statement st=null;
        st=con.createStatement();
        String query="select * from BookIssue where issue_id = "+issue_id+"";
        ResultSet result = st.executeQuery(query);
        try{
            while(result.next())
            {
                book_id = result.getInt("book_id");
            }
            return book_id;
        }
        finally{
            if(st==null)st.close();
        }
        
    }
    
    
    
    public static Vector getFaculty()throws Exception{
    Vector v=new Vector();
    Statement st=null;
    ResultSet result=null;
    try{    
        st=con.createStatement();
        result=st.executeQuery("select  * from faculty");
        while(result.next()){
            int facId=result.getInt("fac_id");
            String facName=result.getString("fac_name");
            String Remark=result.getString("remarks");
            FacultyBean facBean=new FacultyBean();
            facBean.setFacId(facId);
            facBean.setFacName(facName);
            facBean.setRemark(Remark);
            v.addElement(facBean);
        }
    
    }finally{
        if(result==null)result.close();
        if(st==null)result.close();
        }
    return v;
    }
    public static Vector getDepartment(int facId) throws SQLException{
    Vector v=new Vector();
    Statement st=null;
    ResultSet result=null;
    try{
        st=con.createStatement();
        result=st.executeQuery("select * from Department where fac_id="+facId);
        while(result.next()){
        int FacId=result.getInt("fac_id");
        int depId=result.getInt("dept_id");
        String deptName=result.getString("dept_name");
        String Remark=result.getString("remarks");
        DepartmentBean depBean=new DepartmentBean();
        depBean.setFacId(FacId);
        depBean.setDeptId(depId);
        depBean.setdeptName(deptName);
        depBean.setRemark(Remark);
        v.addElement(depBean);
        
        }
    }finally{
    if(result==null)result.close();
        if(st==null)result.close();
    }
    return v;
    
    } 
    public static Vector getProgram(int depId) throws Exception{
    Vector v=new Vector();
    Statement st=null;
    ResultSet result=null;
    try{
    st=con.createStatement();
    result=st.executeQuery("select * from program where dept_id ="+depId);
    while(result.next()){
    int DepId=result.getInt("dept_id");
    int ProId=result.getInt("prog_id");
    String ProName=result.getString("prog_name");
    String progDuration=result.getString("prog_duration");
    String remarks=result.getString("remarks");
    ProgramBean PBean=new ProgramBean();
    PBean.setDeptId(depId);
    PBean.setProgId(ProId);
    PBean.setProgName(ProName);
    PBean.setProgDuration(progDuration);
    PBean.setRemark(remarks);
    v.addElement(PBean);
    //System.out.println(v);
    }
    }finally{
    if(result==null)result.close();
    if(st==null)st.close();
    }
    return v;
    }
    public static Vector getBatch(int proId)throws Exception{
    Vector v=new Vector();
    Statement st=null;
    ResultSet result=null;
    try{
        st=con.createStatement();
        result=st.executeQuery("select * from batch where prog_id="+proId);
        while(result.next()){
            int ProId=result.getInt("prog_id");
            int batId=result.getInt("batch_id");
            String batYear=result.getString("batch_year");
            String shift=result.getString("uni_shift");
            String group=result.getString("uni_group");
            String remark=result.getString("remarks");
            BatchBean bbean=new BatchBean();
            bbean.setBatchId(batId);
            bbean.setBatchYear(batYear);
            bbean.setShift(shift);
            bbean.setGroup(group);
            bbean.setRemark(remark);
            v.addElement(bbean);
            
        }
    }finally{}
    
    
    return v;
    
    }//get batch method
     public static Vector getStudent(int batId)throws Exception
    {
        Vector v=new Vector();
        Statement st=null;
        ResultSet result=null;
        try{
            st=con.createStatement();
            result=st.executeQuery("select * from student where batch_id="+batId);
            while(result.next())
            {
                int batchId=result.getInt("batch_id");
                int studentId=result.getInt("std_id");
                String studentName=result.getString("std_name");
                String studentFatherName=result.getString("std_fname");
                String surname=result.getString ("surname");
                String contactNo=result.getString("contact_no");
                String rollno=result.getString("roll_no");
                String gender=result.getString("gender");
                String remark=result.getString("remarks");
                StudentsBean studentsBean=new StudentsBean();
                studentsBean.setBatchId(batchId);
                studentsBean.setStudentId(studentId);
                studentsBean.setStudentName(studentName);
                studentsBean.setStudentFatherName(studentFatherName);
                studentsBean.setSurname(surname);
                studentsBean.setContactNo(contactNo);
                studentsBean.setRollNo(rollno);
                studentsBean.setGender(gender);
                studentsBean.setRemark(remark);
                v.addElement(studentsBean);
            }
        }
        
        finally{
            if(result==null)
            {
                result.close();
            }
            if(st==null)
            {
                st.close();
            }
        }
        return v;
    }//get Students Method
     
public static Vector getBookType()throws Exception{
Vector v=new Vector();
Statement st=null;
ResultSet result=null;
try{

    st=con.createStatement();
    result=st.executeQuery("select * from BookType");
    while(result.next()){
    int typeId=result.getInt("type_id");
    String bookType=result.getString("type");
    String remark=result.getString("remarks");
    BookTypeBean bbean=new BookTypeBean();
    bbean.setTypeId(typeId);
    bbean.setType(bookType);
    bbean.setRemark(remark);
    v.addElement(bbean);
    }


}finally{
if(result==null)result.close();
if(st==null)st.close();
}
return v;
}// get BookType

public static Vector getBooks(int typeid)throws Exception{
Vector v=new Vector();
Statement st=null;
ResultSet result=null;
try{
        st=con.createStatement();
        result=st.executeQuery("select * from Books where type_id="+typeid);
        while(result.next()){
        int bookId=result.getInt("book_id");
        String bookTitle=result.getString("book_title");
        String Author=result.getString("author");
        String Isbn=result.getString("Isbn");
        String publish=result.getString("publish");
        String edition=result.getString("edition");
        String purchase=result.getString("purchase");
        String prise=result.getString("price");
        String remark=result.getString("remarks");
        BooksBean bbean=new BooksBean();
        bbean.setBookId(bookId);
        bbean.setBookTitle(bookTitle);
        bbean.setAuthor(Author);
        bbean.setISBN(Isbn);
        bbean.setPublish(publish);
        bbean.setEdition(edition);
        bbean.setPurchase(purchase);
        bbean.setPrise(prise);
        bbean.setRemark(remark);
        v.addElement(bbean);
        }


}finally{
if(st==null)st.close();
if(result==null)result.close();
}
return v;
}//getBooks
public static Vector getBookIssue(int stdId)throws Exception{
Vector v=new Vector();
Statement st=null;
ResultSet result=null;
try{
    st=con.createStatement();
    result=st.executeQuery("select * from BookIssue where std_id="+stdId);
    while(result.next()){
        String issuedate=result.getString("issue_date");
        String returndate=result.getString("return_date");
        String remark=result.getString("remarks");
        BookIssueBean bookissuebean= new BookIssueBean();
        bookissuebean.setIssueDate(issuedate);
        bookissuebean.setReturnDate(returndate);
        bookissuebean.setRemark(remark);
        int issue_id = result.getInt("issue_id");
        bookissuebean.setIssueId(issue_id);
        v.addElement(bookissuebean);
    }
}finally{
if(st==null)st.close();
if(result==null)result.close();
}
return v;
}

 public static int addFaculty(String facName,String remark) throws SQLException
    {
        Statement st=null;
        String query="insert into faculty(fac_name,remarks) Values('"+facName+"','"+remark+"')";
        try{
            st=con.createStatement();
            int row=st.executeUpdate(query);
            return row;
        }finally{
            if(st==null)st.close();
        }
    }//end of addfaculty Method
 public static int deleteFaculty(int facId) throws SQLException
    {Statement st=null;
        try{
        
        String query="delete from faculty where fac_id="+facId;
        st=con.createStatement();
        int row=st.executeUpdate(query);
        return row;
        }
        finally{
            if(st==null)
             st.close();
        }
        
    }//delete faculty
    public static int updateFaculty(int facId,String facName,String remark) throws Exception
    {
        Statement st=null;
        try{
            String query="update faculty set fac_name='"+facName+"',remarks='"+remark+"' where fac_id="+facId;
            st=con.createStatement();
            int row=st.executeUpdate(query);
        return row;
        }
        finally
        {
            if(st==null)
                st.close();
        }
    
    }//update Faculty

    public static int addDepartment(int facId,String depName,String remark)throws Exception{
    Statement st=null;
    String query="Insert into Department(fac_id,dept_name,remarks)Values("+facId+",'"+depName+"','"+remark+"')";
    try{
        st=con.createStatement();
        int row=st.executeUpdate(query);
    return row;
    }
    
    finally{
    if(st==null)st.close();}
    
    }//end add department

    public static int addProgram(int depId,String proName,String proDuration,String remark)throws Exception{
    Statement st=null;
    String query="Insert into program(prog_name,prog_duration,remarks,dept_id)Values('"+proName+"','"+proDuration+"','"+remark+"',"+depId+")";
    
    try{
    st=con.createStatement();
    int row=st.executeUpdate(query);
    return row;
    }finally{
    if(st==null)st.close();
    }
    }//end program add method
    public static int addBatch(int proId,String batchYear,String shift,String group,String remark)throws Exception{
    Statement st=null;
    
    String query="Insert into batch(batch_year,uni_shift,uni_group,remarks,prog_id)Values('"+batchYear+"','"+shift+"','"+group+"','"+remark+"',"+proId+")";
    try{
    st=con.createStatement();
    int row=st.executeUpdate(query);
    return row;
    }finally{
    if(st==null)st.close();
    }
    
    }//add student end metod
    public static int addStudent(int batId,String stdName,String stdfatherName,String surname,String rollno,String gender,String contact,String remark )throws Exception{
    Statement st=null;
    String query="Insert into student(std_name,std_fname,surname,contact_no,roll_no,gender,remarks,batch_id)Values('"+stdName+"','"+stdfatherName+"','"+surname+"','"+contact+"','"+rollno+"','"+gender+"','"+remark+"',"+batId+")";
    try{
        st=con.createStatement();
        int row=st.executeUpdate(query);
        return row;
    
    }finally{if(st==null)st.close();
            
            }//end add student
    }
    public static int updateDepartment(int depId,String depName,String remark) throws Exception
    {
        Statement st=null;
        try
        {
          String query="update Department set dept_name='"+depName+"',remarks='"+remark+"' where dept_id="+depId;
          st=con.createStatement();
          int row=st.executeUpdate(query);
          return row;
        }finally
        {
            if(st==null)
                st.close();
            
        }
    }//end update department
        public static int updateProgram(int proId,String proName,String proDuration,String remark)throws Exception{
        Statement st=null;
        try{
                String query="update program set prog_name='"+proName+"',prog_duration='"+proDuration+"',remarks='"+remark+"' where prog_id="+proId;
                st=con.createStatement();
                int row=st.executeUpdate(query);
                return row;
}
        finally{
        if(st==null)st.close();
        }
    
    
    


}//end program update

public static int updateBatch(int batId,String batYear,String shift,String group)throws Exception{
Statement st=null;
try{
    String query="update batch set batch_year='"+batYear+"',uni_shift='"+shift+"',uni_group='"+group+"'where batch_id="+batId;
    st=con.createStatement();
    int row=st.executeUpdate(query);
    return row;
}finally{
if(st==null)st.close();
}

}//end batch update

public static int updateStudent(int stdId,String stdname,String fname,String surname,String gender,String rollNo,String contactNo,String remark)throws Exception{
Statement st=null;
try{
        String query="update student set std_name='"+stdname+"',std_fname='"+fname+"',surname='"+surname+"',gender='"+gender+"',roll_no='"+rollNo+"',contact_no='"+contactNo+"',remarks='"+remark+"' where std_id  ="+stdId;
        st=con.createStatement();
        int row=st.executeUpdate(query);
        return row;
}finally{
if(st==null)st.close();}
}//end update student

public static int deleteDepartment(int depId)throws Exception{
Statement st=null;
        try{
                String query="delete from Department where dept_id ="+depId;
                st=con.createStatement();
                int row=st.executeUpdate(query);
                return row;
        }
        
        finally
        {
        if(st==null)
            st.close();
        }
    }//delete Department
    public static int deleteProgram(int proId)throws Exception{
    Statement st=null;
    try{
        String query="delete from Program where prog_id="+proId;
        st=con.createStatement();
        int row=st.executeUpdate(query);
        return row;
    
    
    }finally{
    if(st==null)st.close();
    
    }
    
    }//delete Program

    public static int deleteBatch(int batId)throws Exception{
    Statement st=null;
    try{
            String query="delete from batch where batch_id="+batId;
            st=con.createStatement();
            int row=st.executeUpdate(query);
            return row;
    
    }finally{
    if(st==null)st.close();
    }
    
    }//delete batch
public static int deleteStudent(int stdId)throws Exception{
Statement st=null;
try{
    String query="delete from student where std_id="+stdId;
    st=con.createStatement();
    int row=st.executeUpdate(query);
    return row;
}finally{if(st==null)st.close();}
}//delete student
public static int addBookType(String bookType,String remark)throws Exception{
Statement st=null;
try{
        String query="Insert into BookType(type,remarks)Values('"+bookType+"','"+remark+"')";
        st=con.createStatement();
        int row=st.executeUpdate(query);
        return row;
}finally{
if(st==null)st.close();
}
}//add booktype

public static int updateBookType(int typeId,String booktype,String remark)throws Exception{
Statement st=null;
try{
        String query="update BookType set type='"+booktype+"',remarks='"+remark+"'where type_id= "+typeId;
        st=con.createStatement();
        int row=st.executeUpdate(query);
        return row;
}finally{
if(st==null)st.close();
}

}//update BookType
public static int deleteBookType(int typeId)throws Exception{
Statement st=null;
try{
        String query="delete from BookType where type_id="+typeId;
        st=con.createStatement();
        int row=st.executeUpdate(query);
        return row;
}finally{
if(st==null)st.close();
}

}//delete booktype
public static int addBooks(int typeid,String bookTitle,String bookauthor,String Isbn,String publish,String Edition,String purchase,String prise,String remark)throws Exception{
Statement st=null;
try{
String query="Insert into Books(book_title,author,Isbn,publish,edition,purchase,price,remarks,type_id)Values('"+bookTitle+"','"+bookauthor+"','"+Isbn+"','"+publish+"','"+Edition+"','"+purchase+"','"+prise+"','"+remark+"',"+typeid+")";
st=con.createStatement();
int row=st.executeUpdate(query);
return row;
}finally{

if(st==null)st.close();}

}//add Books method
public static int updateBooks(int bookId,String bookTitle,String Author,String Isbn,String publish,String Edition,String purchase,String prise,String remark)throws Exception{
Statement st=null;
try{
    String query="update Books set book_title='"+bookTitle+"',author='"+Author+"',Isbn='"+Isbn+"',publish='"+publish+"',edition='"+Edition+"',purchase='"+purchase+"',price='"+prise+"',remarks='"+remark+"'where book_id="+bookId;
    st=con.createStatement();
    int row=st.executeUpdate(query);
    return row;

}finally{
if(st==null)st.close();
}

}// update Books
public static int deleteBooks(int bookId)throws Exception {
Statement st=null;
try{
String query="delete from Books where book_id="+bookId;
st=con.createStatement();
int row=st.executeUpdate(query);
return row;

}finally{if(st==null)st.close();}

}//update Books

public static int addBookIssue(int stdId,int bookId,String issueDate,String returnDate,String remark)throws Exception{
Statement st=null;
try{
    String query="Insert into BookIssue(std_id,book_id,issue_date,return_date,remarks)Values("+stdId+","+bookId+",'"+issueDate+"','"+returnDate+"','"+remark+"')";
    st=con.createStatement();
    int row=st.executeUpdate(query);
    return row;
}finally{
if(st==null)st.close();
}

}//end add bookissue
public static int updateBookIssue(int issueId,String issueDate,String returnDate,String remark)throws Exception{
Statement st=null;
try{
String query="update  BookIssue set return_date='"+returnDate+"',remarks='"+remark+"'where issue_id="+issueId;
st=con.createStatement();
int row=st.executeUpdate(query);

return row;
}finally{
if(st==null)st.close();
}

}


}


