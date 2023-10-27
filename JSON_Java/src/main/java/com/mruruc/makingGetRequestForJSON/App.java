package com.mruruc.makingGetRequestForJSON;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpClient client=HttpClient.newHttpClient();

        URI uri=new URI("https://jsonplaceholder.typicode.com/posts");

        HttpRequest request= HttpRequest.newBuilder()
                .uri(uri)
                .GET()
                .setHeader("accept","application/Json")
                .build();

        HttpResponse<String> response=
                client.send(request, HttpResponse.BodyHandlers.ofString());

        File file=new File("src/main/resources/test.json");
        FileWriter write =new FileWriter(file);
        //write.write(response.body());
        ObjectMapper mapper=new ObjectMapper();

        File fileTxt=new File("src/main/resources/test.txt");
        Post[] posts= mapper.readValue(response.body(), Post[].class);
        write.write(Arrays.toString(posts));

        write.close();

    }
}
