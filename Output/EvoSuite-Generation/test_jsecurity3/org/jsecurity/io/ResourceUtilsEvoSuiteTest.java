/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.io;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.jsecurity.io.ResourceUtils;

public class ResourceUtilsEvoSuiteTest {


  //Test case number: 0
  /*
   * 5 covered goals:
   * 1 org.jsecurity.io.ResourceUtils.stripPrefix(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * 2 org.jsecurity.io.ResourceUtils.resourceExists(Ljava/lang/String;)Z: I44 Branch 6 IFNULL L96 - true
   * 3 org.jsecurity.io.ResourceUtils.getInputStreamForPath(Ljava/lang/String;)Ljava/io/InputStream;: I6 Branch 8 IFLE L120 - false
   * 4 org.jsecurity.io.ResourceUtils.getInputStreamForPath(Ljava/lang/String;)Ljava/io/InputStream;: I53 Branch 11 IFNONNULL L133 - false
   * 5 org.jsecurity.io.ResourceUtils.loadFromClassPath(Ljava/lang/String;)Ljava/io/InputStream;: I4 Branch 14 IFEQ L160 - true
   */
  @Test
  public void test0()  throws Throwable  {
      boolean boolean0 = ResourceUtils.resourceExists("classpath:&o");
      assertEquals(false, boolean0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.jsecurity.io.ResourceUtils.hasResourcePrefix(Ljava/lang/String;)Z: I3 Branch 1 IFNULL L74 - true
   */
  @Test
  public void test1()  throws Throwable  {
      boolean boolean0 = ResourceUtils.hasResourcePrefix((String) null);
      assertEquals(false, boolean0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 org.jsecurity.io.ResourceUtils.hasResourcePrefix(Ljava/lang/String;)Z: I3 Branch 1 IFNULL L74 - false
   * 2 org.jsecurity.io.ResourceUtils.hasResourcePrefix(Ljava/lang/String;)Z: I8 Branch 2 IFGT L74 - true
   */
  @Test
  public void test2()  throws Throwable  {
      boolean boolean0 = ResourceUtils.hasResourcePrefix("classpath:&o");
      assertEquals(true, boolean0);
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * 1 org.jsecurity.io.ResourceUtils.hasResourcePrefix(Ljava/lang/String;)Z: I8 Branch 2 IFGT L74 - false
   * 2 org.jsecurity.io.ResourceUtils.hasResourcePrefix(Ljava/lang/String;)Z: I13 Branch 3 IFGT L74 - false
   * 3 org.jsecurity.io.ResourceUtils.hasResourcePrefix(Ljava/lang/String;)Z: I18 Branch 4 IFLE L74 - false
   */
  @Test
  public void test3()  throws Throwable  {
      boolean boolean0 = ResourceUtils.hasResourcePrefix("file:[ENV] F@und system pop%rty [");
      assertEquals(true, boolean0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 org.jsecurity.io.ResourceUtils.hasResourcePrefix(Ljava/lang/String;)Z: I13 Branch 3 IFGT L74 - true
   */
  @Test
  public void test4()  throws Throwable  {
      boolean boolean0 = ResourceUtils.hasResourcePrefix("url:[ENV] Found system property [");
      assertEquals(true, boolean0);
  }

  //Test case number: 5
  /*
   * 4 covered goals:
   * 1 org.jsecurity.io.ResourceUtils.hasResourcePrefix(Ljava/lang/String;)Z: I18 Branch 4 IFLE L74 - true
   * 2 org.jsecurity.io.ResourceUtils.hasResourcePrefix(Ljava/lang/String;)Z: I3 Branch 1 IFNULL L74 - false
   * 3 org.jsecurity.io.ResourceUtils.hasResourcePrefix(Ljava/lang/String;)Z: I8 Branch 2 IFGT L74 - false
   * 4 org.jsecurity.io.ResourceUtils.hasResourcePrefix(Ljava/lang/String;)Z: I13 Branch 3 IFGT L74 - false
   */
  @Test
  public void test5()  throws Throwable  {
      boolean boolean0 = ResourceUtils.hasResourcePrefix("B} h$v:0#gh");
      assertEquals(false, boolean0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 org.jsecurity.io.ResourceUtils.resourceExists(Ljava/lang/String;)Z: I63 Branch 7 IFNULL L96 - true
   */
  @Test
  public void test6()  throws Throwable  {
      // Undeclared exception!
      try {
        ResourceUtils.resourceExists((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 7
  /*
   * 4 covered goals:
   * 1 org.jsecurity.io.ResourceUtils.getInputStreamForPath(Ljava/lang/String;)Ljava/io/InputStream;: I6 Branch 8 IFLE L120 - true
   * 2 org.jsecurity.io.ResourceUtils.getInputStreamForPath(Ljava/lang/String;)Ljava/io/InputStream;: I21 Branch 9 IFLE L123 - true
   * 3 org.jsecurity.io.ResourceUtils.getInputStreamForPath(Ljava/lang/String;)Ljava/io/InputStream;: I36 Branch 10 IFLE L126 - false
   * 4 org.jsecurity.io.ResourceUtils.loadFromFile(Ljava/lang/String;)Ljava/io/InputStream;: I4 Branch 12 IFEQ L142 - true
   */
  @Test
  public void test7()  throws Throwable  {
      boolean boolean0 = ResourceUtils.resourceExists("file:[ENV] F@und system pop%rty [");
      assertEquals(false, boolean0);
  }

  //Test case number: 8
  /*
   * 3 covered goals:
   * 1 org.jsecurity.io.ResourceUtils.getInputStreamForPath(Ljava/lang/String;)Ljava/io/InputStream;: I21 Branch 9 IFLE L123 - false
   * 2 org.jsecurity.io.ResourceUtils.loadFromUrl(Ljava/lang/String;)Ljava/io/InputStream;: I4 Branch 13 IFEQ L151 - true
   * 3 org.jsecurity.io.ResourceUtils.stripPrefix(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      boolean boolean0 = ResourceUtils.resourceExists("url:[ENV] Found system property [");
      assertEquals(false, boolean0);
  }

  //Test case number: 9
  /*
   * 5 covered goals:
   * 1 org.jsecurity.io.ResourceUtils.getInputStreamForPath(Ljava/lang/String;)Ljava/io/InputStream;: I36 Branch 10 IFLE L126 - true
   * 2 org.jsecurity.io.ResourceUtils.loadFromFile(Ljava/lang/String;)Ljava/io/InputStream;: I4 Branch 12 IFEQ L142 - true
   * 3 org.jsecurity.io.ResourceUtils.getInputStreamForPath(Ljava/lang/String;)Ljava/io/InputStream;: I6 Branch 8 IFLE L120 - true
   * 4 org.jsecurity.io.ResourceUtils.getInputStreamForPath(Ljava/lang/String;)Ljava/io/InputStream;: I21 Branch 9 IFLE L123 - true
   * 5 org.jsecurity.io.ResourceUtils.resourceExists(Ljava/lang/String;)Z: I44 Branch 6 IFNULL L96 - true
   */
  @Test
  public void test9()  throws Throwable  {
      boolean boolean0 = ResourceUtils.resourceExists("B} h$v:0#gh");
      assertEquals(false, boolean0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 org.jsecurity.io.ResourceUtils.close(Ljava/io/InputStream;)V: I3 Branch 15 IFNULL L172 - true
   */
  @Test
  public void test10()  throws Throwable  {
      ResourceUtils.close((InputStream) null);
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 org.jsecurity.io.ResourceUtils.close(Ljava/io/InputStream;)V: I3 Branch 15 IFNULL L172 - false
   */
  @Test
  public void test11()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      ResourceUtils.close((InputStream) pipedInputStream0);
  }
}