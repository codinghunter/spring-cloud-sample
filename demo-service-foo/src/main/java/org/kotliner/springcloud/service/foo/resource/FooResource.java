package org.kotliner.springcloud.service.foo.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooResource {

    @Value("${service.name}")
    private String name;

    @GetMapping("/foo/name")
    public String barName() {
        return name;
    }

}
