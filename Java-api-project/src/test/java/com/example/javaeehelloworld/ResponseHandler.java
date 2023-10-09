package com.example.javaeehelloworld;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ResponseHandler {

    public String getResponse(HttpRequest request){

        HttpResponse<String> response;
        String responseString = "";
        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

            HttpResponse<Path> responseFile = HttpClient.newHttpClient().send(request, BodyHandlers.ofFile(Paths.get("Responses/Response.html")));
            responseString = response.body();
        }
        catch(Exception e){
            System.out.println(e);
        }
        return responseString;
    }
}
