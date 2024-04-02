package com.chiru.basics.common;

import org.springframework.stereotype.Component;

/**
 * @author Chiranjeevi
 */
@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "practice bowling daily for 1hour!!!!";
    }
}
