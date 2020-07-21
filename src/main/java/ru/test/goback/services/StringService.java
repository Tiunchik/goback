package ru.test.goback.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Scope("singleton")
public class StringService {

    public List<String> sortString(String[] text) {
        return Arrays.asList(text).stream()
                .sorted(Comparator.comparingInt(String::length).thenComparing(f -> f))
                .map(x -> String.format("(%d) %s", x.length(), x)).collect(Collectors.toList());
    }
}
