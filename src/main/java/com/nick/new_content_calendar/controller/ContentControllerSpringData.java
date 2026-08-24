//package com.nick.new_content_calendar.controller;
//
//import com.nick.new_content_calendar.model.Content;
//import com.nick.new_content_calendar.repository.ContentCollectionRepositorySpringData;
//import jakarta.validation.Valid;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.server.ResponseStatusException;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/content")
//@CrossOrigin
//
//public class ContentControllerSpringData {
//
//    private final ContentCollectionRepositorySpringData repository;
//
//    @Autowired
//    public ContentControllerSpringData(ContentCollectionRepositorySpringData repository) {
//        this.repository = repository;
//    }
//
//    @GetMapping("")
//    public List<Content> findAll() {
//        return repository.findAll();
//
//    }
//
//    @GetMapping("/{id}")
//    public Content findById(@PathVariable Integer id){
//        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found"));
//    }
//
//    @ResponseStatus(HttpStatus.CREATED)
//    @PostMapping("")
//    public void create(@Valid @RequestBody Content content){
//        repository.save(content);
//    }
//
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    @PutMapping("/{id}")
//    public void update(@RequestBody Content content, @PathVariable Integer id) {
//        if(!repository.existsById(id)){
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found");
//        }
//        repository.save(content);
//    }
//
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    @DeleteMapping("/{id}")
//    public void deleteById(@PathVariable Integer id){
//        repository.delete(id);
//    }
//
//
//}
