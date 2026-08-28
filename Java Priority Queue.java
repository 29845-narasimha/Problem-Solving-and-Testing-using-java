import java.util.*;

class Student {
    private int id;
    String name;
    double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
}

class Priorities {
    public List<Student> getStudents(List<String> events) {
        // Create a PriorityQueue with custom sorting criteria using Java 8 Comparators
        PriorityQueue<Student> pq = new PriorityQueue<>(
            Comparator.comparing(Student::getCGPA).reversed()
                      .thenComparing(Student::getName)
                      .thenComparing(Student::getID)
        );

        for (String event : events) {
            String[] parts = event.split("\\s+");
            if (parts[0].equals("ENTER")) {
                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);
                pq.add(new Student(id, name, cgpa));
            } else if (parts[0].equals("SERVED")) {
                pq.poll();
            }
        }

        List<Student> students = new ArrayList<>();
        while (!pq.isEmpty()) {
            students.add(pq.poll());
        }
        
        return students;
    }
}
