package ru.test.goback.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.test.goback.services.StringService;

import java.util.List;

@Controller
@RequestMapping
public class StringController {

    private final StringService stringService;

    public StringController(StringService stringService) {
        this.stringService = stringService;
    }

    @PostMapping
    public ResponseEntity<List<String>> doPost(@RequestBody String[] text) {
        return new ResponseEntity<>(stringService.sortString(text), HttpStatus.OK);
    }
}
