package com.finals.model;
import java.io.*;
import java.net.Socket;

class ClientHandler implements Runnable {
    private Socket socket;
    private Student student;
    private QuestionBank bank;

    public ClientHandler(Socket socket, QuestionBank bank) {
        this.socket = socket;
        this.bank = bank;
    }

    @Override
    public void run() {
        try (
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true)
        ) {
            out.println("Enter your name:");
            String name = in.readLine();
            student = new Student(name);

            for (Question q : bank.getQuestions()) {
                MultipleChoice mcq = (MultipleChoice) q;
                out.println("Q: " + mcq.getText());
                for (String opt : mcq.getOptions()) out.println(" - " + opt);

                out.println("Your answer:");
                String ans = in.readLine();
                if (mcq.checkAnswer(ans)) student.addScore(mcq.getPoints());
            }

            out.println("Exam finished. Your score: " + student.getScore());
            socket.close();

            System.out.println("Student " + student.getName() + " scored " + student.getScore());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
