package org.softlang.megal.plugins.prelude;

import java.io.File;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.plugins.api.GuidedReasonerPlugin;

/**
 * Adds contents of a folder to the model, bound to their respective location
 * 
 * @author maxmeffert
 *
 */
public class FolderReasoner extends GuidedReasonerPlugin {
	
	
	@Override
	protected void guidedDerive(Entity entity) {
		
		File folder = new File("");
		
		when(entity.getType().getName().toLowerCase().equals("folder")
				&& entity.hasBinding()
				&& (folder = new File(artifactOf(entity).getLocation())).isDirectory());
		
		try {
			
			List<File> elements = Arrays.asList(folder.listFiles());
					
			for (File element : elements) {
				
				String name = entity.getName() + "." + element.getName().replace(".", "_");
				String type = element.isDirectory() ? "Folder" : "File";
				
				entity(name, type);
				binding(name, new URI("file:"+element.getAbsolutePath()));
				
			}
			
		} catch (Throwable e) {
			
			e.printStackTrace();
			
		}
		
	}

}
