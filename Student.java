import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {

    private String name;
    private int age;
    private String studentId;
    private List<String> course;

    Student(String name, int age, String studentId){
      if (validateStudentId(studentId) && validateName(name) && validateAge(age)) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        course = new ArrayList<String>();
      }
    }

    public void enrollCourse(String courses){
        if(validateCourse(courses)){
            if (!course.contains(courses) && validateCourse(courses)) {
                course.add(courses); 
                System.out.println("Student is enrolled to " + courses + " Successfully!!");
            }else{
                System.err.println("Student is already enrolled to the Course" + courses);
            }
        }
       
    }


    public void printStudentInfo(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Student ID : " + studentId);
        System.out.println("List : " + course);
    }
    public String toString(){
        return "Name: " + name+ " Age: " + age + " Student Id: " + studentId + " Course: "+ course; 
    }

    public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getStudentId() {
		return studentId;
	}

	public List<String> getCourses() {
		return course;
	}


    public boolean validateStudentId(String studentId){
        String studentRegex = "S-\\d+$";
        Pattern studPattern = Pattern.compile(studentRegex);
        Matcher studenMatcher = studPattern.matcher(studentId);
        if(studenMatcher.matches()){
            return true;
        }else{
            System.err.println("Invalid!! Student ID please use the give format S-123");
            return false;
        }
    }

    public boolean validateName(String name){
        String nameRegex = "^[a-zA-Z\\s]+$";
        Pattern namePattern = Pattern.compile(nameRegex);
        Matcher nameMatcher = namePattern.matcher(name);
        if(nameMatcher.matches()){
            return true;
        }else{
            System.err.println("Invalid Name !! Please Enter Alphabate");
            return false;
        }
    }
    public boolean validateAge(int age){
        if(age>=19 && age<=35){
            return true;
        }else{
            System.err.println("Invalid!! Age Your Age Must be between 19 to 35");
            return false;
        }
    }

    public boolean validateCourse(String courses){
        if (courses.equalsIgnoreCase("Java") || courses.equalsIgnoreCase("Python") || courses.equalsIgnoreCase("DevOps")) {
            return true;
        }else{
            System.err.println("Invalid Course!! Please enter the course form the give list [Java, DSA, DevOps]");
            return false;
        }
    }

}