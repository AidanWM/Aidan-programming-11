import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Students:");
        ArrayList<Student> students = new ArrayList<>();
        for (int y = 0; y < 10; y++) {
            students.add(new Student());
        }
        students.remove(2);
        students.remove(5);
        for (int y = 0; y < students.size(); y++) {
            System.out.println(students.get(y).getIdNum());
        }
        System.out.println("Teachers:");
        ArrayList<Teacher> teachers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            teachers.add(new Teacher());
        }
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println(teachers.get(i).getSubject());
            teachers.remove(1);
        }
    }
}