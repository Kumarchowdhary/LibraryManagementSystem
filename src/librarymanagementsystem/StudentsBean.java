package librarymanagementsystem;

public class StudentsBean {

    private int batchId;
    private int studentId;
    private String studentName;
    private String studentFatherName;
    private String surname;
    private String contactNo;
    private String rollNo;
    private String gender;
    private String remark;
    private String shift;
    private String group;
    
    public void setShift(String shift)
    {
        this.shift=shift;
    }
    public String getShift()
    {
        return shift;
    }
    public void setGroup(String group)
    {
        this.group=group;
    }
    public String getGroup()
    {
        return group;
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
    public void setStudentId(int studentId)
    {
        this.studentId=studentId;
    }
    public int getStudentId()
    {
        return studentId;
    }
    //
    public void setStudentName(String studentName)
    {
        this.studentName=studentName;
    }
    public String getStudentName()
    {
        return studentName;
    }
    //
    public void setStudentFatherName(String studentFatherName)
    {
        this.studentFatherName=studentFatherName;
    }
    public String getStudentFatherName()
    {
        return studentFatherName;
    }
    //
    public void setSurname(String surname)
    {
        this.surname=surname;
    }
    public String getSurname()
    {
        return surname;
    }
    public void setContactNo(String contactNo)
    {
        this.contactNo=contactNo;
    }
    public String getContactNo()
    {
        return contactNo;
    }
    //
    public void setRollNo(String rollNo)
    {
        this.rollNo=rollNo;
    }
    public String getRollNo()
    {
        return rollNo;
    }
    //
    public void setGender(String gender)
    {
        this.gender=gender;
    }
    public String getGender()
    {
        return gender;
    }
    //
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
        return studentName;
    }
    
    
}
