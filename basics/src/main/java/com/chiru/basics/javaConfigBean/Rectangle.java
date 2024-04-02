package com.chiru.basics.javaConfigBean;

import com.chiru.basics.common.Perimeter;

/**
 * @author Chiranjeevi
 */
public class Rectangle implements Perimeter {
    @Override
    public int findPerimeter() {
        return 4;
    }
}
