/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.schemaspy;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.ResourceBundle;
import net.sourceforge.schemaspy.Config;
import net.sourceforge.schemaspy.SchemaAnalyzer;
import net.sourceforge.schemaspy.model.ConnectionFailure;
import net.sourceforge.schemaspy.model.Database;

public class SchemaAnalyzerEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sourceforge.schemaspy.SchemaAnalyzer.analyze(Lnet/sourceforge/schemaspy/Config;)Lnet/sourceforge/schemaspy/model/Database;: I4 Branch 1 IFEQ L85 - false
   * 2 net.sourceforge.schemaspy.SchemaAnalyzer.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      SchemaAnalyzer schemaAnalyzer0 = new SchemaAnalyzer();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "?";
      stringArray0[3] = "J\"q(<h%C~E^d@";
      Config config0 = new Config(stringArray0);
      Database database0 = schemaAnalyzer0.analyze(config0);
      assertNull(database0);
  }

  //Test case number: 1
  /*
   * 6 covered goals:
   * 1 net.sourceforge.schemaspy.SchemaAnalyzer.analyze(Lnet/sourceforge/schemaspy/Config;)Lnet/sourceforge/schemaspy/model/Database;: I4 Branch 1 IFEQ L85 - true
   * 2 net.sourceforge.schemaspy.SchemaAnalyzer.analyze(Lnet/sourceforge/schemaspy/Config;)Lnet/sourceforge/schemaspy/model/Database;: I20 Branch 2 IFEQ L90 - true
   * 3 net.sourceforge.schemaspy.SchemaAnalyzer.analyze(Lnet/sourceforge/schemaspy/Config;)Lnet/sourceforge/schemaspy/model/Database;: I55 Branch 3 IF_ICMPGE L99 - true
   * 4 net.sourceforge.schemaspy.SchemaAnalyzer.analyze(Lnet/sourceforge/schemaspy/Config;)Lnet/sourceforge/schemaspy/model/Database;: I55 Branch 3 IF_ICMPGE L99 - false
   * 5 net.sourceforge.schemaspy.SchemaAnalyzer.analyze(Lnet/sourceforge/schemaspy/Config;)Lnet/sourceforge/schemaspy/model/Database;: I64 Branch 4 IFEQ L100 - false
   * 6 net.sourceforge.schemaspy.SchemaAnalyzer.yankParam(Ljava/util/List;Ljava/lang/String;)V: I9 Branch 87 IFLT L786 - true
   */
  @Test
  public void test1()  throws Throwable  {
      List<String> list0 = ResourceBundle.Control.FORMAT_DEFAULT;
      SchemaAnalyzer.yankParam(list0, "");
      SchemaAnalyzer schemaAnalyzer0 = new SchemaAnalyzer();
      SchemaAnalyzer.yankParam(list0, "2L8TK\"\" l$n'Lk2");
      Config config0 = Config.getInstance();
      Database database0 = schemaAnalyzer0.analyze(config0);
      assertNull(database0);
  }

  //Test case number: 2
  /*
   * 10 covered goals:
   * 1 net.sourceforge.schemaspy.SchemaAnalyzer.getConnection(Lnet/sourceforge/schemaspy/Config;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/sql/Connection;: I6 Branch 75 IFEQ L558 - true
   * 2 net.sourceforge.schemaspy.SchemaAnalyzer.getDriver(Ljava/lang/String;Ljava/lang/String;)Ljava/sql/Driver;: I58 Branch 79 IFLE L633 - true
   * 3 net.sourceforge.schemaspy.SchemaAnalyzer.getDriver(Ljava/lang/String;Ljava/lang/String;)Ljava/sql/Driver;: I86 Branch 80 IFGT L639 - true
   * 4 net.sourceforge.schemaspy.SchemaAnalyzer.getDriverClassLoader(Ljava/util/List;)Ljava/lang/ClassLoader;: I8 Branch 82 IFLE L669 - false
   * 5 net.sourceforge.schemaspy.SchemaAnalyzer.getExistingUrls(Ljava/lang/String;)Ljava/util/List;: I26 Branch 83 IF_ICMPGE L690 - true
   * 6 net.sourceforge.schemaspy.SchemaAnalyzer.getExistingUrls(Ljava/lang/String;)Ljava/util/List;: I26 Branch 83 IF_ICMPGE L690 - false
   * 7 net.sourceforge.schemaspy.SchemaAnalyzer.getExistingUrls(Ljava/lang/String;)Ljava/util/List;: I42 Branch 84 IFEQ L692 - false
   * 8 net.sourceforge.schemaspy.SchemaAnalyzer.getMissingFiles(Ljava/lang/String;)Ljava/util/List;: I26 Branch 85 IF_ICMPGE L710 - true
   * 9 net.sourceforge.schemaspy.SchemaAnalyzer.getMissingFiles(Ljava/lang/String;)Ljava/util/List;: I26 Branch 85 IF_ICMPGE L710 - false
   * 10 net.sourceforge.schemaspy.SchemaAnalyzer.getMissingFiles(Ljava/lang/String;)Ljava/util/List;: I42 Branch 86 IFNE L712 - true
   */
  @Test
  public void test2()  throws Throwable  {
      SchemaAnalyzer schemaAnalyzer0 = new SchemaAnalyzer();
      Config config0 = new Config();
      // Undeclared exception!
      try {
        schemaAnalyzer0.getConnection(config0, "../", "../", "../");
        fail("Expecting exception: ConnectionFailure");
      } catch(ConnectionFailure e) {
        /*
         * java.lang.ClassNotFoundException: ../
         */
      }
  }

  //Test case number: 3
  /*
   * 7 covered goals:
   * 1 net.sourceforge.schemaspy.SchemaAnalyzer.getDriver(Ljava/lang/String;Ljava/lang/String;)Ljava/sql/Driver;: I58 Branch 79 IFLE L633 - false
   * 2 net.sourceforge.schemaspy.SchemaAnalyzer.getDriver(Ljava/lang/String;Ljava/lang/String;)Ljava/sql/Driver;: I86 Branch 80 IFGT L639 - false
   * 3 net.sourceforge.schemaspy.SchemaAnalyzer.getDriver(Ljava/lang/String;Ljava/lang/String;)Ljava/sql/Driver;: I92 Branch 81 IF_ICMPNE L640 - false
   * 4 net.sourceforge.schemaspy.SchemaAnalyzer.getDriverClassLoader(Ljava/util/List;)Ljava/lang/ClassLoader;: I8 Branch 82 IFLE L669 - true
   * 5 net.sourceforge.schemaspy.SchemaAnalyzer.getExistingUrls(Ljava/lang/String;)Ljava/util/List;: I42 Branch 84 IFEQ L692 - true
   * 6 net.sourceforge.schemaspy.SchemaAnalyzer.getMissingFiles(Ljava/lang/String;)Ljava/util/List;: I42 Branch 86 IFNE L712 - false
   * 7 net.sourceforge.schemaspy.SchemaAnalyzer.getConnection(Lnet/sourceforge/schemaspy/Config;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/sql/Connection;: I6 Branch 75 IFEQ L558 - true
   */
  @Test
  public void test3()  throws Throwable  {
      SchemaAnalyzer schemaAnalyzer0 = new SchemaAnalyzer();
      String[] stringArray0 = new String[9];
      stringArray0[0] = ">)UQ&5iwFs;3Y9";
      stringArray0[1] = "|,P-rtLUZ~e";
      stringArray0[2] = "|,P-rtLUZ~e";
      stringArray0[3] = "|,P-rtLUZ~e";
      stringArray0[4] = "|,P-rtLUZ~e";
      stringArray0[5] = "|,P-rtLUZ~e";
      stringArray0[6] = "|,P-rtLUZ~e";
      stringArray0[7] = "|,P-rtLUZ~e";
      stringArray0[8] = "|,P-rtLUZ~e";
      Config config0 = new Config(stringArray0);
      // Undeclared exception!
      try {
        schemaAnalyzer0.getConnection(config0, "|,P-rtLUZ~e", ">)UQ&5iwFs;3Y9", "|,P-rtLUZ~e");
        fail("Expecting exception: ConnectionFailure");
      } catch(ConnectionFailure e) {
        /*
         * java.lang.ClassNotFoundException: >)UQ&5iwFs;3Y9
         */
      }
  }

  //Test case number: 4
  /*
   * 11 covered goals:
   * 1 net.sourceforge.schemaspy.SchemaAnalyzer.getDriver(Ljava/lang/String;Ljava/lang/String;)Ljava/sql/Driver;: I92 Branch 81 IF_ICMPNE L640 - true
   * 2 net.sourceforge.schemaspy.SchemaAnalyzer.<init>()V: root-Branch
   * 3 net.sourceforge.schemaspy.SchemaAnalyzer.getDriver(Ljava/lang/String;Ljava/lang/String;)Ljava/sql/Driver;: I58 Branch 79 IFLE L633 - false
   * 4 net.sourceforge.schemaspy.SchemaAnalyzer.getDriver(Ljava/lang/String;Ljava/lang/String;)Ljava/sql/Driver;: I86 Branch 80 IFGT L639 - false
   * 5 net.sourceforge.schemaspy.SchemaAnalyzer.getExistingUrls(Ljava/lang/String;)Ljava/util/List;: I26 Branch 83 IF_ICMPGE L690 - true
   * 6 net.sourceforge.schemaspy.SchemaAnalyzer.getExistingUrls(Ljava/lang/String;)Ljava/util/List;: I26 Branch 83 IF_ICMPGE L690 - false
   * 7 net.sourceforge.schemaspy.SchemaAnalyzer.getExistingUrls(Ljava/lang/String;)Ljava/util/List;: I42 Branch 84 IFEQ L692 - true
   * 8 net.sourceforge.schemaspy.SchemaAnalyzer.getDriverClassLoader(Ljava/util/List;)Ljava/lang/ClassLoader;: I8 Branch 82 IFLE L669 - true
   * 9 net.sourceforge.schemaspy.SchemaAnalyzer.getMissingFiles(Ljava/lang/String;)Ljava/util/List;: I26 Branch 85 IF_ICMPGE L710 - true
   * 10 net.sourceforge.schemaspy.SchemaAnalyzer.getMissingFiles(Ljava/lang/String;)Ljava/util/List;: I26 Branch 85 IF_ICMPGE L710 - false
   * 11 net.sourceforge.schemaspy.SchemaAnalyzer.getMissingFiles(Ljava/lang/String;)Ljava/util/List;: I42 Branch 86 IFNE L712 - false
   */
  @Test
  public void test4()  throws Throwable  {
      SchemaAnalyzer schemaAnalyzer0 = new SchemaAnalyzer();
      // Undeclared exception!
      try {
        schemaAnalyzer0.getDriver(": athes", ": athes");
        fail("Expecting exception: ConnectionFailure");
      } catch(ConnectionFailure e) {
        /*
         * java.lang.ClassNotFoundException: Class ': athes.class' should be in target project, but could not be found!
         */
      }
  }
}
