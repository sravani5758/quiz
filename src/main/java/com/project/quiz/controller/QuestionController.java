package com.project.quiz.controller;


import com.project.quiz.model.Question;
import com.project.quiz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GetMapping("/allQuestions")
    @Cacheable
    public ResponseEntity<List<Question>> getAllQuestion(){
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    @Cacheable
    public ResponseEntity<List<Question>> getQuestionByCategory(@PathVariable String category){

        return questionService.getQuestionsByCategory(category);

    }
    @PostMapping("/add")
    @Cacheable
    public ResponseEntity<String> addQuestion(@RequestBody Question question){

        questionService.addQuestion(question);
        return questionService.addQuestion(question);

    }


}
