package org.example.service;

import org.example.model.Quiz;
import org.example.model.Type;

import java.util.List;

public interface QuizService {
    List<Quiz> getQuizByType(Type type);
}
