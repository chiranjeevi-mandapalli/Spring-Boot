package com.chiru.basics.common;

import org.springframework.stereotype.Component;

/**
 * @author Chiranjeevi
 */
@Component
public class Eagle implements Bird{
    @Override
    public String fly() {
        return "Eagle can fly";
    }
}
