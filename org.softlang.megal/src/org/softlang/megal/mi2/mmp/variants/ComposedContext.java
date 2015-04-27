package org.softlang.megal.mi2.mmp.variants;

import org.softlang.megal.mi2.mmp.Context;
import org.softlang.megal.mi2.mmp.Emission;
import org.softlang.megal.mi2.mmp.Input;
import org.softlang.megal.mi2.mmp.Resolution;
import org.softlang.megal.mi2.mmp.data.Message;
import org.softlang.megal.mi2.reasoning.Reasoner;
import org.softlang.sourcesupport.SourceSupport;

import com.google.common.io.ByteSource;
import com.google.common.io.CharSource;

public final class ComposedContext implements Context {
	private final Input inputDelegate;

	private final Resolution resolutionDelegate;

	private final Emission emissionDelegate;

	public ComposedContext(Input inputDelegate, Resolution resolutionDelegate, Emission emissionDelegate) {
		this.inputDelegate = inputDelegate;
		this.resolutionDelegate = resolutionDelegate;
		this.emissionDelegate = emissionDelegate;
	}

	@Override
	public void emit(Message message) {
		emissionDelegate.emit(message);
	}

	@Override
	public SourceSupport getSourceSupport() {
		return resolutionDelegate.getSourceSupport();
	}

	@Override
	public <T> Class<? extends T> getClass(Object object, Class<T> deriving) {
		return resolutionDelegate.getClass(object, deriving);
	}

	@Override
	public CharSource getChars(Object object) {
		return resolutionDelegate.getChars(object);
	}

	@Override
	public ByteSource getBytes(Object object) {
		return resolutionDelegate.getBytes(object);
	}

	@Override
	public Reasoner getReasoner() {
		return inputDelegate.getReasoner();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + emissionDelegate.hashCode();
		result = prime * result + inputDelegate.hashCode();
		result = prime * result + resolutionDelegate.hashCode();
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
		ComposedContext other = (ComposedContext) obj;
		if (!emissionDelegate.equals(other.emissionDelegate))
			return false;
		if (!inputDelegate.equals(other.inputDelegate))
			return false;
		if (!resolutionDelegate.equals(other.resolutionDelegate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ComposedContext [inputDelegate=" + inputDelegate + ", resolutionDelegate=" + resolutionDelegate
				+ ", emissionDelegate=" + emissionDelegate + "]";
	}

}