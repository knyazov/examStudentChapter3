package chapter3.examstudent.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Student {
    private Long id;
    private String name;
    private String surname;
    private int exam;
    private String mark;

    public Student() {
    }

    public Student(Long id, String name, String surname, int exam, String mark) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.exam = exam;
        this.mark = mark;
    }

    public Student(Long id, String name, String surname, int exam) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.exam = exam;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getExam() {
        return exam;
    }

    public void setExam(int exam) {
        this.exam = exam;
    }

    public String getMark() {
        if (this.exam >= 90) {
            return this.mark = "A";
        }
        if (this.exam >= 75 && this.exam < 90) {
            return this.mark = "B";
        }
        if (this.exam >= 60 && this.exam < 75) {
            return this.mark = "C";
        }
        if (this.exam >= 50 && this.exam < 60) {
            return this.mark = "D";
        }
        if (this.exam < 50) {
            return this.mark = "F";
        }
        return this.mark;
    }
}
