package learning.java.shool;
import java.util.*;
public class Application {

    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Isaias", "1"),
                new Student("Isaias", "2"),
                new Student("Isaias", "3"),
                new Student("Isaias", "4")
        };
        System.out.println("Los alumnos son...");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName() + "-" + students[i].getCode());
            System.out.print("Asistio?:");
            String response = scanner.next("YNyn");
            System.out.println(students[i].getName() + (response.equalsIgnoreCase("Y") ? "Si" : "No"));
        }

    }
}
