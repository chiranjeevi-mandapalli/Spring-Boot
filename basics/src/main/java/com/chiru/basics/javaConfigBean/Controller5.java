package com.chiru.basics.javaConfigBean;

import com.chiru.basics.common.Coach;
import com.chiru.basics.common.Perimeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chiranjeevi
 */
@RestController
public class Controller5 {
    private Perimeter perimeter;
    @Autowired
    public Controller5(@Qualifier("rectangle") Perimeter perimeter){
        this.perimeter = perimeter;
    }

    @GetMapping("/perimeter/rect")
    public int getPerimeter(){
        return perimeter.findPerimeter();
    }
}
