package clientservice;

import java.io.*;
import java.util.Scanner;

import XmlBuilder.ObjectXmlTransformer;
import org.apache.http.client.ClientProtocolException;

public class PoliceClient {

    Scanner in;


    public static void main(String[] args) throws ClientProtocolException, IOException {
        PoliceClient pc = new PoliceClient();
        pc.run();
    }

    public void run() {
        //final String uri = "http://localhost:8000/test";
        final String test = "http://10.0.0.8:8000/test";
        final String home = "http://10.0.0.8:8000/home";
        File xml;
        /*in = new Scanner(System.in);
        String messageToServer;

        System.out.println("POST ЗАПРОС TEST:");
        messageToServer = in.nextLine();
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForEntity(test, messageToServer, String.class);*/

        System.out.println("GET ЗАПРОС HOME:");
        RequestBuilder rb = new RequestBuilder();
        System.out.println(rb.makeGetRequest(home));

        ObjectXmlTransformer to = new ObjectXmlTransformer();
        /*Citizen citizen = (Citizen) to.xmlToObject(rb.makeGetRequest(home), Citizen.class);
        System.out.println(citizen.getName());
        System.out.println(citizen.getSurname());
        System.out.println(citizen.getAge());*/

        //System.out.println(rb.makePostRequest(test, "Hi, bro!! It's me!!!"));
    }
}
