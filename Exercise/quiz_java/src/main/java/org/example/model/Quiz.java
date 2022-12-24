package org.example.model;

import java.util.List;

public class Quiz {
    private int id;
    private String question;
    private List<Answers> answers;
    private String explain;

    private Type type;

    public Quiz(int id, String question, List<Answers> answers, String explain, Type type) {
        this.id = id;
        this.question = question;
        this.answers = answers;
        this.explain = explain;
        this.type = type;
    }

    public Quiz() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answers> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answers> answers) {
        this.answers = answers;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
