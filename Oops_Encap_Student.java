public class Oops_Encap_Student {
    private String sName;
    private int rollNumber;
    private String department;


    Oops_Encap_Student(String sName, int rollNumber, String department){
        this.sName = sName;
        this.rollNumber = rollNumber;
        this.department = department;
    }

    public void setStudentName(String sName){
        this.sName = sName;
    }
     public void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }
     public void setDepartment(String department){
        this.department = department;
    }

public String getSname(){
    return sName;
}
    public int getRollNumber(){
        return rollNumber;
    }
    public String getDepartment(){
        return department;
    }

    public static void main(String[] args) {
        Oops_Encap_Student  s1 = new Oops_Encap_Student("Ishan", 18136, "CSE");
        s1.setStudentName("Vikash");
        System.out.println(s1.getSname());
        s1.setRollNumber(18135);
        System.out.println(s1.getRollNumber());
        s1.setDepartment("ECE");
        System.out.println(s1.getDepartment());
    }

}
