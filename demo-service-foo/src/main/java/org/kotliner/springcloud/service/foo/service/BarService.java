package org.kotliner.springcloud.service.foo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("org.kotliner.sample.service.bar")
public interface BarService {

    @RequestMapping(method = RequestMethod.GET, value = "/bar/name")
    String getBarName();

}
