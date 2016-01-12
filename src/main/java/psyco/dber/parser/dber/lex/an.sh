#!/bin/bash

java -Xmx500M -cp "/usr/local/lib/antlr-4.5-complete.jar:$CLASSPATH" org.antlr.v4.Tool Dber.g4 -package psyco.dber.parser.dber.lex
javac Dber*.java
java org.antlr.v4.runtime.misc.TestRig  Dber sentence -gui input