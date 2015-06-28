/*
 * This file was automatically generated by EvoSuite
 */

package com.allenstudio.ir.core.plugins;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.allenstudio.ir.core.plugins.CommonNote;
import com.allenstudio.ir.ui.NoteList;

public class CommonNoteEvoSuiteTest {


  //Test case number: 0
  /*
   * 6 covered goals:
   * 1 com.allenstudio.ir.core.plugins.CommonNote.getDescription()Ljava/lang/String;: root-Branch
   * 2 com.allenstudio.ir.core.plugins.CommonNote.<init>()V: root-Branch
   * 3 com.allenstudio.ir.core.plugins.CommonNote.getIcon()Ljavax/swing/Icon;: root-Branch
   * 4 com.allenstudio.ir.core.plugins.CommonNote.getTitle()Ljava/lang/String;: root-Branch
   * 5 com.allenstudio.ir.core.plugins.CommonNote.getOtherInfo()Ljava/lang/String;: root-Branch
   * 6 com.allenstudio.ir.core.plugins.CommonNote.getOtherInfoText()Ljava/lang/String;: I8 Branch 1 IFNULL L42 - true
   */
  @Test
  public void test0()  throws Throwable  {
      NoteList noteList0 = new NoteList();
      assertNotNull(noteList0);
      assertEquals(0.498708F, noteList0.getAlignmentX(), 0.01F);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 com.allenstudio.ir.core.plugins.CommonNote.setOtherInfo(Ljava/lang/String;)V: root-Branch
   * 2 com.allenstudio.ir.core.plugins.CommonNote.<init>()V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      CommonNote commonNote0 = new CommonNote();
      commonNote0.setOtherInfo((String) null);
      assertEquals(" ", commonNote0.getOtherInfoText());
  }
}
