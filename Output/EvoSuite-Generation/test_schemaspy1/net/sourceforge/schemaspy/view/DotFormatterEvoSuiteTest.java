/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.schemaspy.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedHashSet;
import net.sourceforge.schemaspy.model.Database;
import net.sourceforge.schemaspy.model.Table;
import net.sourceforge.schemaspy.util.LineWriter;
import net.sourceforge.schemaspy.view.DotFormatter;
import net.sourceforge.schemaspy.view.WriteStats;

public class DotFormatterEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sourceforge.schemaspy.view.DotFormatter.writeOrphan(Lnet/sourceforge/schemaspy/model/Table;Lnet/sourceforge/schemaspy/util/LineWriter;)V: root-Branch
   * 2 net.sourceforge.schemaspy.view.DotFormatter.getInstance()Lnet/sourceforge/schemaspy/view/DotFormatter;: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      DotFormatter dotFormatter0 = DotFormatter.getInstance();
      // Undeclared exception!
      try {
        dotFormatter0.writeOrphan((Table) null, (LineWriter) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 net.sourceforge.schemaspy.view.DotFormatter.writeAllRelationships(Lnet/sourceforge/schemaspy/model/Table;ZLnet/sourceforge/schemaspy/view/WriteStats;Lnet/sourceforge/schemaspy/util/LineWriter;)V: root-Branch
   * 2 net.sourceforge.schemaspy.view.DotFormatter.writeRelationships(Lnet/sourceforge/schemaspy/model/Table;ZLnet/sourceforge/schemaspy/view/WriteStats;ZLnet/sourceforge/schemaspy/util/LineWriter;)Ljava/util/Set;: I19 Branch 1 IFEQ L85 - false
   */
  @Test
  public void test1()  throws Throwable  {
      DotFormatter dotFormatter0 = DotFormatter.getInstance();
      // Undeclared exception!
      try {
        dotFormatter0.writeAllRelationships((Table) null, true, (WriteStats) null, (LineWriter) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 2
  /*
   * 4 covered goals:
   * 1 net.sourceforge.schemaspy.view.DotFormatter.writeAllRelationships(Lnet/sourceforge/schemaspy/model/Database;Ljava/util/Collection;ZZLnet/sourceforge/schemaspy/view/WriteStats;Lnet/sourceforge/schemaspy/util/LineWriter;)Z: root-Branch
   * 2 net.sourceforge.schemaspy.view.DotFormatter.writeRelationships(Lnet/sourceforge/schemaspy/model/Database;Ljava/util/Collection;ZZZLnet/sourceforge/schemaspy/view/WriteStats;Lnet/sourceforge/schemaspy/util/LineWriter;)Z: I7 Branch 47 IFEQ L273 - true
   * 3 net.sourceforge.schemaspy.view.DotFormatter.writeRelationships(Lnet/sourceforge/schemaspy/model/Database;Ljava/util/Collection;ZZZLnet/sourceforge/schemaspy/view/WriteStats;Lnet/sourceforge/schemaspy/util/LineWriter;)Z: I33 Branch 49 IFEQ L277 - false
   * 4 net.sourceforge.schemaspy.view.DotFormatter.writeRelationships(Lnet/sourceforge/schemaspy/model/Database;Ljava/util/Collection;ZZZLnet/sourceforge/schemaspy/view/WriteStats;Lnet/sourceforge/schemaspy/util/LineWriter;)Z: I37 Branch 50 IFEQ L278 - true
   */
  @Test
  public void test2()  throws Throwable  {
      DotFormatter dotFormatter0 = DotFormatter.getInstance();
      // Undeclared exception!
      try {
        dotFormatter0.writeAllRelationships((Database) null, (Collection<Table>) null, false, false, (WriteStats) null, (LineWriter) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * 1 net.sourceforge.schemaspy.view.DotFormatter.writeRealRelationships(Lnet/sourceforge/schemaspy/model/Table;ZLnet/sourceforge/schemaspy/view/WriteStats;Lnet/sourceforge/schemaspy/util/LineWriter;)Ljava/util/Set;: root-Branch
   * 2 net.sourceforge.schemaspy.view.DotFormatter.writeRelationships(Lnet/sourceforge/schemaspy/model/Table;ZLnet/sourceforge/schemaspy/view/WriteStats;ZLnet/sourceforge/schemaspy/util/LineWriter;)Ljava/util/Set;: I19 Branch 1 IFEQ L85 - true
   * 3 net.sourceforge.schemaspy.view.DotFormatter.writeRelationships(Lnet/sourceforge/schemaspy/model/Table;ZLnet/sourceforge/schemaspy/view/WriteStats;ZLnet/sourceforge/schemaspy/util/LineWriter;)Ljava/util/Set;: I24 Branch 2 IFEQ L85 - true
   */
  @Test
  public void test3()  throws Throwable  {
      DotFormatter dotFormatter0 = DotFormatter.getInstance();
      // Undeclared exception!
      try {
        dotFormatter0.writeRealRelationships((Table) null, false, (WriteStats) null, (LineWriter) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 4
  /*
   * 5 covered goals:
   * 1 net.sourceforge.schemaspy.view.DotFormatter.writeRealRelationships(Lnet/sourceforge/schemaspy/model/Database;Ljava/util/Collection;ZZLnet/sourceforge/schemaspy/view/WriteStats;Lnet/sourceforge/schemaspy/util/LineWriter;)V: root-Branch
   * 2 net.sourceforge.schemaspy.view.DotFormatter.writeRelationships(Lnet/sourceforge/schemaspy/model/Database;Ljava/util/Collection;ZZZLnet/sourceforge/schemaspy/view/WriteStats;Lnet/sourceforge/schemaspy/util/LineWriter;)Z: I7 Branch 47 IFEQ L273 - false
   * 3 net.sourceforge.schemaspy.view.DotFormatter.writeRelationships(Lnet/sourceforge/schemaspy/model/Database;Ljava/util/Collection;ZZZLnet/sourceforge/schemaspy/view/WriteStats;Lnet/sourceforge/schemaspy/util/LineWriter;)Z: I11 Branch 48 IFNE L273 - true
   * 4 net.sourceforge.schemaspy.view.DotFormatter.writeRelationships(Lnet/sourceforge/schemaspy/model/Database;Ljava/util/Collection;ZZZLnet/sourceforge/schemaspy/view/WriteStats;Lnet/sourceforge/schemaspy/util/LineWriter;)Z: I33 Branch 49 IFEQ L277 - true
   * 5 net.sourceforge.schemaspy.view.DotFormatter.writeRelationships(Lnet/sourceforge/schemaspy/model/Database;Ljava/util/Collection;ZZZLnet/sourceforge/schemaspy/view/WriteStats;Lnet/sourceforge/schemaspy/util/LineWriter;)Z: I53 Branch 51 IFEQ L283 - false
   */
  @Test
  public void test4()  throws Throwable  {
      DotFormatter dotFormatter0 = DotFormatter.getInstance();
      LinkedHashSet<Table> linkedHashSet0 = new LinkedHashSet<Table>();
      WriteStats writeStats0 = new WriteStats((Collection<Table>) linkedHashSet0);
      // Undeclared exception!
      try {
        dotFormatter0.writeRealRelationships((Database) null, (Collection<Table>) linkedHashSet0, true, true, writeStats0, (LineWriter) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 5
  /*
   * 3 covered goals:
   * 1 net.sourceforge.schemaspy.view.DotFormatter.writeRelationships(Lnet/sourceforge/schemaspy/model/Table;ZLnet/sourceforge/schemaspy/view/WriteStats;ZLnet/sourceforge/schemaspy/util/LineWriter;)Ljava/util/Set;: I24 Branch 2 IFEQ L85 - false
   * 2 net.sourceforge.schemaspy.view.DotFormatter.writeRealRelationships(Lnet/sourceforge/schemaspy/model/Table;ZLnet/sourceforge/schemaspy/view/WriteStats;Lnet/sourceforge/schemaspy/util/LineWriter;)Ljava/util/Set;: root-Branch
   * 3 net.sourceforge.schemaspy.view.DotFormatter.writeRelationships(Lnet/sourceforge/schemaspy/model/Table;ZLnet/sourceforge/schemaspy/view/WriteStats;ZLnet/sourceforge/schemaspy/util/LineWriter;)Ljava/util/Set;: I19 Branch 1 IFEQ L85 - true
   */
  @Test
  public void test5()  throws Throwable  {
      DotFormatter dotFormatter0 = DotFormatter.getInstance();
      // Undeclared exception!
      try {
        dotFormatter0.writeRealRelationships((Table) null, true, (WriteStats) null, (LineWriter) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 6
  /*
   * 4 covered goals:
   * 1 net.sourceforge.schemaspy.view.DotFormatter.writeRelationships(Lnet/sourceforge/schemaspy/model/Database;Ljava/util/Collection;ZZZLnet/sourceforge/schemaspy/view/WriteStats;Lnet/sourceforge/schemaspy/util/LineWriter;)Z: I11 Branch 48 IFNE L273 - false
   * 2 net.sourceforge.schemaspy.view.DotFormatter.writeRelationships(Lnet/sourceforge/schemaspy/model/Database;Ljava/util/Collection;ZZZLnet/sourceforge/schemaspy/view/WriteStats;Lnet/sourceforge/schemaspy/util/LineWriter;)Z: I53 Branch 51 IFEQ L283 - true
   * 3 net.sourceforge.schemaspy.view.DotFormatter.writeRealRelationships(Lnet/sourceforge/schemaspy/model/Database;Ljava/util/Collection;ZZLnet/sourceforge/schemaspy/view/WriteStats;Lnet/sourceforge/schemaspy/util/LineWriter;)V: root-Branch
   * 4 net.sourceforge.schemaspy.view.DotFormatter.writeRelationships(Lnet/sourceforge/schemaspy/model/Database;Ljava/util/Collection;ZZZLnet/sourceforge/schemaspy/view/WriteStats;Lnet/sourceforge/schemaspy/util/LineWriter;)Z: I33 Branch 49 IFEQ L277 - true
   */
  @Test
  public void test6()  throws Throwable  {
      DotFormatter dotFormatter0 = DotFormatter.getInstance();
      // Undeclared exception!
      try {
        dotFormatter0.writeRealRelationships((Database) null, (Collection<Table>) null, false, true, (WriteStats) null, (LineWriter) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 7
  /*
   * 6 covered goals:
   * 1 net.sourceforge.schemaspy.view.DotFormatter.writeRelationships(Lnet/sourceforge/schemaspy/model/Database;Ljava/util/Collection;ZZZLnet/sourceforge/schemaspy/view/WriteStats;Lnet/sourceforge/schemaspy/util/LineWriter;)Z: I37 Branch 50 IFEQ L278 - false
   * 2 net.sourceforge.schemaspy.view.DotFormatter.getInstance()Lnet/sourceforge/schemaspy/view/DotFormatter;: root-Branch
   * 3 net.sourceforge.schemaspy.view.DotFormatter.writeAllRelationships(Lnet/sourceforge/schemaspy/model/Database;Ljava/util/Collection;ZZLnet/sourceforge/schemaspy/view/WriteStats;Lnet/sourceforge/schemaspy/util/LineWriter;)Z: root-Branch
   * 4 net.sourceforge.schemaspy.view.DotFormatter.writeRelationships(Lnet/sourceforge/schemaspy/model/Database;Ljava/util/Collection;ZZZLnet/sourceforge/schemaspy/view/WriteStats;Lnet/sourceforge/schemaspy/util/LineWriter;)Z: I7 Branch 47 IFEQ L273 - false
   * 5 net.sourceforge.schemaspy.view.DotFormatter.writeRelationships(Lnet/sourceforge/schemaspy/model/Database;Ljava/util/Collection;ZZZLnet/sourceforge/schemaspy/view/WriteStats;Lnet/sourceforge/schemaspy/util/LineWriter;)Z: I11 Branch 48 IFNE L273 - true
   * 6 net.sourceforge.schemaspy.view.DotFormatter.writeRelationships(Lnet/sourceforge/schemaspy/model/Database;Ljava/util/Collection;ZZZLnet/sourceforge/schemaspy/view/WriteStats;Lnet/sourceforge/schemaspy/util/LineWriter;)Z: I33 Branch 49 IFEQ L277 - false
   */
  @Test
  public void test7()  throws Throwable  {
      DotFormatter dotFormatter0 = DotFormatter.getInstance();
      // Undeclared exception!
      try {
        dotFormatter0.writeAllRelationships((Database) null, (Collection<Table>) null, true, true, (WriteStats) null, (LineWriter) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
