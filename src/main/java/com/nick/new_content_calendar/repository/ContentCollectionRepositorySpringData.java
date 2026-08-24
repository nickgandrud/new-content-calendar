package com.nick.new_content_calendar.repository;

import com.nick.new_content_calendar.model.Content;
import com.nick.new_content_calendar.model.Status;
import com.nick.new_content_calendar.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepositorySpringData {

    private final List<Content> contentList = new ArrayList<>();

    public ContentCollectionRepositorySpringData(){
    }

    public List <Content> findAll(){
        return contentList;

    }
    public Optional<Content> findById(Integer id){
        return contentList.stream().filter(c -> c.id().equals(id)).findFirst();
    }



    public void save (Content content){
        contentList.removeIf(c -> c.id().equals(content.id()));
        contentList.add(content);
    }

    public boolean existsById(Integer id){
        return contentList.stream().filter(c -> c.id().equals(id)).count() == 1;
    }

    public void delete(Integer id){
        contentList.removeIf(c -> c.id().equals(id));
    }

    @PostConstruct
    private void init(){
        Content content = new Content(1,
                "test",
                "test",
                Status.IDEA,
                Type.VIDEO,
                LocalDateTime.now(),
                null,
                "");

        contentList.add(content);
    }


}
