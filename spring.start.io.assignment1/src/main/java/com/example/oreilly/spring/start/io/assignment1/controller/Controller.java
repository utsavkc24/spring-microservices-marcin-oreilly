package com.example.oreilly.spring.start.io.assignment1.controller;

import com.example.oreilly.spring.start.io.assignment1.service.RefreshScopePresent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private RefreshScopePresent refreshScopePresent;

    @GetMapping("/refreshed")
    public void displayValue() {
        refreshScopePresent.display();
    }


}
