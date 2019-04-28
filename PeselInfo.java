package dev.robertzuba;

import java.time.LocalDate;

public class PeselInfo {
    LocalDate birthdate;


    public PeselInfo(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
}
