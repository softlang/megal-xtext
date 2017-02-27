package org.softlang.megal.browsing.visualization.server;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.util.resource.Resource;
import org.glassfish.hk2.api.Factory;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.hk2.utilities.general.ThreadSpecificObject;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ResourceFinder;
import org.glassfish.jersey.server.internal.scanning.PackageNamesScanner;
import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.softlang.megal.browsing.visualization.server.servlets.TestWebService;

import com.google.common.collect.ImmutableSet;
import com.google.common.reflect.ClassPath;
import com.google.common.reflect.ClassPath.ClassInfo;

public class HttpServer implements Runnable {

	static public void main(String[] args) {
		
		new Thread(new HttpServer()).start();
		
//		new HttpServer().run();
	}
	
	public static class MegamodelProvider {
		
	}
	
	private static class MegamodelProviderFactory implements Factory<MegamodelProvider> {

		@Override
		public void dispose(MegamodelProvider arg0) {
		}

		@Override
		public MegamodelProvider provide() {
			return new MegamodelProvider();
		}
		
	}
	
	private int port = 9999;
	
	private Server server;
	
	public HttpServer() {
		
//		String[] packages = {"org.softlang.megal.browsing.visualization.server.servlets"};
//		
//		ResourceFinder finder = new PackageNamesScanner(getClass().getClassLoader(),packages, true);
//		
//		System.err.println("found stuff:");
//		while (finder.hasNext()) {
//			System.err.println(finder.next());
//		}
//		
//		ImmutableSet<ClassInfo> classes;
//		try {
//			classes = ClassPath.from(getClass().getClassLoader()).getTopLevelClasses("org.softlang.megal.browsing.visualization.server.servlets");
//			for (ClassInfo ci : classes) {
//				System.err.println(ci.getName());
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
//		System.err.println(TestWebService.class.getPackage());

	    server = new Server(port);
	    
	    
		ResourceConfig resourceConfig = new ResourceConfig()
//		.packages("org.softlang.megal.browsing.visualization.server.servlets")
		.register(TestWebService.class)
		.register(new AbstractBinder() {

			@Override
			protected void configure() {
				
				bindFactory(MegamodelProviderFactory.class).to(MegamodelProvider.class);
				
				
			}
			
		});
		
		ServletContainer servletContainer = new ServletContainer(resourceConfig);
		
		
		
		ServletHolder servletHolder = new ServletHolder(servletContainer);
		
//		.setInitParameter("jersey.config.server.provider.packages", "org.softlang.megal.browsing.visualization.server.servlets");
		
//		ServletHolder sh = new ServletHolder();    
//		sh.setInitParameter("com.sun.jersey.config.property.resourceConfigClass", "com.sun.jersey.api.core.PackagesResourceConfig");
//		//Set the package where the services reside
//		sh.setInitParameter("com.sun.jersey.config.property.packages", "org.softlang.megal.browsing.visualization.server.servlets");
//		sh.setInitParameter("com.sun.jersey.api.json.POJOMappingFeature", "true");
		
		
		
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
