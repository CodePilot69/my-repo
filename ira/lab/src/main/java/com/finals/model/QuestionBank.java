package com.finals.model;

import java.io.File;
import java.io.FileReader;
import java.util.List;

import com.google.gson.Gson;

public class QuestionBank {

    List<MultipleChoice> questions;

    public static QuestionBank load(String filename) throws Exception {
        Gson gson = new Gson();

        File file = new File(filename);

        if (!file.exists()) {
            String jarDir = QuestionBank.class
                    .getProtectionDomain()
                    .getCodeSource()
                    .getLocation()
                    .toURI()
                    .getPath();
            file = new File(new File(jarDir).getParent(), filename);
        }

        return gson.fromJson(new FileReader(file), QuestionBank.class);
    }

    public List<MultipleChoice> getQuestions() {
        return questions;
    }
}
