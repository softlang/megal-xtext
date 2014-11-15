package org.softlang.megal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.softlang.megal.fragmentprovider.Evaluator;

public class MegalPlugin implements BundleActivator {
	private static Evaluator evaluator;

	public static Evaluator getEvaluator() {
		return evaluator;
	}

	@Override
	public void start(BundleContext context) throws Exception {
		evaluator = new Evaluator();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
	}

}
