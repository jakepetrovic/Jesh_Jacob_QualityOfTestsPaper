/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.schemaspy;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import net.sourceforge.schemaspy.DbAnalyzer;
import net.sourceforge.schemaspy.model.ForeignKeyConstraint;
import net.sourceforge.schemaspy.model.ImpliedForeignKeyConstraint;
import net.sourceforge.schemaspy.model.RailsForeignKeyConstraint;
import net.sourceforge.schemaspy.model.Table;
import net.sourceforge.schemaspy.model.TableColumn;

public class DbAnalyzerEvoSuiteTest {


  //Test case number: 0
  /*
   * 6 covered goals:
   * 1 net.sourceforge.schemaspy.DbAnalyzer$1.<init>()V: root-Branch
   * 2 net.sourceforge.schemaspy.DbAnalyzer.sortColumnsByTable(Ljava/util/List;)Ljava/util/List;: root-Branch
   * 3 net.sourceforge.schemaspy.DbAnalyzer$3.<init>()V: root-Branch
   * 4 net.sourceforge.schemaspy.DbAnalyzer.getImpliedConstraints(Ljava/util/Collection;)Ljava/util/List;: I27 Branch 4 IFEQ L63 - true
   * 5 net.sourceforge.schemaspy.DbAnalyzer.getImpliedConstraints(Ljava/util/Collection;)Ljava/util/List;: I111 Branch 12 IF_ICMPLE L82 - true
   * 6 net.sourceforge.schemaspy.DbAnalyzer.getImpliedConstraints(Ljava/util/Collection;)Ljava/util/List;: I137 Branch 13 IFEQ L88 - true
   */
  @Test
  public void test0()  throws Throwable  {
      TreeSet<Table> treeSet0 = new TreeSet<Table>();
      List<ImpliedForeignKeyConstraint> list0 = DbAnalyzer.getImpliedConstraints((Collection<Table>) treeSet0);
      assertEquals(true, list0.isEmpty());
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * 1 net.sourceforge.schemaspy.DbAnalyzer.sortTablesByName(Ljava/util/List;)Ljava/util/List;: root-Branch
   * 2 net.sourceforge.schemaspy.DbAnalyzer$2.<init>()V: root-Branch
   * 3 net.sourceforge.schemaspy.DbAnalyzer.getTablesWithOneColumn(Ljava/util/Collection;)Ljava/util/List;: I14 Branch 42 IFEQ L254 - true
   */
  @Test
  public void test1()  throws Throwable  {
      LinkedList<Table> linkedList0 = new LinkedList<Table>();
      List<Table> list0 = DbAnalyzer.getTablesWithOneColumn((Collection<Table>) linkedList0);
      assertEquals(true, list0.isEmpty());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.DbAnalyzer.<init>()V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      DbAnalyzer dbAnalyzer0 = new DbAnalyzer();
      assertNotNull(dbAnalyzer0);
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 net.sourceforge.schemaspy.DbAnalyzer.getPopulatedSchemas(Ljava/sql/DatabaseMetaData;)Ljava/util/List;: root-Branch
   * 2 net.sourceforge.schemaspy.DbAnalyzer.getPopulatedSchemas(Ljava/sql/DatabaseMetaData;Ljava/lang/String;Z)Ljava/util/List;: I26 Branch 51 IFEQ L365 - true
   */
  @Test
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try {
        DbAnalyzer.getPopulatedSchemas((DatabaseMetaData) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.DbAnalyzer.getRailsConstraints(Ljava/util/Map;)Ljava/util/List;: I17 Branch 17 IFEQ L126 - true
   */
  @Test
  public void test4()  throws Throwable  {
      HashMap<String, Table> hashMap0 = new HashMap<String, Table>();
      List<RailsForeignKeyConstraint> list0 = DbAnalyzer.getRailsConstraints((Map<String, Table>) hashMap0);
      assertEquals(true, list0.isEmpty());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.DbAnalyzer.getRailsConstraints(Ljava/util/Map;)Ljava/util/List;: I17 Branch 17 IFEQ L126 - false
   */
  @Test
  public void test5()  throws Throwable  {
      HashMap<String, Table> hashMap0 = new HashMap<String, Table>();
      hashMap0.put("", (Table) null);
      // Undeclared exception!
      try {
        DbAnalyzer.getRailsConstraints((Map<String, Table>) hashMap0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.DbAnalyzer.getForeignKeyConstraints(Ljava/util/Collection;)Ljava/util/List;: I14 Branch 24 IFEQ L156 - true
   */
  @Test
  public void test6()  throws Throwable  {
      LinkedList<Table> linkedList0 = new LinkedList<Table>();
      List<ForeignKeyConstraint> list0 = DbAnalyzer.getForeignKeyConstraints((Collection<Table>) linkedList0);
      assertEquals(true, list0.isEmpty());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.DbAnalyzer.getOrphans(Ljava/util/Collection;)Ljava/util/List;: I14 Branch 25 IFEQ L166 - true
   */
  @Test
  public void test7()  throws Throwable  {
      LinkedList<Table> linkedList0 = new LinkedList<Table>();
      List<Table> list0 = DbAnalyzer.getOrphans((Collection<Table>) linkedList0);
      assertEquals(true, list0.isEmpty());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.DbAnalyzer.getMustBeUniqueNullableColumns(Ljava/util/Collection;)Ljava/util/List;: I14 Branch 27 IFEQ L182 - true
   */
  @Test
  public void test8()  throws Throwable  {
      LinkedList<Table> linkedList0 = new LinkedList<Table>();
      List<TableColumn> list0 = DbAnalyzer.getMustBeUniqueNullableColumns((Collection<Table>) linkedList0);
      assertEquals(0, list0.size());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.DbAnalyzer.getMustBeUniqueNullableColumns(Ljava/util/Collection;)Ljava/util/List;: I14 Branch 27 IFEQ L182 - false
   */
  @Test
  public void test9()  throws Throwable  {
      LinkedHashSet<Table> linkedHashSet0 = new LinkedHashSet<Table>();
      linkedHashSet0.add((Table) null);
      // Undeclared exception!
      try {
        DbAnalyzer.getMustBeUniqueNullableColumns((Collection<Table>) linkedHashSet0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.DbAnalyzer.getTablesWithoutIndexes(Ljava/util/Collection;)Ljava/util/List;: I14 Branch 30 IFEQ L199 - true
   */
  @Test
  public void test10()  throws Throwable  {
      LinkedList<Table> linkedList0 = new LinkedList<Table>();
      List<Table> list0 = DbAnalyzer.getTablesWithoutIndexes((Collection<Table>) linkedList0);
      assertEquals(true, list0.isEmpty());
  }

  //Test case number: 11
  /*
   * 3 covered goals:
   * 1 net.sourceforge.schemaspy.DbAnalyzer.getTablesWithIncrementingColumnNames(Ljava/util/Collection;)Ljava/util/List;: I14 Branch 34 IFEQ L210 - true
   * 2 net.sourceforge.schemaspy.DbAnalyzer.sortTablesByName(Ljava/util/List;)Ljava/util/List;: root-Branch
   * 3 net.sourceforge.schemaspy.DbAnalyzer$2.<init>()V: root-Branch
   */
  @Test
  public void test11()  throws Throwable  {
      LinkedList<Table> linkedList0 = new LinkedList<Table>();
      List<Table> list0 = DbAnalyzer.getTablesWithIncrementingColumnNames((Collection<Table>) linkedList0);
      assertEquals(true, list0.isEmpty());
  }

  //Test case number: 12
  /*
   * 3 covered goals:
   * 1 net.sourceforge.schemaspy.DbAnalyzer.getDefaultNullStringColumns(Ljava/util/Collection;)Ljava/util/List;: I14 Branch 44 IFEQ L295 - true
   * 2 net.sourceforge.schemaspy.DbAnalyzer.sortColumnsByTable(Ljava/util/List;)Ljava/util/List;: root-Branch
   * 3 net.sourceforge.schemaspy.DbAnalyzer$3.<init>()V: root-Branch
   */
  @Test
  public void test12()  throws Throwable  {
      TreeSet<Table> treeSet0 = new TreeSet<Table>();
      List<TableColumn> list0 = DbAnalyzer.getDefaultNullStringColumns((Collection<Table>) treeSet0);
      assertEquals(true, list0.isEmpty());
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.DbAnalyzer.getPopulatedSchemas(Ljava/sql/DatabaseMetaData;Ljava/lang/String;Z)Ljava/util/List;: I26 Branch 51 IFEQ L365 - false
   */
  @Test
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try {
        DbAnalyzer.getPopulatedSchemas((DatabaseMetaData) null, "kFN`SU38", true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
