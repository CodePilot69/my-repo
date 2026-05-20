package com.finals.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ExamClient {

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 6767);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
            if (line.endsWith(":")) {
                String ans = console.readLine();
                out.println(ans);
            }
        }
        socket.close();
    }
}
