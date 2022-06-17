package chapter3.examstudent.db;

import chapter3.examstudent.entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class DBManager {
    private Long id = 0L;
    private ArrayList<Student> students = new ArrayList<>();

    {
        students.add(new Student(++id, "Barak", "Obama", 95, null));
        students.add(new Student(++id, "Emmanuel", "Macron", 95, null));
        students.add(new Student(++id, "Vladimir", "Putin", 42, null));
        students.add(new Student(++id, "KASSYM-JOMART", "Tokayev", 88, null));
        students.add(new Student(++id, "Fidel", "Castro", 58, null));
        students.add(new Student(++id, "Chan", "Kaishi", 38, null));
        students.add(new Student(++id, "Toetomi", "Khideosi", 65, null));
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        student.setId(++id);
        students.add(student);
    }

    public void deleteStudent(Long id) {
        students.removeIf(student -> student.getId().equals(id));
    }

    public Student getStudent(Long id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }
}
