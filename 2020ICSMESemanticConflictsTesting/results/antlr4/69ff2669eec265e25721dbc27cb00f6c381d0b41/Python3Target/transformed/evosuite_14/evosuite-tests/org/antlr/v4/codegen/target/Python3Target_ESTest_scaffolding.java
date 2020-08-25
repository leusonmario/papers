/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu May 28 07:53:48 GMT 2020
 */

package org.antlr.v4.codegen.target;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Python3Target_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 10000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.antlr.v4.codegen.target.Python3Target"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "BR"); 
    java.lang.System.setProperty("user.dir", "/server/study-execution/new-nimrod/nimrod-hunoroutput-test-dest/antlr4/69ff2669eec265e25721dbc27cb00f6c381d0b41/evosuite_24"); 
    java.lang.System.setProperty("user.home", "/server"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "author-name"); 
    java.lang.System.setProperty("user.timezone", "Europe/Stockholm"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Python3Target_ESTest_scaffolding.class.getClassLoader() ,
      "org.antlr.v4.codegen.BlankOutputModelFactory",
      "org.antlr.v4.codegen.model.CodeBlockForAlt",
      "org.antlr.v4.codegen.LexerFactory",
      "org.antlr.v4.tool.AttributeDict$DictType",
      "org.antlr.v4.codegen.model.ExceptionClause",
      "org.antlr.v4.codegen.model.MatchSet",
      "org.antlr.v4.runtime.misc.LogManager",
      "org.antlr.v4.codegen.model.LL1Loop",
      "org.antlr.v4.codegen.model.PlusBlock",
      "org.antlr.v4.codegen.model.MatchNotSet",
      "org.stringtemplate.v4.STGroup",
      "org.stringtemplate.v4.misc.AggregateModelAdaptor",
      "org.antlr.v4.codegen.model.decl.CodeBlock",
      "org.antlr.v4.codegen.model.OptionalBlock",
      "org.antlr.v4.tool.ast.GrammarRootAST",
      "org.antlr.v4.runtime.misc.IntSet",
      "org.stringtemplate.v4.misc.MultiMap",
      "org.stringtemplate.v4.misc.AmbiguousMatchException",
      "org.antlr.v4.tool.Rule",
      "org.antlr.v4.runtime.Recognizer",
      "org.stringtemplate.v4.misc.Aggregate",
      "org.antlr.v4.codegen.model.Loop",
      "org.stringtemplate.v4.misc.STCompiletimeMessage",
      "org.stringtemplate.v4.misc.STNoSuchPropertyException",
      "org.stringtemplate.v4.misc.MapModelAdaptor",
      "org.antlr.v4.codegen.OutputModelFactory",
      "org.antlr.runtime.TokenRewriteStream",
      "org.antlr.v4.tool.Alternative",
      "org.antlr.v4.codegen.model.LL1PlusBlockSingleAlt",
      "org.stringtemplate.v4.STGroupFile",
      "org.antlr.v4.codegen.model.OutputFile",
      "org.antlr.runtime.tree.CommonTree",
      "org.antlr.runtime.MismatchedNotSetException",
      "org.stringtemplate.v4.misc.ErrorBuffer",
      "org.antlr.v4.parse.ANTLRLexer$DFA34",
      "org.stringtemplate.v4.InstanceScope",
      "org.antlr.v4.tool.ast.RuleAST",
      "org.antlr.v4.parse.ANTLRLexer",
      "org.antlr.v4.tool.ErrorSeverity",
      "org.antlr.v4.codegen.model.StarBlock",
      "org.stringtemplate.v4.misc.TypeRegistry",
      "org.antlr.v4.codegen.model.decl.Decl",
      "org.antlr.v4.codegen.model.Recognizer",
      "org.stringtemplate.v4.compiler.CompiledST",
      "org.antlr.runtime.CharStream",
      "org.antlr.v4.codegen.model.decl.StructDecl",
      "org.stringtemplate.v4.StringRenderer",
      "org.antlr.v4.runtime.TokenSource",
      "org.antlr.v4.automata.ATNFactory",
      "org.antlr.v4.tool.ast.BlockAST",
      "org.stringtemplate.v4.NumberRenderer",
      "org.stringtemplate.v4.misc.STRuntimeMessage",
      "org.antlr.v4.runtime.Parser",
      "org.antlr.runtime.tree.TreeWizard",
      "org.antlr.runtime.Lexer",
      "org.antlr.v4.tool.Grammar$2",
      "org.antlr.v4.runtime.misc.Interval",
      "org.antlr.runtime.MissingTokenException",
      "org.antlr.v4.codegen.model.LL1AltBlock",
      "org.antlr.v4.codegen.model.LexerFile",
      "org.antlr.v4.runtime.TokenStream",
      "org.antlr.runtime.EarlyExitException",
      "org.antlr.v4.codegen.model.decl.TokenDecl",
      "org.antlr.runtime.TokenRewriteStream$RewriteOperation",
      "org.antlr.v4.Tool",
      "org.antlr.v4.codegen.Target",
      "org.antlr.v4.misc.Utils",
      "org.antlr.v4.tool.ErrorManager",
      "org.antlr.runtime.Token",
      "org.antlr.v4.codegen.model.MatchToken",
      "org.antlr.v4.tool.AttributeResolver",
      "org.antlr.v4.runtime.atn.SemanticContext$Predicate",
      "org.stringtemplate.v4.misc.ErrorManager$1",
      "org.antlr.v4.codegen.model.LeftRecursiveRuleFunction",
      "org.antlr.v4.codegen.ParserFactory",
      "org.stringtemplate.v4.misc.STLexerMessage",
      "org.antlr.v4.Tool$OptionArgType",
      "org.antlr.v4.codegen.model.Choice",
      "org.antlr.v4.runtime.tree.Tree",
      "org.antlr.v4.runtime.Vocabulary",
      "org.antlr.runtime.NoViableAltException",
      "org.antlr.runtime.RecognizerSharedState",
      "org.antlr.v4.codegen.model.SrcOp",
      "org.antlr.runtime.CommonTokenStream",
      "org.antlr.runtime.RuleReturnScope",
      "org.stringtemplate.v4.misc.STModelAdaptor",
      "org.antlr.runtime.ANTLRReaderStream",
      "org.antlr.v4.runtime.atn.SemanticContext$OR",
      "org.antlr.v4.tool.ast.ActionAST",
      "org.antlr.v4.tool.ErrorType",
      "org.antlr.v4.tool.GrammarSemanticsMessage",
      "org.stringtemplate.v4.STGroupDir",
      "org.antlr.v4.parse.ANTLRLexer$DFA2",
      "org.antlr.runtime.tree.TreeVisitorAction",
      "org.antlr.v4.runtime.atn.Transition",
      "org.antlr.v4.tool.Grammar",
      "org.antlr.v4.runtime.ParserInterpreter",
      "org.antlr.v4.codegen.model.Parser",
      "org.antlr.v4.tool.ast.GrammarASTVisitor",
      "org.antlr.v4.runtime.atn.SemanticContext$Operator",
      "org.antlr.v4.codegen.model.Lexer",
      "org.antlr.v4.runtime.atn.ATN",
      "org.antlr.v4.tool.ast.RuleElementAST",
      "org.antlr.v4.codegen.model.CodeBlockForOuterMostAlt",
      "org.antlr.v4.tool.DefaultToolListener",
      "org.stringtemplate.v4.compiler.STException",
      "org.antlr.v4.codegen.model.LL1OptionalBlockSingleAlt",
      "org.antlr.runtime.DFA",
      "org.antlr.v4.tool.ANTLRToolListener",
      "org.antlr.v4.runtime.tree.SyntaxTree",
      "org.antlr.v4.runtime.tree.RuleNode",
      "org.antlr.v4.codegen.model.LL1Choice",
      "org.antlr.runtime.MismatchedRangeException",
      "org.antlr.runtime.TokenRewriteStream$InsertBeforeOp",
      "org.antlr.v4.runtime.atn.ATNState",
      "org.stringtemplate.v4.misc.ObjectModelAdaptor",
      "org.antlr.v4.tool.LabelElementPair",
      "org.antlr.v4.tool.GrammarParserInterpreter",
      "org.antlr.v4.runtime.IntStream",
      "org.antlr.v4.runtime.LexerInterpreter",
      "org.antlr.runtime.UnwantedTokenException",
      "org.antlr.v4.Tool$Option",
      "org.antlr.runtime.ANTLRInputStream",
      "org.antlr.v4.tool.Attribute",
      "org.antlr.v4.codegen.model.decl.AltLabelStructDecl",
      "org.antlr.runtime.tree.TreeAdaptor",
      "org.antlr.v4.runtime.misc.MultiMap",
      "org.antlr.v4.runtime.tree.TerminalNode",
      "org.antlr.runtime.tree.TreeParser",
      "org.antlr.v4.runtime.atn.RuleStartState",
      "org.stringtemplate.v4.ST",
      "org.antlr.v4.codegen.model.LL1StarBlockSingleAlt",
      "org.antlr.v4.codegen.model.OutputModelObject",
      "org.antlr.v4.runtime.ParserRuleContext",
      "org.antlr.v4.runtime.tree.ErrorNode",
      "org.antlr.v4.codegen.model.LabeledOp",
      "org.antlr.runtime.ClassicToken",
      "org.antlr.runtime.tree.BaseTree",
      "org.antlr.runtime.TokenRewriteStream$ReplaceOp",
      "org.antlr.v4.misc.OrderedHashMap",
      "org.stringtemplate.v4.misc.STGroupCompiletimeMessage",
      "org.antlr.v4.codegen.model.RuleElement",
      "org.antlr.v4.runtime.RuleContext",
      "org.antlr.v4.runtime.CharStream",
      "org.antlr.runtime.BufferedTokenStream",
      "org.antlr.runtime.BitSet",
      "org.antlr.v4.runtime.tree.ParseTree",
      "org.antlr.v4.analysis.LeftRecursiveRuleAltInfo",
      "org.stringtemplate.v4.ModelAdaptor",
      "org.antlr.runtime.tree.TreeNodeStream",
      "org.stringtemplate.v4.STErrorListener",
      "org.antlr.v4.tool.ast.AltAST",
      "org.antlr.v4.tool.LexerGrammar",
      "org.stringtemplate.v4.misc.Misc",
      "org.antlr.v4.codegen.target.Python3Target",
      "org.antlr.v4.codegen.CodeGenerator",
      "org.antlr.v4.codegen.Target$1",
      "org.antlr.runtime.CommonToken",
      "org.antlr.v4.automata.LexerATNFactory",
      "org.antlr.v4.codegen.DefaultOutputModelFactory",
      "org.antlr.v4.runtime.dfa.DFA",
      "org.stringtemplate.v4.misc.ErrorType",
      "org.stringtemplate.v4.STWriter",
      "org.antlr.v4.codegen.target.Python3Target$PythonStringRenderer",
      "org.antlr.v4.codegen.OutputModelController",
      "org.stringtemplate.v4.misc.STMessage",
      "org.antlr.v4.runtime.atn.RuleTransition",
      "org.stringtemplate.v4.AttributeRenderer",
      "org.antlr.v4.tool.AttributeDict",
      "org.stringtemplate.v4.misc.ErrorManager",
      "org.antlr.v4.runtime.Lexer",
      "org.stringtemplate.v4.Interpreter",
      "org.antlr.runtime.RecognitionException",
      "org.antlr.v4.codegen.model.AltBlock",
      "org.antlr.v4.tool.ToolMessage",
      "org.antlr.v4.codegen.model.ParserFile",
      "org.antlr.v4.tool.LabelType",
      "org.antlr.v4.tool.GrammarSyntaxMessage",
      "org.antlr.v4.codegen.model.decl.AttributeDecl",
      "org.antlr.v4.codegen.model.AddToLabelList",
      "org.antlr.runtime.TokenSource",
      "org.antlr.v4.codegen.model.Action",
      "org.antlr.v4.tool.ast.GrammarASTWithOptions",
      "org.antlr.v4.codegen.model.decl.TokenListDecl",
      "org.antlr.v4.runtime.misc.OrderedHashSet",
      "org.antlr.v4.codegen.model.decl.RuleContextDecl",
      "org.antlr.v4.runtime.misc.IntervalSet",
      "org.antlr.runtime.FailedPredicateException",
      "org.antlr.runtime.TokenStream",
      "org.antlr.v4.parse.ANTLRParser$grammarSpec_return",
      "org.antlr.runtime.MismatchedTreeNodeException",
      "org.antlr.v4.runtime.misc.ParseCancellationException",
      "org.antlr.runtime.ParserRuleReturnScope",
      "org.antlr.v4.tool.ast.GrammarAST",
      "org.antlr.runtime.ANTLRStringStream",
      "org.antlr.runtime.IntStream",
      "org.antlr.v4.codegen.model.LL1OptionalBlock",
      "org.antlr.v4.runtime.atn.SemanticContext$AND",
      "org.antlr.v4.runtime.RuntimeMetaData",
      "org.antlr.v4.codegen.model.RuleFunction",
      "org.antlr.v4.automata.ParserATNFactory",
      "org.antlr.runtime.MismatchedSetException",
      "org.antlr.runtime.MismatchedTokenException",
      "org.stringtemplate.v4.misc.Interval",
      "org.antlr.v4.runtime.atn.SemanticContext",
      "org.antlr.v4.parse.v3TreeGrammarException",
      "org.antlr.v4.parse.GrammarTreeVisitor",
      "org.antlr.v4.tool.ANTLRMessage",
      "org.antlr.runtime.tree.Tree",
      "org.antlr.v4.tool.ast.PredAST",
      "org.antlr.runtime.BaseRecognizer",
      "org.antlr.v4.tool.LeftRecursionCyclesMessage"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Python3Target_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.antlr.v4.codegen.Target",
      "org.antlr.v4.codegen.target.Python3Target",
      "org.stringtemplate.v4.StringRenderer",
      "org.antlr.v4.codegen.target.Python3Target$PythonStringRenderer",
      "org.antlr.runtime.tree.BaseTreeAdaptor",
      "org.antlr.runtime.tree.CommonTreeAdaptor",
      "org.antlr.runtime.tree.TreeWizard$TreePatternTreeAdaptor",
      "org.antlr.runtime.CommonToken",
      "org.antlr.runtime.Token",
      "org.antlr.runtime.ANTLRStringStream",
      "org.antlr.runtime.ANTLRReaderStream",
      "org.antlr.runtime.BaseRecognizer",
      "org.antlr.runtime.Lexer",
      "org.antlr.runtime.DFA",
      "org.antlr.v4.parse.ANTLRLexer",
      "org.antlr.runtime.RecognizerSharedState",
      "org.antlr.v4.parse.ANTLRLexer$DFA2",
      "org.antlr.v4.parse.ANTLRLexer$DFA34",
      "org.antlr.runtime.BufferedTokenStream",
      "org.antlr.runtime.tree.BaseTree",
      "org.antlr.runtime.tree.CommonTree",
      "org.antlr.v4.tool.ast.GrammarAST",
      "org.antlr.v4.tool.ast.GrammarASTWithOptions",
      "org.antlr.v4.tool.ast.GrammarRootAST",
      "org.antlr.v4.tool.ast.AltAST",
      "org.antlr.runtime.Parser",
      "org.antlr.runtime.BitSet",
      "org.antlr.v4.parse.ANTLRParser",
      "org.antlr.v4.tool.Attribute",
      "org.antlr.v4.tool.AttributeDict",
      "org.antlr.v4.tool.Rule",
      "org.antlr.v4.tool.Grammar",
      "org.antlr.v4.tool.LexerGrammar",
      "org.antlr.v4.misc.OrderedHashMap",
      "org.antlr.v4.runtime.misc.LogManager",
      "org.antlr.v4.tool.DefaultToolListener",
      "org.antlr.v4.tool.ErrorManager",
      "org.stringtemplate.v4.misc.ErrorBuffer",
      "org.stringtemplate.v4.compiler.CompiledST",
      "org.stringtemplate.v4.misc.ErrorManager$1",
      "org.stringtemplate.v4.misc.ErrorManager",
      "org.stringtemplate.v4.misc.TypeRegistry",
      "org.stringtemplate.v4.misc.ObjectModelAdaptor",
      "org.stringtemplate.v4.misc.STModelAdaptor",
      "org.stringtemplate.v4.misc.MapModelAdaptor",
      "org.stringtemplate.v4.misc.AggregateModelAdaptor",
      "org.stringtemplate.v4.STGroup",
      "org.stringtemplate.v4.STGroupFile",
      "org.antlr.runtime.ANTLRInputStream",
      "org.stringtemplate.v4.misc.ErrorType",
      "org.stringtemplate.v4.misc.STMessage",
      "org.antlr.v4.codegen.OutputModelController",
      "org.antlr.v4.tool.ast.RuleAST",
      "org.antlr.v4.codegen.BlankOutputModelFactory",
      "org.antlr.v4.codegen.DefaultOutputModelFactory",
      "org.antlr.v4.codegen.LexerFactory",
      "org.antlr.v4.runtime.RuntimeMetaData",
      "org.antlr.v4.runtime.ParserRuleContext",
      "org.antlr.v4.runtime.RuleContext",
      "org.antlr.v4.tool.ast.ActionAST",
      "org.antlr.v4.runtime.VocabularyImpl",
      "org.antlr.v4.runtime.atn.ATNState",
      "org.antlr.v4.runtime.atn.DecisionState",
      "org.antlr.v4.runtime.atn.BlockStartState",
      "org.antlr.v4.runtime.atn.BasicBlockStartState",
      "org.antlr.v4.runtime.ListTokenSource",
      "org.antlr.v4.runtime.CommonTokenFactory",
      "org.antlr.v4.runtime.UnbufferedTokenStream",
      "org.antlr.v4.runtime.misc.Pair",
      "org.antlr.v4.runtime.CommonToken",
      "org.antlr.v4.runtime.Recognizer",
      "org.antlr.v4.runtime.Parser",
      "org.antlr.v4.runtime.ParserInterpreter",
      "org.antlr.v4.runtime.Recognizer$1",
      "org.antlr.v4.runtime.BaseErrorListener",
      "org.antlr.v4.runtime.ConsoleErrorListener",
      "org.antlr.v4.runtime.DefaultErrorStrategy",
      "org.antlr.v4.runtime.misc.IntegerList",
      "org.antlr.v4.runtime.misc.IntegerStack",
      "org.antlr.v4.runtime.atn.PredictionContextCache",
      "org.antlr.v4.codegen.ParserFactory",
      "org.antlr.v4.tool.ast.TerminalAST",
      "org.antlr.runtime.CommonTokenStream",
      "org.antlr.runtime.TokenRewriteStream",
      "org.antlr.runtime.tree.BufferedTreeNodeStream",
      "org.antlr.runtime.tree.TreeWizard$TreePattern",
      "org.antlr.v4.misc.Utils",
      "org.antlr.runtime.RecognitionException",
      "org.antlr.v4.codegen.CodeGenerator",
      "org.antlr.v4.runtime.misc.DoubleKeyMap",
      "org.antlr.runtime.LegacyCommonTokenStream",
      "org.stringtemplate.v4.NumberRenderer",
      "org.antlr.v4.codegen.Target$1",
      "org.stringtemplate.v4.misc.Misc",
      "org.antlr.v4.runtime.atn.RuleStartState",
      "org.antlr.v4.runtime.atn.Transition$1",
      "org.antlr.v4.runtime.atn.Transition",
      "org.antlr.v4.runtime.atn.RuleTransition",
      "org.antlr.v4.tool.ast.PredAST",
      "org.antlr.v4.tool.ast.BlockAST",
      "org.antlr.runtime.ClassicToken",
      "org.antlr.v4.runtime.atn.BlockEndState",
      "org.antlr.v4.runtime.atn.AbstractPredicateTransition",
      "org.antlr.v4.runtime.atn.PredicateTransition",
      "org.antlr.v4.runtime.atn.LoopEndState",
      "org.antlr.v4.runtime.atn.WildcardTransition",
      "org.antlr.v4.runtime.misc.OrderedHashSet",
      "org.antlr.v4.parse.ActionSplitter",
      "org.antlr.v4.codegen.model.OutputModelObject",
      "org.antlr.v4.codegen.model.OutputFile",
      "org.antlr.v4.codegen.model.LexerFile",
      "org.antlr.v4.tool.ANTLRMessage",
      "org.antlr.v4.tool.Alternative",
      "org.stringtemplate.v4.misc.MultiMap",
      "org.antlr.v4.runtime.BufferedTokenStream",
      "org.antlr.v4.runtime.CommonTokenStream",
      "org.antlr.v4.tool.AttributeDict$DictType"
    );
  }
}
