#!/bin/bash

java -Xmx500M -cp "/usr/local/lib/antlr-4.5-complete.jar:$CLASSPATH" org.antlr.v4.Tool Dber.g4 -package psyco.dber.parser.dber.lex
javac Dber*.java
cd ~/workspace/github/dber/src/main/java
java org.antlr.v4.runtime.misc.TestRig  psyco.dber.parser.dber.lex.Dber sentence -gui input
#java org.antlr.v4.runtime.misc.TestRig  psyco.dber.parser.dber.lex.Dber value -gui simple