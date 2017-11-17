package librarymanagementsystem;


public class DepartmentBean {
    private int facId;
    private int deptId;
    private String deptName;
    private String remark;
    
    public void setFacId(int facId)
    {
        this.facId=facId;
    }
    public int getFacId()
    {
        return facId;
    }
    public void setDeptId(int deptId)
    {
       this.deptId=deptId;
    
    }
    public int getDeptId()
    {
        return deptId;
    }
    public void setdeptName(String deptName)
    {
        this.deptName=deptName;
    }
    public String getdeptName()
    {
        return deptName;
    }
    public void setRemark(String remark)
    {
        this.remark=remark;
    }
    public String getRemark()
    {
        return remark;
     }
    public String toString()
    {
        return deptName;
    }    
}
