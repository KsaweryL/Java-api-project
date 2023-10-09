//package com.example.javaeehelloworld;
//
//import java.net.URI;
//import java.net.http.HttpRequest;
//
//import jakarta.servlet.annotation.*;
//import org.json.*;      //add it to the build path (ctrl+alt+shift+s, Project Settings|Modules|dependencies)
//
//
//@WebServlet(name = "APIResponse", value = "/APIResponse")
//public class APIResponse {
//
//    //to fix -> why doesn't it read CreatingDirectory?
//    //creating new directory
//    CreatingDirectory creatingDirectory = new CreatingDirectory();
//        creatingDirectory.CreatingNewLocalDirectory("Responses");
//
//    HttpRequest request = HttpRequest.newBuilder()
//            .uri(URI.create("https://youtube-search-and-download.p.rapidapi.com/video?id=dQw4w9WgXcQ"))
//            .header("X-RapidAPI-Key", "2081e20ac7mshec47cad1af00b3ap110b04jsn7bc5cf430508")
//            .header("X-RapidAPI-Host", "youtube-search-and-download.p.rapidapi.com")
//            .method("GET", HttpRequest.BodyPublishers.noBody())
//            .build();
//
//    //getting the response
//    ResponseHandler responseHandler = new ResponseHandler();
//    String responseString = responseHandler.getResponse(request);
//
//        System.out.println(responseString);
//
//    //converting json string to json object
//    JSONObject jsonObject = Cookie.toJSONObject(responseString);
//
//
//}
