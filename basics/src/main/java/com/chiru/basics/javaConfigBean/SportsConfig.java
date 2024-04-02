package com.chiru.basics.javaConfigBean;

import com.chiru.basics.common.Perimeter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Chiranjeevi
 */
@Configuration
public class SportsConfig {
    @Bean
    public Perimeter rectangle(){
        return new Rectangle();
    }
}
