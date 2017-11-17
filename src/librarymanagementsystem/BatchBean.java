package librarymanagementsystem;


public class BatchBean {
    private int progId;
    private int batchId;
    private String batchYear;
    private String shift;
    private String group;
    private String remark;
    
    public void setProgId(int progId)
    {
        this.progId=progId;
    }
    public int getprogId()
    {
        return progId;
    }
    //
    public void setBatchId(int batchId)
    {
        this.batchId=batchId;
    }
    public int getBatchId()
    {
        return batchId;
    }
    //
    public void setBatchYear(String batchYear)
    {
        this.batchYear=batchYear;
    }
    public String getBatchYear()
    {
        return batchYear;
    }
    //
    public void setShift(String shift)
    {
        this.shift=shift;
    }
    public String getShift()
    {
        return shift;
    }
    //
    public void setGroup(String group)
    {
        this.group=group;
    }
    public String getGroup()
    {
        return group;
    }
    
    public void setRemark(String remark)
    {
        this.remark=remark;
    }
    public String getRemark()
    {
        return remark;
    }
    @Override
    public String toString()
    {
        return batchYear;
    }
}
