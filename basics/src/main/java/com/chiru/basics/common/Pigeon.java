package com.chiru.basics.common;

import org.springframework.stereotype.Component;

/**
 * @author Chiranjeevi
 */
@Component
public class Pigeon implements Bird{
    @Override
    public String fly() {
        return "Pigeon can fly";
    }
}
