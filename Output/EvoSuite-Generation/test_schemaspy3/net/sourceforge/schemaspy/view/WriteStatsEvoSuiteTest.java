/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.schemaspy.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import net.sourceforge.schemaspy.model.Table;
import net.sourceforge.schemaspy.model.TableColumn;
import net.sourceforge.schemaspy.view.WriteStats;

public class WriteStatsEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sourceforge.schemaspy.view.WriteStats.getNumViewsWritten()I: root-Branch
   * 2 net.sourceforge.schemaspy.view.WriteStats.<init>(Ljava/util/Collection;)V: I19 Branch 1 IFEQ L38 - true
   */
  @Test
  public void test0()  throws Throwable  {
      LinkedHashSet<Table> linkedHashSet0 = new LinkedHashSet<Table>();
      WriteStats writeStats0 = new WriteStats((Collection<Table>) linkedHashSet0);
      assertNotNull(writeStats0);
      
      int int0 = writeStats0.getNumViewsWritten();
      assertEquals(0, int0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.view.WriteStats.getNumTablesWritten()I: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      LinkedHashSet<Table> linkedHashSet0 = new LinkedHashSet<Table>();
      WriteStats writeStats0 = new WriteStats((Collection<Table>) linkedHashSet0);
      assertNotNull(writeStats0);
      
      int int0 = writeStats0.getNumTablesWritten();
      assertEquals(0, int0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.view.WriteStats.<init>(Lnet/sourceforge/schemaspy/view/WriteStats;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      LinkedHashSet<Table> linkedHashSet0 = new LinkedHashSet<Table>();
      WriteStats writeStats0 = new WriteStats((Collection<Table>) linkedHashSet0);
      WriteStats writeStats1 = new WriteStats(writeStats0);
      assertEquals(0, writeStats1.getNumTablesWritten());
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 net.sourceforge.schemaspy.view.WriteStats.getExcludedColumns()Ljava/util/Set;: root-Branch
   * 2 net.sourceforge.schemaspy.view.WriteStats.<init>(Ljava/util/Collection;)V: I19 Branch 1 IFEQ L38 - true
   */
  @Test
  public void test3()  throws Throwable  {
      LinkedHashSet<Table> linkedHashSet0 = new LinkedHashSet<Table>();
      WriteStats writeStats0 = new WriteStats((Collection<Table>) linkedHashSet0);
      Set<TableColumn> set0 = writeStats0.getExcludedColumns();
      assertEquals(true, set0.isEmpty());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.view.WriteStats.<init>(Ljava/util/Collection;)V: I19 Branch 1 IFEQ L38 - false
   */
  @Test
  public void test4()  throws Throwable  {
      LinkedHashSet<Table> linkedHashSet0 = new LinkedHashSet<Table>();
      linkedHashSet0.add((Table) null);
      WriteStats writeStats0 = null;
      try {
        writeStats0 = new WriteStats((Collection<Table>) linkedHashSet0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
