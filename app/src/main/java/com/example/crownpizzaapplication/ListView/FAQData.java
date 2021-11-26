package com.example.crownpizzaapplication.ListView;

public class FAQData {

    //This class holds all the properties for the Frequently asked questions Fragment
    //Create Private Properties unique to the class

    private String question;
    private String answer;


    /**
     * Create a constructor
     * @param question
     * @param answer
     */
    public FAQData(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }


    //Generate Getters and Setters for the properties

    /**
     *
     * @return
     */
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
