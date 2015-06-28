/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.jniinchi;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import net.sf.jniinchi.JniInchiException;
import net.sf.jniinchi.JniInchiInput;
import net.sf.jniinchi.JniInchiStructure;

public class JniInchiInputEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sf.jniinchi.JniInchiInput.<init>(Lnet/sf/jniinchi/JniInchiStructure;)V: root-Branch
   * 2 net.sf.jniinchi.JniInchiInput.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      JniInchiStructure jniInchiStructure0 = new JniInchiStructure();
      JniInchiInput jniInchiInput0 = new JniInchiInput(jniInchiStructure0);
      assertEquals(0, jniInchiInput0.getNumBonds());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 net.sf.jniinchi.JniInchiInput.getOptions()Ljava/lang/String;: root-Branch
   * 2 net.sf.jniinchi.JniInchiInput.<init>()V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      JniInchiInput jniInchiInput0 = new JniInchiInput();
      String string0 = jniInchiInput0.getOptions();
      assertEquals("", string0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiInput.<init>(Ljava/util/List;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      JniInchiInput jniInchiInput0 = null;
      try {
        jniInchiInput0 = new JniInchiInput((List) linkedList0);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * net/sf/jnati/NativeCodeException
         */
      }
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiInput.<init>(Ljava/lang/String;)V: I8 Branch 1 IFNONNULL L48 - true
   */
  @Test
  public void test3()  throws Throwable  {
      JniInchiStructure jniInchiStructure0 = new JniInchiStructure();
      JniInchiInput jniInchiInput0 = null;
      try {
        jniInchiInput0 = new JniInchiInput(jniInchiStructure0, "61[E/|29Bl*~I&D");
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * net/sf/jnati/NativeCodeException
         */
      }
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiInput.<init>(Ljava/lang/String;)V: I8 Branch 1 IFNONNULL L48 - false
   */
  @Test
  public void test4()  throws Throwable  {
      JniInchiInput jniInchiInput0 = new JniInchiInput((String) null);
      assertEquals(0, jniInchiInput0.getNumAtoms());
  }
}
