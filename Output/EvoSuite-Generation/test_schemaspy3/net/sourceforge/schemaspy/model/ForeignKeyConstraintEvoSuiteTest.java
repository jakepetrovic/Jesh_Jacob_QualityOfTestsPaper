/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.schemaspy.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import net.sourceforge.schemaspy.model.ForeignKeyConstraint;
import net.sourceforge.schemaspy.model.Table;
import net.sourceforge.schemaspy.model.TableColumn;

public class ForeignKeyConstraintEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getParentColumns()Ljava/util/List;: root-Branch
   * 2 net.sourceforge.schemaspy.model.ForeignKeyConstraint.<init>(Lnet/sourceforge/schemaspy/model/Table;Ljava/lang/String;II)V: I26 Branch 1 IFEQ L57 - true
   */
  @Test
  public void test0()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 0, 1);
      assertNotNull(foreignKeyConstraint0);
      
      List<TableColumn> list0 = foreignKeyConstraint0.getParentColumns();
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Restrict delete", foreignKeyConstraint0.getDeleteRuleName());
      assertNotNull(list0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getParentTable()Lnet/sourceforge/schemaspy/model/Table;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "zs,~$pv", 53, 2);
      assertNotNull(foreignKeyConstraint0);
      
      foreignKeyConstraint0.getParentTable();
      assertEquals(53, foreignKeyConstraint0.getUpdateRule());
      assertEquals(true, foreignKeyConstraint0.isNullOnDelete());
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * 1 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRule()I: root-Branch
   * 2 net.sourceforge.schemaspy.model.ForeignKeyConstraint.isRestrictDelete()Z: I5 Branch 5 IF_ICMPEQ L191 - false
   * 3 net.sourceforge.schemaspy.model.ForeignKeyConstraint.isRestrictDelete()Z: I9 Branch 6 IF_ICMPNE L191 - false
   */
  @Test
  public void test2()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 53, 1);
      assertNotNull(foreignKeyConstraint0);
      
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertEquals(true, boolean0);
      assertEquals(53, foreignKeyConstraint0.getUpdateRule());
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * 1 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getName()Ljava/lang/String;: root-Branch
   * 2 net.sourceforge.schemaspy.model.ForeignKeyConstraint.compareTo(Lnet/sourceforge/schemaspy/model/ForeignKeyConstraint;)I: I4 Branch 24 IF_ACMPNE L298 - true
   * 3 net.sourceforge.schemaspy.model.ForeignKeyConstraint.compareTo(Lnet/sourceforge/schemaspy/model/ForeignKeyConstraint;)I: I20 Branch 25 IFNE L302 - true
   */
  @Test
  public void test3()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "zs,~$pv", 53, 2);
      assertNotNull(foreignKeyConstraint0);
      
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "3i3GS&SBEXqJ2Dd", (-12), (-12));
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint1);
      assertEquals(71, int0);
      assertEquals(2, foreignKeyConstraint0.getDeleteRule());
      assertEquals(53, foreignKeyConstraint0.getUpdateRule());
  }

  //Test case number: 4
  /*
   * 4 covered goals:
   * 1 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getChildColumns()Ljava/util/List;: root-Branch
   * 2 net.sourceforge.schemaspy.model.ForeignKeyConstraint.compareTo(Lnet/sourceforge/schemaspy/model/ForeignKeyConstraint;)I: I20 Branch 25 IFNE L302 - false
   * 3 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getName()Ljava/lang/String;: root-Branch
   * 4 net.sourceforge.schemaspy.model.ForeignKeyConstraint.compareTo(Lnet/sourceforge/schemaspy/model/ForeignKeyConstraint;)I: I4 Branch 24 IF_ACMPNE L298 - true
   */
  @Test
  public void test4()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "~cq,Jx", 0, 0);
      assertNotNull(foreignKeyConstraint0);
      
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "~cq,Jx", 0, 0);
      // Undeclared exception!
      try {
        foreignKeyConstraint0.compareTo(foreignKeyConstraint1);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
        /*
         * Index: 0, Size: 0
         */
      }
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.model.ForeignKeyConstraint.isImplied()Z: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "^cQLR?+d{cR7$RwQN", (-935), (-1555));
      assertNotNull(foreignKeyConstraint0);
      
      boolean boolean0 = foreignKeyConstraint0.isImplied();
      assertEquals(-1555, foreignKeyConstraint0.getDeleteRule());
      assertEquals(false, boolean0);
      assertEquals(-935, foreignKeyConstraint0.getUpdateRule());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getUpdateRule()I: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "~cq,Jx", 0, 0);
      assertNotNull(foreignKeyConstraint0);
      
      int int0 = foreignKeyConstraint0.getUpdateRule();
      assertEquals(0, int0);
      assertEquals("Cascade on delete", foreignKeyConstraint0.getDeleteRuleName());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getChildTable()Lnet/sourceforge/schemaspy/model/Table;: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "zs,~$pv", 53, 2);
      assertNotNull(foreignKeyConstraint0);
      
      foreignKeyConstraint0.getChildTable();
      assertEquals(53, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Null on delete", foreignKeyConstraint0.getDeleteRuleName());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.model.ForeignKeyConstraint.addParentColumn(Lnet/sourceforge/schemaspy/model/TableColumn;)V: I3 Branch 2 IFNULL L101 - true
   */
  @Test
  public void test8()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 1390, 0);
      assertNotNull(foreignKeyConstraint0);
      
      foreignKeyConstraint0.addParentColumn((TableColumn) null);
      assertEquals(1390, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Cascade on delete", foreignKeyConstraint0.getDeleteRuleName());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.model.ForeignKeyConstraint.addChildColumn(Lnet/sourceforge/schemaspy/model/TableColumn;)V: I3 Branch 3 IFNULL L113 - true
   */
  @Test
  public void test9()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", (-1), (-1));
      assertNotNull(foreignKeyConstraint0);
      
      foreignKeyConstraint0.addChildColumn((TableColumn) null);
      assertEquals(-1, foreignKeyConstraint0.getDeleteRule());
      assertEquals(-1, foreignKeyConstraint0.getUpdateRule());
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.model.ForeignKeyConstraint.isCascadeOnDelete()Z: I4 Branch 4 IFNE L181 - true
   */
  @Test
  public void test10()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 0, 1);
      assertNotNull(foreignKeyConstraint0);
      
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
      assertEquals(true, foreignKeyConstraint0.isRestrictDelete());
      assertEquals(false, boolean0);
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.model.ForeignKeyConstraint.isCascadeOnDelete()Z: I4 Branch 4 IFNE L181 - false
   */
  @Test
  public void test11()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 1390, 0);
      assertNotNull(foreignKeyConstraint0);
      
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertEquals(1390, foreignKeyConstraint0.getUpdateRule());
      assertEquals(true, boolean0);
  }

  //Test case number: 12
  /*
   * 2 covered goals:
   * 1 net.sourceforge.schemaspy.model.ForeignKeyConstraint.isRestrictDelete()Z: I9 Branch 6 IF_ICMPNE L191 - true
   * 2 net.sourceforge.schemaspy.model.ForeignKeyConstraint.isRestrictDelete()Z: I5 Branch 5 IF_ICMPEQ L191 - false
   */
  @Test
  public void test12()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "zs,~$pv", 53, 2);
      assertNotNull(foreignKeyConstraint0);
      
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertEquals(false, boolean0);
      assertEquals(53, foreignKeyConstraint0.getUpdateRule());
      assertEquals(2, foreignKeyConstraint0.getDeleteRule());
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.model.ForeignKeyConstraint.isNullOnDelete()Z: I5 Branch 7 IF_ICMPNE L201 - true
   */
  @Test
  public void test13()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "~jcq,Jt", (-1906), (-1906));
      assertNotNull(foreignKeyConstraint0);
      
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertEquals(false, boolean0);
      assertEquals(-1906, foreignKeyConstraint0.getDeleteRule());
      assertEquals(-1906, foreignKeyConstraint0.getUpdateRule());
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.model.ForeignKeyConstraint.isNullOnDelete()Z: I5 Branch 7 IF_ICMPNE L201 - false
   */
  @Test
  public void test14()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "zs,~$pv", 53, 2);
      assertNotNull(foreignKeyConstraint0);
      
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertEquals(true, boolean0);
      assertEquals(53, foreignKeyConstraint0.getUpdateRule());
  }

  //Test case number: 15
  /*
   * 5 covered goals:
   * 1 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleName()Ljava/lang/String;: I4 Branch 8 TABLESWITCH L205 Case 0 - true
   * 2 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleName()Ljava/lang/String;: I4 Branch 9 TABLESWITCH L205 Case 1 - false
   * 3 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleName()Ljava/lang/String;: I4 Branch 10 TABLESWITCH L205 Case 2 - false
   * 4 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleName()Ljava/lang/String;: I4 Branch 11 TABLESWITCH L205 Case 3 - false
   * 5 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleName()Ljava/lang/String;: I4 Branch 12 TABLESWITCH L205 Default-Case - false
   */
  @Test
  public void test15()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 1390, 0);
      assertNotNull(foreignKeyConstraint0);
      
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Cascade on delete", string0);
      assertEquals(1390, foreignKeyConstraint0.getUpdateRule());
  }

  //Test case number: 16
  /*
   * 2 covered goals:
   * 1 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleName()Ljava/lang/String;: I4 Branch 8 TABLESWITCH L205 Case 0 - false
   * 2 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleName()Ljava/lang/String;: I4 Branch 9 TABLESWITCH L205 Case 1 - true
   */
  @Test
  public void test16()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 53, 1);
      assertNotNull(foreignKeyConstraint0);
      
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(53, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Restrict delete", string0);
  }

  //Test case number: 17
  /*
   * 2 covered goals:
   * 1 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleName()Ljava/lang/String;: I4 Branch 10 TABLESWITCH L205 Case 2 - true
   * 2 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleName()Ljava/lang/String;: I4 Branch 12 TABLESWITCH L205 Default-Case - false
   */
  @Test
  public void test17()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "zs,~$pv", 53, 2);
      assertNotNull(foreignKeyConstraint0);
      
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(53, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Null on delete", string0);
  }

  //Test case number: 18
  /*
   * 5 covered goals:
   * 1 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleName()Ljava/lang/String;: I4 Branch 12 TABLESWITCH L205 Default-Case - true
   * 2 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleName()Ljava/lang/String;: I4 Branch 8 TABLESWITCH L205 Case 0 - false
   * 3 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleName()Ljava/lang/String;: I4 Branch 9 TABLESWITCH L205 Case 1 - false
   * 4 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleName()Ljava/lang/String;: I4 Branch 10 TABLESWITCH L205 Case 2 - false
   * 5 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleName()Ljava/lang/String;: I4 Branch 11 TABLESWITCH L205 Case 3 - false
   */
  @Test
  public void test18()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "~jcq,Jt", (-1906), (-1906));
      assertNotNull(foreignKeyConstraint0);
      
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(-1906, foreignKeyConstraint0.getUpdateRule());
      assertEquals("", string0);
      assertEquals(-1906, foreignKeyConstraint0.getDeleteRule());
  }

  //Test case number: 19
  /*
   * 5 covered goals:
   * 1 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleDescription()Ljava/lang/String;: I4 Branch 13 TABLESWITCH L222 Case 0 - true
   * 2 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleDescription()Ljava/lang/String;: I4 Branch 14 TABLESWITCH L222 Case 1 - false
   * 3 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleDescription()Ljava/lang/String;: I4 Branch 15 TABLESWITCH L222 Case 2 - false
   * 4 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleDescription()Ljava/lang/String;: I4 Branch 16 TABLESWITCH L222 Case 3 - false
   * 5 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleDescription()Ljava/lang/String;: I4 Branch 17 TABLESWITCH L222 Default-Case - false
   */
  @Test
  public void test19()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 1390, 0);
      assertNotNull(foreignKeyConstraint0);
      
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", string0);
      assertEquals(1390, foreignKeyConstraint0.getUpdateRule());
  }

  //Test case number: 20
  /*
   * 2 covered goals:
   * 1 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleDescription()Ljava/lang/String;: I4 Branch 13 TABLESWITCH L222 Case 0 - false
   * 2 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleDescription()Ljava/lang/String;: I4 Branch 15 TABLESWITCH L222 Case 2 - true
   */
  @Test
  public void test20()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "zs,~$pv", 53, 2);
      assertNotNull(foreignKeyConstraint0);
      
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Null on delete:\n Foreign key to parent set to NULL when parent deleted", string0);
      assertEquals(53, foreignKeyConstraint0.getUpdateRule());
  }

  //Test case number: 21
  /*
   * 2 covered goals:
   * 1 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleDescription()Ljava/lang/String;: I4 Branch 14 TABLESWITCH L222 Case 1 - true
   * 2 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleDescription()Ljava/lang/String;: I4 Branch 17 TABLESWITCH L222 Default-Case - false
   */
  @Test
  public void test21()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 0, 1);
      assertNotNull(foreignKeyConstraint0);
      
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
  }

  //Test case number: 22
  /*
   * 5 covered goals:
   * 1 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleDescription()Ljava/lang/String;: I4 Branch 17 TABLESWITCH L222 Default-Case - true
   * 2 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleDescription()Ljava/lang/String;: I4 Branch 13 TABLESWITCH L222 Case 0 - false
   * 3 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleDescription()Ljava/lang/String;: I4 Branch 14 TABLESWITCH L222 Case 1 - false
   * 4 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleDescription()Ljava/lang/String;: I4 Branch 15 TABLESWITCH L222 Case 2 - false
   * 5 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleDescription()Ljava/lang/String;: I4 Branch 16 TABLESWITCH L222 Case 3 - false
   */
  @Test
  public void test22()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Restrict delete:\n Parent cannot be deleted if children exist", 1051, 1051);
      assertNotNull(foreignKeyConstraint0);
      
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals(1051, foreignKeyConstraint0.getUpdateRule());
      assertEquals("", string0);
      assertEquals(1051, foreignKeyConstraint0.getDeleteRule());
  }

  //Test case number: 23
  /*
   * 5 covered goals:
   * 1 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleAlias()Ljava/lang/String;: I4 Branch 18 TABLESWITCH L239 Case 0 - true
   * 2 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleAlias()Ljava/lang/String;: I4 Branch 19 TABLESWITCH L239 Case 1 - false
   * 3 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleAlias()Ljava/lang/String;: I4 Branch 20 TABLESWITCH L239 Case 2 - false
   * 4 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleAlias()Ljava/lang/String;: I4 Branch 21 TABLESWITCH L239 Case 3 - false
   * 5 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleAlias()Ljava/lang/String;: I4 Branch 22 TABLESWITCH L239 Default-Case - false
   */
  @Test
  public void test23()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "~cq,Jx", 0, 0);
      assertNotNull(foreignKeyConstraint0);
      
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
      assertEquals("C", string0);
  }

  //Test case number: 24
  /*
   * 2 covered goals:
   * 1 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleAlias()Ljava/lang/String;: I4 Branch 18 TABLESWITCH L239 Case 0 - false
   * 2 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleAlias()Ljava/lang/String;: I4 Branch 19 TABLESWITCH L239 Case 1 - true
   */
  @Test
  public void test24()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 53, 1);
      assertNotNull(foreignKeyConstraint0);
      
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(53, foreignKeyConstraint0.getUpdateRule());
      assertEquals("R", string0);
  }

  //Test case number: 25
  /*
   * 2 covered goals:
   * 1 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleAlias()Ljava/lang/String;: I4 Branch 20 TABLESWITCH L239 Case 2 - true
   * 2 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleAlias()Ljava/lang/String;: I4 Branch 22 TABLESWITCH L239 Default-Case - false
   */
  @Test
  public void test25()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "zs,~$pv", 53, 2);
      assertNotNull(foreignKeyConstraint0);
      
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(53, foreignKeyConstraint0.getUpdateRule());
      assertEquals("N", string0);
  }

  //Test case number: 26
  /*
   * 6 covered goals:
   * 1 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleAlias()Ljava/lang/String;: I4 Branch 22 TABLESWITCH L239 Default-Case - true
   * 2 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRule()I: root-Branch
   * 3 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleAlias()Ljava/lang/String;: I4 Branch 18 TABLESWITCH L239 Case 0 - false
   * 4 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleAlias()Ljava/lang/String;: I4 Branch 19 TABLESWITCH L239 Case 1 - false
   * 5 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleAlias()Ljava/lang/String;: I4 Branch 20 TABLESWITCH L239 Case 2 - false
   * 6 net.sourceforge.schemaspy.model.ForeignKeyConstraint.getDeleteRuleAlias()Ljava/lang/String;: I4 Branch 21 TABLESWITCH L239 Case 3 - false
   */
  @Test
  public void test26()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Restrict delete:\n Parent cannot be deleted if children exist", 1051, 1051);
      assertNotNull(foreignKeyConstraint0);
      
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(1051, foreignKeyConstraint0.getUpdateRule());
      assertEquals(1051, foreignKeyConstraint0.getDeleteRule());
      assertEquals("", string0);
  }

  //Test case number: 27
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.model.ForeignKeyConstraint.isReal()Z: I5 Branch 23 IF_ACMPNE L286 - false
   */
  @Test
  public void test27()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "~jcq,Jt", (-1906), (-1906));
      assertNotNull(foreignKeyConstraint0);
      
      boolean boolean0 = foreignKeyConstraint0.isReal();
      assertEquals(true, boolean0);
      assertEquals(-1906, foreignKeyConstraint0.getUpdateRule());
      assertEquals(-1906, foreignKeyConstraint0.getDeleteRule());
  }

  //Test case number: 28
  /*
   * 2 covered goals:
   * 1 net.sourceforge.schemaspy.model.ForeignKeyConstraint.compareTo(Lnet/sourceforge/schemaspy/model/ForeignKeyConstraint;)I: I4 Branch 24 IF_ACMPNE L298 - false
   * 2 net.sourceforge.schemaspy.model.ForeignKeyConstraint.<init>(Lnet/sourceforge/schemaspy/model/Table;Ljava/lang/String;II)V: I26 Branch 1 IFEQ L57 - true
   */
  @Test
  public void test28()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "~jcq,Jt", (-1906), (-1906));
      assertNotNull(foreignKeyConstraint0);
      
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint0);
      assertEquals(-1906, foreignKeyConstraint0.getUpdateRule());
      assertEquals(0, int0);
      assertEquals(-1906, foreignKeyConstraint0.getDeleteRule());
  }

  //Test case number: 29
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.model.ForeignKeyConstraint.toString(Ljava/util/List;)Ljava/lang/String;: I5 Branch 29 IF_ICMPNE L325 - true
   */
  @Test
  public void test29()  throws Throwable  {
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      String string0 = ForeignKeyConstraint.toString((List<TableColumn>) linkedList0);
      assertEquals("[]", string0);
  }
}
