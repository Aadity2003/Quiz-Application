package org.example.view;

import java.util.Scanner;

public class QuizView {
    private Scanner scanner = new Scanner(System.in);

    public void displayQuestion(String question, String[] options) {
        System.out.println(question);
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Enter your answer (A/B/C): ");
    }

    public char getUserAnswer() {
        return scanner.next().toUpperCase().charAt(0);
    }

    public void displayScore(int score, int totalQuestions) {
        System.out.println("\nQuiz Completed!");
        System.out.println("Your Score: " + score + " / " + totalQuestions);
    }
}
