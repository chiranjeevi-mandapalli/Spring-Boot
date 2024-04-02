package com.chiru.basics.beanScopes;

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
public class SingletonScope {
    private Bird bird;
    private Bird anotherbird;

    @Autowired
    public SingletonScope(
            @Qualifier("eagle") Bird bird,
            @Qualifier("eagle") Bird anotherBird
    ) {
        this.bird = bird;
        this.anotherbird = anotherBird;
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans bird== another bird," + (bird == anotherbird);
    }

}
