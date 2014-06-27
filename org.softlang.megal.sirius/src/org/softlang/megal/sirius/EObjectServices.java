package org.softlang.megal.sirius;

import org.eclipse.xtext.util.Arrays;
import org.softlang.megal.megaL.Annotation;
import org.softlang.megal.megaL.ED;
import org.softlang.megal.megaL.ETD;
import org.softlang.megal.megaL.RD;
import org.softlang.megal.megaL.UseETD;
import org.softlang.megal.megaL.UseETDRef;
import org.softlang.megal.megaL.UseEntity;

public class EObjectServices
{
	//TODO: Add method getting all accessible types and add type diagram.

	private static final String COLOR = "color";

	private static final String STYLE = "style";

	private static final String STYLE_DEFAULT = "solid";

	private static final String[] STYLES = new String[] { "solid", "dash", "dot", "dash_dot" };

	private static final Integer COLOR_ENTITY_RED = 230;

	private static final Integer COLOR_ENTITY_GREEN = 230;

	private static final Integer COLOR_ENTITY_BLUE = 250;

	private static final Integer COLOR_DEFAULT_RED = 253;

	private static final Integer COLOR_DEFAULT_GREEN = 245;

	private static final Integer COLOR_DEFAULT_BLUE = 230;

	/**
	 * Get the line style of the relation. Called by sirius vsm.
	 * 
	 * @param rd
	 *            self
	 * @return line style
	 */
	public String getLineStyle(RD rd)
	{
		for (Annotation ann : rd.getRel().getAnnotations())
		{
			if (STYLE.equals(ann.getKey()) && Arrays.contains(STYLES, ann.getValue())) return ann.getValue();
		}

		return STYLE_DEFAULT;
	}

	/**
	 * Get the type name of entity definition. Called by vsm.
	 * 
	 * @param ed
	 * @return
	 */
	public String getTypeName(ED ed)
	{
		UseETD type = ed.getType();

		if (type instanceof UseEntity) return "Entity";

		return ((UseETDRef) type).getRef().getName();
	}

	/**
	 * Get color for entities.
	 * 
	 */
	public Integer getEntityRed(ED ed)
	{
		UseETD type = ed.getType();

		if (type instanceof UseEntity) return COLOR_ENTITY_RED;

		ETD etd = ((UseETDRef) type).getRef();

		for (Annotation ann : etd.getAnnotations())
		{
			if (COLOR.equals(ann.getKey()))
			{
				String[] components = ann.getValue().split(",");

				if (components.length != 3) break;

				int i = Integer.valueOf(components[0]);

				if (i < 0 || i > 255) break;

				return i;
			}
		}

		return COLOR_DEFAULT_RED;
	}

	public Integer getEntityGreen(ED ed)
	{
		UseETD type = ed.getType();

		if (type instanceof UseEntity) return COLOR_ENTITY_GREEN;

		ETD etd = ((UseETDRef) type).getRef();

		for (Annotation ann : etd.getAnnotations())
		{
			if (COLOR.equals(ann.getKey()))
			{
				String[] components = ann.getValue().split(",");

				if (components.length != 3) break;

				int i = Integer.valueOf(components[1]);

				if (i < 0 || i > 255) break;

				return i;
			}
		}

		return COLOR_DEFAULT_GREEN;
	}

	public Integer getEntityBlue(ED ed)
	{
		UseETD type = ed.getType();

		if (type instanceof UseEntity) return COLOR_ENTITY_BLUE;

		ETD etd = ((UseETDRef) type).getRef();

		for (Annotation ann : etd.getAnnotations())
		{
			if (COLOR.equals(ann.getKey()))
			{
				String[] components = ann.getValue().split(",");

				if (components.length != 3) break;

				int i = Integer.valueOf(components[2]);

				if (i < 0 || i > 255) break;

				return i;
			}
		}

		return COLOR_DEFAULT_BLUE;
	}
}
