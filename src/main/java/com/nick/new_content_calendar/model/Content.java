package com.nick.new_content_calendar.model;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import java.time.LocalDateTime;

public record Content (
        @Id
        Integer id,
        @NotBlank
        String title,
        String desc,
        Status status,
        Type contentType,
        @Column("DATE_CREATED")
        LocalDateTime dateCreated,
        @Column("DATE_UPDATED")
        LocalDateTime dateUpdated,
        String url
){}
