package ru.test.goback.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.*;

@Service
@Scope("singleton")
public class MonthService {

    private final static String RU = "ru";

    private final static String SPLITTER = "-";

    private final HashMap<Integer, String> monthMap = new HashMap<>();

    public MonthService() {
    }

    public String findOutMonth(String number) {
        int check;
        String answer = "INCORRECT INPUT DATA";
        if (number.matches("^[0-9]{1,2}$")
                && (check = Integer.parseInt(number)) <= 12
                && check > 0) {
            if (monthMap.containsKey(check)) {
                answer = monthMap.get(check);
            } else {
                answer = addMonth(check);
                monthMap.put(check, answer);
            }
        }
        return answer;
    }

    private String addMonth(int number) {
        String originalMonth
                = Month.of(number)
                .getDisplayName(TextStyle.FULL_STANDALONE,
                        Locale.forLanguageTag(RU));
        StringBuilder builder = new StringBuilder();
        originalMonth
                .toUpperCase()
                .chars()
                .forEach(ch -> {
                    builder.append(Character.toString(ch));
                    builder.append(SPLITTER);
                });
        return builder
                .delete(builder.length() - 1, builder.length())
                .toString();
    }

}
