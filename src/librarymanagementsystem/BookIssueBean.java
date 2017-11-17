package librarymanagementsystem;


public class BookIssueBean {
private int issueId;
private int bookId;
private int stdId;
private String issueDate;
private String returnDate;
private String remark;

public void setIssueId(int issueId){
this.issueId=issueId;
}
public int getIssueId(){
return issueId;
}
public void setBookId(int bookId){
this.bookId=bookId;
}
public int getBookId(){
return bookId;
}
public void setStudentId(int stdId){
this.stdId=stdId;
}
public int getStudentId(){
return stdId;
}
/*public void setShift(String shift){
this.shift=shift;
}
public String getShift(){
return shift;
}
public void setGroup(String group){
this.group=group;
}
public String getGroup(){
return group;
}

public void setFatherName(String fatherName){
this.fatherName=fatherName;
}
public String getFatherName(){
return fatherName;
}

public void setStudentRollNo(String stdrollno){
this.stdrollno=stdrollno;
}
public String getStudentRollNo(){
return stdrollno;
}

public void setSurname(String surname){
this.surname=surname;
}
public String getSurname(){
return surname;
}

public void setBookType(String bookType){
this.bookType=bookType;
}
public String getBookType(){
return bookType;
}

public void setBook(String Books){
this.Books=Books;
}
public String getBook(){
return Books;
}
public void setBookAuthor(String bookAuthor){
this.bookAuthor=bookAuthor;
}
public String getBookAuthor(){
return bookAuthor;
}

public void setEdition(String Edition){
this.Edition=Edition;
}
public String getEdition(){
return Edition;
}*/

public void setIssueDate(String issueDate){
this.issueDate=issueDate;
}
public String getIssueDate(){
return issueDate;
}

public void setReturnDate(String returnDate){
this.returnDate=returnDate;
}
public String getReturnDate(){
return returnDate;
}

public void setRemark(String remark){
this.remark=remark;
}
public String getRemark(){
return remark;
}
public String toString(){
return issueDate;
}




}


