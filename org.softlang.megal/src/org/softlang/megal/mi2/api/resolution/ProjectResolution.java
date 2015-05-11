package org.softlang.megal.mi2.api.resolution;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Iterables.getFirst;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.softlang.megal.MegalPlugin;
import org.softlang.megal.mi2.api.Artifact;
import org.softlang.sourcesupport.SourceSupport;
import org.softlang.sourcesupport.SourceSupportPlugin;

import com.google.common.base.Objects;

import static com.google.common.collect.FluentIterable.*;
import static com.google.common.collect.Lists.*;
import static java.util.Collections.*;

public abstract class ProjectResolution extends AbstractResolution {

	protected abstract IProject getProject();

	@Override
	public SourceSupport getSourceSupport() {
		return SourceSupportPlugin.getSupport().analyze(getProject());
	}

	private Iterable<IResource> unbind(Object object) {
		// If object is an URI
		if (object instanceof URI)
			return filter(MegalPlugin.getEvaluator().evaluate((URI) object), IResource.class);

		// If object is a string
		if (object instanceof String) {
			String string = (String) object;
			try {
				return unbind(new URI(string));
			} catch (URISyntaxException e) {
				// Convert to file
				File file = new File(string);

				try {
					// Get project workspace URI
					URI projectURI = new URI("workspace:/" + getProject().getName() + "/");
					// Get workspace relative file URI
					URI rootRelativeURI = getProject().getLocationURI().relativize(file.toURI());

					// Unbind the composite
					return unbind(projectURI.resolve(rootRelativeURI));
				} catch (URISyntaxException f) {
					return emptyList();
				}
			}
		}

		return emptyList();
	}

	@Override
	public List<Artifact> getArtifacts(Object binding) {
		return from(unbind(binding)).transform(EclipseArtifacts::toArtifact).toList();
	}
}
