package org.example.service;

import org.example.model.Quiz;
import org.example.model.Type;
import org.example.repository.QuizRepository;

import java.util.List;
import java.util.stream.Collectors;

public class QuizServiceImpl implements QuizService {

    @Override
    public List<Quiz> getQuizByType(Type type){
        return QuizRepository.listQuiz.stream()
                .filter(q -> q.getType() == type)
                .collect(Collectors.toList());
    }
}
