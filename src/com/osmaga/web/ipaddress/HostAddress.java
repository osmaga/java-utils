package com.osmaga.web.ipaddress;
 
import java.net.InetAddress;
import java.net.UnknownHostException;
 
public class HostAddress {

	public static void main(String[] args) {
		InetAddress ia;
		try {

			ia = InetAddress.getLocalHost();
			System.out.println("Current IP address : " + ia.getHostAddress());

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
