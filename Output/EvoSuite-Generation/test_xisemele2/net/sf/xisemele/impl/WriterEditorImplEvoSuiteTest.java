/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.xisemele.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sf.xisemele.impl.Factory;
import net.sf.xisemele.impl.FormatterProvider;
import net.sf.xisemele.impl.WriterEditorImpl;
import org.w3c.dom.Document;

public class WriterEditorImplEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.WriterEditorImpl.<init>(Lnet/sf/xisemele/impl/Factory;Lnet/sf/xisemele/impl/FormatterProvider;Lorg/w3c/dom/Document;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      WriterEditorImpl writerEditorImpl0 = null;
      try {
        writerEditorImpl0 = new WriterEditorImpl((Factory) null, (FormatterProvider) null, (Document) null, "");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.WriterEditorImpl.<init>(Lnet/sf/xisemele/impl/Factory;Lnet/sf/xisemele/impl/FormatterProvider;Lorg/w3c/dom/Document;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      WriterEditorImpl writerEditorImpl0 = null;
      try {
        writerEditorImpl0 = new WriterEditorImpl((Factory) null, (FormatterProvider) null, (Document) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
