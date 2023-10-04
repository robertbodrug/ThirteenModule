package org.example.Tasks;

import com.google.gson.Gson;

import java.io.*;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;


public class UsersService {
    private static final String CLIENT_URL = "https://jsonplaceholder.typicode.com/users/";

    private static HttpResponse<String> push(HttpRequest request) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        return client.send(request, HttpResponse.BodyHandlers.ofString());
    }

    //First Task
    //First Task
    //First Task
    public static String post(File file) throws Exception {


        HttpRequest request =  HttpRequest.newBuilder(new URI(CLIENT_URL))
                .POST(HttpRequest.BodyPublishers.ofFile(file.toPath()))
                .build();
        return push(request).body();
    }
    public static String put(File file, Long id) throws Exception {
        HttpRequest request =  HttpRequest.newBuilder(new URI(CLIENT_URL+id))
                .PUT(HttpRequest.BodyPublishers.ofFile(file.toPath()))
                .build();
       return push(request).body();
    }
    public static String delete(Long id) throws Exception {
        HttpRequest request =  HttpRequest.newBuilder(new URI(CLIENT_URL+id))
                .DELETE()
                .build();
        return push(request).toString();
    }
    public static String getAll() throws Exception {
        HttpRequest request =  HttpRequest.newBuilder(new URI(CLIENT_URL))
                .GET()
                .build();
        return push(request).body();
    }
    //https://jsonplaceholder.typicode.com/users?username=%7Busername%7D
    public static String getByID(Long id) throws Exception {
        HttpRequest request =  HttpRequest.newBuilder(new URI(CLIENT_URL+id))
                .GET()
                .build();
        return push(request).body();
    }

    public static String getByUsername(String username) throws Exception {
        HttpRequest request =  HttpRequest.newBuilder(new URI(CLIENT_URL+"?username="+username))
                .GET()
                .build();
        return push(request).body();
    }
    //SecondTask
    //SecondTask
    //SecondTask

    public static String getCommentsByID(Long id) throws Exception {
        Gson gson = new Gson();
        HttpRequest request =  HttpRequest.newBuilder(new URI(CLIENT_URL+id+"/posts"))
                .GET()
                .build();


       UsersPost[] posts = gson.fromJson( push(request).body(), UsersPost[].class);
Long lastId =posts[posts.length-1].id;
        HttpRequest requestComments =  HttpRequest
                .newBuilder(new URI("https://jsonplaceholder.typicode.com/posts/"+ lastId +"/comments"))
                .GET()
                .build();

        String comments=push(requestComments).body();
        OutputStream os = new FileOutputStream("C:\\Users\\agrte\\IdeaProjects\\ThirteenModule\\src\\main\\java\\org\\example\\Tasks\\Comments\\user-"+id+"-post-"+lastId+"-comments.json");
        os.write(comments.getBytes(StandardCharsets.UTF_8));
        os.close();

        return comments;
    }

}
