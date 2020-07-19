/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.pizug.cpi.mappingtest;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.xmlunit.builder.DiffBuilder;
import org.xmlunit.builder.Input;
import org.xmlunit.diff.Diff;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        System.out.println(new App().getGreeting());

        Diff d = DiffBuilder.compare(Input.fromFile("testdata/input.xml")).withTest(Input.fromFile("testdata/expected.xml"))
                .ignoreWhitespace().ignoreComments().build();

        System.out.println(d.hasDifferences() + " - " + d.getDifferences().toString());

        HttpRequest request = HttpRequest.newBuilder().uri(new URI("https://postman-echo.com/post"))
                .headers("Content-Type", "text/plain;charset=UTF-8")
                .POST(HttpRequest.BodyPublishers.ofString("HELLO from service")).build();

        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
