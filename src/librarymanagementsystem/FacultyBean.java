package librarymanagementsystem;


public class FacultyBean {
    private int facId;
    private String facName;
    private String remark;
    
    public void setFacId(int facId)
    {
        this.facId=facId;
    }
    public int getFacId()
    {
        return facId;
    }
    public void setFacName(String facName)
    {
        this.facName=facName;
    }
    public String getFacName()
    {
        return facName;
    }
    public void setRemark(String remark)
    {
        this.remark=remark;
    }
    public String getRemarks()
    {
        return remark;
    }

    public String toString()
    {
        return facName;
    }
}
