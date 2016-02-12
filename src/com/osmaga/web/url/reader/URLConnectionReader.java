package com.osmaga.web.url.reader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Clase para leer el texto html de una URL
 *
 */
public class URLConnectionReader {

	public static void main(String[] args) throws Exception {
		try {
			URL url = null;
			if(args.length > 0) {
				url = new URL(args[0]);
			} else {
				url = new URL("http://www.example.com");
			}
	        
	        URLConnection yc = url.openConnection();
	        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
	        String inputLine;
	        while ((inputLine = in.readLine()) != null) 
	            System.out.println(inputLine);
	        in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
    }

}
