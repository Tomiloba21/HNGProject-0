package dev.lobzter.hngproject0.Base;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component
public class Base {

    @Value("${spring.email.address}")
    private String emailAddress;


    @Value("${spring.github.url}")
    private String gitUrl;

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getGitUrl() {
        return gitUrl;
    }
}
