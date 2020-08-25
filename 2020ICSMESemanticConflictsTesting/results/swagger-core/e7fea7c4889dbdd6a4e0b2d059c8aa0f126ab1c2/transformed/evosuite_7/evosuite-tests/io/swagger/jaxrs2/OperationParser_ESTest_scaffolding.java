/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue May 26 00:50:55 GMT 2020
 */

package io.swagger.jaxrs2;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class OperationParser_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "io.swagger.jaxrs2.OperationParser"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(OperationParser_ESTest_scaffolding.class.getClassLoader() ,
      "com.fasterxml.jackson.databind.deser.BeanDeserializerModifier",
      "com.fasterxml.jackson.databind.deser.impl.FieldProperty",
      "org.apache.commons.lang3.StringUtils",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$ShortSerializer",
      "com.fasterxml.jackson.annotation.JsonFormat$Features",
      "com.fasterxml.jackson.databind.deser.std.EnumDeserializer",
      "com.fasterxml.jackson.annotation.ObjectIdGenerators$Base",
      "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor",
      "io.swagger.jackson.SwaggerAnnotationIntrospector",
      "com.fasterxml.jackson.databind.cfg.MapperConfigBase",
      "com.fasterxml.jackson.databind.deser.UnresolvedForwardReference",
      "io.swagger.oas.annotations.media.ArraySchema",
      "com.fasterxml.jackson.databind.ser.impl.UnknownSerializer",
      "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers",
      "com.fasterxml.jackson.databind.type.MapLikeType",
      "com.fasterxml.jackson.databind.type.MapType",
      "io.swagger.oas.annotations.Parameter",
      "com.fasterxml.jackson.databind.ser.std.UUIDSerializer",
      "com.fasterxml.jackson.databind.ObjectWriter",
      "com.fasterxml.jackson.databind.type.TypeBase",
      "com.fasterxml.jackson.databind.node.TextNode",
      "com.fasterxml.jackson.core.util.Instantiatable",
      "io.swagger.oas.models.security.SecurityRequirement",
      "com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase",
      "io.swagger.oas.models.examples.Example",
      "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter$Indenter",
      "io.swagger.oas.models.media.Encoding",
      "com.fasterxml.jackson.databind.node.DecimalNode",
      "com.fasterxml.jackson.databind.util.Annotations",
      "com.fasterxml.jackson.databind.deser.Deserializers",
      "com.fasterxml.jackson.databind.ser.std.CollectionSerializer",
      "com.fasterxml.jackson.databind.deser.KeyDeserializers",
      "io.swagger.oas.models.links.Link",
      "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable",
      "io.swagger.oas.models.security.OAuthFlows",
      "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std",
      "com.fasterxml.jackson.databind.type.CollectionLikeType",
      "io.swagger.oas.models.security.OAuthFlow",
      "com.fasterxml.jackson.core.TreeNode",
      "com.fasterxml.jackson.databind.node.NumericNode",
      "io.swagger.oas.annotations.ExternalDocumentation",
      "com.fasterxml.jackson.databind.deser.ValueInstantiator",
      "io.swagger.oas.annotations.info.Contact",
      "com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase",
      "io.swagger.oas.models.parameters.Parameter",
      "com.fasterxml.jackson.databind.type.ResolvedRecursiveType",
      "io.swagger.oas.models.media.Discriminator",
      "com.fasterxml.jackson.databind.introspect.BasicClassIntrospector",
      "com.fasterxml.jackson.core.base.ParserMinimalBase",
      "com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer",
      "com.fasterxml.jackson.databind.deser.BeanDeserializerBase",
      "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition",
      "com.fasterxml.jackson.databind.ser.std.FileSerializer",
      "com.fasterxml.jackson.core.SerializableString",
      "com.fasterxml.jackson.databind.deser.ValueInstantiators",
      "com.fasterxml.jackson.core.Versioned",
      "com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember",
      "com.fasterxml.jackson.databind.introspect.BasicBeanDescription",
      "com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer",
      "com.fasterxml.jackson.databind.introspect.AnnotatedMember",
      "com.fasterxml.jackson.databind.JsonSerializable",
      "com.fasterxml.jackson.databind.BeanDescription",
      "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer",
      "io.swagger.oas.models.PathItem$HttpMethod",
      "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams",
      "com.fasterxml.jackson.core.Base64Variant",
      "io.swagger.oas.models.media.ByteArraySchema",
      "io.swagger.oas.models.media.Content",
      "com.fasterxml.jackson.databind.ser.SerializerFactory",
      "io.swagger.oas.annotations.info.Info",
      "io.swagger.util.Json",
      "io.swagger.oas.models.Operation",
      "com.fasterxml.jackson.databind.type.SimpleType",
      "com.fasterxml.jackson.databind.ser.ContextualSerializer",
      "io.swagger.oas.models.media.DateTimeSchema",
      "io.swagger.oas.models.media.Schema",
      "io.swagger.oas.models.media.ArraySchema",
      "com.fasterxml.jackson.databind.DeserializationConfig",
      "com.fasterxml.jackson.databind.MapperFeature",
      "com.fasterxml.jackson.databind.ser.std.ClassSerializer",
      "com.fasterxml.jackson.databind.Module$SetupContext",
      "com.fasterxml.jackson.databind.ext.Java7SupportImpl",
      "com.fasterxml.jackson.dataformat.yaml.YAMLFactory",
      "com.fasterxml.jackson.databind.node.ContainerNode",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$LongSerializer",
      "io.swagger.jackson.ModelResolver",
      "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory",
      "com.fasterxml.jackson.databind.ser.std.StdSerializer",
      "com.fasterxml.jackson.databind.ser.BeanSerializerFactory",
      "com.fasterxml.jackson.databind.jsonschema.SchemaAware",
      "com.fasterxml.jackson.databind.AbstractTypeResolver",
      "io.swagger.oas.models.ExternalDocumentation",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$DoubleSerializer",
      "io.swagger.util.ParameterDeserializer",
      "com.fasterxml.jackson.databind.ser.std.ByteBufferSerializer",
      "com.fasterxml.jackson.core.Base64Variants",
      "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer",
      "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer",
      "com.fasterxml.jackson.databind.ser.std.IterableSerializer",
      "com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicIntegerSerializer",
      "com.fasterxml.jackson.databind.util.ArrayBuilders",
      "com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter",
      "io.swagger.oas.models.tags.Tag",
      "com.fasterxml.jackson.core.PrettyPrinter",
      "com.fasterxml.jackson.core.base.GeneratorBase",
      "com.fasterxml.jackson.databind.exc.PropertyBindingException",
      "io.swagger.converter.ModelConverters",
      "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector",
      "com.fasterxml.jackson.databind.ser.BeanSerializer",
      "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider",
      "com.fasterxml.jackson.databind.node.NullNode",
      "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base",
      "io.swagger.oas.annotations.responses.ApiResponse",
      "com.fasterxml.jackson.databind.ser.BeanSerializerModifier",
      "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder",
      "com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector",
      "com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer",
      "com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator",
      "io.swagger.util.ObjectMapperFactory",
      "com.fasterxml.jackson.core.io.UTF8Writer",
      "com.fasterxml.jackson.databind.BeanProperty",
      "com.fasterxml.jackson.core.Version",
      "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer",
      "com.fasterxml.jackson.databind.introspect.TypeResolutionContext",
      "io.swagger.jackson.TypeNameResolver",
      "com.fasterxml.jackson.core.base.ParserBase",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntLikeSerializer",
      "com.fasterxml.jackson.databind.node.BinaryNode",
      "com.fasterxml.jackson.databind.introspect.AnnotationMap",
      "com.fasterxml.jackson.databind.ser.std.ToStringSerializer",
      "com.fasterxml.jackson.core.JsonGenerator",
      "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext",
      "com.fasterxml.jackson.databind.ser.Serializers",
      "com.fasterxml.jackson.databind.type.ClassKey",
      "io.swagger.jaxrs2.OperationParser",
      "io.swagger.oas.models.responses.ApiResponse",
      "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer",
      "com.fasterxml.jackson.core.TreeCodec",
      "io.swagger.oas.annotations.media.Content",
      "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty",
      "com.fasterxml.jackson.core.json.UTF8JsonGenerator",
      "com.fasterxml.jackson.databind.ser.std.EnumSetSerializer",
      "com.fasterxml.jackson.databind.ser.std.SerializableSerializer",
      "io.swagger.oas.models.servers.Server",
      "io.swagger.oas.models.callbacks.Callback",
      "com.fasterxml.jackson.databind.introspect.Annotated",
      "io.swagger.util.DeserializationModule",
      "io.swagger.oas.models.info.Contact",
      "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$DelegatingKD",
      "com.fasterxml.jackson.databind.util.TokenBuffer",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter$NopIndenter",
      "com.fasterxml.jackson.core.JsonParser$NumberType",
      "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator",
      "io.swagger.oas.annotations.media.Schema",
      "io.swagger.oas.models.media.XML",
      "com.fasterxml.jackson.databind.node.LongNode",
      "io.swagger.oas.models.parameters.Parameter$StyleEnum",
      "com.fasterxml.jackson.databind.module.SimpleModule",
      "com.fasterxml.jackson.databind.deser.CreatorProperty",
      "io.swagger.jaxrs2.util.ReaderUtils",
      "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringCtorKeyDeserializer",
      "io.swagger.oas.models.headers.Header$StyleEnum",
      "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase",
      "com.fasterxml.jackson.core.JsonParseException",
      "com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer",
      "com.fasterxml.jackson.annotation.JsonBackReference",
      "io.swagger.oas.models.media.StringSchema",
      "com.fasterxml.jackson.databind.ObjectMapper$1",
      "io.swagger.oas.models.responses.ApiResponses",
      "io.swagger.jackson.SchemaSerializer",
      "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig",
      "com.fasterxml.jackson.databind.ser.std.MapSerializer",
      "io.swagger.util.ObjectMapperFactory$1",
      "com.fasterxml.jackson.databind.ser.std.SqlDateSerializer",
      "com.fasterxml.jackson.databind.util.RootNameLookup",
      "com.fasterxml.jackson.databind.introspect.AnnotatedClass",
      "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer",
      "com.fasterxml.jackson.databind.ser.impl.FailingSerializer",
      "io.swagger.util.ObjectMapperFactory$1$1",
      "com.fasterxml.jackson.databind.JsonMappingException",
      "io.swagger.oas.models.media.MapSchema",
      "com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer",
      "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer",
      "com.fasterxml.jackson.databind.ser.std.SqlTimeSerializer",
      "com.fasterxml.jackson.databind.DatabindContext",
      "com.fasterxml.jackson.databind.node.ObjectNode",
      "com.fasterxml.jackson.core.JsonParser$Feature",
      "com.fasterxml.jackson.core.io.SerializedString",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter",
      "com.fasterxml.jackson.annotation.JsonFormat$Shape",
      "com.fasterxml.jackson.databind.introspect.AnnotatedField",
      "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase",
      "io.swagger.util.ResponseDeserializer",
      "com.fasterxml.jackson.databind.deser.ContextualDeserializer",
      "com.fasterxml.jackson.databind.ser.std.ArraySerializerBase",
      "com.fasterxml.jackson.annotation.ObjectIdGenerator",
      "com.fasterxml.jackson.databind.ser.std.CalendarSerializer",
      "io.swagger.oas.models.servers.ServerVariable",
      "com.fasterxml.jackson.databind.ext.Java7Support",
      "com.fasterxml.jackson.databind.ser.std.BooleanSerializer",
      "io.swagger.jackson.AbstractModelConverter$1",
      "com.fasterxml.jackson.databind.introspect.ClassIntrospector",
      "com.fasterxml.jackson.databind.JsonSerializable$Base",
      "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer",
      "io.swagger.oas.annotations.parameters.RequestBody",
      "com.fasterxml.jackson.databind.node.TreeTraversingParser",
      "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer",
      "io.swagger.oas.annotations.media.DiscriminatorMapping",
      "com.fasterxml.jackson.databind.type.TypeFactory",
      "io.swagger.oas.annotations.links.LinkParameters",
      "com.fasterxml.jackson.databind.type.ArrayType",
      "com.fasterxml.jackson.databind.util.Named",
      "io.swagger.oas.annotations.media.ExampleObject",
      "com.fasterxml.jackson.databind.cfg.ConfigOverrides",
      "com.fasterxml.jackson.databind.ser.std.StdScalarSerializer",
      "com.fasterxml.jackson.databind.type.CollectionType",
      "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer",
      "com.fasterxml.jackson.annotation.JsonAutoDetect",
      "com.fasterxml.jackson.databind.node.ValueNode",
      "com.fasterxml.jackson.databind.ser.impl.IteratorSerializer",
      "com.fasterxml.jackson.databind.ser.BasicSerializerFactory",
      "com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer",
      "com.fasterxml.jackson.databind.ext.NioPathDeserializer",
      "io.swagger.oas.models.security.Scopes",
      "com.fasterxml.jackson.databind.node.JsonNodeCreator",
      "com.fasterxml.jackson.databind.deser.SettableBeanProperty",
      "com.fasterxml.jackson.core.json.ReaderBasedJsonParser",
      "com.fasterxml.jackson.databind.node.IntNode",
      "com.fasterxml.jackson.databind.node.FloatNode",
      "com.fasterxml.jackson.databind.type.TypeParser",
      "com.fasterxml.jackson.databind.jsontype.SubtypeResolver",
      "com.fasterxml.jackson.core.ObjectCodec",
      "com.fasterxml.jackson.databind.ser.std.EnumSerializer",
      "com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter",
      "com.google.common.io.PatternFilenameFilter",
      "com.fasterxml.jackson.databind.KeyDeserializer",
      "com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer",
      "com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator",
      "com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer",
      "com.fasterxml.jackson.databind.DeserializationContext",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$Base",
      "com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer",
      "io.swagger.util.ModelDeserializer",
      "com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer",
      "io.swagger.util.PathDeserializer",
      "com.fasterxml.jackson.databind.node.DoubleNode",
      "com.fasterxml.jackson.databind.ser.PropertyWriter",
      "com.fasterxml.jackson.core.util.ByteArrayBuilder",
      "com.fasterxml.jackson.databind.type.ReferenceType",
      "com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer",
      "io.swagger.oas.models.media.DateSchema",
      "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$TableInfo",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializer",
      "com.fasterxml.jackson.databind.Module",
      "com.fasterxml.jackson.annotation.JsonView",
      "com.fasterxml.jackson.databind.AnnotationIntrospector",
      "com.fasterxml.jackson.databind.ser.std.DateSerializer",
      "com.fasterxml.jackson.databind.ser.ContainerSerializer",
      "com.fasterxml.jackson.databind.ser.std.NullSerializer",
      "com.fasterxml.jackson.databind.deser.std.StringDeserializer",
      "com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer",
      "io.swagger.oas.models.security.SecurityScheme$In",
      "com.fasterxml.jackson.databind.DeserializationFeature",
      "com.fasterxml.jackson.databind.exc.InvalidTypeIdException",
      "com.fasterxml.jackson.annotation.JacksonAnnotation",
      "com.fasterxml.jackson.databind.node.POJONode",
      "com.fasterxml.jackson.databind.node.BaseJsonNode",
      "com.fasterxml.jackson.databind.node.BigIntegerNode",
      "com.fasterxml.jackson.databind.util.LRUMap",
      "io.swagger.oas.models.media.BinarySchema",
      "com.fasterxml.jackson.databind.JsonDeserializer",
      "io.swagger.oas.models.info.License",
      "io.swagger.util.SecuritySchemeDeserializer",
      "io.swagger.oas.models.media.IntegerSchema",
      "com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition",
      "com.fasterxml.jackson.databind.deser.impl.MethodProperty",
      "io.swagger.oas.models.media.PasswordSchema",
      "com.fasterxml.jackson.annotation.JsonRawValue",
      "com.fasterxml.jackson.core.util.DefaultIndenter",
      "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility",
      "io.swagger.util.EncodingPropertyStyleEnumDeserializer",
      "io.swagger.oas.annotations.links.Link",
      "com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter",
      "com.fasterxml.jackson.databind.exc.InvalidFormatException",
      "com.fasterxml.jackson.databind.deser.std.MapDeserializer",
      "com.fasterxml.jackson.databind.ser.std.NonTypedScalarSerializerBase",
      "com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer",
      "io.swagger.oas.models.media.EmailSchema",
      "com.fasterxml.jackson.core.type.ResolvedType",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers",
      "io.swagger.oas.models.media.ComposedSchema",
      "com.fasterxml.jackson.databind.annotation.JsonSerialize",
      "io.swagger.oas.annotations.enums.Explode",
      "com.fasterxml.jackson.annotation.JsonIgnore",
      "com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator",
      "com.fasterxml.jackson.databind.introspect.AnnotatedMethod",
      "com.fasterxml.jackson.databind.introspect.VisibilityChecker",
      "com.fasterxml.jackson.core.JsonParser",
      "com.fasterxml.jackson.databind.introspect.AnnotatedParameter",
      "com.fasterxml.jackson.databind.ser.BeanPropertyWriter",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$FloatSerializer",
      "io.swagger.oas.models.security.SecurityScheme$Type",
      "com.fasterxml.jackson.core.JsonProcessingException",
      "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$Bucket",
      "com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer",
      "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl",
      "com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException",
      "io.swagger.util.ParameterProcessor",
      "com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicBooleanSerializer",
      "com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicLongSerializer",
      "com.fasterxml.jackson.databind.ser.std.InetAddressSerializer",
      "com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver",
      "io.swagger.oas.annotations.servers.Server",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "com.fasterxml.jackson.databind.deser.std.StdDeserializer",
      "com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo",
      "com.fasterxml.jackson.databind.JsonSerializer",
      "io.swagger.oas.models.media.Encoding$StyleEnum",
      "com.fasterxml.jackson.databind.JsonNode",
      "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig",
      "com.fasterxml.jackson.databind.ser.ResolvableSerializer",
      "io.swagger.converter.ModelConverter",
      "com.fasterxml.jackson.databind.PropertyName",
      "com.fasterxml.jackson.databind.deser.BasicDeserializerFactory",
      "com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer",
      "com.fasterxml.jackson.databind.node.JsonNodeFactory",
      "com.fasterxml.jackson.databind.ser.impl.StringArraySerializer",
      "com.fasterxml.jackson.databind.cfg.MapperConfig",
      "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringFactoryKeyDeserializer",
      "com.fasterxml.jackson.annotation.JsonManagedReference",
      "com.fasterxml.jackson.databind.annotation.JsonDeserialize",
      "com.fasterxml.jackson.databind.MappingJsonFactory",
      "io.swagger.jackson.AbstractModelConverter",
      "com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer",
      "com.fasterxml.jackson.databind.ser.std.TimeZoneSerializer",
      "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair",
      "com.fasterxml.jackson.databind.ext.NioPathSerializer",
      "com.fasterxml.jackson.databind.ser.std.StringSerializer",
      "io.swagger.oas.annotations.servers.ServerVariable",
      "com.fasterxml.jackson.databind.JavaType",
      "com.fasterxml.jackson.databind.deser.BeanDeserializer",
      "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase",
      "io.swagger.oas.models.servers.ServerVariables",
      "com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver",
      "com.fasterxml.jackson.annotation.JacksonAnnotationValue",
      "com.fasterxml.jackson.core.JsonFactory",
      "io.swagger.oas.models.media.EncodingProperty$StyleEnum",
      "com.fasterxml.jackson.databind.node.BooleanNode",
      "com.fasterxml.jackson.databind.node.ShortNode",
      "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$EnumKD",
      "com.fasterxml.jackson.databind.util.StdDateFormat",
      "io.swagger.oas.models.media.MediaType",
      "io.swagger.oas.models.info.Info",
      "io.swagger.util.HeaderStyleEnumDeserializer",
      "com.fasterxml.jackson.databind.SerializationConfig",
      "com.fasterxml.jackson.annotation.JsonFormat$Value",
      "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase",
      "com.fasterxml.jackson.annotation.JsonInclude$Value",
      "com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer",
      "com.fasterxml.jackson.databind.deser.ResolvableDeserializer",
      "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer",
      "io.swagger.util.EncodingStyleEnumDeserializer",
      "com.fasterxml.jackson.databind.introspect.SimpleMixInResolver",
      "io.swagger.oas.models.security.SecurityScheme",
      "com.fasterxml.jackson.annotation.JsonFormat",
      "com.fasterxml.jackson.databind.ser.std.StdJdkSerializers",
      "com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer",
      "com.fasterxml.jackson.databind.deser.DeserializerFactory",
      "com.fasterxml.jackson.annotation.JsonTypeInfo",
      "com.fasterxml.jackson.annotation.JsonUnwrapped",
      "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver",
      "io.swagger.oas.models.parameters.RequestBody",
      "com.fasterxml.jackson.core.json.JsonGeneratorImpl",
      "com.fasterxml.jackson.databind.deser.AbstractDeserializer",
      "com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer",
      "io.swagger.oas.models.PathItem",
      "com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer",
      "io.swagger.oas.annotations.info.License",
      "com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer",
      "com.fasterxml.jackson.databind.module.SimpleDeserializers",
      "com.fasterxml.jackson.core.JsonFactory$Feature",
      "com.fasterxml.jackson.databind.ser.SerializerCache",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntegerSerializer",
      "com.fasterxml.jackson.core.io.DataOutputAsStream",
      "com.fasterxml.jackson.core.io.SegmentedStringWriter",
      "com.fasterxml.jackson.databind.type.TypeBindings",
      "com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator",
      "io.swagger.oas.models.media.UUIDSchema",
      "com.fasterxml.jackson.databind.SerializerProvider",
      "com.fasterxml.jackson.databind.cfg.ContextAttributes",
      "io.swagger.oas.models.Components",
      "io.swagger.oas.annotations.parameters.Parameters",
      "com.fasterxml.jackson.core.JsonGenerator$Feature",
      "com.fasterxml.jackson.databind.cfg.BaseSettings",
      "io.swagger.oas.models.headers.Header",
      "com.fasterxml.jackson.databind.ObjectMapper",
      "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl",
      "com.fasterxml.jackson.databind.deser.DeserializerCache",
      "com.fasterxml.jackson.databind.cfg.ConfigFeature",
      "org.apache.commons.lang3.math.NumberUtils",
      "com.fasterxml.jackson.annotation.JsonInclude",
      "com.fasterxml.jackson.databind.SerializationFeature"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(OperationParser_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "io.swagger.jaxrs2.OperationParser",
      "io.swagger.oas.models.parameters.Parameter$StyleEnum",
      "io.swagger.oas.annotations.enums.Explode",
      "io.swagger.util.Json",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "com.fasterxml.jackson.databind.SerializationFeature",
      "com.fasterxml.jackson.databind.DeserializationFeature",
      "io.swagger.jackson.AbstractModelConverter",
      "io.swagger.jackson.ModelResolver",
      "io.swagger.util.ObjectMapperFactory",
      "com.fasterxml.jackson.core.TreeCodec",
      "com.fasterxml.jackson.core.ObjectCodec",
      "com.fasterxml.jackson.core.type.ResolvedType",
      "com.fasterxml.jackson.databind.JavaType",
      "com.fasterxml.jackson.databind.type.TypeBindings",
      "com.fasterxml.jackson.databind.type.TypeBase",
      "com.fasterxml.jackson.databind.type.SimpleType",
      "com.fasterxml.jackson.databind.AnnotationIntrospector",
      "com.fasterxml.jackson.databind.ext.Java7SupportImpl",
      "com.fasterxml.jackson.databind.ext.Java7Support",
      "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector",
      "com.fasterxml.jackson.databind.util.LRUMap",
      "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility",
      "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std",
      "com.fasterxml.jackson.databind.cfg.BaseSettings",
      "com.fasterxml.jackson.databind.type.TypeParser",
      "com.fasterxml.jackson.databind.type.TypeFactory",
      "com.fasterxml.jackson.databind.util.StdDateFormat",
      "com.fasterxml.jackson.core.Base64Variant",
      "com.fasterxml.jackson.core.Base64Variants",
      "com.fasterxml.jackson.databind.ObjectMapper",
      "com.fasterxml.jackson.core.JsonFactory$Feature",
      "com.fasterxml.jackson.core.JsonParser$Feature",
      "com.fasterxml.jackson.core.JsonGenerator$Feature",
      "com.fasterxml.jackson.core.io.SerializedString",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter",
      "com.fasterxml.jackson.core.JsonFactory",
      "com.fasterxml.jackson.databind.MappingJsonFactory",
      "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer",
      "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$TableInfo",
      "com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer",
      "com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo",
      "com.fasterxml.jackson.databind.jsontype.SubtypeResolver",
      "com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver",
      "com.fasterxml.jackson.databind.util.RootNameLookup",
      "com.fasterxml.jackson.databind.introspect.SimpleMixInResolver",
      "com.fasterxml.jackson.databind.introspect.ClassIntrospector",
      "com.fasterxml.jackson.databind.introspect.Annotated",
      "com.fasterxml.jackson.databind.introspect.AnnotatedClass",
      "com.fasterxml.jackson.databind.introspect.AnnotationMap",
      "com.fasterxml.jackson.databind.BeanDescription",
      "com.fasterxml.jackson.databind.introspect.BasicBeanDescription",
      "com.fasterxml.jackson.databind.introspect.BasicClassIntrospector",
      "com.fasterxml.jackson.databind.cfg.ConfigOverrides",
      "com.fasterxml.jackson.annotation.JsonInclude$Value",
      "com.fasterxml.jackson.annotation.JsonFormat$Shape",
      "com.fasterxml.jackson.annotation.JsonFormat$Features",
      "com.fasterxml.jackson.annotation.JsonFormat$Value",
      "com.fasterxml.jackson.databind.cfg.MapperConfig",
      "com.fasterxml.jackson.databind.MapperFeature",
      "com.fasterxml.jackson.databind.cfg.MapperConfigBase",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter$NopIndenter",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter",
      "com.fasterxml.jackson.core.util.DefaultIndenter",
      "com.fasterxml.jackson.databind.SerializationConfig",
      "com.fasterxml.jackson.databind.cfg.ContextAttributes",
      "com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl",
      "com.fasterxml.jackson.databind.DeserializationConfig",
      "com.fasterxml.jackson.databind.node.JsonNodeFactory",
      "com.fasterxml.jackson.databind.DatabindContext",
      "com.fasterxml.jackson.databind.JsonSerializer",
      "com.fasterxml.jackson.databind.ser.std.StdSerializer",
      "com.fasterxml.jackson.databind.ser.impl.FailingSerializer",
      "com.fasterxml.jackson.databind.ser.impl.UnknownSerializer",
      "com.fasterxml.jackson.databind.SerializerProvider",
      "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider",
      "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl",
      "com.fasterxml.jackson.databind.ser.std.NullSerializer",
      "com.fasterxml.jackson.databind.ser.SerializerCache",
      "com.fasterxml.jackson.databind.DeserializationContext",
      "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext",
      "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl",
      "com.fasterxml.jackson.databind.deser.DeserializerFactory",
      "com.fasterxml.jackson.databind.PropertyName",
      "com.fasterxml.jackson.databind.deser.BasicDeserializerFactory",
      "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers",
      "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig",
      "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory",
      "com.fasterxml.jackson.databind.deser.DeserializerCache",
      "com.fasterxml.jackson.databind.ser.SerializerFactory",
      "com.fasterxml.jackson.databind.ser.std.StdScalarSerializer",
      "com.fasterxml.jackson.databind.ser.std.NonTypedScalarSerializerBase",
      "com.fasterxml.jackson.databind.ser.std.StringSerializer",
      "com.fasterxml.jackson.databind.ser.std.ToStringSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$Base",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntegerSerializer",
      "com.fasterxml.jackson.core.JsonParser$NumberType",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$LongSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntLikeSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$ShortSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$DoubleSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$FloatSerializer",
      "com.fasterxml.jackson.databind.ser.std.BooleanSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializer",
      "com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase",
      "com.fasterxml.jackson.databind.ser.std.CalendarSerializer",
      "com.fasterxml.jackson.databind.ser.std.DateSerializer",
      "com.fasterxml.jackson.databind.ser.std.StdJdkSerializers",
      "com.fasterxml.jackson.databind.ser.std.UUIDSerializer",
      "com.fasterxml.jackson.databind.ser.BasicSerializerFactory",
      "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig",
      "com.fasterxml.jackson.databind.ser.BeanSerializerFactory",
      "com.fasterxml.jackson.databind.Module",
      "com.fasterxml.jackson.databind.module.SimpleModule",
      "io.swagger.util.ObjectMapperFactory$1",
      "com.fasterxml.jackson.core.Version",
      "com.fasterxml.jackson.databind.ObjectMapper$1",
      "com.fasterxml.jackson.databind.ser.BeanSerializerModifier",
      "io.swagger.util.ObjectMapperFactory$1$1",
      "com.fasterxml.jackson.databind.util.ArrayBuilders",
      "io.swagger.util.DeserializationModule",
      "com.fasterxml.jackson.databind.JsonDeserializer",
      "io.swagger.util.PathDeserializer",
      "com.fasterxml.jackson.databind.module.SimpleDeserializers",
      "com.fasterxml.jackson.databind.type.ClassKey",
      "io.swagger.util.ResponseDeserializer",
      "io.swagger.util.ModelDeserializer",
      "io.swagger.util.ParameterDeserializer",
      "io.swagger.util.HeaderStyleEnumDeserializer",
      "io.swagger.util.EncodingStyleEnumDeserializer",
      "io.swagger.util.EncodingPropertyStyleEnumDeserializer",
      "io.swagger.util.SecuritySchemeDeserializer",
      "io.swagger.jackson.TypeNameResolver",
      "io.swagger.jackson.AbstractModelConverter$1",
      "io.swagger.jackson.SwaggerAnnotationIntrospector",
      "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair",
      "io.swagger.converter.ModelConverters",
      "io.swagger.oas.models.links.Link",
      "org.apache.commons.lang3.StringUtils",
      "io.swagger.oas.models.tags.Tag",
      "io.swagger.oas.models.info.License",
      "io.swagger.oas.models.media.Schema",
      "io.swagger.oas.models.media.ArraySchema",
      "io.swagger.oas.models.media.MediaType",
      "io.swagger.oas.models.examples.Example",
      "io.swagger.oas.models.media.Content",
      "io.swagger.oas.models.servers.Server",
      "io.swagger.oas.models.ExternalDocumentation",
      "io.swagger.oas.models.info.Info",
      "io.swagger.oas.models.info.Contact",
      "io.swagger.oas.models.parameters.RequestBody",
      "io.swagger.oas.models.media.Encoding",
      "io.swagger.oas.models.Operation",
      "io.swagger.oas.models.Components",
      "io.swagger.oas.models.headers.Header",
      "io.swagger.oas.models.responses.ApiResponse",
      "org.apache.commons.lang3.math.NumberUtils",
      "io.swagger.jaxrs2.util.ReaderUtils",
      "io.swagger.oas.models.parameters.Parameter",
      "io.swagger.util.ParameterProcessor",
      "io.swagger.oas.models.callbacks.Callback",
      "io.swagger.oas.models.responses.ApiResponses",
      "io.swagger.oas.models.PathItem",
      "io.swagger.oas.models.security.SecurityScheme",
      "io.swagger.oas.models.security.OAuthFlows",
      "io.swagger.oas.models.security.OAuthFlow",
      "io.swagger.oas.models.PathItem$HttpMethod",
      "io.swagger.oas.models.servers.ServerVariable",
      "io.swagger.oas.models.security.SecurityRequirement",
      "io.swagger.oas.models.servers.ServerVariables"
    );
  }
}
