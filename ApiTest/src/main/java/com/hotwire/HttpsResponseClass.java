package com.hotwire;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class HttpsResponseClass {

	public static void getHttpsResponse(String url) throws Exception{
	
		String httpsURL = url;
	    URL myurl = new URL(httpsURL);
	    HttpsURLConnection con = (HttpsURLConnection)myurl.openConnection();
	    InputStream ins = con.getInputStream();
	    InputStreamReader isr = new InputStreamReader(ins);
	    BufferedReader in = new BufferedReader(isr);

	    String inputLine;
	    
	    System.out.println("\n\nOutput from Http Api .... ");
		System.out.println("_________________________ \n");
		System.out.println("URL: "+url+"\n");
	    while ((inputLine = in.readLine()) != null)
	    {
	      System.out.println(inputLine);
	    }

	    in.close();

	}
	
}
