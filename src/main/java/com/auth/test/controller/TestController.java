package com.auth.test.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {
	
    @GetMapping
    public ResponseEntity<String> helloWorld() {
        return new ResponseEntity<String>("Hello World", new HttpHeaders(), HttpStatus.OK);
    }
}