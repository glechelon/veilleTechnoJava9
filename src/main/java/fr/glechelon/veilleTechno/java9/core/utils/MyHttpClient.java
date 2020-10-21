package fr.glechelon.veilleTechno.java9.core.utils;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MyHttpClient {

    public String call() throws IOException, InterruptedException {
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create("http://google.com")).GET().build();
        return HttpClient.newBuilder().build().send(httpRequest, HttpResponse.BodyHandlers.ofString()).body();
    }
}
