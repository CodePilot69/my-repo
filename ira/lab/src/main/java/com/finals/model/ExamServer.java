package com.finals.model;
import java.net.ServerSocket;
import java.net.Socket;

public class ExamServer {
    public static void main(String[] args) throws Exception {
        QuestionBank bank = QuestionBank.load("questions.json");
        ServerSocket server = new ServerSocket(5000);
        System.out.println("Exam server started...");

        while (true) {
            Socket client = server.accept();
            new Thread(new ClientHandler(client, bank)).start();
        }
    }
}
