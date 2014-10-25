package org.softlang.megal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class MegalPlugin implements BundleActivator {

	private static MegalPlugin instance;

	public static MegalPlugin getDefault() {
		return instance;
	}

	@Override
	public void start(BundleContext context) throws Exception {
		instance = this;

		MegalPackage.eINSTANCE
				.setEFactoryInstance(new MegalFactoryExecutable());
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		instance = null;
	}
}
