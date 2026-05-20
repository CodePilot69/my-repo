package com.finals.model;

public class Student {

    private String name;
    private int score = 0;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int points) {
        score += points;
    }
}
