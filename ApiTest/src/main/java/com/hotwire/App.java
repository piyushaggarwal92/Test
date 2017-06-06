package com.hotwire;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	for(String url: args){
    		if(url.startsWith("https")){
    			HttpsResponseClass.getHttpsResponse(url);
    		}
    		else{
    			HttpGetResponseClass.getHttpGetResponse(url);
    		}
    	}
    }
}
