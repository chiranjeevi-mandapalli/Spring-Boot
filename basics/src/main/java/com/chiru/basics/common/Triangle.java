package com.chiru.basics.common;

import org.springframework.stereotype.Component;

/**
 * @author Chiranjeevi
 */
@Component
public class Triangle implements Perimeter{
    @Override
    public int findPerimeter() {
        return 3;
    }
}
