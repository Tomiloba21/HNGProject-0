package dev.lobzter.hngproject0.controller;
import dev.lobzter.hngproject0.Base.Base;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@CrossOrigin("*")
public class Public {

    private final Base base;

    public Public(Base base) {
        this.base = base;
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public Map<String, String> getPublicData(){

        Map<String, String> publicData = new LinkedHashMap<>();
        String iso = Instant.now().atOffset(ZoneOffset.UTC).format(DateTimeFormatter.ISO_INSTANT);

        publicData.put("email", base.getEmailAddress() );
        publicData.put("current_datetime", iso );
        publicData.put("github_url", base.getGitUrl() );
        return publicData;

    }
}
