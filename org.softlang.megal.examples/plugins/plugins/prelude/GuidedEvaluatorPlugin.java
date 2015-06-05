package plugins.prelude;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.EntityType;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.RelationshipType;
import org.softlang.megal.mi2.api.Artifact;

import com.google.common.base.Throwables;

import static com.google.common.collect.Lists.*;

public abstract class GuidedEvaluatorPlugin extends InjectedEvaluatorPlugin {
	private static enum Level {
		NOT_RESPONSIBLE, WARNING, ERROR
	}

	private static class ExitException extends RuntimeException {
		private static final long serialVersionUID = -2849721969483884329L;

		private final Level level;

		public ExitException(Level level) {
			this.level = level;
		}

		public Level getLevel() {
			return level;
		}
	}

	private final List<Closeable> closables;

	public GuidedEvaluatorPlugin() {
		closables = newArrayList();
	}

	protected void when(boolean condition) {
		if (!condition)
			throw new ExitException(Level.NOT_RESPONSIBLE);
	}

	protected Object bindingOf(Entity entity) {
		if (!entity.hasBinding())
			throw new ExitException(Level.ERROR);

		return entity.getBinding();
	}

	protected Artifact artifactOf(Entity entity) {
		if (!entity.hasBinding())
			throw new ExitException(Level.NOT_RESPONSIBLE);

		Artifact artifact = getArtifact(entity.getBinding());

		if (artifact == null)
			throw new ExitException(Level.NOT_RESPONSIBLE);

		return artifact;
	}

	protected List<Artifact> artifactsOf(Entity entity) {
		if (!entity.hasBinding())
			throw new ExitException(Level.NOT_RESPONSIBLE);

		return getArtifacts(entity.getBinding());
	}

	protected InputStream bytesFor(Artifact artifact) throws IOException {
		InputStream stream = artifact.getBytes().openStream();
		closables.add(stream);
		return stream;
	}

	protected Reader charsFor(Artifact artifact) throws IOException {
		Reader stream = artifact.getChars().openStream();
		closables.add(stream);
		return stream;
	}

	@Override
	protected final void evaluate(EntityType entityType) {
		try {
			guidedEvaluate(entityType);
			closeAll();
		} catch (ExitException e) {
			handleGuideException(e);
		} catch (Throwable e) {
			warning(Throwables.getStackTraceAsString(e));
		}
	}

	@Override
	protected final void evaluate(RelationshipType relationshipType) {
		try {
			guidedEvaluate(relationshipType);
			closeAll();
		} catch (ExitException e) {
			handleGuideException(e);
		} catch (Throwable e) {
			warning(Throwables.getStackTraceAsString(e));
		}
	}

	@Override
	protected final void evaluate(Entity entity) {
		try {
			guidedEvaluate(entity);
			closeAll();
		} catch (ExitException e) {
			handleGuideException(e);
		} catch (Throwable e) {
			warning(Throwables.getStackTraceAsString(e));
		}
	}

	@Override
	protected final void evaluate(Relationship relationship) {
		try {
			guidedEvaluate(relationship);
			closeAll();
		} catch (ExitException e) {
			handleGuideException(e);
		} catch (Throwable e) {
			warning(Throwables.getStackTraceAsString(e));
		}
	}

	private void closeAll() throws IOException {
		for (Closeable c : closables)
			c.close();
		closables.clear();
	}

	private void handleGuideException(ExitException e) {
		switch (e.getLevel()) {
		case NOT_RESPONSIBLE:
			break;
		case WARNING:
			warning(e.getMessage());
			break;
		case ERROR:
			error(e.getMessage());
			break;
		}
	}

	protected void guidedEvaluate(EntityType entityType) throws Throwable {
	}

	protected void guidedEvaluate(RelationshipType relationshipType)
			throws Throwable {
	}

	protected void guidedEvaluate(Entity entity) throws Throwable {
	}

	protected void guidedEvaluate(Relationship relationship) throws Throwable {
	}
}
