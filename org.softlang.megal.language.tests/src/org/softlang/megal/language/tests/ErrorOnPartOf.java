package org.softlang.megal.language.tests;

import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.mmp.Context;
import org.softlang.megal.mi2.mmp.Plugin;
import org.softlang.megal.mi2.mmp.data.Message;

public class ErrorOnPartOf extends Plugin {
	@Override
	public KB evaluate(Context context, Relationship relationship) {
		context.emit(Message.error("I plain and simply don't like " + relationship));
		return super.evaluate(context, relationship);
	}
}
