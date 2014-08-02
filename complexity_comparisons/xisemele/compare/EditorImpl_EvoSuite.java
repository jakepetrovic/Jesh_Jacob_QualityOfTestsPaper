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
import net.sf.xisemele.exception.ElementNotFoundException;
import net.sf.xisemele.exception.NotWithinContextException;
import net.sf.xisemele.exception.RemoveRootNotPermittedException;
import net.sf.xisemele.exception.RootDuplicateException;
import net.sf.xisemele.exception.ValueNotPermittedException;
import net.sf.xisemele.exception.WithinContextDuplicateException;
import net.sf.xisemele.exception.WithinContextNotPermittedException;
import net.sf.xisemele.impl.EditorImpl;
import net.sf.xisemele.impl.WriterEditor;

public class EditorImplEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sf.xisemele.impl.EditorImpl.removeAttribute(Ljava/lang/String;)Lnet/sf/xisemele/api/Editor;: root-Branch
   * 2 net.sf.xisemele.impl.EditorImpl.<init>(Lnet/sf/xisemele/impl/WriterEditor;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      EditorImpl editorImpl0 = new EditorImpl((WriterEditor) null);
      // Undeclared exception!
      try {
        editorImpl0.removeAttribute((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.EditorImpl.element(Ljava/lang/String;Ljava/lang/Object;)Lnet/sf/xisemele/api/Editor;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      EditorImpl editorImpl0 = new EditorImpl((WriterEditor) null);
      // Undeclared exception!
      try {
        editorImpl0.element("", "");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.EditorImpl.attribute(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)Lnet/sf/xisemele/api/Editor;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      EditorImpl editorImpl0 = new EditorImpl((WriterEditor) null);
      Date date0 = new Date((-1593L));
      // Undeclared exception!
      try {
        editorImpl0.attribute((String) null, date0, (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.EditorImpl.within()Lnet/sf/xisemele/api/Editor;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      EditorImpl editorImpl0 = new EditorImpl((WriterEditor) null);
      // Undeclared exception!
      try {
        editorImpl0.within();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.EditorImpl.element(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)Lnet/sf/xisemele/api/Editor;: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      EditorImpl editorImpl0 = new EditorImpl((WriterEditor) null);
      Date date0 = new Date((-1670L));
      // Undeclared exception!
      try {
        editorImpl0.element("=W0M:kj!$v X;", date0, "=W0M:kj!$v X;");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.EditorImpl.defineAsCurrent(Ljava/lang/String;)Lnet/sf/xisemele/api/Editor;: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      EditorImpl editorImpl0 = new EditorImpl((WriterEditor) null);
      // Undeclared exception!
      try {
        editorImpl0.defineAsCurrent("net.sf.xisemele.within.context.not.permitted");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.EditorImpl.result()Lnet/sf/xisemele/api/Result;: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      EditorImpl editorImpl0 = new EditorImpl((WriterEditor) null);
      // Undeclared exception!
      try {
        editorImpl0.result();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.EditorImpl.value(Ljava/util/Date;Ljava/lang/String;)Lnet/sf/xisemele/api/Editor;: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      EditorImpl editorImpl0 = new EditorImpl((WriterEditor) null);
      Date date0 = new Date();
      // Undeclared exception!
      try {
        editorImpl0.value(date0, "");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.EditorImpl.removeChild(Ljava/lang/String;)Lnet/sf/xisemele/api/Editor;: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      EditorImpl editorImpl0 = new EditorImpl((WriterEditor) null);
      // Undeclared exception!
      try {
        editorImpl0.removeChild("");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.EditorImpl.endWithin()Lnet/sf/xisemele/api/Editor;: root-Branch
   */
  @Test
  public void test9()  throws Throwable  {
      EditorImpl editorImpl0 = new EditorImpl((WriterEditor) null);
      // Undeclared exception!
      try {
        editorImpl0.endWithin();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.EditorImpl.attribute(Ljava/lang/String;Ljava/lang/Object;)Lnet/sf/xisemele/api/Editor;: root-Branch
   */
  @Test
  public void test10()  throws Throwable  {
      EditorImpl editorImpl0 = new EditorImpl((WriterEditor) null);
      // Undeclared exception!
      try {
        editorImpl0.attribute("YdGV'tD", "YdGV'tD");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.EditorImpl.removeChildren()Lnet/sf/xisemele/api/Editor;: root-Branch
   */
  @Test
  public void test11()  throws Throwable  {
      EditorImpl editorImpl0 = new EditorImpl((WriterEditor) null);
      // Undeclared exception!
      try {
        editorImpl0.removeChildren();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.EditorImpl.remove()Lnet/sf/xisemele/api/Editor;: root-Branch
   */
  @Test
  public void test12()  throws Throwable  {
      EditorImpl editorImpl0 = new EditorImpl((WriterEditor) null);
      // Undeclared exception!
      try {
        editorImpl0.remove();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.EditorImpl.removeAttributes()Lnet/sf/xisemele/api/Editor;: root-Branch
   */
  @Test
  public void test13()  throws Throwable  {
      EditorImpl editorImpl0 = new EditorImpl((WriterEditor) null);
      // Undeclared exception!
      try {
        editorImpl0.removeAttributes();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.EditorImpl.element(Ljava/lang/String;)Lnet/sf/xisemele/api/Editor;: root-Branch
   */
  @Test
  public void test14()  throws Throwable  {
      EditorImpl editorImpl0 = new EditorImpl((WriterEditor) null);
      // Undeclared exception!
      try {
        editorImpl0.element("");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.EditorImpl.rename(Ljava/lang/String;)Lnet/sf/xisemele/api/Editor;: root-Branch
   */
  @Test
  public void test15()  throws Throwable  {
      EditorImpl editorImpl0 = new EditorImpl((WriterEditor) null);
      // Undeclared exception!
      try {
        editorImpl0.rename("YZ1@0S3G\"");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.EditorImpl.element(Lnet/sf/xisemele/api/Element;)Lnet/sf/xisemele/api/Editor;: root-Branch
   */
  @Test
  public void test16()  throws Throwable  {
      EditorImpl editorImpl0 = new EditorImpl((WriterEditor) null);
      // Undeclared exception!
      try {
        editorImpl0.element((Element) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.EditorImpl.document()Lorg/w3c/dom/Document;: root-Branch
   */
  @Test
  public void test17()  throws Throwable  {
      EditorImpl editorImpl0 = new EditorImpl((WriterEditor) null);
      // Undeclared exception!
      try {
        editorImpl0.document();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.EditorImpl.containsElement(Ljava/lang/String;)Z: root-Branch
   */
  @Test
  public void test18()  throws Throwable  {
      EditorImpl editorImpl0 = new EditorImpl((WriterEditor) null);
      // Undeclared exception!
      try {
        editorImpl0.containsElement("");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.EditorImpl.value(Ljava/lang/Object;)Lnet/sf/xisemele/api/Editor;: root-Branch
   */
  @Test
  public void test19()  throws Throwable  {
      EditorImpl editorImpl0 = new EditorImpl((WriterEditor) null);
      // Undeclared exception!
      try {
        editorImpl0.value((Object) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 20
  /*
   * 2 covered goals:
   * 1 net.sf.xisemele.impl.EditorImpl.removeChildren(Ljava/lang/String;)Lnet/sf/xisemele/api/Editor;: root-Branch
   * 2 net.sf.xisemele.impl.EditorImpl.<init>(Lnet/sf/xisemele/impl/WriterEditor;)V: root-Branch
   */
  @Test
  public void test20()  throws Throwable  {
      EditorImpl editorImpl0 = new EditorImpl((WriterEditor) null);
      // Undeclared exception!
      try {
        editorImpl0.removeChildren("I,UV=-");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
