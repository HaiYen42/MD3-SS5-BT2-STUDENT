import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Student student= new Student();
        student.setName("Yến");
        student.setClasses("Lớp học vui nhộn");
        System.out.println(" Tên học sinh là "+ student.getName());
        System.out.println("Tên lớp học là "+ student.getClasses());
    }
}