package org.example.model;

import java.time.LocalDateTime;

public class ResultTest {

    private int id;
    private Account account;
    private int numberQuestion;
    private int correctAnswer;
    private int wrongAnswer;
    private LocalDateTime testDate;
    private Type type;

    public ResultTest(int id, Account account, int numberQuestion, int correctAnswer, int wrongAnswer, LocalDateTime testDate, Type type) {
        this.id = id;
        this.account = account;
        this.numberQuestion = numberQuestion;
        this.correctAnswer = correctAnswer;
        this.wrongAnswer = wrongAnswer;
        this.testDate = testDate;
        this.type = type;
    }

    public ResultTest() {
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public int getNumberQuestion() {
        return numberQuestion;
    }

    public void setNumberQuestion(int numberQuestion) {
        this.numberQuestion = numberQuestion;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public int getWrongAnswer() {
        return wrongAnswer;
    }

    public void setWrongAnswer(int wrongAnswer) {
        this.wrongAnswer = wrongAnswer;
    }

    public LocalDateTime getTestDate() {
        return testDate;
    }

    public void setTestDate(LocalDateTime testDate) {
        this.testDate = testDate;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
