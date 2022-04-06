package com.company;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static final String NEW_LINE = "\r\n";

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(80);
        Socket socket = serverSocket.accept();
        Scanner scanner = new Scanner(socket.getInputStream());

        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());

        OutputStream outputStream = socket.getOutputStream();
        OutputStreamWriter writer = new OutputStreamWriter(outputStream);

        HttpResponseBuilder httpResponseBuilder = new HttpResponseBuilder();
                .setProtocol(HttpResponseBuilder.HTTP_VERSION_1_1)
                .setStatusCode(200)
                .setBody("asdasdawdasffwa")
                        .addHeaderParam(HttpResponseBuilder.HEADER_CONTENT_TYPE, HttpResponseBuilder.MIME_TYPE_HTML);

        writer.write("asdawdayffjfuzfuibjrerrhfifigurjejdifjjfg");
        writer.flush();
    }
}
