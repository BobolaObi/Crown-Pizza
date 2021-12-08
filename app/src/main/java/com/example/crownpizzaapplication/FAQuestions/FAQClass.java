package com.example.crownpizzaapplication.FAQuestions;

/**
 * The type Faq class.
 */
public class FAQClass {

    private String questions;
    private String answer;

    /**
     * Instantiates a new Faq class.
     *
     * @param questions the questions
     * @param answer    the answer
     */
    public FAQClass(String questions, String answer) {
        this.questions = questions;
        this.answer = answer;
    }

    /**
     * Gets questions.
     *
     * @return the questions
     */
    public String getQuestions() {
        return questions;
    }

    /**
     * Sets questions.
     *
     * @param questions the questions
     */
    public void setQuestions(String questions) {
        this.questions = questions;
    }

    /**
     * Gets answer.
     *
     * @return the answer
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * Sets answer.
     *
     * @param answer the answer
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
