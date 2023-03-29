package student_info;

public class StudentTestDrive {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.printStudentInfo("Jessica", 15, 'B');
        System.out.println("");
        Student student2 = new Student();
        student2.printStudentInfo("David", 17, 'C');
        System.out.println("");

    }
}
