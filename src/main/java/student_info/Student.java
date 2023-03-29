package student_info;

// Lab #1
public class Student {
    public String name;
    public int age;
    public char letterGrade;

    public void printStudentInfo(String studentName, int studentAge, char studentLetterGrade){
        name = studentName;
        age = studentAge;
        letterGrade = studentLetterGrade;
        System.out.println("Student's Name: " + name);
        System.out.println("Student's Age: " + age);
        System.out.println("Student's Grade: " + letterGrade);

    }
}
