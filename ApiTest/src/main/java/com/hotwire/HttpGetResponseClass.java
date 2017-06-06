package com.hotwire;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class HttpGetResponseClass {

	public static void getHttpGetResponse(String url){
		
		try {

    		DefaultHttpClient httpClient = new DefaultHttpClient();
    		HttpGet getRequest = new HttpGet(url);
    		getRequest.addHeader("accept", "application/json");

    		HttpResponse response = httpClient.execute(getRequest);

    		if (response.getStatusLine().getStatusCode() != 200) {
    			throw new RuntimeException("Failed : HTTP error code : "
    			   + response.getStatusLine().getStatusCode());
    		}

    		BufferedReader br = new BufferedReader(
                             new InputStreamReader((response.getEntity().getContent())));

    		String output;
    		System.out.println("\n\nOutput from Http Api .... ");
    		System.out.println("_________________________ \n");
    		System.out.println("URL: "+url+"\n");
    		while ((output = br.readLine()) != null) {
    			System.out.println(output);
    		}

    		httpClient.getConnectionManager().shutdown();

    	  } catch (ClientProtocolException e) {

    		e.printStackTrace();

    	  } catch (IOException e) {

    		e.printStackTrace();
    	 }
		
	}
}
