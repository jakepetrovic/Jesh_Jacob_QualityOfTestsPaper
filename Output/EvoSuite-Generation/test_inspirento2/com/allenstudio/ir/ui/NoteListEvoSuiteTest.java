/*
 * This file was automatically generated by EvoSuite
 */

package com.allenstudio.ir.ui;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.allenstudio.ir.ui.NoteList;
import java.awt.Component;
import java.awt.Rectangle;
import javax.swing.JInternalFrame;
import javax.swing.border.EtchedBorder;

public class NoteListEvoSuiteTest {


  //Test case number: 0
  /*
   * 6 covered goals:
   * 1 com.allenstudio.ir.ui.NoteList.getSelectedIndex()I: root-Branch
   * 2 com.allenstudio.ir.ui.NoteList.getCellCount()I: root-Branch
   * 3 com.allenstudio.ir.ui.NoteList.<init>()V: root-Branch
   * 4 com.allenstudio.ir.ui.NoteList.addCell(Lcom/allenstudio/ir/ui/NoteListCell;)V: I25 Branch 6 IF_ICMPNE L173 - true
   * 5 com.allenstudio.ir.ui.NoteList.addCell(Lcom/allenstudio/ir/ui/NoteListCell;)V: I25 Branch 6 IF_ICMPNE L173 - false
   * 6 com.allenstudio.ir.ui.NoteList.select(IZ)V: I5 Branch 8 IF_ICMPEQ L198 - true
   */
  @Test
  public void test0()  throws Throwable  {
      NoteList noteList0 = new NoteList();
      noteList0.select(0, true);
      assertEquals(5, noteList0.getCellCount());
      assertEquals(0, noteList0.getSelectedIndex());
      assertEquals(0.498708F, noteList0.getAlignmentX(), 0.01F);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.ui.NoteList.removeListEventListener()V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      NoteList noteList0 = new NoteList();
      noteList0.removeListEventListener();
      assertEquals(5, noteList0.getCellCount());
      assertEquals(0, noteList0.getSelectedIndex());
      assertEquals(0.498708F, noteList0.getAlignmentX(), 0.01F);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.ui.NoteList.getScrollableUnitIncrement(Ljava/awt/Rectangle;II)I: I4 Branch 1 IFLE L123 - false
   */
  @Test
  public void test2()  throws Throwable  {
      NoteList noteList0 = new NoteList();
      JInternalFrame jInternalFrame0 = new JInternalFrame("", true, false, false);
      Rectangle rectangle0 = jInternalFrame0.getNormalBounds();
      noteList0.getScrollableUnitIncrement(rectangle0, 0, (-1560));
      assertEquals(0, noteList0.getSelectedIndex());
      assertEquals(0.498708F, noteList0.getAlignmentX(), 0.01F);
      assertEquals(5, noteList0.getCellCount());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.ui.NoteList.getScrollableBlockIncrement(Ljava/awt/Rectangle;II)I: I3 Branch 2 IFNE L134 - true
   */
  @Test
  public void test3()  throws Throwable  {
      NoteList noteList0 = new NoteList();
      EtchedBorder etchedBorder0 = new EtchedBorder(0);
      Rectangle rectangle0 = etchedBorder0.getInteriorRectangle((Component) noteList0, 0, 0, 0, 0);
      int int0 = noteList0.getScrollableBlockIncrement(rectangle0, (-336), (-4));
      assertEquals(5, noteList0.getCellCount());
      assertEquals(0, noteList0.getSelectedIndex());
      assertEquals(0.498708F, noteList0.getAlignmentX(), 0.01F);
      assertEquals((-4), int0);
  }

  //Test case number: 4
  /*
   * 6 covered goals:
   * 1 com.allenstudio.ir.ui.NoteList.getScrollableTracksViewportHeight()Z: I4 Branch 3 IFNE L143 - true
   * 2 com.allenstudio.ir.ui.NoteList.getScrollableTracksViewportHeight()Z: I14 Branch 4 IFEQ L146 - true
   * 3 com.allenstudio.ir.ui.NoteList.getCellCount()I: root-Branch
   * 4 com.allenstudio.ir.ui.NoteList.<init>()V: root-Branch
   * 5 com.allenstudio.ir.ui.NoteList.addCell(Lcom/allenstudio/ir/ui/NoteListCell;)V: I25 Branch 6 IF_ICMPNE L173 - true
   * 6 com.allenstudio.ir.ui.NoteList.addCell(Lcom/allenstudio/ir/ui/NoteListCell;)V: I25 Branch 6 IF_ICMPNE L173 - false
   */
  @Test
  public void test4()  throws Throwable  {
      NoteList noteList0 = new NoteList();
      boolean boolean0 = noteList0.getScrollableTracksViewportHeight();
      assertEquals(0, noteList0.getSelectedIndex());
      assertEquals(0.498708F, noteList0.getAlignmentX(), 0.01F);
      assertEquals(false, boolean0);
      assertEquals(5, noteList0.getCellCount());
  }
}
