/*
 * This file was automatically generated by EvoSuite
 */

package com.allenstudio.ir.event;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.allenstudio.ir.event.NoteListDataEvent;

public class NoteListDataEventEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 com.allenstudio.ir.event.NoteListDataEvent.getType()I: root-Branch
   * 2 com.allenstudio.ir.event.NoteListDataEvent.<init>(Ljava/lang/Object;I)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      NoteListDataEvent noteListDataEvent0 = new NoteListDataEvent((Object) "[p/].~zauCxZ}Gq", 1673);
      int int0 = noteListDataEvent0.getType();
      assertEquals(1673, noteListDataEvent0.getIndex());
      assertEquals(0, int0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 com.allenstudio.ir.event.NoteListDataEvent.getIndex()I: root-Branch
   * 2 com.allenstudio.ir.event.NoteListDataEvent.<init>(Ljava/lang/Object;I)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      NoteListDataEvent noteListDataEvent0 = new NoteListDataEvent((Object) "[p/].~zauCxZ}Gq", 1673);
      int int0 = noteListDataEvent0.getIndex();
      assertEquals(1673, int0);
  }
}
