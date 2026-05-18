package com.finals.model;

abstract class Question {
    String text;
    int points;

    public Question(String text, int points) {
        this.text = text;
        this.points = points;
    }

    public abstract boolean checkAnswer(String answer);
    public String getText() { return text; }
    public int getPoints() { return points; }
}


