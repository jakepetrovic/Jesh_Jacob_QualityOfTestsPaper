/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.xisemele.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.Date;
import net.sf.xisemele.api.Element;
import net.sf.xisemele.exception.AttributeNotPermittedException;
import net.sf.xisemele.exception.InvalidNameException;
import net.sf.xisemele.exception.NotWithinContextException;
import net.sf.xisemele.exception.RootDuplicateException;
import net.sf.xisemele.exception.WithinContextNotPermittedException;
import net.sf.xisemele.impl.WriterEditor;
import net.sf.xisemele.impl.WriterImpl;

public class WriterImplEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sf.xisemele.impl.WriterImpl.attribute(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)Lnet/sf/xisemele/api/Writer;: root-Branch
   * 2 net.sf.xisemele.impl.WriterImpl.<init>(Lnet/sf/xisemele/impl/WriterEditor;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      WriterImpl writerImpl0 = new WriterImpl((WriterEditor) null);
      Date date0 = new Date();
      // Undeclared exception!
      try {
        writerImpl0.attribute("W'", date0, "W'");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.WriterImpl.element(Ljava/lang/String;)Lnet/sf/xisemele/api/Writer;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      WriterImpl writerImpl0 = new WriterImpl((WriterEditor) null);
      // Undeclared exception!
      try {
        writerImpl0.element("3By-~\" T0");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.WriterImpl.within()Lnet/sf/xisemele/api/Writer;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      WriterImpl writerImpl0 = new WriterImpl((WriterEditor) null);
      // Undeclared exception!
      try {
        writerImpl0.within();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.WriterImpl.element(Lnet/sf/xisemele/api/Element;)Lnet/sf/xisemele/api/Writer;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      WriterImpl writerImpl0 = new WriterImpl((WriterEditor) null);
      // Undeclared exception!
      try {
        writerImpl0.element((Element) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.WriterImpl.result()Lnet/sf/xisemele/api/Result;: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      WriterImpl writerImpl0 = new WriterImpl((WriterEditor) null);
      // Undeclared exception!
      try {
        writerImpl0.result();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.WriterImpl.element(Ljava/lang/String;Ljava/lang/Object;)Lnet/sf/xisemele/api/Writer;: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      WriterImpl writerImpl0 = new WriterImpl((WriterEditor) null);
      // Undeclared exception!
      try {
        writerImpl0.element((String) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.WriterImpl.element(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)Lnet/sf/xisemele/api/Writer;: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      WriterImpl writerImpl0 = new WriterImpl((WriterEditor) null);
      Date date0 = new Date();
      // Undeclared exception!
      try {
        writerImpl0.element((String) null, date0, (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.WriterImpl.document()Lorg/w3c/dom/Document;: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      WriterImpl writerImpl0 = new WriterImpl((WriterEditor) null);
      // Undeclared exception!
      try {
        writerImpl0.document();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.WriterImpl.endWithin()Lnet/sf/xisemele/api/Writer;: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      WriterImpl writerImpl0 = new WriterImpl((WriterEditor) null);
      // Undeclared exception!
      try {
        writerImpl0.endWithin();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 9
  /*
   * 2 covered goals:
   * 1 net.sf.xisemele.impl.WriterImpl.attribute(Ljava/lang/String;Ljava/lang/Object;)Lnet/sf/xisemele/api/Writer;: root-Branch
   * 2 net.sf.xisemele.impl.WriterImpl.<init>(Lnet/sf/xisemele/impl/WriterEditor;)V: root-Branch
   */
  @Test
  public void test9()  throws Throwable  {
      WriterImpl writerImpl0 = new WriterImpl((WriterEditor) null);
      // Undeclared exception!
      try {
        writerImpl0.attribute("T", "Wed Dec 31 17:00:00 MST 1969");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
