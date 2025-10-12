public class Employee {
    private int id;
    private String name;
    private double salary;


    public Employee(int id, String name, double salary){
        this.id=id;
        this.name = name;
        setSalary(salary);
    }

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(double salary){
       if(salary>0){
         this.salary = salary;
       }
       else{
        System.out.println("Invalid Salary");
       }
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }

    @Override
    public String toString(){
        return "Employee ID :" + id + ", Name : " + name +  ", Salary : "+ (double)salary;
    }

    public static void main(String[] args) {
        Employee emp  = new Employee(136, "Mukesh", 0.0);
        System.out.println(emp);
        emp.setSalary(-233.5656);
        System.out.println(emp.getSalary());
    }
}
