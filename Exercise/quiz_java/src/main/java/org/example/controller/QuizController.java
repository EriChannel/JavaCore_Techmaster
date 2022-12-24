package org.example.controller;

import org.example.exception.InputData;
import org.example.model.*;
import org.example.repository.AccountRepository;
import org.example.service.QuizServiceImpl;
import org.example.service.ResultServiceImpl;
import org.example.util.Menu;

import java.util.*;

public class QuizController {

    QuizServiceImpl quizService;
    ResultServiceImpl resultService;

    public QuizController() {
        quizService = new QuizServiceImpl();
        resultService = new ResultServiceImpl();
    }

    public void quizAction(){
        boolean isContinue = true;
        while (isContinue){
            Menu.chooseQuizTypeMenu();
            int option = InputData.inputOption();
            switch (option){
                case 1:
                    //Dễ
                    startQuiz(Type.EASY);
                    break;
                case 2:
                    //Trung bình
                    startQuiz(Type.MEDIUM);
                    break;
                case 3:
                    //Khó
                    startQuiz(Type.HARD);
                    break;
                case 0:
                    isContinue = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    private void startQuiz(Type type) {
        System.out.println("---BẮT ĐẦU---");
        List<Quiz> listQuizzes = quizService.getQuizByType(type);

        Collections.shuffle(listQuizzes);

        //Bắt đầu trắc nghiệm và trả về kết quả
        Map<Integer, Boolean> result = getQuizResult(listQuizzes);
        //Lưu kết quả vào database
        ResultTest resultTest = createResultTest(result, type);
        resultService.addNewResult(resultTest);
        printResult(result);
    }

    private void printResult(Map<Integer, Boolean> result) {
        int correctAnswer = 0;
        for(Map.Entry<Integer, Boolean> entry: result.entrySet()){
            if(entry.getValue()){
                correctAnswer++;
            }
        }
        System.out.println("Hoàn thành bài kiểm tra, kết quả của bạn là: ");
        System.out.println("Tổng số câu hỏi: " + result.size());
        System.out.println("Số đáp án đúng: " + correctAnswer);
        System.out.println("Số đáp án sai: " + (result.size() - correctAnswer));
    }


    private ResultTest createResultTest(Map<Integer, Boolean> result, Type type) {
        int correctAnswer = 0;
        for(Map.Entry<Integer, Boolean> entry: result.entrySet()){
            if(entry.getValue()){
                correctAnswer++;
            }
        }
        ResultTest resultTest = new ResultTest();
        resultTest.setAccount(AccountRepository.loginAccount);
        resultTest.setNumberQuestion(result.size());
        resultTest.setCorrectAnswer(correctAnswer);
        resultTest.setType(type);

        return resultTest;
    }

    private Map<Integer, Boolean> getQuizResult(List<Quiz> listQuizzes) {
        Map<Integer, Boolean> result = new LinkedHashMap<>();
        int question = 10;
        for(int i = 0; i < question; i++){
            System.out.println("CÂU SỐ " + (i+1));
            Quiz quiz = listQuizzes.get(i);
            int answer = showQuizAndReturnAnswer(quiz);
            System.out.println("Chọn đáp án: ");
            int option = InputData.inputAnswer(quiz);
            if(option == answer){
                System.out.println("Bạn đã trả lời đúng");
                result.put((i+1), true);
            }else{
                System.out.println("Rất tiếc bạn đã trả lời sai");
                result.put((i+1), false);
            }
            System.out.println(quiz.getExplain());
            System.out.println("--------------------------------");
        }
        return result;
    }

    private int showQuizAndReturnAnswer(Quiz quiz) {
        System.out.println("Câu hỏi: " + quiz.getQuestion());
        List<Answers> answers = quiz.getAnswers();
        Collections.shuffle(answers);

        int trueAnswer = 0;
        for(int i = 0; i < answers.size(); i++) {
            System.out.println((i+1) + ". " + answers.get(i).getAnswer());
            if(answers.get(i).isTrue()){
                trueAnswer = i+1;
            }
        }
        return trueAnswer;
    }
}
