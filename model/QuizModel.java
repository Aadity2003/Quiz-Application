package org.example.model;

public class QuizModel {
    private String[] questions = {
            "What is the capital of France?",
            "Which language is used for Android development?",
            "What is 5 + 3?",
            "Who developed Java?"
    };

    private String[][] options = {
            { "A) Paris", "B) London", "C) Berlin" },
            { "A) Python", "B) Java", "C) C++" },
            { "A) 6", "B) 8", "C) 10" },
            { "A) Microsoft", "B) Sun Microsystems", "C) Google" }
    };

    private char[] correctAnswers = { 'A', 'B', 'B', 'B' };

    public String getQuestion(int index) {
        return questions[index];
    }

    public String[] getOptions(int index) {
        return options[index];
    }

    public char getCorrectAnswer(int index) {
        return correctAnswers[index];
    }

    public int getTotalQuestions() {
        return questions.length;
    }
}
