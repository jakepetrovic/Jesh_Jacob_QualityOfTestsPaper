/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.io;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import org.jsecurity.io.IniResource;
import org.jsecurity.io.ResourceException;

public class IniResourceEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.jsecurity.io.IniResource.setSections(Ljava/util/Map;)V: root-Branch
   * 2 org.jsecurity.io.IniResource.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      IniResource iniResource0 = new IniResource();
      HashMap<String, Map<String, String>> hashMap0 = new HashMap<String, Map<String, String>>();
      iniResource0.setSections((Map<String, Map<String, String>>) hashMap0);
      assertEquals(true, hashMap0.isEmpty());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.jsecurity.io.IniResource.<init>(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      IniResource iniResource0 = null;
      try {
        iniResource0 = new IniResource("#,Z^]M");
        fail("Expecting exception: ResourceException");
      } catch(ResourceException e) {
        /*
         * Unable to load text resource from the resource path [#,Z^]M]
         */
      }
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * 1 org.jsecurity.io.IniResource.<init>(Ljava/io/Reader;)V: root-Branch
   * 2 org.jsecurity.io.IniResource.load(Ljava/util/Scanner;)V: I14 Branch 1 IFEQ L88 - true
   * 3 org.jsecurity.io.IniResource.load(Ljava/util/Scanner;)V: I141 Branch 8 IFGT L120 - true
   */
  @Test
  public void test2()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      IniResource iniResource0 = new IniResource((Reader) stringReader0);
      assertNull(iniResource0.getCharsetName());
  }

  //Test case number: 3
  /*
   * 4 covered goals:
   * 1 org.jsecurity.io.IniResource.<init>(Ljava/io/InputStream;)V: root-Branch
   * 2 org.jsecurity.io.IniResource.load(Ljava/util/Scanner;)V: I14 Branch 1 IFEQ L88 - false
   * 3 org.jsecurity.io.IniResource.load(Ljava/util/Scanner;)V: I24 Branch 2 IFNULL L92 - true
   * 4 org.jsecurity.io.IniResource.load(Ljava/util/Scanner;)V: I141 Branch 8 IFGT L120 - true
   */
  @Test
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      IniResource iniResource0 = new IniResource((InputStream) byteArrayInputStream0);
      assertEquals(-1, byteArrayInputStream0.read());
      assertEquals(0, byteArrayInputStream0.available());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 org.jsecurity.io.IniResource.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      IniResource iniResource0 = null;
      try {
        iniResource0 = new IniResource("EjS@A~*Ujy;", "EjS@A~*Ujy;");
        fail("Expecting exception: ResourceException");
      } catch(ResourceException e) {
        /*
         * Unable to load text resource from the resource path [EjS@A~*Ujy;]
         */
      }
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 org.jsecurity.io.IniResource.getSections()Ljava/util/Map;: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      IniResource iniResource0 = new IniResource();
      Map<String, Map<String, String>> map0 = iniResource0.getSections();
      assertEquals(true, map0.isEmpty());
  }

  //Test case number: 6
  /*
   * 8 covered goals:
   * 1 org.jsecurity.io.IniResource.load(Ljava/util/Scanner;)V: I24 Branch 2 IFNULL L92 - false
   * 2 org.jsecurity.io.IniResource.load(Ljava/util/Scanner;)V: I29 Branch 3 IFGT L92 - false
   * 3 org.jsecurity.io.IniResource.load(Ljava/util/Scanner;)V: I34 Branch 4 IFLE L92 - true
   * 4 org.jsecurity.io.IniResource.load(Ljava/util/Scanner;)V: I47 Branch 5 IFNULL L98 - true
   * 5 org.jsecurity.io.IniResource.isSectionHeader(Ljava/lang/String;)Z: I8 Branch 9 IFNULL L127 - false
   * 6 org.jsecurity.io.IniResource.isSectionHeader(Ljava/lang/String;)Z: I13 Branch 10 IFLE L127 - true
   * 7 org.jsecurity.io.IniResource.getSectionName(Ljava/lang/String;)Ljava/lang/String;: I9 Branch 12 IFEQ L132 - true
   * 8 org.jsecurity.io.IniResource.<init>()V: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      IniResource iniResource0 = new IniResource();
      byte[] byteArray0 = new byte[6];
      byteArray0[3] = (byte)90;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) byteArrayInputStream0);
      try {
        iniResource0.load((InputStream) bufferedInputStream0);
        fail("Expecting exception: ResourceException");
      } catch(ResourceException e) {
        /*
         * Unable to load data from input stream [java.io.BufferedInputStream@16f88474].
         */
      }
  }

  //Test case number: 7
  /*
   * 9 covered goals:
   * 1 org.jsecurity.io.IniResource.load(Ljava/util/Scanner;)V: I141 Branch 8 IFGT L120 - false
   * 2 org.jsecurity.io.IniResource.<init>(Ljava/util/Scanner;)V: root-Branch
   * 3 org.jsecurity.io.IniResource.load(Ljava/util/Scanner;)V: I14 Branch 1 IFEQ L88 - true
   * 4 org.jsecurity.io.IniResource.load(Ljava/util/Scanner;)V: I14 Branch 1 IFEQ L88 - false
   * 5 org.jsecurity.io.IniResource.load(Ljava/util/Scanner;)V: I24 Branch 2 IFNULL L92 - false
   * 6 org.jsecurity.io.IniResource.load(Ljava/util/Scanner;)V: I29 Branch 3 IFGT L92 - false
   * 7 org.jsecurity.io.IniResource.load(Ljava/util/Scanner;)V: I34 Branch 4 IFLE L92 - true
   * 8 org.jsecurity.io.IniResource.load(Ljava/util/Scanner;)V: I47 Branch 5 IFNULL L98 - true
   * 9 org.jsecurity.io.IniResource.isSectionHeader(Ljava/lang/String;)Z: I13 Branch 10 IFLE L127 - true
   */
  @Test
  public void test7()  throws Throwable  {
      Scanner scanner0 = new Scanner("*|=\"}[c");
      IniResource iniResource0 = new IniResource(scanner0);
      assertNull(iniResource0.getCharsetName());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 org.jsecurity.io.IniResource.isSectionHeader(Ljava/lang/String;)Z: I8 Branch 9 IFNULL L127 - true
   */
  @Test
  public void test8()  throws Throwable  {
      String string0 = IniResource.getSectionName("");
      assertNull(string0);
  }

  //Test case number: 9
  /*
   * 4 covered goals:
   * 1 org.jsecurity.io.IniResource.isSectionHeader(Ljava/lang/String;)Z: I13 Branch 10 IFLE L127 - false
   * 2 org.jsecurity.io.IniResource.isSectionHeader(Ljava/lang/String;)Z: I17 Branch 11 IFLE L127 - true
   * 3 org.jsecurity.io.IniResource.getSectionName(Ljava/lang/String;)Ljava/lang/String;: I9 Branch 12 IFEQ L132 - true
   * 4 org.jsecurity.io.IniResource.isSectionHeader(Ljava/lang/String;)Z: I8 Branch 9 IFNULL L127 - false
   */
  @Test
  public void test9()  throws Throwable  {
      String string0 = IniResource.getSectionName("[LOOKUP] No resource file with name 'META-INF/services/org.apache.commons.logging.LogFactory' found.");
      assertNull(string0);
  }
}