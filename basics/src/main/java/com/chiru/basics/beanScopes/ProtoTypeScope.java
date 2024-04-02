package com.chiru.basics.beanScopes;

import com.chiru.basics.common.Perimeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chiranjeevi
 */
@RestController
public class ProtoTypeScope {
    private Perimeter perimeter;
    private Perimeter anotherPerimeter;

    @Autowired
    public ProtoTypeScope(
            Perimeter perimeter,
            Perimeter anotherPerimeter
    ) {
        this.perimeter = perimeter;
        this.anotherPerimeter = anotherPerimeter;
    }

    @GetMapping("/check1")
    public String check() {
        return "Comparing beans perimeter== anotherPerimeter," + (perimeter == anotherPerimeter);
    }

}

