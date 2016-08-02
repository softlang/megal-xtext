package org.softlang.megal.plugins.prelude;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.KB;
import org.softlang.megal.plugins.api.GuidedReasonerPlugin;

/**
 * 
 * Infers the elementOf-Language declaration for bound entities
 * 
 * @author maxmeffert
 *
 */
public class FileExtensionLanguageReasoner extends GuidedReasonerPlugin {
	
	static final private String ANNOTATIONNAME = "FileExtensions";
	
	@Override
	protected void guidedDerive(Entity entity) {
		
		when(entity.getType().getName().toLowerCase().equals("file")
				&& entity.hasBinding());
		
		try {
			
			File file = new File(artifactOf(entity).getLocation());
			
			KB kb = entity.getKB();
			
			List<Entity> languages = kb.getEntities().stream()
					.filter(e -> e.getType().getName().toLowerCase().equals("language"))
					.collect(Collectors.toList());
			
			
			
			for (Entity language : languages) {
				
//				System.err.println(language.getAnnotations());
				
				if (language.hasAnnotation(ANNOTATIONNAME)) {
					
					Set<String> extensions = Arrays.asList(language.getAnnotation(ANNOTATIONNAME).split(",")).stream()
							.map( s -> s.trim().toLowerCase() )
							.collect(Collectors.toSet());
					
//					System.err.println(extensions);
					
					for (String extension : extensions) {
						
						if (file.getAbsolutePath().endsWith(extension)) {
							
							relationship(entity.getName(), language.getName(), "elementOf");
							
						}
						
					}
					
				}
				
			}
			
			
			
		}
		catch (Throwable e) {
			
			e.printStackTrace();
			
		}
		
	}

}
