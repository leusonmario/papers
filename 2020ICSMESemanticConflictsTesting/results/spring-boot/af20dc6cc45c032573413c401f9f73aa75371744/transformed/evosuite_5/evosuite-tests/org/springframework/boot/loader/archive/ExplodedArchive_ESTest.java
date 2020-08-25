/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 30 00:21:47 GMT 2020
 */

package org.springframework.boot.loader.archive;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.jar.Attributes;
import java.util.jar.Manifest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.springframework.boot.loader.archive.Archive;
import org.springframework.boot.loader.archive.ExplodedArchive;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExplodedArchive_ESTest extends ExplodedArchive_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      ExplodedArchive.FileEntry explodedArchive_FileEntry0 = new ExplodedArchive.FileEntry();
      String string0 = "4?^148";
      File file0 = MockFile.createTempFile(string0, string0, explodedArchive_FileEntry0.file);
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      String string1 = explodedArchive_FileEntry0.getName();
      ExplodedArchive explodedArchive0 = null;
      try {
        explodedArchive0 = new ExplodedArchive(file0, boolean0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid source folder /tmp/4?^14804?^148
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      ExplodedArchive explodedArchive0 = new ExplodedArchive();
      String string0 = explodedArchive0.toString();
      Manifest manifest0 = new Manifest();
      // Undeclared exception!
      try { 
        explodedArchive0.getUrl();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      String string0 = ";;4@{(j4b8";
      String string1 = "Not a file URL";
      MockFile mockFile0 = new MockFile(string0);
      boolean boolean0 = false;
      ExplodedArchive explodedArchive0 = null;
      try {
        explodedArchive0 = new ExplodedArchive(mockFile0, boolean0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid source folder ;;4@{(j4b8
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      String string0 = "org.springframework.boot.loader.archive.ExplodedArchive$FileEntryIterator$EntryComparator";
      String string1 = "Hs,";
      MockFile mockFile0 = new MockFile(string0);
      File file0 = mockFile0.getAbsoluteFile();
      File file1 = MockFile.createTempFile(string0, string1, (File) mockFile0);
      MockFile mockFile1 = new MockFile(file1, string1);
      ExplodedArchive.FileEntry explodedArchive_FileEntry0 = new ExplodedArchive.FileEntry(string0, mockFile1);
      ExplodedArchive explodedArchive0 = new ExplodedArchive();
      // Undeclared exception!
      try { 
        explodedArchive0.getNestedArchive(explodedArchive_FileEntry0);
      } catch(IllegalArgumentException e) {
         //
         // File must exist
         //
         verifyException("org.springframework.boot.loader.data.RandomAccessDataFile", e);
      }
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      ExplodedArchive.FileEntryIterator explodedArchive_FileEntryIterator0 = new ExplodedArchive.FileEntryIterator();
      // Undeclared exception!
      try { 
        explodedArchive_FileEntryIterator0.remove();
      } catch(UnsupportedOperationException e) {
         //
         // remove
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive$FileEntryIterator", e);
      }
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      String string0 = "";
      MockFile mockFile0 = new MockFile(string0, string0);
      boolean boolean0 = false;
      ExplodedArchive explodedArchive0 = new ExplodedArchive(mockFile0, boolean0);
      ExplodedArchive.FileEntry explodedArchive_FileEntry0 = new ExplodedArchive.FileEntry(string0, mockFile0);
      Manifest manifest0 = explodedArchive0.getManifest();
      Archive archive0 = explodedArchive0.getNestedArchive(explodedArchive_FileEntry0);
      boolean boolean1 = explodedArchive_FileEntry0.isDirectory();
      boolean boolean2 = explodedArchive_FileEntry0.isDirectory();
      boolean boolean3 = true;
      Archive.EntryFilter archive_EntryFilter0 = mock(Archive.EntryFilter.class, new ViolatedAssumptionAnswer());
      doReturn(boolean3, explodedArchive0.recursive, boolean0).when(archive_EntryFilter0).matches(any(org.springframework.boot.loader.archive.Archive.Entry.class));
      List<Archive> list0 = explodedArchive0.getNestedArchives(archive_EntryFilter0);
      Manifest manifest1 = archive0.getManifest();
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      String string0 = "";
      MockFile mockFile0 = new MockFile(string0, string0);
      String string1 = "NA*";
      boolean boolean0 = true;
      ExplodedArchive.FileEntryIterator explodedArchive_FileEntryIterator0 = new ExplodedArchive.FileEntryIterator(mockFile0, boolean0);
      Archive.Entry archive_Entry0 = explodedArchive_FileEntryIterator0.next();
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      ExplodedArchive explodedArchive0 = new ExplodedArchive();
      String string0 = "users";
      File file0 = MockFile.createTempFile(string0, string0);
      explodedArchive0.manifestFile = file0;
      Manifest manifest0 = explodedArchive0.getManifest();
      Manifest manifest1 = explodedArchive0.getManifest();
      ExplodedArchive.FileEntryIterator explodedArchive_FileEntryIterator0 = new ExplodedArchive.FileEntryIterator(explodedArchive0.manifestFile, explodedArchive0.recursive);
      EvoSuiteFile evoSuiteFile0 = null;
      MockFile mockFile0 = new MockFile(string0, string0);
      String string1 = "Invalid source folder ";
      boolean boolean0 = FileSystemHandling.appendStringToFile(evoSuiteFile0, string1);
      // Undeclared exception!
      try { 
        explodedArchive_FileEntryIterator0.next();
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive$FileEntryIterator", e);
      }
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      ExplodedArchive.FileEntryIterator explodedArchive_FileEntryIterator0 = new ExplodedArchive.FileEntryIterator();
      ExplodedArchive.FileEntryIterator explodedArchive_FileEntryIterator1 = null;
      try {
        explodedArchive_FileEntryIterator1 = new ExplodedArchive.FileEntryIterator(explodedArchive_FileEntryIterator0.root, explodedArchive_FileEntryIterator0.recursive);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive$FileEntryIterator", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      File file0 = null;
      String string0 = "3|~vJtyN$j/|z7BR";
      MockFile mockFile0 = new MockFile(file0, string0);
      boolean boolean0 = true;
      ExplodedArchive.FileEntryIterator explodedArchive_FileEntryIterator0 = new ExplodedArchive.FileEntryIterator(mockFile0, boolean0);
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      ArrayDeque<Iterator<File>> arrayDeque0 = new ArrayDeque<Iterator<File>>();
      ExplodedArchive explodedArchive0 = new ExplodedArchive();
      // Undeclared exception!
      try { 
        explodedArchive0.getManifest();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive", e);
      }
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      File file0 = null;
      boolean boolean0 = false;
      ExplodedArchive explodedArchive0 = null;
      try {
        explodedArchive0 = new ExplodedArchive(file0, boolean0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive", e);
      }
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      String string0 = "GR:A->vol4CnO";
      String string1 = "Zv=[v`yu6][,";
      File file0 = MockFile.createTempFile(string0, string1);
      ExplodedArchive explodedArchive0 = null;
      try {
        explodedArchive0 = new ExplodedArchive(file0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid source folder /tmp/GR:A->vol4CnO0Zv=[v`yu6][,
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive", e);
      }
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      ExplodedArchive.FileEntryIterator explodedArchive_FileEntryIterator0 = new ExplodedArchive.FileEntryIterator();
      // Undeclared exception!
      try { 
        explodedArchive_FileEntryIterator0.next();
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive$FileEntryIterator", e);
      }
  }

  @Test(timeout = 11000)
  public void test14()  throws Throwable  {
      ExplodedArchive.FileEntry explodedArchive_FileEntry0 = new ExplodedArchive.FileEntry();
      String string0 = explodedArchive_FileEntry0.getName();
      ExplodedArchive explodedArchive0 = null;
      try {
        explodedArchive0 = new ExplodedArchive(explodedArchive_FileEntry0.file);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive", e);
      }
  }

  @Test(timeout = 11000)
  public void test15()  throws Throwable  {
      ExplodedArchive explodedArchive0 = new ExplodedArchive();
      String string0 = explodedArchive0.toString();
      String string1 = explodedArchive0.toString();
      // Undeclared exception!
      try { 
        explodedArchive0.iterator();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive$FileEntryIterator", e);
      }
  }

  @Test(timeout = 11000)
  public void test16()  throws Throwable  {
      ExplodedArchive explodedArchive0 = new ExplodedArchive();
      // Undeclared exception!
      try { 
        explodedArchive0.getManifest();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive", e);
      }
  }

  @Test(timeout = 11000)
  public void test17()  throws Throwable  {
      String string0 = "";
      String string1 = "Unable to find fallback handler";
      MockFile mockFile0 = new MockFile(string0, string1);
      MockFile mockFile1 = new MockFile(mockFile0, string0);
      boolean boolean0 = true;
      ExplodedArchive explodedArchive0 = null;
      try {
        explodedArchive0 = new ExplodedArchive(mockFile1, boolean0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid source folder /Unable to find fallback handler
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive", e);
      }
  }

  @Test(timeout = 11000)
  public void test18()  throws Throwable  {
      String string0 = "";
      MockFile mockFile0 = new MockFile(string0);
      boolean boolean0 = true;
      ExplodedArchive.FileEntryIterator explodedArchive_FileEntryIterator0 = new ExplodedArchive.FileEntryIterator(mockFile0, boolean0);
      // Undeclared exception!
      try { 
        explodedArchive_FileEntryIterator0.next();
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive$FileEntryIterator", e);
      }
  }

  @Test(timeout = 11000)
  public void test19()  throws Throwable  {
      String string0 = "";
      MockFile mockFile0 = new MockFile(string0, string0);
      ExplodedArchive.FileEntry explodedArchive_FileEntry0 = new ExplodedArchive.FileEntry(string0, mockFile0);
      File file0 = explodedArchive_FileEntry0.getFile();
      String string1 = explodedArchive_FileEntry0.getName();
  }

  @Test(timeout = 11000)
  public void test20()  throws Throwable  {
      ExplodedArchive.FileEntry explodedArchive_FileEntry0 = new ExplodedArchive.FileEntry();
      // Undeclared exception!
      try { 
        explodedArchive_FileEntry0.isDirectory();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive$FileEntry", e);
      }
  }

  @Test(timeout = 11000)
  public void test21()  throws Throwable  {
      ExplodedArchive explodedArchive0 = new ExplodedArchive();
      // Undeclared exception!
      try { 
        explodedArchive0.iterator();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive$FileEntryIterator", e);
      }
  }

  @Test(timeout = 11000)
  public void test22()  throws Throwable  {
      String string0 = "3h^";
      File file0 = MockFile.createTempFile(string0, string0);
      ExplodedArchive.FileEntry explodedArchive_FileEntry0 = new ExplodedArchive.FileEntry(string0, file0);
      boolean boolean0 = explodedArchive_FileEntry0.isDirectory();
      ExplodedArchive explodedArchive0 = null;
      try {
        explodedArchive0 = new ExplodedArchive(explodedArchive_FileEntry0.file);
      } catch(IllegalArgumentException e) {
         //
         // Invalid source folder /tmp/3h^03h^
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive", e);
      }
  }

  @Test(timeout = 11000)
  public void test23()  throws Throwable  {
      String string0 = "";
      MockFile mockFile0 = new MockFile(string0, string0);
      ExplodedArchive explodedArchive0 = new ExplodedArchive(mockFile0);
      String string1 = "org.springframework.boot.loader.data.RandomAccessDataFile";
      ExplodedArchive.FileEntry explodedArchive_FileEntry0 = new ExplodedArchive.FileEntry(string1, explodedArchive0.manifestFile);
      // Undeclared exception!
      try { 
        explodedArchive0.getNestedArchive(explodedArchive_FileEntry0);
      } catch(IllegalArgumentException e) {
         //
         // File must exist
         //
         verifyException("org.springframework.boot.loader.data.RandomAccessDataFile", e);
      }
  }

  @Test(timeout = 11000)
  public void test24()  throws Throwable  {
      String string0 = "6ip[Y~2{W";
      MockFile mockFile0 = new MockFile(string0, string0);
      MockFile mockFile1 = new MockFile(mockFile0, string0);
      boolean boolean0 = false;
      ExplodedArchive.FileEntryIterator explodedArchive_FileEntryIterator0 = new ExplodedArchive.FileEntryIterator(mockFile1, boolean0);
      boolean boolean1 = explodedArchive_FileEntryIterator0.hasNext();
  }

  @Test(timeout = 11000)
  public void test25()  throws Throwable  {
      ExplodedArchive explodedArchive0 = new ExplodedArchive();
      boolean boolean0 = false;
      Archive.EntryFilter archive_EntryFilter0 = null;
      // Undeclared exception!
      try { 
        explodedArchive0.getNestedArchives(archive_EntryFilter0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive$FileEntryIterator", e);
      }
  }

  @Test(timeout = 11000)
  public void test26()  throws Throwable  {
      ExplodedArchive explodedArchive0 = new ExplodedArchive();
      ExplodedArchive.SKIPPED_NAMES = explodedArchive0.SKIPPED_NAMES;
      Archive.EntryFilter archive_EntryFilter0 = mock(Archive.EntryFilter.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        explodedArchive0.getNestedArchives(archive_EntryFilter0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive$FileEntryIterator", e);
      }
  }

  @Test(timeout = 11000)
  public void test27()  throws Throwable  {
      ExplodedArchive explodedArchive0 = new ExplodedArchive();
      String string0 = "";
      URI uRI0 = MockURI.aFileURI;
      URI uRI1 = MockURI.normalize(uRI0);
      MockFile mockFile0 = new MockFile(uRI1);
      explodedArchive0.manifestFile = (File) mockFile0;
      MockFile mockFile1 = new MockFile(explodedArchive0.manifestFile, string0);
      File file0 = explodedArchive0.getManifestFile(mockFile1);
      // Undeclared exception!
      try { 
        explodedArchive0.iterator();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive$FileEntryIterator", e);
      }
  }

  @Test(timeout = 11000)
  public void test28()  throws Throwable  {
      String string0 = "";
      MockFile mockFile0 = new MockFile(string0, string0);
      boolean boolean0 = false;
      ExplodedArchive explodedArchive0 = new ExplodedArchive(mockFile0, boolean0);
      Iterator<Archive.Entry> iterator0 = explodedArchive0.iterator();
      ExplodedArchive.FileEntry explodedArchive_FileEntry0 = new ExplodedArchive.FileEntry(string0, mockFile0);
      Manifest manifest0 = explodedArchive0.getManifest();
      explodedArchive0.manifest = manifest0;
      Spliterator<Archive.Entry> spliterator0 = explodedArchive0.spliterator();
      Archive.EntryFilter archive_EntryFilter0 = mock(Archive.EntryFilter.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false).when(archive_EntryFilter0).matches(any(org.springframework.boot.loader.archive.Archive.Entry.class));
      List<Archive> list0 = explodedArchive0.getNestedArchives(archive_EntryFilter0);
      explodedArchive_FileEntry0.file = explodedArchive0.root;
      explodedArchive0.recursive = boolean0;
      Archive archive0 = explodedArchive0.getNestedArchive(explodedArchive_FileEntry0);
      boolean boolean1 = explodedArchive_FileEntry0.isDirectory();
      ExplodedArchive.FileEntryIterator explodedArchive_FileEntryIterator0 = new ExplodedArchive.FileEntryIterator();
      boolean boolean2 = explodedArchive_FileEntryIterator0.hasNext();
      boolean boolean3 = explodedArchive_FileEntryIterator0.hasNext();
      boolean boolean4 = explodedArchive_FileEntry0.isDirectory();
      File file0 = explodedArchive_FileEntry0.getFile();
      Archive.EntryFilter archive_EntryFilter1 = mock(Archive.EntryFilter.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false).when(archive_EntryFilter1).matches(any(org.springframework.boot.loader.archive.Archive.Entry.class));
      List<Archive> list1 = explodedArchive0.getNestedArchives(archive_EntryFilter1);
  }

  @Test(timeout = 11000)
  public void test29()  throws Throwable  {
      ExplodedArchive.FileEntryIterator explodedArchive_FileEntryIterator0 = new ExplodedArchive.FileEntryIterator();
      File file0 = explodedArchive_FileEntryIterator0.poll();
  }

  @Test(timeout = 11000)
  public void test30()  throws Throwable  {
      String string0 = "@-BlP%X2Q{`Hwz";
      File file0 = null;
      ExplodedArchive.FileEntry explodedArchive_FileEntry0 = new ExplodedArchive.FileEntry(string0, file0);
      boolean boolean0 = true;
      ExplodedArchive explodedArchive0 = null;
      try {
        explodedArchive0 = new ExplodedArchive(file0, boolean0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive", e);
      }
  }

  @Test(timeout = 11000)
  public void test31()  throws Throwable  {
      File file0 = null;
      ExplodedArchive explodedArchive0 = null;
      try {
        explodedArchive0 = new ExplodedArchive(file0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive", e);
      }
  }

  @Test(timeout = 11000)
  public void test32()  throws Throwable  {
      ExplodedArchive.FileEntryIterator explodedArchive_FileEntryIterator0 = new ExplodedArchive.FileEntryIterator();
      // Undeclared exception!
      try { 
        explodedArchive_FileEntryIterator0.remove();
      } catch(UnsupportedOperationException e) {
         //
         // remove
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive$FileEntryIterator", e);
      }
  }

  @Test(timeout = 11000)
  public void test33()  throws Throwable  {
      ExplodedArchive.FileEntryIterator explodedArchive_FileEntryIterator0 = new ExplodedArchive.FileEntryIterator();
      String string0 = "";
      MockFile mockFile0 = new MockFile(string0);
      Iterator<File> iterator0 = explodedArchive_FileEntryIterator0.listFiles(mockFile0);
      ExplodedArchive.FileEntryIterator.EntryComparator explodedArchive_FileEntryIterator_EntryComparator0 = new ExplodedArchive.FileEntryIterator.EntryComparator();
      explodedArchive_FileEntryIterator0.current = (File) mockFile0;
      int int0 = explodedArchive_FileEntryIterator_EntryComparator0.compare((File) mockFile0, (File) mockFile0);
      boolean boolean0 = true;
      explodedArchive_FileEntryIterator0.recursive = boolean0;
      boolean boolean1 = false;
      Comparator<File> comparator0 = explodedArchive_FileEntryIterator_EntryComparator0.thenComparing(explodedArchive_FileEntryIterator0.entryComparator);
      ExplodedArchive explodedArchive0 = new ExplodedArchive(mockFile0, boolean1);
      String string1 = explodedArchive0.toString();
      ExplodedArchive.FileEntry explodedArchive_FileEntry0 = new ExplodedArchive.FileEntry();
      // Undeclared exception!
      try { 
        explodedArchive0.getNestedArchive(explodedArchive_FileEntry0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive", e);
      }
  }

  @Test(timeout = 11000)
  public void test34()  throws Throwable  {
      String string0 = "";
      MockFile mockFile0 = new MockFile(string0, string0);
      long long0 = 1151L;
      boolean boolean0 = mockFile0.setLastModified(long0);
      ExplodedArchive explodedArchive0 = new ExplodedArchive(mockFile0);
      boolean boolean1 = true;
      ExplodedArchive.FileEntryIterator explodedArchive_FileEntryIterator0 = new ExplodedArchive.FileEntryIterator(mockFile0, boolean1);
      Archive.Entry archive_Entry0 = explodedArchive_FileEntryIterator0.next();
      Archive archive0 = explodedArchive0.getNestedArchive(archive_Entry0);
      File file0 = mockFile0.getCanonicalFile();
      Spliterator<Archive.Entry> spliterator0 = explodedArchive0.spliterator();
      ExplodedArchive.FileEntry explodedArchive_FileEntry0 = new ExplodedArchive.FileEntry();
      // Undeclared exception!
      try { 
        explodedArchive0.getNestedArchive(explodedArchive_FileEntry0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive", e);
      }
  }

  @Test(timeout = 11000)
  public void test35()  throws Throwable  {
      String string0 = "0X''N8RbmFq[yN";
      MockFile mockFile0 = new MockFile(string0, string0);
      boolean boolean0 = true;
      ExplodedArchive.FileEntryIterator explodedArchive_FileEntryIterator0 = new ExplodedArchive.FileEntryIterator(mockFile0, boolean0);
      explodedArchive_FileEntryIterator0.current = (File) mockFile0;
      mockFile0.deleteOnExit();
      boolean boolean1 = explodedArchive_FileEntryIterator0.hasNext();
      boolean boolean2 = explodedArchive_FileEntryIterator0.hasNext();
      ExplodedArchive explodedArchive0 = new ExplodedArchive();
      ExplodedArchive.FileEntry explodedArchive_FileEntry0 = new ExplodedArchive.FileEntry(string0, explodedArchive_FileEntryIterator0.current);
      boolean boolean3 = explodedArchive_FileEntry0.isDirectory();
      // Undeclared exception!
      try { 
        explodedArchive0.getUrl();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive", e);
      }
  }

  @Test(timeout = 11000)
  public void test36()  throws Throwable  {
      String string0 = null;
      String string1 = "";
      MockFile mockFile0 = new MockFile(string0, string1);
      boolean boolean0 = true;
      boolean boolean1 = mockFile0.setWritable(boolean0, boolean0);
      boolean boolean2 = true;
      ExplodedArchive explodedArchive0 = new ExplodedArchive(mockFile0, boolean2);
      URL uRL0 = explodedArchive0.getUrl();
      String string2 = explodedArchive0.toString();
      String string3 = "*k/f/='x_Z'po1Pg";
      // Undeclared exception!
      try { 
        MockFile.createTempFile(string0, string3, explodedArchive0.root);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 11000)
  public void test37()  throws Throwable  {
      String string0 = "";
      MockFile mockFile0 = new MockFile(string0, string0);
      ExplodedArchive explodedArchive0 = new ExplodedArchive(mockFile0);
      String string1 = explodedArchive0.toString();
      ExplodedArchive.FileEntry explodedArchive_FileEntry0 = new ExplodedArchive.FileEntry(string1, explodedArchive0.manifestFile);
      String string2 = explodedArchive0.toString();
      File file0 = explodedArchive0.getManifestFile(explodedArchive_FileEntry0.file);
      String string3 = explodedArchive_FileEntry0.getName();
      File file1 = explodedArchive0.getManifestFile(explodedArchive_FileEntry0.file);
      ExplodedArchive.FileEntryIterator explodedArchive_FileEntryIterator0 = new ExplodedArchive.FileEntryIterator();
      boolean boolean0 = explodedArchive_FileEntryIterator0.hasNext();
      explodedArchive_FileEntry0.name = string0;
      Archive.EntryFilter archive_EntryFilter0 = mock(Archive.EntryFilter.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, false, false).when(archive_EntryFilter0).matches(any(org.springframework.boot.loader.archive.Archive.Entry.class));
      List<Archive> list0 = explodedArchive0.getNestedArchives(archive_EntryFilter0);
      // Undeclared exception!
      try { 
        explodedArchive0.getNestedArchive(explodedArchive_FileEntry0);
      } catch(IllegalArgumentException e) {
         //
         // File must exist
         //
         verifyException("org.springframework.boot.loader.data.RandomAccessDataFile", e);
      }
  }

  @Test(timeout = 11000)
  public void test38()  throws Throwable  {
      String string0 = "";
      MockFile mockFile0 = new MockFile(string0, string0);
      boolean boolean0 = false;
      ExplodedArchive explodedArchive0 = new ExplodedArchive(mockFile0, boolean0);
      Iterator<Archive.Entry> iterator0 = explodedArchive0.iterator();
      ExplodedArchive.FileEntry explodedArchive_FileEntry0 = new ExplodedArchive.FileEntry(string0, mockFile0);
      Manifest manifest0 = explodedArchive0.getManifest();
      explodedArchive0.manifest = manifest0;
      Spliterator<Archive.Entry> spliterator0 = explodedArchive0.spliterator();
      boolean boolean1 = true;
      Archive.EntryFilter archive_EntryFilter0 = mock(Archive.EntryFilter.class, new ViolatedAssumptionAnswer());
      doReturn(boolean0, explodedArchive0.recursive, boolean1).when(archive_EntryFilter0).matches(any(org.springframework.boot.loader.archive.Archive.Entry.class));
      List<Archive> list0 = explodedArchive0.getNestedArchives(archive_EntryFilter0);
      explodedArchive_FileEntry0.file = explodedArchive0.root;
      explodedArchive0.recursive = boolean0;
      ExplodedArchive explodedArchive1 = (ExplodedArchive)explodedArchive0.getNestedArchive(explodedArchive_FileEntry0);
      boolean boolean2 = explodedArchive_FileEntry0.isDirectory();
      ExplodedArchive.FileEntryIterator explodedArchive_FileEntryIterator0 = new ExplodedArchive.FileEntryIterator();
      boolean boolean3 = explodedArchive_FileEntryIterator0.hasNext();
      boolean boolean4 = explodedArchive_FileEntryIterator0.hasNext();
      boolean boolean5 = explodedArchive_FileEntry0.isDirectory();
      // Undeclared exception!
      try { 
        explodedArchive_FileEntryIterator0.next();
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive$FileEntryIterator", e);
      }
  }

  @Test(timeout = 11000)
  public void test39()  throws Throwable  {
      ExplodedArchive.FileEntry explodedArchive_FileEntry0 = new ExplodedArchive.FileEntry();
      String string0 = "2!?B";
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      explodedArchive_FileEntry0.file = (File) mockFile0;
      String string1 = "4?^148";
      File file0 = MockFile.createTempFile(string0, string1, explodedArchive_FileEntry0.file);
      explodedArchive_FileEntry0.file = file0;
      String string2 = null;
      explodedArchive_FileEntry0.name = string2;
      boolean boolean0 = explodedArchive_FileEntry0.isDirectory();
      String string3 = explodedArchive_FileEntry0.getName();
      String string4 = explodedArchive_FileEntry0.getName();
      ExplodedArchive explodedArchive0 = new ExplodedArchive();
      try { 
        explodedArchive0.getNestedArchive(explodedArchive_FileEntry0);
      } catch(FileNotFoundException e) {
         //
         // /tmp/foo.bar/2!?B04?^148 (Arquivo ou diret\u00F3rio n\u00E3o encontrado)
         //
         verifyException("java.util.zip.ZipFile", e);
      }
  }

  @Test(timeout = 11000)
  public void test40()  throws Throwable  {
      String string0 = "";
      MockFile mockFile0 = new MockFile(string0, string0);
      boolean boolean0 = false;
      ExplodedArchive explodedArchive0 = new ExplodedArchive(mockFile0, boolean0);
      Iterator<Archive.Entry> iterator0 = explodedArchive0.iterator();
      ExplodedArchive.FileEntry explodedArchive_FileEntry0 = new ExplodedArchive.FileEntry(string0, mockFile0);
      URL uRL0 = mockFile0.toURL();
      Manifest manifest0 = explodedArchive0.getManifest();
      explodedArchive0.manifest = manifest0;
      Spliterator<Archive.Entry> spliterator0 = explodedArchive0.spliterator();
      Archive.EntryFilter archive_EntryFilter0 = mock(Archive.EntryFilter.class, new ViolatedAssumptionAnswer());
      doReturn(boolean0, boolean0, explodedArchive0.recursive, false, false).when(archive_EntryFilter0).matches(any(org.springframework.boot.loader.archive.Archive.Entry.class));
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/META-INF/MANIFEST.MF");
      byte[] byteArray0 = new byte[6];
      byte byte0 = (byte) (-106);
      byteArray0[0] = byte0;
      byte byte1 = (byte) (-3);
      byteArray0[1] = byte1;
      byte byte2 = (byte) (-8);
      byteArray0[2] = byte2;
      byte byte3 = (byte)0;
      byteArray0[3] = byte3;
      byte byte4 = (byte)1;
      byteArray0[4] = byte4;
      byte byte5 = (byte) (-19);
      byteArray0[5] = byte5;
      boolean boolean1 = FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      List<Archive> list0 = explodedArchive0.getNestedArchives(archive_EntryFilter0);
      explodedArchive_FileEntry0.file = explodedArchive0.root;
      explodedArchive0.recursive = boolean0;
      Archive archive0 = explodedArchive0.getNestedArchive(explodedArchive_FileEntry0);
      boolean boolean2 = explodedArchive_FileEntry0.isDirectory();
      ExplodedArchive.FileEntryIterator explodedArchive_FileEntryIterator0 = new ExplodedArchive.FileEntryIterator();
      boolean boolean3 = explodedArchive_FileEntryIterator0.hasNext();
      boolean boolean4 = FileSystemHandling.shouldAllThrowIOExceptions();
      File file0 = explodedArchive_FileEntry0.getFile();
      boolean boolean5 = true;
      boolean boolean6 = false;
      Archive.EntryFilter archive_EntryFilter1 = mock(Archive.EntryFilter.class, new ViolatedAssumptionAnswer());
      doReturn(boolean5, boolean6, boolean0, false, false).when(archive_EntryFilter1).matches(any(org.springframework.boot.loader.archive.Archive.Entry.class));
      List<Archive> list1 = explodedArchive0.getNestedArchives(archive_EntryFilter1);
      try { 
        archive0.getManifest();
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 11000)
  public void test41()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/foo.bar/8k=8zMO\\~w?.4!mq/META-INF/MANIFEST.MF");
      String string0 = "new-nimrod";
      boolean boolean0 = FileSystemHandling.appendLineToFile(evoSuiteFile0, string0);
      ExplodedArchive explodedArchive0 = new ExplodedArchive();
      String string1 = "8k=8zMO\\~w?.4!mq";
      URI uRI0 = MockURI.aFileURI;
      URI uRI1 = MockURI.normalize(uRI0);
      boolean boolean1 = FileSystemHandling.shouldAllThrowIOExceptions();
      MockFile mockFile0 = new MockFile(uRI1);
      explodedArchive0.manifestFile = (File) mockFile0;
      MockFile mockFile1 = new MockFile(explodedArchive0.manifestFile, string1);
      try { 
        explodedArchive0.getManifest();
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 11000)
  public void test42()  throws Throwable  {
      ExplodedArchive explodedArchive0 = new ExplodedArchive();
      String string0 = "users";
      String string1 = "org.springframework.boot.loader.jar.JarFile";
      File file0 = MockFile.createTempFile(string0, string1);
      explodedArchive0.manifestFile = file0;
      Manifest manifest0 = explodedArchive0.getManifest();
      Manifest manifest1 = explodedArchive0.getManifest();
      ExplodedArchive.FileEntryIterator explodedArchive_FileEntryIterator0 = new ExplodedArchive.FileEntryIterator(explodedArchive0.manifestFile, explodedArchive0.recursive);
      EvoSuiteFile evoSuiteFile0 = null;
      String string2 = "G{\\x";
      boolean boolean0 = FileSystemHandling.appendLineToFile(evoSuiteFile0, string2);
      File file1 = explodedArchive_FileEntryIterator0.poll();
      // Undeclared exception!
      try { 
        explodedArchive_FileEntryIterator0.next();
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.loader.archive.ExplodedArchive$FileEntryIterator", e);
      }
  }
}
