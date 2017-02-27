package org.softlang.megal.browsing.visualization.server;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;
import org.softlang.megal.mi2.KB;

public class HttpServer implements Runnable {

	static public void main(String[] args) {
		
		new Thread(new HttpServer()).start();
		
//		new HttpServer().run();
	}
	
	
	
	private int port = 9999;
	
	private Server server;
	
	private MegamodelProvider megamodelProvider;
	
	public HttpServer() {

	    server = new Server(port);
	    
	    megamodelProvider = new MegamodelProvider();
	    
		ResourceConfig resourceConfig = new ResourceConfig()
		.register(TestWebService.class)
		.register(new AbstractBinder() {

			@Override
			protected void configure() {
				bindFactory(new MegamodelProviderFactory(megamodelProvider)).to(MegamodelProvider.class);
			}
			
		});
		
		ServletContainer servletContainer = new ServletContainer(resourceConfig);
		
		ServletHolder servletHolder = new ServletHolder(servletContainer);
		
		ServletContextHandler restContextHandler = new ServletContextHandler(server, "/rest", ServletContextHandler.NO_SESSIONS);
		restContextHandler.addServlet(servletHolder, "/*");
		
		
		ResourceHandler resourceHandler = new ResourceHandler();
	    resourceHandler.setDirectoriesListed(true);
	    resourceHandler.setWelcomeFiles(new String[]{ "index.html" });
	    
	    System.out.println(getClass().getClassLoader().getResource("./server"));
	    
//	    resourceHandler.setBaseResource(Resource.newResource(getClass().getClassLoader().getResource("./server")));
	    
	    resourceHandler.setResourceBase("/home/darjeeling/Documents/uni/megal-xtext/org.softlang.megal.browsing/server");
	    
	    ContextHandler staticContextHandler = new ContextHandler("/");
	    staticContextHandler.setHandler(resourceHandler);
	    
	    
	    HandlerList handlers = new HandlerList();
	    handlers.setHandlers(new Handler[] {  
	    		restContextHandler,
	    		staticContextHandler, 
//	    		new DefaultHandler()
	    		});
	    
	    
	    server.setHandler(handlers);
	    
	   
	}
	
	public void setMegamodel(KB megamodel) {
		megamodelProvider.setMegamodel(megamodel);
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
//			server.destroy();
			e1.printStackTrace();
		} catch (Exception e1) {
//			server.destroy();
			e1.printStackTrace();
		} 
		
	}

}
