package com.finals.model;
class Student {
    private String name;
    private double score = 0;

    public Student(String name) { this.name = name; }
    public String getName() { return name; }
    public double getScore() { return score; }
    public void addScore(double points) { score += points; }
}
