# ANTLR4 Based Fragmentation API

This package provides classes for ANTLR4 based code fragmentation reasoner plugins.

## ParseTreeFragment
An FragmentationPlugin.Fragment implementation which adapts ANTLR4 parser rule contexts (ParserRuleContext). 

## ParseTreeFragmentationRule
A strategy class for fragmentation rules.

## ParseTreeFragmentationListener
An ANTLR4 parse tree listener for rule based (ParseTreeFragmentationRule) fragment collection.