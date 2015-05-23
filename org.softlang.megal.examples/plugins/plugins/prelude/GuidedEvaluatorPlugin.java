package plugins.prelude;

import java.io.IOException;
import java.util.List;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.EntityType;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.RelationshipType;
import org.softlang.megal.mi2.api.Artifact;

import com.google.common.base.Throwables;

public abstract class GuidedEvaluatorPlugin extends InjectedEvaluatorPlugin {
	private static enum GuideLevel {
		NOT_RESPONSIBLE, WARNING, ERROR
	}

	private static class GuideException extends RuntimeException {
		private static final long serialVersionUID = -2849721969483884329L;

		private final GuideLevel level;

		public GuideException(GuideLevel level) {
			this.level = level;
		}

		public GuideException(String message, GuideLevel level) {
			super(message);
			this.level = level;
		}

		public GuideLevel getLevel() {
			return level;
		}
	}

	protected final void with(boolean condition) {
		if (!condition)
			throw new GuideException(GuideLevel.NOT_RESPONSIBLE);
	}

	protected final void require(boolean condition) {
		if (!condition)
			throw new GuideException(GuideLevel.NOT_RESPONSIBLE);
	}

	protected final Object withBound(Entity entity) {
		if (!entity.hasBinding())
			throw new GuideException(GuideLevel.ERROR);

		return entity.getBinding();
	}

	protected final Object requireBound(Entity entity) {
		if (!entity.hasBinding())
			throw new GuideException("Binding of entity " + entity
					+ " is required.", GuideLevel.ERROR);

		return entity.getBinding();
	}

	protected final Artifact withArtifact(Entity entity) {
		if (!entity.hasBinding())
			throw new GuideException(GuideLevel.NOT_RESPONSIBLE);

		Artifact artifact = getArtifact(entity.getBinding());

		if (artifact == null)
			throw new GuideException(GuideLevel.NOT_RESPONSIBLE);

		return artifact;
	}

	protected final Artifact requireArtifact(Entity entity) {
		if (!entity.hasBinding())
			throw new GuideException("Binding of entity " + entity
					+ " is required.", GuideLevel.ERROR);

		Artifact artifact = getArtifact(entity.getBinding());

		if (artifact == null)
			throw new GuideException("Binding of entity " + entity
					+ " is not resolvable to an artifact.", GuideLevel.ERROR);

		return artifact;
	}

	protected final List<Artifact> withArtifacts(Entity entity) {
		if (!entity.hasBinding())
			throw new GuideException(GuideLevel.NOT_RESPONSIBLE);

		return getArtifacts(entity.getBinding());
	}

	protected final List<Artifact> requireArtifacts(Entity entity) {
		if (!entity.hasBinding())
			throw new GuideException("Binding of entity " + entity
					+ " is required.", GuideLevel.ERROR);

		return getArtifacts(entity.getBinding());
	}

	@Override
	protected final void evaluate(EntityType entityType) {
		try {
			guidedEvaluate(entityType);
		} catch (GuideException e) {
			handleGuideException(e);
		} catch (IOException e) {
			warning(Throwables.getStackTraceAsString(e));
		}
	}

	@Override
	protected final void evaluate(RelationshipType relationshipType) {
		try {
			guidedEvaluate(relationshipType);
		} catch (GuideException e) {
			handleGuideException(e);
		} catch (IOException e) {
			warning(Throwables.getStackTraceAsString(e));
		}
	}

	@Override
	protected final void evaluate(Entity entity) {
		try {
			guidedEvaluate(entity);
		} catch (GuideException e) {
			handleGuideException(e);
		} catch (IOException e) {
			warning(Throwables.getStackTraceAsString(e));
		}
	}

	@Override
	protected final void evaluate(Relationship relationship) {
		try {
			guidedEvaluate(relationship);
		} catch (GuideException e) {
			handleGuideException(e);
		} catch (IOException e) {
			warning(Throwables.getStackTraceAsString(e));
		}
	}

	private void handleGuideException(GuideException e) {
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

	protected void guidedEvaluate(EntityType entityType) throws IOException {
	}

	protected void guidedEvaluate(RelationshipType relationshipType)
			throws IOException {
	}

	protected void guidedEvaluate(Entity entity) throws IOException {
	}

	protected void guidedEvaluate(Relationship relationship) throws IOException {
	}
}
