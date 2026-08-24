package com.nick.new_content_calendar.controller;

import com.nick.new_content_calendar.config.ContentCalendarProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {

    private final ContentCalendarProperties contentCalendarProperties;

    public HomeController(ContentCalendarProperties contentCalendarProperties) {
        this.contentCalendarProperties = contentCalendarProperties;
    }

    @Value("${cc.welcomeMessage: Default Welcome Message}")
    private String welcomeMessage;

    @Value("${cc.about}")
    private String about;

    @GetMapping("/")
    public ContentCalendarProperties home(){
        return contentCalendarProperties;
    }
}
