package com.example.oreilly.spring.start.io.assignment1.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope
public class RefreshScopePresent {
    private String a;
    private static final Logger LOGGER = LoggerFactory.getLogger(RefreshScopePresent.class);


    public RefreshScopePresent(@Value("${propertyName:test}") String a) {
        this.a = a;
    }

    public void display() {
        LOGGER.info("Value of a is " + a);
    }
}
