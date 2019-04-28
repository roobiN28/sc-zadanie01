package dev.robertzuba;

import java.time.LocalDate;

import static java.lang.Integer.parseInt;

public class PeselService {

    public PeselInfo extractPeselInfo(String pesel) {
        Integer century = 1900;
        LocalDate birthdate = LocalDate.of(century + parseInt(pesel.substring(0, 2)),
                parseInt(pesel.substring(2, 4)),
                parseInt(pesel.substring(4, 6)));

        return new PeselInfo(birthdate);
    }
}
