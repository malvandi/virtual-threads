package ir.rahgozin.web.controller;

import com.github.javafaker.Faker;
import ir.rahgozin.web.service.PersonService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class IndexController {

    private final Boolean virtualThreadEnabled;

    public IndexController(@Value("${spring.threads.virtual.enabled}") Boolean virtualThreadEnabled) {
        this.virtualThreadEnabled = virtualThreadEnabled;
    }

    @GetMapping("/index")
    public HashMap<String, Object> findRandomPerson() {
        var map = new HashMap<String, Object>();
        map.put("author", "Morteza Malvandi");
        map.put("application", "Virtual Threads");
        map.put("version", "1.0.0");
        map.put("virtualThreads", virtualThreadEnabled);

        return map;
    }
}
