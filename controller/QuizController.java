package org.example.controller;

import org.example.model.QuizModel;
import org.example.view.QuizView;

public class QuizController {
    private QuizModel model;
    private QuizView view;
    private int score = 0;

    public QuizController(QuizModel model, QuizView view) {
        this.model = model;
        this.view = view;
    }

    public void startQuiz() {
        int totalQuestions = model.getTotalQuestions();

        for (int i = 0; i < totalQuestions; i++) {
            view.displayQuestion(model.getQuestion(i), model.getOptions(i));
            char userAnswer = view.getUserAnswer();
            if (userAnswer == model.getCorrectAnswer(i)) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Incorrect! The correct answer was: " + model.getCorrectAnswer(i) + "\n");
            }
        }

        view.displayScore(score, totalQuestions);
    }
}
