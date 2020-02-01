package zadanieLista5;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Student {
    private String indexNumber;
    private String name;
    private String surname;
    private SexType sex;

    public Student(String indexNumber, String name, String surname, SexType sex) {
        this.indexNumber = indexNumber;
        this.name = name;
        this.surname = surname;
        this.sex = sex;
    }

}
