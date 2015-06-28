/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.schemaspy;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import net.sourceforge.schemaspy.TableOrderer;
import net.sourceforge.schemaspy.model.ForeignKeyConstraint;
import net.sourceforge.schemaspy.model.Table;

public class TableOrdererEvoSuiteTest {


  //Test case number: 0
  /*
   * 5 covered goals:
   * 1 net.sourceforge.schemaspy.TableOrderer$1TrimComparator.<init>()V: root-Branch
   * 2 net.sourceforge.schemaspy.TableOrderer.<init>()V: root-Branch
   * 3 net.sourceforge.schemaspy.TableOrderer.sortTrimmedLevel(Ljava/util/List;)Ljava/util/List;: root-Branch
   * 4 net.sourceforge.schemaspy.TableOrderer.getTablesOrderedByRI(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/List;: I33 Branch 4 IFEQ L55 - true
   * 5 net.sourceforge.schemaspy.TableOrderer.getTablesOrderedByRI(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/List;: I92 Branch 8 IFGT L72 - true
   */
  @Test
  public void test0()  throws Throwable  {
      TableOrderer tableOrderer0 = new TableOrderer();
      LinkedHashSet<Table> linkedHashSet0 = new LinkedHashSet<Table>();
      LinkedHashSet<ForeignKeyConstraint> linkedHashSet1 = new LinkedHashSet<ForeignKeyConstraint>();
      List<Table> list0 = tableOrderer0.getTablesOrderedByRI((Collection<Table>) linkedHashSet0, (Collection<ForeignKeyConstraint>) linkedHashSet1);
      assertEquals(0, list0.size());
  }
}
