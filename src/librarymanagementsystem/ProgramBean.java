package librarymanagementsystem;


public class ProgramBean {
    //private int facId;
    private int deptId;
    private int progId;
    private String progName;
    private String progDuration;
    private String remark;
    //set DepartmentId.
    public void setDeptId(int deptId)
    {
        this.deptId=deptId;
    }
    //get Department ID.
    public int getDeptId()
    {
        return deptId;
    }
    //set Program ID.
    public void setProgId(int progId)
    {
       this.progId=progId;
    
    }
    //get program id.
    public int getProgId()
    {
        return progId;
    }
    //set Program Name
    public void setProgName(String progName)
    {
        this.progName=progName;
    }
    //get Program Name
    public String getProgName()
    {
        return progName;
    }
    //set ProgramDuration .
    public void setProgDuration(String progDuration )
    {
        this.progDuration=progDuration;
    }
    //get ProgramDuration
    public String getProgDuration()
    {
        return progDuration;
    }
    // set Remarks
    
    public void setRemark(String remark)
    {
        this.remark=remark;
    }
    public String getRemark()
    {
        return remark;
    }
    // convert string into string
    public String toString()
    {
        return progName;
    }
}// end of class 
