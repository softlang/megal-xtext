package org.softlang.megal.mi2;

public abstract class AbstractKB implements KB {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + getAnnotations().hashCode();
		result = prime * result + getTheEntityTypeAnnotations().hashCode();
		result = prime * result + getBindings().hashCode();
		result = prime * result + getEntities().hashCode();
		result = prime * result + getEntityAnnotations().hashCode();
		result = prime * result + getEntityTypeAnnotations().hashCode();
		result = prime * result + getEntityTypes().hashCode();
		result = prime * result + getRelationshipAnnotations().hashCode();
		result = prime * result + getRelationshipTypeAnnotations().hashCode();
		result = prime * result + getRelationshipTypes().hashCode();
		result = prime * result + getRelationships().hashCode();
		result = prime * result + (getTitle() == null ? 0 : getTitle().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KB other = (KB) obj;
		if (!getAnnotations().equals(other.getAnnotations()))
			return false;
		if (!getTheEntityTypeAnnotations().equals(other.getTheEntityTypeAnnotations()))
			return false;
		if (!getBindings().equals(other.getBindings()))
			return false;
		if (!getEntities().equals(other.getEntities()))
			return false;
		if (!getEntityAnnotations().equals(other.getEntityAnnotations()))
			return false;
		if (!getEntityTypeAnnotations().equals(other.getEntityTypeAnnotations()))
			return false;
		if (!getEntityTypes().equals(other.getEntityTypes()))
			return false;
		if (!getRelationshipAnnotations().equals(other.getRelationshipAnnotations()))
			return false;
		if (!getRelationshipTypeAnnotations().equals(other.getRelationshipTypeAnnotations()))
			return false;
		if (!getRelationshipTypes().equals(other.getRelationshipTypes()))
			return false;
		if (!getRelationships().equals(other.getRelationships()))
			return false;
		if (getTitle() == null) {
			if (other.getTitle() != null)
				return false;
		} else if (!getTitle().equals(other.getTitle()))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "KB " + getTitle() + " [relationships=" + getRelationships() + ", relationshipTypes="
				+ getRelationshipTypes() + ", relationshipTypeAnnotations=" + getRelationshipTypeAnnotations()
				+ ", relationshipAnnotations=" + getRelationshipAnnotations() + ", entityTypes=" + getEntityTypes()
				+ ", entityTypeAnnotations=" + getEntityTypeAnnotations() + ", entityAnnotations="
				+ getEntityAnnotations() + ", entities=" + getEntities() + ", bindings=" + getBindings()
				+ ", annotations=" + getAnnotations() + ", theEntityTypeAnnotations" + getTheEntityTypeAnnotations()
				+ "]";
	}
}
