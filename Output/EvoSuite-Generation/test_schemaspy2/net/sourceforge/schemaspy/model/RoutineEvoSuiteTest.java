/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.schemaspy.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.List;
import net.sourceforge.schemaspy.model.Routine;
import net.sourceforge.schemaspy.model.RoutineParameter;

public class RoutineEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sourceforge.schemaspy.model.Routine.getParameters()Ljava/util/List;: root-Branch
   * 2 net.sourceforge.schemaspy.model.Routine.<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Routine routine0 = new Routine("", "", "", "", "", true, "", "", "");
      List<RoutineParameter> list0 = routine0.getParameters();
      assertNotNull(list0);
      assertEquals(true, routine0.isDeterministic());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.model.Routine.getComment()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      Routine routine0 = new Routine("", "", "", "", "", true, "", "", "");
      String string0 = routine0.getComment();
      assertEquals(true, routine0.isDeterministic());
      assertNotNull(string0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.model.Routine.getSecurityType()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      Routine routine0 = new Routine("", "", "", "", "", true, "", "", "");
      String string0 = routine0.getSecurityType();
      assertEquals(true, routine0.isDeterministic());
      assertNotNull(string0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.model.Routine.getDataAccess()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      Routine routine0 = new Routine("", "", "", "", "", true, "", "", "");
      String string0 = routine0.getDataAccess();
      assertEquals(true, routine0.isDeterministic());
      assertNotNull(string0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.model.Routine.addParameter(Lnet/sourceforge/schemaspy/model/RoutineParameter;)V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      Routine routine0 = new Routine("", "", "", "", "", true, "", "", "");
      routine0.addParameter((RoutineParameter) null);
      assertEquals(true, routine0.isDeterministic());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.model.Routine.getDefinitionLanguage()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      Routine routine0 = new Routine("", "", "", "", "", true, "", "", "");
      String string0 = routine0.getDefinitionLanguage();
      assertEquals(true, routine0.isDeterministic());
      assertNotNull(string0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.model.Routine.isDeterministic()Z: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      Routine routine0 = new Routine("aW-TDy'{6,bD'Xtr", "aW-TDy'{6,bD'Xtr", "aW-TDy'{6,bD'Xtr", "aW-TDy'{6,bD'Xtr", "aW-TDy'{6,bD'Xtr", false, "aW-TDy'{6,bD'Xtr", "aW-TDy'{6,bD'Xtr", "aW-TDy'{6,bD'Xtr");
      boolean boolean0 = routine0.isDeterministic();
      assertEquals(false, boolean0);
  }

  //Test case number: 7
  /*
   * 4 covered goals:
   * 1 net.sourceforge.schemaspy.model.Routine.compareTo(Lnet/sourceforge/schemaspy/model/Routine;)I: I11 Branch 1 IFNE L155 - true
   * 2 net.sourceforge.schemaspy.model.Routine.compareTo(Lnet/sourceforge/schemaspy/model/Routine;)I: I23 Branch 2 IFNE L157 - true
   * 3 net.sourceforge.schemaspy.model.Routine.compareTo(Lnet/sourceforge/schemaspy/model/Routine;)I: I37 Branch 3 IFNE L159 - true
   * 4 net.sourceforge.schemaspy.model.Routine.getName()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      Routine routine0 = new Routine("", "(ejBE6>r", "", "", "", false, "(ejBE6>r", "(ejBE6>r", "(ejBE6>r");
      Routine routine1 = new Routine("$4)?`n", "$4)?`n", "$4)?`n", "dGNTq2*~,$f9Jcxutp", "", false, "dGNTq2*~,$f9Jcxutp", "$4)?`n", "$4)?`n");
      int int0 = routine1.compareTo(routine0);
      assertEquals(false, routine0.isDeterministic());
      assertEquals("(ejBE6>r", routine0.getType());
      assertEquals(6, int0);
      assertEquals("(ejBE6>r", routine0.getSecurityType());
      assertEquals("dGNTq2*~,$f9Jcxutp", routine1.getDataAccess());
      assertEquals("$4)?`n", routine1.getType());
      assertEquals("(ejBE6>r", routine0.getDataAccess());
      assertEquals("", routine0.getReturnType());
      assertEquals("", routine0.getDefinitionLanguage());
      assertEquals("(ejBE6>r", routine0.getComment());
      assertEquals("$4)?`n", routine1.getReturnType());
      assertEquals("$4)?`n", routine1.getSecurityType());
      assertEquals("", routine1.getDefinition());
      assertEquals("dGNTq2*~,$f9Jcxutp", routine1.getDefinitionLanguage());
      assertEquals("$4)?`n", routine1.getComment());
  }

  //Test case number: 8
  /*
   * 8 covered goals:
   * 1 net.sourceforge.schemaspy.model.Routine.compareTo(Lnet/sourceforge/schemaspy/model/Routine;)I: I11 Branch 1 IFNE L155 - false
   * 2 net.sourceforge.schemaspy.model.Routine.compareTo(Lnet/sourceforge/schemaspy/model/Routine;)I: I23 Branch 2 IFNE L157 - false
   * 3 net.sourceforge.schemaspy.model.Routine.compareTo(Lnet/sourceforge/schemaspy/model/Routine;)I: I37 Branch 3 IFNE L159 - false
   * 4 net.sourceforge.schemaspy.model.Routine.getReturnType()Ljava/lang/String;: root-Branch
   * 5 net.sourceforge.schemaspy.model.Routine.getType()Ljava/lang/String;: root-Branch
   * 6 net.sourceforge.schemaspy.model.Routine.getDefinition()Ljava/lang/String;: root-Branch
   * 7 net.sourceforge.schemaspy.model.Routine.getName()Ljava/lang/String;: root-Branch
   * 8 net.sourceforge.schemaspy.model.Routine.<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      Routine routine0 = new Routine("", "", "", "", "", true, "", "", "");
      int int0 = routine0.compareTo(routine0);
      assertEquals(0, int0);
      assertEquals(true, routine0.isDeterministic());
  }
}
