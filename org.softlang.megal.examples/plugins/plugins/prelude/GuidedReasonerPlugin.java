package plugins.prelude;

import static com.google.common.collect.Lists.newArrayList;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.EntityType;
import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.KBs;
import org.softlang.megal.mi2.MutableKB;
import org.softlang.megal.mi2.Ref;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.RelationshipType;
import org.softlang.megal.mi2.api.Artifact;

import plugins.prelude.GuidedExitException.Level;

public abstract class GuidedReasonerPlugin extends InjectedReasonerPlugin {
	private final List<Closeable> closables;

	private MutableKB result;

	public GuidedReasonerPlugin() {
		closables = newArrayList();
	}

	// TODO: Loads of duplication because of problems with multiple aspects

	protected void when(boolean condition) {
		if (!condition)
			throw new GuidedExitException(Level.NOT_RESPONSIBLE);
	}

	protected Object bindingOf(Entity entity) {
		if (!entity.hasBinding())
			throw new GuidedExitException(Level.ERROR);

		return entity.getBinding();
	}

	protected Artifact artifactOf(Entity entity) {
		if (!entity.hasBinding())
			throw new GuidedExitException(Level.NOT_RESPONSIBLE);

		Artifact artifact = getArtifact(entity.getBinding());

		if (artifact == null)
			throw new GuidedExitException(Level.NOT_RESPONSIBLE);

		return artifact;
	}

	protected List<Artifact> artifactsOf(Entity entity) {
		if (!entity.hasBinding())
			throw new GuidedExitException(Level.NOT_RESPONSIBLE);

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

	private void closeAll() throws IOException {
		for (Closeable c : closables)
			c.close();
		closables.clear();
	}

	private void resetResult() {
		result = new MutableKB();
	}

	protected void title(String title) {
		result.setTitle(title);
	}

	protected void entityType(String type, String supertype) {
		result.getRawEntityTypes().put(type, supertype);
	}

	protected void relationshipType(Ref left, Ref right, String name) {
		result.getRawRelationshipTypes().put(left, right, name);
	}

	/**
	 * <p>
	 * Defaults multiplicity to single
	 * </p>
	 * 
	 * @param left
	 * @param right
	 * @param name
	 */
	protected void relationshipType(String left, String right, String name) {
		result.getRawRelationshipTypes().put(Ref.to(left, false),
				Ref.to(right, false), name);
	}

	protected void entity(String name, Ref type) {
		result.getRawEntities().put(name, type);
	}

	protected void entity(String name, String type) {
		result.getRawEntities().put(name, Ref.to(type, false));
	}

	protected void relationship(String left, String right,
			String relationshipType) {
		result.getRawRelationships().put(left, right, relationshipType);
	}

	protected void binding(String entity, Object binding) {
		result.getRawBindings().put(entity, binding);
	}

	@Override
	protected KB derive(EntityType entityType) {
		try {
			resetResult();
			guidedDerive(entityType);
			closeAll();
			return result;
		} catch (GuidedExitException e) {
			GuidedExitException.handleGuideException(this, e);
			return KBs.empty();
		} catch (Throwable e) {
			GuidedExitException.handleOtherException(this, e);
			return KBs.empty();
		}
	}

	@Override
	protected KB derive(RelationshipType relationshipType) {
		try {
			resetResult();
			guidedDerive(relationshipType);
			closeAll();
			return result;
		} catch (GuidedExitException e) {
			GuidedExitException.handleGuideException(this, e);
			return KBs.empty();
		} catch (Throwable e) {
			GuidedExitException.handleOtherException(this, e);
			return KBs.empty();
		}
	}

	@Override
	protected KB derive(Entity entity) {
		try {
			resetResult();
			guidedDerive(entity);
			closeAll();
			return result;
		} catch (GuidedExitException e) {
			GuidedExitException.handleGuideException(this, e);
			return KBs.empty();
		} catch (Throwable e) {
			GuidedExitException.handleOtherException(this, e);
			return KBs.empty();
		}
	}

	@Override
	protected KB derive(Relationship relationship) {
		try {
			resetResult();
			guidedDerive(relationship);
			closeAll();
			return result;
		} catch (GuidedExitException e) {
			GuidedExitException.handleGuideException(this, e);
			return KBs.empty();
		} catch (Throwable e) {
			GuidedExitException.handleOtherException(this, e);
			return KBs.empty();
		}
	}

	protected void guidedDerive(EntityType entityType) throws Throwable {
	}

	protected void guidedDerive(RelationshipType relationshipType)
			throws Throwable {
	}

	protected void guidedDerive(Entity entity) throws Throwable {
	}

	protected void guidedDerive(Relationship relationship) throws Throwable {
	}
}
