package com.woinhen.employerserviceapigateway.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/find-all")
    public ResponseEntity<String> getEmployee(){

        return new ResponseEntity<>("employee", HttpStatus.OK);
    }
}
