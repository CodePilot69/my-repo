package com.finals.model;

import java.net.ServerSocket;
import java.net.Socket;

public class ExamServer {

    public static void main(String[] args) throws Exception {
        QuestionBank bank = QuestionBank.load("questions.json");
        ServerSocket server = new ServerSocket(6767);
        System.out.println("Exam server started on port 6767");

        while (true) {
            Socket client = server.accept();
            System.out.println("New Students connected: " + client.getInetAddress());
            new Thread(new ClientHandler(client, bank)).start();
        }
    }
}
