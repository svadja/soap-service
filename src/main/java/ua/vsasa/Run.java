package ua.vsasa;

import javax.xml.ws.Endpoint;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:8888/ws/server", new ProcessWSImpl());
	}

}
