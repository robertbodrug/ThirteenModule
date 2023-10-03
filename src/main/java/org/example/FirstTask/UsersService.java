package org.example.FirstTask;

import java.io.*;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.util.Arrays;

public class UsersService {
    private static final String CLIENT_URL = "https://jsonplaceholder.typicode.com/users";

    private static HttpResponse<String> push(HttpRequest request) throws IOException, InterruptedException {

        URL url = new URL(CLIENT_URL);
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());
        return response;
    }
    //Files.readAllBytes(file.toPath())
    public static String post(File file) throws Exception {


        HttpRequest request =  HttpRequest.newBuilder(new URI(CLIENT_URL))
                .POST(HttpRequest.BodyPublishers.ofFile(file.toPath()))
                .build();
        return push(request).body();
    }
    public static String put(File file) throws Exception {
        HttpRequest request =  HttpRequest.newBuilder(new URI(CLIENT_URL))
                .PUT(HttpRequest.BodyPublishers.ofFile(file.toPath()))
                .build();
       return push(request).toString();
    }
    public static String delete() throws Exception {
        HttpRequest request =  HttpRequest.newBuilder(new URI(CLIENT_URL))
                .DELETE()
                .build();
        return push(request).toString();
    }

}
