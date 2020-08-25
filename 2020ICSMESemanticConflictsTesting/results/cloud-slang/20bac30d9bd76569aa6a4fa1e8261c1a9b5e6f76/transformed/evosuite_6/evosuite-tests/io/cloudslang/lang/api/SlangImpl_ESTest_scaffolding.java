/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 29 13:56:36 GMT 2020
 */

package io.cloudslang.lang.api;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class SlangImpl_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 10000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "io.cloudslang.lang.api.SlangImpl"; 
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

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
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
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SlangImpl_ESTest_scaffolding.class.getClassLoader() ,
      "org.yaml.snakeyaml.parser.ParserImpl",
      "org.yaml.snakeyaml.nodes.SequenceNode",
      "org.yaml.snakeyaml.introspector.BeanAccess",
      "org.yaml.snakeyaml.Loader",
      "io.cloudslang.score.events.EventBusImpl",
      "org.apache.log4j.varia.FallbackErrorHandler",
      "org.apache.log4j.helpers.PatternConverter",
      "org.springframework.beans.factory.annotation.Autowired",
      "org.apache.log4j.AppenderSkeleton",
      "org.yaml.snakeyaml.nodes.Node",
      "org.yaml.snakeyaml.introspector.MissingProperty",
      "org.yaml.snakeyaml.composer.Composer",
      "org.apache.commons.io.filefilter.EmptyFileFilter",
      "org.yaml.snakeyaml.constructor.SafeConstructor",
      "org.apache.log4j.Level",
      "org.apache.log4j.helpers.DateTimeDateFormat",
      "org.yaml.snakeyaml.events.MappingStartEvent",
      "org.yaml.snakeyaml.parser.Parser",
      "org.apache.commons.io.filefilter.TrueFileFilter",
      "org.apache.log4j.helpers.QuietWriter",
      "org.apache.log4j.ConsoleAppender$SystemOutStream",
      "org.apache.commons.io.filefilter.AgeFileFilter",
      "io.cloudslang.score.api.TriggeringProperties",
      "org.yaml.snakeyaml.parser.Production",
      "org.apache.log4j.SimpleLayout",
      "org.apache.log4j.helpers.ISO8601DateFormat",
      "org.apache.log4j.spi.Filter",
      "org.apache.commons.io.filefilter.DirectoryFileFilter",
      "org.yaml.snakeyaml.error.MarkedYAMLException",
      "org.yaml.snakeyaml.error.Mark",
      "org.apache.commons.io.filefilter.SuffixFileFilter",
      "io.cloudslang.lang.systemtests.StepData",
      "io.cloudslang.lang.compiler.modeller.model.Action",
      "org.apache.log4j.Layout",
      "io.cloudslang.lang.compiler.SlangSource",
      "org.yaml.snakeyaml.reader.UnicodeReader",
      "org.apache.commons.io.filefilter.AndFileFilter",
      "org.apache.log4j.varia.LevelMatchFilter",
      "io.cloudslang.orchestrator.services.ScoreTriggering",
      "io.cloudslang.lang.compiler.parser.model.ParsedSlang",
      "org.apache.log4j.Hierarchy",
      "io.cloudslang.lang.runtime.events.LanguageEventData",
      "org.apache.commons.io.filefilter.NameFileFilter",
      "io.cloudslang.lang.compiler.modeller.model.Executable",
      "com.google.common.io.PatternFilenameFilter",
      "org.yaml.snakeyaml.resolver.Resolver",
      "io.cloudslang.lang.entities.bindings.Result",
      "org.yaml.snakeyaml.tokens.Token",
      "org.yaml.snakeyaml.events.SequenceStartEvent",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.spi.OptionHandler",
      "org.yaml.snakeyaml.constructor.Constructor",
      "io.cloudslang.score.facade.execution.ExecutionActionResult",
      "io.cloudslang.lang.compiler.parser.model.ParsedSlang$Type",
      "io.cloudslang.lang.compiler.modeller.model.Operation",
      "org.yaml.snakeyaml.nodes.NodeTuple",
      "org.yaml.snakeyaml.constructor.AbstractConstruct",
      "org.yaml.snakeyaml.nodes.CollectionNode",
      "org.hamcrest.Matcher",
      "org.apache.commons.io.filefilter.WildcardFilter",
      "org.apache.log4j.RollingFileAppender",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.commons.io.filefilter.IOFileFilter",
      "org.apache.commons.io.filefilter.MagicNumberFileFilter",
      "io.cloudslang.lang.compiler.modeller.SlangModeller",
      "org.yaml.snakeyaml.parser.VersionTagsTuple",
      "org.apache.log4j.EnhancedPatternLayout",
      "org.yaml.snakeyaml.DumperOptions$FlowStyle",
      "org.python.core.packagecache.PathPackageManager$PackageExistsFileFilter",
      "org.apache.log4j.or.ObjectRenderer",
      "org.yaml.snakeyaml.representer.BaseRepresenter",
      "org.apache.log4j.helpers.PatternParser",
      "org.apache.log4j.AsyncAppender",
      "org.apache.log4j.Category",
      "io.cloudslang.score.events.ScoreEventListener",
      "io.cloudslang.score.events.ScoreEvent",
      "io.cloudslang.lang.compiler.modeller.model.Task",
      "org.yaml.snakeyaml.events.Event$ID",
      "io.cloudslang.lang.systemtests.BranchAggregatorListener",
      "org.apache.commons.io.filefilter.AbstractFileFilter",
      "org.yaml.snakeyaml.DumperOptions$LineBreak",
      "org.apache.commons.io.filefilter.HiddenFileFilter",
      "org.apache.log4j.helpers.RelativeTimeDateFormat",
      "io.cloudslang.orchestrator.services.ScorePauseResume",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.ConsoleAppender",
      "org.apache.commons.io.filefilter.FalseFileFilter",
      "org.yaml.snakeyaml.parser.ParserException",
      "org.apache.log4j.spi.Configurator",
      "org.hamcrest.SelfDescribing",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructUndefined",
      "org.yaml.snakeyaml.events.CollectionStartEvent",
      "org.apache.log4j.spi.LocationInfo",
      "io.cloudslang.lang.compiler.SlangCompilerImpl",
      "org.apache.log4j.TTCCLayout",
      "org.yaml.snakeyaml.DumperOptions$ScalarStyle",
      "org.apache.log4j.varia.StringMatchFilter",
      "org.yaml.snakeyaml.constructor.BaseConstructor",
      "org.yaml.snakeyaml.nodes.MappingNode",
      "org.apache.commons.io.filefilter.OrFileFilter",
      "io.cloudslang.lang.systemtests.JoinAggregatorListener",
      "org.apache.log4j.HTMLLayout",
      "org.yaml.snakeyaml.representer.Represent",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.yaml.snakeyaml.scanner.Scanner",
      "org.apache.log4j.Priority",
      "org.yaml.snakeyaml.events.NodeEvent",
      "org.apache.log4j.FileAppender",
      "org.apache.log4j.LogManager",
      "io.cloudslang.lang.compiler.modeller.model.Flow",
      "org.apache.commons.io.filefilter.CanWriteFileFilter",
      "org.yaml.snakeyaml.composer.ComposerException",
      "io.cloudslang.lang.compiler.SlangCompiler",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.or.RendererMap",
      "org.yaml.snakeyaml.events.Event",
      "org.yaml.snakeyaml.emitter.Emitable",
      "org.apache.log4j.ConsoleAppender$SystemErrStream",
      "org.yaml.snakeyaml.constructor.SafeConstructor$1",
      "org.apache.log4j.pattern.BridgePatternParser",
      "org.yaml.snakeyaml.nodes.NodeId",
      "org.apache.commons.io.filefilter.NotFileFilter",
      "io.cloudslang.lang.compiler.scorecompiler.ScoreCompiler",
      "org.yaml.snakeyaml.Dumper",
      "org.yaml.snakeyaml.introspector.Property",
      "org.apache.commons.io.filefilter.ConditionalFileFilter",
      "org.yaml.snakeyaml.DumperOptions$Version",
      "org.yaml.snakeyaml.constructor.ConstructorException",
      "org.apache.log4j.RollingCalendar",
      "org.apache.log4j.CategoryKey",
      "io.cloudslang.score.api.ExecutionPlan",
      "org.apache.log4j.WriterAppender",
      "org.yaml.snakeyaml.introspector.PropertyUtils",
      "org.apache.log4j.varia.DenyAllFilter",
      "org.apache.log4j.helpers.DateLayout",
      "org.yaml.snakeyaml.error.YAMLException",
      "org.apache.log4j.helpers.OnlyOnceErrorHandler",
      "org.apache.commons.io.filefilter.DelegateFileFilter",
      "io.cloudslang.score.events.EventBus",
      "io.cloudslang.lang.entities.CompilationArtifact",
      "org.yaml.snakeyaml.constructor.BaseConstructor$RecursiveTuple",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.ProvisionNode",
      "org.yaml.snakeyaml.DumperOptions",
      "org.apache.log4j.spi.RootLogger",
      "io.cloudslang.score.api.Score",
      "io.cloudslang.lang.compiler.modeller.model.Workflow",
      "io.cloudslang.lang.systemtests.RunDataAggregatorListener",
      "org.apache.log4j.spi.ErrorHandler",
      "org.yaml.snakeyaml.LoaderOptions",
      "org.yaml.snakeyaml.resolver.ResolverTuple",
      "org.apache.log4j.spi.RendererSupport",
      "io.cloudslang.orchestrator.services.ScoreImpl",
      "io.cloudslang.lang.entities.bindings.InOutParam",
      "org.yaml.snakeyaml.nodes.ScalarNode",
      "org.apache.commons.io.filefilter.WildcardFileFilter",
      "org.apache.log4j.helpers.AppenderAttachableImpl",
      "io.cloudslang.orchestrator.services.CancelExecutionService",
      "org.yaml.snakeyaml.TypeDescription",
      "org.yaml.snakeyaml.events.AliasEvent",
      "io.cloudslang.lang.runtime.events.LanguageEventData$StepType",
      "io.cloudslang.score.api.ControlActionMetadata",
      "org.yaml.snakeyaml.reader.ReaderException",
      "io.cloudslang.lang.compiler.parser.YamlParser",
      "org.apache.log4j.helpers.AbsoluteTimeDateFormat",
      "org.apache.log4j.varia.LevelRangeFilter",
      "org.apache.log4j.Logger",
      "org.yaml.snakeyaml.nodes.AnchorNode",
      "org.apache.log4j.helpers.LogLog",
      "io.cloudslang.lang.api.SlangImpl",
      "org.yaml.snakeyaml.constructor.Construct",
      "org.apache.log4j.spi.RepositorySelector",
      "org.apache.commons.io.filefilter.FileFileFilter",
      "io.cloudslang.lang.entities.bindings.Input",
      "org.apache.log4j.DailyRollingFileAppender",
      "org.yaml.snakeyaml.representer.SafeRepresenter",
      "org.yaml.snakeyaml.tokens.AliasToken",
      "org.yaml.snakeyaml.emitter.ScalarAnalysis",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.commons.io.filefilter.CanReadFileFilter",
      "org.apache.commons.io.IOCase",
      "org.apache.log4j.spi.ThrowableRendererSupport",
      "org.apache.log4j.PropertyConfigurator",
      "io.cloudslang.score.api.ExecutionStep",
      "org.apache.commons.io.filefilter.SizeFileFilter",
      "org.yaml.snakeyaml.Yaml",
      "io.cloudslang.lang.systemtests.AbstractAggregatorListener",
      "org.apache.log4j.Appender",
      "org.yaml.snakeyaml.constructor.CustomClassLoaderConstructor",
      "org.apache.commons.io.filefilter.RegexFileFilter",
      "org.apache.log4j.helpers.CountingQuietWriter",
      "io.cloudslang.lang.entities.bindings.Output",
      "org.apache.log4j.spi.LoggingEvent",
      "org.yaml.snakeyaml.nodes.Tag",
      "org.yaml.snakeyaml.util.ArrayStack",
      "org.apache.commons.io.filefilter.PrefixFileFilter",
      "org.apache.log4j.spi.ThrowableInformation",
      "org.springframework.stereotype.Component",
      "io.cloudslang.lang.api.Slang",
      "org.yaml.snakeyaml.representer.Representer",
      "org.yaml.snakeyaml.reader.StreamReader",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.log4j.PatternLayout",
      "org.yaml.snakeyaml.events.ScalarEvent"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SlangImpl_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "io.cloudslang.lang.api.SlangImpl"
    );
  }
}
