package com.finals.model;
import java.util.List;

class MultipleChoice extends Question {
    List<String> options;
    String correctAnswer;

    public MultipleChoice(String text, int points, List<String> options, String correctAnswer) {
        super(text, points);
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    @Override
    public boolean checkAnswer(String answer) {
        return answer.equalsIgnoreCase(correctAnswer);
    }

    public List<String> getOptions() { return options; }
}
