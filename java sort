import java.util.*;

class Student {
    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();

            students.add(new Student(id, name, cgpa));
        }

        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student a, Student b) {
                // Higher CGPA first
                if (a.cgpa != b.cgpa) {
                    return Double.compare(b.cgpa, a.cgpa);
                }

                // Alphabetical order of names
                if (!a.name.equals(b.name)) {
                    return a.name.compareTo(b.name);
                }

                // Smaller ID first
                return Integer.compare(a.id, b.id);
            }
        });

        for (Student s : students) {
            System.out.println(s.name);
        }

        sc.close();
    }
}
