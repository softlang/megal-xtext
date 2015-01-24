package org.softlang.megal;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.softlang.megal.fragmentprovider.Evaluator;
import org.softlang.sourcesupport.SourceSupportPlugin;

public class MegalPlugin implements BundleActivator {
	public static final String PLUGIN_ID = "org.softlang.megal";

	private static Evaluator evaluator;
	private static ILog log;

	public static Evaluator getEvaluator() {
		return evaluator;
	}

	public static ILog getLog() {
		return log;
	}

	public static void log(int severity, String message) {
		getLog().log(new Status(severity, PLUGIN_ID, message));
	}

	public static void log(int severity, String message, int code) {
		getLog().log(new Status(severity, PLUGIN_ID, code, message, null));
	}

	public static void log(int severity, String message, Throwable throwable) {
		getLog().log(new Status(severity, PLUGIN_ID, message, throwable));
	}

	public static void log(int severity, String message, int code, Throwable throwable) {
		getLog().log(new Status(severity, PLUGIN_ID, code, message, throwable));
	}

	@Override
	public void start(BundleContext context) throws Exception {
		evaluator = new Evaluator();
		log = Platform.getLog(context.getBundle());

		SourceSupportPlugin.getSupport();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
	}

}
