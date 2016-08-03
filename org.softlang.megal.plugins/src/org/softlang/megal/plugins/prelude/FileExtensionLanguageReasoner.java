package org.softlang.megal.plugins.prelude;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.KB;
import org.softlang.megal.plugins.api.GuidedReasonerPlugin;
import org.softlang.megal.plugins.util.Prelude;


/**
 * 
 * Infers the elementOf-Language declaration for bound entities
 * 
 * @author maxmeffert
 *
 */
public class FileExtensionLanguageReasoner extends GuidedReasonerPlugin {
	
	static final private String ANNOTATION = "FileExtensions";
	
	static private Set<String> extensions (Entity language) {
		
		if (language.hasAnnotation(ANNOTATION)) {
			
			return Arrays.asList(language.getAnnotation(ANNOTATION).split(",")).stream()
					.map( s -> s.trim().toLowerCase() )
					.map( s -> s.startsWith(".") ? s : "." + s )
					.collect(Collectors.toSet());
			
		}
		
		return Collections.emptySet();
		
	}
	
	@Override
	protected void guidedDerive(Entity entity) {
		
		when(Prelude.isFile(entity) 
				&& entity.hasBinding()
				&& artifactOf(entity).toFile().isFile());
		
		try {
			
			File file = artifactOf(entity).toFile();
			
			KB kb = entity.getKB();
			
			List<Entity> languages = kb.getEntities().stream()
					.filter(Prelude::isLanguage)
					.collect(Collectors.toList());
			
			
			
			for (Entity language : languages) {
				
				for (String extension : extensions(language)) {
					
					if (file.getAbsolutePath().endsWith(extension)) {
						
						relationship(entity.getName(), language.getName(), "elementOf");
						
					}
					
				}
				
			}
			
			
			
		}
		catch (Throwable e) {
			
			e.printStackTrace();
			
		}
		
	}

}
