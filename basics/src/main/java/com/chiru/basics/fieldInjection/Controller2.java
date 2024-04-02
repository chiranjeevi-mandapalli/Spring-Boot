package com.chiru.basics.fieldInjection;

import com.chiru.basics.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chiranjeevi
 */
@RestController
public class Controller2 {
    @Autowired
    private Coach coach;

    @GetMapping("/daily/work2")
    public String getDailyWorkOut(){
        return coach.getDailyWorkOut();
    }
}
