package org.example.model;

public class Answers {
    private String answer;
    private boolean isTrue;

    public Answers(String answer, boolean isTrue) {
        this.answer = answer;
        this.isTrue = isTrue;
    }

    public Answers() {
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isTrue() {
        return isTrue;
    }

    public void setTrue(boolean aTrue) {
        isTrue = aTrue;
    }
}
