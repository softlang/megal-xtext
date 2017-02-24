package org.softlang.megal.browsing.visualization.server;

import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.util.resource.Resource;

public class HttpServer implements Runnable {

	private int port = 8089;
	
	private Server server;
	
	public HttpServer() {
		server = new Server(port);
		
		ResourceHandler resource_handler = new ResourceHandler();
	    resource_handler.setDirectoriesListed(true);
	    resource_handler.setWelcomeFiles(new String[]{ "index.html" });

	    resource_handler.setBaseResource(Resource.newResource(getClass().getClassLoader().getResource("./server")));
	    	    
	    
	    HandlerList handlers = new HandlerList();
	    handlers.setHandlers(new Handler[] { resource_handler, new DefaultHandler() });
	    server.setHandler(handlers);
	}
	
	public String getAddress() {
		return "http://localhost:" + port;
	}
	
	@Override
	public void run() {
		
		try {
			server.start();
			server.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		
	}

}
