package com.nick.new_content_calendar.config;

import com.nick.new_content_calendar.model.Content;
import com.nick.new_content_calendar.repository.ContentRepositorySpringData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    private final ContentRepositorySpringData repository;
    private final ObjectMapper objectMapper;

    public DataLoader(ContentRepositorySpringData repository, ObjectMapper objectMapper) {
        this.repository = repository;
        this.objectMapper = objectMapper;
    }

    @Override
    public void run(String... args) throws Exception {
        if (repository.count() == 0) {
            try (InputStream inputStream = DataLoader.class.getResourceAsStream("/data/content.json")) {
                repository.saveAll(objectMapper.readValue(inputStream, new TypeReference<List<Content>>() {
                }));
            }
        }
    }
}
