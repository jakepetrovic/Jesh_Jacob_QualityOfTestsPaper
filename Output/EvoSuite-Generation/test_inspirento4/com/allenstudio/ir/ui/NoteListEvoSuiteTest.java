/*
 * This file was automatically generated by EvoSuite
 */

package com.allenstudio.ir.ui;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.allenstudio.ir.ui.NoteList;
import java.awt.Point;

public class NoteListEvoSuiteTest {


  //Test case number: 0
  /*
   * 6 covered goals:
   * 1 com.allenstudio.ir.ui.NoteList.getSelectedIndex()I: root-Branch
   * 2 com.allenstudio.ir.ui.NoteList.getCellCount()I: root-Branch
   * 3 com.allenstudio.ir.ui.NoteList.<init>()V: root-Branch
   * 4 com.allenstudio.ir.ui.NoteList.addCell(Lcom/allenstudio/ir/ui/NoteListCell;)V: I25 Branch 6 IF_ICMPNE L173 - true
   * 5 com.allenstudio.ir.ui.NoteList.addCell(Lcom/allenstudio/ir/ui/NoteListCell;)V: I25 Branch 6 IF_ICMPNE L173 - false
   * 6 com.allenstudio.ir.ui.NoteList.select(IZ)V: I5 Branch 8 IF_ICMPEQ L198 - false
   */
  @Test
  public void test0()  throws Throwable  {
      NoteList noteList0 = new NoteList();
      // Undeclared exception!
      try {
        noteList0.select((-1123), false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * No such child: -1123
         */
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 com.allenstudio.ir.ui.NoteList.getScrollableTracksViewportHeight()Z: I4 Branch 3 IFNE L143 - true
   * 2 com.allenstudio.ir.ui.NoteList.getScrollableTracksViewportHeight()Z: I14 Branch 4 IFEQ L146 - true
   */
  @Test
  public void test1()  throws Throwable  {
      NoteList noteList0 = new NoteList();
      boolean boolean0 = noteList0.getScrollableTracksViewportHeight();
      assertEquals(0.498708F, noteList0.getAlignmentX(), 0.01F);
      assertEquals(false, boolean0);
      assertEquals(5, noteList0.getCellCount());
      assertEquals(0, noteList0.getSelectedIndex());
  }

  //Test case number: 2
  /*
   * 5 covered goals:
   * 1 com.allenstudio.ir.ui.NoteList.fireCursorEnter(Ljava/lang/Object;Ljava/awt/Point;)V: I4 Branch 12 IFNULL L227 - true
   * 2 com.allenstudio.ir.ui.NoteList.getCellCount()I: root-Branch
   * 3 com.allenstudio.ir.ui.NoteList.<init>()V: root-Branch
   * 4 com.allenstudio.ir.ui.NoteList.addCell(Lcom/allenstudio/ir/ui/NoteListCell;)V: I25 Branch 6 IF_ICMPNE L173 - true
   * 5 com.allenstudio.ir.ui.NoteList.addCell(Lcom/allenstudio/ir/ui/NoteListCell;)V: I25 Branch 6 IF_ICMPNE L173 - false
   */
  @Test
  public void test2()  throws Throwable  {
      NoteList noteList0 = new NoteList();
      noteList0.fireCursorEnter((Object) null, (Point) null);
      assertEquals(0.498708F, noteList0.getAlignmentX(), 0.01F);
      assertEquals(5, noteList0.getCellCount());
      assertEquals(0, noteList0.getSelectedIndex());
  }
}
