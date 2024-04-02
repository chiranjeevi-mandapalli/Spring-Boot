package com.chiru.basics.primary;

import com.chiru.basics.common.Bird;
import com.chiru.basics.common.Perimeter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chiranjeevi
 */
@RestController
public class PrimaryController {
    private Perimeter perimeter;
    public PrimaryController(Perimeter perimeter){
        this.perimeter = perimeter;
    }

    @GetMapping("/perimeter")
    public int getPerimeter(){
        return perimeter.findPerimeter();
    }
}
