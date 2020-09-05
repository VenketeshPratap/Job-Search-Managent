/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package job;

/**
 *
 * @author Vinay
 */
class User {
    private String C_id,C_name,Job_Title,Degree,location,salary,Cut_offM;
    

public User(String C_id,String C_name,String Job_Title,String Degree,String location,String salary,String Cut_offM)
{
    this.C_id=C_id;
    this.C_name=C_name;
    this.Job_Title=Job_Title;
    this.Degree=Degree;
    this.location=location;
    this.salary=salary;
    this.Cut_offM=Cut_offM;
}
public String getC_id(){
    return C_id;
}
    public String getC_name(){
        return C_name;
}
    public String getJob_Title(){
        return Job_Title;
    }
    public String getDegree(){
        return Degree;
        
    }
    public String getlocation(){
        return location;
    }
    public String getsalary(){
        return salary;
    }
    public String getCut_offM(){
        return Cut_offM;
    }

 }