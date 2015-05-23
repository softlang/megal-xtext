package org.softlang.megal.mi2.api;

import static com.google.common.collect.Sets.newHashSet;

import java.util.Set;

import org.softlang.megal.mi2.Entity;

public interface Plugin {
	Set<Plugin> getParts();

	Set<Entity> getRealization();

}