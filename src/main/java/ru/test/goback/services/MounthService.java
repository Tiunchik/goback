package ru.test.goback.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Scope("singleton")
public class MounthService {

    private final HashMap<Integer, String> mounthMap = new HashMap<>();

    public MounthService() {
        mounthMap.put(1,"Я-Н-В-А-Р-Ь");
        mounthMap.put(2,"Ф-Е-В-Р-А-Л-Ь");
        mounthMap.put(3,"М-А-Р-Т");
        mounthMap.put(4,"А-П-Р-Е-Л-Ь");
        mounthMap.put(5,"М-А-Й");
        mounthMap.put(6,"И-Ю-Н-Ь");
        mounthMap.put(7,"И-Ю-Л-Ь");
        mounthMap.put(8,"А-В-Г-У-С-Т");
        mounthMap.put(9,"С-Е-Н-Т-Я-Б-Р-Ь");
        mounthMap.put(10,"О-К-Т-Я-Б-Р-Ь");
        mounthMap.put(11,"Н-О-Я-Б-Р-Ь");
        mounthMap.put(12,"Д-Е-К-А-Б-Р-Ь");
    }

    public String findOutMounth(String number) {
        int check;
        String answer = "INCORRECT INPUT DATA";
        if (number.matches("^[0-9]{1,2}$")
                && (check = Integer.parseInt(number)) <= 12
                && check > 0) {
            answer = mounthMap.get(check);
        }
        return answer;
    }

}
