package zadanieLista6;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
@Setter
@Getter
public class Student {
    private List<Double> grades;
    private String indexNumber;
    private String name;
    private String surname;

    public Student(String indexNumber, String name, String surname) {
        this.indexNumber = indexNumber;
        this.name = name;
        this.surname = surname;
        this.grades = new ArrayList<Double>();
    }

    public void addGrade(Double grade) {
        this.grades.add(grade);
    }
}
