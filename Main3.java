import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    private static List<Student> studentList = new ArrayList<>();
    private static Scanner sc;

    public static void main(String[] args) {
       studentList = new ArrayList<Student>();
        sc = new Scanner(System.in);
        System.out.println("Select an Option.....");
        System.out.println("1. Register a Student");
        System.out.println("2. Find Student with StudentId");
        System.out.println("3. List All Student Information");
        System.out.println("4. List Student Information in Sorted Order");
        System.out.println("5. Exit");
        int option = sc.nextInt();

        switch (option) {
            case 1:
            
                
                break;
        
            default:
                break;
        }
        Student result = findStudentById("S-2022");
        System.out.println("Result: " + result);

    }

    public static Student findStudentById(String studentId){
        Student result = null;
        try{
                result = studentList.stream().filter(x -> x.getStudentId().equalsIgnoreCase(studentId))
                .findFirst()
                .orElseThrow(()->  new RuntimeException("No Data Found!"));
        }catch(RuntimeException r){
            System.err.println("Student with " + studentId + "does not exist!!");
        }
        return result;
    }
}