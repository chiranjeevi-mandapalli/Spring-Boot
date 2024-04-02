package com.chiru.basics.qualifier;

import com.chiru.basics.common.Bird;
import com.chiru.basics.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chiranjeevi
 */
@RestController
public class QualifierController {
    private Bird bird;
    public QualifierController(@Qualifier("eagle") Bird bird){
        this.bird = bird;
    }

    @GetMapping("/bird")
    public String getDailyWorkOut(){
        return bird.fly();
    }
}
