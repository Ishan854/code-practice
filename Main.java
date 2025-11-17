import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Student> studentList = new ArrayList<>();

    public static void main(String[] args) {
        Student s1 = new Student("Ishan", 25, "S-123");
        s1.enrollCourse("Java");
        System.out.println(s1);
        s1.printStudentInfo();
        System.out.println("--------X----------------X----------------X--------");
        Student s2 = new Student("Rohan", 29, "S-136");
        s2.enrollCourse("Python");
        System.out.println(s2);
        s2.printStudentInfo();

        System.out.println("--------X----------------X----------------X--------");
        Student s3 = new Student("Rajkumar", 29, "S-146");
        s3.enrollCourse("DevOps");
        System.out.println(s3);
        s3.printStudentInfo();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        System.out.println(studentList);

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