package librarymanagementsystem;

public class BooksBean {
private int typeid;
private int bookid;
private String bookTitle;
private String author;
private String Isbn;
private String publish;
private String Edition;
private String purchase;
private String prise;
private String remark;

public void setTypeId(int typeid){
this.typeid=typeid;
    }
public int getTypeId(){
    return typeid;
    }
public void setBookId(int bookid){
    this.bookid=bookid;
    }
public int getBookId(){
    return bookid;
    }
public void setBookTitle(String bookTitle){
this.bookTitle=bookTitle;
}
public String getBookTitle(){
return bookTitle;
}
public void setAuthor(String author){
this.author=author;
}
public String getAuthor(){
return author;
}
public void setISBN(String Isbn){
    this.Isbn=Isbn;
}
public String getISBN(){
return Isbn;
}
public void setPublish(String publish){
this.publish=publish;
}
public String getPublish(){
return publish;
}
public void setEdition(String edition){
    this.Edition=edition;
}
public String getEdition(){
return Edition;
}
public void setPurchase(String purchase){
this.purchase=purchase;
}
public String getPurchase(){
return purchase;
}
public void setPrise(String prise){
this.prise=prise;
}
public String getPrise(){
return prise;
}

public void setRemark(String remark){
    this.remark=remark;

}
public String getRemark(){
return remark;
}
public String toString(){
return bookTitle;
}
}
