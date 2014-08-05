/*
 * This file was automatically generated by EvoSuite
 */

package com.allenstudio.ir.ui;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.core.plugins.CommonNote;
import com.allenstudio.ir.event.NoteListDataListener;
import com.allenstudio.ir.ui.DefaultNoteListModel;
import java.util.Enumeration;
import java.util.NoSuchElementException;

public class DefaultNoteListModelEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 com.allenstudio.ir.ui.DefaultNoteListModel.fireItemAdded(Ljava/lang/Object;I)V: root-Branch
   * 2 com.allenstudio.ir.ui.DefaultNoteListModel.insertElementAt(Lcom/allenstudio/ir/core/plugins/AbstractNote;I)V: root-Branch
   * 3 com.allenstudio.ir.ui.DefaultNoteListModel.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      // Undeclared exception!
      try {
        defaultNoteListModel0.insertElementAt((AbstractNote) commonNote0, 0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 com.allenstudio.ir.ui.DefaultNoteListModel.indexOf(Lcom/allenstudio/ir/core/plugins/AbstractNote;)I: root-Branch
   * 2 com.allenstudio.ir.ui.DefaultNoteListModel.removeElement(Lcom/allenstudio/ir/core/plugins/AbstractNote;)Z: I16 Branch 1 IFLT L294 - true
   */
  @Test
  public void test1()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      boolean boolean0 = defaultNoteListModel0.removeElement((AbstractNote) commonNote0);
      assertEquals(false, boolean0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.ui.DefaultNoteListModel.elements()Ljava/util/Enumeration;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      Enumeration<AbstractNote> enumeration0 = defaultNoteListModel0.elements();
      assertEquals(false, enumeration0.hasMoreElements());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.ui.DefaultNoteListModel.getElementAt(I)Lcom/allenstudio/ir/core/plugins/AbstractNote;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try {
        defaultNoteListModel0.getElementAt((-1628));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * -1628
         */
      }
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.ui.DefaultNoteListModel.fireContentChanged(Ljava/lang/Object;I)V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try {
        defaultNoteListModel0.fireContentChanged((Object) true, 1680);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.ui.DefaultNoteListModel.size()I: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      int int0 = defaultNoteListModel0.size();
      assertEquals(0, int0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.ui.DefaultNoteListModel.toString()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      String string0 = defaultNoteListModel0.toString();
      assertEquals("[]", string0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.ui.DefaultNoteListModel.lastIndexOf(Lcom/allenstudio/ir/core/plugins/AbstractNote;)I: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      int int0 = defaultNoteListModel0.lastIndexOf((AbstractNote) commonNote0);
      assertEquals((-1), int0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.ui.DefaultNoteListModel.elementAt(I)Lcom/allenstudio/ir/core/plugins/AbstractNote;: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try {
        defaultNoteListModel0.elementAt((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * -1
         */
      }
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.ui.DefaultNoteListModel.get(I)Lcom/allenstudio/ir/core/plugins/AbstractNote;: root-Branch
   */
  @Test
  public void test9()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try {
        defaultNoteListModel0.get(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 0 >= 0
         */
      }
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.ui.DefaultNoteListModel.addNoteListDataListener(Lcom/allenstudio/ir/event/NoteListDataListener;)V: root-Branch
   */
  @Test
  public void test10()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      defaultNoteListModel0.addNoteListDataListener((NoteListDataListener) null);
      assertEquals(0, defaultNoteListModel0.size());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.ui.DefaultNoteListModel.remove(I)Lcom/allenstudio/ir/core/plugins/AbstractNote;: root-Branch
   */
  @Test
  public void test11()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try {
        defaultNoteListModel0.remove(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 0 >= 0
         */
      }
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.ui.DefaultNoteListModel.indexOf(Lcom/allenstudio/ir/core/plugins/AbstractNote;I)I: root-Branch
   */
  @Test
  public void test12()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      int int0 = defaultNoteListModel0.indexOf((AbstractNote) commonNote0, 93);
      assertEquals((-1), int0);
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.ui.DefaultNoteListModel.getSize()I: root-Branch
   */
  @Test
  public void test13()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      int int0 = defaultNoteListModel0.getSize();
      assertEquals(0, int0);
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.ui.DefaultNoteListModel.toArray()[Lcom/allenstudio/ir/core/plugins/AbstractNote;: root-Branch
   */
  @Test
  public void test14()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      AbstractNote[] abstractNoteArray0 = defaultNoteListModel0.toArray();
      assertNotNull(abstractNoteArray0);
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.ui.DefaultNoteListModel.contains(Lcom/allenstudio/ir/core/plugins/AbstractNote;)Z: root-Branch
   */
  @Test
  public void test15()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      boolean boolean0 = defaultNoteListModel0.contains((AbstractNote) commonNote0);
      assertEquals(false, boolean0);
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.ui.DefaultNoteListModel.setElementAt(Lcom/allenstudio/ir/core/plugins/AbstractNote;I)V: root-Branch
   */
  @Test
  public void test16()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      // Undeclared exception!
      try {
        defaultNoteListModel0.setElementAt((AbstractNote) commonNote0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 1 >= 0
         */
      }
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.ui.DefaultNoteListModel.removeNoteListDataListener()V: root-Branch
   */
  @Test
  public void test17()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      defaultNoteListModel0.removeNoteListDataListener();
      assertEquals(true, defaultNoteListModel0.isEmpty());
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.ui.DefaultNoteListModel.removeElementAt(I)V: root-Branch
   */
  @Test
  public void test18()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try {
        defaultNoteListModel0.removeElementAt(15);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 15 >= 0
         */
      }
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.ui.DefaultNoteListModel.lastIndexOf(Lcom/allenstudio/ir/core/plugins/AbstractNote;I)I: root-Branch
   */
  @Test
  public void test19()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      // Undeclared exception!
      try {
        defaultNoteListModel0.lastIndexOf((AbstractNote) commonNote0, 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
        /*
         * 1 >= 0
         */
      }
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.ui.DefaultNoteListModel.addElement(Lcom/allenstudio/ir/core/plugins/AbstractNote;)V: root-Branch
   */
  @Test
  public void test20()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try {
        defaultNoteListModel0.addElement((AbstractNote) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 21
  /*
   * 2 covered goals:
   * 1 com.allenstudio.ir.ui.DefaultNoteListModel.add(ILcom/allenstudio/ir/core/plugins/AbstractNote;)V: root-Branch
   * 2 com.allenstudio.ir.ui.DefaultNoteListModel.fireItemAdded(Ljava/lang/Object;I)V: root-Branch
   */
  @Test
  public void test21()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try {
        defaultNoteListModel0.add(0, (AbstractNote) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.ui.DefaultNoteListModel.firstElement()Lcom/allenstudio/ir/core/plugins/AbstractNote;: root-Branch
   */
  @Test
  public void test22()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try {
        defaultNoteListModel0.firstElement();
        fail("Expecting exception: NoSuchElementException");
      } catch(NoSuchElementException e) {
      }
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.ui.DefaultNoteListModel.isEmpty()Z: root-Branch
   */
  @Test
  public void test23()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      boolean boolean0 = defaultNoteListModel0.isEmpty();
      assertEquals(true, boolean0);
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.ui.DefaultNoteListModel.fireItemRemoved(Ljava/lang/Object;I)V: root-Branch
   */
  @Test
  public void test24()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try {
        defaultNoteListModel0.fireItemRemoved((Object) "ToolTipText", (-1));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 25
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.ui.DefaultNoteListModel.set(ILcom/allenstudio/ir/core/plugins/AbstractNote;)Lcom/allenstudio/ir/core/plugins/AbstractNote;: root-Branch
   */
  @Test
  public void test25()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try {
        defaultNoteListModel0.set((-1), (AbstractNote) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * -1
         */
      }
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.ui.DefaultNoteListModel.lastElement()Lcom/allenstudio/ir/core/plugins/AbstractNote;: root-Branch
   */
  @Test
  public void test26()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try {
        defaultNoteListModel0.lastElement();
        fail("Expecting exception: NoSuchElementException");
      } catch(NoSuchElementException e) {
      }
  }

  //Test case number: 27
  /*
   * 2 covered goals:
   * 1 com.allenstudio.ir.ui.DefaultNoteListModel.capacity()I: root-Branch
   * 2 com.allenstudio.ir.ui.DefaultNoteListModel.<init>()V: root-Branch
   */
  @Test
  public void test27()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      int int0 = defaultNoteListModel0.capacity();
      assertEquals(10, int0);
  }
}