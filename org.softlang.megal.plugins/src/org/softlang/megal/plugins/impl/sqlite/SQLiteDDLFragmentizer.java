package org.softlang.megal.plugins.impl.sqlite;

import java.util.ArrayList;
import java.util.Collection;

import org.antlr.v4.runtime.ParserRuleContext;
import org.softlang.megal.plugins.api.antlr.ANTLRFragmentizerPlugin;
import org.softlang.megal.plugins.api.antlr.ANTLRParserFactory;
import org.softlang.megal.plugins.impl.sqlite.antlr.SQLiteLexer;
import org.softlang.megal.plugins.impl.sqlite.antlr.SQLiteParser;
import org.softlang.megal.plugins.impl.sqlite.antlr.SQLiteParserFactory;

public class SQLiteDDLFragmentizer extends ANTLRFragmentizerPlugin<SQLiteParser, SQLiteLexer> {

	@Override
	public Collection<FragmentationRule<? extends ParserRuleContext>> getRules() {
		
		Collection<FragmentationRule<? extends ParserRuleContext>> rules = new ArrayList<FragmentationRule<? extends ParserRuleContext>>();
		
		return rules;
		
	}
	

	@Override
	public ANTLRParserFactory<SQLiteParser, SQLiteLexer> getParserFactory() {
		return new SQLiteParserFactory();
	}

}
