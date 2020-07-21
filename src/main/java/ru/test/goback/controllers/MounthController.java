package ru.test.goback.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.test.goback.services.MounthService;

@Controller
@RequestMapping
public class MounthController {

    private final MounthService mounthService;

    public MounthController(MounthService mounthService) {
        this.mounthService = mounthService;
    }

    @GetMapping
    public ResponseEntity<String> doGet(@RequestParam String number) {
        return new ResponseEntity<>(mounthService.findOutMounth(number), HttpStatus.OK);
    }
}
