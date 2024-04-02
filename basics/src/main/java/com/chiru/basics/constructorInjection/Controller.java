package com.chiru.basics.constructorInjection;

import com.chiru.basics.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chiranjeevi
 */
@RestController
public class Controller {
    private Coach coach;
    @Autowired
    public Controller(Coach coach){
        this.coach = coach;
    }

    @GetMapping("/daily/work")
    public String getDailyWorkOut(){
        return coach.getDailyWorkOut();
    }
}
