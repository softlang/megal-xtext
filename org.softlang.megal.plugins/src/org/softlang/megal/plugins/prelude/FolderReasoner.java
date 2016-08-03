package org.softlang.megal.plugins.prelude;

import java.io.File;
import java.net.URI;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.plugins.api.GuidedReasonerPlugin;
import org.softlang.megal.plugins.util.Prelude;

/**
 * Adds contents of a folder to the model, bound to their respective location
 * 
 * @author maxmeffert
 *
 */
public class FolderReasoner extends GuidedReasonerPlugin {
	
	@Override
	protected void guidedDerive(Entity entity) {
		
		when(Prelude.isFolder(entity)
				&& entity.hasBinding()
				&& artifactOf(entity).toFile().isDirectory());
		
		try {
								
			for (File element : artifactOf(entity).toFile().listFiles()) {
				
				String name = entity.getName() + "." + element.getName().replace(".", "_");
				String type = element.isDirectory() ? Prelude.FOLDER : Prelude.FILE;
				
				entity(name, type);
				binding(name, new URI("file:"+element.getAbsolutePath()));
				
			}
			
		} catch (Throwable e) {
			
			e.printStackTrace();
			
		}
		
	}

}
