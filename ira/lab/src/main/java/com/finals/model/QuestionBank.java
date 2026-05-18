package com.finals.model;

import com.google.gson.*;
import java.io.FileReader;
import java.util.List;

class QuestionBank {
    List<MultipleChoice> questions;

    public static QuestionBank load(String filename) throws Exception {
        Gson gson = new Gson();
        return gson.fromJson(new FileReader(filename), QuestionBank.class);
    }

    public List<MultipleChoice> getQuestions() {
        return questions;
    }
}
