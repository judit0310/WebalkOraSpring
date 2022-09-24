package hu.uni.miskolc.webalk;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class HallgatoService {
    public List<Hallgato> getHallgatok(){
        List<Hallgato> hallgatok = new ArrayList<>();
        Hallgato h1 = new Hallgato(1,"ABC123",
                "Kiss Béla","kiss.bela@pelda.hu",
                LocalDate.of(2000, Month.JULY,12));

        Hallgato h2 = new Hallgato(2,"ABC333",
                "Nagy Rózsa","nagy.rozsa@pelda.hu",
                LocalDate.of(1996, Month.MARCH,1));
        hallgatok.add(h1);
        hallgatok.add(h2);
       /* return new ArrayList<>(Arrays.asList(new Hallgato(1,"ABC123",
                                                      "Kiss Béla","kiss.bela@pelda.hu",
                                              LocalDate.of(2000, Month.JULY,12))));*/
        return hallgatok;
    }

}
