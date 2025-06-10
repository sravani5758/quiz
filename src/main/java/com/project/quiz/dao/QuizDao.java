package com.project.quiz.dao;


import com.project.quiz.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;



public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
