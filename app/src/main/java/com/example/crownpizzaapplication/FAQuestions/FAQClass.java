package com.example.crownpizzaapplication.FAQuestions;

public class FAQClass {

    private String questions;
    private String answer;

    /**
     * @param questions
     * @param answer
     */
    public FAQClass(String questions, String answer) {
        this.questions = questions;
        this.answer = answer;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
