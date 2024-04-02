package com.chiru.basics.setterInjection;

import com.chiru.basics.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chiranjeevi
 */
@RestController
public class Controller1 {
    private Coach coach;
    @Autowired
    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/daily/work1")
    public String getDailyWorkOut(){
        return coach.getDailyWorkOut();
    }
}
