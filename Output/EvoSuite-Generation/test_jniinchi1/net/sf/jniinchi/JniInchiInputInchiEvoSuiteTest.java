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
import net.sf.jniinchi.JniInchiInputInchi;

public class JniInchiInputInchiEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiInputInchi.<init>(Ljava/lang/String;Ljava/util/List;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      JniInchiInputInchi jniInchiInputInchi0 = null;
      try {
        jniInchiInputInchi0 = new JniInchiInputInchi((String) null, (List) linkedList0);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * net/sf/jnati/NativeCodeException
         */
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiInputInchi.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      JniInchiInputInchi jniInchiInputInchi0 = null;
      try {
        jniInchiInputInchi0 = new JniInchiInputInchi("", "");
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * net/sf/jnati/NativeCodeException
         */
      }
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 net.sf.jniinchi.JniInchiInputInchi.getInchi()Ljava/lang/String;: root-Branch
   * 2 net.sf.jniinchi.JniInchiInputInchi.<init>(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      JniInchiInputInchi jniInchiInputInchi0 = new JniInchiInputInchi("");
      String string0 = jniInchiInputInchi0.getInchi();
      assertEquals("", string0);
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 net.sf.jniinchi.JniInchiInputInchi.getOptions()Ljava/lang/String;: root-Branch
   * 2 net.sf.jniinchi.JniInchiInputInchi.<init>(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      JniInchiInputInchi jniInchiInputInchi0 = new JniInchiInputInchi("");
      String string0 = jniInchiInputInchi0.getOptions();
      assertEquals("", string0);
  }
}
