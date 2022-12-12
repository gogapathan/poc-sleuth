package com.poc;

import java.io.IOException;
import java.util.Scanner;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.cookie.BasicClientCookie;

public class TestMain {

	public static void main(String[] args) throws ClientProtocolException, IOException {

		BasicCookieStore cookieStore = new BasicCookieStore();
	    BasicClientCookie cookie = new BasicClientCookie("sampleCookie", "1234");
	    cookie.setDomain(".localhost");
	    cookie.setPath("/");
	    cookieStore.addCookie(cookie);
	    HttpClient client = HttpClientBuilder.create().setDefaultCookieStore(cookieStore).build();

	    final HttpGet request = new HttpGet("http://localhost:8082/firstservice/");

	    HttpResponse httpresponse = client.execute(request);	
	    
	    Scanner sc = new Scanner(httpresponse.getEntity().getContent());

	      //Printing the status line
	      System.out.println(httpresponse.getStatusLine());
	      while(sc.hasNext()) {
	         System.out.println(sc.nextLine());
	      }
		
	}

}
