package com.nick.new_content_calendar.repository;

import com.nick.new_content_calendar.model.Content;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface ContentRepositorySpringData extends ListCrudRepository<Content,Integer> {

    List<Content> findAllByTitleContains(String keyword);
}
