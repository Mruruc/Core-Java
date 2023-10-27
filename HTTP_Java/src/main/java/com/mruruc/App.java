package com.mruruc;

import javax.swing.text.html.HTML;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class App {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

        HttpClient client= HttpClient.newHttpClient();

        URI uri=new URI("http://ufm.vizja.pl/");

        HttpRequest request= HttpRequest
                .newBuilder(uri)
                .GET()
                .header("accept","text/html")
                .build();
        HttpResponse<String> response;

        response=client.send(request,BodyHandlers.ofString());

        System.out.println(response.body().toString());


    }
}
