package org.example;

import org.example.controller.QuizController;
import org.example.model.QuizModel;
import org.example.view.QuizView;

public class Main {
    public static void main(String[] args) {
        QuizModel model = new QuizModel();
        QuizView view = new QuizView();
        QuizController controller = new QuizController(model, view);

        controller.startQuiz();
    }
}

