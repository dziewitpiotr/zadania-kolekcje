package enum1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class Obywatel {
    private  Plec plec;
    private String imie;
    private String nazwisko;
    private long pesel;
}
