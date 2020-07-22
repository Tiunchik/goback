package ru.test.goback.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.test.goback.services.MonthService;

@Controller
@RequestMapping
public class MonthController {

    private final MonthService monthService;

    public MonthController(MonthService monthService) {
        this.monthService = monthService;
    }

    @GetMapping
    public ResponseEntity<String> doGet(@RequestParam String number) {
        return new ResponseEntity<>(monthService.findOutMonth(number), HttpStatus.OK);
    }
}
