package org.softlang.megal.browsing.visualization.server;

import org.softlang.megal.mi2.KB;

public class MegamodelProvider {

	private Megamodel megamodel;

	protected Megamodel getMegamodel() {
		return megamodel;
	}

	protected void setMegamodel(KB megamodel) {
		this.megamodel = Megamodel.from(megamodel);
	}
	
}
