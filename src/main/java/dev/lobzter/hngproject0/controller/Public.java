package dev.lobzter.hngproject0.controller;
import dev.lobzter.hngproject0.Base.Base;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin("*")
public class Public {

    private final   Base base;

    public Public(Base base) {
        this.base = base;
    }

    @GetMapping("/")
    public Map<String, String> getPublicData(){

        Map<String, String> publicData = new HashMap<>();
        LocalDateTime dateTime = LocalDateTime.now();
        String iso = dateTime.format(DateTimeFormatter.ISO_DATE_TIME);

        publicData.put("Email Address", base.getEmailAddress() );
        publicData.put("Current Date", iso );
        publicData.put("Github Url", base.getGitUrl() );
        return publicData;

    }
}
