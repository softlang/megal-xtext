package org.softlang.megal.mi2.mmp.data;

import org.softlang.megal.mi2.Annotated;
import org.softlang.megal.mi2.mmp.Plugin;

public final class Application {
	private final Plugin plugin;

	private final Annotated parameter;

	private Application(Plugin plugin, Annotated parameter) {
		this.plugin = plugin;
		this.parameter = parameter;
	}

	public static Application of(Plugin plugin, Annotated parameter) {
		return new Application(plugin, parameter);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((parameter == null) ? 0 : parameter.hashCode());
		result = prime * result + ((plugin == null) ? 0 : plugin.hashCode());
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
		Application other = (Application) obj;
		if (parameter == null) {
			if (other.parameter != null)
				return false;
		} else if (!parameter.equals(other.parameter))
			return false;
		if (plugin == null) {
			if (other.plugin != null)
				return false;
		} else if (!plugin.equals(other.plugin))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return plugin + "(" + parameter + ")";
	}

}
