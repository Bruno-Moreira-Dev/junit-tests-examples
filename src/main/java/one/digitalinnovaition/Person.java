package one.digitalinnovaition;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Person {

    private String name;
    private LocalDateTime birthDate;

    public Person(String name, LocalDateTime birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        return (int) ChronoUnit.YEARS.between(birthDate, LocalDateTime.now());
    }

    public boolean isAdult() {
        return getAge() >= 18;
    }
}
