package org.kotliner.springcloud.service.bar.resource;

import org.kotliner.springcloud.service.bar.service.BarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BarResource {
    private Logger log = LoggerFactory.getLogger(BarResource.class);

    private final BarService barService;

    @Autowired
    public BarResource(BarService barService) {
        this.barService = barService;
    }

    @GetMapping("/bar/name")
    public String barName() {
        log.info("Get bar name: " + barService.getBarName());
        return barService.getBarName();
    }

}
