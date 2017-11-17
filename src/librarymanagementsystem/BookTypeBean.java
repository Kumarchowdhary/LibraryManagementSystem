package librarymanagementsystem;

public class BookTypeBean {
private int typeid;
private String type;
private String remark;

    public void setTypeId(int typeid)
    {
    this.typeid=typeid;
    }
    public int geTypeId(){
    return typeid;
    }
    public void setType(String type){
    this.type=type;
    }
    public String getType(){
    return type;
    }
    public String Type(){
    return type;
    }
    public void setRemark(String remark){
    this.remark=remark;
    }
    public String getRemark(){
    return remark;
    }
    public String toString(){
    return type;
    }
}