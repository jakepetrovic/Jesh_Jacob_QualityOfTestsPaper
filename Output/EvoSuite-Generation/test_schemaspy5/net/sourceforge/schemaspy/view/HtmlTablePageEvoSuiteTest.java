/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.schemaspy.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;
import net.sourceforge.schemaspy.model.Database;
import net.sourceforge.schemaspy.model.Table;
import net.sourceforge.schemaspy.model.TableColumn;
import net.sourceforge.schemaspy.util.LineWriter;
import net.sourceforge.schemaspy.view.HtmlFormatter;
import net.sourceforge.schemaspy.view.HtmlTablePage;
import net.sourceforge.schemaspy.view.WriteStats;

public class HtmlTablePageEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sourceforge.schemaspy.view.HtmlTablePage.getPathToRoot()Ljava/lang/String;: root-Branch
   * 2 net.sourceforge.schemaspy.view.HtmlTablePage.getInstance()Lnet/sourceforge/schemaspy/view/HtmlTablePage;: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      HtmlTablePage htmlTablePage0 = HtmlTablePage.getInstance();
      String string0 = htmlTablePage0.getPathToRoot();
      assertEquals("../", string0);
      assertNotNull(string0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.view.HtmlTablePage.write(Lnet/sourceforge/schemaspy/model/Database;Lnet/sourceforge/schemaspy/model/Table;Ljava/io/File;Lnet/sourceforge/schemaspy/view/WriteStats;Lnet/sourceforge/schemaspy/util/LineWriter;)Lnet/sourceforge/schemaspy/view/WriteStats;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      HtmlTablePage htmlTablePage0 = HtmlTablePage.getInstance();
      File file0 = new File("../");
      // Undeclared exception!
      try {
        htmlTablePage0.write((Database) null, (Table) null, file0, (WriteStats) null, (LineWriter) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 net.sourceforge.schemaspy.view.HtmlTablePage.writeColumn(Lnet/sourceforge/schemaspy/model/TableColumn;Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;ZZLnet/sourceforge/schemaspy/util/LineWriter;)V: I11 Branch 10 IFNE L142 - true
   * 2 net.sourceforge.schemaspy.view.HtmlTablePage.writeColumn(Lnet/sourceforge/schemaspy/model/TableColumn;Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;ZZLnet/sourceforge/schemaspy/util/LineWriter;)V: I21 Branch 11 IFEQ L143 - true
   */
  @Test
  public void test2()  throws Throwable  {
      HtmlTablePage htmlTablePage0 = HtmlTablePage.getInstance();
      HtmlFormatter.urlEncode("PROCEDURE");
      TreeSet<TableColumn> treeSet0 = new TreeSet<TableColumn>();
      // Undeclared exception!
      try {
        htmlTablePage0.writeColumn((TableColumn) null, "PROCEDURE", (Set<TableColumn>) treeSet0, (Set<TableColumn>) treeSet0, true, true, (LineWriter) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * 1 net.sourceforge.schemaspy.view.HtmlTablePage.writeColumn(Lnet/sourceforge/schemaspy/model/TableColumn;Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;ZZLnet/sourceforge/schemaspy/util/LineWriter;)V: I11 Branch 10 IFNE L142 - false
   * 2 net.sourceforge.schemaspy.view.HtmlTablePage.writeColumn(Lnet/sourceforge/schemaspy/model/TableColumn;Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;ZZLnet/sourceforge/schemaspy/util/LineWriter;)V: I21 Branch 11 IFEQ L143 - false
   * 3 net.sourceforge.schemaspy.view.HtmlTablePage.getInstance()Lnet/sourceforge/schemaspy/view/HtmlTablePage;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      HtmlTablePage htmlTablePage0 = HtmlTablePage.getInstance();
      HtmlFormatter.urlEncode("../");
      TreeSet<TableColumn> treeSet0 = new TreeSet<TableColumn>();
      // Undeclared exception!
      try {
        htmlTablePage0.writeColumn((TableColumn) null, "%253Ee%257FhM-%2560M%253F", (Set<TableColumn>) treeSet0, (Set<TableColumn>) treeSet0, true, true, (LineWriter) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}