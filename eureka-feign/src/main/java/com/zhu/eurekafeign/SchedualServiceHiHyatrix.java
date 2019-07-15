package com.zhu.eurekafeign;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHyatrix implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorrr!!"+name;
    }
}
