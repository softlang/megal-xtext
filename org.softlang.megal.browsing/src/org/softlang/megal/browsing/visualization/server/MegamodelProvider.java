package org.softlang.megal.browsing.visualization.server;

import org.softlang.megal.mi2.KB;

public class MegamodelProvider {

	private KB megamodel;

	protected KB getMegamodel() {
		return megamodel;
	}

	protected void setMegamodel(KB megamodel) {
		this.megamodel = megamodel;
	}
	
}
