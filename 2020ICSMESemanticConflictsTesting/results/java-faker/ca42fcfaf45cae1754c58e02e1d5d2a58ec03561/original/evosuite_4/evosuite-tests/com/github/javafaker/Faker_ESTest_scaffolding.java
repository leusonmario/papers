/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue May 26 03:44:27 GMT 2020
 */

package com.github.javafaker;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Faker_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.github.javafaker.Faker"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Faker_ESTest_scaffolding.class.getClassLoader() ,
      "com.github.javafaker.Resolver",
      "org.yaml.snakeyaml.parser.ParserImpl",
      "org.apache.commons.lang.StringUtils",
      "org.yaml.snakeyaml.nodes.SequenceNode",
      "org.yaml.snakeyaml.composer.ComposerException",
      "org.yaml.snakeyaml.introspector.BeanAccess",
      "com.github.javafaker.Color",
      "org.yaml.snakeyaml.representer.Representer$RepresentJavaBean",
      "com.github.javafaker.service.LocaleDoesNotExistException",
      "org.yaml.snakeyaml.external.com.google.gdata.util.common.base.PercentEscaper",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentNumber",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentBoolean",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlPairs",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentList",
      "org.yaml.snakeyaml.events.Event",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlInt",
      "org.apache.commons.lang.math.RandomUtils",
      "org.yaml.snakeyaml.nodes.Node",
      "org.yaml.snakeyaml.introspector.MissingProperty",
      "org.yaml.snakeyaml.emitter.Emitable",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlTimestamp",
      "org.yaml.snakeyaml.constructor.Constructor$ConstructYamlObject",
      "org.yaml.snakeyaml.composer.Composer",
      "org.yaml.snakeyaml.tokens.FlowMappingStartToken",
      "org.yaml.snakeyaml.constructor.SafeConstructor",
      "org.yaml.snakeyaml.nodes.NodeId",
      "org.yaml.snakeyaml.events.SequenceEndEvent",
      "org.yaml.snakeyaml.events.MappingStartEvent",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentArray",
      "org.yaml.snakeyaml.parser.Parser",
      "org.apache.commons.lang.SystemUtils",
      "org.yaml.snakeyaml.tokens.AnchorToken",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseBlockSequenceFirstEntry",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentDate",
      "org.yaml.snakeyaml.parser.Production",
      "org.yaml.snakeyaml.introspector.Property",
      "org.yaml.snakeyaml.tokens.StreamStartToken",
      "org.yaml.snakeyaml.constructor.ConstructorException",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlBool",
      "org.yaml.snakeyaml.error.MarkedYAMLException",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlFloat",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentNull",
      "org.yaml.snakeyaml.error.Mark",
      "org.yaml.snakeyaml.events.DocumentEndEvent",
      "com.github.javafaker.Options",
      "com.github.javafaker.Company",
      "org.yaml.snakeyaml.tokens.DocumentEndToken",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseBlockSequenceEntry",
      "org.yaml.snakeyaml.introspector.PropertyUtils",
      "com.github.javafaker.Internet",
      "org.yaml.snakeyaml.external.com.google.gdata.util.common.base.Escaper",
      "org.yaml.snakeyaml.events.StreamStartEvent",
      "org.yaml.snakeyaml.error.YAMLException",
      "org.yaml.snakeyaml.scanner.ScannerImpl",
      "org.yaml.snakeyaml.reader.UnicodeReader",
      "com.github.javafaker.Hacker",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlOmap",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentMap",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseBlockNode",
      "org.yaml.snakeyaml.external.com.google.gdata.util.common.base.UnicodeEscaper",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseDocumentStart",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlNull",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlStr",
      "org.yaml.snakeyaml.events.CollectionEndEvent",
      "org.yaml.snakeyaml.tokens.KeyToken",
      "com.github.javafaker.DateAndTime",
      "org.yaml.snakeyaml.DumperOptions",
      "org.yaml.snakeyaml.tokens.BlockMappingStartToken",
      "org.yaml.snakeyaml.tokens.BlockSequenceStartToken",
      "com.github.javafaker.Faker",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentSet",
      "org.yaml.snakeyaml.resolver.Resolver",
      "org.apache.commons.lang.NullArgumentException",
      "com.github.javafaker.Finance",
      "org.yaml.snakeyaml.tokens.Token",
      "org.yaml.snakeyaml.events.SequenceStartEvent",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlMap",
      "org.yaml.snakeyaml.constructor.Constructor$ConstructMapping",
      "org.yaml.snakeyaml.constructor.Constructor",
      "org.yaml.snakeyaml.scanner.ScannerException",
      "org.yaml.snakeyaml.tokens.ScalarToken",
      "org.apache.commons.lang.math.JVMRandom",
      "org.yaml.snakeyaml.resolver.ResolverTuple",
      "com.github.javafaker.Number",
      "org.yaml.snakeyaml.nodes.NodeTuple",
      "org.yaml.snakeyaml.constructor.AbstractConstruct",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseFlowSequenceFirstEntry",
      "org.yaml.snakeyaml.tokens.TagToken",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseBlockMappingValue",
      "org.yaml.snakeyaml.nodes.CollectionNode",
      "org.apache.commons.lang.reflect.MemberUtils",
      "org.yaml.snakeyaml.nodes.ScalarNode",
      "org.yaml.snakeyaml.TypeDescription",
      "org.yaml.snakeyaml.events.AliasEvent",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlSet",
      "org.yaml.snakeyaml.constructor.Constructor$ConstructSequence",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlSeq",
      "org.yaml.snakeyaml.reader.ReaderException",
      "org.yaml.snakeyaml.tokens.DocumentStartToken",
      "org.yaml.snakeyaml.util.UriEncoder",
      "org.yaml.snakeyaml.external.com.google.gdata.util.common.base.UnicodeEscaper$2",
      "org.yaml.snakeyaml.parser.VersionTagsTuple",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseBlockMappingKey",
      "org.yaml.snakeyaml.events.MappingEndEvent",
      "org.apache.commons.lang.ClassUtils",
      "org.yaml.snakeyaml.DumperOptions$FlowStyle",
      "org.yaml.snakeyaml.events.DocumentStartEvent",
      "com.github.javafaker.App",
      "org.yaml.snakeyaml.parser.ParserImpl$1",
      "org.yaml.snakeyaml.tokens.FlowMappingEndToken",
      "org.yaml.snakeyaml.representer.BaseRepresenter",
      "org.yaml.snakeyaml.tokens.FlowSequenceEndToken",
      "org.yaml.snakeyaml.tokens.FlowSequenceStartToken",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlBinary",
      "org.yaml.snakeyaml.events.Event$ID",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseImplicitDocumentStart",
      "org.yaml.snakeyaml.DumperOptions$LineBreak",
      "org.yaml.snakeyaml.constructor.Construct",
      "com.github.javafaker.Address",
      "org.yaml.snakeyaml.tokens.FlowEntryToken",
      "org.yaml.snakeyaml.tokens.BlockEntryToken",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentEnum",
      "com.github.javafaker.Lorem",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentPrimitiveArray",
      "org.yaml.snakeyaml.scanner.Constant",
      "org.yaml.snakeyaml.representer.SafeRepresenter",
      "com.github.javafaker.Name",
      "org.yaml.snakeyaml.parser.ParserException",
      "org.yaml.snakeyaml.tokens.AliasToken",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructUndefined",
      "org.yaml.snakeyaml.events.CollectionStartEvent",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseStreamStart",
      "com.github.javafaker.Business",
      "org.yaml.snakeyaml.DumperOptions$ScalarStyle",
      "org.yaml.snakeyaml.tokens.StreamEndToken",
      "org.yaml.snakeyaml.constructor.BaseConstructor",
      "org.yaml.snakeyaml.representer.BaseRepresenter$1",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentByteArray",
      "org.yaml.snakeyaml.nodes.MappingNode",
      "org.yaml.snakeyaml.Yaml",
      "org.yaml.snakeyaml.constructor.Constructor$ConstructScalar",
      "org.yaml.snakeyaml.scanner.SimpleKey",
      "org.yaml.snakeyaml.resolver.Resolver$1",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseBlockMappingFirstKey",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentIterator",
      "org.yaml.snakeyaml.tokens.DirectiveToken",
      "org.yaml.snakeyaml.tokens.BlockEndToken",
      "org.yaml.snakeyaml.tokens.ValueToken",
      "com.github.javafaker.Code",
      "org.yaml.snakeyaml.representer.Represent",
      "org.yaml.snakeyaml.events.StreamEndEvent",
      "com.github.javafaker.Book",
      "com.github.javafaker.service.FakeValuesServiceInterface",
      "com.github.javafaker.service.RandomService",
      "org.yaml.snakeyaml.tokens.Token$ID",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseDocumentEnd",
      "org.yaml.snakeyaml.nodes.Tag",
      "org.yaml.snakeyaml.util.ArrayStack",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentString",
      "org.yaml.snakeyaml.scanner.Scanner",
      "org.yaml.snakeyaml.events.ImplicitTuple",
      "com.github.javafaker.service.FakeValuesService",
      "org.yaml.snakeyaml.events.NodeEvent",
      "org.yaml.snakeyaml.representer.Representer",
      "org.yaml.snakeyaml.reader.StreamReader",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseFlowSequenceEntry",
      "com.github.javafaker.PhoneNumber",
      "org.apache.commons.lang.ArrayUtils",
      "org.yaml.snakeyaml.events.ScalarEvent"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Faker_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.github.javafaker.Faker",
      "org.apache.commons.lang.ArrayUtils",
      "org.apache.commons.lang.StringUtils",
      "org.apache.commons.lang.SystemUtils",
      "org.apache.commons.lang.reflect.MemberUtils",
      "org.apache.commons.lang.ClassUtils",
      "com.github.javafaker.service.RandomService",
      "org.apache.commons.lang.math.JVMRandom",
      "org.apache.commons.lang.math.RandomUtils",
      "com.github.javafaker.service.FakeValuesService",
      "org.yaml.snakeyaml.Yaml",
      "org.yaml.snakeyaml.constructor.BaseConstructor",
      "org.yaml.snakeyaml.constructor.AbstractConstruct",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructUndefined",
      "org.yaml.snakeyaml.constructor.SafeConstructor",
      "org.yaml.snakeyaml.constructor.Constructor",
      "org.yaml.snakeyaml.TypeDescription",
      "org.yaml.snakeyaml.nodes.NodeId",
      "org.yaml.snakeyaml.external.com.google.gdata.util.common.base.UnicodeEscaper$2",
      "org.yaml.snakeyaml.external.com.google.gdata.util.common.base.UnicodeEscaper",
      "org.yaml.snakeyaml.external.com.google.gdata.util.common.base.PercentEscaper",
      "org.yaml.snakeyaml.util.UriEncoder",
      "org.yaml.snakeyaml.nodes.Tag",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlNull",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlBool",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlInt",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlFloat",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlBinary",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlTimestamp",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlOmap",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlPairs",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlSet",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlStr",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlSeq",
      "org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlMap",
      "org.yaml.snakeyaml.constructor.Constructor$ConstructYamlObject",
      "org.yaml.snakeyaml.constructor.Constructor$ConstructScalar",
      "org.yaml.snakeyaml.constructor.Constructor$ConstructMapping",
      "org.yaml.snakeyaml.constructor.Constructor$ConstructSequence",
      "org.yaml.snakeyaml.representer.BaseRepresenter",
      "org.yaml.snakeyaml.representer.SafeRepresenter",
      "org.yaml.snakeyaml.representer.Representer",
      "org.yaml.snakeyaml.DumperOptions$FlowStyle",
      "org.yaml.snakeyaml.representer.BaseRepresenter$1",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentNull",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentString",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentBoolean",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentByteArray",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentPrimitiveArray",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentNumber",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentList",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentMap",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentSet",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentIterator",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentArray",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentDate",
      "org.yaml.snakeyaml.representer.SafeRepresenter$RepresentEnum",
      "org.yaml.snakeyaml.representer.Representer$RepresentJavaBean",
      "org.yaml.snakeyaml.DumperOptions",
      "org.yaml.snakeyaml.DumperOptions$ScalarStyle",
      "org.yaml.snakeyaml.DumperOptions$LineBreak",
      "org.yaml.snakeyaml.resolver.Resolver",
      "org.yaml.snakeyaml.resolver.ResolverTuple",
      "org.yaml.snakeyaml.introspector.PropertyUtils",
      "org.yaml.snakeyaml.introspector.BeanAccess",
      "org.yaml.snakeyaml.reader.StreamReader",
      "org.yaml.snakeyaml.reader.UnicodeReader",
      "org.yaml.snakeyaml.composer.Composer",
      "org.yaml.snakeyaml.parser.ParserImpl",
      "org.yaml.snakeyaml.scanner.ScannerImpl",
      "org.yaml.snakeyaml.util.ArrayStack",
      "org.yaml.snakeyaml.error.Mark",
      "org.yaml.snakeyaml.tokens.Token",
      "org.yaml.snakeyaml.tokens.StreamStartToken",
      "org.yaml.snakeyaml.parser.VersionTagsTuple",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseStreamStart",
      "org.yaml.snakeyaml.events.Event",
      "org.yaml.snakeyaml.events.StreamStartEvent",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseImplicitDocumentStart",
      "org.yaml.snakeyaml.events.Event$ID",
      "org.yaml.snakeyaml.tokens.Token$ID",
      "org.yaml.snakeyaml.scanner.Constant",
      "org.yaml.snakeyaml.scanner.SimpleKey",
      "org.yaml.snakeyaml.tokens.ScalarToken",
      "org.yaml.snakeyaml.tokens.KeyToken",
      "org.yaml.snakeyaml.tokens.BlockMappingStartToken",
      "org.yaml.snakeyaml.tokens.ValueToken",
      "org.yaml.snakeyaml.events.DocumentStartEvent",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseDocumentEnd",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseBlockNode",
      "org.yaml.snakeyaml.events.NodeEvent",
      "org.yaml.snakeyaml.events.CollectionStartEvent",
      "org.yaml.snakeyaml.events.MappingStartEvent",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseBlockMappingFirstKey",
      "org.yaml.snakeyaml.resolver.Resolver$1",
      "org.yaml.snakeyaml.nodes.Node",
      "org.yaml.snakeyaml.nodes.CollectionNode",
      "org.yaml.snakeyaml.nodes.MappingNode",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseBlockMappingKey",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseBlockMappingValue",
      "org.yaml.snakeyaml.events.ImplicitTuple",
      "org.yaml.snakeyaml.events.ScalarEvent",
      "org.yaml.snakeyaml.nodes.ScalarNode",
      "org.yaml.snakeyaml.nodes.NodeTuple",
      "org.yaml.snakeyaml.tokens.FlowSequenceStartToken",
      "org.yaml.snakeyaml.events.SequenceStartEvent",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseFlowSequenceFirstEntry",
      "org.yaml.snakeyaml.nodes.SequenceNode",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseFlowSequenceEntry",
      "org.yaml.snakeyaml.tokens.FlowEntryToken",
      "org.yaml.snakeyaml.tokens.FlowSequenceEndToken",
      "org.yaml.snakeyaml.events.CollectionEndEvent",
      "org.yaml.snakeyaml.events.SequenceEndEvent",
      "com.github.javafaker.service.LocaleDoesNotExistException",
      "org.yaml.snakeyaml.tokens.BlockSequenceStartToken",
      "org.yaml.snakeyaml.tokens.BlockEntryToken",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseBlockSequenceFirstEntry",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseBlockSequenceEntry",
      "org.yaml.snakeyaml.tokens.BlockEndToken",
      "org.yaml.snakeyaml.events.MappingEndEvent",
      "org.yaml.snakeyaml.tokens.StreamEndToken",
      "org.yaml.snakeyaml.events.DocumentEndEvent",
      "org.yaml.snakeyaml.parser.ParserImpl$ParseDocumentStart",
      "org.yaml.snakeyaml.events.StreamEndEvent"
    );
  }
}
