package randoop;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    int var0 = org.databene.jdbacl.DBUtil.getOpenResultSetCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 0);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    org.databene.jdbacl.identity.SimpleTranscoder var0 = new org.databene.jdbacl.identity.SimpleTranscoder();

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    org.databene.jdbacl.DBUtil.assertAllDbResourcesClosed(false);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    org.databene.jdbacl.DatabaseDialectManager var0 = new org.databene.jdbacl.DatabaseDialectManager();

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.Database var8 = org.databene.jdbacl.DBUtil.getMetaData("hi!", true, false, false, false, "", true, false);
      fail("Expected exception of type org.databene.commons.ConfigurationError");
    } catch (org.databene.commons.ConfigurationError e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test6");


    org.databene.jdbacl.model.jdbc.JDBCDBImporter var6 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var6.setImportingIndexes(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.sql.Connection var9 = var6.getConnection();
      fail("Expected exception of type org.databene.commons.ConnectFailedException");
    } catch (org.databene.commons.ConnectFailedException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test7");


    int var0 = org.databene.jdbacl.proxy.LoggingStatementHandler.getOpenStatementCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 0);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test8");


    java.lang.String var1 = org.databene.jdbacl.dialect.H2Util.getInMemoryURL("hi! as 10 on . = 10.");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "jdbc:h2:mem:hi! as 10 on . = 10."+ "'", var1.equals("jdbc:h2:mem:hi! as 10 on . = 10."));

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test9");


    boolean var1 = org.databene.jdbacl.SQLUtil.isProcedureCall("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test10");


    boolean var1 = org.databene.jdbacl.SQLUtil.isProcedureCall("SET GENERATOR . TO -1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test11");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.FKChangeRule var1 = org.databene.jdbacl.model.FKChangeRule.valueOf("drop sequence ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test12");


    org.databene.jdbacl.model.jdbc.JDBCDBImporter var6 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var6.setImportingChecks(false);
    boolean var9 = var6.isImportingIndexes();
    boolean var10 = var6.isImportingIndexes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test13");


    org.databene.jdbacl.DBUtil.resetMonitors();

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test14");


    java.lang.String var2 = org.databene.jdbacl.identity.xml.IdentityParser.createCheckName("jdbc:h2:mem:hi! as 10 on . = 10.", ".");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "jdbc:h2:mem:hi! as 10 on . = 10.-identity-."+ "'", var2.equals("jdbc:h2:mem:hi! as 10 on . = 10.-identity-."));

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test15");


    org.databene.jdbacl.proxy.PooledConnectionHandler.resetMonitors();

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test16");


    java.lang.String var1 = org.databene.jdbacl.SQLUtil.renderValue((java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "'hi!'"+ "'", var1.equals("'hi!'"));

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test17");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.sql.parser.ANTLRNoCaseFileStream var2 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseFileStream("SET GENERATOR . TO -1", "hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test18");


    org.databene.jdbacl.DatabaseTestUtil var0 = new org.databene.jdbacl.DatabaseTestUtil();

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test19");


    org.databene.jdbacl.JDBCDriverInfo var1 = org.databene.jdbacl.JDBCDriverInfo.getInstance("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test20");


    java.awt.Window[] var0 = java.awt.Window.getOwnerlessWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test21");


    boolean var0 = javax.swing.JFrame.isDefaultLookAndFeelDecorated();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test22");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.JDBCConnectData var1 = org.databene.jdbacl.DBUtil.getConnectData("'hi!'");
      fail("Expected exception of type org.databene.commons.ConfigurationError");
    } catch (org.databene.commons.ConfigurationError e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test23");


    org.databene.jdbacl.model.jdbc.JDBCDBImporter var6 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var6.setImportingPackages(false);
    org.databene.jdbacl.model.cache.CachingDBImporter var10 = new org.databene.jdbacl.model.cache.CachingDBImporter((org.databene.jdbacl.model.DBMetaDataImporter)var6, "hi! as 10 on . = 10.");
    var6.setImportingTriggers(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.sql.Connection var13 = var6.getConnection();
      fail("Expected exception of type org.databene.commons.ConnectFailedException");
    } catch (org.databene.commons.ConnectFailedException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test24");


    javax.swing.JFrame.setDefaultLookAndFeelDecorated(true);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test25");


    org.databene.jdbacl.JDBCConnectData var1 = org.databene.jdbacl.DatabaseTestUtil.getConnectData("sequence");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test26");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.identity.mem.MapperState var1 = org.databene.jdbacl.identity.mem.MapperState.valueOf("SET GENERATOR . TO -1");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test27");


    org.databene.jdbacl.model.DBColumn[] var0 = new org.databene.jdbacl.model.DBColumn[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = org.databene.jdbacl.SQLUtil.renderColumnNames(var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test28");


    org.databene.jdbacl.proxy.LoggingPreparedStatementHandler.resetMonitors();

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test29");


    java.lang.String var2 = org.databene.jdbacl.SQLUtil.normalize("select next value for SET GENERATOR . TO -1", true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "select next value for SET GENERATOR.TO - 1"+ "'", var2.equals("select next value for SET GENERATOR.TO - 1"));

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test30");


    java.lang.Boolean var1 = org.databene.jdbacl.SQLUtil.mutatesDataOrStructure("hi! as 10 on . = 10.");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test31");


    org.databene.jdbacl.JDBCConnectData var6 = new org.databene.jdbacl.JDBCConnectData("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)", "hi!", "hi!", "drop generator sequence", "'hi!'", "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.sql.Connection var8 = org.databene.jdbacl.DBUtil.connect(var6, true);
      fail("Expected exception of type org.databene.commons.ConnectFailedException");
    } catch (org.databene.commons.ConnectFailedException e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test32");


    boolean var1 = org.databene.jdbacl.DBUtil.existsEnvironment("'hi!'");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test33");


    org.databene.jdbacl.sql.parser.SQLParser.partition_value_spec_return var0 = new org.databene.jdbacl.sql.parser.SQLParser.partition_value_spec_return();
    java.lang.Object var1 = var0.getTree();
    java.lang.Object var2 = var0.getTree();
    java.lang.Object var3 = var0.getTree();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test34");


    org.databene.jdbacl.version.QueryVersionProvider var1 = new org.databene.jdbacl.version.QueryVersionProvider("alter sequence hi! restart with 1");
    java.lang.String var2 = var1.getQuery();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "alter sequence hi! restart with 1"+ "'", var2.equals("alter sequence hi! restart with 1"));

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test35");


    org.databene.jdbacl.identity.NaturalPkIdentity var1 = new org.databene.jdbacl.identity.NaturalPkIdentity("hi!");
    java.lang.Object[] var3 = org.databene.jdbacl.SQLUtil.parseColumnTypeAndSize("sequence");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.extractPK(var3);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test36");


    org.databene.jdbacl.model.DBCatalog var0 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var1 = var0.getName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeTable("select nextval('')");
      fail("Expected exception of type org.databene.commons.ObjectNotFoundException");
    } catch (org.databene.commons.ObjectNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test37");


    org.databene.jdbacl.Main var0 = new org.databene.jdbacl.Main();

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test38");


    boolean var1 = org.databene.jdbacl.SQLUtil.isQuery("'hi!'");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test39");


    int var0 = org.databene.jdbacl.DBUtil.getOpenStatementCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 0);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test40");


    java.lang.String var1 = org.databene.jdbacl.DBUtil.escape("sequence");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "sequence"+ "'", var1.equals("sequence"));

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test41");


    java.lang.String var1 = org.databene.jdbacl.dialect.H2Util.getInMemoryURL("select next value for 10");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "jdbc:h2:mem:select next value for 10"+ "'", var1.equals("jdbc:h2:mem:select next value for 10"));

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test42");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.sql.Connection var1 = org.databene.jdbacl.dialect.HSQLUtil.connectInMemoryDB("");
      fail("Expected exception of type org.databene.commons.ConnectFailedException");
    } catch (org.databene.commons.ConnectFailedException e) {
      // Expected exception.
    }

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test43");


    org.databene.jdbacl.model.DBCatalog var0 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var1 = var0.getName();
    java.util.List var2 = var0.getComponents();
    java.util.List var3 = var0.getSequences();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test44");


    org.databene.jdbacl.proxy.LoggingResultSetHandler.resetMonitors();

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test45");


    org.databene.jdbacl.identity.NaturalPkIdentity var1 = new org.databene.jdbacl.identity.NaturalPkIdentity("hi!");
    java.lang.String var2 = var1.getName();
    boolean var4 = var1.equals((java.lang.Object)(-1.0d));
    java.lang.String var5 = var1.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi! identity by primary key"+ "'", var5.equals("hi! identity by primary key"));

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test46");


    org.databene.jdbacl.model.jdbc.JDBCDBImporter var8 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var8.setImportingChecks(false);
    java.lang.String var11 = org.databene.jdbacl.SQLUtil.substituteMarkers("NOT REGEXP_MATCHES(sequence, '')", "hi!", (java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "NOT REGEXP_MATCHES(sequence, '')"+ "'", var11.equals("NOT REGEXP_MATCHES(sequence, '')"));

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test47");


    org.databene.jdbacl.model.jdbc.JDBCDBImporter var6 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var6.setImportingPackages(false);
    var6.close();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.Database var10 = var6.importDatabase();
      fail("Expected exception of type org.databene.commons.ConnectFailedException");
    } catch (org.databene.commons.ConnectFailedException e) {
      // Expected exception.
    }

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test48");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.sql.parser.ANTLRNoCaseFileStream var2 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseFileStream("'hi!'", "NOT drop generator sequence ~ 'hi!'");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test49");


    org.databene.jdbacl.model.jdbc.JDBCDBImporter var6 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var6.setImportingPackages(false);
    org.databene.jdbacl.model.cache.CachingDBImporter var10 = new org.databene.jdbacl.model.cache.CachingDBImporter((org.databene.jdbacl.model.DBMetaDataImporter)var6, "hi! as 10 on . = 10.");
    var10.close();

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test50");


    org.databene.jdbacl.model.DefaultDBTable var0 = new org.databene.jdbacl.model.DefaultDBTable();
    var0.setDoc(".");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.DBColumn var4 = var0.getColumn("select next value for SET GENERATOR . TO -1");
      fail("Expected exception of type org.databene.commons.ObjectNotFoundException");
    } catch (org.databene.commons.ObjectNotFoundException e) {
      // Expected exception.
    }

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test51");


    org.databene.jdbacl.model.DBCatalog var1 = new org.databene.jdbacl.model.DBCatalog("select next value for 10");

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test52");


    org.databene.jdbacl.sql.ColumnExpression var2 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var5 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var6 = var5.getValue();
    org.databene.jdbacl.sql.ColumnExpression var9 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var10 = var9.getValue();
    org.databene.jdbacl.sql.BetweenExpression var11 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var2, (org.databene.script.Expression)var5, (org.databene.script.Expression)var9);
    boolean var12 = var11.isConstant();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "sequence"+ "'", var6.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "sequence"+ "'", var10.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test53");


    org.databene.jdbacl.model.jdbc.JDBCDBImporter var6 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var6.setImportingIndexes(true);
    var6.setImportingSequences(true);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test54");


    org.databene.jdbacl.proxy.LoggingStatementHandler.resetMonitors();

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test55");


    org.databene.jdbacl.SQLUtil var0 = new org.databene.jdbacl.SQLUtil();

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test56");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.JDBCConnectData var1 = org.databene.jdbacl.DBUtil.getConnectData("NaturalPkIdentity(hi!)");
      fail("Expected exception of type org.databene.commons.ConfigurationError");
    } catch (org.databene.commons.ConfigurationError e) {
      // Expected exception.
    }

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test57");


    boolean var1 = org.databene.jdbacl.SQLUtil.isProcedureCall("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test58");


    int var0 = org.databene.jdbacl.proxy.LoggingPreparedStatementHandler.getOpenStatementCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 0);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test59");


    org.databene.jdbacl.dialect.DerbyDialect var0 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var2 = var0.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var3 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var4 = var3.getName();
    java.lang.String var5 = var0.formatValue((java.lang.Object)var3);
    java.util.List var6 = var3.getComponents();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.removeTable("call next value for 'hi!'");
      fail("Expected exception of type org.databene.commons.ObjectNotFoundException");
    } catch (org.databene.commons.ObjectNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test60");


    org.databene.jdbacl.dialect.HSQLUtil var0 = new org.databene.jdbacl.dialect.HSQLUtil();

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test61");


    java.lang.String var2 = org.databene.jdbacl.identity.xml.IdentityParser.createCheckName("hi!", "CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT"+ "'", var2.equals("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT"));

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test62");


    org.databene.jdbacl.dialect.SqlServerDialect var0 = new org.databene.jdbacl.dialect.SqlServerDialect();
    boolean var2 = var0.isDeterministicPKName("10");
    org.databene.jdbacl.DBExecutionResult var4 = new org.databene.jdbacl.DBExecutionResult((java.lang.Object)var2, (java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test63");


    org.databene.jdbacl.JDBCDriverInfo var1 = org.databene.jdbacl.JDBCDriverInfo.getInstance("call next value for 'hi!'");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test64");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.identity.mem.MapperState var1 = org.databene.jdbacl.identity.mem.MapperState.valueOf("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test65");


    int var0 = org.databene.jdbacl.proxy.LoggingResultSetHandler.getOpenResultSetCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 0);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test66");


    org.databene.jdbacl.identity.NaturalPkIdentity var1 = new org.databene.jdbacl.identity.NaturalPkIdentity("hi!");
    java.lang.String var2 = var1.getName();
    boolean var4 = var1.equals((java.lang.Object)(-1.0d));
    org.databene.jdbacl.model.DefaultDBTable var5 = new org.databene.jdbacl.model.DefaultDBTable();
    var5.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var8 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var9 = var8.getForeignKeyConstraints();
    var5.addReferrer((org.databene.jdbacl.model.DBTable)var8);
    java.lang.String[] var16 = new java.lang.String[] { ""};
    java.lang.String[] var20 = new java.lang.String[] { ""};
    java.lang.String var21 = org.databene.jdbacl.SQLUtil.join("", "", var16, "hi!", "10", var20);
    org.databene.jdbacl.model.DBUniqueConstraint var22 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var8, "select nextval('')", false, var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var23 = var1.extractPK((java.lang.Object[])var16);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi! as 10 on . = 10."+ "'", var21.equals("hi! as 10 on . = 10."));

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test67");


    java.lang.String var1 = org.databene.jdbacl.SQLUtil.removeComments("hi! identity by primary key");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi! identity by primary key"+ "'", var1.equals("hi! identity by primary key"));

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test68");


    org.databene.jdbacl.model.FKChangeRule[] var0 = org.databene.jdbacl.model.FKChangeRule.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test69");


    boolean var1 = org.databene.jdbacl.SQLUtil.isDML("drop sequence ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test70");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.NameSpec var1 = org.databene.jdbacl.NameSpec.valueOf("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test71");


    org.databene.jdbacl.model.jdbc.JDBCDBImporter var6 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var6.setImportingPackages(false);
    org.databene.jdbacl.model.cache.CachingDBImporter var10 = new org.databene.jdbacl.model.cache.CachingDBImporter((org.databene.jdbacl.model.DBMetaDataImporter)var6, "hi! as 10 on . = 10.");
    var6.setImportingTriggers(true);
    var6.setCatalogName("10");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.sql.Connection var15 = var6.getConnection();
      fail("Expected exception of type org.databene.commons.ConnectFailedException");
    } catch (org.databene.commons.ConnectFailedException e) {
      // Expected exception.
    }

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test72");


    org.databene.jdbacl.sql.ColumnExpression var2 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var5 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var6 = var5.getValue();
    org.databene.jdbacl.sql.ColumnExpression var9 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var10 = var9.getValue();
    org.databene.jdbacl.sql.BetweenExpression var11 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var2, (org.databene.script.Expression)var5, (org.databene.script.Expression)var9);
    org.databene.jdbacl.sql.ColumnExpression var14 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var17 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var18 = var17.getValue();
    org.databene.jdbacl.sql.ColumnExpression var21 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var22 = var21.getValue();
    org.databene.jdbacl.sql.BetweenExpression var23 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var14, (org.databene.script.Expression)var17, (org.databene.script.Expression)var21);
    org.databene.jdbacl.sql.ColumnExpression var26 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var29 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var30 = var29.getValue();
    org.databene.jdbacl.sql.ColumnExpression var33 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var34 = var33.getValue();
    org.databene.jdbacl.sql.BetweenExpression var35 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var26, (org.databene.script.Expression)var29, (org.databene.script.Expression)var33);
    org.databene.jdbacl.sql.BetweenExpression var36 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var9, (org.databene.script.Expression)var17, (org.databene.script.Expression)var29);
    org.databene.jdbacl.sql.ColumnExpression var39 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var42 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var43 = var42.getValue();
    org.databene.jdbacl.sql.ColumnExpression var46 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var47 = var46.getValue();
    org.databene.jdbacl.sql.BetweenExpression var48 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var39, (org.databene.script.Expression)var42, (org.databene.script.Expression)var46);
    org.databene.jdbacl.sql.ColumnExpression var51 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var54 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var55 = var54.getValue();
    org.databene.jdbacl.sql.ColumnExpression var58 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var59 = var58.getValue();
    org.databene.jdbacl.sql.BetweenExpression var60 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var51, (org.databene.script.Expression)var54, (org.databene.script.Expression)var58);
    org.databene.jdbacl.sql.ColumnExpression var63 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var66 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var67 = var66.getValue();
    org.databene.jdbacl.sql.ColumnExpression var70 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var71 = var70.getValue();
    org.databene.jdbacl.sql.BetweenExpression var72 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var63, (org.databene.script.Expression)var66, (org.databene.script.Expression)var70);
    org.databene.jdbacl.sql.BetweenExpression var73 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var46, (org.databene.script.Expression)var54, (org.databene.script.Expression)var66);
    org.databene.jdbacl.sql.ColumnExpression var76 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var77 = var76.getValue();
    org.databene.jdbacl.dialect.HSQL2Dialect var78 = new org.databene.jdbacl.dialect.HSQL2Dialect();
    java.lang.String var80 = var78.renderFetchSequenceValue("'hi!'");
    var76.setValue("'hi!'");
    org.databene.jdbacl.sql.BetweenExpression var82 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var36, (org.databene.script.Expression)var66, (org.databene.script.Expression)var76);
    boolean var83 = var36.isConstant();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "sequence"+ "'", var6.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "sequence"+ "'", var10.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "sequence"+ "'", var18.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "sequence"+ "'", var22.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "sequence"+ "'", var30.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "sequence"+ "'", var34.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "sequence"+ "'", var43.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "sequence"+ "'", var47.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "sequence"+ "'", var55.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "sequence"+ "'", var59.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "sequence"+ "'", var67.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "sequence"+ "'", var71.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "sequence"+ "'", var77.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "call next value for 'hi!'"+ "'", var80.equals("call next value for 'hi!'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == true);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test73");


    int var0 = org.databene.jdbacl.DBUtil.getOpenPreparedStatementCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 0);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test74");


    org.databene.jdbacl.dialect.Derby10_6Dialect var0 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var3 = var0.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    boolean var5 = var0.isDeterministicIndexName("select nextval('')");
    java.lang.String var7 = var0.renderDropSequence("-1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "DROP SEQUENCE -1 RESTRICT"+ "'", var7.equals("DROP SEQUENCE -1 RESTRICT"));

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test75");


    org.databene.jdbacl.dialect.DerbyDialect var1 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var3 = var1.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var4 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var5 = var4.getName();
    java.lang.String var6 = var1.formatValue((java.lang.Object)var4);
    var4.setName("'hi!'");
    java.util.List var9 = var4.getSchemas();
    org.databene.jdbacl.model.DBSchema var10 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var4);
    org.databene.jdbacl.dialect.DerbyDialect var13 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var15 = var13.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var16 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var17 = var16.getName();
    java.lang.String var18 = var13.formatValue((java.lang.Object)var16);
    var16.setName("'hi!'");
    java.util.List var21 = var16.getSchemas();
    org.databene.jdbacl.model.DBSchema var22 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var16);
    org.databene.jdbacl.model.DBTrigger var23 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var22);
    var10.addTrigger(var23);
    java.lang.String var25 = var23.getTriggerBody();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test76");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.sql.Connection var5 = org.databene.jdbacl.DBUtil.connect("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)", "DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT", "NOT REGEXP_MATCHES(sequence, '')", "hi! as 10 on . = 10.", true);
      fail("Expected exception of type org.databene.commons.ConnectFailedException");
    } catch (org.databene.commons.ConnectFailedException e) {
      // Expected exception.
    }

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test77");


    org.databene.jdbacl.model.DefaultDBTable var1 = new org.databene.jdbacl.model.DefaultDBTable();
    var1.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var4 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var5 = var4.getForeignKeyConstraints();
    var1.addReferrer((org.databene.jdbacl.model.DBTable)var4);
    java.lang.String[] var12 = new java.lang.String[] { ""};
    java.lang.String[] var16 = new java.lang.String[] { ""};
    java.lang.String var17 = org.databene.jdbacl.SQLUtil.join("", "", var12, "hi!", "10", var16);
    org.databene.jdbacl.model.DBUniqueConstraint var18 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var4, "select nextval('')", false, var12);
    org.databene.jdbacl.model.DBDataType var21 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var22 = var21.isAlpha();
    org.databene.jdbacl.model.DefaultDBColumn var23 = new org.databene.jdbacl.model.DefaultDBColumn("'hi!'", (org.databene.jdbacl.model.DBTable)var4, var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.DBColumn var25 = var4.getColumn("drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)");
      fail("Expected exception of type org.databene.commons.ObjectNotFoundException");
    } catch (org.databene.commons.ObjectNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi! as 10 on . = 10."+ "'", var17.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test78");


    org.databene.jdbacl.model.jdbc.JDBCDBImporter var6 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var6.setImportingPackages(false);
    org.databene.jdbacl.model.cache.CachingDBImporter var10 = new org.databene.jdbacl.model.cache.CachingDBImporter((org.databene.jdbacl.model.DBMetaDataImporter)var6, "hi! as 10 on . = 10.");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.Database var11 = var10.importDatabase();
      fail("Expected exception of type org.databene.commons.ConnectFailedException");
    } catch (org.databene.commons.ConnectFailedException e) {
      // Expected exception.
    }

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test79");


    org.databene.jdbacl.model.DefaultDBTable var0 = new org.databene.jdbacl.model.DefaultDBTable();
    var0.setDoc(".");
    java.util.Set var4 = var0.getUniqueConstraints(false);
    var0.setDoc("select next value for SET GENERATOR.TO - 1");
    org.databene.jdbacl.model.DBIndex var8 = var0.getIndex("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.DBColumn var10 = var0.getColumn("drop generator sequence");
      fail("Expected exception of type org.databene.commons.ObjectNotFoundException");
    } catch (org.databene.commons.ObjectNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test80");


    boolean var1 = org.databene.jdbacl.SQLUtil.isDML("SET GENERATOR . TO -1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test81");


    org.databene.jdbacl.model.DefaultDBTable var0 = new org.databene.jdbacl.model.DefaultDBTable();
    var0.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var3 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var4 = var3.getForeignKeyConstraints();
    var0.addReferrer((org.databene.jdbacl.model.DBTable)var3);
    java.lang.String[] var11 = new java.lang.String[] { ""};
    java.lang.String[] var15 = new java.lang.String[] { ""};
    java.lang.String var16 = org.databene.jdbacl.SQLUtil.join("", "", var11, "hi!", "10", var15);
    org.databene.jdbacl.model.DBUniqueConstraint var17 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var3, "select nextval('')", false, var11);
    var3.setDoc("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT");
    java.lang.String[] var22 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var23 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var22);
    org.databene.jdbacl.model.DBUniqueConstraint var24 = var3.getUniqueConstraint(var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.DBTable var26 = var3.getProvider(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi! as 10 on . = 10."+ "'", var16.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var23.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test82");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mPERCENT();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test83");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.jdbc.JDBCDBImporter var1 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("NOT drop generator sequence ~ 'hi!'");
      fail("Expected exception of type org.databene.commons.ConfigurationError");
    } catch (org.databene.commons.ConfigurationError e) {
      // Expected exception.
    }

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test84");


    java.lang.Boolean var1 = org.databene.jdbacl.SQLUtil.mutatesDataOrStructure("jdbc:h2:mem:hi! as 10 on . = 10.");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test85");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mT__103();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test86");


    org.databene.jdbacl.SQLScriptException var1 = new org.databene.jdbacl.SQLScriptException(1);
    org.databene.jdbacl.SQLScriptException var3 = var1.withUri("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT");
    org.databene.jdbacl.SQLScriptException var5 = new org.databene.jdbacl.SQLScriptException(1);
    var3.addSuppressed((java.lang.Throwable)var5);
    org.databene.jdbacl.SQLScriptException var9 = new org.databene.jdbacl.SQLScriptException((java.lang.Throwable)var3, "drop sequence ", (-1));
    java.util.List var11 = org.antlr.runtime.BaseRecognizer.getRuleInvocationStack((java.lang.Throwable)var3, "DROP SEQUENCE ");
    java.lang.String var12 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "org.databene.jdbacl.SQLScriptException: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1: "+ "'", var12.equals("org.databene.jdbacl.SQLScriptException: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1: "));

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test87");


    org.databene.jdbacl.dialect.DerbyDialect var1 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var3 = var1.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var4 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var5 = var4.getName();
    java.lang.String var6 = var1.formatValue((java.lang.Object)var4);
    var4.setName("'hi!'");
    java.util.List var9 = var4.getSchemas();
    org.databene.jdbacl.model.DBSchema var10 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var4);
    org.databene.jdbacl.dialect.DerbyDialect var13 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var15 = var13.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var16 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var17 = var16.getName();
    java.lang.String var18 = var13.formatValue((java.lang.Object)var16);
    var16.setName("'hi!'");
    java.util.List var21 = var16.getSchemas();
    org.databene.jdbacl.model.DBSchema var22 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var16);
    org.databene.jdbacl.model.DBTrigger var23 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var22);
    var10.addTrigger(var23);
    org.databene.jdbacl.model.DefaultDBTable var25 = new org.databene.jdbacl.model.DefaultDBTable();
    var25.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var28 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var29 = var28.getForeignKeyConstraints();
    var25.addReferrer((org.databene.jdbacl.model.DBTable)var28);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var23.setOwner((org.databene.jdbacl.model.CompositeDBObject)var28);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test88");


    org.databene.jdbacl.version.QueryVersionProvider var1 = new org.databene.jdbacl.version.QueryVersionProvider("SET GENERATOR . TO -1");
    var1.setQuery("10");
    java.lang.String var4 = var1.getQuery();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "10"+ "'", var4.equals("10"));

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test89");


    org.databene.jdbacl.model.TableContainer var4 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var5 = var4.getTables();
    org.databene.jdbacl.model.TableContainer var6 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var4);
    org.databene.jdbacl.model.DefaultDBTable var7 = new org.databene.jdbacl.model.DefaultDBTable();
    var7.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var10 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var11 = var10.getForeignKeyConstraints();
    var7.addReferrer((org.databene.jdbacl.model.DBTable)var10);
    var4.addTable((org.databene.jdbacl.model.DBTable)var10);
    java.lang.String[] var18 = new java.lang.String[] { ""};
    java.lang.String[] var22 = new java.lang.String[] { ""};
    java.lang.String var23 = org.databene.jdbacl.SQLUtil.join("", "", var18, "hi!", "10", var22);
    java.lang.String var24 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var18);
    org.databene.jdbacl.model.TableContainer var27 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var28 = var27.getTables();
    org.databene.jdbacl.model.TableContainer var29 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var27);
    org.databene.jdbacl.model.DefaultDBTable var30 = new org.databene.jdbacl.model.DefaultDBTable();
    var30.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var33 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var34 = var33.getForeignKeyConstraints();
    var30.addReferrer((org.databene.jdbacl.model.DBTable)var33);
    var27.addTable((org.databene.jdbacl.model.DBTable)var33);
    java.lang.String[] var39 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var40 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var39);
    org.databene.jdbacl.model.DBForeignKeyConstraint var41 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var10, var18, (org.databene.jdbacl.model.DBTable)var33, var39);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var43 = var41.columnReferencedBy("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")");
      fail("Expected exception of type org.databene.commons.ObjectNotFoundException");
    } catch (org.databene.commons.ObjectNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi! as 10 on . = 10."+ "'", var23.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "."+ "'", var24.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var40.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test90");


    boolean var1 = org.databene.jdbacl.SQLUtil.isDDL("jdbc:h2:mem:select next value for 10");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test91");


    org.databene.jdbacl.dialect.FirebirdDialect var0 = new org.databene.jdbacl.dialect.FirebirdDialect();
    java.lang.String var3 = var0.renderSetSequenceValue(".", 0L);
    boolean var5 = var0.isDeterministicFKName("hi!");
    java.lang.String var6 = var0.getJDBCDriverClass();
    boolean var9 = var0.isDefaultCatalog("call next value for 'hi!'", "jdbc:h2:mem:select next value for 10");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "SET GENERATOR . TO -1"+ "'", var3.equals("SET GENERATOR . TO -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.firebirdsql.jdbc.FBDriver"+ "'", var6.equals("org.firebirdsql.jdbc.FBDriver"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test92");


    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var1 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var1.setCharPositionInLine(1);
    int var4 = var1.getCharPositionInLine();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = var1.substring(100, (-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test93");


    org.databene.jdbacl.dialect.SqlServerDialect var0 = new org.databene.jdbacl.dialect.SqlServerDialect();
    java.lang.String[] var8 = new java.lang.String[] { ""};
    java.lang.String[] var12 = new java.lang.String[] { ""};
    java.lang.String var13 = org.databene.jdbacl.SQLUtil.join("", "", var8, "hi!", "10", var12);
    java.lang.String var14 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var8);
    java.lang.String[] var21 = new java.lang.String[] { ""};
    java.lang.String[] var25 = new java.lang.String[] { ""};
    java.lang.String var26 = org.databene.jdbacl.SQLUtil.join("", "", var21, "hi!", "10", var25);
    java.lang.String var27 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var25);
    java.lang.String var28 = org.databene.jdbacl.SQLUtil.leftJoin("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE ", var8, "jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1)", "drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)", var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var29 = var0.renderCase("CREATE SEQUENCE 10", "select next value for SET GENERATOR.TO - 1", var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi! as 10 on . = 10."+ "'", var13.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "."+ "'", var14.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi! as 10 on . = 10."+ "'", var26.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "."+ "'", var27.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)."+ "'", var28.equals("left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)."));

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test94");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.DBUtil.checkReadOnly("'hi!'", true);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test95");


    boolean var1 = org.databene.jdbacl.SQLUtil.isQuery("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test96");


    org.databene.jdbacl.JDBCConnectData var6 = new org.databene.jdbacl.JDBCConnectData("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)", "hi!", "hi!", "drop generator sequence", "'hi!'", "hi!");
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var7 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter(var6);
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var8 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.sql.Connection var10 = org.databene.jdbacl.DBUtil.connect(var6, false);
      fail("Expected exception of type org.databene.commons.ConnectFailedException");
    } catch (org.databene.commons.ConnectFailedException e) {
      // Expected exception.
    }

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test97");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mNVARCHAR2();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test98");


    org.databene.jdbacl.model.DBCatalog var0 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var1 = var0.getName();
    org.databene.jdbacl.model.Database var2 = var0.getDatabase();
    java.lang.String var3 = var0.getDoc();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.DBTable var5 = var0.getTable("NOT drop generator sequence ~ 'hi!'");
      fail("Expected exception of type org.databene.commons.ObjectNotFoundException");
    } catch (org.databene.commons.ObjectNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test99");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mT__74();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test100");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mT__104();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test101");


    org.databene.jdbacl.dialect.DerbyDialect var0 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var2 = var0.isDeterministicPKName("hi! as 10 on . = 10.");
    boolean var4 = var0.isDeterministicIndexName("sequence");
    boolean var7 = var0.isDefaultSchema("drop generator CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", "hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test102");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mT__101();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test103");


    org.databene.jdbacl.model.DBSequence var3 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var3.setCache((java.lang.Long)100L);
    java.lang.String var6 = var3.getObjectType();
    java.math.BigInteger var7 = var3.getIncrementIfNotDefault();
    org.databene.jdbacl.model.DBSequence var11 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var11.setName("10");
    java.math.BigInteger var14 = var11.getIncrement();
    java.math.BigInteger var15 = var11.getIncrement();
    var3.setLastNumber(var15);
    org.databene.jdbacl.model.DBSequence var20 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var20.setName("10");
    java.math.BigInteger var23 = var20.getIncrement();
    var3.setMaxValue(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "sequence"+ "'", var6.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test104");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var9 = var4.LT((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test105");


    java.lang.String var1 = org.databene.jdbacl.dialect.H2Util.getInMemoryURL("org.databene.jdbacl.SQLScriptException: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "jdbc:h2:mem:org.databene.jdbacl.SQLScriptException: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1: "+ "'", var1.equals("jdbc:h2:mem:org.databene.jdbacl.SQLScriptException: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1: "));

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test106");


    org.databene.jdbacl.model.DefaultDBTable var0 = new org.databene.jdbacl.model.DefaultDBTable();
    var0.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var3 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var4 = var3.getForeignKeyConstraints();
    var0.addReferrer((org.databene.jdbacl.model.DBTable)var3);
    java.lang.String[] var11 = new java.lang.String[] { ""};
    java.lang.String[] var15 = new java.lang.String[] { ""};
    java.lang.String var16 = org.databene.jdbacl.SQLUtil.join("", "", var11, "hi!", "10", var15);
    org.databene.jdbacl.model.DBUniqueConstraint var17 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var3, "select nextval('')", false, var11);
    java.lang.String var18 = var17.toString();
    boolean var19 = var17.isNameDeterministic();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var20 = org.databene.jdbacl.DBUtil.containsMandatoryColumn((org.databene.jdbacl.model.DBConstraint)var17);
      fail("Expected exception of type org.databene.commons.ObjectNotFoundException");
    } catch (org.databene.commons.ObjectNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi! as 10 on . = 10."+ "'", var16.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "CONSTRAINT \"select nextval('')\" UNIQUE ()"+ "'", var18.equals("CONSTRAINT \"select nextval('')\" UNIQUE ()"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test107");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mT__87();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test108");


    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var1 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var1.reset();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.script.Expression var3 = org.databene.jdbacl.sql.SQLParserUtil.parseExpression((org.antlr.runtime.CharStream)var1);
      fail("Expected exception of type org.databene.commons.SyntaxError");
    } catch (org.databene.commons.SyntaxError e) {
      // Expected exception.
    }

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test109");


    java.lang.String var1 = org.databene.jdbacl.dialect.HSQLUtil.getInMemoryURL("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "jdbc:hsqldb:mem:jdbc:h2:mem:hi! as 10 on . = 10.-identity-."+ "'", var1.equals("jdbc:hsqldb:mem:jdbc:h2:mem:hi! as 10 on . = 10.-identity-."));

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test110");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.jdbc.JDBCDBImporter var1 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("select next value for SET GENERATOR . TO -1");
      fail("Expected exception of type org.databene.commons.ConfigurationError");
    } catch (org.databene.commons.ConfigurationError e) {
      // Expected exception.
    }

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test111");


    org.databene.jdbacl.model.DBDataType var2 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var3 = var2.isAlpha();
    java.lang.String var4 = var2.getName();
    boolean var5 = var2.isLOB();
    java.lang.String var6 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "DROP SEQUENCE "+ "'", var4.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "DROP SEQUENCE "+ "'", var6.equals("DROP SEQUENCE "));

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test112");


    boolean var1 = org.databene.jdbacl.SQLUtil.isProcedureCall("org.firebirdsql.jdbc.FBDriver");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test113");


    java.lang.String var1 = org.databene.jdbacl.dialect.H2Util.getInMemoryURL("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).DROP SEQUENCE ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "jdbc:h2:mem:VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).DROP SEQUENCE "+ "'", var1.equals("jdbc:h2:mem:VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).DROP SEQUENCE "));

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test114");


    org.databene.jdbacl.JDBCDriverInfo var0 = new org.databene.jdbacl.JDBCDriverInfo();
    var0.setDriverClass("hi!");
    java.lang.String var3 = var0.getUrlPattern();
    java.lang.String var4 = var0.getDefaultSchema();
    java.lang.String[] var5 = var0.getJars();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.getDefaultDatabase();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test115");


    org.databene.jdbacl.model.DefaultDBTable var1 = new org.databene.jdbacl.model.DefaultDBTable();
    var1.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var4 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var5 = var4.getForeignKeyConstraints();
    var1.addReferrer((org.databene.jdbacl.model.DBTable)var4);
    org.databene.jdbacl.model.DBDataType var9 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var10 = var9.isAlpha();
    java.lang.String var11 = var9.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var12 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var15 = var12.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var17 = var12.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var18 = var9.equals((java.lang.Object)var17);
    org.databene.jdbacl.model.DefaultDBColumn var21 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var4, var9, (java.lang.Integer)0, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DefaultDBTable var22 = new org.databene.jdbacl.model.DefaultDBTable();
    var22.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var25 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var26 = var25.getForeignKeyConstraints();
    var22.addReferrer((org.databene.jdbacl.model.DBTable)var25);
    var4.addReferrer((org.databene.jdbacl.model.DBTable)var22);
    org.databene.jdbacl.model.TableContainer var33 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var34 = var33.getTables();
    org.databene.jdbacl.model.TableContainer var35 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var33);
    org.databene.jdbacl.model.DefaultDBTable var36 = new org.databene.jdbacl.model.DefaultDBTable();
    var36.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var39 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var40 = var39.getForeignKeyConstraints();
    var36.addReferrer((org.databene.jdbacl.model.DBTable)var39);
    var33.addTable((org.databene.jdbacl.model.DBTable)var39);
    java.lang.String[] var47 = new java.lang.String[] { ""};
    java.lang.String[] var51 = new java.lang.String[] { ""};
    java.lang.String var52 = org.databene.jdbacl.SQLUtil.join("", "", var47, "hi!", "10", var51);
    java.lang.String var53 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var47);
    org.databene.jdbacl.model.TableContainer var56 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var57 = var56.getTables();
    org.databene.jdbacl.model.TableContainer var58 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var56);
    org.databene.jdbacl.model.DefaultDBTable var59 = new org.databene.jdbacl.model.DefaultDBTable();
    var59.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var62 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var63 = var62.getForeignKeyConstraints();
    var59.addReferrer((org.databene.jdbacl.model.DBTable)var62);
    var56.addTable((org.databene.jdbacl.model.DBTable)var62);
    java.lang.String[] var68 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var69 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var68);
    org.databene.jdbacl.model.DBForeignKeyConstraint var70 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var39, var47, (org.databene.jdbacl.model.DBTable)var62, var68);
    org.databene.jdbacl.model.DBTable var71 = var70.getRefereeTable();
    var4.addForeignKey(var70);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var75 = var70.columnReferencedBy("hi! identity by primary key", true);
      fail("Expected exception of type org.databene.commons.ObjectNotFoundException");
    } catch (org.databene.commons.ObjectNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "DROP SEQUENCE "+ "'", var11.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var17.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi! as 10 on . = 10."+ "'", var52.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "."+ "'", var53.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var69.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test116");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.skip();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var3 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var5 = var3.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var3);
    org.databene.jdbacl.sql.parser.SQLLexer var7 = new org.databene.jdbacl.sql.parser.SQLLexer();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var9 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var9.release((-1));
    boolean var13 = var7.mismatchIsUnwantedToken((org.antlr.runtime.IntStream)var9, 0);
    var0.setCharStream((org.antlr.runtime.CharStream)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mT__126();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test117");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.sql.parser.ANTLRNoCaseFileStream var1 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseFileStream("jdbc:h2:mem:org.databene.jdbacl.SQLScriptException: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1: ");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test118");


    org.databene.jdbacl.dialect.PostgreSQLDialect var0 = new org.databene.jdbacl.dialect.PostgreSQLDialect();
    boolean var3 = var0.isDefaultCatalog("", "");
    java.lang.String var5 = var0.renderDropSequence("");
    boolean var7 = var0.isDeterministicFKName("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    java.lang.String var9 = var0.renderFetchSequenceValue("");
    java.lang.String var13 = var0.regexQuery("drop generator sequence", true, "hi!");
    org.databene.jdbacl.identity.NaturalPkIdentity var17 = new org.databene.jdbacl.identity.NaturalPkIdentity("call next value for 'hi!'");
    java.lang.String[] var23 = new java.lang.String[] { ""};
    java.lang.String[] var27 = new java.lang.String[] { ""};
    java.lang.String var28 = org.databene.jdbacl.SQLUtil.join("", "", var23, "hi!", "10", var27);
    java.lang.String var29 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var23);
    java.lang.String[] var36 = new java.lang.String[] { ""};
    java.lang.String[] var40 = new java.lang.String[] { ""};
    java.lang.String var41 = org.databene.jdbacl.SQLUtil.join("", "", var36, "hi!", "10", var40);
    java.lang.String var42 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var40);
    java.lang.String var43 = org.databene.jdbacl.SQLUtil.leftJoin("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE ", var23, "jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1)", "drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)", var40);
    java.lang.String var44 = var17.extractNK((java.lang.Object[])var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var45 = var0.renderCase("CREATE GENERATOR drop sequence ", "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).DROP SEQUENCE ", var23);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "drop sequence "+ "'", var5.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "select nextval('')"+ "'", var9.equals("select nextval('')"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "NOT drop generator sequence ~ 'hi!'"+ "'", var13.equals("NOT drop generator sequence ~ 'hi!'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi! as 10 on . = 10."+ "'", var28.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "."+ "'", var29.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi! as 10 on . = 10."+ "'", var41.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "."+ "'", var42.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)."+ "'", var43.equals("left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + ""+ "'", var44.equals(""));

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test119");


    org.databene.jdbacl.model.TableContainer var2 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var3 = var2.getTables();
    org.databene.jdbacl.model.TableContainer var4 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var2);
    org.databene.jdbacl.model.DefaultDBTable var5 = new org.databene.jdbacl.model.DefaultDBTable();
    var5.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var8 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var9 = var8.getForeignKeyConstraints();
    var5.addReferrer((org.databene.jdbacl.model.DBTable)var8);
    var2.addTable((org.databene.jdbacl.model.DBTable)var8);
    org.databene.jdbacl.JDBCDriverInfo var12 = new org.databene.jdbacl.JDBCDriverInfo();
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var19 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var19.setExcludeTables("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    boolean var22 = var12.equals((java.lang.Object)var19);
    java.lang.String[] var26 = new java.lang.String[] { ""};
    java.lang.String[] var30 = new java.lang.String[] { ""};
    java.lang.String var31 = org.databene.jdbacl.SQLUtil.join("", "", var26, "hi!", "10", var30);
    var12.setJars(var30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.DBColumn[] var33 = var8.getColumns(var30);
      fail("Expected exception of type org.databene.commons.ObjectNotFoundException");
    } catch (org.databene.commons.ObjectNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi! as 10 on . = 10."+ "'", var31.equals("hi! as 10 on . = 10."));

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test120");


    org.databene.jdbacl.model.DBSequence var3 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    java.lang.String var4 = var3.dropDDL();
    java.math.BigInteger var5 = var3.getMinValueIfNotDefault();
    java.math.BigInteger var6 = var3.getMaxValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "drop sequence "+ "'", var4.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test121");


    org.databene.jdbacl.model.jdbc.JDBCDBImporter var6 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var6.setImportingIndexes(true);
    org.databene.jdbacl.model.cache.CachingDBImporter var10 = new org.databene.jdbacl.model.cache.CachingDBImporter((org.databene.jdbacl.model.DBMetaDataImporter)var6, "hi! identity by primary key");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.Database var11 = var10.importDatabase();
      fail("Expected exception of type org.databene.commons.ConnectFailedException");
    } catch (org.databene.commons.ConnectFailedException e) {
      // Expected exception.
    }

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test122");


    org.databene.jdbacl.sql.SQLParserUtil var0 = new org.databene.jdbacl.sql.SQLParserUtil();

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test123");


    java.awt.Frame[] var0 = java.awt.Frame.getFrames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test124");


    java.lang.String[] var4 = new java.lang.String[] { ""};
    java.lang.String[] var8 = new java.lang.String[] { ""};
    java.lang.String var9 = org.databene.jdbacl.SQLUtil.join("", "", var4, "hi!", "10", var8);
    org.databene.jdbacl.identity.IdentityProvider var10 = new org.databene.jdbacl.identity.IdentityProvider();
    org.databene.jdbacl.identity.SubNkPkQueryIdentity var11 = new org.databene.jdbacl.identity.SubNkPkQueryIdentity("null", var4, var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.identity.IdentityModel var14 = var10.getIdentity("CREATE GENERATOR drop sequence ", true);
      fail("Expected exception of type org.databene.commons.ObjectNotFoundException");
    } catch (org.databene.commons.ObjectNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi! as 10 on . = 10."+ "'", var9.equals("hi! as 10 on . = 10."));

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test125");


    int var0 = org.databene.jdbacl.proxy.PooledConnectionHandler.getOpenConnectionCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 3);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test126");


    boolean var4 = org.databene.jdbacl.DBUtil.available("select next value for 10", "catalog", "NaturalPkIdentity(hi!)", "null");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test127");


    java.lang.Boolean var1 = org.databene.jdbacl.SQLUtil.mutatesStructure("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + false+ "'", var1.equals(false));

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test128");


    org.databene.jdbacl.model.DefaultDBTable var1 = new org.databene.jdbacl.model.DefaultDBTable();
    var1.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var4 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var5 = var4.getForeignKeyConstraints();
    var1.addReferrer((org.databene.jdbacl.model.DBTable)var4);
    java.lang.String[] var12 = new java.lang.String[] { ""};
    java.lang.String[] var16 = new java.lang.String[] { ""};
    java.lang.String var17 = org.databene.jdbacl.SQLUtil.join("", "", var12, "hi!", "10", var16);
    org.databene.jdbacl.model.DBUniqueConstraint var18 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var4, "select nextval('')", false, var12);
    org.databene.jdbacl.model.DBDataType var21 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var22 = var21.isAlpha();
    org.databene.jdbacl.model.DefaultDBColumn var23 = new org.databene.jdbacl.model.DefaultDBColumn("'hi!'", (org.databene.jdbacl.model.DBTable)var4, var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.DBNotNullConstraint var27 = new org.databene.jdbacl.model.DBNotNullConstraint((org.databene.jdbacl.model.DBTable)var4, "hi! as 10 on . = 10.", true, "drop sequence jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
      fail("Expected exception of type org.databene.commons.ObjectNotFoundException");
    } catch (org.databene.commons.ObjectNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi! as 10 on . = 10."+ "'", var17.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test129");


    org.databene.jdbacl.dialect.PostgreSQLDialect var0 = new org.databene.jdbacl.dialect.PostgreSQLDialect();
    boolean var3 = var0.isDefaultCatalog("", "");
    java.lang.String var5 = var0.formatValue((java.lang.Object)10);
    java.lang.String var7 = var0.renderFetchSequenceValue("alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP 'alter sequence hi! restart with 1'");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "10"+ "'", var5.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "select nextval('alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP 'alter sequence hi! restart with 1'')"+ "'", var7.equals("select nextval('alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP 'alter sequence hi! restart with 1'')"));

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test130");


    org.databene.jdbacl.sql.parser.SQLParser.drop_sequence_return var0 = new org.databene.jdbacl.sql.parser.SQLParser.drop_sequence_return();
    java.lang.Object var1 = var0.getTree();
    java.lang.Object var2 = var0.getTemplate();
    java.lang.Object var3 = var0.getTree();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test131");


    java.lang.String[] var4 = new java.lang.String[] { ""};
    java.lang.String[] var8 = new java.lang.String[] { ""};
    java.lang.String var9 = org.databene.jdbacl.SQLUtil.join("", "", var4, "hi!", "10", var8);
    org.databene.jdbacl.identity.IdentityProvider var10 = new org.databene.jdbacl.identity.IdentityProvider();
    org.databene.jdbacl.identity.SubNkPkQueryIdentity var11 = new org.databene.jdbacl.identity.SubNkPkQueryIdentity("null", var4, var10);
    org.databene.jdbacl.identity.IdentityModel var14 = var10.getIdentity("SELECT * FROM null WHERE  = ''", false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.identity.IdentityModel var16 = var10.getIdentity("NOT REGEXP_MATCHES(sequence, '')");
      fail("Expected exception of type org.databene.commons.ObjectNotFoundException");
    } catch (org.databene.commons.ObjectNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi! as 10 on . = 10."+ "'", var9.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test132");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.skip();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var3 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var5 = var3.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var3);
    org.databene.jdbacl.sql.parser.SQLLexer var7 = new org.databene.jdbacl.sql.parser.SQLLexer();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var9 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var9.release((-1));
    boolean var13 = var7.mismatchIsUnwantedToken((org.antlr.runtime.IntStream)var9, 0);
    var0.setCharStream((org.antlr.runtime.CharStream)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mTokens();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test133");


    boolean var1 = org.databene.jdbacl.SQLUtil.isDDL("drop sequence jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test134");


    org.databene.jdbacl.model.DefaultDBTable var1 = new org.databene.jdbacl.model.DefaultDBTable();
    var1.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var4 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var5 = var4.getForeignKeyConstraints();
    var1.addReferrer((org.databene.jdbacl.model.DBTable)var4);
    java.lang.String[] var12 = new java.lang.String[] { ""};
    java.lang.String[] var16 = new java.lang.String[] { ""};
    java.lang.String var17 = org.databene.jdbacl.SQLUtil.join("", "", var12, "hi!", "10", var16);
    org.databene.jdbacl.model.DBUniqueConstraint var18 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var4, "select nextval('')", false, var12);
    java.lang.String[] var24 = new java.lang.String[] { ""};
    java.lang.String[] var28 = new java.lang.String[] { ""};
    java.lang.String var29 = org.databene.jdbacl.SQLUtil.join("", "", var24, "hi!", "10", var28);
    java.lang.String var30 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var24);
    java.lang.String[] var37 = new java.lang.String[] { ""};
    java.lang.String[] var41 = new java.lang.String[] { ""};
    java.lang.String var42 = org.databene.jdbacl.SQLUtil.join("", "", var37, "hi!", "10", var41);
    java.lang.String var43 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var41);
    java.lang.String var44 = org.databene.jdbacl.SQLUtil.leftJoin("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE ", var24, "jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1)", "drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)", var41);
    org.databene.jdbacl.identity.NaturalPkIdentity var46 = new org.databene.jdbacl.identity.NaturalPkIdentity("hi!");
    java.lang.String var47 = var46.getName();
    boolean var49 = var46.equals((java.lang.Object)(-1.0d));
    org.databene.jdbacl.model.DefaultDBTable var50 = new org.databene.jdbacl.model.DefaultDBTable();
    var50.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var53 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var54 = var53.getForeignKeyConstraints();
    var50.addReferrer((org.databene.jdbacl.model.DBTable)var53);
    java.lang.String[] var61 = new java.lang.String[] { ""};
    java.lang.String[] var65 = new java.lang.String[] { ""};
    java.lang.String var66 = org.databene.jdbacl.SQLUtil.join("", "", var61, "hi!", "10", var65);
    org.databene.jdbacl.model.DBUniqueConstraint var67 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var53, "select nextval('')", false, var61);
    java.lang.String var68 = var46.extractNK((java.lang.Object[])var61);
    java.lang.String var69 = org.databene.jdbacl.SQLUtil.renderQuery((org.databene.jdbacl.model.DBTable)var4, var24, (java.lang.Object[])var61);
    org.databene.jdbacl.identity.UniqueKeyIdentity var70 = new org.databene.jdbacl.identity.UniqueKeyIdentity("drop generator sequence", var61);
    java.lang.String var71 = var70.getTableName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi! as 10 on . = 10."+ "'", var17.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi! as 10 on . = 10."+ "'", var29.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "."+ "'", var30.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi! as 10 on . = 10."+ "'", var42.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "."+ "'", var43.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)."+ "'", var44.equals("left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "hi! as 10 on . = 10."+ "'", var66.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + ""+ "'", var68.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "SELECT * FROM null WHERE  = ''"+ "'", var69.equals("SELECT * FROM null WHERE  = ''"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "drop generator sequence"+ "'", var71.equals("drop generator sequence"));

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test135");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mPLUS();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test136");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.sql.Connection var2 = org.databene.jdbacl.DBUtil.connect("sequence", false);
      fail("Expected exception of type org.databene.commons.ConfigurationError");
    } catch (org.databene.commons.ConfigurationError e) {
      // Expected exception.
    }

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test137");


    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var1 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var1.setCharPositionInLine(1);
    int var4 = var1.getCharPositionInLine();
    var1.setCharPositionInLine(69);
    org.databene.jdbacl.dialect.H2Dialect var7 = new org.databene.jdbacl.dialect.H2Dialect();
    java.lang.String var9 = var7.renderFetchSequenceValue("10");
    boolean var10 = var7.isSequenceBoundarySupported();
    boolean var13 = var7.isDefaultCatalog("null", "jdbc:h2:mem:select next value for 10");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var14 = org.databene.jdbacl.sql.SQLParserUtil.parse((org.antlr.runtime.CharStream)var1, (org.databene.jdbacl.DatabaseDialect)var7);
      fail("Expected exception of type org.databene.commons.ParseException");
    } catch (org.databene.commons.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "select next value for 10"+ "'", var9.equals("select next value for 10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test138");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mT__127();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test139");


    org.databene.jdbacl.model.DBSequence var3 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var3.setName("10");
    java.math.BigInteger var6 = var3.getIncrement();
    java.lang.Boolean var7 = var3.isCycle();
    java.lang.String var8 = var3.dropDDL();
    java.math.BigInteger var9 = var3.getIncrementIfNotDefault();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "drop sequence 10"+ "'", var8.equals("drop sequence 10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test140");


    org.databene.jdbacl.identity.NaturalPkIdentity var1 = new org.databene.jdbacl.identity.NaturalPkIdentity("hi!");
    boolean var3 = var1.equals((java.lang.Object)(short)(-1));
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "NaturalPkIdentity(hi!)"+ "'", var4.equals("NaturalPkIdentity(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi! identity by primary key"+ "'", var5.equals("hi! identity by primary key"));

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test141");


    java.lang.Object[] var1 = org.databene.jdbacl.SQLUtil.parseColumnTypeAndSize("hi! identity by primary key");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test142");


    org.databene.jdbacl.model.jdbc.JDBCDBImporter var6 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var6.setExcludeTables("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.Database var9 = var6.importDatabase();
      fail("Expected exception of type org.databene.commons.ConnectFailedException");
    } catch (org.databene.commons.ConnectFailedException e) {
      // Expected exception.
    }

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test143");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.JDBCConnectData var1 = org.databene.jdbacl.JDBCConnectData.parseSingleDbProperties("drop sequence ");
      fail("Expected exception of type org.databene.commons.ConfigurationError");
    } catch (org.databene.commons.ConfigurationError e) {
      // Expected exception.
    }

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test144");


    org.databene.jdbacl.dialect.H2Dialect var0 = new org.databene.jdbacl.dialect.H2Dialect();
    java.lang.String var2 = var0.renderFetchSequenceValue("SET GENERATOR . TO -1");
    boolean var4 = var0.isDeterministicPKName("'hi!'");
    boolean var6 = var0.isDeterministicIndexName("NaturalPkIdentity(hi!)");
    java.lang.String var10 = var0.regexQuery("DROP SEQUENCE ", true, "VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).)");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "select next value for SET GENERATOR . TO -1"+ "'", var2.equals("select next value for SET GENERATOR . TO -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "DROP SEQUENCE  NOT REGEXP 'VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).)'"+ "'", var10.equals("DROP SEQUENCE  NOT REGEXP 'VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).)'"));

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test145");


    org.databene.jdbacl.model.DefaultDBTable var0 = new org.databene.jdbacl.model.DefaultDBTable();
    var0.setDoc(".");
    boolean var4 = var0.equals((java.lang.Object)(-1.0f));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.DBTable var6 = var0.getProvider(69);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test146");


    org.databene.jdbacl.model.TableContainer var4 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var5 = var4.getTables();
    org.databene.jdbacl.model.TableContainer var6 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var4);
    org.databene.jdbacl.model.DefaultDBTable var7 = new org.databene.jdbacl.model.DefaultDBTable();
    var7.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var10 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var11 = var10.getForeignKeyConstraints();
    var7.addReferrer((org.databene.jdbacl.model.DBTable)var10);
    var4.addTable((org.databene.jdbacl.model.DBTable)var10);
    java.lang.String[] var18 = new java.lang.String[] { ""};
    java.lang.String[] var22 = new java.lang.String[] { ""};
    java.lang.String var23 = org.databene.jdbacl.SQLUtil.join("", "", var18, "hi!", "10", var22);
    java.lang.String var24 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var18);
    org.databene.jdbacl.model.TableContainer var27 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var28 = var27.getTables();
    org.databene.jdbacl.model.TableContainer var29 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var27);
    org.databene.jdbacl.model.DefaultDBTable var30 = new org.databene.jdbacl.model.DefaultDBTable();
    var30.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var33 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var34 = var33.getForeignKeyConstraints();
    var30.addReferrer((org.databene.jdbacl.model.DBTable)var33);
    var27.addTable((org.databene.jdbacl.model.DBTable)var33);
    java.lang.String[] var39 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var40 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var39);
    org.databene.jdbacl.model.DBForeignKeyConstraint var41 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var10, var18, (org.databene.jdbacl.model.DBTable)var33, var39);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var44 = var41.columnReferencedBy("jdbc:hsqldb:mem:jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", true);
      fail("Expected exception of type org.databene.commons.ObjectNotFoundException");
    } catch (org.databene.commons.ObjectNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi! as 10 on . = 10."+ "'", var23.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "."+ "'", var24.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var40.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test147");


    boolean var1 = org.databene.jdbacl.SQLUtil.isQuery("select nextval('')");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test148");


    org.databene.jdbacl.model.DefaultDBTable var1 = new org.databene.jdbacl.model.DefaultDBTable();
    var1.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var4 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var5 = var4.getForeignKeyConstraints();
    var1.addReferrer((org.databene.jdbacl.model.DBTable)var4);
    org.databene.jdbacl.model.DBDataType var9 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var10 = var9.isAlpha();
    java.lang.String var11 = var9.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var12 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var15 = var12.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var17 = var12.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var18 = var9.equals((java.lang.Object)var17);
    org.databene.jdbacl.model.DefaultDBColumn var21 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var4, var9, (java.lang.Integer)0, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DefaultDBTable var22 = new org.databene.jdbacl.model.DefaultDBTable();
    var22.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var25 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var26 = var25.getForeignKeyConstraints();
    var22.addReferrer((org.databene.jdbacl.model.DBTable)var25);
    var4.addReferrer((org.databene.jdbacl.model.DBTable)var22);
    org.databene.jdbacl.model.TableContainer var33 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var34 = var33.getTables();
    org.databene.jdbacl.model.TableContainer var35 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var33);
    org.databene.jdbacl.model.DefaultDBTable var36 = new org.databene.jdbacl.model.DefaultDBTable();
    var36.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var39 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var40 = var39.getForeignKeyConstraints();
    var36.addReferrer((org.databene.jdbacl.model.DBTable)var39);
    var33.addTable((org.databene.jdbacl.model.DBTable)var39);
    java.lang.String[] var47 = new java.lang.String[] { ""};
    java.lang.String[] var51 = new java.lang.String[] { ""};
    java.lang.String var52 = org.databene.jdbacl.SQLUtil.join("", "", var47, "hi!", "10", var51);
    java.lang.String var53 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var47);
    org.databene.jdbacl.model.TableContainer var56 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var57 = var56.getTables();
    org.databene.jdbacl.model.TableContainer var58 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var56);
    org.databene.jdbacl.model.DefaultDBTable var59 = new org.databene.jdbacl.model.DefaultDBTable();
    var59.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var62 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var63 = var62.getForeignKeyConstraints();
    var59.addReferrer((org.databene.jdbacl.model.DBTable)var62);
    var56.addTable((org.databene.jdbacl.model.DBTable)var62);
    java.lang.String[] var68 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var69 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var68);
    org.databene.jdbacl.model.DBForeignKeyConstraint var70 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var39, var47, (org.databene.jdbacl.model.DBTable)var62, var68);
    org.databene.jdbacl.model.DBTable var71 = var70.getRefereeTable();
    var4.addForeignKey(var70);
    java.lang.String[] var73 = var70.getColumnNames();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var76 = var70.columnReferencedBy("CONSTRAINT \"select nextval('')\" UNIQUE ()", true);
      fail("Expected exception of type org.databene.commons.ObjectNotFoundException");
    } catch (org.databene.commons.ObjectNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "DROP SEQUENCE "+ "'", var11.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var17.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi! as 10 on . = 10."+ "'", var52.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "."+ "'", var53.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var69.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test149");


    org.databene.jdbacl.JDBCDriverInfo var0 = new org.databene.jdbacl.JDBCDriverInfo();
    java.lang.String var1 = var0.getUrlPattern();
    var0.setDefaultUser("-1");
    java.lang.String var4 = var0.getUrlPattern();
    var0.setDefaultSchema("NOT REGEXP_MATCHES(sequence, '')");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test150");


    org.databene.jdbacl.model.jdbc.JDBCDBImporter var8 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.", "select next value for SET GENERATOR . TO -1", "DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.", "jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", "10", "hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", "select next value for SET GENERATOR . TO -1", false);
    var8.setSchemaName("alter sequence hi! restart with 1");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.Database var11 = var8.importDatabase();
      fail("Expected exception of type org.databene.commons.ConnectFailedException");
    } catch (org.databene.commons.ConnectFailedException e) {
      // Expected exception.
    }

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test151");


    org.databene.jdbacl.model.TableContainer var4 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var5 = var4.getTables();
    org.databene.jdbacl.model.TableContainer var6 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var4);
    org.databene.jdbacl.model.DefaultDBTable var7 = new org.databene.jdbacl.model.DefaultDBTable();
    var7.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var10 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var11 = var10.getForeignKeyConstraints();
    var7.addReferrer((org.databene.jdbacl.model.DBTable)var10);
    var4.addTable((org.databene.jdbacl.model.DBTable)var10);
    java.lang.String[] var18 = new java.lang.String[] { ""};
    java.lang.String[] var22 = new java.lang.String[] { ""};
    java.lang.String var23 = org.databene.jdbacl.SQLUtil.join("", "", var18, "hi!", "10", var22);
    java.lang.String var24 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var18);
    org.databene.jdbacl.model.TableContainer var27 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var28 = var27.getTables();
    org.databene.jdbacl.model.TableContainer var29 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var27);
    org.databene.jdbacl.model.DefaultDBTable var30 = new org.databene.jdbacl.model.DefaultDBTable();
    var30.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var33 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var34 = var33.getForeignKeyConstraints();
    var30.addReferrer((org.databene.jdbacl.model.DBTable)var33);
    var27.addTable((org.databene.jdbacl.model.DBTable)var33);
    java.lang.String[] var39 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var40 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var39);
    org.databene.jdbacl.model.DBForeignKeyConstraint var41 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var10, var18, (org.databene.jdbacl.model.DBTable)var33, var39);
    java.lang.String[] var42 = var41.getRefereeColumnNames();
    java.lang.String var43 = var41.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var45 = var41.columnReferencedBy("org.firebirdsql.jdbc.FBDriver");
      fail("Expected exception of type org.databene.commons.ObjectNotFoundException");
    } catch (org.databene.commons.ObjectNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi! as 10 on . = 10."+ "'", var23.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "."+ "'", var24.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var40.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )"+ "'", var43.equals("CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )"));

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test152");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var2 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var2.release((-1));
    boolean var6 = var0.mismatchIsUnwantedToken((org.antlr.runtime.IntStream)var2, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.script.Expression var7 = org.databene.jdbacl.sql.SQLParserUtil.parseExpression((org.antlr.runtime.CharStream)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test153");


    org.databene.jdbacl.dialect.DerbyDialect var2 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var4 = var2.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var5 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var6 = var5.getName();
    java.lang.String var7 = var2.formatValue((java.lang.Object)var5);
    var5.setName("'hi!'");
    java.util.List var10 = var5.getSchemas();
    org.databene.jdbacl.model.DBSchema var11 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var5);
    org.databene.jdbacl.model.DBTrigger var12 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var11);
    var12.setDescription("CREATE GENERATOR drop sequence ");
    org.databene.jdbacl.model.DefaultDBTable var16 = new org.databene.jdbacl.model.DefaultDBTable();
    var16.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var19 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var20 = var19.getForeignKeyConstraints();
    var16.addReferrer((org.databene.jdbacl.model.DBTable)var19);
    org.databene.jdbacl.model.DBDataType var24 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var25 = var24.isAlpha();
    java.lang.String var26 = var24.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var27 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var30 = var27.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var32 = var27.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var33 = var24.equals((java.lang.Object)var32);
    org.databene.jdbacl.model.DefaultDBColumn var36 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var19, var24, (java.lang.Integer)0, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DefaultDBTable var37 = new org.databene.jdbacl.model.DefaultDBTable();
    var37.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var40 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var41 = var40.getForeignKeyConstraints();
    var37.addReferrer((org.databene.jdbacl.model.DBTable)var40);
    var19.addReferrer((org.databene.jdbacl.model.DBTable)var37);
    org.databene.jdbacl.model.DBIndex var45 = var37.getIndex("");
    java.util.List var46 = var37.getIndexes();
    java.util.Set var47 = var37.getForeignKeyConstraints();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var12.setOwner((org.databene.jdbacl.model.CompositeDBObject)var37);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "DROP SEQUENCE "+ "'", var26.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var32.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test154");


    org.databene.jdbacl.model.jdbc.JDBCDBImporter var6 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var6.setExcludeTables("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    var6.setImportingUKs(false);
    var6.close();
    java.lang.String var12 = var6.getDatabaseProductName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test155");


    org.databene.jdbacl.model.DBDataType var2 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var3 = var2.isTemporal();
    boolean var4 = var2.isTemporal();
    boolean var5 = var2.isLOB();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test156");


    org.databene.jdbacl.JDBCConnectData var6 = new org.databene.jdbacl.JDBCConnectData("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)", "hi!", "hi!", "drop generator sequence", "'hi!'", "hi!");
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var7 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter(var6);
    var7.setImportingSequences(true);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test157");


    org.databene.jdbacl.model.DBSequence var3 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var3.setName("10");
    java.math.BigInteger var6 = var3.getIncrement();
    java.lang.Boolean var7 = var3.isCycle();
    java.lang.String var8 = var3.dropDDL();
    org.databene.jdbacl.model.DBSequence var12 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var12.setCache((java.lang.Long)100L);
    java.lang.String var15 = var12.getObjectType();
    java.math.BigInteger var16 = var12.getIncrementIfNotDefault();
    org.databene.jdbacl.model.DBSequence var20 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var20.setName("10");
    java.math.BigInteger var23 = var20.getIncrement();
    java.math.BigInteger var24 = var20.getIncrement();
    var12.setLastNumber(var24);
    var3.setIncrement(var24);
    org.databene.jdbacl.dialect.DerbyDialect var29 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var31 = var29.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var32 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var33 = var32.getName();
    java.lang.String var34 = var29.formatValue((java.lang.Object)var32);
    var32.setName("'hi!'");
    java.util.List var37 = var32.getSchemas();
    org.databene.jdbacl.model.DBSchema var38 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var32);
    org.databene.jdbacl.model.DBTrigger var39 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var38);
    org.databene.jdbacl.dialect.DerbyDialect var40 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var42 = var40.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var43 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var44 = var43.getName();
    java.lang.String var45 = var40.formatValue((java.lang.Object)var43);
    java.util.List var46 = var43.getComponents();
    var38.setCatalog(var43);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setOwner((org.databene.jdbacl.model.CompositeDBObject)var43);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "drop sequence 10"+ "'", var8.equals("drop sequence 10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "sequence"+ "'", var15.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test158");


    boolean var1 = org.databene.jdbacl.SQLUtil.isQuery("NOT REGEXP_MATCHES(sequence, '')");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test159");


    org.databene.jdbacl.model.DefaultDBTable var2 = new org.databene.jdbacl.model.DefaultDBTable();
    var2.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var5 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var6 = var5.getForeignKeyConstraints();
    var2.addReferrer((org.databene.jdbacl.model.DBTable)var5);
    java.lang.String[] var13 = new java.lang.String[] { ""};
    java.lang.String[] var17 = new java.lang.String[] { ""};
    java.lang.String var18 = org.databene.jdbacl.SQLUtil.join("", "", var13, "hi!", "10", var17);
    org.databene.jdbacl.model.DBUniqueConstraint var19 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var5, "select nextval('')", false, var13);
    org.databene.jdbacl.model.DBDataType var22 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var23 = var22.isAlpha();
    org.databene.jdbacl.model.DefaultDBColumn var24 = new org.databene.jdbacl.model.DefaultDBColumn("'hi!'", (org.databene.jdbacl.model.DBTable)var5, var22);
    org.databene.jdbacl.model.DefaultDBTable var26 = new org.databene.jdbacl.model.DefaultDBTable();
    var26.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var29 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var30 = var29.getForeignKeyConstraints();
    var26.addReferrer((org.databene.jdbacl.model.DBTable)var29);
    org.databene.jdbacl.model.DBDataType var34 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var35 = var34.isAlpha();
    java.lang.String var36 = var34.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var37 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var40 = var37.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var42 = var37.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var43 = var34.equals((java.lang.Object)var42);
    org.databene.jdbacl.model.DefaultDBColumn var46 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var29, var34, (java.lang.Integer)0, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DBDataType var49 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var50 = var49.isTemporal();
    boolean var51 = var34.equals((java.lang.Object)var49);
    org.databene.jdbacl.model.DefaultDBColumn var54 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.", (org.databene.jdbacl.model.DBTable)var5, var34, (java.lang.Integer)1, (java.lang.Integer)(-1));
    java.lang.String var55 = var54.getObjectType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi! as 10 on . = 10."+ "'", var18.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "DROP SEQUENCE "+ "'", var36.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var42.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "column"+ "'", var55.equals("column"));

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test160");


    org.databene.jdbacl.model.TableContainer var4 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var5 = var4.getTables();
    org.databene.jdbacl.model.TableContainer var6 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var4);
    org.databene.jdbacl.model.DefaultDBTable var7 = new org.databene.jdbacl.model.DefaultDBTable();
    var7.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var10 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var11 = var10.getForeignKeyConstraints();
    var7.addReferrer((org.databene.jdbacl.model.DBTable)var10);
    var4.addTable((org.databene.jdbacl.model.DBTable)var10);
    java.lang.String[] var18 = new java.lang.String[] { ""};
    java.lang.String[] var22 = new java.lang.String[] { ""};
    java.lang.String var23 = org.databene.jdbacl.SQLUtil.join("", "", var18, "hi!", "10", var22);
    java.lang.String var24 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var18);
    org.databene.jdbacl.model.TableContainer var27 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var28 = var27.getTables();
    org.databene.jdbacl.model.TableContainer var29 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var27);
    org.databene.jdbacl.model.DefaultDBTable var30 = new org.databene.jdbacl.model.DefaultDBTable();
    var30.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var33 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var34 = var33.getForeignKeyConstraints();
    var30.addReferrer((org.databene.jdbacl.model.DBTable)var33);
    var27.addTable((org.databene.jdbacl.model.DBTable)var33);
    java.lang.String[] var39 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var40 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var39);
    org.databene.jdbacl.model.DBForeignKeyConstraint var41 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var10, var18, (org.databene.jdbacl.model.DBTable)var33, var39);
    java.lang.String[] var42 = var41.getForeignKeyColumnNames();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var45 = var41.columnReferencedBy("'hi!'", true);
      fail("Expected exception of type org.databene.commons.ObjectNotFoundException");
    } catch (org.databene.commons.ObjectNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi! as 10 on . = 10."+ "'", var23.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "."+ "'", var24.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var40.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test161");


    org.databene.jdbacl.model.DefaultDBTable var0 = new org.databene.jdbacl.model.DefaultDBTable();
    var0.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var3 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var4 = var3.getForeignKeyConstraints();
    var0.addReferrer((org.databene.jdbacl.model.DBTable)var3);
    java.lang.String[] var11 = new java.lang.String[] { ""};
    java.lang.String[] var15 = new java.lang.String[] { ""};
    java.lang.String var16 = org.databene.jdbacl.SQLUtil.join("", "", var11, "hi!", "10", var15);
    org.databene.jdbacl.model.DBUniqueConstraint var17 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var3, "select nextval('')", false, var11);
    java.lang.String[] var23 = new java.lang.String[] { ""};
    java.lang.String[] var27 = new java.lang.String[] { ""};
    java.lang.String var28 = org.databene.jdbacl.SQLUtil.join("", "", var23, "hi!", "10", var27);
    java.lang.String var29 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var23);
    java.lang.String[] var36 = new java.lang.String[] { ""};
    java.lang.String[] var40 = new java.lang.String[] { ""};
    java.lang.String var41 = org.databene.jdbacl.SQLUtil.join("", "", var36, "hi!", "10", var40);
    java.lang.String var42 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var40);
    java.lang.String var43 = org.databene.jdbacl.SQLUtil.leftJoin("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE ", var23, "jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1)", "drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)", var40);
    org.databene.jdbacl.identity.NaturalPkIdentity var45 = new org.databene.jdbacl.identity.NaturalPkIdentity("hi!");
    java.lang.String var46 = var45.getName();
    boolean var48 = var45.equals((java.lang.Object)(-1.0d));
    org.databene.jdbacl.model.DefaultDBTable var49 = new org.databene.jdbacl.model.DefaultDBTable();
    var49.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var52 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var53 = var52.getForeignKeyConstraints();
    var49.addReferrer((org.databene.jdbacl.model.DBTable)var52);
    java.lang.String[] var60 = new java.lang.String[] { ""};
    java.lang.String[] var64 = new java.lang.String[] { ""};
    java.lang.String var65 = org.databene.jdbacl.SQLUtil.join("", "", var60, "hi!", "10", var64);
    org.databene.jdbacl.model.DBUniqueConstraint var66 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var52, "select nextval('')", false, var60);
    java.lang.String var67 = var45.extractNK((java.lang.Object[])var60);
    java.lang.String var68 = org.databene.jdbacl.SQLUtil.renderQuery((org.databene.jdbacl.model.DBTable)var3, var23, (java.lang.Object[])var60);
    java.lang.String var69 = org.databene.jdbacl.SQLUtil.renderColumnNames(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi! as 10 on . = 10."+ "'", var16.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi! as 10 on . = 10."+ "'", var28.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "."+ "'", var29.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi! as 10 on . = 10."+ "'", var41.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "."+ "'", var42.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)."+ "'", var43.equals("left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!"+ "'", var46.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "hi! as 10 on . = 10."+ "'", var65.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + ""+ "'", var67.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "SELECT * FROM null WHERE  = ''"+ "'", var68.equals("SELECT * FROM null WHERE  = ''"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "()"+ "'", var69.equals("()"));

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test162");


    org.databene.jdbacl.dialect.SqlServerDialect var0 = new org.databene.jdbacl.dialect.SqlServerDialect();
    boolean var2 = var0.isDeterministicPKName("10");
    org.databene.jdbacl.model.TableContainer var10 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var11 = var10.getTables();
    org.databene.jdbacl.model.TableContainer var12 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var10);
    org.databene.jdbacl.model.DefaultDBTable var13 = new org.databene.jdbacl.model.DefaultDBTable();
    var13.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var16 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var17 = var16.getForeignKeyConstraints();
    var13.addReferrer((org.databene.jdbacl.model.DBTable)var16);
    var10.addTable((org.databene.jdbacl.model.DBTable)var16);
    java.lang.String[] var24 = new java.lang.String[] { ""};
    java.lang.String[] var28 = new java.lang.String[] { ""};
    java.lang.String var29 = org.databene.jdbacl.SQLUtil.join("", "", var24, "hi!", "10", var28);
    java.lang.String var30 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var24);
    org.databene.jdbacl.model.TableContainer var33 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var34 = var33.getTables();
    org.databene.jdbacl.model.TableContainer var35 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var33);
    org.databene.jdbacl.model.DefaultDBTable var36 = new org.databene.jdbacl.model.DefaultDBTable();
    var36.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var39 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var40 = var39.getForeignKeyConstraints();
    var36.addReferrer((org.databene.jdbacl.model.DBTable)var39);
    var33.addTable((org.databene.jdbacl.model.DBTable)var39);
    java.lang.String[] var45 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var46 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var45);
    org.databene.jdbacl.model.DBForeignKeyConstraint var47 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var16, var24, (org.databene.jdbacl.model.DBTable)var39, var45);
    java.lang.String var48 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)", var45);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var49 = var0.renderCase("alter sequence CREATE GENERATOR drop sequence  restart with -1", "-1", var45);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi! as 10 on . = 10."+ "'", var29.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "."+ "'", var30.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var46.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).DROP SEQUENCE "+ "'", var48.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).DROP SEQUENCE "));

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test163");


    org.databene.jdbacl.identity.NaturalPkIdentity var1 = new org.databene.jdbacl.identity.NaturalPkIdentity("call next value for 'hi!'");
    org.databene.jdbacl.model.DefaultDBTable var2 = new org.databene.jdbacl.model.DefaultDBTable();
    var2.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var5 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var6 = var5.getForeignKeyConstraints();
    var2.addReferrer((org.databene.jdbacl.model.DBTable)var5);
    java.lang.String[] var13 = new java.lang.String[] { ""};
    java.lang.String[] var17 = new java.lang.String[] { ""};
    java.lang.String var18 = org.databene.jdbacl.SQLUtil.join("", "", var13, "hi!", "10", var17);
    org.databene.jdbacl.model.DBUniqueConstraint var19 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var5, "select nextval('')", false, var13);
    var5.setDoc("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT");
    java.lang.String[] var24 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var25 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var24);
    org.databene.jdbacl.model.DBUniqueConstraint var26 = var5.getUniqueConstraint(var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var27 = var1.extractPK((java.lang.Object[])var24);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi! as 10 on . = 10."+ "'", var18.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var25.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test164");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.skip();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var3 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var5 = var3.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var3);
    org.databene.jdbacl.sql.parser.SQLLexer var7 = new org.databene.jdbacl.sql.parser.SQLLexer();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var9 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var9.release((-1));
    boolean var13 = var7.mismatchIsUnwantedToken((org.antlr.runtime.IntStream)var9, 0);
    var0.setCharStream((org.antlr.runtime.CharStream)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mT__131();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test165");


    org.databene.jdbacl.model.DefaultDBTable var0 = new org.databene.jdbacl.model.DefaultDBTable();
    var0.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var3 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var4 = var3.getForeignKeyConstraints();
    var0.addReferrer((org.databene.jdbacl.model.DBTable)var3);
    org.databene.jdbacl.model.DefaultDBTable var7 = new org.databene.jdbacl.model.DefaultDBTable();
    var7.setDoc(".");
    java.util.Set var11 = var7.getUniqueConstraints(false);
    org.databene.jdbacl.model.DBDataType var14 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var15 = var14.isAlpha();
    boolean var16 = var14.isLOB();
    org.databene.jdbacl.model.DefaultDBColumn var19 = new org.databene.jdbacl.model.DefaultDBColumn("NOT drop generator sequence ~ 'hi!'", (org.databene.jdbacl.model.DBTable)var7, var14, (java.lang.Integer)100, (java.lang.Integer)(-1));
    var3.addColumn((org.databene.jdbacl.model.DBColumn)var19);
    org.databene.jdbacl.model.DBRow var21 = new org.databene.jdbacl.model.DBRow((org.databene.jdbacl.model.DBTable)var3);
    org.databene.jdbacl.model.DefaultDBTable var23 = new org.databene.jdbacl.model.DefaultDBTable();
    var23.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var26 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var27 = var26.getForeignKeyConstraints();
    var23.addReferrer((org.databene.jdbacl.model.DBTable)var26);
    org.databene.jdbacl.model.DBDataType var31 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var32 = var31.isAlpha();
    java.lang.String var33 = var31.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var34 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var37 = var34.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var39 = var34.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var40 = var31.equals((java.lang.Object)var39);
    org.databene.jdbacl.model.DefaultDBColumn var43 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var26, var31, (java.lang.Integer)0, (java.lang.Integer)(-1));
    var43.setDefaultValue(".");
    var3.addColumn((org.databene.jdbacl.model.DBColumn)var43);
    org.databene.jdbacl.model.DefaultDBTable var47 = new org.databene.jdbacl.model.DefaultDBTable();
    var47.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var50 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var51 = var50.getForeignKeyConstraints();
    var47.addReferrer((org.databene.jdbacl.model.DBTable)var50);
    java.lang.String[] var58 = new java.lang.String[] { ""};
    java.lang.String[] var62 = new java.lang.String[] { ""};
    java.lang.String var63 = org.databene.jdbacl.SQLUtil.join("", "", var58, "hi!", "10", var62);
    org.databene.jdbacl.model.DBUniqueConstraint var64 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var50, "select nextval('')", false, var58);
    var50.setDoc("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT");
    java.lang.String[] var69 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var70 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var69);
    org.databene.jdbacl.model.DBUniqueConstraint var71 = var50.getUniqueConstraint(var69);
    org.databene.jdbacl.model.DefaultDBTable var73 = new org.databene.jdbacl.model.DefaultDBTable();
    var73.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var76 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var77 = var76.getForeignKeyConstraints();
    var73.addReferrer((org.databene.jdbacl.model.DBTable)var76);
    java.lang.String[] var84 = new java.lang.String[] { ""};
    java.lang.String[] var88 = new java.lang.String[] { ""};
    java.lang.String var89 = org.databene.jdbacl.SQLUtil.join("", "", var84, "hi!", "10", var88);
    org.databene.jdbacl.model.DBUniqueConstraint var90 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var76, "select nextval('')", false, var84);
    org.databene.jdbacl.model.DBDataType var93 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var94 = var93.isAlpha();
    org.databene.jdbacl.model.DefaultDBColumn var95 = new org.databene.jdbacl.model.DefaultDBColumn("'hi!'", (org.databene.jdbacl.model.DBTable)var76, var93);
    org.databene.jdbacl.model.DBColumn[] var96 = new org.databene.jdbacl.model.DBColumn[] { var95};
    java.lang.String var97 = org.databene.jdbacl.SQLUtil.renderColumnNames(var96);
    java.lang.String var98 = org.databene.jdbacl.SQLUtil.renderQuery((org.databene.jdbacl.model.DBTable)var3, var69, (java.lang.Object[])var96);
    java.lang.String var99 = org.databene.jdbacl.SQLUtil.renderColumnNames(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "DROP SEQUENCE "+ "'", var33.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var39.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "hi! as 10 on . = 10."+ "'", var63.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var70.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var89 + "' != '" + "hi! as 10 on . = 10."+ "'", var89.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var97 + "' != '" + "'hi!'"+ "'", var97.equals("'hi!'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var98 + "' != '" + "SELECT * FROM null WHERE DROP SEQUENCE  = 'hi!' : DROP SEQUENCE "+ "'", var98.equals("SELECT * FROM null WHERE DROP SEQUENCE  = 'hi!' : DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var99 + "' != '" + "'hi!'"+ "'", var99.equals("'hi!'"));

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test166");


    org.databene.jdbacl.dialect.HSQL2Dialect var0 = new org.databene.jdbacl.dialect.HSQL2Dialect();
    java.lang.String var3 = var0.renderSequenceValue("hi!", 1L);
    boolean var5 = var0.isDeterministicUKName("CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT");
    java.lang.String var8 = var0.renderSequenceValue("CONSTRAINT \"select nextval('')\" UNIQUE ()", (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "alter sequence hi! restart with 1"+ "'", var3.equals("alter sequence hi! restart with 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "alter sequence CONSTRAINT \"select nextval('')\" UNIQUE () restart with -1"+ "'", var8.equals("alter sequence CONSTRAINT \"select nextval('')\" UNIQUE () restart with -1"));

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test167");


    org.databene.jdbacl.model.DBSequence var3 = new org.databene.jdbacl.model.DBSequence("call next value for 'hi!'", "NOT REGEXP_MATCHES(sequence, '')", "'hi!'");
    java.lang.Boolean var4 = var3.isOrder();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test168");


    org.databene.jdbacl.model.DefaultDBTable var0 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var1 = var0.getForeignKeyConstraints();
    var0.setDoc("drop sequence ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.DBNotNullConstraint var7 = new org.databene.jdbacl.model.DBNotNullConstraint((org.databene.jdbacl.model.DBTable)var0, "NOT drop generator sequence ~ 'hi!'", false, "drop generator .");
      fail("Expected exception of type org.databene.commons.ObjectNotFoundException");
    } catch (org.databene.commons.ObjectNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test169");


    org.databene.jdbacl.identity.NaturalPkIdentity var1 = new org.databene.jdbacl.identity.NaturalPkIdentity("hi!");
    java.lang.String var2 = var1.getName();
    java.lang.String var3 = var1.toString();
    java.lang.String[] var9 = new java.lang.String[] { ""};
    java.lang.String[] var13 = new java.lang.String[] { ""};
    java.lang.String var14 = org.databene.jdbacl.SQLUtil.join("", "", var9, "hi!", "10", var13);
    java.lang.String var15 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var9);
    java.lang.String[] var22 = new java.lang.String[] { ""};
    java.lang.String[] var26 = new java.lang.String[] { ""};
    java.lang.String var27 = org.databene.jdbacl.SQLUtil.join("", "", var22, "hi!", "10", var26);
    java.lang.String var28 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var26);
    java.lang.String var29 = org.databene.jdbacl.SQLUtil.leftJoin("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE ", var9, "jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1)", "drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)", var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var30 = var1.extractPK((java.lang.Object[])var9);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "NaturalPkIdentity(hi!)"+ "'", var3.equals("NaturalPkIdentity(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi! as 10 on . = 10."+ "'", var14.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "."+ "'", var15.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi! as 10 on . = 10."+ "'", var27.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "."+ "'", var28.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)."+ "'", var29.equals("left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)."));

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test170");


    org.databene.jdbacl.identity.IdentityProvider var0 = new org.databene.jdbacl.identity.IdentityProvider();
    org.databene.jdbacl.identity.NaturalPkIdentity var2 = new org.databene.jdbacl.identity.NaturalPkIdentity("hi!");
    java.lang.String var3 = var2.getName();
    var0.registerIdentity((org.databene.jdbacl.identity.IdentityModel)var2, "SET GENERATOR . TO -1");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.identity.IdentityModel var7 = var0.getIdentity("CREATE SEQUENCE 10");
      fail("Expected exception of type org.databene.commons.ObjectNotFoundException");
    } catch (org.databene.commons.ObjectNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test171");


    org.databene.jdbacl.SQLScriptException var1 = new org.databene.jdbacl.SQLScriptException(3);
    java.lang.Throwable[] var2 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test172");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.identity.mem.MapperState var1 = org.databene.jdbacl.identity.mem.MapperState.valueOf("'hi!'");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test173");


    java.lang.String var2 = org.databene.jdbacl.SQLUtil.normalize("sequence", false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "sequence"+ "'", var2.equals("sequence"));

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test174");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.sql.Connection var2 = org.databene.jdbacl.DBUtil.connect("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", false);
      fail("Expected exception of type org.databene.commons.ConfigurationError");
    } catch (org.databene.commons.ConfigurationError e) {
      // Expected exception.
    }

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test175");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.skip();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var3 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var5 = var3.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mPRIMARY();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 69);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test176");


    org.databene.jdbacl.model.DefaultDBTable var0 = new org.databene.jdbacl.model.DefaultDBTable();
    var0.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var3 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var4 = var3.getForeignKeyConstraints();
    var0.addReferrer((org.databene.jdbacl.model.DBTable)var3);
    org.databene.jdbacl.model.DefaultDBTable var7 = new org.databene.jdbacl.model.DefaultDBTable();
    var7.setDoc(".");
    java.util.Set var11 = var7.getUniqueConstraints(false);
    org.databene.jdbacl.model.DBDataType var14 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var15 = var14.isAlpha();
    boolean var16 = var14.isLOB();
    org.databene.jdbacl.model.DefaultDBColumn var19 = new org.databene.jdbacl.model.DefaultDBColumn("NOT drop generator sequence ~ 'hi!'", (org.databene.jdbacl.model.DBTable)var7, var14, (java.lang.Integer)100, (java.lang.Integer)(-1));
    var3.addColumn((org.databene.jdbacl.model.DBColumn)var19);
    org.databene.jdbacl.model.DBRow var21 = new org.databene.jdbacl.model.DBRow((org.databene.jdbacl.model.DBTable)var3);
    org.databene.jdbacl.model.DefaultDBTable var23 = new org.databene.jdbacl.model.DefaultDBTable();
    var23.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var26 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var27 = var26.getForeignKeyConstraints();
    var23.addReferrer((org.databene.jdbacl.model.DBTable)var26);
    org.databene.jdbacl.model.DBDataType var31 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var32 = var31.isAlpha();
    java.lang.String var33 = var31.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var34 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var37 = var34.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var39 = var34.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var40 = var31.equals((java.lang.Object)var39);
    org.databene.jdbacl.model.DefaultDBColumn var43 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var26, var31, (java.lang.Integer)0, (java.lang.Integer)(-1));
    var43.setDefaultValue(".");
    var3.addColumn((org.databene.jdbacl.model.DBColumn)var43);
    org.databene.jdbacl.model.DefaultDBTable var47 = new org.databene.jdbacl.model.DefaultDBTable();
    var47.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var50 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var51 = var50.getForeignKeyConstraints();
    var47.addReferrer((org.databene.jdbacl.model.DBTable)var50);
    java.lang.String[] var58 = new java.lang.String[] { ""};
    java.lang.String[] var62 = new java.lang.String[] { ""};
    java.lang.String var63 = org.databene.jdbacl.SQLUtil.join("", "", var58, "hi!", "10", var62);
    org.databene.jdbacl.model.DBUniqueConstraint var64 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var50, "select nextval('')", false, var58);
    var50.setDoc("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT");
    java.lang.String[] var69 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var70 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var69);
    org.databene.jdbacl.model.DBUniqueConstraint var71 = var50.getUniqueConstraint(var69);
    org.databene.jdbacl.model.DefaultDBTable var73 = new org.databene.jdbacl.model.DefaultDBTable();
    var73.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var76 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var77 = var76.getForeignKeyConstraints();
    var73.addReferrer((org.databene.jdbacl.model.DBTable)var76);
    java.lang.String[] var84 = new java.lang.String[] { ""};
    java.lang.String[] var88 = new java.lang.String[] { ""};
    java.lang.String var89 = org.databene.jdbacl.SQLUtil.join("", "", var84, "hi!", "10", var88);
    org.databene.jdbacl.model.DBUniqueConstraint var90 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var76, "select nextval('')", false, var84);
    org.databene.jdbacl.model.DBDataType var93 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var94 = var93.isAlpha();
    org.databene.jdbacl.model.DefaultDBColumn var95 = new org.databene.jdbacl.model.DefaultDBColumn("'hi!'", (org.databene.jdbacl.model.DBTable)var76, var93);
    org.databene.jdbacl.model.DBColumn[] var96 = new org.databene.jdbacl.model.DBColumn[] { var95};
    java.lang.String var97 = org.databene.jdbacl.SQLUtil.renderColumnNames(var96);
    java.lang.String var98 = org.databene.jdbacl.SQLUtil.renderQuery((org.databene.jdbacl.model.DBTable)var3, var69, (java.lang.Object[])var96);
    org.databene.jdbacl.model.DBSchema var99 = var3.getSchema();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "DROP SEQUENCE "+ "'", var33.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var39.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "hi! as 10 on . = 10."+ "'", var63.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var70.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var89 + "' != '" + "hi! as 10 on . = 10."+ "'", var89.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var97 + "' != '" + "'hi!'"+ "'", var97.equals("'hi!'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var98 + "' != '" + "SELECT * FROM null WHERE DROP SEQUENCE  = 'hi!' : DROP SEQUENCE "+ "'", var98.equals("SELECT * FROM null WHERE DROP SEQUENCE  = 'hi!' : DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var99);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test177");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.Database var8 = org.databene.jdbacl.DBUtil.getMetaData("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", true, false, true, false, "jdbc:hsqldb:mem:jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", true, false);
      fail("Expected exception of type org.databene.commons.ConfigurationError");
    } catch (org.databene.commons.ConfigurationError e) {
      // Expected exception.
    }

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test178");


    java.lang.String var2 = org.databene.jdbacl.SQLUtil.normalize("CONSTRAINT \"select nextval('')\" UNIQUE ()", false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "CONSTRAINT \"select nextval('')\" UNIQUE ()"+ "'", var2.equals("CONSTRAINT \"select nextval('')\" UNIQUE ()"));

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test179");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mT__125();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test180");


    java.lang.Boolean var1 = org.databene.jdbacl.SQLUtil.mutatesStructure("NaturalPkIdentity(hi!)");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + false+ "'", var1.equals(false));

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test181");


    org.databene.jdbacl.dialect.Derby10_6Dialect var0 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var3 = var0.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var5 = var0.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var6 = var0.supportsRegex();
    boolean var9 = var0.isDefaultCatalog("-1", "org.databene.jdbacl.SQLScriptException: Error in execution of script line 1: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var5.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test182");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mDATE();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test183");


    org.databene.jdbacl.model.DBCatalog var1 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var2 = var1.getName();
    org.databene.jdbacl.model.Database var3 = var1.getDatabase();
    java.lang.String var4 = var1.getDoc();
    org.databene.jdbacl.dialect.DerbyDialect var6 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var8 = var6.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var9 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var10 = var9.getName();
    java.lang.String var11 = var6.formatValue((java.lang.Object)var9);
    var9.setName("'hi!'");
    java.util.List var14 = var9.getSchemas();
    org.databene.jdbacl.model.DBSchema var15 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var9);
    var1.removeSchema(var15);
    org.databene.jdbacl.dialect.DerbyDialect var19 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var21 = var19.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var22 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var23 = var22.getName();
    java.lang.String var24 = var19.formatValue((java.lang.Object)var22);
    var22.setName("'hi!'");
    java.util.List var27 = var22.getSchemas();
    org.databene.jdbacl.model.DBSchema var28 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var22);
    org.databene.jdbacl.model.DBTrigger var29 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var28);
    var29.setDescription("CREATE GENERATOR drop sequence ");
    java.lang.String var32 = var29.getTriggerBody();
    java.lang.String var33 = var29.getColumnName();
    java.lang.String var34 = var29.getWhenClause();
    var15.addTrigger(var29);
    org.databene.jdbacl.model.DBTrigger var36 = new org.databene.jdbacl.model.DBTrigger("-1", var15);
    var36.setBaseObjectType("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT");
    var36.setBaseObjectType("No identity defined for table DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT");
    var36.setWhenClause("drop generator sequence");
    java.lang.String var43 = var36.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "-1"+ "'", var43.equals("-1"));

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test184");


    org.databene.jdbacl.model.DBDataType var2 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var3 = var2.isTemporal();
    boolean var4 = var2.isTemporal();
    java.lang.String var5 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "DROP SEQUENCE "+ "'", var5.equals("DROP SEQUENCE "));

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test185");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var2 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var2.release((-1));
    boolean var6 = var0.mismatchIsUnwantedToken((org.antlr.runtime.IntStream)var2, 0);
    int var7 = var0.getRuleMemoizationCacheSize();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var9 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var9.release((-1));
    var0.consumeUntil((org.antlr.runtime.IntStream)var9, 14);
    org.databene.jdbacl.sql.parser.SQLLexer var14 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var14.mT__114();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test186");


    org.databene.jdbacl.model.DefaultDBTable var0 = new org.databene.jdbacl.model.DefaultDBTable();
    var0.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var3 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var4 = var3.getForeignKeyConstraints();
    var0.addReferrer((org.databene.jdbacl.model.DBTable)var3);
    org.databene.jdbacl.model.DefaultDBTable var7 = new org.databene.jdbacl.model.DefaultDBTable();
    var7.setDoc(".");
    java.util.Set var11 = var7.getUniqueConstraints(false);
    org.databene.jdbacl.model.DBDataType var14 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var15 = var14.isAlpha();
    boolean var16 = var14.isLOB();
    org.databene.jdbacl.model.DefaultDBColumn var19 = new org.databene.jdbacl.model.DefaultDBColumn("NOT drop generator sequence ~ 'hi!'", (org.databene.jdbacl.model.DBTable)var7, var14, (java.lang.Integer)100, (java.lang.Integer)(-1));
    var3.addColumn((org.databene.jdbacl.model.DBColumn)var19);
    org.databene.jdbacl.model.DBRow var21 = new org.databene.jdbacl.model.DBRow((org.databene.jdbacl.model.DBTable)var3);
    java.lang.Object[] var22 = var21.getPKValues();
    org.databene.jdbacl.model.DBSequence var27 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var27.setCache((java.lang.Long)100L);
    java.lang.String var30 = var27.getObjectType();
    java.math.BigInteger var31 = var27.getIncrementIfNotDefault();
    org.databene.jdbacl.model.DBSequence var35 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var35.setName("10");
    java.math.BigInteger var38 = var35.getIncrement();
    java.math.BigInteger var39 = var35.getIncrement();
    var27.setLastNumber(var39);
    var27.setOrder((java.lang.Boolean)false);
    var21.setCellValue("alter sequence  restart with -1", (java.lang.Object)var27);
    org.databene.jdbacl.model.TableContainer var48 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var49 = var48.getTables();
    org.databene.jdbacl.model.TableContainer var50 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var48);
    org.databene.jdbacl.model.DefaultDBTable var51 = new org.databene.jdbacl.model.DefaultDBTable();
    var51.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var54 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var55 = var54.getForeignKeyConstraints();
    var51.addReferrer((org.databene.jdbacl.model.DBTable)var54);
    var48.addTable((org.databene.jdbacl.model.DBTable)var54);
    java.lang.String[] var62 = new java.lang.String[] { ""};
    java.lang.String[] var66 = new java.lang.String[] { ""};
    java.lang.String var67 = org.databene.jdbacl.SQLUtil.join("", "", var62, "hi!", "10", var66);
    java.lang.String var68 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var62);
    org.databene.jdbacl.model.TableContainer var71 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var72 = var71.getTables();
    org.databene.jdbacl.model.TableContainer var73 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var71);
    org.databene.jdbacl.model.DefaultDBTable var74 = new org.databene.jdbacl.model.DefaultDBTable();
    var74.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var77 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var78 = var77.getForeignKeyConstraints();
    var74.addReferrer((org.databene.jdbacl.model.DBTable)var77);
    var71.addTable((org.databene.jdbacl.model.DBTable)var77);
    java.lang.String[] var83 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var84 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var83);
    org.databene.jdbacl.model.DBForeignKeyConstraint var85 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var54, var62, (org.databene.jdbacl.model.DBTable)var77, var83);
    boolean var86 = var85.isNameDeterministic();
    java.lang.Object[] var87 = var21.getFKComponents(var85);
    org.databene.jdbacl.model.TableContainer var89 = new org.databene.jdbacl.model.TableContainer("CREATE GENERATOR drop sequence ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var21.setPKValue((java.lang.Object)var89);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "sequence"+ "'", var30.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "hi! as 10 on . = 10."+ "'", var67.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "."+ "'", var68.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var84.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test187");


    org.databene.jdbacl.dialect.PostgreSQLDialect var0 = new org.databene.jdbacl.dialect.PostgreSQLDialect();
    boolean var3 = var0.isDefaultCatalog("", "");
    java.lang.String var5 = var0.renderDropSequence("");
    org.databene.jdbacl.model.DBCatalog var6 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var7 = var0.formatValue((java.lang.Object)var6);
    boolean var9 = var0.isDeterministicPKName("drop sequence ");
    boolean var11 = var0.isDeterministicFKName(".");
    boolean var12 = var0.supportsRegex();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "drop sequence "+ "'", var5.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test188");


    org.databene.jdbacl.dialect.HSQL2Dialect var0 = new org.databene.jdbacl.dialect.HSQL2Dialect();
    java.lang.String var3 = var0.renderSequenceValue("hi!", 1L);
    boolean var6 = var0.isDefaultCatalog("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)", "jdbc:h2:mem:hi! as 10 on . = 10.");
    java.lang.String var8 = var0.renderFetchSequenceValue("select nextval('alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP 'alter sequence hi! restart with 1'')");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "alter sequence hi! restart with 1"+ "'", var3.equals("alter sequence hi! restart with 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "call next value for select nextval('alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP 'alter sequence hi! restart with 1'')"+ "'", var8.equals("call next value for select nextval('alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP 'alter sequence hi! restart with 1'')"));

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test189");


    org.databene.jdbacl.model.DefaultDBTable var0 = new org.databene.jdbacl.model.DefaultDBTable();
    var0.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var3 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var4 = var3.getForeignKeyConstraints();
    var0.addReferrer((org.databene.jdbacl.model.DBTable)var3);
    org.databene.jdbacl.model.DefaultDBTable var7 = new org.databene.jdbacl.model.DefaultDBTable();
    var7.setDoc(".");
    java.util.Set var11 = var7.getUniqueConstraints(false);
    org.databene.jdbacl.model.DBDataType var14 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var15 = var14.isAlpha();
    boolean var16 = var14.isLOB();
    org.databene.jdbacl.model.DefaultDBColumn var19 = new org.databene.jdbacl.model.DefaultDBColumn("NOT drop generator sequence ~ 'hi!'", (org.databene.jdbacl.model.DBTable)var7, var14, (java.lang.Integer)100, (java.lang.Integer)(-1));
    var3.addColumn((org.databene.jdbacl.model.DBColumn)var19);
    org.databene.jdbacl.model.DBRow var21 = new org.databene.jdbacl.model.DBRow((org.databene.jdbacl.model.DBTable)var3);
    java.lang.Object[] var22 = var21.getPKValues();
    org.databene.jdbacl.dialect.PostgreSQLDialect var23 = new org.databene.jdbacl.dialect.PostgreSQLDialect();
    boolean var26 = var23.isDefaultCatalog("", "");
    java.lang.String var28 = var23.renderDropSequence("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var21.setPKValue((java.lang.Object)var23);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "drop sequence "+ "'", var28.equals("drop sequence "));

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test190");


    org.databene.jdbacl.dialect.DerbyDialect var2 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var4 = var2.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var5 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var6 = var5.getName();
    java.lang.String var7 = var2.formatValue((java.lang.Object)var5);
    var5.setName("'hi!'");
    java.util.List var10 = var5.getSchemas();
    org.databene.jdbacl.model.DBSchema var11 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var5);
    org.databene.jdbacl.model.DBTrigger var12 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var11);
    var12.setDescription("CREATE GENERATOR drop sequence ");
    java.lang.String var15 = var12.getTriggerBody();
    java.lang.String var16 = var12.getColumnName();
    java.lang.String var17 = var12.getWhenClause();
    var12.setColumnName("left join VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) as drop sequence alter sequence hi! restart with 1 on jdbc:h2:mem:select next value for 10.select next value for 10 = drop sequence alter sequence hi! restart with 1.DROP SEQUENCE ");
    org.databene.jdbacl.model.DBCatalog var21 = new org.databene.jdbacl.model.DBCatalog("drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var12.setOwner((org.databene.jdbacl.model.CompositeDBObject)var21);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test191");


    org.databene.jdbacl.model.TableContainer var2 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var3 = var2.getTables();
    org.databene.jdbacl.model.TableContainer var4 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var2);
    org.databene.jdbacl.model.DefaultDBTable var5 = new org.databene.jdbacl.model.DefaultDBTable();
    var5.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var8 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var9 = var8.getForeignKeyConstraints();
    var5.addReferrer((org.databene.jdbacl.model.DBTable)var8);
    java.lang.String[] var16 = new java.lang.String[] { ""};
    java.lang.String[] var20 = new java.lang.String[] { ""};
    java.lang.String var21 = org.databene.jdbacl.SQLUtil.join("", "", var16, "hi!", "10", var20);
    org.databene.jdbacl.model.DBUniqueConstraint var22 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var8, "select nextval('')", false, var16);
    var8.setDoc("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT");
    var2.addTable((org.databene.jdbacl.model.DBTable)var8);
    java.util.List var26 = var8.getIndexes();
    org.databene.jdbacl.model.DBRow var27 = new org.databene.jdbacl.model.DBRow((org.databene.jdbacl.model.DBTable)var8);
    org.databene.jdbacl.sql.ColumnExpression var30 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var33 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var34 = var33.getValue();
    org.databene.jdbacl.sql.ColumnExpression var37 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var38 = var37.getValue();
    org.databene.jdbacl.sql.BetweenExpression var39 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var30, (org.databene.script.Expression)var33, (org.databene.script.Expression)var37);
    java.lang.Object var40 = var30.getValue();
    org.databene.jdbacl.sql.ColumnExpression var43 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var44 = var43.getValue();
    org.databene.jdbacl.dialect.HSQL2Dialect var45 = new org.databene.jdbacl.dialect.HSQL2Dialect();
    java.lang.String var47 = var45.renderFetchSequenceValue("'hi!'");
    var43.setValue("'hi!'");
    boolean var49 = var43.isConstant();
    org.databene.jdbacl.sql.ColumnExpression var52 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    boolean var53 = var52.isConstant();
    java.lang.Object var54 = var52.getValue();
    org.databene.jdbacl.sql.BetweenExpression var55 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var30, (org.databene.script.Expression)var43, (org.databene.script.Expression)var52);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var27.setPKValue((java.lang.Object)var52);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi! as 10 on . = 10."+ "'", var21.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "sequence"+ "'", var34.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "sequence"+ "'", var38.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "sequence"+ "'", var40.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "sequence"+ "'", var44.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "call next value for 'hi!'"+ "'", var47.equals("call next value for 'hi!'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "sequence"+ "'", var54.equals("sequence"));

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test192");


    org.databene.jdbacl.model.DefaultDBTable var5 = new org.databene.jdbacl.model.DefaultDBTable();
    var5.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var8 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var9 = var8.getForeignKeyConstraints();
    var5.addReferrer((org.databene.jdbacl.model.DBTable)var8);
    org.databene.jdbacl.model.DBDataType var13 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var14 = var13.isAlpha();
    java.lang.String var15 = var13.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var16 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var19 = var16.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var21 = var16.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var22 = var13.equals((java.lang.Object)var21);
    org.databene.jdbacl.model.DefaultDBColumn var25 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var8, var13, (java.lang.Integer)0, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DBDataType var26 = var25.getType();
    org.databene.jdbacl.model.DefaultDBTable var27 = new org.databene.jdbacl.model.DefaultDBTable();
    var27.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var30 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var31 = var30.getForeignKeyConstraints();
    var27.addReferrer((org.databene.jdbacl.model.DBTable)var30);
    java.lang.String[] var38 = new java.lang.String[] { ""};
    java.lang.String[] var42 = new java.lang.String[] { ""};
    java.lang.String var43 = org.databene.jdbacl.SQLUtil.join("", "", var38, "hi!", "10", var42);
    org.databene.jdbacl.model.DBUniqueConstraint var44 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var30, "select nextval('')", false, var38);
    var44.addColumnName("sequence");
    var25.addUkConstraint(var44);
    org.databene.jdbacl.model.DBUniqueIndex var48 = new org.databene.jdbacl.model.DBUniqueIndex("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", false, var44);
    org.databene.jdbacl.model.DBTable var49 = var48.getTable();
    org.databene.jdbacl.model.DBTable var50 = var48.getTable();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.DBCheckConstraint var52 = new org.databene.jdbacl.model.DBCheckConstraint("drop generator sequence", false, var50, "select next value for 10");
      fail("Expected exception of type org.databene.commons.ParseException");
    } catch (org.databene.commons.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "DROP SEQUENCE "+ "'", var15.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var21.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi! as 10 on . = 10."+ "'", var43.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test193");


    org.databene.jdbacl.model.DBCatalog var0 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var1 = var0.getName();
    java.util.List var2 = var0.getComponents();
    org.databene.jdbacl.model.DBSchema var4 = var0.getSchema("alter sequence hi! restart with 1");
    org.databene.jdbacl.model.DBSchema var6 = var0.getSchema("jdbc:h2:mem:hi! as 10 on . = 10.");
    java.lang.String var7 = var0.getName();
    java.util.List var8 = var0.getSequences();
    java.util.List var9 = var0.getSequences();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var10 = org.databene.jdbacl.SQLUtil.renderColumnNames(var9);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test194");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.skip();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var3 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var5 = var3.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mT__114();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 69);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test195");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var3 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var3.setCharPositionInLine(1);
    java.lang.String var6 = var3.toString();
    var0.setCharStream((org.antlr.runtime.CharStream)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mT__68();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "DROP SEQUENCE "+ "'", var6.equals("DROP SEQUENCE "));

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test196");


    org.databene.jdbacl.dialect.PostgreSQLDialect var0 = new org.databene.jdbacl.dialect.PostgreSQLDialect();
    boolean var3 = var0.isDefaultCatalog("", "");
    java.lang.String var5 = var0.formatValue((java.lang.Object)10);
    org.databene.jdbacl.model.DBSequence var9 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var9.setName("10");
    java.math.BigInteger var12 = var9.getIncrement();
    java.lang.Boolean var13 = var9.isCycle();
    java.lang.String var14 = var9.dropDDL();
    java.lang.String var15 = var0.renderCreateSequence(var9);
    java.lang.String var19 = var0.regexQuery("CONSTRAINT \"hi! identity by primary key\" PRIMARY KEY ()", false, "jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "10"+ "'", var5.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "drop sequence 10"+ "'", var14.equals("drop sequence 10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "CREATE SEQUENCE 10"+ "'", var15.equals("CREATE SEQUENCE 10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "CONSTRAINT \"hi! identity by primary key\" PRIMARY KEY () ~ 'jdbc:h2:mem:hi! as 10 on . = 10.-identity-.'"+ "'", var19.equals("CONSTRAINT \"hi! identity by primary key\" PRIMARY KEY () ~ 'jdbc:h2:mem:hi! as 10 on . = 10.-identity-.'"));

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test197");


    org.databene.jdbacl.model.jdbc.JDBCDBImporter var6 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var6.setImportingPackages(false);
    var6.close();
    var6.setExcludeTables("DROP SEQUENCE NOT drop generator sequence ~ 'hi!' RESTRICT");
    var6.setLazy(true);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test198");


    org.databene.jdbacl.dialect.MySQLDialect var0 = new org.databene.jdbacl.dialect.MySQLDialect();
    boolean var2 = var0.isDeterministicUKName("call next value for 'hi!'");
    java.lang.String var6 = var0.regexQuery("alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0", false, "alter sequence hi! restart with 1");
    boolean var8 = var0.isDeterministicUKName("jdbc:h2:mem:VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).DROP SEQUENCE ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var10 = var0.renderDropSequence("call next value for DROP SEQUENCE  NOT REGEXP 'VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).)'");
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP 'alter sequence hi! restart with 1'"+ "'", var6.equals("alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP 'alter sequence hi! restart with 1'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test199");


    org.databene.jdbacl.model.DBSequence var3 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var3.setName("10");
    java.math.BigInteger var6 = var3.getIncrement();
    java.math.BigInteger var7 = var3.getIncrement();
    java.math.BigInteger var8 = var3.getStart();
    java.math.BigInteger var9 = var3.getStartIfNotDefault();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test200");


    java.lang.Boolean var1 = org.databene.jdbacl.SQLUtil.mutatesDataOrStructure("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test201");


    org.databene.jdbacl.dialect.DerbyDialect var0 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var2 = var0.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var3 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var4 = var3.getName();
    java.lang.String var5 = var0.formatValue((java.lang.Object)var3);
    var3.setName("'hi!'");
    java.util.List var8 = var3.getSchemas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var9 = org.databene.jdbacl.SQLUtil.renderColumnNames(var8);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test202");


    org.databene.jdbacl.sql.parser.SQLParser.value_list_return var0 = new org.databene.jdbacl.sql.parser.SQLParser.value_list_return();
    java.lang.Object var1 = var0.getTree();
    java.lang.Object var2 = var0.getTree();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test203");


    org.databene.jdbacl.dialect.DerbyDialect var2 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var4 = var2.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var5 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var6 = var5.getName();
    java.lang.String var7 = var2.formatValue((java.lang.Object)var5);
    var5.setName("'hi!'");
    java.util.List var10 = var5.getSchemas();
    org.databene.jdbacl.model.DBSchema var11 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var5);
    org.databene.jdbacl.model.DBTrigger var12 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var11);
    var12.setDescription("CREATE GENERATOR drop sequence ");
    java.lang.String var15 = var12.getTriggerBody();
    java.lang.String var16 = var12.getColumnName();
    var12.setStatus("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.");
    org.databene.jdbacl.model.DefaultDBTable var20 = new org.databene.jdbacl.model.DefaultDBTable();
    var20.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var23 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var24 = var23.getForeignKeyConstraints();
    var20.addReferrer((org.databene.jdbacl.model.DBTable)var23);
    org.databene.jdbacl.model.DBDataType var28 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var29 = var28.isAlpha();
    java.lang.String var30 = var28.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var31 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var34 = var31.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var36 = var31.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var37 = var28.equals((java.lang.Object)var36);
    org.databene.jdbacl.model.DefaultDBColumn var40 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var23, var28, (java.lang.Integer)0, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DefaultDBTable var41 = new org.databene.jdbacl.model.DefaultDBTable();
    var41.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var44 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var45 = var44.getForeignKeyConstraints();
    var41.addReferrer((org.databene.jdbacl.model.DBTable)var44);
    var23.addReferrer((org.databene.jdbacl.model.DBTable)var41);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var12.setOwner((org.databene.jdbacl.model.CompositeDBObject)var41);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "DROP SEQUENCE "+ "'", var30.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var36.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test204");


    int var0 = org.databene.jdbacl.DBUtil.getOpenConnectionCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 6);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test205");


    org.databene.jdbacl.model.DefaultDBTable var1 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var2 = var1.getForeignKeyConstraints();
    java.util.List var3 = var1.getColumns();
    org.databene.jdbacl.model.DefaultDBColumn var6 = new org.databene.jdbacl.model.DefaultDBColumn("call next value for 'hi!'", (org.databene.jdbacl.model.DBTable)var1, 100, "select next value for SET GENERATOR.TO - 1 NOT REGEXP 'hi!'");
    org.databene.jdbacl.JDBCDriverInfo var9 = new org.databene.jdbacl.JDBCDriverInfo();
    var9.setDriverClass("hi!");
    var9.setDefaultPort("CREATE SEQUENCE 10");
    var9.setDbSystem("SET GENERATOR . TO -1");
    java.lang.String var16 = var9.toString();
    org.databene.jdbacl.model.DefaultDBTable var18 = new org.databene.jdbacl.model.DefaultDBTable();
    var18.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var21 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var22 = var21.getForeignKeyConstraints();
    var18.addReferrer((org.databene.jdbacl.model.DBTable)var21);
    java.lang.String[] var29 = new java.lang.String[] { ""};
    java.lang.String[] var33 = new java.lang.String[] { ""};
    java.lang.String var34 = org.databene.jdbacl.SQLUtil.join("", "", var29, "hi!", "10", var33);
    org.databene.jdbacl.model.DBUniqueConstraint var35 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var21, "select nextval('')", false, var29);
    var21.setDoc("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT");
    java.lang.String[] var40 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var41 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var40);
    org.databene.jdbacl.model.DBUniqueConstraint var42 = var21.getUniqueConstraint(var40);
    org.databene.jdbacl.identity.UniqueKeyIdentity var43 = new org.databene.jdbacl.identity.UniqueKeyIdentity("select next value for SET GENERATOR.TO - 1", var40);
    var9.setJars(var40);
    org.databene.jdbacl.identity.UniqueKeyIdentity var45 = new org.databene.jdbacl.identity.UniqueKeyIdentity("NOT REGEXP_MATCHES(sequence, '')", var40);
    org.databene.jdbacl.identity.NaturalPkIdentity var49 = new org.databene.jdbacl.identity.NaturalPkIdentity("call next value for 'hi!'");
    java.lang.String[] var55 = new java.lang.String[] { ""};
    java.lang.String[] var59 = new java.lang.String[] { ""};
    java.lang.String var60 = org.databene.jdbacl.SQLUtil.join("", "", var55, "hi!", "10", var59);
    java.lang.String var61 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var55);
    java.lang.String[] var68 = new java.lang.String[] { ""};
    java.lang.String[] var72 = new java.lang.String[] { ""};
    java.lang.String var73 = org.databene.jdbacl.SQLUtil.join("", "", var68, "hi!", "10", var72);
    java.lang.String var74 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var72);
    java.lang.String var75 = org.databene.jdbacl.SQLUtil.leftJoin("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE ", var55, "jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1)", "drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)", var72);
    java.lang.String var76 = var49.extractNK((java.lang.Object[])var55);
    java.lang.String var77 = org.databene.jdbacl.SQLUtil.leftJoin("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", var40, "jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1)", "CREATE GENERATOR ", var55);
    org.databene.jdbacl.model.DBUniqueConstraint var78 = var1.getUniqueConstraint(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "SET GENERATOR . TO -1"+ "'", var16.equals("SET GENERATOR . TO -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi! as 10 on . = 10."+ "'", var34.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var41.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "hi! as 10 on . = 10."+ "'", var60.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "."+ "'", var61.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "hi! as 10 on . = 10."+ "'", var73.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "."+ "'", var74.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)."+ "'", var75.equals("left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + ""+ "'", var76.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as CREATE GENERATOR  on jdbc:h2:mem:hi! as 10 on . = 10.-identity-..DROP SEQUENCE  = CREATE GENERATOR ."+ "'", var77.equals("left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as CREATE GENERATOR  on jdbc:h2:mem:hi! as 10 on . = 10.-identity-..DROP SEQUENCE  = CREATE GENERATOR ."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test206");


    org.databene.jdbacl.model.jdbc.JDBCDBImporter var6 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("drop sequence ", "SELECT * FROM null WHERE DROP SEQUENCE  = 'hi!' : DROP SEQUENCE ", "alter sequence drop sequence 10 restart with 0", "DROP SEQUENCE NOT drop generator sequence ~ 'hi!' RESTRICT", ".", "alter sequence hi! restart with 1");
    boolean var7 = var6.isImportingIndexes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test207");


    org.databene.jdbacl.dialect.PostgreSQLDialect var0 = new org.databene.jdbacl.dialect.PostgreSQLDialect();
    boolean var3 = var0.isDefaultCatalog("", "");
    java.lang.String var5 = var0.renderDropSequence("");
    boolean var7 = var0.isDeterministicFKName("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    java.lang.String var9 = var0.renderFetchSequenceValue("");
    org.databene.jdbacl.model.DBSequence var13 = new org.databene.jdbacl.model.DBSequence("left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).", "hi! identity by primary key", "jdbc:h2:mem:select next value for 10");
    java.lang.String var14 = var0.renderCreateSequence(var13);
    org.databene.jdbacl.model.DBCatalog var17 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var18 = var17.getName();
    org.databene.jdbacl.model.Database var19 = var17.getDatabase();
    java.lang.String var20 = var17.getDoc();
    org.databene.jdbacl.dialect.DerbyDialect var22 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var24 = var22.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var25 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var26 = var25.getName();
    java.lang.String var27 = var22.formatValue((java.lang.Object)var25);
    var25.setName("'hi!'");
    java.util.List var30 = var25.getSchemas();
    org.databene.jdbacl.model.DBSchema var31 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var25);
    var17.removeSchema(var31);
    org.databene.jdbacl.dialect.DerbyDialect var35 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var37 = var35.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var38 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var39 = var38.getName();
    java.lang.String var40 = var35.formatValue((java.lang.Object)var38);
    var38.setName("'hi!'");
    java.util.List var43 = var38.getSchemas();
    org.databene.jdbacl.model.DBSchema var44 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var38);
    org.databene.jdbacl.model.DBTrigger var45 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var44);
    var45.setDescription("CREATE GENERATOR drop sequence ");
    java.lang.String var48 = var45.getTriggerBody();
    java.lang.String var49 = var45.getColumnName();
    java.lang.String var50 = var45.getWhenClause();
    var31.addTrigger(var45);
    org.databene.jdbacl.model.DBTrigger var52 = new org.databene.jdbacl.model.DBTrigger("-1", var31);
    org.databene.jdbacl.model.DBSequence var53 = new org.databene.jdbacl.model.DBSequence("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.", var31);
    java.lang.String var54 = var0.renderCreateSequence(var53);
    java.math.BigInteger var55 = var53.getIncrementIfNotDefault();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "drop sequence "+ "'", var5.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "select nextval('')"+ "'", var9.equals("select nextval('')"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)."+ "'", var14.equals("CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "CREATE SEQUENCE DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1."+ "'", var54.equals("CREATE SEQUENCE DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test208");


    org.databene.jdbacl.JDBCDriverInfo var0 = new org.databene.jdbacl.JDBCDriverInfo();
    var0.setDriverClass("hi!");
    java.lang.String var3 = var0.getUrlPattern();
    var0.setDefaultUser("SELECT NEXT VALUE FOR SET GENERATOR.TO - 1 NOT REGEXP 'HI!'");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test209");


    org.databene.jdbacl.DBUtil.checkReadOnly("NOT REGEXP_MATCHES(sequence, '')", false);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test210");


    org.databene.jdbacl.model.DBCatalog var0 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var1 = var0.getName();
    org.databene.jdbacl.model.Database var2 = var0.getDatabase();
    org.databene.jdbacl.model.DBSequence var6 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    java.lang.String var7 = var6.dropDDL();
    java.math.BigInteger var8 = var6.getMinValueIfNotDefault();
    boolean var9 = var0.isIdentical((org.databene.jdbacl.model.DBObject)var6);
    org.databene.jdbacl.model.DBTreeModel var10 = new org.databene.jdbacl.model.DBTreeModel((org.databene.jdbacl.model.CompositeDBObject)var0);
    org.databene.jdbacl.model.DefaultDBTable var12 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var13 = var12.getForeignKeyConstraints();
    java.util.List var14 = var12.getColumns();
    org.databene.jdbacl.model.DefaultDBColumn var17 = new org.databene.jdbacl.model.DefaultDBColumn("call next value for 'hi!'", (org.databene.jdbacl.model.DBTable)var12, 100, "select next value for SET GENERATOR.TO - 1 NOT REGEXP 'hi!'");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var18 = var10.getChildCount((org.databene.jdbacl.model.DBObject)var17);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "drop sequence "+ "'", var7.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test211");


    org.databene.jdbacl.model.DefaultDBTable var1 = new org.databene.jdbacl.model.DefaultDBTable();
    var1.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var4 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var5 = var4.getForeignKeyConstraints();
    var1.addReferrer((org.databene.jdbacl.model.DBTable)var4);
    java.lang.String[] var12 = new java.lang.String[] { ""};
    java.lang.String[] var16 = new java.lang.String[] { ""};
    java.lang.String var17 = org.databene.jdbacl.SQLUtil.join("", "", var12, "hi!", "10", var16);
    org.databene.jdbacl.model.DBUniqueConstraint var18 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var4, "select nextval('')", false, var12);
    org.databene.jdbacl.model.DBDataType var21 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var22 = var21.isAlpha();
    org.databene.jdbacl.model.DefaultDBColumn var23 = new org.databene.jdbacl.model.DefaultDBColumn("'hi!'", (org.databene.jdbacl.model.DBTable)var4, var21);
    org.databene.jdbacl.sql.ColumnExpression var26 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    boolean var27 = var26.isConstant();
    java.lang.Object var28 = var26.getValue();
    boolean var29 = var23.equals((java.lang.Object)var26);
    var23.setDefaultValue("jdbc:h2:mem:select next value for 10");
    java.lang.Integer var32 = var23.getFractionDigits();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi! as 10 on . = 10."+ "'", var17.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "sequence"+ "'", var28.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test212");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.FKChangeRule var1 = org.databene.jdbacl.model.FKChangeRule.valueOf("CONSTRAINT \"hi! identity by primary key\" PRIMARY KEY () ~ 'jdbc:h2:mem:hi! as 10 on . = 10.-identity-.'");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test213");


    java.lang.String var1 = org.databene.jdbacl.DBUtil.escape("select next value for SET GENERATOR.TO - 1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "select next value for SET GENERATOR.TO - 1"+ "'", var1.equals("select next value for SET GENERATOR.TO - 1"));

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test214");


    boolean var1 = org.databene.jdbacl.SQLUtil.isProcedureCall("select nextval('alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP 'alter sequence hi! restart with 1'')");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test215");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.jdbc.JDBCDBImporter var1 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("drop generator sequence");
      fail("Expected exception of type org.databene.commons.ConfigurationError");
    } catch (org.databene.commons.ConfigurationError e) {
      // Expected exception.
    }

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test216");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.jdbc.JDBCDBImporter var1 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("CREATE GENERATOR jdbc:h2:mem:hi! as 10 on . = 10.");
      fail("Expected exception of type org.databene.commons.ConfigurationError");
    } catch (org.databene.commons.ConfigurationError e) {
      // Expected exception.
    }

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test217");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mT__135();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test218");


    org.databene.jdbacl.model.DefaultDBTable var0 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var1 = var0.getForeignKeyConstraints();
    java.util.List var2 = var0.getColumns();
    java.util.List var3 = var0.getColumns();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test219");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var2 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var2.release((-1));
    boolean var6 = var0.mismatchIsUnwantedToken((org.antlr.runtime.IntStream)var2, 0);
    int var7 = var0.getRuleMemoizationCacheSize();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var9 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var9.release((-1));
    var0.consumeUntil((org.antlr.runtime.IntStream)var9, 14);
    org.databene.jdbacl.sql.parser.SQLLexer var14 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var9);
    java.lang.String var17 = var9.substring(6, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "EQUEN"+ "'", var17.equals("EQUEN"));

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test220");


    org.databene.jdbacl.JDBCDriverInfo var0 = new org.databene.jdbacl.JDBCDriverInfo();
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var7 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var7.setExcludeTables("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    boolean var10 = var0.equals((java.lang.Object)var7);
    var0.setDownloadUrl("jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1)");
    var0.setId("CREATE GENERATOR drop sequence ");
    java.lang.String var15 = var0.getDownloadUrl();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1)"+ "'", var15.equals("jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1)"));

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test221");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.sql.Connection var5 = org.databene.jdbacl.DBUtil.connect("jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1)", "DROP SEQUENCE NOT drop generator sequence ~ 'hi!' RESTRICT", "left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as CREATE GENERATOR  on jdbc:h2:mem:hi! as 10 on . = 10.-identity-..DROP SEQUENCE  = CREATE GENERATOR .", "alter sequence NOT drop generator sequence ~ 'hi!' restart with 10", true);
      fail("Expected exception of type org.databene.commons.ConnectFailedException");
    } catch (org.databene.commons.ConnectFailedException e) {
      // Expected exception.
    }

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test222");


    org.databene.jdbacl.JDBCDriverInfo var0 = new org.databene.jdbacl.JDBCDriverInfo();
    var0.setDriverClass("hi!");
    java.lang.String var3 = var0.getUrlPattern();
    java.lang.String var4 = var0.getDefaultSchema();
    java.lang.String[] var5 = var0.getJars();
    java.lang.String[] var6 = var0.getJars();
    java.lang.String[] var7 = var0.getJars();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test223");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.mT__82();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test224");


    org.databene.jdbacl.dialect.DerbyDialect var0 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var2 = var0.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var3 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var4 = var3.getName();
    java.lang.String var5 = var0.formatValue((java.lang.Object)var3);
    var3.setName("'hi!'");
    java.util.List var8 = var3.getSchemas();
    java.lang.String var9 = var3.getName();
    java.util.List var10 = var3.getTables();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "'hi!'"+ "'", var9.equals("'hi!'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test225");


    org.databene.jdbacl.model.DefaultDBTable var2 = new org.databene.jdbacl.model.DefaultDBTable();
    var2.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var5 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var6 = var5.getForeignKeyConstraints();
    var2.addReferrer((org.databene.jdbacl.model.DBTable)var5);
    org.databene.jdbacl.model.DBDataType var10 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var11 = var10.isAlpha();
    java.lang.String var12 = var10.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var13 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var16 = var13.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var18 = var13.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var19 = var10.equals((java.lang.Object)var18);
    org.databene.jdbacl.model.DefaultDBColumn var22 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var5, var10, (java.lang.Integer)0, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DefaultDBColumn var25 = new org.databene.jdbacl.model.DefaultDBColumn("NOT REGEXP_MATCHES(sequence, '')", (org.databene.jdbacl.model.DBTable)var5, (-1), "hi! identity by primary key");
    boolean var26 = var25.isNullable();
    var25.setNullable(true);
    boolean var29 = var25.isVersionColumn();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "DROP SEQUENCE "+ "'", var12.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var18.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test226");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.JDBCConnectData var1 = org.databene.jdbacl.JDBCConnectData.parseSingleDbProperties("jdbc:h2:mem:VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).DROP SEQUENCE ");
      fail("Expected exception of type org.databene.commons.ConfigurationError");
    } catch (org.databene.commons.ConfigurationError e) {
      // Expected exception.
    }

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test227");


    org.databene.jdbacl.model.TableContainer var2 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var3 = var2.getTables();
    org.databene.jdbacl.model.TableContainer var4 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var2);
    org.databene.jdbacl.dialect.DerbyDialect var6 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var8 = var6.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var9 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var10 = var9.getName();
    java.lang.String var11 = var6.formatValue((java.lang.Object)var9);
    var9.setName("'hi!'");
    java.util.List var14 = var9.getSchemas();
    java.util.List var15 = var4.getTables(false, var14);
    org.databene.jdbacl.model.DBCatalog var18 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var19 = var18.getName();
    org.databene.jdbacl.model.Database var20 = var18.getDatabase();
    java.lang.String var21 = var18.getDoc();
    org.databene.jdbacl.dialect.DerbyDialect var23 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var25 = var23.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var26 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var27 = var26.getName();
    java.lang.String var28 = var23.formatValue((java.lang.Object)var26);
    var26.setName("'hi!'");
    java.util.List var31 = var26.getSchemas();
    org.databene.jdbacl.model.DBSchema var32 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var26);
    var18.removeSchema(var32);
    org.databene.jdbacl.dialect.DerbyDialect var36 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var38 = var36.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var39 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var40 = var39.getName();
    java.lang.String var41 = var36.formatValue((java.lang.Object)var39);
    var39.setName("'hi!'");
    java.util.List var44 = var39.getSchemas();
    org.databene.jdbacl.model.DBSchema var45 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var39);
    org.databene.jdbacl.model.DBTrigger var46 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var45);
    var46.setDescription("CREATE GENERATOR drop sequence ");
    java.lang.String var49 = var46.getTriggerBody();
    java.lang.String var50 = var46.getColumnName();
    java.lang.String var51 = var46.getWhenClause();
    var32.addTrigger(var46);
    org.databene.jdbacl.model.DBTrigger var53 = new org.databene.jdbacl.model.DBTrigger("-1", var32);
    java.util.List var55 = var32.getSequences(true);
    java.util.List var56 = var4.getSequences(true, var55);
    org.databene.jdbacl.model.TableContainer var60 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var61 = var60.getTables();
    org.databene.jdbacl.model.TableContainer var62 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var60);
    org.databene.jdbacl.dialect.DerbyDialect var64 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var66 = var64.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var67 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var68 = var67.getName();
    java.lang.String var69 = var64.formatValue((java.lang.Object)var67);
    var67.setName("'hi!'");
    java.util.List var72 = var67.getSchemas();
    java.util.List var73 = var62.getTables(false, var72);
    java.util.List var74 = var4.getTables(true, var72);
    java.util.List var76 = var4.getTables(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test228");


    org.databene.jdbacl.model.DefaultDBTable var1 = new org.databene.jdbacl.model.DefaultDBTable();
    var1.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var4 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var5 = var4.getForeignKeyConstraints();
    var1.addReferrer((org.databene.jdbacl.model.DBTable)var4);
    java.lang.String[] var12 = new java.lang.String[] { ""};
    java.lang.String[] var16 = new java.lang.String[] { ""};
    java.lang.String var17 = org.databene.jdbacl.SQLUtil.join("", "", var12, "hi!", "10", var16);
    org.databene.jdbacl.model.DBUniqueConstraint var18 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var4, "select nextval('')", false, var12);
    java.lang.String[] var24 = new java.lang.String[] { ""};
    java.lang.String[] var28 = new java.lang.String[] { ""};
    java.lang.String var29 = org.databene.jdbacl.SQLUtil.join("", "", var24, "hi!", "10", var28);
    java.lang.String var30 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var24);
    java.lang.String[] var37 = new java.lang.String[] { ""};
    java.lang.String[] var41 = new java.lang.String[] { ""};
    java.lang.String var42 = org.databene.jdbacl.SQLUtil.join("", "", var37, "hi!", "10", var41);
    java.lang.String var43 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var41);
    java.lang.String var44 = org.databene.jdbacl.SQLUtil.leftJoin("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE ", var24, "jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1)", "drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)", var41);
    org.databene.jdbacl.identity.NaturalPkIdentity var46 = new org.databene.jdbacl.identity.NaturalPkIdentity("hi!");
    java.lang.String var47 = var46.getName();
    boolean var49 = var46.equals((java.lang.Object)(-1.0d));
    org.databene.jdbacl.model.DefaultDBTable var50 = new org.databene.jdbacl.model.DefaultDBTable();
    var50.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var53 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var54 = var53.getForeignKeyConstraints();
    var50.addReferrer((org.databene.jdbacl.model.DBTable)var53);
    java.lang.String[] var61 = new java.lang.String[] { ""};
    java.lang.String[] var65 = new java.lang.String[] { ""};
    java.lang.String var66 = org.databene.jdbacl.SQLUtil.join("", "", var61, "hi!", "10", var65);
    org.databene.jdbacl.model.DBUniqueConstraint var67 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var53, "select nextval('')", false, var61);
    java.lang.String var68 = var46.extractNK((java.lang.Object[])var61);
    java.lang.String var69 = org.databene.jdbacl.SQLUtil.renderQuery((org.databene.jdbacl.model.DBTable)var4, var24, (java.lang.Object[])var61);
    java.lang.String[] var75 = new java.lang.String[] { ""};
    java.lang.String[] var79 = new java.lang.String[] { ""};
    java.lang.String var80 = org.databene.jdbacl.SQLUtil.join("", "", var75, "hi!", "10", var79);
    org.databene.jdbacl.model.DBPrimaryKeyConstraint var81 = new org.databene.jdbacl.model.DBPrimaryKeyConstraint((org.databene.jdbacl.model.DBTable)var4, "jdbc:h2:mem:select next value for 10", false, var79);
    java.lang.String[] var86 = new java.lang.String[] { ""};
    java.lang.String[] var90 = new java.lang.String[] { ""};
    java.lang.String var91 = org.databene.jdbacl.SQLUtil.join("", "", var86, "hi!", "10", var90);
    org.databene.jdbacl.identity.IdentityProvider var92 = new org.databene.jdbacl.identity.IdentityProvider();
    org.databene.jdbacl.identity.SubNkPkQueryIdentity var93 = new org.databene.jdbacl.identity.SubNkPkQueryIdentity("null", var86, var92);
    org.databene.jdbacl.identity.SubNkPkQueryIdentity var94 = new org.databene.jdbacl.identity.SubNkPkQueryIdentity("-1", var79, var92);
    var94.setSubNkPkQuery("CONSTRAINT \"select nextval('')\" UNIQUE (, NaturalPkIdentity(hi!))");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi! as 10 on . = 10."+ "'", var17.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi! as 10 on . = 10."+ "'", var29.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "."+ "'", var30.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi! as 10 on . = 10."+ "'", var42.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "."+ "'", var43.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)."+ "'", var44.equals("left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "hi! as 10 on . = 10."+ "'", var66.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + ""+ "'", var68.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "SELECT * FROM null WHERE  = ''"+ "'", var69.equals("SELECT * FROM null WHERE  = ''"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "hi! as 10 on . = 10."+ "'", var80.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var91 + "' != '" + "hi! as 10 on . = 10."+ "'", var91.equals("hi! as 10 on . = 10."));

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test229");


    boolean var1 = org.databene.jdbacl.SQLUtil.isQuery("CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test230");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.FKChangeRule var1 = org.databene.jdbacl.model.FKChangeRule.valueOf("EQUEN");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test231");


    org.databene.jdbacl.model.DBSequence var3 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var3.setName("10");
    java.math.BigInteger var6 = var3.getIncrement();
    java.lang.Boolean var7 = var3.isCycle();
    java.lang.String var8 = var3.dropDDL();
    org.databene.jdbacl.model.DefaultDBTable var9 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var10 = var9.getForeignKeyConstraints();
    var9.setDoc("drop sequence ");
    boolean var13 = var3.equals((java.lang.Object)"drop sequence ");
    java.lang.String var14 = var3.getCatalogName();
    java.math.BigInteger var15 = var3.getMinValueIfNotDefault();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "drop sequence 10"+ "'", var8.equals("drop sequence 10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "drop sequence "+ "'", var14.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test232");


    org.databene.jdbacl.model.DefaultDBTable var4 = new org.databene.jdbacl.model.DefaultDBTable();
    var4.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var7 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var8 = var7.getForeignKeyConstraints();
    var4.addReferrer((org.databene.jdbacl.model.DBTable)var7);
    org.databene.jdbacl.model.DBDataType var12 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var13 = var12.isAlpha();
    java.lang.String var14 = var12.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var15 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var18 = var15.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var20 = var15.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var21 = var12.equals((java.lang.Object)var20);
    org.databene.jdbacl.model.DefaultDBColumn var24 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var7, var12, (java.lang.Integer)0, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DefaultDBTable var25 = new org.databene.jdbacl.model.DefaultDBTable();
    var25.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var28 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var29 = var28.getForeignKeyConstraints();
    var25.addReferrer((org.databene.jdbacl.model.DBTable)var28);
    var7.addReferrer((org.databene.jdbacl.model.DBTable)var25);
    org.databene.jdbacl.model.TableContainer var36 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var37 = var36.getTables();
    org.databene.jdbacl.model.TableContainer var38 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var36);
    org.databene.jdbacl.model.DefaultDBTable var39 = new org.databene.jdbacl.model.DefaultDBTable();
    var39.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var42 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var43 = var42.getForeignKeyConstraints();
    var39.addReferrer((org.databene.jdbacl.model.DBTable)var42);
    var36.addTable((org.databene.jdbacl.model.DBTable)var42);
    java.lang.String[] var50 = new java.lang.String[] { ""};
    java.lang.String[] var54 = new java.lang.String[] { ""};
    java.lang.String var55 = org.databene.jdbacl.SQLUtil.join("", "", var50, "hi!", "10", var54);
    java.lang.String var56 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var50);
    org.databene.jdbacl.model.TableContainer var59 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var60 = var59.getTables();
    org.databene.jdbacl.model.TableContainer var61 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var59);
    org.databene.jdbacl.model.DefaultDBTable var62 = new org.databene.jdbacl.model.DefaultDBTable();
    var62.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var65 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var66 = var65.getForeignKeyConstraints();
    var62.addReferrer((org.databene.jdbacl.model.DBTable)var65);
    var59.addTable((org.databene.jdbacl.model.DBTable)var65);
    java.lang.String[] var71 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var72 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var71);
    org.databene.jdbacl.model.DBForeignKeyConstraint var73 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var42, var50, (org.databene.jdbacl.model.DBTable)var65, var71);
    org.databene.jdbacl.model.DBTable var74 = var73.getRefereeTable();
    var7.addForeignKey(var73);
    org.databene.jdbacl.model.DBDataType var78 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    org.databene.jdbacl.model.DefaultDBColumn var79 = new org.databene.jdbacl.model.DefaultDBColumn("select next value for SET GENERATOR . TO -1", (org.databene.jdbacl.model.DBTable)var7, var78);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.DBCheckConstraint var81 = new org.databene.jdbacl.model.DBCheckConstraint("drop generator CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", true, (org.databene.jdbacl.model.DBTable)var7, "call next value for org.databene.jdbacl.SQLScriptException: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1: ");
      fail("Expected exception of type org.databene.commons.ParseException");
    } catch (org.databene.commons.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "DROP SEQUENCE "+ "'", var14.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var20.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi! as 10 on . = 10."+ "'", var55.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "."+ "'", var56.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var72.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test233");


    org.databene.jdbacl.model.DefaultDBTable var1 = new org.databene.jdbacl.model.DefaultDBTable();
    var1.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var4 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var5 = var4.getForeignKeyConstraints();
    var1.addReferrer((org.databene.jdbacl.model.DBTable)var4);
    org.databene.jdbacl.model.DBDataType var9 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var10 = var9.isAlpha();
    java.lang.String var11 = var9.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var12 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var15 = var12.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var17 = var12.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var18 = var9.equals((java.lang.Object)var17);
    org.databene.jdbacl.model.DefaultDBColumn var21 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var4, var9, (java.lang.Integer)0, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DBDataType var22 = var21.getType();
    java.lang.String var23 = var22.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "DROP SEQUENCE "+ "'", var11.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var17.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "DROP SEQUENCE "+ "'", var23.equals("DROP SEQUENCE "));

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test234");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.mT__93();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test235");


    org.databene.jdbacl.dialect.SqlServerDialect var0 = new org.databene.jdbacl.dialect.SqlServerDialect();
    boolean var3 = var0.isDefaultSchema("hi! identity by primary key", "sequence");
    boolean var5 = var0.isDeterministicUKName("SELECT * FROM null WHERE  = ''");
    boolean var7 = var0.isDeterministicUKName("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.");
    org.databene.jdbacl.model.DefaultDBTable var10 = new org.databene.jdbacl.model.DefaultDBTable();
    var10.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var13 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var14 = var13.getForeignKeyConstraints();
    var10.addReferrer((org.databene.jdbacl.model.DBTable)var13);
    java.lang.String[] var21 = new java.lang.String[] { ""};
    java.lang.String[] var25 = new java.lang.String[] { ""};
    java.lang.String var26 = org.databene.jdbacl.SQLUtil.join("", "", var21, "hi!", "10", var25);
    org.databene.jdbacl.model.DBUniqueConstraint var27 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var13, "select nextval('')", false, var21);
    var13.setDoc("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT");
    java.lang.String[] var32 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var33 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var32);
    org.databene.jdbacl.model.DBUniqueConstraint var34 = var13.getUniqueConstraint(var32);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var35 = var0.renderCase("alter sequence NOT drop generator sequence ~ 'hi!' restart with 10", "null[DROP SEQUENCE ]", var32);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi! as 10 on . = 10."+ "'", var26.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var33.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test236");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.sql.Connection var5 = org.databene.jdbacl.DBUtil.connect("SET GENERATOR . TO -1", "\"sequence\"", "jdbc:h2:mem:select next value for 10", "CONSTRAINT \"select nextval('')\" UNIQUE (, NaturalPkIdentity(hi!))", false);
      fail("Expected exception of type org.databene.commons.ConnectFailedException");
    } catch (org.databene.commons.ConnectFailedException e) {
      // Expected exception.
    }

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test237");


    java.lang.Boolean var1 = org.databene.jdbacl.SQLUtil.mutatesStructure("call next value for 'hi!'");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + false+ "'", var1.equals(false));

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test238");


    org.databene.jdbacl.dialect.DerbyDialect var2 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var4 = var2.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var5 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var6 = var5.getName();
    java.lang.String var7 = var2.formatValue((java.lang.Object)var5);
    var5.setName("'hi!'");
    java.util.List var10 = var5.getSchemas();
    org.databene.jdbacl.model.DBSchema var11 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var5);
    org.databene.jdbacl.model.DBTrigger var12 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var11);
    var12.setDescription("CREATE GENERATOR drop sequence ");
    org.databene.jdbacl.model.DefaultDBTable var16 = new org.databene.jdbacl.model.DefaultDBTable();
    var16.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var19 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var20 = var19.getForeignKeyConstraints();
    var16.addReferrer((org.databene.jdbacl.model.DBTable)var19);
    org.databene.jdbacl.model.DBDataType var24 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var25 = var24.isAlpha();
    java.lang.String var26 = var24.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var27 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var30 = var27.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var32 = var27.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var33 = var24.equals((java.lang.Object)var32);
    org.databene.jdbacl.model.DefaultDBColumn var36 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var19, var24, (java.lang.Integer)0, (java.lang.Integer)(-1));
    boolean var37 = var12.isIdentical((org.databene.jdbacl.model.DBObject)var36);
    org.databene.jdbacl.model.DBDataType var40 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var41 = var40.isAlpha();
    var36.setType(var40);
    boolean var43 = var40.isLOB();
    boolean var44 = var40.isAlpha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "DROP SEQUENCE "+ "'", var26.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var32.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test239");


    org.databene.jdbacl.model.DBCatalog var1 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var2 = var1.getName();
    org.databene.jdbacl.model.Database var3 = var1.getDatabase();
    java.lang.String var4 = var1.getDoc();
    org.databene.jdbacl.dialect.DerbyDialect var6 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var8 = var6.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var9 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var10 = var9.getName();
    java.lang.String var11 = var6.formatValue((java.lang.Object)var9);
    var9.setName("'hi!'");
    java.util.List var14 = var9.getSchemas();
    org.databene.jdbacl.model.DBSchema var15 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var9);
    var1.removeSchema(var15);
    org.databene.jdbacl.dialect.DerbyDialect var19 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var21 = var19.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var22 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var23 = var22.getName();
    java.lang.String var24 = var19.formatValue((java.lang.Object)var22);
    var22.setName("'hi!'");
    java.util.List var27 = var22.getSchemas();
    org.databene.jdbacl.model.DBSchema var28 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var22);
    org.databene.jdbacl.model.DBTrigger var29 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var28);
    var29.setDescription("CREATE GENERATOR drop sequence ");
    java.lang.String var32 = var29.getTriggerBody();
    java.lang.String var33 = var29.getColumnName();
    java.lang.String var34 = var29.getWhenClause();
    var15.addTrigger(var29);
    org.databene.jdbacl.model.DBTrigger var36 = new org.databene.jdbacl.model.DBTrigger("-1", var15);
    var36.setWhenClause("SELECT NEXT VALUE FOR SET GENERATOR.TO - 1 NOT REGEXP 'HI!'");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test240");


    org.databene.jdbacl.dialect.PostgreSQLDialect var0 = new org.databene.jdbacl.dialect.PostgreSQLDialect();
    boolean var3 = var0.isDefaultCatalog("", "");
    java.lang.String var5 = var0.renderDropSequence("");
    org.databene.jdbacl.model.DBCatalog var6 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var7 = var0.formatValue((java.lang.Object)var6);
    org.databene.jdbacl.model.DBTable var10 = var6.getTable("column", false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "drop sequence "+ "'", var5.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test241");


    org.databene.jdbacl.sql.ColumnExpression var2 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    boolean var3 = var2.isConstant();
    boolean var4 = var2.isConstant();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test242");


    boolean var1 = org.databene.jdbacl.SQLUtil.isDML("hi! identity by primary key");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test243");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.skip();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var3 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var5 = var3.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var3);
    org.databene.jdbacl.sql.parser.SQLLexer var7 = new org.databene.jdbacl.sql.parser.SQLLexer();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var9 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var9.release((-1));
    boolean var13 = var7.mismatchIsUnwantedToken((org.antlr.runtime.IntStream)var9, 0);
    var0.setCharStream((org.antlr.runtime.CharStream)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mLE();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test244");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.sql.Connection var5 = org.databene.jdbacl.DBUtil.connect("org.databene.jdbacl.SQLScriptException: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1: ", "alter sequence drop generator . restart with 10", "drop generator sequence", "alter sequence drop sequence 10 restart with 0", false);
      fail("Expected exception of type org.databene.commons.ConnectFailedException");
    } catch (org.databene.commons.ConnectFailedException e) {
      // Expected exception.
    }

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test245");


    org.databene.jdbacl.model.DefaultDBTable var1 = new org.databene.jdbacl.model.DefaultDBTable();
    var1.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var4 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var5 = var4.getForeignKeyConstraints();
    var1.addReferrer((org.databene.jdbacl.model.DBTable)var4);
    org.databene.jdbacl.model.DBDataType var9 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var10 = var9.isAlpha();
    java.lang.String var11 = var9.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var12 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var15 = var12.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var17 = var12.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var18 = var9.equals((java.lang.Object)var17);
    org.databene.jdbacl.model.DefaultDBColumn var21 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var4, var9, (java.lang.Integer)0, (java.lang.Integer)(-1));
    var21.setDefaultValue(".");
    var21.setNullable(true);
    java.lang.String var26 = org.databene.jdbacl.SQLUtil.renderColumnTypeWithSize((org.databene.jdbacl.model.DBColumn)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "DROP SEQUENCE "+ "'", var11.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var17.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "DROP SEQUENCE (0,-1)"+ "'", var26.equals("DROP SEQUENCE (0,-1)"));

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test246");


    org.databene.jdbacl.version.QueryVersionProvider var1 = new org.databene.jdbacl.version.QueryVersionProvider("catalog");

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test247");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var3 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var3.setCharPositionInLine(1);
    java.lang.String var6 = var3.toString();
    var0.setCharStream((org.antlr.runtime.CharStream)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mT__66();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "DROP SEQUENCE "+ "'", var6.equals("DROP SEQUENCE "));

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test248");


    org.databene.jdbacl.identity.NoIdentity var1 = new org.databene.jdbacl.identity.NoIdentity("CREATE GENERATOR ");

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test249");


    org.databene.jdbacl.dialect.SqlServerDialect var0 = new org.databene.jdbacl.dialect.SqlServerDialect();
    boolean var2 = var0.isDeterministicFKName("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    boolean var5 = var0.isDefaultSchema("jdbc:h2:mem:select next value for 10", "Identity definition by unique key: select next value for 10");
    boolean var8 = var0.isDefaultCatalog("alter sequence CREATE GENERATOR drop sequence  restart with 10", "call next value for null[]");
    org.databene.jdbacl.model.TableContainer var16 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var17 = var16.getTables();
    org.databene.jdbacl.model.TableContainer var18 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var16);
    org.databene.jdbacl.model.DefaultDBTable var19 = new org.databene.jdbacl.model.DefaultDBTable();
    var19.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var22 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var23 = var22.getForeignKeyConstraints();
    var19.addReferrer((org.databene.jdbacl.model.DBTable)var22);
    var16.addTable((org.databene.jdbacl.model.DBTable)var22);
    java.lang.String[] var30 = new java.lang.String[] { ""};
    java.lang.String[] var34 = new java.lang.String[] { ""};
    java.lang.String var35 = org.databene.jdbacl.SQLUtil.join("", "", var30, "hi!", "10", var34);
    java.lang.String var36 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var30);
    org.databene.jdbacl.model.TableContainer var39 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var40 = var39.getTables();
    org.databene.jdbacl.model.TableContainer var41 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var39);
    org.databene.jdbacl.model.DefaultDBTable var42 = new org.databene.jdbacl.model.DefaultDBTable();
    var42.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var45 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var46 = var45.getForeignKeyConstraints();
    var42.addReferrer((org.databene.jdbacl.model.DBTable)var45);
    var39.addTable((org.databene.jdbacl.model.DBTable)var45);
    java.lang.String[] var51 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var52 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var51);
    org.databene.jdbacl.model.DBForeignKeyConstraint var53 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var22, var30, (org.databene.jdbacl.model.DBTable)var45, var51);
    java.lang.String[] var54 = var53.getRefereeColumnNames();
    java.lang.String[] var55 = var53.getForeignKeyColumnNames();
    org.databene.jdbacl.identity.UniqueKeyIdentity var56 = new org.databene.jdbacl.identity.UniqueKeyIdentity("DROP SEQUENCE  NOT REGEXP 'VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).)'", var55);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var57 = var0.renderCase("((\"sequence\" BETWEEN \"sequence\" AND \"sequence\") BETWEEN \"sequence\" AND \"'hi!'\")", "left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).", var55);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi! as 10 on . = 10."+ "'", var35.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "."+ "'", var36.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var52.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test250");


    org.databene.jdbacl.model.DefaultDBTable var1 = new org.databene.jdbacl.model.DefaultDBTable();
    var1.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var4 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var5 = var4.getForeignKeyConstraints();
    var1.addReferrer((org.databene.jdbacl.model.DBTable)var4);
    java.lang.String[] var12 = new java.lang.String[] { ""};
    java.lang.String[] var16 = new java.lang.String[] { ""};
    java.lang.String var17 = org.databene.jdbacl.SQLUtil.join("", "", var12, "hi!", "10", var16);
    org.databene.jdbacl.model.DBUniqueConstraint var18 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var4, "select nextval('')", false, var12);
    java.lang.String[] var24 = new java.lang.String[] { ""};
    java.lang.String[] var28 = new java.lang.String[] { ""};
    java.lang.String var29 = org.databene.jdbacl.SQLUtil.join("", "", var24, "hi!", "10", var28);
    java.lang.String var30 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var24);
    java.lang.String[] var37 = new java.lang.String[] { ""};
    java.lang.String[] var41 = new java.lang.String[] { ""};
    java.lang.String var42 = org.databene.jdbacl.SQLUtil.join("", "", var37, "hi!", "10", var41);
    java.lang.String var43 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var41);
    java.lang.String var44 = org.databene.jdbacl.SQLUtil.leftJoin("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE ", var24, "jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1)", "drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)", var41);
    org.databene.jdbacl.identity.NaturalPkIdentity var46 = new org.databene.jdbacl.identity.NaturalPkIdentity("hi!");
    java.lang.String var47 = var46.getName();
    boolean var49 = var46.equals((java.lang.Object)(-1.0d));
    org.databene.jdbacl.model.DefaultDBTable var50 = new org.databene.jdbacl.model.DefaultDBTable();
    var50.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var53 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var54 = var53.getForeignKeyConstraints();
    var50.addReferrer((org.databene.jdbacl.model.DBTable)var53);
    java.lang.String[] var61 = new java.lang.String[] { ""};
    java.lang.String[] var65 = new java.lang.String[] { ""};
    java.lang.String var66 = org.databene.jdbacl.SQLUtil.join("", "", var61, "hi!", "10", var65);
    org.databene.jdbacl.model.DBUniqueConstraint var67 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var53, "select nextval('')", false, var61);
    java.lang.String var68 = var46.extractNK((java.lang.Object[])var61);
    java.lang.String var69 = org.databene.jdbacl.SQLUtil.renderQuery((org.databene.jdbacl.model.DBTable)var4, var24, (java.lang.Object[])var61);
    java.lang.String[] var75 = new java.lang.String[] { ""};
    java.lang.String[] var79 = new java.lang.String[] { ""};
    java.lang.String var80 = org.databene.jdbacl.SQLUtil.join("", "", var75, "hi!", "10", var79);
    org.databene.jdbacl.model.DBPrimaryKeyConstraint var81 = new org.databene.jdbacl.model.DBPrimaryKeyConstraint((org.databene.jdbacl.model.DBTable)var4, "jdbc:h2:mem:select next value for 10", false, var79);
    java.lang.String[] var86 = new java.lang.String[] { ""};
    java.lang.String[] var90 = new java.lang.String[] { ""};
    java.lang.String var91 = org.databene.jdbacl.SQLUtil.join("", "", var86, "hi!", "10", var90);
    org.databene.jdbacl.identity.IdentityProvider var92 = new org.databene.jdbacl.identity.IdentityProvider();
    org.databene.jdbacl.identity.SubNkPkQueryIdentity var93 = new org.databene.jdbacl.identity.SubNkPkQueryIdentity("null", var86, var92);
    org.databene.jdbacl.identity.SubNkPkQueryIdentity var94 = new org.databene.jdbacl.identity.SubNkPkQueryIdentity("-1", var79, var92);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.identity.IdentityModel var97 = var92.getIdentity("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.", true);
      fail("Expected exception of type org.databene.commons.ObjectNotFoundException");
    } catch (org.databene.commons.ObjectNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi! as 10 on . = 10."+ "'", var17.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi! as 10 on . = 10."+ "'", var29.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "."+ "'", var30.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi! as 10 on . = 10."+ "'", var42.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "."+ "'", var43.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)."+ "'", var44.equals("left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "hi! as 10 on . = 10."+ "'", var66.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + ""+ "'", var68.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "SELECT * FROM null WHERE  = ''"+ "'", var69.equals("SELECT * FROM null WHERE  = ''"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "hi! as 10 on . = 10."+ "'", var80.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var91 + "' != '" + "hi! as 10 on . = 10."+ "'", var91.equals("hi! as 10 on . = 10."));

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test251");


    org.databene.jdbacl.dialect.FirebirdDialect var0 = new org.databene.jdbacl.dialect.FirebirdDialect();
    boolean var2 = var0.isDeterministicUKName("10");
    java.lang.String var4 = var0.renderDropSequence("sequence");
    boolean var6 = var0.isDeterministicUKName("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)");
    java.lang.String var7 = var0.getJDBCDriverClass();
    boolean var9 = var0.isDeterministicFKName("SET GENERATOR alter sequence CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT restart with 1 TO -2");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "drop generator sequence"+ "'", var4.equals("drop generator sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "org.firebirdsql.jdbc.FBDriver"+ "'", var7.equals("org.firebirdsql.jdbc.FBDriver"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test252");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var3 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var3.setCharPositionInLine(1);
    java.lang.String var6 = var3.toString();
    var0.setCharStream((org.antlr.runtime.CharStream)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mT__94();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "DROP SEQUENCE "+ "'", var6.equals("DROP SEQUENCE "));

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test253");


    org.databene.jdbacl.dialect.PostgreSQLDialect var0 = new org.databene.jdbacl.dialect.PostgreSQLDialect();
    boolean var3 = var0.isDefaultCatalog("", "");
    java.lang.String var5 = var0.renderDropSequence("");
    boolean var7 = var0.isDeterministicFKName("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    boolean var8 = var0.isSequenceBoundarySupported();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "drop sequence "+ "'", var5.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test254");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mT__97();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test255");


    java.lang.Boolean var1 = org.databene.jdbacl.SQLUtil.mutatesStructure("drop generator CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + false+ "'", var1.equals(false));

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test256");


    org.databene.jdbacl.model.DBCatalog var0 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var1 = var0.getName();
    org.databene.jdbacl.model.DBTable var4 = var0.getTable("drop sequence ", false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test257");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.DBCheckConstraint var4 = new org.databene.jdbacl.model.DBCheckConstraint("drop generator .", false, "select nextval('CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT')", "drop sequence alter sequence hi! restart with 1");
      fail("Expected exception of type org.databene.commons.SyntaxError");
    } catch (org.databene.commons.SyntaxError e) {
      // Expected exception.
    }

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test258");


    org.databene.jdbacl.dialect.DerbyDialect var2 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var4 = var2.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var5 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var6 = var5.getName();
    java.lang.String var7 = var2.formatValue((java.lang.Object)var5);
    var5.setName("'hi!'");
    java.util.List var10 = var5.getSchemas();
    org.databene.jdbacl.model.DBSchema var11 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var5);
    org.databene.jdbacl.model.DBTrigger var12 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var11);
    var12.setTableOwner("call next value for 'hi!'");
    java.lang.String var15 = var12.getStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test259");


    org.databene.jdbacl.model.jdbc.JDBCDBImporter var6 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var6.setImportingChecks(false);
    java.lang.String var9 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "JDBCDBImporter"+ "'", var9.equals("JDBCDBImporter"));

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test260");


    java.lang.String var2 = org.databene.jdbacl.SQLUtil.normalize("null", false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "null"+ "'", var2.equals("null"));

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test261");


    org.databene.jdbacl.dialect.DerbyDialect var3 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var5 = var3.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var6 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var7 = var6.getName();
    java.lang.String var8 = var3.formatValue((java.lang.Object)var6);
    var6.setName("'hi!'");
    java.util.List var11 = var6.getSchemas();
    org.databene.jdbacl.model.DBSchema var12 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var6);
    org.databene.jdbacl.model.DBTrigger var13 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var12);
    java.util.List var14 = var12.getPackages();
    org.databene.jdbacl.model.DBPackage var15 = new org.databene.jdbacl.model.DBPackage("CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).", var12);
    java.lang.String var16 = var15.getStatus();
    org.databene.jdbacl.dialect.DerbyDialect var21 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var23 = var21.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var24 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var25 = var24.getName();
    java.lang.String var26 = var21.formatValue((java.lang.Object)var24);
    var24.setName("'hi!'");
    java.util.List var29 = var24.getSchemas();
    org.databene.jdbacl.model.DBSchema var30 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var24);
    org.databene.jdbacl.model.DBTrigger var31 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var30);
    java.util.List var32 = var30.getPackages();
    org.databene.jdbacl.model.DBPackage var33 = new org.databene.jdbacl.model.DBPackage("CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).", var30);
    java.util.List var34 = var33.getComponents();
    org.databene.jdbacl.model.DBProcedure var35 = new org.databene.jdbacl.model.DBProcedure("CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var33);
    java.lang.String var36 = var35.getSubProgramId();
    org.databene.jdbacl.model.DefaultDBTable var38 = new org.databene.jdbacl.model.DefaultDBTable();
    var38.setDoc(".");
    java.util.Set var42 = var38.getUniqueConstraints(false);
    org.databene.jdbacl.model.DBDataType var45 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var46 = var45.isAlpha();
    boolean var47 = var45.isLOB();
    org.databene.jdbacl.model.DefaultDBColumn var50 = new org.databene.jdbacl.model.DefaultDBColumn("NOT drop generator sequence ~ 'hi!'", (org.databene.jdbacl.model.DBTable)var38, var45, (java.lang.Integer)100, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.TableContainer var53 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var54 = var53.getTables();
    org.databene.jdbacl.model.TableContainer var55 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var53);
    org.databene.jdbacl.model.DefaultDBTable var56 = new org.databene.jdbacl.model.DefaultDBTable();
    var56.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var59 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var60 = var59.getForeignKeyConstraints();
    var56.addReferrer((org.databene.jdbacl.model.DBTable)var59);
    var53.addTable((org.databene.jdbacl.model.DBTable)var59);
    var50.setTable((org.databene.jdbacl.model.DBTable)var59);
    boolean var64 = var35.isIdentical((org.databene.jdbacl.model.DBObject)var59);
    var15.addProcedure(var35);
    java.lang.String var66 = var35.getSubProgramId();
    var35.setOverload("hi! as 10 on . = 10.");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test262");


    org.databene.jdbacl.dialect.PostgreSQLDialect var0 = new org.databene.jdbacl.dialect.PostgreSQLDialect();
    boolean var3 = var0.isDefaultCatalog("", "");
    java.lang.String var5 = var0.renderDropSequence("");
    boolean var7 = var0.isDeterministicFKName("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    java.lang.String var9 = var0.renderFetchSequenceValue("");
    org.databene.jdbacl.model.DBSequence var13 = new org.databene.jdbacl.model.DBSequence("left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).", "hi! identity by primary key", "jdbc:h2:mem:select next value for 10");
    java.lang.String var14 = var0.renderCreateSequence(var13);
    org.databene.jdbacl.model.DBCatalog var17 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var18 = var17.getName();
    org.databene.jdbacl.model.Database var19 = var17.getDatabase();
    java.lang.String var20 = var17.getDoc();
    org.databene.jdbacl.dialect.DerbyDialect var22 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var24 = var22.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var25 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var26 = var25.getName();
    java.lang.String var27 = var22.formatValue((java.lang.Object)var25);
    var25.setName("'hi!'");
    java.util.List var30 = var25.getSchemas();
    org.databene.jdbacl.model.DBSchema var31 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var25);
    var17.removeSchema(var31);
    org.databene.jdbacl.dialect.DerbyDialect var35 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var37 = var35.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var38 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var39 = var38.getName();
    java.lang.String var40 = var35.formatValue((java.lang.Object)var38);
    var38.setName("'hi!'");
    java.util.List var43 = var38.getSchemas();
    org.databene.jdbacl.model.DBSchema var44 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var38);
    org.databene.jdbacl.model.DBTrigger var45 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var44);
    var45.setDescription("CREATE GENERATOR drop sequence ");
    java.lang.String var48 = var45.getTriggerBody();
    java.lang.String var49 = var45.getColumnName();
    java.lang.String var50 = var45.getWhenClause();
    var31.addTrigger(var45);
    org.databene.jdbacl.model.DBTrigger var52 = new org.databene.jdbacl.model.DBTrigger("-1", var31);
    org.databene.jdbacl.model.DBSequence var53 = new org.databene.jdbacl.model.DBSequence("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.", var31);
    java.lang.String var54 = var0.renderCreateSequence(var53);
    java.math.BigInteger var55 = var53.getIncrement();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "drop sequence "+ "'", var5.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "select nextval('')"+ "'", var9.equals("select nextval('')"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)."+ "'", var14.equals("CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "CREATE SEQUENCE DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1."+ "'", var54.equals("CREATE SEQUENCE DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test263");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.DBUtil.checkReadOnly("((\"sequence\" BETWEEN \"sequence\" AND \"sequence\") BETWEEN \"sequence\" AND \"'hi!'\")", true);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test264");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.mT__73();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test265");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.jdbc.JDBCDBImporter var1 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1)");
      fail("Expected exception of type org.databene.commons.ConfigurationError");
    } catch (org.databene.commons.ConfigurationError e) {
      // Expected exception.
    }

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test266");


    org.databene.jdbacl.dialect.DerbyDialect var0 = new org.databene.jdbacl.dialect.DerbyDialect();
    java.lang.String var2 = var0.formatValue((java.lang.Object)(byte)(-1));
    boolean var5 = var0.isDefaultSchema("10", "NOT REGEXP_MATCHES(sequence, '')");
    boolean var7 = var0.isDeterministicIndexName("JDBCDBImporter");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "-1"+ "'", var2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test267");


    org.databene.jdbacl.model.DefaultDBTable var1 = new org.databene.jdbacl.model.DefaultDBTable();
    var1.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var4 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var5 = var4.getForeignKeyConstraints();
    var1.addReferrer((org.databene.jdbacl.model.DBTable)var4);
    java.lang.String[] var12 = new java.lang.String[] { ""};
    java.lang.String[] var16 = new java.lang.String[] { ""};
    java.lang.String var17 = org.databene.jdbacl.SQLUtil.join("", "", var12, "hi!", "10", var16);
    org.databene.jdbacl.model.DBUniqueConstraint var18 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var4, "select nextval('')", false, var12);
    org.databene.jdbacl.model.DBDataType var21 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var22 = var21.isAlpha();
    org.databene.jdbacl.model.DefaultDBColumn var23 = new org.databene.jdbacl.model.DefaultDBColumn("'hi!'", (org.databene.jdbacl.model.DBTable)var4, var21);
    java.lang.String var24 = var21.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi! as 10 on . = 10."+ "'", var17.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "DROP SEQUENCE "+ "'", var24.equals("DROP SEQUENCE "));

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test268");


    org.databene.jdbacl.model.DefaultDBTable var0 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var1 = var0.getForeignKeyConstraints();
    var0.setDoc("drop sequence ");
    var0.setDoc("catalog");
    org.databene.jdbacl.JDBCDriverInfo var6 = new org.databene.jdbacl.JDBCDriverInfo();
    var6.setDriverClass("hi!");
    java.lang.String var9 = var6.getUrlPattern();
    java.lang.String var10 = var6.getDefaultSchema();
    java.lang.String[] var11 = var6.getJars();
    org.databene.jdbacl.model.TableContainer var16 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var17 = var16.getTables();
    org.databene.jdbacl.model.TableContainer var18 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var16);
    org.databene.jdbacl.model.DefaultDBTable var19 = new org.databene.jdbacl.model.DefaultDBTable();
    var19.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var22 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var23 = var22.getForeignKeyConstraints();
    var19.addReferrer((org.databene.jdbacl.model.DBTable)var22);
    var16.addTable((org.databene.jdbacl.model.DBTable)var22);
    java.lang.String[] var30 = new java.lang.String[] { ""};
    java.lang.String[] var34 = new java.lang.String[] { ""};
    java.lang.String var35 = org.databene.jdbacl.SQLUtil.join("", "", var30, "hi!", "10", var34);
    java.lang.String var36 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var30);
    org.databene.jdbacl.model.TableContainer var39 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var40 = var39.getTables();
    org.databene.jdbacl.model.TableContainer var41 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var39);
    org.databene.jdbacl.model.DefaultDBTable var42 = new org.databene.jdbacl.model.DefaultDBTable();
    var42.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var45 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var46 = var45.getForeignKeyConstraints();
    var42.addReferrer((org.databene.jdbacl.model.DBTable)var45);
    var39.addTable((org.databene.jdbacl.model.DBTable)var45);
    java.lang.String[] var51 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var52 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var51);
    org.databene.jdbacl.model.DBForeignKeyConstraint var53 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var22, var30, (org.databene.jdbacl.model.DBTable)var45, var51);
    var6.setJars(var30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.DBForeignKeyConstraint var55 = var0.getForeignKeyConstraint(var30);
      fail("Expected exception of type org.databene.commons.ObjectNotFoundException");
    } catch (org.databene.commons.ObjectNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi! as 10 on . = 10."+ "'", var35.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "."+ "'", var36.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var52.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test269");


    org.databene.jdbacl.identity.xml.IdentityParseContext var0 = new org.databene.jdbacl.identity.xml.IdentityParseContext();
    org.databene.jdbacl.identity.xml.IdentityParser var1 = new org.databene.jdbacl.identity.xml.IdentityParser();
    var0.addParser((org.databene.webdecs.xml.XMLElementParser)var1);
    org.databene.jdbacl.identity.xml.IdentityParseContext var3 = new org.databene.jdbacl.identity.xml.IdentityParseContext();
    org.databene.jdbacl.identity.xml.IdentityParser var4 = new org.databene.jdbacl.identity.xml.IdentityParser();
    var3.addParser((org.databene.webdecs.xml.XMLElementParser)var4);
    var0.addParser((org.databene.webdecs.xml.XMLElementParser)var4);
    boolean var8 = var0.contains("drop sequence alter sequence hi! restart with 1");
    org.databene.jdbacl.identity.IdentityProvider var9 = var0.getIdentityProvider();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.identity.IdentityModel var12 = var9.getIdentity("'E'", true);
      fail("Expected exception of type org.databene.commons.ObjectNotFoundException");
    } catch (org.databene.commons.ObjectNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test270");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.JDBCConnectData var1 = org.databene.jdbacl.DBUtil.getConnectData("alter sequence NOT drop generator sequence ~ 'hi!' restart with 10");
      fail("Expected exception of type org.databene.commons.ConfigurationError");
    } catch (org.databene.commons.ConfigurationError e) {
      // Expected exception.
    }

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test271");


    org.databene.jdbacl.identity.mem.MapperState[] var0 = org.databene.jdbacl.identity.mem.MapperState.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test272");


    org.databene.jdbacl.model.DefaultDBTable var0 = new org.databene.jdbacl.model.DefaultDBTable();
    var0.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var3 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var4 = var3.getForeignKeyConstraints();
    var0.addReferrer((org.databene.jdbacl.model.DBTable)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.DBNotNullConstraint var9 = new org.databene.jdbacl.model.DBNotNullConstraint((org.databene.jdbacl.model.DBTable)var3, "unique constraint", false, "DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.");
      fail("Expected exception of type org.databene.commons.ObjectNotFoundException");
    } catch (org.databene.commons.ObjectNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test273");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.DBCheckConstraint var4 = new org.databene.jdbacl.model.DBCheckConstraint("drop sequence 10", false, "'d'", "select next value for SET GENERATOR . TO -1");
      fail("Expected exception of type org.databene.commons.ParseException");
    } catch (org.databene.commons.ParseException e) {
      // Expected exception.
    }

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test274");


    org.databene.jdbacl.model.TableContainerSupport var0 = new org.databene.jdbacl.model.TableContainerSupport();
    java.util.List var2 = var0.getTables(false);
    java.util.List var4 = var0.getSequences(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test275");


    org.databene.jdbacl.model.TableContainer var1 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var2 = var1.getTables();
    java.util.List var4 = var1.getSequences(false);
    java.util.List var5 = org.databene.jdbacl.DBUtil.dependencyOrderedTables((org.databene.jdbacl.model.TableHolder)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test276");


    org.databene.jdbacl.dialect.DerbyDialect var0 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var2 = var0.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var3 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var4 = var3.getName();
    java.lang.String var5 = var0.formatValue((java.lang.Object)var3);
    boolean var7 = var0.isDeterministicPKName("alter sequence drop generator . restart with 10");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test277");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    java.lang.String var9 = var0.getCharErrorDisplay(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mT__111();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "'d'"+ "'", var9.equals("'d'"));

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test278");


    org.databene.jdbacl.dialect.PostgreSQLDialect var0 = new org.databene.jdbacl.dialect.PostgreSQLDialect();
    boolean var3 = var0.isDefaultCatalog("", "");
    java.lang.String var5 = var0.renderDropSequence("");
    org.databene.jdbacl.model.DBCatalog var6 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var7 = var0.formatValue((java.lang.Object)var6);
    boolean var9 = var0.isDeterministicPKName("drop sequence ");
    boolean var12 = var0.isDefaultCatalog("call next value for 'hi!'", "org.databene.jdbacl.SQLScriptException: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "drop sequence "+ "'", var5.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test279");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.sql.Connection var2 = org.databene.jdbacl.DBUtil.connect("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", false);
      fail("Expected exception of type org.databene.commons.ConfigurationError");
    } catch (org.databene.commons.ConfigurationError e) {
      // Expected exception.
    }

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test280");


    org.databene.jdbacl.dialect.HSQL2Dialect var0 = new org.databene.jdbacl.dialect.HSQL2Dialect();
    java.lang.String var2 = var0.renderFetchSequenceValue("'hi!'");
    boolean var3 = var0.supportsRegex();
    java.lang.String var6 = var0.renderSequenceValue("drop generator .", 10L);
    boolean var8 = var0.isDeterministicIndexName("'hi!'");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "call next value for 'hi!'"+ "'", var2.equals("call next value for 'hi!'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "alter sequence drop generator . restart with 10"+ "'", var6.equals("alter sequence drop generator . restart with 10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test281");


    org.databene.jdbacl.model.DBSequence var3 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var3.setName("10");
    java.math.BigInteger var6 = var3.getIncrement();
    java.math.BigInteger var7 = var3.getIncrement();
    org.databene.jdbacl.model.DBSequence var11 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    java.lang.String var12 = var11.dropDDL();
    java.math.BigInteger var13 = var11.getMinValueIfNotDefault();
    java.math.BigInteger var14 = var11.getLastNumber();
    var3.setStart(var14);
    java.lang.Boolean var16 = var3.isOrder();
    org.databene.jdbacl.model.DBCatalog var18 = new org.databene.jdbacl.model.DBCatalog("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setOwner((org.databene.jdbacl.model.CompositeDBObject)var18);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "drop sequence "+ "'", var12.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test282");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.JDBCConnectData var1 = org.databene.jdbacl.JDBCConnectData.parseSingleDbProperties("CONSTRAINT \"select nextval('')\" ");
      fail("Expected exception of type org.databene.commons.ConfigurationError");
    } catch (org.databene.commons.ConfigurationError e) {
      // Expected exception.
    }

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test283");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.skip();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var3 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var5 = var3.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.match("CREATE GENERATOR DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.");
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 69);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test284");


    org.databene.jdbacl.model.jdbc.JDBCDBImporter var6 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var6.setImportingPackages(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.Database var9 = var6.importDatabase();
      fail("Expected exception of type org.databene.commons.ConnectFailedException");
    } catch (org.databene.commons.ConnectFailedException e) {
      // Expected exception.
    }

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test285");


    org.databene.jdbacl.dialect.DerbyDialect var0 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var2 = var0.isDeterministicPKName("hi! as 10 on . = 10.");
    boolean var4 = var0.isDeterministicIndexName("sequence");
    boolean var6 = var0.isDeterministicFKName("10");
    boolean var9 = var0.isDefaultCatalog("CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )", "jdbc:h2:mem:org.databene.jdbacl.SQLScriptException: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1: ");
    boolean var11 = var0.isDeterministicIndexName("((\"sequence\" BETWEEN \"sequence\" AND \"sequence\") BETWEEN \"sequence\" AND \"'hi!'\")");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test286");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.JDBCConnectData var1 = org.databene.jdbacl.JDBCConnectData.parseSingleDbProperties("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")");
      fail("Expected exception of type org.databene.commons.ConfigurationError");
    } catch (org.databene.commons.ConfigurationError e) {
      // Expected exception.
    }

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test287");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.sql.parser.ANTLRNoCaseFileStream var1 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseFileStream("alter sequence CREATE SEQUENCE DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1. restart with 1");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test288");


    org.databene.jdbacl.dialect.Derby10_6Dialect var0 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var3 = var0.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var5 = var0.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var6 = var0.isSequenceSupported();
    boolean var7 = var0.supportsRegex();
    boolean var9 = var0.isDeterministicPKName("select nextval('alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP 'alter sequence hi! restart with 1'')");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var5.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test289");


    boolean var4 = org.databene.jdbacl.DBUtil.available("NO_ACTION", "DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT", "VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).)", "left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test290");


    org.databene.jdbacl.model.DefaultDBTable var1 = new org.databene.jdbacl.model.DefaultDBTable();
    var1.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var4 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var5 = var4.getForeignKeyConstraints();
    var1.addReferrer((org.databene.jdbacl.model.DBTable)var4);
    java.lang.String[] var12 = new java.lang.String[] { ""};
    java.lang.String[] var16 = new java.lang.String[] { ""};
    java.lang.String var17 = org.databene.jdbacl.SQLUtil.join("", "", var12, "hi!", "10", var16);
    org.databene.jdbacl.model.DBUniqueConstraint var18 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var4, "select nextval('')", false, var12);
    java.lang.String[] var24 = new java.lang.String[] { ""};
    java.lang.String[] var28 = new java.lang.String[] { ""};
    java.lang.String var29 = org.databene.jdbacl.SQLUtil.join("", "", var24, "hi!", "10", var28);
    java.lang.String var30 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var24);
    java.lang.String[] var37 = new java.lang.String[] { ""};
    java.lang.String[] var41 = new java.lang.String[] { ""};
    java.lang.String var42 = org.databene.jdbacl.SQLUtil.join("", "", var37, "hi!", "10", var41);
    java.lang.String var43 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var41);
    java.lang.String var44 = org.databene.jdbacl.SQLUtil.leftJoin("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE ", var24, "jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1)", "drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)", var41);
    org.databene.jdbacl.identity.NaturalPkIdentity var46 = new org.databene.jdbacl.identity.NaturalPkIdentity("hi!");
    java.lang.String var47 = var46.getName();
    boolean var49 = var46.equals((java.lang.Object)(-1.0d));
    org.databene.jdbacl.model.DefaultDBTable var50 = new org.databene.jdbacl.model.DefaultDBTable();
    var50.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var53 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var54 = var53.getForeignKeyConstraints();
    var50.addReferrer((org.databene.jdbacl.model.DBTable)var53);
    java.lang.String[] var61 = new java.lang.String[] { ""};
    java.lang.String[] var65 = new java.lang.String[] { ""};
    java.lang.String var66 = org.databene.jdbacl.SQLUtil.join("", "", var61, "hi!", "10", var65);
    org.databene.jdbacl.model.DBUniqueConstraint var67 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var53, "select nextval('')", false, var61);
    java.lang.String var68 = var46.extractNK((java.lang.Object[])var61);
    java.lang.String var69 = org.databene.jdbacl.SQLUtil.renderQuery((org.databene.jdbacl.model.DBTable)var4, var24, (java.lang.Object[])var61);
    java.lang.String[] var75 = new java.lang.String[] { ""};
    java.lang.String[] var79 = new java.lang.String[] { ""};
    java.lang.String var80 = org.databene.jdbacl.SQLUtil.join("", "", var75, "hi!", "10", var79);
    org.databene.jdbacl.model.DBPrimaryKeyConstraint var81 = new org.databene.jdbacl.model.DBPrimaryKeyConstraint((org.databene.jdbacl.model.DBTable)var4, "jdbc:h2:mem:select next value for 10", false, var79);
    java.lang.String[] var86 = new java.lang.String[] { ""};
    java.lang.String[] var90 = new java.lang.String[] { ""};
    java.lang.String var91 = org.databene.jdbacl.SQLUtil.join("", "", var86, "hi!", "10", var90);
    org.databene.jdbacl.identity.IdentityProvider var92 = new org.databene.jdbacl.identity.IdentityProvider();
    org.databene.jdbacl.identity.SubNkPkQueryIdentity var93 = new org.databene.jdbacl.identity.SubNkPkQueryIdentity("null", var86, var92);
    org.databene.jdbacl.identity.SubNkPkQueryIdentity var94 = new org.databene.jdbacl.identity.SubNkPkQueryIdentity("-1", var79, var92);
    org.databene.jdbacl.identity.IdentityModel var97 = var92.getIdentity("-1", false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi! as 10 on . = 10."+ "'", var17.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi! as 10 on . = 10."+ "'", var29.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "."+ "'", var30.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi! as 10 on . = 10."+ "'", var42.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "."+ "'", var43.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)."+ "'", var44.equals("left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "hi! as 10 on . = 10."+ "'", var66.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + ""+ "'", var68.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "SELECT * FROM null WHERE  = ''"+ "'", var69.equals("SELECT * FROM null WHERE  = ''"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "hi! as 10 on . = 10."+ "'", var80.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var91 + "' != '" + "hi! as 10 on . = 10."+ "'", var91.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var97);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test291");


    org.databene.jdbacl.identity.NaturalPkIdentity var1 = new org.databene.jdbacl.identity.NaturalPkIdentity("hi!");
    java.lang.String var2 = var1.getName();
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "NaturalPkIdentity(hi!)"+ "'", var3.equals("NaturalPkIdentity(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "NaturalPkIdentity(hi!)"+ "'", var4.equals("NaturalPkIdentity(hi!)"));

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test292");


    java.lang.String var1 = org.databene.jdbacl.DBUtil.escape("CREATE GENERATOR jdbc:h2:mem:hi! as 10 on . = 10.");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "CREATE GENERATOR jdbc:h2:mem:hi! as 10 on . = 10."+ "'", var1.equals("CREATE GENERATOR jdbc:h2:mem:hi! as 10 on . = 10."));

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test293");


    org.databene.jdbacl.identity.xml.IdentityParseContext var0 = new org.databene.jdbacl.identity.xml.IdentityParseContext();
    org.databene.jdbacl.identity.xml.IdentityParser var1 = new org.databene.jdbacl.identity.xml.IdentityParser();
    var0.addParser((org.databene.webdecs.xml.XMLElementParser)var1);
    org.databene.jdbacl.identity.xml.IdentityParseContext var3 = new org.databene.jdbacl.identity.xml.IdentityParseContext();
    org.databene.jdbacl.identity.xml.IdentityParser var4 = new org.databene.jdbacl.identity.xml.IdentityParser();
    var3.addParser((org.databene.webdecs.xml.XMLElementParser)var4);
    var0.addParser((org.databene.webdecs.xml.XMLElementParser)var4);
    boolean var8 = var0.contains("drop sequence alter sequence hi! restart with 1");
    org.databene.jdbacl.identity.IdentityProvider var9 = var0.getIdentityProvider();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.identity.IdentityModel var11 = var9.getIdentity("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
      fail("Expected exception of type org.databene.commons.ObjectNotFoundException");
    } catch (org.databene.commons.ObjectNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test294");


    org.databene.jdbacl.dialect.DerbyDialect var1 = new org.databene.jdbacl.dialect.DerbyDialect(true);
    boolean var3 = var1.isDeterministicFKName("alter sequence CREATE GENERATOR drop sequence  restart with 10");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test295");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.NameSpec var1 = org.databene.jdbacl.NameSpec.valueOf("alter sequence drop sequence 10 restart with 0");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test296");


    org.databene.jdbacl.dialect.DerbyDialect var1 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var3 = var1.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var4 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var5 = var4.getName();
    java.lang.String var6 = var1.formatValue((java.lang.Object)var4);
    var4.setName("'hi!'");
    java.util.List var9 = var4.getSchemas();
    org.databene.jdbacl.model.DBSchema var10 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var4);
    org.databene.jdbacl.dialect.DerbyDialect var13 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var15 = var13.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var16 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var17 = var16.getName();
    java.lang.String var18 = var13.formatValue((java.lang.Object)var16);
    var16.setName("'hi!'");
    java.util.List var21 = var16.getSchemas();
    org.databene.jdbacl.model.DBSchema var22 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var16);
    org.databene.jdbacl.model.DBTrigger var23 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var22);
    var10.addTrigger(var23);
    java.lang.String var25 = var23.getTableOwner();
    var23.setReferencingNames("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT");
    java.lang.String var28 = var23.getStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test297");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    java.lang.String var9 = var0.getCharErrorDisplay(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mT__133();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "'d'"+ "'", var9.equals("'d'"));

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test298");


    boolean var4 = org.databene.jdbacl.DBUtil.available("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)", "left join VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) as drop sequence alter sequence hi! restart with 1 on jdbc:h2:mem:select next value for 10.select next value for 10 = drop sequence alter sequence hi! restart with 1.DROP SEQUENCE ", "CONSTRAINT \"select nextval('')\" ", "alter sequence drop generator sequence restart with 100");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test299");


    org.databene.jdbacl.dialect.DerbyDialect var0 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var2 = var0.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var3 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var4 = var3.getName();
    java.lang.String var5 = var0.formatValue((java.lang.Object)var3);
    var3.setName("'hi!'");
    org.databene.jdbacl.model.DBSchema var9 = var3.getSchema("drop sequence alter sequence hi! restart with 1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test300");


    org.databene.jdbacl.dialect.PostgreSQLDialect var0 = new org.databene.jdbacl.dialect.PostgreSQLDialect();
    boolean var3 = var0.isDefaultCatalog("", "");
    java.lang.String var5 = var0.formatValue((java.lang.Object)10);
    org.databene.jdbacl.dialect.Derby10_6Dialect var6 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var9 = var6.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    boolean var11 = var6.isDeterministicIndexName("select nextval('')");
    org.databene.jdbacl.model.DBSequence var15 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var15.setCache((java.lang.Long)100L);
    java.lang.String var18 = var15.getObjectType();
    java.lang.String var19 = var6.renderCreateSequence(var15);
    java.lang.String var20 = var15.getSchemaName();
    java.lang.String var21 = var0.renderCreateSequence(var15);
    org.databene.jdbacl.model.DBSequence var25 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    java.lang.String var26 = var25.dropDDL();
    java.math.BigInteger var27 = var25.getMinValueIfNotDefault();
    java.lang.String var28 = var0.renderCreateSequence(var25);
    org.databene.jdbacl.dialect.PostgreSQLDialect var29 = new org.databene.jdbacl.dialect.PostgreSQLDialect();
    boolean var32 = var29.isDefaultCatalog("", "");
    java.lang.String var34 = var29.formatValue((java.lang.Object)10);
    org.databene.jdbacl.dialect.Derby10_6Dialect var35 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var38 = var35.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    boolean var40 = var35.isDeterministicIndexName("select nextval('')");
    org.databene.jdbacl.model.DBSequence var44 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var44.setCache((java.lang.Long)100L);
    java.lang.String var47 = var44.getObjectType();
    java.lang.String var48 = var35.renderCreateSequence(var44);
    java.lang.String var49 = var44.getSchemaName();
    java.lang.String var50 = var29.renderCreateSequence(var44);
    java.lang.String var51 = var0.renderCreateSequence(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "10"+ "'", var5.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "sequence"+ "'", var18.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT"+ "'", var19.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi! as 10 on . = 10."+ "'", var20.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "CREATE SEQUENCE  CACHE 100"+ "'", var21.equals("CREATE SEQUENCE  CACHE 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "drop sequence "+ "'", var26.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "CREATE SEQUENCE "+ "'", var28.equals("CREATE SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "10"+ "'", var34.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "sequence"+ "'", var47.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT"+ "'", var48.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi! as 10 on . = 10."+ "'", var49.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "CREATE SEQUENCE  CACHE 100"+ "'", var50.equals("CREATE SEQUENCE  CACHE 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "CREATE SEQUENCE  CACHE 100"+ "'", var51.equals("CREATE SEQUENCE  CACHE 100"));

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test301");


    org.databene.jdbacl.model.DefaultDBTable var0 = new org.databene.jdbacl.model.DefaultDBTable();
    var0.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var3 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var4 = var3.getForeignKeyConstraints();
    var0.addReferrer((org.databene.jdbacl.model.DBTable)var3);
    org.databene.jdbacl.model.DefaultDBTable var7 = new org.databene.jdbacl.model.DefaultDBTable();
    var7.setDoc(".");
    java.util.Set var11 = var7.getUniqueConstraints(false);
    org.databene.jdbacl.model.DBDataType var14 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var15 = var14.isAlpha();
    boolean var16 = var14.isLOB();
    org.databene.jdbacl.model.DefaultDBColumn var19 = new org.databene.jdbacl.model.DefaultDBColumn("NOT drop generator sequence ~ 'hi!'", (org.databene.jdbacl.model.DBTable)var7, var14, (java.lang.Integer)100, (java.lang.Integer)(-1));
    var3.addColumn((org.databene.jdbacl.model.DBColumn)var19);
    org.databene.jdbacl.model.DBRow var21 = new org.databene.jdbacl.model.DBRow((org.databene.jdbacl.model.DBTable)var3);
    java.lang.Object[] var22 = var21.getPKValues();
    org.databene.jdbacl.model.DefaultDBTable var25 = new org.databene.jdbacl.model.DefaultDBTable();
    var25.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var28 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var29 = var28.getForeignKeyConstraints();
    var25.addReferrer((org.databene.jdbacl.model.DBTable)var28);
    java.lang.String[] var36 = new java.lang.String[] { ""};
    java.lang.String[] var40 = new java.lang.String[] { ""};
    java.lang.String var41 = org.databene.jdbacl.SQLUtil.join("", "", var36, "hi!", "10", var40);
    org.databene.jdbacl.model.DBUniqueConstraint var42 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var28, "select nextval('')", false, var36);
    var28.setDoc("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT");
    java.lang.String[] var47 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var48 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var47);
    org.databene.jdbacl.model.DBUniqueConstraint var49 = var28.getUniqueConstraint(var47);
    java.lang.String[] var56 = new java.lang.String[] { ""};
    java.lang.String[] var60 = new java.lang.String[] { ""};
    java.lang.String var61 = org.databene.jdbacl.SQLUtil.join("", "", var56, "hi!", "10", var60);
    java.lang.String var62 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var56);
    java.lang.String var63 = org.databene.jdbacl.SQLUtil.join("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT", "CREATE SEQUENCE 10", var47, "select next value for SET GENERATOR . TO -1", "select next value for SET GENERATOR . TO -1", var56);
    org.databene.jdbacl.model.DefaultDBTable var65 = new org.databene.jdbacl.model.DefaultDBTable();
    var65.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var68 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var69 = var68.getForeignKeyConstraints();
    var65.addReferrer((org.databene.jdbacl.model.DBTable)var68);
    java.lang.String[] var76 = new java.lang.String[] { ""};
    java.lang.String[] var80 = new java.lang.String[] { ""};
    java.lang.String var81 = org.databene.jdbacl.SQLUtil.join("", "", var76, "hi!", "10", var80);
    org.databene.jdbacl.model.DBUniqueConstraint var82 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var68, "select nextval('')", false, var76);
    var68.setDoc("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT");
    java.lang.String[] var87 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var88 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var87);
    org.databene.jdbacl.model.DBUniqueConstraint var89 = var68.getUniqueConstraint(var87);
    org.databene.jdbacl.identity.UniqueKeyIdentity var90 = new org.databene.jdbacl.identity.UniqueKeyIdentity("select next value for SET GENERATOR.TO - 1", var87);
    var21.setCellValues(var47, (java.lang.Object[])var87);
    java.lang.String var92 = var21.toString();
    java.lang.String var93 = var21.toString();
    java.lang.Object var95 = var21.getCellValue("'\\n'");
    java.lang.String var96 = var21.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi! as 10 on . = 10."+ "'", var41.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var48.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "hi! as 10 on . = 10."+ "'", var61.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "."+ "'", var62.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1."+ "'", var63.equals("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + "hi! as 10 on . = 10."+ "'", var81.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var88 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var88.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var92 + "' != '" + "null[DROP SEQUENCE ]"+ "'", var92.equals("null[DROP SEQUENCE ]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var93 + "' != '" + "null[DROP SEQUENCE ]"+ "'", var93.equals("null[DROP SEQUENCE ]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var96 + "' != '" + "null[DROP SEQUENCE ]"+ "'", var96.equals("null[DROP SEQUENCE ]"));

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test302");


    java.lang.String[] var4 = new java.lang.String[] { ""};
    java.lang.String[] var8 = new java.lang.String[] { ""};
    java.lang.String var9 = org.databene.jdbacl.SQLUtil.join("", "", var4, "hi!", "10", var8);
    org.databene.jdbacl.identity.IdentityProvider var10 = new org.databene.jdbacl.identity.IdentityProvider();
    org.databene.jdbacl.identity.SubNkPkQueryIdentity var11 = new org.databene.jdbacl.identity.SubNkPkQueryIdentity("null", var4, var10);
    java.lang.String var12 = var11.getDescription();
    org.databene.jdbacl.sql.ColumnExpression var15 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var18 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var19 = var18.getValue();
    org.databene.jdbacl.sql.ColumnExpression var22 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var23 = var22.getValue();
    org.databene.jdbacl.sql.BetweenExpression var24 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var15, (org.databene.script.Expression)var18, (org.databene.script.Expression)var22);
    org.databene.jdbacl.sql.ColumnExpression var27 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var30 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var31 = var30.getValue();
    org.databene.jdbacl.sql.ColumnExpression var34 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var35 = var34.getValue();
    org.databene.jdbacl.sql.BetweenExpression var36 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var27, (org.databene.script.Expression)var30, (org.databene.script.Expression)var34);
    org.databene.jdbacl.sql.ColumnExpression var39 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var42 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var43 = var42.getValue();
    org.databene.jdbacl.sql.ColumnExpression var46 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var47 = var46.getValue();
    org.databene.jdbacl.sql.BetweenExpression var48 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var39, (org.databene.script.Expression)var42, (org.databene.script.Expression)var46);
    org.databene.jdbacl.sql.BetweenExpression var49 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var22, (org.databene.script.Expression)var30, (org.databene.script.Expression)var42);
    org.databene.jdbacl.sql.ColumnExpression var52 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var55 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var56 = var55.getValue();
    org.databene.jdbacl.sql.ColumnExpression var59 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var60 = var59.getValue();
    org.databene.jdbacl.sql.BetweenExpression var61 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var52, (org.databene.script.Expression)var55, (org.databene.script.Expression)var59);
    org.databene.jdbacl.sql.ColumnExpression var64 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var67 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var68 = var67.getValue();
    org.databene.jdbacl.sql.ColumnExpression var71 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var72 = var71.getValue();
    org.databene.jdbacl.sql.BetweenExpression var73 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var64, (org.databene.script.Expression)var67, (org.databene.script.Expression)var71);
    org.databene.jdbacl.sql.ColumnExpression var76 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var79 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var80 = var79.getValue();
    org.databene.jdbacl.sql.ColumnExpression var83 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var84 = var83.getValue();
    org.databene.jdbacl.sql.BetweenExpression var85 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var76, (org.databene.script.Expression)var79, (org.databene.script.Expression)var83);
    org.databene.jdbacl.sql.BetweenExpression var86 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var59, (org.databene.script.Expression)var67, (org.databene.script.Expression)var79);
    org.databene.jdbacl.sql.ColumnExpression var89 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var90 = var89.getValue();
    org.databene.jdbacl.dialect.HSQL2Dialect var91 = new org.databene.jdbacl.dialect.HSQL2Dialect();
    java.lang.String var93 = var91.renderFetchSequenceValue("'hi!'");
    var89.setValue("'hi!'");
    org.databene.jdbacl.sql.BetweenExpression var95 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var49, (org.databene.script.Expression)var79, (org.databene.script.Expression)var89);
    org.databene.script.Expression[] var96 = var49.getTerms();
    java.lang.Object var97 = var11.extractPK((java.lang.Object[])var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi! as 10 on . = 10."+ "'", var9.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Sub identity of ():\nnull"+ "'", var12.equals("Sub identity of ():\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "sequence"+ "'", var19.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "sequence"+ "'", var23.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "sequence"+ "'", var31.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "sequence"+ "'", var35.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "sequence"+ "'", var43.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "sequence"+ "'", var47.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "sequence"+ "'", var56.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "sequence"+ "'", var60.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "sequence"+ "'", var68.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "sequence"+ "'", var72.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "sequence"+ "'", var80.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + "sequence"+ "'", var84.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var90 + "' != '" + "sequence"+ "'", var90.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var93 + "' != '" + "call next value for 'hi!'"+ "'", var93.equals("call next value for 'hi!'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test303");


    org.databene.jdbacl.JDBCDriverInfo var0 = new org.databene.jdbacl.JDBCDriverInfo();
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var7 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var7.setExcludeTables("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    boolean var10 = var0.equals((java.lang.Object)var7);
    java.lang.String var11 = var0.getDefaultPort();
    var0.setDbSystem("DROP SEQUENCE catalog RESTRICT");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test304");


    org.databene.jdbacl.model.TableContainer var4 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var5 = var4.getTables();
    org.databene.jdbacl.model.TableContainer var6 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var4);
    org.databene.jdbacl.model.DefaultDBTable var7 = new org.databene.jdbacl.model.DefaultDBTable();
    var7.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var10 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var11 = var10.getForeignKeyConstraints();
    var7.addReferrer((org.databene.jdbacl.model.DBTable)var10);
    var4.addTable((org.databene.jdbacl.model.DBTable)var10);
    java.lang.String[] var18 = new java.lang.String[] { ""};
    java.lang.String[] var22 = new java.lang.String[] { ""};
    java.lang.String var23 = org.databene.jdbacl.SQLUtil.join("", "", var18, "hi!", "10", var22);
    java.lang.String var24 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var18);
    org.databene.jdbacl.model.TableContainer var27 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var28 = var27.getTables();
    org.databene.jdbacl.model.TableContainer var29 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var27);
    org.databene.jdbacl.model.DefaultDBTable var30 = new org.databene.jdbacl.model.DefaultDBTable();
    var30.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var33 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var34 = var33.getForeignKeyConstraints();
    var30.addReferrer((org.databene.jdbacl.model.DBTable)var33);
    var27.addTable((org.databene.jdbacl.model.DBTable)var33);
    java.lang.String[] var39 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var40 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var39);
    org.databene.jdbacl.model.DBForeignKeyConstraint var41 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var10, var18, (org.databene.jdbacl.model.DBTable)var33, var39);
    java.lang.String[] var42 = var41.getRefereeColumnNames();
    java.lang.String var43 = var41.toString();
    java.lang.String var44 = var41.toString();
    org.databene.jdbacl.model.TableContainer var49 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var50 = var49.getTables();
    org.databene.jdbacl.model.TableContainer var51 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var49);
    org.databene.jdbacl.model.DefaultDBTable var52 = new org.databene.jdbacl.model.DefaultDBTable();
    var52.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var55 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var56 = var55.getForeignKeyConstraints();
    var52.addReferrer((org.databene.jdbacl.model.DBTable)var55);
    var49.addTable((org.databene.jdbacl.model.DBTable)var55);
    java.lang.String[] var63 = new java.lang.String[] { ""};
    java.lang.String[] var67 = new java.lang.String[] { ""};
    java.lang.String var68 = org.databene.jdbacl.SQLUtil.join("", "", var63, "hi!", "10", var67);
    java.lang.String var69 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var63);
    org.databene.jdbacl.model.TableContainer var72 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var73 = var72.getTables();
    org.databene.jdbacl.model.TableContainer var74 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var72);
    org.databene.jdbacl.model.DefaultDBTable var75 = new org.databene.jdbacl.model.DefaultDBTable();
    var75.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var78 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var79 = var78.getForeignKeyConstraints();
    var75.addReferrer((org.databene.jdbacl.model.DBTable)var78);
    var72.addTable((org.databene.jdbacl.model.DBTable)var78);
    java.lang.String[] var84 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var85 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var84);
    org.databene.jdbacl.model.DBForeignKeyConstraint var86 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var55, var63, (org.databene.jdbacl.model.DBTable)var78, var84);
    java.lang.String[] var87 = var86.getRefereeColumnNames();
    java.lang.String var88 = var86.toString();
    org.databene.jdbacl.model.DBTable var89 = var86.getRefereeTable();
    org.databene.jdbacl.model.FKChangeRule var90 = var86.getUpdateRule();
    var41.setDeleteRule(var90);
    java.lang.String var92 = var90.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi! as 10 on . = 10."+ "'", var23.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "."+ "'", var24.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var40.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )"+ "'", var43.equals("CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )"+ "'", var44.equals("CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "hi! as 10 on . = 10."+ "'", var68.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "."+ "'", var69.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var85.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var88 + "' != '" + "CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )"+ "'", var88.equals("CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var92 + "' != '" + "NO_ACTION"+ "'", var92.equals("NO_ACTION"));

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test305");


    org.databene.jdbacl.model.DefaultDBTable var0 = new org.databene.jdbacl.model.DefaultDBTable();
    var0.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var3 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var4 = var3.getForeignKeyConstraints();
    var0.addReferrer((org.databene.jdbacl.model.DBTable)var3);
    java.lang.String[] var11 = new java.lang.String[] { ""};
    java.lang.String[] var15 = new java.lang.String[] { ""};
    java.lang.String var16 = org.databene.jdbacl.SQLUtil.join("", "", var11, "hi!", "10", var15);
    org.databene.jdbacl.model.DBUniqueConstraint var17 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var3, "select nextval('')", false, var11);
    java.lang.String var18 = var17.toString();
    boolean var19 = var17.isNameDeterministic();
    var17.setDoc("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT");
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var30 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.", "select next value for SET GENERATOR . TO -1", "DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.", "jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", "10", "hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", "select next value for SET GENERATOR . TO -1", false);
    var30.setSchemaName("alter sequence hi! restart with 1");
    boolean var33 = var17.equals((java.lang.Object)var30);
    org.databene.jdbacl.model.cache.CachingDBImporter var35 = new org.databene.jdbacl.model.cache.CachingDBImporter((org.databene.jdbacl.model.DBMetaDataImporter)var30, "CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.Database var36 = var35.importDatabase();
      fail("Expected exception of type org.databene.commons.ConnectFailedException");
    } catch (org.databene.commons.ConnectFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi! as 10 on . = 10."+ "'", var16.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "CONSTRAINT \"select nextval('')\" UNIQUE ()"+ "'", var18.equals("CONSTRAINT \"select nextval('')\" UNIQUE ()"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test306");


    org.databene.jdbacl.dialect.MySQLDialect var0 = new org.databene.jdbacl.dialect.MySQLDialect();
    boolean var2 = var0.isDeterministicFKName("NaturalPkIdentity(hi!)");
    boolean var5 = var0.isDefaultCatalog("alter sequence call next value for 'hi!' restart with 100", "jdbc:hsqldb:mem:jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test307");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.DBUtil.checkReadOnly("EQUEN", true);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test308");


    org.databene.jdbacl.model.TableContainer var6 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var7 = var6.getTables();
    org.databene.jdbacl.model.TableContainer var8 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var6);
    org.databene.jdbacl.model.DefaultDBTable var9 = new org.databene.jdbacl.model.DefaultDBTable();
    var9.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var12 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var13 = var12.getForeignKeyConstraints();
    var9.addReferrer((org.databene.jdbacl.model.DBTable)var12);
    var6.addTable((org.databene.jdbacl.model.DBTable)var12);
    java.lang.String[] var20 = new java.lang.String[] { ""};
    java.lang.String[] var24 = new java.lang.String[] { ""};
    java.lang.String var25 = org.databene.jdbacl.SQLUtil.join("", "", var20, "hi!", "10", var24);
    java.lang.String var26 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var20);
    org.databene.jdbacl.model.TableContainer var29 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var30 = var29.getTables();
    org.databene.jdbacl.model.TableContainer var31 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var29);
    org.databene.jdbacl.model.DefaultDBTable var32 = new org.databene.jdbacl.model.DefaultDBTable();
    var32.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var35 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var36 = var35.getForeignKeyConstraints();
    var32.addReferrer((org.databene.jdbacl.model.DBTable)var35);
    var29.addTable((org.databene.jdbacl.model.DBTable)var35);
    java.lang.String[] var41 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var42 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var41);
    org.databene.jdbacl.model.DBForeignKeyConstraint var43 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var12, var20, (org.databene.jdbacl.model.DBTable)var35, var41);
    org.databene.jdbacl.model.DefaultDBTable var45 = new org.databene.jdbacl.model.DefaultDBTable();
    var45.setDoc(".");
    java.util.Set var49 = var45.getUniqueConstraints(false);
    org.databene.jdbacl.model.DBDataType var52 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var53 = var52.isAlpha();
    boolean var54 = var52.isLOB();
    org.databene.jdbacl.model.DefaultDBColumn var57 = new org.databene.jdbacl.model.DefaultDBColumn("NOT drop generator sequence ~ 'hi!'", (org.databene.jdbacl.model.DBTable)var45, var52, (java.lang.Integer)100, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DefaultDBColumn var59 = new org.databene.jdbacl.model.DefaultDBColumn("CONSTRAINT \"select nextval('')\" ", (org.databene.jdbacl.model.DBTable)var12, var52, (java.lang.Integer)10);
    org.databene.jdbacl.model.DBTreeModel var60 = new org.databene.jdbacl.model.DBTreeModel((org.databene.jdbacl.model.CompositeDBObject)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.DefaultDBColumn var63 = new org.databene.jdbacl.model.DefaultDBColumn("drop generator sequence", (org.databene.jdbacl.model.DBTable)var12, 3, "NaturalPkIdentity(hi!)");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi! as 10 on . = 10."+ "'", var25.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "."+ "'", var26.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var42.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test309");


    org.databene.jdbacl.model.DefaultDBTable var1 = new org.databene.jdbacl.model.DefaultDBTable();
    var1.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var4 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var5 = var4.getForeignKeyConstraints();
    var1.addReferrer((org.databene.jdbacl.model.DBTable)var4);
    org.databene.jdbacl.model.DBDataType var9 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var10 = var9.isAlpha();
    java.lang.String var11 = var9.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var12 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var15 = var12.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var17 = var12.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var18 = var9.equals((java.lang.Object)var17);
    org.databene.jdbacl.model.DefaultDBColumn var21 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var4, var9, (java.lang.Integer)0, (java.lang.Integer)(-1));
    org.databene.jdbacl.dialect.DerbyDialect var22 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var24 = var22.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var25 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var26 = var25.getName();
    java.lang.String var27 = var22.formatValue((java.lang.Object)var25);
    var25.setName("'hi!'");
    java.util.List var30 = var25.getSchemas();
    boolean var31 = var21.isEquivalent((org.databene.jdbacl.model.DBObject)var25);
    java.lang.String var32 = var21.getDefaultValue();
    java.util.List var33 = var21.getUkConstraints();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "DROP SEQUENCE "+ "'", var11.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var17.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test310");


    org.databene.jdbacl.dialect.DerbyDialect var5 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var7 = var5.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var8 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var9 = var8.getName();
    java.lang.String var10 = var5.formatValue((java.lang.Object)var8);
    var8.setName("'hi!'");
    java.util.List var13 = var8.getSchemas();
    org.databene.jdbacl.model.DBSchema var14 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var8);
    org.databene.jdbacl.model.DBTrigger var15 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var14);
    java.util.List var16 = var14.getPackages();
    org.databene.jdbacl.model.DBPackage var17 = new org.databene.jdbacl.model.DBPackage("CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).", var14);
    java.util.List var18 = var17.getComponents();
    org.databene.jdbacl.model.DBProcedure var19 = new org.databene.jdbacl.model.DBProcedure("CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var17);
    java.lang.String var20 = var19.getSubProgramId();
    org.databene.jdbacl.model.DefaultDBTable var22 = new org.databene.jdbacl.model.DefaultDBTable();
    var22.setDoc(".");
    java.util.Set var26 = var22.getUniqueConstraints(false);
    org.databene.jdbacl.model.DBDataType var29 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var30 = var29.isAlpha();
    boolean var31 = var29.isLOB();
    org.databene.jdbacl.model.DefaultDBColumn var34 = new org.databene.jdbacl.model.DefaultDBColumn("NOT drop generator sequence ~ 'hi!'", (org.databene.jdbacl.model.DBTable)var22, var29, (java.lang.Integer)100, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.TableContainer var37 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var38 = var37.getTables();
    org.databene.jdbacl.model.TableContainer var39 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var37);
    org.databene.jdbacl.model.DefaultDBTable var40 = new org.databene.jdbacl.model.DefaultDBTable();
    var40.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var43 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var44 = var43.getForeignKeyConstraints();
    var40.addReferrer((org.databene.jdbacl.model.DBTable)var43);
    var37.addTable((org.databene.jdbacl.model.DBTable)var43);
    var34.setTable((org.databene.jdbacl.model.DBTable)var43);
    boolean var48 = var19.isIdentical((org.databene.jdbacl.model.DBObject)var43);
    org.databene.jdbacl.model.DefaultDBTable var50 = new org.databene.jdbacl.model.DefaultDBTable();
    var50.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var53 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var54 = var53.getForeignKeyConstraints();
    var50.addReferrer((org.databene.jdbacl.model.DBTable)var53);
    org.databene.jdbacl.model.DBDataType var58 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var59 = var58.isAlpha();
    java.lang.String var60 = var58.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var61 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var64 = var61.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var66 = var61.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var67 = var58.equals((java.lang.Object)var66);
    org.databene.jdbacl.model.DefaultDBColumn var70 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var53, var58, (java.lang.Integer)0, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DBDataType var73 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var74 = var73.isTemporal();
    boolean var75 = var58.equals((java.lang.Object)var73);
    org.databene.jdbacl.model.DefaultDBColumn var76 = new org.databene.jdbacl.model.DefaultDBColumn("SELECT NEXT VALUE FOR SET GENERATOR.TO - 1 NOT REGEXP 'HI!'", (org.databene.jdbacl.model.DBTable)var43, var73);
    var76.setDoc("NOT REGEXP_MATCHES(sequence, '')");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "DROP SEQUENCE "+ "'", var60.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var66.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test311");


    org.databene.jdbacl.dialect.DerbyDialect var2 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var4 = var2.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var5 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var6 = var5.getName();
    java.lang.String var7 = var2.formatValue((java.lang.Object)var5);
    var5.setName("'hi!'");
    java.util.List var10 = var5.getSchemas();
    org.databene.jdbacl.model.DBSchema var11 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var5);
    org.databene.jdbacl.model.DBTrigger var12 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var11);
    var12.setDescription("CREATE GENERATOR drop sequence ");
    java.lang.String var15 = var12.getTriggerBody();
    java.lang.String var16 = var12.getTriggerBody();
    var12.setReferencingNames("NOT REGEXP_MATCHES(sequence, '')");
    var12.setReferencingNames("-1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test312");


    boolean var1 = org.databene.jdbacl.SQLUtil.isQuery("alter sequence CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT restart with 1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test313");


    org.databene.jdbacl.model.jdbc.JDBCDBImporter var6 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var6.setExcludeTables("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    var6.setImportingUKs(false);
    var6.close();
    var6.setFaultTolerant(true);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test314");


    org.databene.jdbacl.model.DBSequence var3 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var3.setName("10");
    java.lang.String var6 = var3.getObjectType();
    java.math.BigInteger var7 = var3.getStartIfNotDefault();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "sequence"+ "'", var6.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test315");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var1 = org.databene.jdbacl.SQLUtil.parseColumnTypeAndSize("Identity definition by NK-PK query: VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) = \"sequence\"");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test316");


    org.databene.jdbacl.model.TableContainer var4 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var5 = var4.getTables();
    org.databene.jdbacl.model.TableContainer var6 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var4);
    org.databene.jdbacl.model.DefaultDBTable var7 = new org.databene.jdbacl.model.DefaultDBTable();
    var7.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var10 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var11 = var10.getForeignKeyConstraints();
    var7.addReferrer((org.databene.jdbacl.model.DBTable)var10);
    var4.addTable((org.databene.jdbacl.model.DBTable)var10);
    java.lang.String[] var18 = new java.lang.String[] { ""};
    java.lang.String[] var22 = new java.lang.String[] { ""};
    java.lang.String var23 = org.databene.jdbacl.SQLUtil.join("", "", var18, "hi!", "10", var22);
    java.lang.String var24 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var18);
    org.databene.jdbacl.model.TableContainer var27 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var28 = var27.getTables();
    org.databene.jdbacl.model.TableContainer var29 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var27);
    org.databene.jdbacl.model.DefaultDBTable var30 = new org.databene.jdbacl.model.DefaultDBTable();
    var30.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var33 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var34 = var33.getForeignKeyConstraints();
    var30.addReferrer((org.databene.jdbacl.model.DBTable)var33);
    var27.addTable((org.databene.jdbacl.model.DBTable)var33);
    java.lang.String[] var39 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var40 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var39);
    org.databene.jdbacl.model.DBForeignKeyConstraint var41 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var10, var18, (org.databene.jdbacl.model.DBTable)var33, var39);
    java.lang.String[] var42 = var41.getRefereeColumnNames();
    org.databene.jdbacl.sql.ColumnExpression var45 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var48 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var49 = var48.getValue();
    org.databene.jdbacl.sql.ColumnExpression var52 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var53 = var52.getValue();
    org.databene.jdbacl.sql.BetweenExpression var54 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var45, (org.databene.script.Expression)var48, (org.databene.script.Expression)var52);
    java.lang.Object var55 = var45.getValue();
    org.databene.jdbacl.sql.ColumnExpression var58 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var59 = var58.getValue();
    org.databene.jdbacl.dialect.HSQL2Dialect var60 = new org.databene.jdbacl.dialect.HSQL2Dialect();
    java.lang.String var62 = var60.renderFetchSequenceValue("'hi!'");
    var58.setValue("'hi!'");
    boolean var64 = var58.isConstant();
    org.databene.jdbacl.sql.ColumnExpression var67 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    boolean var68 = var67.isConstant();
    java.lang.Object var69 = var67.getValue();
    org.databene.jdbacl.sql.BetweenExpression var70 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var45, (org.databene.script.Expression)var58, (org.databene.script.Expression)var67);
    org.databene.script.Expression[] var71 = var70.getSourceExpressions();
    boolean var72 = var41.equals((java.lang.Object)var71);
    org.databene.jdbacl.model.DBTable var73 = var41.getTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi! as 10 on . = 10."+ "'", var23.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "."+ "'", var24.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var40.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "sequence"+ "'", var49.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "sequence"+ "'", var53.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "sequence"+ "'", var55.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "sequence"+ "'", var59.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "call next value for 'hi!'"+ "'", var62.equals("call next value for 'hi!'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "sequence"+ "'", var69.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test317");


    org.databene.jdbacl.JDBCDriverInfo var0 = new org.databene.jdbacl.JDBCDriverInfo();
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var7 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var7.setExcludeTables("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    boolean var10 = var0.equals((java.lang.Object)var7);
    var0.setDefaultSchema("org.firebirdsql.jdbc.FBDriver");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test318");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.JDBCConnectData var1 = org.databene.jdbacl.JDBCConnectData.parseSingleDbProperties("CREATE GENERATOR jdbc:h2:mem:hi! as 10 on . = 10.");
      fail("Expected exception of type org.databene.commons.ConfigurationError");
    } catch (org.databene.commons.ConfigurationError e) {
      // Expected exception.
    }

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test319");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mNULL();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test320");


    javax.swing.JFrame.setDefaultLookAndFeelDecorated(false);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test321");


    org.databene.jdbacl.JDBCConnectData var4 = new org.databene.jdbacl.JDBCConnectData("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).DROP SEQUENCE ", "catalog", "select nextval('alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP 'alter sequence hi! restart with 1'')", "hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT");
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var5 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.sql.Connection var6 = var5.getConnection();
      fail("Expected exception of type org.databene.commons.ConnectFailedException");
    } catch (org.databene.commons.ConnectFailedException e) {
      // Expected exception.
    }

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test322");


    org.databene.jdbacl.version.QueryVersionProvider var1 = new org.databene.jdbacl.version.QueryVersionProvider("NOT drop generator sequence ~ 'hi!'");
    var1.setQuery("select nextval('')");
    var1.setQuery("alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0");

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test323");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var2 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var2.release((-1));
    boolean var6 = var0.mismatchIsUnwantedToken((org.antlr.runtime.IntStream)var2, 0);
    int var7 = var0.getRuleMemoizationCacheSize();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var9 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var0.consumeUntil((org.antlr.runtime.IntStream)var9, 100);
    org.databene.jdbacl.dialect.DerbyDialect var14 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var16 = var14.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var17 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var18 = var17.getName();
    java.lang.String var19 = var14.formatValue((java.lang.Object)var17);
    var17.setName("'hi!'");
    java.util.List var22 = var17.getSchemas();
    var0.traceOut("SET GENERATOR alter sequence CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT restart with 1 TO -2", 0, (java.lang.Object)var22);
    var0.mCOLUMN_SPEC();
    var0.setText("call next value for select nextval('alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP 'alter sequence hi! restart with 1'')");
    org.databene.jdbacl.DBExecutionResult var28 = new org.databene.jdbacl.DBExecutionResult((java.lang.Object)"call next value for select nextval('alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP 'alter sequence hi! restart with 1'')", (java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test324");


    java.lang.String var1 = org.databene.jdbacl.dialect.H2Util.getInMemoryURL("CONSTRAINT \"CREATE GENERATOR drop sequence \" ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "jdbc:h2:mem:CONSTRAINT \"CREATE GENERATOR drop sequence \" "+ "'", var1.equals("jdbc:h2:mem:CONSTRAINT \"CREATE GENERATOR drop sequence \" "));

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test325");


    org.databene.jdbacl.version.QueryVersionProvider var1 = new org.databene.jdbacl.version.QueryVersionProvider("CREATE GENERATOR jdbc:h2:mem:hi! as 10 on . = 10.");

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test326");


    org.databene.jdbacl.model.DefaultDBTable var1 = new org.databene.jdbacl.model.DefaultDBTable();
    var1.setDoc(".");
    java.util.Set var5 = var1.getUniqueConstraints(false);
    org.databene.jdbacl.model.DBDataType var8 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var9 = var8.isAlpha();
    boolean var10 = var8.isLOB();
    org.databene.jdbacl.model.DefaultDBColumn var13 = new org.databene.jdbacl.model.DefaultDBColumn("NOT drop generator sequence ~ 'hi!'", (org.databene.jdbacl.model.DBTable)var1, var8, (java.lang.Integer)100, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.TableContainer var16 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var17 = var16.getTables();
    org.databene.jdbacl.model.TableContainer var18 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var16);
    org.databene.jdbacl.model.DefaultDBTable var19 = new org.databene.jdbacl.model.DefaultDBTable();
    var19.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var22 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var23 = var22.getForeignKeyConstraints();
    var19.addReferrer((org.databene.jdbacl.model.DBTable)var22);
    var16.addTable((org.databene.jdbacl.model.DBTable)var22);
    var13.setTable((org.databene.jdbacl.model.DBTable)var22);
    java.util.Collection var27 = var22.getReferrers();
    java.util.List var28 = var22.getColumns();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test327");


    org.databene.jdbacl.JDBCConnectData var6 = new org.databene.jdbacl.JDBCConnectData("select nextval('')", "alter sequence CREATE GENERATOR drop sequence  restart with 10", "jdbc:hsqldb:mem:jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", "CREATE GENERATOR DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.", "CREATE GENERATOR drop sequence ", "select alter sequence drop sequence 10 restart with 0.nextval from dual");

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test328");


    org.databene.jdbacl.model.DBCatalog var0 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var1 = var0.getName();
    org.databene.jdbacl.model.Database var2 = var0.getDatabase();
    org.databene.jdbacl.model.DBSequence var6 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    java.lang.String var7 = var6.dropDDL();
    java.math.BigInteger var8 = var6.getMinValueIfNotDefault();
    boolean var9 = var0.isIdentical((org.databene.jdbacl.model.DBObject)var6);
    org.databene.jdbacl.model.DBTreeModel var10 = new org.databene.jdbacl.model.DBTreeModel((org.databene.jdbacl.model.CompositeDBObject)var0);
    org.databene.jdbacl.model.DefaultDBTable var13 = new org.databene.jdbacl.model.DefaultDBTable();
    var13.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var16 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var17 = var16.getForeignKeyConstraints();
    var13.addReferrer((org.databene.jdbacl.model.DBTable)var16);
    java.lang.String[] var24 = new java.lang.String[] { ""};
    java.lang.String[] var28 = new java.lang.String[] { ""};
    java.lang.String var29 = org.databene.jdbacl.SQLUtil.join("", "", var24, "hi!", "10", var28);
    org.databene.jdbacl.model.DBUniqueConstraint var30 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var16, "select nextval('')", false, var24);
    java.lang.String var31 = var30.toString();
    boolean var32 = var30.isNameDeterministic();
    org.databene.jdbacl.model.DBUniqueIndex var33 = new org.databene.jdbacl.model.DBUniqueIndex("select next value for SET GENERATOR . TO -1", false, var30);
    java.lang.String var34 = var30.toString();
    boolean var35 = var10.isLeaf((org.databene.jdbacl.model.DBObject)var30);
    org.databene.jdbacl.model.DBSequence var39 = new org.databene.jdbacl.model.DBSequence("call next value for 'hi!'", "NOT REGEXP_MATCHES(sequence, '')", "'hi!'");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var40 = var10.getChildCount((org.databene.jdbacl.model.DBObject)var39);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "drop sequence "+ "'", var7.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi! as 10 on . = 10."+ "'", var29.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "CONSTRAINT \"select nextval('')\" UNIQUE ()"+ "'", var31.equals("CONSTRAINT \"select nextval('')\" UNIQUE ()"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "CONSTRAINT \"select nextval('')\" UNIQUE ()"+ "'", var34.equals("CONSTRAINT \"select nextval('')\" UNIQUE ()"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test329");


    org.databene.jdbacl.dialect.OracleDialect var0 = new org.databene.jdbacl.dialect.OracleDialect();
    java.lang.String var4 = var0.regexQuery("drop sequence alter sequence hi! restart with 1", true, "CREATE GENERATOR DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.");
    boolean var6 = var0.isDeterministicUKName("hi! as 10 on . = 10.");
    boolean var9 = var0.isDefaultSchema("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE ", "alter sequence CREATE SEQUENCE DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1. restart with 1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "NOT REGEXP_LIKE(drop sequence alter sequence hi! restart with 1, 'CREATE GENERATOR DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.')"+ "'", var4.equals("NOT REGEXP_LIKE(drop sequence alter sequence hi! restart with 1, 'CREATE GENERATOR DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.')"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test330");


    org.databene.jdbacl.dialect.DerbyDialect var0 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var2 = var0.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var3 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var4 = var3.getName();
    java.lang.String var5 = var0.formatValue((java.lang.Object)var3);
    var3.setName("'hi!'");
    java.lang.String var8 = var3.getDoc();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test331");


    org.databene.jdbacl.model.jdbc.JDBCDBImporter var6 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var6.setImportingPackages(false);
    org.databene.jdbacl.model.cache.CachingDBImporter var10 = new org.databene.jdbacl.model.cache.CachingDBImporter((org.databene.jdbacl.model.DBMetaDataImporter)var6, "hi! as 10 on . = 10.");
    var6.setImportingTriggers(true);
    var6.setIncludeTables("SET GENERATOR . TO -1");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.sql.Connection var15 = var6.getConnection();
      fail("Expected exception of type org.databene.commons.ConnectFailedException");
    } catch (org.databene.commons.ConnectFailedException e) {
      // Expected exception.
    }

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test332");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.skip();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var3 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var5 = var3.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mT__65();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 69);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test333");


    boolean var1 = org.databene.jdbacl.SQLUtil.isDML("NaturalPkIdentity(hi!)");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test334");


    org.databene.jdbacl.model.DBCatalog var1 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var2 = var1.getName();
    org.databene.jdbacl.model.Database var3 = var1.getDatabase();
    java.lang.String var4 = var1.getDoc();
    org.databene.jdbacl.dialect.DerbyDialect var6 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var8 = var6.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var9 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var10 = var9.getName();
    java.lang.String var11 = var6.formatValue((java.lang.Object)var9);
    var9.setName("'hi!'");
    java.util.List var14 = var9.getSchemas();
    org.databene.jdbacl.model.DBSchema var15 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var9);
    var1.removeSchema(var15);
    org.databene.jdbacl.dialect.DerbyDialect var19 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var21 = var19.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var22 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var23 = var22.getName();
    java.lang.String var24 = var19.formatValue((java.lang.Object)var22);
    var22.setName("'hi!'");
    java.util.List var27 = var22.getSchemas();
    org.databene.jdbacl.model.DBSchema var28 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var22);
    org.databene.jdbacl.model.DBTrigger var29 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var28);
    var29.setDescription("CREATE GENERATOR drop sequence ");
    java.lang.String var32 = var29.getTriggerBody();
    java.lang.String var33 = var29.getColumnName();
    java.lang.String var34 = var29.getWhenClause();
    var15.addTrigger(var29);
    org.databene.jdbacl.model.DBTrigger var36 = new org.databene.jdbacl.model.DBTrigger("-1", var15);
    var36.setBaseObjectType("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT");
    var36.setStatus("null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test335");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.skip();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var3 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var5 = var3.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var3);
    org.databene.jdbacl.sql.parser.SQLLexer var7 = new org.databene.jdbacl.sql.parser.SQLLexer();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var9 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var9.release((-1));
    boolean var13 = var7.mismatchIsUnwantedToken((org.antlr.runtime.IntStream)var9, 0);
    var0.setCharStream((org.antlr.runtime.CharStream)var9);
    org.databene.jdbacl.dialect.H2Dialect var15 = new org.databene.jdbacl.dialect.H2Dialect();
    java.lang.String var17 = var15.renderFetchSequenceValue("10");
    java.lang.String var20 = var15.setSequenceValue("CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", 1L);
    boolean var22 = var15.isDeterministicIndexName("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT");
    boolean var24 = var15.isDeterministicFKName("drop generator CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE ");
    java.lang.String var28 = var15.regexQuery("drop sequence jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", true, "CONSTRAINT \"select nextval('')\" ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var29 = org.databene.jdbacl.sql.SQLParserUtil.parse((org.antlr.runtime.CharStream)var9, (org.databene.jdbacl.DatabaseDialect)var15);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "select next value for 10"+ "'", var17.equals("select next value for 10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "alter sequence CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT restart with 1"+ "'", var20.equals("alter sequence CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT restart with 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "drop sequence jdbc:h2:mem:hi! as 10 on . = 10.-identity-. NOT REGEXP 'CONSTRAINT \"select nextval('')\" '"+ "'", var28.equals("drop sequence jdbc:h2:mem:hi! as 10 on . = 10.-identity-. NOT REGEXP 'CONSTRAINT \"select nextval('')\" '"));

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test336");


    org.databene.jdbacl.model.DefaultDBTable var1 = new org.databene.jdbacl.model.DefaultDBTable();
    var1.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var4 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var5 = var4.getForeignKeyConstraints();
    var1.addReferrer((org.databene.jdbacl.model.DBTable)var4);
    org.databene.jdbacl.model.DBDataType var9 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var10 = var9.isAlpha();
    java.lang.String var11 = var9.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var12 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var15 = var12.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var17 = var12.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var18 = var9.equals((java.lang.Object)var17);
    org.databene.jdbacl.model.DefaultDBColumn var21 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var4, var9, (java.lang.Integer)0, (java.lang.Integer)(-1));
    boolean var22 = var21.isUnique();
    var21.setDefaultValue("hi! identity by primary key");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "DROP SEQUENCE "+ "'", var11.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var17.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test337");


    org.databene.jdbacl.model.DBCatalog var1 = new org.databene.jdbacl.model.DBCatalog("drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.removeTable("select next value for select next value for SET GENERATOR.TO - 1 NOT REGEXP 'hi!'");
      fail("Expected exception of type org.databene.commons.ObjectNotFoundException");
    } catch (org.databene.commons.ObjectNotFoundException e) {
      // Expected exception.
    }

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test338");


    org.databene.jdbacl.model.TableContainer var2 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var3 = var2.getTables();
    org.databene.jdbacl.model.TableContainer var4 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var2);
    org.databene.jdbacl.dialect.DerbyDialect var6 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var8 = var6.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var9 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var10 = var9.getName();
    java.lang.String var11 = var6.formatValue((java.lang.Object)var9);
    var9.setName("'hi!'");
    java.util.List var14 = var9.getSchemas();
    java.util.List var15 = var4.getTables(false, var14);
    org.databene.jdbacl.model.DBCatalog var18 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var19 = var18.getName();
    org.databene.jdbacl.model.Database var20 = var18.getDatabase();
    java.lang.String var21 = var18.getDoc();
    org.databene.jdbacl.dialect.DerbyDialect var23 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var25 = var23.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var26 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var27 = var26.getName();
    java.lang.String var28 = var23.formatValue((java.lang.Object)var26);
    var26.setName("'hi!'");
    java.util.List var31 = var26.getSchemas();
    org.databene.jdbacl.model.DBSchema var32 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var26);
    var18.removeSchema(var32);
    org.databene.jdbacl.dialect.DerbyDialect var36 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var38 = var36.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var39 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var40 = var39.getName();
    java.lang.String var41 = var36.formatValue((java.lang.Object)var39);
    var39.setName("'hi!'");
    java.util.List var44 = var39.getSchemas();
    org.databene.jdbacl.model.DBSchema var45 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var39);
    org.databene.jdbacl.model.DBTrigger var46 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var45);
    var46.setDescription("CREATE GENERATOR drop sequence ");
    java.lang.String var49 = var46.getTriggerBody();
    java.lang.String var50 = var46.getColumnName();
    java.lang.String var51 = var46.getWhenClause();
    var32.addTrigger(var46);
    org.databene.jdbacl.model.DBTrigger var53 = new org.databene.jdbacl.model.DBTrigger("-1", var32);
    java.util.List var55 = var32.getSequences(true);
    java.util.List var56 = var4.getSequences(true, var55);
    java.util.List var58 = var4.getSequences(true);
    org.databene.jdbacl.model.DefaultDBTable var59 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var60 = var59.getForeignKeyConstraints();
    var59.setDoc("drop sequence ");
    var59.setDoc("catalog");
    var4.removeTable((org.databene.jdbacl.model.DBTable)var59);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var67 = var59.requiresProvider(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test339");


    org.databene.jdbacl.model.DefaultDBTable var0 = new org.databene.jdbacl.model.DefaultDBTable();
    var0.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var3 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var4 = var3.getForeignKeyConstraints();
    var0.addReferrer((org.databene.jdbacl.model.DBTable)var3);
    java.lang.String[] var11 = new java.lang.String[] { ""};
    java.lang.String[] var15 = new java.lang.String[] { ""};
    java.lang.String var16 = org.databene.jdbacl.SQLUtil.join("", "", var11, "hi!", "10", var15);
    org.databene.jdbacl.model.DBUniqueConstraint var17 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var3, "select nextval('')", false, var11);
    java.lang.String[] var23 = new java.lang.String[] { ""};
    java.lang.String[] var27 = new java.lang.String[] { ""};
    java.lang.String var28 = org.databene.jdbacl.SQLUtil.join("", "", var23, "hi!", "10", var27);
    java.lang.String var29 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var23);
    java.lang.String[] var36 = new java.lang.String[] { ""};
    java.lang.String[] var40 = new java.lang.String[] { ""};
    java.lang.String var41 = org.databene.jdbacl.SQLUtil.join("", "", var36, "hi!", "10", var40);
    java.lang.String var42 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var40);
    java.lang.String var43 = org.databene.jdbacl.SQLUtil.leftJoin("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE ", var23, "jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1)", "drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)", var40);
    org.databene.jdbacl.identity.NaturalPkIdentity var45 = new org.databene.jdbacl.identity.NaturalPkIdentity("hi!");
    java.lang.String var46 = var45.getName();
    boolean var48 = var45.equals((java.lang.Object)(-1.0d));
    org.databene.jdbacl.model.DefaultDBTable var49 = new org.databene.jdbacl.model.DefaultDBTable();
    var49.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var52 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var53 = var52.getForeignKeyConstraints();
    var49.addReferrer((org.databene.jdbacl.model.DBTable)var52);
    java.lang.String[] var60 = new java.lang.String[] { ""};
    java.lang.String[] var64 = new java.lang.String[] { ""};
    java.lang.String var65 = org.databene.jdbacl.SQLUtil.join("", "", var60, "hi!", "10", var64);
    org.databene.jdbacl.model.DBUniqueConstraint var66 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var52, "select nextval('')", false, var60);
    java.lang.String var67 = var45.extractNK((java.lang.Object[])var60);
    java.lang.String var68 = org.databene.jdbacl.SQLUtil.renderQuery((org.databene.jdbacl.model.DBTable)var3, var23, (java.lang.Object[])var60);
    java.lang.String[] var74 = new java.lang.String[] { ""};
    java.lang.String[] var78 = new java.lang.String[] { ""};
    java.lang.String var79 = org.databene.jdbacl.SQLUtil.join("", "", var74, "hi!", "10", var78);
    org.databene.jdbacl.model.DBPrimaryKeyConstraint var80 = new org.databene.jdbacl.model.DBPrimaryKeyConstraint((org.databene.jdbacl.model.DBTable)var3, "jdbc:h2:mem:select next value for 10", false, var78);
    java.lang.String[] var87 = new java.lang.String[] { ""};
    java.lang.String[] var91 = new java.lang.String[] { ""};
    java.lang.String var92 = org.databene.jdbacl.SQLUtil.join("", "", var87, "hi!", "10", var91);
    org.databene.jdbacl.identity.IdentityProvider var93 = new org.databene.jdbacl.identity.IdentityProvider();
    org.databene.jdbacl.identity.SubNkPkQueryIdentity var94 = new org.databene.jdbacl.identity.SubNkPkQueryIdentity("null", var87, var93);
    org.databene.jdbacl.model.DBUniqueConstraint var95 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var3, "hi!", true, var87);
    java.lang.String var96 = var95.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi! as 10 on . = 10."+ "'", var16.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi! as 10 on . = 10."+ "'", var28.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "."+ "'", var29.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi! as 10 on . = 10."+ "'", var41.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "."+ "'", var42.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)."+ "'", var43.equals("left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!"+ "'", var46.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "hi! as 10 on . = 10."+ "'", var65.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + ""+ "'", var67.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "SELECT * FROM null WHERE  = ''"+ "'", var68.equals("SELECT * FROM null WHERE  = ''"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + "hi! as 10 on . = 10."+ "'", var79.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var92 + "' != '" + "hi! as 10 on . = 10."+ "'", var92.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var96 + "' != '" + "CONSTRAINT hi! UNIQUE ()"+ "'", var96.equals("CONSTRAINT hi! UNIQUE ()"));

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test340");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.DBUtil.checkReadOnly("drop sequence jdbc:h2:mem:hi! as 10 on . = 10.-identity-. NOT REGEXP 'CONSTRAINT \"select nextval('')\" '", true);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test341");


    boolean var1 = org.databene.jdbacl.SQLUtil.isProcedureCall("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test342");


    org.databene.jdbacl.identity.NaturalPkIdentity var1 = new org.databene.jdbacl.identity.NaturalPkIdentity("hi!");
    java.lang.String var2 = var1.getName();
    boolean var4 = var1.equals((java.lang.Object)(-1.0d));
    org.databene.jdbacl.model.DefaultDBTable var5 = new org.databene.jdbacl.model.DefaultDBTable();
    var5.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var8 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var9 = var8.getForeignKeyConstraints();
    var5.addReferrer((org.databene.jdbacl.model.DBTable)var8);
    java.lang.String[] var16 = new java.lang.String[] { ""};
    java.lang.String[] var20 = new java.lang.String[] { ""};
    java.lang.String var21 = org.databene.jdbacl.SQLUtil.join("", "", var16, "hi!", "10", var20);
    org.databene.jdbacl.model.DBUniqueConstraint var22 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var8, "select nextval('')", false, var16);
    java.lang.String var23 = var1.extractNK((java.lang.Object[])var16);
    java.lang.String var24 = var1.getName();
    java.lang.String var25 = var1.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi! as 10 on . = 10."+ "'", var21.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi! identity by primary key"+ "'", var25.equals("hi! identity by primary key"));

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test343");


    org.databene.jdbacl.JDBCDriverInfo var1 = org.databene.jdbacl.JDBCDriverInfo.getInstance("jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test344");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.skip();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var3 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var5 = var3.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mT__133();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 69);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test345");


    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var1 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var1.setCharPositionInLine(1);
    int var4 = var1.getCharPositionInLine();
    var1.setCharPositionInLine(69);
    int var8 = var1.LT(3);
    int var9 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 14);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test346");


    org.databene.jdbacl.dialect.FirebirdDialect var0 = new org.databene.jdbacl.dialect.FirebirdDialect();
    java.lang.String var3 = var0.renderSetSequenceValue(".", 0L);
    boolean var6 = var0.isDefaultCatalog("drop generator sequence", "alter sequence hi! restart with 1");
    boolean var9 = var0.isDefaultCatalog("drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)", "jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1)");
    boolean var11 = var0.isDeterministicPKName("jdbc:h2:mem:select next value for 10");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "SET GENERATOR . TO -1"+ "'", var3.equals("SET GENERATOR . TO -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test347");


    org.databene.jdbacl.model.DBSequence var3 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var3.setName("10");
    java.lang.String var6 = var3.getObjectType();
    java.math.BigInteger var7 = var3.getIncrementIfNotDefault();
    var3.setCycle((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "sequence"+ "'", var6.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test348");


    org.databene.jdbacl.model.TableContainer var2 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var3 = var2.getTables();
    org.databene.jdbacl.model.TableContainer var4 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var2);
    org.databene.jdbacl.model.DefaultDBTable var5 = new org.databene.jdbacl.model.DefaultDBTable();
    var5.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var8 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var9 = var8.getForeignKeyConstraints();
    var5.addReferrer((org.databene.jdbacl.model.DBTable)var8);
    java.lang.String[] var16 = new java.lang.String[] { ""};
    java.lang.String[] var20 = new java.lang.String[] { ""};
    java.lang.String var21 = org.databene.jdbacl.SQLUtil.join("", "", var16, "hi!", "10", var20);
    org.databene.jdbacl.model.DBUniqueConstraint var22 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var8, "select nextval('')", false, var16);
    var8.setDoc("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT");
    var2.addTable((org.databene.jdbacl.model.DBTable)var8);
    java.util.List var26 = var8.getIndexes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var28 = var8.requiresProvider(14);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi! as 10 on . = 10."+ "'", var21.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test349");


    org.databene.jdbacl.model.DBCatalog var0 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var1 = var0.getName();
    java.util.List var2 = var0.getComponents();
    org.databene.jdbacl.model.DBSchema var4 = var0.getSchema("alter sequence hi! restart with 1");
    org.databene.jdbacl.model.DBSchema var6 = var0.getSchema("jdbc:h2:mem:hi! as 10 on . = 10.");
    java.lang.String var7 = var0.getName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.DBTable var9 = var0.getTable("NOT REGEXP_LIKE(drop sequence alter sequence hi! restart with 1, 'CREATE GENERATOR DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.')");
      fail("Expected exception of type org.databene.commons.ObjectNotFoundException");
    } catch (org.databene.commons.ObjectNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test350");


    org.databene.jdbacl.model.DBCatalog var0 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var1 = var0.getName();
    org.databene.jdbacl.model.Database var2 = var0.getDatabase();
    org.databene.jdbacl.model.DBSequence var6 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    java.lang.String var7 = var6.dropDDL();
    java.math.BigInteger var8 = var6.getMinValueIfNotDefault();
    boolean var9 = var0.isIdentical((org.databene.jdbacl.model.DBObject)var6);
    org.databene.jdbacl.model.DBTreeModel var10 = new org.databene.jdbacl.model.DBTreeModel((org.databene.jdbacl.model.CompositeDBObject)var0);
    org.databene.jdbacl.dialect.DerbyDialect var13 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var15 = var13.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var16 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var17 = var16.getName();
    java.lang.String var18 = var13.formatValue((java.lang.Object)var16);
    var16.setName("'hi!'");
    java.util.List var21 = var16.getSchemas();
    org.databene.jdbacl.model.DBSchema var22 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var16);
    org.databene.jdbacl.model.DefaultDBTable var23 = new org.databene.jdbacl.model.DefaultDBTable("select next value for 10", var22);
    org.databene.jdbacl.model.DBCatalog var25 = new org.databene.jdbacl.model.DBCatalog("drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)");
    int var26 = var10.getIndexOfChild((org.databene.jdbacl.model.DBObject)var23, (org.databene.jdbacl.model.DBObject)var25);
    org.databene.jdbacl.model.DBSequence var30 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var30.setName("10");
    java.math.BigInteger var33 = var30.getIncrement();
    java.lang.Boolean var34 = var30.isCycle();
    java.lang.String var35 = var30.dropDDL();
    org.databene.jdbacl.model.DefaultDBTable var36 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var37 = var36.getForeignKeyConstraints();
    var36.setDoc("drop sequence ");
    boolean var40 = var30.equals((java.lang.Object)"drop sequence ");
    java.lang.String var41 = var30.getCatalogName();
    org.databene.jdbacl.model.DBSequence var45 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    java.math.BigInteger var46 = var45.getMaxValue();
    java.lang.String var47 = var45.toString();
    org.databene.jdbacl.model.DBSequence var51 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    java.lang.String var52 = var51.dropDDL();
    java.math.BigInteger var53 = var51.getMinValueIfNotDefault();
    java.math.BigInteger var54 = var51.getLastNumber();
    org.databene.jdbacl.model.DBSequence var58 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var58.setName("10");
    java.math.BigInteger var61 = var58.getIncrement();
    java.math.BigInteger var62 = var58.getIncrement();
    var51.setStart(var62);
    var45.setIncrement(var62);
    var30.setIncrement(var62);
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var72 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var72.setImportingIndexes(true);
    org.databene.jdbacl.model.cache.CachingDBImporter var76 = new org.databene.jdbacl.model.cache.CachingDBImporter((org.databene.jdbacl.model.DBMetaDataImporter)var72, "hi! identity by primary key");
    org.databene.jdbacl.dialect.DerbyDialect var79 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var81 = var79.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var82 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var83 = var82.getName();
    java.lang.String var84 = var79.formatValue((java.lang.Object)var82);
    var82.setName("'hi!'");
    java.util.List var87 = var82.getSchemas();
    org.databene.jdbacl.model.DBSchema var88 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var82);
    org.databene.jdbacl.model.DBTrigger var89 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var88);
    org.databene.jdbacl.model.jdbc.LazyTable var92 = new org.databene.jdbacl.model.jdbc.LazyTable(var72, var88, "VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) = \"sequence\"", "DROP SEQUENCE NOT drop generator sequence ~ 'hi!' RESTRICT");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var93 = var10.getIndexOfChild((org.databene.jdbacl.model.DBObject)var30, (org.databene.jdbacl.model.DBObject)var88);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "drop sequence "+ "'", var7.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "drop sequence 10"+ "'", var35.equals("drop sequence 10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "drop sequence "+ "'", var41.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + ""+ "'", var47.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "drop sequence "+ "'", var52.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test351");


    org.databene.jdbacl.model.DBDataType var2 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var3 = var2.isTemporal();
    boolean var4 = var2.isTemporal();
    java.lang.String var5 = var2.toString();
    boolean var6 = var2.isNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "DROP SEQUENCE "+ "'", var5.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test352");


    org.databene.jdbacl.dialect.DerbyDialect var2 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var4 = var2.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var5 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var6 = var5.getName();
    java.lang.String var7 = var2.formatValue((java.lang.Object)var5);
    var5.setName("'hi!'");
    java.util.List var10 = var5.getSchemas();
    org.databene.jdbacl.model.DBSchema var11 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var5);
    org.databene.jdbacl.model.DBTrigger var12 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var11);
    var12.setDescription("CREATE GENERATOR drop sequence ");
    java.lang.String var15 = var12.getTriggerBody();
    java.lang.String var16 = var12.getColumnName();
    java.lang.String var17 = var12.getWhenClause();
    var12.setWhenClause("-1");
    var12.setActionType("No identity defined for table DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT");
    java.lang.String var22 = var12.getWhenClause();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "-1"+ "'", var22.equals("-1"));

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test353");


    java.lang.Boolean var1 = org.databene.jdbacl.SQLUtil.mutatesDataOrStructure("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test354");


    boolean var1 = org.databene.jdbacl.DBUtil.existsEnvironment("drop sequence 10");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test355");


    org.databene.jdbacl.dialect.FirebirdDialect var0 = new org.databene.jdbacl.dialect.FirebirdDialect();
    java.lang.String var3 = var0.renderSetSequenceValue(".", 0L);
    boolean var4 = var0.isSequenceBoundarySupported();
    boolean var6 = var0.isDeterministicPKName("call next value for select nextval('alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP 'alter sequence hi! restart with 1'')");
    java.lang.String var9 = var0.renderSetSequenceValue("catalog", (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "SET GENERATOR . TO -1"+ "'", var3.equals("SET GENERATOR . TO -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "SET GENERATOR catalog TO -2"+ "'", var9.equals("SET GENERATOR catalog TO -2"));

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test356");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.JDBCConnectData var1 = org.databene.jdbacl.JDBCConnectData.parseSingleDbProperties("DROP SEQUENCE -1 RESTRICT");
      fail("Expected exception of type org.databene.commons.ConfigurationError");
    } catch (org.databene.commons.ConfigurationError e) {
      // Expected exception.
    }

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test357");


    java.lang.String var1 = org.databene.jdbacl.dialect.HSQLUtil.getInMemoryURL("left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as CREATE GENERATOR  on jdbc:h2:mem:hi! as 10 on . = 10.-identity-..DROP SEQUENCE  = CREATE GENERATOR . REGEXP 'drop sequence '");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "jdbc:hsqldb:mem:left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as CREATE GENERATOR  on jdbc:h2:mem:hi! as 10 on . = 10.-identity-..DROP SEQUENCE  = CREATE GENERATOR . REGEXP 'drop sequence '"+ "'", var1.equals("jdbc:hsqldb:mem:left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as CREATE GENERATOR  on jdbc:h2:mem:hi! as 10 on . = 10.-identity-..DROP SEQUENCE  = CREATE GENERATOR . REGEXP 'drop sequence '"));

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test358");


    org.databene.jdbacl.identity.NoIdentity var1 = new org.databene.jdbacl.identity.NoIdentity("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT");
    java.lang.String var2 = var1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT"+ "'", var2.equals("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT"));

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test359");


    boolean var1 = org.databene.jdbacl.SQLUtil.isQuery("jdbc:h2:mem:org.databene.jdbacl.SQLScriptException: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test360");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.skip();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var3 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var5 = var3.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var3);
    org.databene.jdbacl.sql.parser.SQLLexer var7 = new org.databene.jdbacl.sql.parser.SQLLexer();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var9 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var9.release((-1));
    boolean var13 = var7.mismatchIsUnwantedToken((org.antlr.runtime.IntStream)var9, 0);
    var0.setCharStream((org.antlr.runtime.CharStream)var9);
    java.lang.String var15 = var9.getSourceName();
    java.lang.String var16 = var9.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "DROP SEQUENCE "+ "'", var16.equals("DROP SEQUENCE "));

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test361");


    boolean var1 = org.databene.jdbacl.SQLUtil.isDML("jdbc:hsqldb:mem:jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test362");


    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var1 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var1.setCharPositionInLine(1);
    org.databene.jdbacl.dialect.OracleDialect var4 = new org.databene.jdbacl.dialect.OracleDialect();
    boolean var6 = var4.isDeterministicUKName("alter sequence CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT restart with 1");
    java.lang.String var8 = var4.renderFetchSequenceValue("alter sequence drop sequence 10 restart with 0");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = org.databene.jdbacl.sql.SQLParserUtil.parse((org.antlr.runtime.CharStream)var1, (org.databene.jdbacl.DatabaseDialect)var4);
      fail("Expected exception of type org.databene.commons.ParseException");
    } catch (org.databene.commons.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "select alter sequence drop sequence 10 restart with 0.nextval from dual"+ "'", var8.equals("select alter sequence drop sequence 10 restart with 0.nextval from dual"));

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test363");


    org.databene.jdbacl.model.DBCatalog var0 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var1 = var0.getName();
    org.databene.jdbacl.model.Database var2 = var0.getDatabase();
    java.lang.String var3 = var0.getDoc();
    org.databene.jdbacl.model.DBSchema var5 = var0.getSchema("drop sequence alter sequence hi! restart with 1");
    org.databene.jdbacl.model.DBTable var8 = var0.getTable("No identity defined for table DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT", false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test364");


    org.databene.jdbacl.model.DBCatalog var0 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var1 = var0.getName();
    org.databene.jdbacl.model.Database var2 = var0.getDatabase();
    org.databene.jdbacl.model.DBSequence var6 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    java.lang.String var7 = var6.dropDDL();
    java.math.BigInteger var8 = var6.getMinValueIfNotDefault();
    boolean var9 = var0.isIdentical((org.databene.jdbacl.model.DBObject)var6);
    org.databene.jdbacl.model.DBTreeModel var10 = new org.databene.jdbacl.model.DBTreeModel((org.databene.jdbacl.model.CompositeDBObject)var0);
    org.databene.jdbacl.dialect.DerbyDialect var14 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var16 = var14.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var17 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var18 = var17.getName();
    java.lang.String var19 = var14.formatValue((java.lang.Object)var17);
    var17.setName("'hi!'");
    java.util.List var22 = var17.getSchemas();
    org.databene.jdbacl.model.DBSchema var23 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var17);
    org.databene.jdbacl.model.DBTrigger var24 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var23);
    java.util.List var25 = var23.getPackages();
    org.databene.jdbacl.model.DBPackage var26 = new org.databene.jdbacl.model.DBPackage("CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).", var23);
    java.lang.String var27 = var26.getStatus();
    org.databene.jdbacl.dialect.DerbyDialect var32 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var34 = var32.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var35 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var36 = var35.getName();
    java.lang.String var37 = var32.formatValue((java.lang.Object)var35);
    var35.setName("'hi!'");
    java.util.List var40 = var35.getSchemas();
    org.databene.jdbacl.model.DBSchema var41 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var35);
    org.databene.jdbacl.model.DBTrigger var42 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var41);
    java.util.List var43 = var41.getPackages();
    org.databene.jdbacl.model.DBPackage var44 = new org.databene.jdbacl.model.DBPackage("CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).", var41);
    java.util.List var45 = var44.getComponents();
    org.databene.jdbacl.model.DBProcedure var46 = new org.databene.jdbacl.model.DBProcedure("CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var44);
    java.lang.String var47 = var46.getSubProgramId();
    org.databene.jdbacl.model.DefaultDBTable var49 = new org.databene.jdbacl.model.DefaultDBTable();
    var49.setDoc(".");
    java.util.Set var53 = var49.getUniqueConstraints(false);
    org.databene.jdbacl.model.DBDataType var56 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var57 = var56.isAlpha();
    boolean var58 = var56.isLOB();
    org.databene.jdbacl.model.DefaultDBColumn var61 = new org.databene.jdbacl.model.DefaultDBColumn("NOT drop generator sequence ~ 'hi!'", (org.databene.jdbacl.model.DBTable)var49, var56, (java.lang.Integer)100, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.TableContainer var64 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var65 = var64.getTables();
    org.databene.jdbacl.model.TableContainer var66 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var64);
    org.databene.jdbacl.model.DefaultDBTable var67 = new org.databene.jdbacl.model.DefaultDBTable();
    var67.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var70 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var71 = var70.getForeignKeyConstraints();
    var67.addReferrer((org.databene.jdbacl.model.DBTable)var70);
    var64.addTable((org.databene.jdbacl.model.DBTable)var70);
    var61.setTable((org.databene.jdbacl.model.DBTable)var70);
    boolean var75 = var46.isIdentical((org.databene.jdbacl.model.DBObject)var70);
    var26.addProcedure(var46);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var77 = var10.getChildCount((org.databene.jdbacl.model.DBObject)var46);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "drop sequence "+ "'", var7.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test365");


    org.databene.jdbacl.model.DBCatalog var0 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var1 = var0.getName();
    org.databene.jdbacl.model.Database var2 = var0.getDatabase();
    java.lang.String var3 = var0.getDoc();
    org.databene.jdbacl.dialect.DerbyDialect var5 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var7 = var5.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var8 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var9 = var8.getName();
    java.lang.String var10 = var5.formatValue((java.lang.Object)var8);
    var8.setName("'hi!'");
    java.util.List var13 = var8.getSchemas();
    org.databene.jdbacl.model.DBSchema var14 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var8);
    var0.removeSchema(var14);
    java.util.List var17 = var14.getSequences(true);
    org.databene.jdbacl.dialect.DerbyDialect var21 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var23 = var21.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var24 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var25 = var24.getName();
    java.lang.String var26 = var21.formatValue((java.lang.Object)var24);
    var24.setName("'hi!'");
    java.util.List var29 = var24.getSchemas();
    org.databene.jdbacl.model.DBSchema var30 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var24);
    org.databene.jdbacl.model.DBTrigger var31 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var30);
    java.util.List var32 = var30.getPackages();
    org.databene.jdbacl.model.DBPackage var33 = new org.databene.jdbacl.model.DBPackage("CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).", var30);
    java.util.List var34 = var33.getComponents();
    var14.addPackage(var33);
    java.lang.String var36 = var33.getSubObjectName();
    var33.setDataObjectId("drop sequence 10");
    var33.setDataObjectId("false");
    java.lang.String var41 = var33.getDataObjectId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "false"+ "'", var41.equals("false"));

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test366");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mIN();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test367");


    org.databene.jdbacl.model.TableContainer var4 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var5 = var4.getTables();
    org.databene.jdbacl.model.TableContainer var6 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var4);
    org.databene.jdbacl.model.DefaultDBTable var7 = new org.databene.jdbacl.model.DefaultDBTable();
    var7.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var10 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var11 = var10.getForeignKeyConstraints();
    var7.addReferrer((org.databene.jdbacl.model.DBTable)var10);
    var4.addTable((org.databene.jdbacl.model.DBTable)var10);
    java.lang.String[] var18 = new java.lang.String[] { ""};
    java.lang.String[] var22 = new java.lang.String[] { ""};
    java.lang.String var23 = org.databene.jdbacl.SQLUtil.join("", "", var18, "hi!", "10", var22);
    java.lang.String var24 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var18);
    org.databene.jdbacl.model.TableContainer var27 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var28 = var27.getTables();
    org.databene.jdbacl.model.TableContainer var29 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var27);
    org.databene.jdbacl.model.DefaultDBTable var30 = new org.databene.jdbacl.model.DefaultDBTable();
    var30.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var33 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var34 = var33.getForeignKeyConstraints();
    var30.addReferrer((org.databene.jdbacl.model.DBTable)var33);
    var27.addTable((org.databene.jdbacl.model.DBTable)var33);
    java.lang.String[] var39 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var40 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var39);
    org.databene.jdbacl.model.DBForeignKeyConstraint var41 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var10, var18, (org.databene.jdbacl.model.DBTable)var33, var39);
    java.lang.String[] var42 = var41.getForeignKeyColumnNames();
    org.databene.jdbacl.model.DefaultDBTable var44 = new org.databene.jdbacl.model.DefaultDBTable();
    var44.setDoc(".");
    java.util.Set var48 = var44.getUniqueConstraints(false);
    org.databene.jdbacl.model.DBDataType var51 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var52 = var51.isAlpha();
    boolean var53 = var51.isLOB();
    org.databene.jdbacl.model.DefaultDBColumn var56 = new org.databene.jdbacl.model.DefaultDBColumn("NOT drop generator sequence ~ 'hi!'", (org.databene.jdbacl.model.DBTable)var44, var51, (java.lang.Integer)100, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.TableContainer var59 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var60 = var59.getTables();
    org.databene.jdbacl.model.TableContainer var61 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var59);
    org.databene.jdbacl.model.DefaultDBTable var62 = new org.databene.jdbacl.model.DefaultDBTable();
    var62.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var65 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var66 = var65.getForeignKeyConstraints();
    var62.addReferrer((org.databene.jdbacl.model.DBTable)var65);
    var59.addTable((org.databene.jdbacl.model.DBTable)var65);
    var56.setTable((org.databene.jdbacl.model.DBTable)var65);
    boolean var70 = var41.isIdentical((org.databene.jdbacl.model.DBObject)var56);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var72 = var41.columnReferencedBy("DROP SEQUENCE CREATE GENERATOR  RESTRICT");
      fail("Expected exception of type org.databene.commons.ObjectNotFoundException");
    } catch (org.databene.commons.ObjectNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi! as 10 on . = 10."+ "'", var23.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "."+ "'", var24.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var40.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test368");


    org.databene.jdbacl.model.DBSequence var3 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    java.lang.String var4 = var3.dropDDL();
    java.math.BigInteger var5 = var3.getIncrementIfNotDefault();
    java.math.BigInteger var6 = var3.getMinValue();
    java.math.BigInteger var7 = var3.getMinValue();
    java.lang.Boolean var8 = var3.isOrder();
    java.lang.String var9 = var3.getCatalogName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "drop sequence "+ "'", var4.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "drop sequence "+ "'", var9.equals("drop sequence "));

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test369");


    org.databene.jdbacl.model.TableContainer var2 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var3 = var2.getTables();
    org.databene.jdbacl.model.TableContainer var4 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var2);
    java.util.List var5 = var4.getTables();
    org.databene.jdbacl.model.DBCatalog var8 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var9 = var8.getName();
    org.databene.jdbacl.model.Database var10 = var8.getDatabase();
    java.lang.String var11 = var8.getDoc();
    org.databene.jdbacl.dialect.DerbyDialect var13 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var15 = var13.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var16 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var17 = var16.getName();
    java.lang.String var18 = var13.formatValue((java.lang.Object)var16);
    var16.setName("'hi!'");
    java.util.List var21 = var16.getSchemas();
    org.databene.jdbacl.model.DBSchema var22 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var16);
    var8.removeSchema(var22);
    org.databene.jdbacl.dialect.DerbyDialect var26 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var28 = var26.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var29 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var30 = var29.getName();
    java.lang.String var31 = var26.formatValue((java.lang.Object)var29);
    var29.setName("'hi!'");
    java.util.List var34 = var29.getSchemas();
    org.databene.jdbacl.model.DBSchema var35 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var29);
    org.databene.jdbacl.model.DBTrigger var36 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var35);
    var36.setDescription("CREATE GENERATOR drop sequence ");
    java.lang.String var39 = var36.getTriggerBody();
    java.lang.String var40 = var36.getColumnName();
    java.lang.String var41 = var36.getWhenClause();
    var22.addTrigger(var36);
    org.databene.jdbacl.model.DBTrigger var43 = new org.databene.jdbacl.model.DBTrigger("-1", var22);
    org.databene.jdbacl.model.DBSequence var44 = new org.databene.jdbacl.model.DBSequence("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.", var22);
    boolean var45 = var4.isIdentical((org.databene.jdbacl.model.DBObject)var22);
    org.databene.jdbacl.model.TableContainerSupport var47 = new org.databene.jdbacl.model.TableContainerSupport();
    java.util.Collection var48 = var47.getSubContainers();
    org.databene.jdbacl.sql.parser.SQLLexer var50 = new org.databene.jdbacl.sql.parser.SQLLexer();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var52 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var52.release((-1));
    boolean var56 = var50.mismatchIsUnwantedToken((org.antlr.runtime.IntStream)var52, 0);
    int var57 = var50.getRuleMemoizationCacheSize();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var59 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var50.consumeUntil((org.antlr.runtime.IntStream)var59, 100);
    org.databene.jdbacl.dialect.DerbyDialect var64 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var66 = var64.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var67 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var68 = var67.getName();
    java.lang.String var69 = var64.formatValue((java.lang.Object)var67);
    var67.setName("'hi!'");
    java.util.List var72 = var67.getSchemas();
    var50.traceOut("SET GENERATOR alter sequence CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT restart with 1 TO -2", 0, (java.lang.Object)var72);
    java.util.List var74 = var47.getSequences(false, var72);
    java.util.List var75 = var4.getTables(true, var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test370");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.Database var8 = org.databene.jdbacl.DBUtil.getMetaData("CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).", true, true, true, true, "JDBCDBImporter", false, false);
      fail("Expected exception of type org.databene.commons.ConfigurationError");
    } catch (org.databene.commons.ConfigurationError e) {
      // Expected exception.
    }

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test371");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var3 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var3.setCharPositionInLine(1);
    java.lang.String var6 = var3.toString();
    var0.setCharStream((org.antlr.runtime.CharStream)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mT__115();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "DROP SEQUENCE "+ "'", var6.equals("DROP SEQUENCE "));

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test372");


    org.databene.jdbacl.sql.ColumnExpression var2 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var5 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var6 = var5.getValue();
    org.databene.jdbacl.sql.ColumnExpression var9 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var10 = var9.getValue();
    org.databene.jdbacl.sql.BetweenExpression var11 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var2, (org.databene.script.Expression)var5, (org.databene.script.Expression)var9);
    org.databene.jdbacl.sql.ColumnExpression var14 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var17 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var18 = var17.getValue();
    org.databene.jdbacl.sql.ColumnExpression var21 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var22 = var21.getValue();
    org.databene.jdbacl.sql.BetweenExpression var23 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var14, (org.databene.script.Expression)var17, (org.databene.script.Expression)var21);
    var11.addTerm((org.databene.script.Expression)var17);
    boolean var25 = var17.isConstant();
    java.lang.String var26 = var17.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "sequence"+ "'", var6.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "sequence"+ "'", var10.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "sequence"+ "'", var18.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "sequence"+ "'", var22.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "\"sequence\""+ "'", var26.equals("\"sequence\""));

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test373");


    java.lang.String[] var4 = new java.lang.String[] { ""};
    java.lang.String[] var8 = new java.lang.String[] { ""};
    java.lang.String var9 = org.databene.jdbacl.SQLUtil.join("", "", var4, "hi!", "10", var8);
    org.databene.jdbacl.identity.IdentityProvider var10 = new org.databene.jdbacl.identity.IdentityProvider();
    org.databene.jdbacl.identity.SubNkPkQueryIdentity var11 = new org.databene.jdbacl.identity.SubNkPkQueryIdentity("null", var4, var10);
    org.databene.jdbacl.identity.xml.IdentityParseContext var12 = new org.databene.jdbacl.identity.xml.IdentityParseContext(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.identity.IdentityModel var14 = var10.getIdentity("call next value for 'hi!'");
      fail("Expected exception of type org.databene.commons.ObjectNotFoundException");
    } catch (org.databene.commons.ObjectNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi! as 10 on . = 10."+ "'", var9.equals("hi! as 10 on . = 10."));

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test374");


    org.databene.jdbacl.model.TableContainer var2 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var3 = var2.getTables();
    org.databene.jdbacl.model.TableContainer var4 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var2);
    java.util.List var5 = var4.getTables();
    java.util.List var6 = var4.getTables();
    org.databene.jdbacl.model.DBSequence var10 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    java.lang.String var11 = var10.dropDDL();
    java.math.BigInteger var12 = var10.getMinValueIfNotDefault();
    java.math.BigInteger var13 = var10.getIncrementIfNotDefault();
    boolean var14 = var4.isIdentical((org.databene.jdbacl.model.DBObject)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "drop sequence "+ "'", var11.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test375");


    org.databene.jdbacl.identity.NaturalPkIdentity var1 = new org.databene.jdbacl.identity.NaturalPkIdentity("DROP SEQUENCE NOT drop generator sequence ~ 'hi!' RESTRICT");
    java.lang.String var2 = var1.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "DROP SEQUENCE NOT drop generator sequence ~ 'hi!' RESTRICT identity by primary key"+ "'", var2.equals("DROP SEQUENCE NOT drop generator sequence ~ 'hi!' RESTRICT identity by primary key"));

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test376");


    org.databene.jdbacl.dialect.SqlServerDialect var0 = new org.databene.jdbacl.dialect.SqlServerDialect();
    boolean var2 = var0.isDeterministicPKName("10");
    boolean var4 = var0.isDeterministicUKName("jdbc:h2:mem:hi! as 10 on . = 10.-identity-. DROP SEQUENCE (0,-1) NULL");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test377");


    org.databene.jdbacl.dialect.PostgreSQLDialect var0 = new org.databene.jdbacl.dialect.PostgreSQLDialect();
    boolean var3 = var0.isDefaultCatalog("", "");
    java.lang.String var5 = var0.renderDropSequence("");
    org.databene.jdbacl.model.DBCatalog var6 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var7 = var0.formatValue((java.lang.Object)var6);
    java.lang.String var8 = org.databene.jdbacl.SQLUtil.ownerDotComponent((org.databene.jdbacl.model.DBObject)var6);
    var6.setName("drop generator sequence");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "drop sequence "+ "'", var5.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "null"+ "'", var8.equals("null"));

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test378");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.sql.parser.ANTLRNoCaseFileStream var1 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseFileStream("alter sequence drop generator sequence restart with 100");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test379");


    org.databene.jdbacl.model.TableContainer var1 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var2 = var1.getTables();
    org.databene.jdbacl.dialect.DerbyDialect var6 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var8 = var6.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var9 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var10 = var9.getName();
    java.lang.String var11 = var6.formatValue((java.lang.Object)var9);
    var9.setName("'hi!'");
    java.util.List var14 = var9.getSchemas();
    org.databene.jdbacl.model.DBSchema var15 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var9);
    org.databene.jdbacl.model.DBTrigger var16 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var15);
    java.util.List var17 = var15.getPackages();
    java.util.List var18 = var1.getSequences(false, var17);
    java.util.List var20 = var1.getTables(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test380");


    org.databene.jdbacl.dialect.HSQL2Dialect var0 = new org.databene.jdbacl.dialect.HSQL2Dialect();
    java.lang.String var2 = var0.renderFetchSequenceValue("'hi!'");
    boolean var3 = var0.supportsRegex();
    java.lang.String var6 = var0.renderSequenceValue("CREATE SEQUENCE 10", 1L);
    boolean var8 = var0.isDeterministicFKName("select alter sequence drop sequence 10 restart with 0.nextval from dual");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "call next value for 'hi!'"+ "'", var2.equals("call next value for 'hi!'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "alter sequence CREATE SEQUENCE 10 restart with 1"+ "'", var6.equals("alter sequence CREATE SEQUENCE 10 restart with 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test381");


    boolean var1 = org.databene.jdbacl.SQLUtil.isProcedureCall("VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) = \"sequence\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test382");


    org.databene.jdbacl.model.DefaultDBTable var2 = new org.databene.jdbacl.model.DefaultDBTable();
    var2.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var5 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var6 = var5.getForeignKeyConstraints();
    var2.addReferrer((org.databene.jdbacl.model.DBTable)var5);
    org.databene.jdbacl.model.DBDataType var10 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var11 = var10.isAlpha();
    java.lang.String var12 = var10.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var13 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var16 = var13.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var18 = var13.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var19 = var10.equals((java.lang.Object)var18);
    org.databene.jdbacl.model.DefaultDBColumn var22 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var5, var10, (java.lang.Integer)0, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DefaultDBColumn var25 = new org.databene.jdbacl.model.DefaultDBColumn("NOT REGEXP_MATCHES(sequence, '')", (org.databene.jdbacl.model.DBTable)var5, (-1), "hi! identity by primary key");
    java.util.List var26 = var5.getComponents();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "DROP SEQUENCE "+ "'", var12.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var18.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test383");


    org.databene.jdbacl.model.TableContainer var5 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var6 = var5.getTables();
    org.databene.jdbacl.model.TableContainer var7 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var5);
    org.databene.jdbacl.model.DefaultDBTable var8 = new org.databene.jdbacl.model.DefaultDBTable();
    var8.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var11 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var12 = var11.getForeignKeyConstraints();
    var8.addReferrer((org.databene.jdbacl.model.DBTable)var11);
    var5.addTable((org.databene.jdbacl.model.DBTable)var11);
    java.lang.String[] var19 = new java.lang.String[] { ""};
    java.lang.String[] var23 = new java.lang.String[] { ""};
    java.lang.String var24 = org.databene.jdbacl.SQLUtil.join("", "", var19, "hi!", "10", var23);
    java.lang.String var25 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var19);
    org.databene.jdbacl.model.TableContainer var28 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var29 = var28.getTables();
    org.databene.jdbacl.model.TableContainer var30 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var28);
    org.databene.jdbacl.model.DefaultDBTable var31 = new org.databene.jdbacl.model.DefaultDBTable();
    var31.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var34 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var35 = var34.getForeignKeyConstraints();
    var31.addReferrer((org.databene.jdbacl.model.DBTable)var34);
    var28.addTable((org.databene.jdbacl.model.DBTable)var34);
    java.lang.String[] var40 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var41 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var40);
    org.databene.jdbacl.model.DBForeignKeyConstraint var42 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var11, var19, (org.databene.jdbacl.model.DBTable)var34, var40);
    java.lang.String var43 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("select next value for select next value for SET GENERATOR.TO - 1 NOT REGEXP 'hi!'", var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi! as 10 on . = 10."+ "'", var24.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "."+ "'", var25.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var41.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "select next value for select next value for SET GENERATOR.TO - 1 NOT REGEXP 'hi!'.DROP SEQUENCE "+ "'", var43.equals("select next value for select next value for SET GENERATOR.TO - 1 NOT REGEXP 'hi!'.DROP SEQUENCE "));

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test384");


    org.databene.jdbacl.model.DefaultDBTable var0 = new org.databene.jdbacl.model.DefaultDBTable();
    var0.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var3 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var4 = var3.getForeignKeyConstraints();
    var0.addReferrer((org.databene.jdbacl.model.DBTable)var3);
    org.databene.jdbacl.model.DefaultDBTable var7 = new org.databene.jdbacl.model.DefaultDBTable();
    var7.setDoc(".");
    java.util.Set var11 = var7.getUniqueConstraints(false);
    org.databene.jdbacl.model.DBDataType var14 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var15 = var14.isAlpha();
    boolean var16 = var14.isLOB();
    org.databene.jdbacl.model.DefaultDBColumn var19 = new org.databene.jdbacl.model.DefaultDBColumn("NOT drop generator sequence ~ 'hi!'", (org.databene.jdbacl.model.DBTable)var7, var14, (java.lang.Integer)100, (java.lang.Integer)(-1));
    var3.addColumn((org.databene.jdbacl.model.DBColumn)var19);
    org.databene.jdbacl.model.DBRow var21 = new org.databene.jdbacl.model.DBRow((org.databene.jdbacl.model.DBTable)var3);
    java.lang.Object[] var22 = var21.getPKValues();
    org.databene.jdbacl.model.DBSequence var27 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var27.setCache((java.lang.Long)100L);
    java.lang.String var30 = var27.getObjectType();
    java.math.BigInteger var31 = var27.getIncrementIfNotDefault();
    org.databene.jdbacl.model.DBSequence var35 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var35.setName("10");
    java.math.BigInteger var38 = var35.getIncrement();
    java.math.BigInteger var39 = var35.getIncrement();
    var27.setLastNumber(var39);
    var27.setOrder((java.lang.Boolean)false);
    var21.setCellValue("alter sequence  restart with -1", (java.lang.Object)var27);
    org.databene.jdbacl.model.TableContainer var48 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var49 = var48.getTables();
    org.databene.jdbacl.model.TableContainer var50 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var48);
    org.databene.jdbacl.model.DefaultDBTable var51 = new org.databene.jdbacl.model.DefaultDBTable();
    var51.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var54 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var55 = var54.getForeignKeyConstraints();
    var51.addReferrer((org.databene.jdbacl.model.DBTable)var54);
    var48.addTable((org.databene.jdbacl.model.DBTable)var54);
    java.lang.String[] var62 = new java.lang.String[] { ""};
    java.lang.String[] var66 = new java.lang.String[] { ""};
    java.lang.String var67 = org.databene.jdbacl.SQLUtil.join("", "", var62, "hi!", "10", var66);
    java.lang.String var68 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var62);
    org.databene.jdbacl.model.TableContainer var71 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var72 = var71.getTables();
    org.databene.jdbacl.model.TableContainer var73 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var71);
    org.databene.jdbacl.model.DefaultDBTable var74 = new org.databene.jdbacl.model.DefaultDBTable();
    var74.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var77 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var78 = var77.getForeignKeyConstraints();
    var74.addReferrer((org.databene.jdbacl.model.DBTable)var77);
    var71.addTable((org.databene.jdbacl.model.DBTable)var77);
    java.lang.String[] var83 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var84 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var83);
    org.databene.jdbacl.model.DBForeignKeyConstraint var85 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var54, var62, (org.databene.jdbacl.model.DBTable)var77, var83);
    java.lang.String[] var86 = var85.getRefereeColumnNames();
    java.lang.String var87 = var85.toString();
    java.lang.String var88 = var85.toString();
    java.lang.String var89 = var85.toString();
    java.lang.Object[] var90 = var21.getFKComponents(var85);
    java.lang.String[] var91 = var85.getRefereeColumnNames();
    java.lang.String var92 = var85.getObjectType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "sequence"+ "'", var30.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "hi! as 10 on . = 10."+ "'", var67.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "."+ "'", var68.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var84.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var87 + "' != '" + "CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )"+ "'", var87.equals("CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var88 + "' != '" + "CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )"+ "'", var88.equals("CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var89 + "' != '" + "CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )"+ "'", var89.equals("CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var92 + "' != '" + "foreign key constraint"+ "'", var92.equals("foreign key constraint"));

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test385");


    org.databene.jdbacl.dialect.DerbyDialect var2 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var4 = var2.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var5 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var6 = var5.getName();
    java.lang.String var7 = var2.formatValue((java.lang.Object)var5);
    var5.setName("'hi!'");
    java.util.List var10 = var5.getSchemas();
    org.databene.jdbacl.model.DBSchema var11 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var5);
    org.databene.jdbacl.model.DBTrigger var12 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var11);
    var12.setDescription("CREATE GENERATOR drop sequence ");
    org.databene.jdbacl.model.DefaultDBTable var16 = new org.databene.jdbacl.model.DefaultDBTable();
    var16.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var19 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var20 = var19.getForeignKeyConstraints();
    var16.addReferrer((org.databene.jdbacl.model.DBTable)var19);
    org.databene.jdbacl.model.DBDataType var24 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var25 = var24.isAlpha();
    java.lang.String var26 = var24.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var27 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var30 = var27.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var32 = var27.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var33 = var24.equals((java.lang.Object)var32);
    org.databene.jdbacl.model.DefaultDBColumn var36 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var19, var24, (java.lang.Integer)0, (java.lang.Integer)(-1));
    boolean var37 = var12.isIdentical((org.databene.jdbacl.model.DBObject)var36);
    var12.setTriggeringEvent("alter sequence CONSTRAINT \"select nextval('')\" UNIQUE () restart with -1");
    var12.setTableOwner("select nextval('')");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "DROP SEQUENCE "+ "'", var26.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var32.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test386");


    org.databene.jdbacl.model.DBCatalog var0 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var1 = var0.getName();
    org.databene.jdbacl.model.Database var2 = var0.getDatabase();
    java.lang.String var3 = var0.getDoc();
    org.databene.jdbacl.dialect.DerbyDialect var5 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var7 = var5.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var8 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var9 = var8.getName();
    java.lang.String var10 = var5.formatValue((java.lang.Object)var8);
    var8.setName("'hi!'");
    java.util.List var13 = var8.getSchemas();
    org.databene.jdbacl.model.DBSchema var14 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var8);
    var0.removeSchema(var14);
    org.databene.jdbacl.dialect.DerbyDialect var18 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var20 = var18.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var21 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var22 = var21.getName();
    java.lang.String var23 = var18.formatValue((java.lang.Object)var21);
    var21.setName("'hi!'");
    java.util.List var26 = var21.getSchemas();
    org.databene.jdbacl.model.DBSchema var27 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var21);
    org.databene.jdbacl.model.DBTrigger var28 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var27);
    var28.setDescription("CREATE GENERATOR drop sequence ");
    java.lang.String var31 = var28.getTriggerBody();
    java.lang.String var32 = var28.getColumnName();
    java.lang.String var33 = var28.getWhenClause();
    var14.addTrigger(var28);
    java.util.List var35 = var14.getComponents();
    org.databene.jdbacl.dialect.DerbyDialect var37 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var39 = var37.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var40 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var41 = var40.getName();
    java.lang.String var42 = var37.formatValue((java.lang.Object)var40);
    var40.setName("'hi!'");
    java.util.List var45 = var40.getSchemas();
    org.databene.jdbacl.model.DBSchema var46 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var40);
    org.databene.jdbacl.dialect.DerbyDialect var49 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var51 = var49.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var52 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var53 = var52.getName();
    java.lang.String var54 = var49.formatValue((java.lang.Object)var52);
    var52.setName("'hi!'");
    java.util.List var57 = var52.getSchemas();
    org.databene.jdbacl.model.DBSchema var58 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var52);
    org.databene.jdbacl.model.DBTrigger var59 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var58);
    var46.addTrigger(var59);
    boolean var61 = var14.isIdentical((org.databene.jdbacl.model.DBObject)var59);
    org.databene.jdbacl.model.DefaultDBTable var62 = new org.databene.jdbacl.model.DefaultDBTable();
    var62.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var65 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var66 = var65.getForeignKeyConstraints();
    var62.addReferrer((org.databene.jdbacl.model.DBTable)var65);
    java.lang.String[] var73 = new java.lang.String[] { ""};
    java.lang.String[] var77 = new java.lang.String[] { ""};
    java.lang.String var78 = org.databene.jdbacl.SQLUtil.join("", "", var73, "hi!", "10", var77);
    org.databene.jdbacl.model.DBUniqueConstraint var79 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var65, "select nextval('')", false, var73);
    org.databene.jdbacl.model.DBCatalog var80 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var81 = var80.getName();
    java.util.List var82 = var80.getComponents();
    boolean var83 = var79.isIdentical((org.databene.jdbacl.model.DBObject)var80);
    boolean var84 = var59.isIdentical((org.databene.jdbacl.model.DBObject)var79);
    java.lang.String[] var85 = var79.getColumnNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + "hi! as 10 on . = 10."+ "'", var78.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test387");


    org.databene.jdbacl.model.DefaultDBTable var2 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var3 = var2.getForeignKeyConstraints();
    java.util.List var4 = var2.getColumns();
    org.databene.jdbacl.model.DefaultDBColumn var7 = new org.databene.jdbacl.model.DefaultDBColumn("call next value for 'hi!'", (org.databene.jdbacl.model.DBTable)var2, 100, "select next value for SET GENERATOR.TO - 1 NOT REGEXP 'hi!'");
    org.databene.jdbacl.model.DefaultDBTable var10 = new org.databene.jdbacl.model.DefaultDBTable();
    var10.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var13 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var14 = var13.getForeignKeyConstraints();
    var10.addReferrer((org.databene.jdbacl.model.DBTable)var13);
    org.databene.jdbacl.model.DBDataType var18 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var19 = var18.isAlpha();
    java.lang.String var20 = var18.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var21 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var24 = var21.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var26 = var21.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var27 = var18.equals((java.lang.Object)var26);
    org.databene.jdbacl.model.DefaultDBColumn var30 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var13, var18, (java.lang.Integer)0, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DefaultDBTable var31 = new org.databene.jdbacl.model.DefaultDBTable();
    var31.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var34 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var35 = var34.getForeignKeyConstraints();
    var31.addReferrer((org.databene.jdbacl.model.DBTable)var34);
    var13.addReferrer((org.databene.jdbacl.model.DBTable)var31);
    org.databene.jdbacl.model.TableContainer var42 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var43 = var42.getTables();
    org.databene.jdbacl.model.TableContainer var44 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var42);
    org.databene.jdbacl.model.DefaultDBTable var45 = new org.databene.jdbacl.model.DefaultDBTable();
    var45.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var48 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var49 = var48.getForeignKeyConstraints();
    var45.addReferrer((org.databene.jdbacl.model.DBTable)var48);
    var42.addTable((org.databene.jdbacl.model.DBTable)var48);
    java.lang.String[] var56 = new java.lang.String[] { ""};
    java.lang.String[] var60 = new java.lang.String[] { ""};
    java.lang.String var61 = org.databene.jdbacl.SQLUtil.join("", "", var56, "hi!", "10", var60);
    java.lang.String var62 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var56);
    org.databene.jdbacl.model.TableContainer var65 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var66 = var65.getTables();
    org.databene.jdbacl.model.TableContainer var67 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var65);
    org.databene.jdbacl.model.DefaultDBTable var68 = new org.databene.jdbacl.model.DefaultDBTable();
    var68.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var71 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var72 = var71.getForeignKeyConstraints();
    var68.addReferrer((org.databene.jdbacl.model.DBTable)var71);
    var65.addTable((org.databene.jdbacl.model.DBTable)var71);
    java.lang.String[] var77 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var78 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var77);
    org.databene.jdbacl.model.DBForeignKeyConstraint var79 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var48, var56, (org.databene.jdbacl.model.DBTable)var71, var77);
    org.databene.jdbacl.model.DBTable var80 = var79.getRefereeTable();
    var13.addForeignKey(var79);
    org.databene.jdbacl.model.DBDataType var84 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    org.databene.jdbacl.model.DefaultDBColumn var85 = new org.databene.jdbacl.model.DefaultDBColumn("select next value for SET GENERATOR . TO -1", (org.databene.jdbacl.model.DBTable)var13, var84);
    org.databene.jdbacl.model.DefaultDBColumn var87 = new org.databene.jdbacl.model.DefaultDBColumn("CONSTRAINT \"select nextval('')\" UNIQUE ()", (org.databene.jdbacl.model.DBTable)var2, var84, (java.lang.Integer)100);
    boolean var89 = var84.equals((java.lang.Object)"jdbc:hsqldb:mem:jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "DROP SEQUENCE "+ "'", var20.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var26.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "hi! as 10 on . = 10."+ "'", var61.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "."+ "'", var62.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var78.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test388");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.DBUtil.checkReadOnly("alter sequence  restart with -1", true);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test389");


    org.databene.jdbacl.dialect.DerbyDialect var2 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var4 = var2.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var5 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var6 = var5.getName();
    java.lang.String var7 = var2.formatValue((java.lang.Object)var5);
    var5.setName("'hi!'");
    java.util.List var10 = var5.getSchemas();
    org.databene.jdbacl.model.DBSchema var11 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var5);
    org.databene.jdbacl.model.DefaultDBTable var12 = new org.databene.jdbacl.model.DefaultDBTable("select next value for 10", var11);
    java.util.List var13 = var11.getComponents();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test390");


    org.databene.jdbacl.model.DefaultDBTable var0 = new org.databene.jdbacl.model.DefaultDBTable();
    var0.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var3 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var4 = var3.getForeignKeyConstraints();
    var0.addReferrer((org.databene.jdbacl.model.DBTable)var3);
    java.lang.String[] var11 = new java.lang.String[] { ""};
    java.lang.String[] var15 = new java.lang.String[] { ""};
    java.lang.String var16 = org.databene.jdbacl.SQLUtil.join("", "", var11, "hi!", "10", var15);
    org.databene.jdbacl.model.DBUniqueConstraint var17 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var3, "select nextval('')", false, var11);
    org.databene.jdbacl.model.DBPrimaryKeyConstraint var18 = var3.getPrimaryKeyConstraint();
    org.databene.jdbacl.model.DefaultDBTable var20 = new org.databene.jdbacl.model.DefaultDBTable();
    var20.setDoc(".");
    java.util.Set var24 = var20.getUniqueConstraints(false);
    org.databene.jdbacl.model.DBDataType var27 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var28 = var27.isAlpha();
    boolean var29 = var27.isLOB();
    org.databene.jdbacl.model.DefaultDBColumn var32 = new org.databene.jdbacl.model.DefaultDBColumn("NOT drop generator sequence ~ 'hi!'", (org.databene.jdbacl.model.DBTable)var20, var27, (java.lang.Integer)100, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.TableContainer var37 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var38 = var37.getTables();
    org.databene.jdbacl.model.TableContainer var39 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var37);
    org.databene.jdbacl.model.DefaultDBTable var40 = new org.databene.jdbacl.model.DefaultDBTable();
    var40.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var43 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var44 = var43.getForeignKeyConstraints();
    var40.addReferrer((org.databene.jdbacl.model.DBTable)var43);
    var37.addTable((org.databene.jdbacl.model.DBTable)var43);
    java.lang.String[] var51 = new java.lang.String[] { ""};
    java.lang.String[] var55 = new java.lang.String[] { ""};
    java.lang.String var56 = org.databene.jdbacl.SQLUtil.join("", "", var51, "hi!", "10", var55);
    java.lang.String var57 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var51);
    org.databene.jdbacl.model.TableContainer var60 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var61 = var60.getTables();
    org.databene.jdbacl.model.TableContainer var62 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var60);
    org.databene.jdbacl.model.DefaultDBTable var63 = new org.databene.jdbacl.model.DefaultDBTable();
    var63.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var66 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var67 = var66.getForeignKeyConstraints();
    var63.addReferrer((org.databene.jdbacl.model.DBTable)var66);
    var60.addTable((org.databene.jdbacl.model.DBTable)var66);
    java.lang.String[] var72 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var73 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var72);
    org.databene.jdbacl.model.DBForeignKeyConstraint var74 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var43, var51, (org.databene.jdbacl.model.DBTable)var66, var72);
    boolean var75 = var74.isNameDeterministic();
    var20.removeForeignKeyConstraint(var74);
    var3.removeForeignKeyConstraint(var74);
    java.util.Collection var78 = var3.getReferrers();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi! as 10 on . = 10."+ "'", var16.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "hi! as 10 on . = 10."+ "'", var56.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "."+ "'", var57.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var73.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test391");


    org.databene.jdbacl.model.DefaultDBTable var0 = new org.databene.jdbacl.model.DefaultDBTable();
    var0.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var3 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var4 = var3.getForeignKeyConstraints();
    var0.addReferrer((org.databene.jdbacl.model.DBTable)var3);
    java.lang.String[] var11 = new java.lang.String[] { ""};
    java.lang.String[] var15 = new java.lang.String[] { ""};
    java.lang.String var16 = org.databene.jdbacl.SQLUtil.join("", "", var11, "hi!", "10", var15);
    org.databene.jdbacl.model.DBUniqueConstraint var17 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var3, "select nextval('')", false, var11);
    java.lang.String var18 = var17.toString();
    boolean var19 = var17.isNameDeterministic();
    var17.setDoc("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT");
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var30 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.", "select next value for SET GENERATOR . TO -1", "DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.", "jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", "10", "hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", "select next value for SET GENERATOR . TO -1", false);
    var30.setSchemaName("alter sequence hi! restart with 1");
    boolean var33 = var17.equals((java.lang.Object)var30);
    org.databene.jdbacl.model.DBSequence var37 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var37.setName("10");
    java.math.BigInteger var40 = var37.getIncrement();
    boolean var41 = var17.isIdentical((org.databene.jdbacl.model.DBObject)var37);
    java.lang.Long var42 = var37.getCache();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi! as 10 on . = 10."+ "'", var16.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "CONSTRAINT \"select nextval('')\" UNIQUE ()"+ "'", var18.equals("CONSTRAINT \"select nextval('')\" UNIQUE ()"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test392");


    org.databene.jdbacl.JDBCConnectData var4 = new org.databene.jdbacl.JDBCConnectData("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).DROP SEQUENCE ", "catalog", "select nextval('alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP 'alter sequence hi! restart with 1'')", "hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.sql.Connection var6 = org.databene.jdbacl.DBUtil.connect(var4, false);
      fail("Expected exception of type org.databene.commons.ConnectFailedException");
    } catch (org.databene.commons.ConnectFailedException e) {
      // Expected exception.
    }

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test393");


    java.lang.Object[] var1 = org.databene.jdbacl.SQLUtil.parseColumnTypeAndSize("CONSTRAINT \"hi! identity by primary key\" ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test394");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    java.lang.String var9 = var0.getCharErrorDisplay(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mOR();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "'d'"+ "'", var9.equals("'d'"));

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test395");


    java.lang.Object[] var1 = org.databene.jdbacl.SQLUtil.parseColumnTypeAndSize("unique constraint");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test396");


    org.databene.jdbacl.identity.NoIdentity var1 = new org.databene.jdbacl.identity.NoIdentity("SET GENERATOR . TO -1");
    java.lang.Object[] var3 = org.databene.jdbacl.SQLUtil.parseColumnTypeAndSize("CREATE GENERATOR ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.extractPK(var3);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test397");


    org.databene.jdbacl.JDBCDriverInfo var0 = new org.databene.jdbacl.JDBCDriverInfo();
    var0.setDriverClass("hi!");
    var0.setDefaultPort("CREATE SEQUENCE 10");
    org.databene.jdbacl.dialect.DerbyDialect var5 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var7 = var5.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var8 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var9 = var8.getName();
    java.lang.String var10 = var5.formatValue((java.lang.Object)var8);
    var8.setName("'hi!'");
    java.util.List var13 = var8.getSchemas();
    java.lang.String var14 = var8.getName();
    boolean var15 = var0.equals((java.lang.Object)var8);
    var0.setDefaultDatabase("hi! as 10 on . = 10.");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "'hi!'"+ "'", var14.equals("'hi!'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test398");


    org.databene.jdbacl.model.DefaultDBTable var1 = new org.databene.jdbacl.model.DefaultDBTable();
    var1.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var4 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var5 = var4.getForeignKeyConstraints();
    var1.addReferrer((org.databene.jdbacl.model.DBTable)var4);
    org.databene.jdbacl.model.DBDataType var9 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var10 = var9.isAlpha();
    java.lang.String var11 = var9.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var12 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var15 = var12.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var17 = var12.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var18 = var9.equals((java.lang.Object)var17);
    org.databene.jdbacl.model.DefaultDBColumn var21 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var4, var9, (java.lang.Integer)0, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DefaultDBTable var22 = new org.databene.jdbacl.model.DefaultDBTable();
    var22.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var25 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var26 = var25.getForeignKeyConstraints();
    var22.addReferrer((org.databene.jdbacl.model.DBTable)var25);
    var4.addReferrer((org.databene.jdbacl.model.DBTable)var22);
    org.databene.jdbacl.model.DBSchema var29 = var22.getSchema();
    java.lang.String[] var30 = var22.getPKColumnNames();
    org.databene.jdbacl.model.DefaultDBTable var34 = new org.databene.jdbacl.model.DefaultDBTable();
    var34.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var37 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var38 = var37.getForeignKeyConstraints();
    var34.addReferrer((org.databene.jdbacl.model.DBTable)var37);
    org.databene.jdbacl.model.DBDataType var42 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var43 = var42.isAlpha();
    java.lang.String var44 = var42.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var45 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var48 = var45.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var50 = var45.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var51 = var42.equals((java.lang.Object)var50);
    org.databene.jdbacl.model.DefaultDBColumn var54 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var37, var42, (java.lang.Integer)0, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DBDataType var55 = var54.getType();
    org.databene.jdbacl.model.DefaultDBTable var56 = new org.databene.jdbacl.model.DefaultDBTable();
    var56.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var59 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var60 = var59.getForeignKeyConstraints();
    var56.addReferrer((org.databene.jdbacl.model.DBTable)var59);
    java.lang.String[] var67 = new java.lang.String[] { ""};
    java.lang.String[] var71 = new java.lang.String[] { ""};
    java.lang.String var72 = org.databene.jdbacl.SQLUtil.join("", "", var67, "hi!", "10", var71);
    org.databene.jdbacl.model.DBUniqueConstraint var73 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var59, "select nextval('')", false, var67);
    var73.addColumnName("sequence");
    var54.addUkConstraint(var73);
    org.databene.jdbacl.model.DBUniqueIndex var77 = new org.databene.jdbacl.model.DBUniqueIndex("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", false, var73);
    var22.addIndex((org.databene.jdbacl.model.DBIndex)var77);
    org.databene.jdbacl.model.DBTable var79 = var77.getTable();
    boolean var80 = var77.isNameDeterministic();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "DROP SEQUENCE "+ "'", var11.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var17.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "DROP SEQUENCE "+ "'", var44.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var50.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "hi! as 10 on . = 10."+ "'", var72.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test399");


    org.databene.jdbacl.JDBCDriverInfo var0 = new org.databene.jdbacl.JDBCDriverInfo();
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var7 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var7.setExcludeTables("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    boolean var10 = var0.equals((java.lang.Object)var7);
    var0.setDbSystem("alter sequence drop sequence 10 restart with 0");
    java.lang.String var13 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "alter sequence drop sequence 10 restart with 0"+ "'", var13.equals("alter sequence drop sequence 10 restart with 0"));

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test400");


    org.databene.jdbacl.model.DefaultDBTable var1 = new org.databene.jdbacl.model.DefaultDBTable();
    var1.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var4 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var5 = var4.getForeignKeyConstraints();
    var1.addReferrer((org.databene.jdbacl.model.DBTable)var4);
    org.databene.jdbacl.model.DBDataType var9 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var10 = var9.isAlpha();
    java.lang.String var11 = var9.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var12 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var15 = var12.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var17 = var12.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var18 = var9.equals((java.lang.Object)var17);
    org.databene.jdbacl.model.DefaultDBColumn var21 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var4, var9, (java.lang.Integer)0, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DBDataType var22 = var21.getType();
    org.databene.jdbacl.model.DefaultDBTable var23 = new org.databene.jdbacl.model.DefaultDBTable();
    var23.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var26 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var27 = var26.getForeignKeyConstraints();
    var23.addReferrer((org.databene.jdbacl.model.DBTable)var26);
    java.lang.String[] var34 = new java.lang.String[] { ""};
    java.lang.String[] var38 = new java.lang.String[] { ""};
    java.lang.String var39 = org.databene.jdbacl.SQLUtil.join("", "", var34, "hi!", "10", var38);
    org.databene.jdbacl.model.DBUniqueConstraint var40 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var26, "select nextval('')", false, var34);
    var40.addColumnName("sequence");
    var21.addUkConstraint(var40);
    java.lang.String[] var44 = var40.getColumnNames();
    java.lang.String var45 = var40.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "DROP SEQUENCE "+ "'", var11.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var17.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi! as 10 on . = 10."+ "'", var39.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "CONSTRAINT \"select nextval('')\" UNIQUE (, sequence)"+ "'", var45.equals("CONSTRAINT \"select nextval('')\" UNIQUE (, sequence)"));

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test401");


    java.lang.String[] var4 = new java.lang.String[] { ""};
    java.lang.String[] var8 = new java.lang.String[] { ""};
    java.lang.String var9 = org.databene.jdbacl.SQLUtil.join("", "", var4, "hi!", "10", var8);
    org.databene.jdbacl.identity.IdentityProvider var10 = new org.databene.jdbacl.identity.IdentityProvider();
    org.databene.jdbacl.identity.SubNkPkQueryIdentity var11 = new org.databene.jdbacl.identity.SubNkPkQueryIdentity("null", var4, var10);
    org.databene.jdbacl.identity.IdentityModel var14 = var10.getIdentity("SELECT * FROM null WHERE  = ''", false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.identity.IdentityModel var17 = var10.getIdentity("hi! as 10 on . = 10.", true);
      fail("Expected exception of type org.databene.commons.ObjectNotFoundException");
    } catch (org.databene.commons.ObjectNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi! as 10 on . = 10."+ "'", var9.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test402");


    java.lang.Object[] var1 = org.databene.jdbacl.SQLUtil.parseColumnTypeAndSize("jdbc:h2:mem:CONSTRAINT \"CREATE GENERATOR drop sequence \" ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test403");


    org.databene.jdbacl.dialect.DerbyDialect var1 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var3 = var1.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var4 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var5 = var4.getName();
    java.lang.String var6 = var1.formatValue((java.lang.Object)var4);
    var4.setName("'hi!'");
    java.util.List var9 = var4.getSchemas();
    org.databene.jdbacl.model.DBSchema var10 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var4);
    org.databene.jdbacl.model.DBCatalog var11 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var12 = var11.getName();
    org.databene.jdbacl.model.Database var13 = var11.getDatabase();
    org.databene.jdbacl.model.DBSequence var17 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    java.lang.String var18 = var17.dropDDL();
    java.math.BigInteger var19 = var17.getMinValueIfNotDefault();
    boolean var20 = var11.isIdentical((org.databene.jdbacl.model.DBObject)var17);
    org.databene.jdbacl.model.DBCatalog var21 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var22 = var21.getName();
    org.databene.jdbacl.model.Database var23 = var21.getDatabase();
    java.lang.String var24 = var21.getDoc();
    org.databene.jdbacl.dialect.DerbyDialect var26 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var28 = var26.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var29 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var30 = var29.getName();
    java.lang.String var31 = var26.formatValue((java.lang.Object)var29);
    var29.setName("'hi!'");
    java.util.List var34 = var29.getSchemas();
    org.databene.jdbacl.model.DBSchema var35 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var29);
    var21.removeSchema(var35);
    org.databene.jdbacl.dialect.DerbyDialect var39 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var41 = var39.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var42 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var43 = var42.getName();
    java.lang.String var44 = var39.formatValue((java.lang.Object)var42);
    var42.setName("'hi!'");
    java.util.List var47 = var42.getSchemas();
    org.databene.jdbacl.model.DBSchema var48 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var42);
    org.databene.jdbacl.model.DBTrigger var49 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var48);
    var49.setDescription("CREATE GENERATOR drop sequence ");
    java.lang.String var52 = var49.getTriggerBody();
    java.lang.String var53 = var49.getColumnName();
    java.lang.String var54 = var49.getWhenClause();
    var35.addTrigger(var49);
    java.util.List var56 = org.databene.jdbacl.DBUtil.dependencyOrderedTables((org.databene.jdbacl.model.TableHolder)var35);
    java.util.List var57 = var35.getTriggers();
    java.lang.String var58 = var35.getName();
    var11.removeSchema(var35);
    var10.setCatalog(var11);
    org.databene.jdbacl.model.DBSchema var62 = var11.getSchema("SubNkPkQueryIdentity(null)");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "drop sequence "+ "'", var18.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")"+ "'", var58.equals("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test404");


    org.databene.jdbacl.model.jdbc.JDBCDBImporter var6 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var6.setImportingChecks(false);
    boolean var9 = var6.isImportingIndexes();
    var6.setImportingPackages(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.Database var12 = var6.importDatabase();
      fail("Expected exception of type org.databene.commons.ConnectFailedException");
    } catch (org.databene.commons.ConnectFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test405");


    org.databene.jdbacl.JDBCDriverInfo var0 = new org.databene.jdbacl.JDBCDriverInfo();
    var0.setDriverClass("hi!");
    var0.setDefaultPort("CREATE SEQUENCE 10");
    org.databene.jdbacl.JDBCDriverInfo var5 = new org.databene.jdbacl.JDBCDriverInfo();
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var12 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var12.setExcludeTables("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    boolean var15 = var5.equals((java.lang.Object)var12);
    java.lang.String[] var19 = new java.lang.String[] { ""};
    java.lang.String[] var23 = new java.lang.String[] { ""};
    java.lang.String var24 = org.databene.jdbacl.SQLUtil.join("", "", var19, "hi!", "10", var23);
    var5.setJars(var23);
    var0.setJars(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi! as 10 on . = 10."+ "'", var24.equals("hi! as 10 on . = 10."));

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test406");


    org.databene.jdbacl.dialect.PostgreSQLDialect var0 = new org.databene.jdbacl.dialect.PostgreSQLDialect();
    boolean var3 = var0.isDefaultCatalog("", "");
    java.lang.String var5 = var0.renderDropSequence("");
    boolean var7 = var0.isDeterministicFKName("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    boolean var9 = var0.isDeterministicFKName("jdbc:h2:mem:select next value for 10");
    java.lang.String var11 = var0.renderFetchSequenceValue("");
    boolean var12 = var0.supportsRegex();
    boolean var14 = var0.isDeterministicPKName("NO_ACTION");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "drop sequence "+ "'", var5.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "select nextval('')"+ "'", var11.equals("select nextval('')"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test407");


    org.databene.jdbacl.dialect.DerbyDialect var4 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var6 = var4.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var7 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var8 = var7.getName();
    java.lang.String var9 = var4.formatValue((java.lang.Object)var7);
    var7.setName("'hi!'");
    java.util.List var12 = var7.getSchemas();
    org.databene.jdbacl.model.DBSchema var13 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var7);
    org.databene.jdbacl.model.DBTrigger var14 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var13);
    java.util.List var15 = var13.getPackages();
    org.databene.jdbacl.model.DBPackage var16 = new org.databene.jdbacl.model.DBPackage("CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).", var13);
    java.util.List var17 = var16.getComponents();
    org.databene.jdbacl.model.DBProcedure var18 = new org.databene.jdbacl.model.DBProcedure("CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var16);
    org.databene.jdbacl.dialect.DerbyDialect var23 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var25 = var23.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var26 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var27 = var26.getName();
    java.lang.String var28 = var23.formatValue((java.lang.Object)var26);
    var26.setName("'hi!'");
    java.util.List var31 = var26.getSchemas();
    org.databene.jdbacl.model.DBSchema var32 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var26);
    org.databene.jdbacl.model.DBTrigger var33 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var32);
    java.util.List var34 = var32.getPackages();
    org.databene.jdbacl.model.DBPackage var35 = new org.databene.jdbacl.model.DBPackage("CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).", var32);
    java.util.List var36 = var35.getComponents();
    org.databene.jdbacl.model.DBProcedure var37 = new org.databene.jdbacl.model.DBProcedure("CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var35);
    var16.addProcedure(var37);
    java.util.List var39 = var16.getProcedures();
    var16.setObjectId("null.jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    var16.setObjectId("CREATE GENERATOR jdbc:h2:mem:hi! as 10 on . = 10.");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test408");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.skip();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var3 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var5 = var3.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var3);
    org.databene.jdbacl.sql.parser.SQLLexer var7 = new org.databene.jdbacl.sql.parser.SQLLexer();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var9 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var9.release((-1));
    boolean var13 = var7.mismatchIsUnwantedToken((org.antlr.runtime.IntStream)var9, 0);
    var0.setCharStream((org.antlr.runtime.CharStream)var9);
    var0.mIDENTIFIER();
    var0.mSIZE();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mT__115();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test409");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.jdbc.JDBCDBImporter var1 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("org.databene.jdbacl.SQLScriptException: Error in execution of script CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT line -1: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1: ");
      fail("Expected exception of type org.databene.commons.ConfigurationError");
    } catch (org.databene.commons.ConfigurationError e) {
      // Expected exception.
    }

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test410");


    org.databene.jdbacl.dialect.DerbyDialect var1 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var3 = var1.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var4 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var5 = var4.getName();
    java.lang.String var6 = var1.formatValue((java.lang.Object)var4);
    var4.setName("'hi!'");
    java.util.List var9 = var4.getSchemas();
    org.databene.jdbacl.model.DBSchema var10 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var4);
    org.databene.jdbacl.model.DBCatalog var11 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var12 = var11.getName();
    org.databene.jdbacl.model.Database var13 = var11.getDatabase();
    org.databene.jdbacl.model.DBSequence var17 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    java.lang.String var18 = var17.dropDDL();
    java.math.BigInteger var19 = var17.getMinValueIfNotDefault();
    boolean var20 = var11.isIdentical((org.databene.jdbacl.model.DBObject)var17);
    org.databene.jdbacl.model.DBCatalog var21 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var22 = var21.getName();
    org.databene.jdbacl.model.Database var23 = var21.getDatabase();
    java.lang.String var24 = var21.getDoc();
    org.databene.jdbacl.dialect.DerbyDialect var26 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var28 = var26.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var29 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var30 = var29.getName();
    java.lang.String var31 = var26.formatValue((java.lang.Object)var29);
    var29.setName("'hi!'");
    java.util.List var34 = var29.getSchemas();
    org.databene.jdbacl.model.DBSchema var35 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var29);
    var21.removeSchema(var35);
    org.databene.jdbacl.dialect.DerbyDialect var39 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var41 = var39.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var42 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var43 = var42.getName();
    java.lang.String var44 = var39.formatValue((java.lang.Object)var42);
    var42.setName("'hi!'");
    java.util.List var47 = var42.getSchemas();
    org.databene.jdbacl.model.DBSchema var48 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var42);
    org.databene.jdbacl.model.DBTrigger var49 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var48);
    var49.setDescription("CREATE GENERATOR drop sequence ");
    java.lang.String var52 = var49.getTriggerBody();
    java.lang.String var53 = var49.getColumnName();
    java.lang.String var54 = var49.getWhenClause();
    var35.addTrigger(var49);
    java.util.List var56 = org.databene.jdbacl.DBUtil.dependencyOrderedTables((org.databene.jdbacl.model.TableHolder)var35);
    java.util.List var57 = var35.getTriggers();
    java.lang.String var58 = var35.getName();
    var11.removeSchema(var35);
    var10.setCatalog(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.DBTable var62 = var11.getTable("drop sequence alter sequence hi! restart with 1");
      fail("Expected exception of type org.databene.commons.ObjectNotFoundException");
    } catch (org.databene.commons.ObjectNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "drop sequence "+ "'", var18.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")"+ "'", var58.equals("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")"));

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test411");


    org.databene.jdbacl.SQLScriptException var1 = new org.databene.jdbacl.SQLScriptException(1);
    org.databene.jdbacl.SQLScriptException var3 = var1.withUri("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT");
    org.databene.jdbacl.SQLScriptException var6 = new org.databene.jdbacl.SQLScriptException((java.lang.Throwable)var1, "CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", (-1));
    java.lang.Throwable[] var7 = var1.getSuppressed();
    java.util.List var9 = org.antlr.runtime.BaseRecognizer.getRuleInvocationStack((java.lang.Throwable)var1, "drop generator CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test412");


    org.databene.jdbacl.model.DefaultDBTable var0 = new org.databene.jdbacl.model.DefaultDBTable();
    var0.setDoc(".");
    java.util.Set var4 = var0.getUniqueConstraints(false);
    org.databene.jdbacl.model.DefaultDBTable var6 = new org.databene.jdbacl.model.DefaultDBTable();
    var6.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var9 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var10 = var9.getForeignKeyConstraints();
    var6.addReferrer((org.databene.jdbacl.model.DBTable)var9);
    org.databene.jdbacl.model.DBDataType var14 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var15 = var14.isAlpha();
    java.lang.String var16 = var14.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var17 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var20 = var17.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var22 = var17.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var23 = var14.equals((java.lang.Object)var22);
    org.databene.jdbacl.model.DefaultDBColumn var26 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var9, var14, (java.lang.Integer)0, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DefaultDBTable var27 = new org.databene.jdbacl.model.DefaultDBTable();
    var27.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var30 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var31 = var30.getForeignKeyConstraints();
    var27.addReferrer((org.databene.jdbacl.model.DBTable)var30);
    var9.addReferrer((org.databene.jdbacl.model.DBTable)var27);
    org.databene.jdbacl.model.TableContainer var38 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var39 = var38.getTables();
    org.databene.jdbacl.model.TableContainer var40 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var38);
    org.databene.jdbacl.model.DefaultDBTable var41 = new org.databene.jdbacl.model.DefaultDBTable();
    var41.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var44 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var45 = var44.getForeignKeyConstraints();
    var41.addReferrer((org.databene.jdbacl.model.DBTable)var44);
    var38.addTable((org.databene.jdbacl.model.DBTable)var44);
    java.lang.String[] var52 = new java.lang.String[] { ""};
    java.lang.String[] var56 = new java.lang.String[] { ""};
    java.lang.String var57 = org.databene.jdbacl.SQLUtil.join("", "", var52, "hi!", "10", var56);
    java.lang.String var58 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var52);
    org.databene.jdbacl.model.TableContainer var61 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var62 = var61.getTables();
    org.databene.jdbacl.model.TableContainer var63 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var61);
    org.databene.jdbacl.model.DefaultDBTable var64 = new org.databene.jdbacl.model.DefaultDBTable();
    var64.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var67 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var68 = var67.getForeignKeyConstraints();
    var64.addReferrer((org.databene.jdbacl.model.DBTable)var67);
    var61.addTable((org.databene.jdbacl.model.DBTable)var67);
    java.lang.String[] var73 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var74 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var73);
    org.databene.jdbacl.model.DBForeignKeyConstraint var75 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var44, var52, (org.databene.jdbacl.model.DBTable)var67, var73);
    org.databene.jdbacl.model.DBTable var76 = var75.getRefereeTable();
    var9.addForeignKey(var75);
    java.lang.String[] var78 = var75.getColumnNames();
    var0.addForeignKey(var75);
    var75.setName("CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var82 = org.databene.jdbacl.DBUtil.containsMandatoryColumn((org.databene.jdbacl.model.DBConstraint)var75);
      fail("Expected exception of type org.databene.commons.ObjectNotFoundException");
    } catch (org.databene.commons.ObjectNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "DROP SEQUENCE "+ "'", var16.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var22.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "hi! as 10 on . = 10."+ "'", var57.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "."+ "'", var58.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var74.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test413");


    java.lang.Boolean var1 = org.databene.jdbacl.SQLUtil.mutatesStructure("jdbc:hsqldb:mem:left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as CREATE GENERATOR  on jdbc:h2:mem:hi! as 10 on . = 10.-identity-..DROP SEQUENCE  = CREATE GENERATOR . REGEXP 'drop sequence '");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + false+ "'", var1.equals(false));

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test414");


    org.databene.jdbacl.model.DefaultDBTable var1 = new org.databene.jdbacl.model.DefaultDBTable();
    var1.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var4 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var5 = var4.getForeignKeyConstraints();
    var1.addReferrer((org.databene.jdbacl.model.DBTable)var4);
    org.databene.jdbacl.model.DBDataType var9 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var10 = var9.isAlpha();
    java.lang.String var11 = var9.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var12 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var15 = var12.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var17 = var12.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var18 = var9.equals((java.lang.Object)var17);
    org.databene.jdbacl.model.DefaultDBColumn var21 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var4, var9, (java.lang.Integer)0, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DefaultDBTable var22 = new org.databene.jdbacl.model.DefaultDBTable();
    var22.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var25 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var26 = var25.getForeignKeyConstraints();
    var22.addReferrer((org.databene.jdbacl.model.DBTable)var25);
    var4.addReferrer((org.databene.jdbacl.model.DBTable)var22);
    org.databene.jdbacl.model.TableContainer var33 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var34 = var33.getTables();
    org.databene.jdbacl.model.TableContainer var35 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var33);
    org.databene.jdbacl.model.DefaultDBTable var36 = new org.databene.jdbacl.model.DefaultDBTable();
    var36.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var39 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var40 = var39.getForeignKeyConstraints();
    var36.addReferrer((org.databene.jdbacl.model.DBTable)var39);
    var33.addTable((org.databene.jdbacl.model.DBTable)var39);
    java.lang.String[] var47 = new java.lang.String[] { ""};
    java.lang.String[] var51 = new java.lang.String[] { ""};
    java.lang.String var52 = org.databene.jdbacl.SQLUtil.join("", "", var47, "hi!", "10", var51);
    java.lang.String var53 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var47);
    org.databene.jdbacl.model.TableContainer var56 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var57 = var56.getTables();
    org.databene.jdbacl.model.TableContainer var58 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var56);
    org.databene.jdbacl.model.DefaultDBTable var59 = new org.databene.jdbacl.model.DefaultDBTable();
    var59.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var62 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var63 = var62.getForeignKeyConstraints();
    var59.addReferrer((org.databene.jdbacl.model.DBTable)var62);
    var56.addTable((org.databene.jdbacl.model.DBTable)var62);
    java.lang.String[] var68 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var69 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var68);
    org.databene.jdbacl.model.DBForeignKeyConstraint var70 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var39, var47, (org.databene.jdbacl.model.DBTable)var62, var68);
    org.databene.jdbacl.model.DBTable var71 = var70.getRefereeTable();
    var4.addForeignKey(var70);
    org.databene.jdbacl.model.FKChangeRule var73 = var70.getDeleteRule();
    java.lang.String var74 = var73.toString();
    java.lang.String var75 = var73.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "DROP SEQUENCE "+ "'", var11.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var17.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi! as 10 on . = 10."+ "'", var52.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "."+ "'", var53.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var69.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "NO_ACTION"+ "'", var74.equals("NO_ACTION"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "NO_ACTION"+ "'", var75.equals("NO_ACTION"));

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test415");


    org.databene.jdbacl.dialect.FirebirdDialect var0 = new org.databene.jdbacl.dialect.FirebirdDialect();
    boolean var2 = var0.isDeterministicUKName("10");
    java.lang.String var4 = var0.renderDropSequence("sequence");
    boolean var6 = var0.isDeterministicUKName("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)");
    boolean var8 = var0.isDeterministicIndexName("alter sequence CREATE GENERATOR drop sequence  restart with -1");
    boolean var10 = var0.isDeterministicFKName("()");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "drop generator sequence"+ "'", var4.equals("drop generator sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test416");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    int var11 = var4.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.script.Expression var12 = org.databene.jdbacl.sql.SQLParserUtil.parseExpression((org.antlr.runtime.CharStream)var4);
      fail("Expected exception of type org.databene.commons.SyntaxError");
    } catch (org.databene.commons.SyntaxError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 14);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test417");


    org.databene.jdbacl.dialect.FirebirdDialect var0 = new org.databene.jdbacl.dialect.FirebirdDialect();
    boolean var2 = var0.isDeterministicUKName("10");
    java.lang.String var4 = var0.renderDropSequence("sequence");
    boolean var7 = var0.isDefaultSchema("alter sequence  restart with -1", "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)");
    org.databene.jdbacl.model.DBSequence var11 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    java.lang.String var12 = var11.dropDDL();
    java.math.BigInteger var13 = var11.getMinValueIfNotDefault();
    java.math.BigInteger var14 = var11.getLastNumber();
    org.databene.jdbacl.model.DBSequence var18 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var18.setName("10");
    java.math.BigInteger var21 = var18.getIncrement();
    java.math.BigInteger var22 = var18.getIncrement();
    var11.setStart(var22);
    java.lang.String var24 = var0.renderCreateSequence(var11);
    org.databene.jdbacl.model.DBSequence var28 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    java.lang.String var29 = var28.dropDDL();
    java.lang.String var30 = org.databene.jdbacl.SQLUtil.ownerDotComponent((org.databene.jdbacl.model.DBObject)var28);
    java.lang.String var31 = var0.renderCreateSequence(var28);
    java.lang.String var32 = var28.dropDDL();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "drop generator sequence"+ "'", var4.equals("drop generator sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "drop sequence "+ "'", var12.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "CREATE GENERATOR "+ "'", var24.equals("CREATE GENERATOR "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "drop sequence "+ "'", var29.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "CREATE GENERATOR "+ "'", var31.equals("CREATE GENERATOR "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "drop sequence "+ "'", var32.equals("drop sequence "));

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test418");


    org.databene.jdbacl.model.DBDataType var2 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var3 = var2.isAlpha();
    java.lang.String var4 = var2.getName();
    boolean var5 = var2.isAlpha();
    boolean var6 = var2.isNumber();
    boolean var7 = var2.isTemporal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "DROP SEQUENCE "+ "'", var4.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test419");


    org.databene.jdbacl.dialect.DerbyDialect var2 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var4 = var2.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var5 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var6 = var5.getName();
    java.lang.String var7 = var2.formatValue((java.lang.Object)var5);
    var5.setName("'hi!'");
    java.util.List var10 = var5.getSchemas();
    org.databene.jdbacl.model.DBSchema var11 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var5);
    org.databene.jdbacl.model.DBTrigger var12 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var11);
    var12.setDescription("CREATE GENERATOR drop sequence ");
    org.databene.jdbacl.model.DefaultDBTable var16 = new org.databene.jdbacl.model.DefaultDBTable();
    var16.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var19 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var20 = var19.getForeignKeyConstraints();
    var16.addReferrer((org.databene.jdbacl.model.DBTable)var19);
    org.databene.jdbacl.model.DBDataType var24 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var25 = var24.isAlpha();
    java.lang.String var26 = var24.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var27 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var30 = var27.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var32 = var27.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var33 = var24.equals((java.lang.Object)var32);
    org.databene.jdbacl.model.DefaultDBColumn var36 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var19, var24, (java.lang.Integer)0, (java.lang.Integer)(-1));
    boolean var37 = var12.isIdentical((org.databene.jdbacl.model.DBObject)var36);
    java.lang.String[] var43 = new java.lang.String[] { ""};
    java.lang.String[] var47 = new java.lang.String[] { ""};
    java.lang.String var48 = org.databene.jdbacl.SQLUtil.join("", "", var43, "hi!", "10", var47);
    java.lang.String var49 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var43);
    java.lang.String[] var56 = new java.lang.String[] { ""};
    java.lang.String[] var60 = new java.lang.String[] { ""};
    java.lang.String var61 = org.databene.jdbacl.SQLUtil.join("", "", var56, "hi!", "10", var60);
    java.lang.String var62 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var60);
    java.lang.String var63 = org.databene.jdbacl.SQLUtil.leftJoin("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE ", var43, "jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1)", "drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)", var60);
    boolean var64 = var36.equals((java.lang.Object)"drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)");
    org.databene.jdbacl.model.DefaultDBTable var66 = new org.databene.jdbacl.model.DefaultDBTable();
    var66.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var69 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var70 = var69.getForeignKeyConstraints();
    var66.addReferrer((org.databene.jdbacl.model.DBTable)var69);
    java.lang.String[] var77 = new java.lang.String[] { ""};
    java.lang.String[] var81 = new java.lang.String[] { ""};
    java.lang.String var82 = org.databene.jdbacl.SQLUtil.join("", "", var77, "hi!", "10", var81);
    org.databene.jdbacl.model.DBUniqueConstraint var83 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var69, "select nextval('')", false, var77);
    org.databene.jdbacl.model.DBDataType var86 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var87 = var86.isAlpha();
    org.databene.jdbacl.model.DefaultDBColumn var88 = new org.databene.jdbacl.model.DefaultDBColumn("'hi!'", (org.databene.jdbacl.model.DBTable)var69, var86);
    java.lang.String var89 = var86.getName();
    var36.setType(var86);
    java.lang.String var91 = var86.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "DROP SEQUENCE "+ "'", var26.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var32.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi! as 10 on . = 10."+ "'", var48.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "."+ "'", var49.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "hi! as 10 on . = 10."+ "'", var61.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "."+ "'", var62.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)."+ "'", var63.equals("left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + "hi! as 10 on . = 10."+ "'", var82.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var89 + "' != '" + "DROP SEQUENCE "+ "'", var89.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var91 + "' != '" + "DROP SEQUENCE "+ "'", var91.equals("DROP SEQUENCE "));

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test420");


    org.databene.jdbacl.model.DBSequence var3 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    java.math.BigInteger var4 = var3.getMaxValue();
    org.databene.jdbacl.model.DBCatalog var5 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var6 = var5.getName();
    org.databene.jdbacl.model.Database var7 = var5.getDatabase();
    java.lang.String var8 = var5.getDoc();
    org.databene.jdbacl.dialect.DerbyDialect var10 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var12 = var10.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var13 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var14 = var13.getName();
    java.lang.String var15 = var10.formatValue((java.lang.Object)var13);
    var13.setName("'hi!'");
    java.util.List var18 = var13.getSchemas();
    org.databene.jdbacl.model.DBSchema var19 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var13);
    var5.removeSchema(var19);
    org.databene.jdbacl.dialect.DerbyDialect var23 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var25 = var23.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var26 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var27 = var26.getName();
    java.lang.String var28 = var23.formatValue((java.lang.Object)var26);
    var26.setName("'hi!'");
    java.util.List var31 = var26.getSchemas();
    org.databene.jdbacl.model.DBSchema var32 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var26);
    org.databene.jdbacl.model.DBTrigger var33 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var32);
    var33.setDescription("CREATE GENERATOR drop sequence ");
    java.lang.String var36 = var33.getTriggerBody();
    java.lang.String var37 = var33.getColumnName();
    java.lang.String var38 = var33.getWhenClause();
    var19.addTrigger(var33);
    boolean var40 = var3.isIdentical((org.databene.jdbacl.model.DBObject)var19);
    var3.setCycle((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test421");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.mT__107();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test422");


    org.databene.jdbacl.dialect.H2Dialect var0 = new org.databene.jdbacl.dialect.H2Dialect();
    java.lang.String var2 = var0.renderFetchSequenceValue("SET GENERATOR . TO -1");
    boolean var4 = var0.isDeterministicPKName("'hi!'");
    java.lang.String var6 = var0.renderFetchSequenceValue("CONSTRAINT \"select nextval('')\" UNIQUE (, NaturalPkIdentity(hi!))");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "select next value for SET GENERATOR . TO -1"+ "'", var2.equals("select next value for SET GENERATOR . TO -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "select next value for CONSTRAINT \"select nextval('')\" UNIQUE (, NaturalPkIdentity(hi!))"+ "'", var6.equals("select next value for CONSTRAINT \"select nextval('')\" UNIQUE (, NaturalPkIdentity(hi!))"));

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test423");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.skip();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var3 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var5 = var3.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var3);
    var0.mCREATE_INDEX();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mT__135();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 69);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test424");


    org.databene.jdbacl.SQLScriptException var1 = new org.databene.jdbacl.SQLScriptException(1);
    org.databene.jdbacl.SQLScriptException var3 = var1.withUri("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT");
    org.databene.jdbacl.SQLScriptException var6 = new org.databene.jdbacl.SQLScriptException((java.lang.Throwable)var1, "CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", (-1));
    java.lang.Throwable[] var7 = var1.getSuppressed();
    org.databene.jdbacl.identity.InvalidIdentityDefinitionError var8 = new org.databene.jdbacl.identity.InvalidIdentityDefinitionError((java.lang.Throwable)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test425");


    org.databene.jdbacl.dialect.OracleDialect var0 = new org.databene.jdbacl.dialect.OracleDialect();
    boolean var3 = var0.isDefaultSchema("select next value for 10", "NaturalPkIdentity(hi!)");
    boolean var4 = var0.supportsRegex();
    java.lang.String var6 = var0.renderFetchSequenceValue("hi! as 10 on . = 10..NOT drop generator sequence ~ 'hi!', hi! as 10 on . = 10..alter sequence CREATE GENERATOR drop sequence  restart with -1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "select hi! as 10 on . = 10..NOT drop generator sequence ~ 'hi!', hi! as 10 on . = 10..alter sequence CREATE GENERATOR drop sequence  restart with -1.nextval from dual"+ "'", var6.equals("select hi! as 10 on . = 10..NOT drop generator sequence ~ 'hi!', hi! as 10 on . = 10..alter sequence CREATE GENERATOR drop sequence  restart with -1.nextval from dual"));

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test426");


    org.databene.jdbacl.model.DBCatalog var0 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var1 = var0.getName();
    org.databene.jdbacl.model.Database var2 = var0.getDatabase();
    org.databene.jdbacl.model.DBSequence var6 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    java.lang.String var7 = var6.dropDDL();
    java.math.BigInteger var8 = var6.getMinValueIfNotDefault();
    boolean var9 = var0.isIdentical((org.databene.jdbacl.model.DBObject)var6);
    org.databene.jdbacl.model.DBTreeModel var10 = new org.databene.jdbacl.model.DBTreeModel((org.databene.jdbacl.model.CompositeDBObject)var0);
    org.databene.jdbacl.dialect.DerbyDialect var15 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var17 = var15.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var18 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var19 = var18.getName();
    java.lang.String var20 = var15.formatValue((java.lang.Object)var18);
    var18.setName("'hi!'");
    java.util.List var23 = var18.getSchemas();
    org.databene.jdbacl.model.DBSchema var24 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var18);
    org.databene.jdbacl.model.DBTrigger var25 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var24);
    java.util.List var26 = var24.getPackages();
    org.databene.jdbacl.model.DBPackage var27 = new org.databene.jdbacl.model.DBPackage("CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).", var24);
    java.util.List var28 = var27.getComponents();
    org.databene.jdbacl.model.DBProcedure var29 = new org.databene.jdbacl.model.DBProcedure("CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var27);
    java.lang.String var30 = var29.getSubProgramId();
    var29.setSubProgramId("jdbc:h2:mem:select next value for 10");
    java.lang.String var33 = var29.getSubProgramId();
    java.lang.String var34 = var29.getSubProgramId();
    boolean var35 = var10.isLeaf((org.databene.jdbacl.model.DBObject)var29);
    var29.setObjectId("SELECT NEXT VALUE FOR SET GENERATOR.TO - 1 NOT REGEXP 'HI!'");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "drop sequence "+ "'", var7.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "jdbc:h2:mem:select next value for 10"+ "'", var33.equals("jdbc:h2:mem:select next value for 10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "jdbc:h2:mem:select next value for 10"+ "'", var34.equals("jdbc:h2:mem:select next value for 10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test427");


    org.databene.jdbacl.dialect.FirebirdDialect var0 = new org.databene.jdbacl.dialect.FirebirdDialect();
    java.lang.String var3 = var0.renderSetSequenceValue(".", 0L);
    boolean var5 = var0.isDeterministicUKName("hi! identity by primary key");
    boolean var6 = var0.isSequenceBoundarySupported();
    org.databene.jdbacl.model.DBSequence var10 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var10.setCache((java.lang.Long)100L);
    java.lang.String var13 = var10.getObjectType();
    java.math.BigInteger var14 = var10.getIncrementIfNotDefault();
    java.lang.String var15 = var0.renderCreateSequence(var10);
    java.lang.String var17 = var0.renderDropSequence("left join alter sequence CREATE GENERATOR drop sequence  restart with -1 as call next value for 'hi!' on jdbc:h2:mem:org.databene.jdbacl.SQLScriptException: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1: . = call next value for 'hi!'.DROP SEQUENCE ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "SET GENERATOR . TO -1"+ "'", var3.equals("SET GENERATOR . TO -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "sequence"+ "'", var13.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "CREATE GENERATOR "+ "'", var15.equals("CREATE GENERATOR "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "drop generator left join alter sequence CREATE GENERATOR drop sequence  restart with -1 as call next value for 'hi!' on jdbc:h2:mem:org.databene.jdbacl.SQLScriptException: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1: . = call next value for 'hi!'.DROP SEQUENCE "+ "'", var17.equals("drop generator left join alter sequence CREATE GENERATOR drop sequence  restart with -1 as call next value for 'hi!' on jdbc:h2:mem:org.databene.jdbacl.SQLScriptException: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1: . = call next value for 'hi!'.DROP SEQUENCE "));

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test428");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    java.lang.String var9 = var0.getCharErrorDisplay(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mT__67();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "'d'"+ "'", var9.equals("'d'"));

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test429");


    org.databene.jdbacl.JDBCDriverInfo var0 = new org.databene.jdbacl.JDBCDriverInfo();
    var0.setDriverClass("hi!");
    var0.setDefaultPort("CREATE SEQUENCE 10");
    var0.setDriverClass("drop sequence ");
    var0.setId("CONSTRAINT \"select nextval('')\" UNIQUE ()");
    var0.setId("REGEXP_MATCHES(No identity defined for table DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT, 'alter sequence CREATE SEQUENCE 10 restart with 1')");
    java.lang.String var11 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "REGEXP_MATCHES(No identity defined for table DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT, 'alter sequence CREATE SEQUENCE 10 restart with 1')"+ "'", var11.equals("REGEXP_MATCHES(No identity defined for table DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT, 'alter sequence CREATE SEQUENCE 10 restart with 1')"));

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test430");


    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var1 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).)");
    int var2 = var1.mark();
    int var3 = var1.getCharPositionInLine();
    int var4 = var1.getLine();
    int var5 = var1.getCharPositionInLine();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test431");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.sql.Statement var3 = org.databene.jdbacl.dialect.HSQLUtil.shutdown("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE ", "CONSTRAINT \"hi! identity by primary key\" ", "jdbc:hsqldb:mem:jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
      fail("Expected exception of type java.sql.SQLException");
    } catch (java.sql.SQLException e) {
      // Expected exception.
    }

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test432");


    org.databene.jdbacl.dialect.DerbyDialect var1 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var3 = var1.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var4 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var5 = var4.getName();
    java.lang.String var6 = var1.formatValue((java.lang.Object)var4);
    var4.setName("'hi!'");
    java.util.List var9 = var4.getSchemas();
    org.databene.jdbacl.model.DBSchema var10 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var4);
    org.databene.jdbacl.dialect.DerbyDialect var13 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var15 = var13.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var16 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var17 = var16.getName();
    java.lang.String var18 = var13.formatValue((java.lang.Object)var16);
    var16.setName("'hi!'");
    java.util.List var21 = var16.getSchemas();
    org.databene.jdbacl.model.DBSchema var22 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var16);
    org.databene.jdbacl.model.DBTrigger var23 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var22);
    var10.addTrigger(var23);
    var23.setActionType("\"sequence\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test433");


    org.databene.jdbacl.model.jdbc.JDBCDBImporter var6 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var6.setImportingIndexes(true);
    org.databene.jdbacl.model.cache.CachingDBImporter var10 = new org.databene.jdbacl.model.cache.CachingDBImporter((org.databene.jdbacl.model.DBMetaDataImporter)var6, "hi! identity by primary key");
    var10.close();

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test434");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mT__132();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test435");


    org.databene.jdbacl.model.DefaultDBTable var3 = new org.databene.jdbacl.model.DefaultDBTable();
    var3.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var6 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var7 = var6.getForeignKeyConstraints();
    var3.addReferrer((org.databene.jdbacl.model.DBTable)var6);
    org.databene.jdbacl.model.DBDataType var11 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var12 = var11.isAlpha();
    java.lang.String var13 = var11.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var14 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var17 = var14.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var19 = var14.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var20 = var11.equals((java.lang.Object)var19);
    org.databene.jdbacl.model.DefaultDBColumn var23 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var6, var11, (java.lang.Integer)0, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DBDataType var24 = var23.getType();
    org.databene.jdbacl.model.DefaultDBTable var25 = new org.databene.jdbacl.model.DefaultDBTable();
    var25.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var28 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var29 = var28.getForeignKeyConstraints();
    var25.addReferrer((org.databene.jdbacl.model.DBTable)var28);
    java.lang.String[] var36 = new java.lang.String[] { ""};
    java.lang.String[] var40 = new java.lang.String[] { ""};
    java.lang.String var41 = org.databene.jdbacl.SQLUtil.join("", "", var36, "hi!", "10", var40);
    org.databene.jdbacl.model.DBUniqueConstraint var42 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var28, "select nextval('')", false, var36);
    var42.addColumnName("sequence");
    var23.addUkConstraint(var42);
    org.databene.jdbacl.model.DBUniqueIndex var46 = new org.databene.jdbacl.model.DBUniqueIndex("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", false, var42);
    org.databene.jdbacl.model.DefaultDBTable var47 = new org.databene.jdbacl.model.DefaultDBTable();
    var47.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var50 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var51 = var50.getForeignKeyConstraints();
    var47.addReferrer((org.databene.jdbacl.model.DBTable)var50);
    java.lang.String[] var58 = new java.lang.String[] { ""};
    java.lang.String[] var62 = new java.lang.String[] { ""};
    java.lang.String var63 = org.databene.jdbacl.SQLUtil.join("", "", var58, "hi!", "10", var62);
    org.databene.jdbacl.model.DBUniqueConstraint var64 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var50, "select nextval('')", false, var58);
    boolean var65 = var46.equals((java.lang.Object)false);
    java.lang.String var66 = var46.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "DROP SEQUENCE "+ "'", var13.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var19.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi! as 10 on . = 10."+ "'", var41.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "hi! as 10 on . = 10."+ "'", var63.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT"+ "'", var66.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT"));

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test436");


    org.databene.jdbacl.dialect.DerbyDialect var4 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var6 = var4.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var7 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var8 = var7.getName();
    java.lang.String var9 = var4.formatValue((java.lang.Object)var7);
    var7.setName("'hi!'");
    java.util.List var12 = var7.getSchemas();
    org.databene.jdbacl.model.DBSchema var13 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var7);
    org.databene.jdbacl.model.DBTrigger var14 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var13);
    java.util.List var15 = var13.getPackages();
    org.databene.jdbacl.model.DBPackage var16 = new org.databene.jdbacl.model.DBPackage("CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).", var13);
    java.util.List var17 = var16.getComponents();
    org.databene.jdbacl.model.DBProcedure var18 = new org.databene.jdbacl.model.DBProcedure("CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var16);
    java.lang.String var19 = var18.getSubProgramId();
    java.lang.String var20 = org.databene.jdbacl.SQLUtil.typeAndName((org.databene.jdbacl.model.DBObject)var18);
    var18.setObjectId("DROP SEQUENCE NOT drop generator sequence ~ 'hi!' RESTRICT");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "procedure CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT"+ "'", var20.equals("procedure CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT"));

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test437");


    org.databene.jdbacl.model.jdbc.JDBCDBImporter var6 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var6.setImportingIndexes(true);
    var6.close();
    var6.setExcludeTables("alter sequence hi! restart with 1");
    org.databene.jdbacl.model.cache.CachingDBImporter var13 = new org.databene.jdbacl.model.cache.CachingDBImporter((org.databene.jdbacl.model.DBMetaDataImporter)var6, "select nextval('CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT')");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.Database var14 = var13.importDatabase();
      fail("Expected exception of type org.databene.commons.ConnectFailedException");
    } catch (org.databene.commons.ConnectFailedException e) {
      // Expected exception.
    }

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test438");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.sql.parser.ANTLRNoCaseFileStream var1 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseFileStream("alter sequence CREATE SEQUENCE 10 restart with 1");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test439");


    org.databene.jdbacl.dialect.PostgreSQLDialect var0 = new org.databene.jdbacl.dialect.PostgreSQLDialect();
    boolean var3 = var0.isDefaultCatalog("", "");
    java.lang.String var5 = var0.renderDropSequence("");
    boolean var7 = var0.isDeterministicFKName("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    boolean var9 = var0.isDeterministicFKName("jdbc:h2:mem:select next value for 10");
    boolean var12 = var0.isDefaultCatalog("NO_ACTION", "select next value for SET GENERATOR . TO -1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "drop sequence "+ "'", var5.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test440");


    org.databene.jdbacl.dialect.OracleDialect var0 = new org.databene.jdbacl.dialect.OracleDialect();
    boolean var2 = var0.isDeterministicUKName("alter sequence CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT restart with 1");
    boolean var4 = var0.isDeterministicPKName("org.firebirdsql.jdbc.FBDriver");
    org.databene.jdbacl.model.TableContainer var11 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var12 = var11.getTables();
    org.databene.jdbacl.model.TableContainer var13 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var11);
    org.databene.jdbacl.model.DefaultDBTable var14 = new org.databene.jdbacl.model.DefaultDBTable();
    var14.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var17 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var18 = var17.getForeignKeyConstraints();
    var14.addReferrer((org.databene.jdbacl.model.DBTable)var17);
    var11.addTable((org.databene.jdbacl.model.DBTable)var17);
    java.lang.String[] var25 = new java.lang.String[] { ""};
    java.lang.String[] var29 = new java.lang.String[] { ""};
    java.lang.String var30 = org.databene.jdbacl.SQLUtil.join("", "", var25, "hi!", "10", var29);
    java.lang.String var31 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var25);
    org.databene.jdbacl.model.TableContainer var34 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var35 = var34.getTables();
    org.databene.jdbacl.model.TableContainer var36 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var34);
    org.databene.jdbacl.model.DefaultDBTable var37 = new org.databene.jdbacl.model.DefaultDBTable();
    var37.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var40 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var41 = var40.getForeignKeyConstraints();
    var37.addReferrer((org.databene.jdbacl.model.DBTable)var40);
    var34.addTable((org.databene.jdbacl.model.DBTable)var40);
    java.lang.String[] var46 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var47 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var46);
    org.databene.jdbacl.model.DBForeignKeyConstraint var48 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var17, var25, (org.databene.jdbacl.model.DBTable)var40, var46);
    java.lang.String[] var49 = var48.getRefereeColumnNames();
    java.lang.String[] var50 = var48.getForeignKeyColumnNames();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var51 = var0.renderCase("CREATE SEQUENCE  CACHE 100", "drop generator DROP SEQUENCE NOT drop generator sequence ~ 'hi!' RESTRICT identity by primary key", var50);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi! as 10 on . = 10."+ "'", var30.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "."+ "'", var31.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var47.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test441");


    org.databene.jdbacl.model.DBSequence var3 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    java.lang.String var4 = var3.dropDDL();
    java.lang.String var5 = org.databene.jdbacl.SQLUtil.ownerDotComponent((org.databene.jdbacl.model.DBObject)var3);
    org.databene.jdbacl.model.DefaultDBTable var7 = new org.databene.jdbacl.model.DefaultDBTable();
    var7.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var10 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var11 = var10.getForeignKeyConstraints();
    var7.addReferrer((org.databene.jdbacl.model.DBTable)var10);
    org.databene.jdbacl.model.DBDataType var15 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var16 = var15.isAlpha();
    java.lang.String var17 = var15.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var18 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var21 = var18.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var23 = var18.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var24 = var15.equals((java.lang.Object)var23);
    org.databene.jdbacl.model.DefaultDBColumn var27 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var10, var15, (java.lang.Integer)0, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DBDataType var28 = var27.getType();
    org.databene.jdbacl.model.DBDataType var31 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var32 = var31.isAlpha();
    java.lang.String var33 = var31.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var34 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var37 = var34.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var39 = var34.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var40 = var31.equals((java.lang.Object)var39);
    var27.setType(var31);
    boolean var42 = var3.isIdentical((org.databene.jdbacl.model.DBObject)var27);
    org.databene.jdbacl.model.DBForeignKeyConstraint var43 = var27.getForeignKeyConstraint();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "drop sequence "+ "'", var4.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "DROP SEQUENCE "+ "'", var17.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var23.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "DROP SEQUENCE "+ "'", var33.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var39.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test442");


    org.databene.jdbacl.dialect.PostgreSQLDialect var0 = new org.databene.jdbacl.dialect.PostgreSQLDialect();
    boolean var3 = var0.isDefaultCatalog("", "");
    java.lang.String var5 = var0.renderDropSequence("");
    boolean var7 = var0.isDeterministicFKName("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    java.lang.String var9 = var0.renderFetchSequenceValue("");
    java.lang.String var13 = var0.regexQuery("drop generator sequence", true, "hi!");
    java.lang.String[] var20 = new java.lang.String[] { ""};
    java.lang.String[] var24 = new java.lang.String[] { ""};
    java.lang.String var25 = org.databene.jdbacl.SQLUtil.join("", "", var20, "hi!", "10", var24);
    org.databene.jdbacl.identity.IdentityProvider var26 = new org.databene.jdbacl.identity.IdentityProvider();
    org.databene.jdbacl.identity.SubNkPkQueryIdentity var27 = new org.databene.jdbacl.identity.SubNkPkQueryIdentity("null", var20, var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var28 = var0.renderCase("drop sequence alter sequence hi! restart with 1", "procedure CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var20);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "drop sequence "+ "'", var5.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "select nextval('')"+ "'", var9.equals("select nextval('')"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "NOT drop generator sequence ~ 'hi!'"+ "'", var13.equals("NOT drop generator sequence ~ 'hi!'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi! as 10 on . = 10."+ "'", var25.equals("hi! as 10 on . = 10."));

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test443");


    org.databene.jdbacl.JDBCDriverInfo var0 = new org.databene.jdbacl.JDBCDriverInfo();
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var7 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var7.setExcludeTables("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    boolean var10 = var0.equals((java.lang.Object)var7);
    java.lang.String[] var14 = new java.lang.String[] { ""};
    java.lang.String[] var18 = new java.lang.String[] { ""};
    java.lang.String var19 = org.databene.jdbacl.SQLUtil.join("", "", var14, "hi!", "10", var18);
    var0.setJars(var18);
    java.lang.String var21 = var0.getDefaultDatabase();
    java.lang.String var22 = var0.getUrlPattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi! as 10 on . = 10."+ "'", var19.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test444");


    org.databene.jdbacl.model.DefaultDBTable var0 = new org.databene.jdbacl.model.DefaultDBTable();
    var0.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var3 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var4 = var3.getForeignKeyConstraints();
    var0.addReferrer((org.databene.jdbacl.model.DBTable)var3);
    java.lang.String[] var11 = new java.lang.String[] { ""};
    java.lang.String[] var15 = new java.lang.String[] { ""};
    java.lang.String var16 = org.databene.jdbacl.SQLUtil.join("", "", var11, "hi!", "10", var15);
    org.databene.jdbacl.model.DBUniqueConstraint var17 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var3, "select nextval('')", false, var11);
    var17.addColumnName("sequence");
    boolean var20 = var17.isNameDeterministic();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var21 = org.databene.jdbacl.DBUtil.containsMandatoryColumn((org.databene.jdbacl.model.DBConstraint)var17);
      fail("Expected exception of type org.databene.commons.ObjectNotFoundException");
    } catch (org.databene.commons.ObjectNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi! as 10 on . = 10."+ "'", var16.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test445");


    java.lang.String var2 = org.databene.jdbacl.identity.xml.IdentityParser.createCheckName("Sub identity of ():\nnull", "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).DROP SEQUENCE ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Sub identity of ():\nnull-identity-VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).DROP SEQUENCE "+ "'", var2.equals("Sub identity of ():\nnull-identity-VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).DROP SEQUENCE "));

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test446");


    org.databene.jdbacl.model.DefaultDBTable var2 = new org.databene.jdbacl.model.DefaultDBTable();
    var2.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var5 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var6 = var5.getForeignKeyConstraints();
    var2.addReferrer((org.databene.jdbacl.model.DBTable)var5);
    org.databene.jdbacl.model.DBDataType var10 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var11 = var10.isAlpha();
    java.lang.String var12 = var10.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var13 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var16 = var13.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var18 = var13.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var19 = var10.equals((java.lang.Object)var18);
    org.databene.jdbacl.model.DefaultDBColumn var22 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var5, var10, (java.lang.Integer)0, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DefaultDBTable var24 = new org.databene.jdbacl.model.DefaultDBTable();
    var24.setDoc(".");
    java.util.Set var28 = var24.getUniqueConstraints(false);
    org.databene.jdbacl.model.DBDataType var31 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var32 = var31.isAlpha();
    boolean var33 = var31.isLOB();
    org.databene.jdbacl.model.DefaultDBColumn var36 = new org.databene.jdbacl.model.DefaultDBColumn("NOT drop generator sequence ~ 'hi!'", (org.databene.jdbacl.model.DBTable)var24, var31, (java.lang.Integer)100, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DefaultDBColumn var39 = new org.databene.jdbacl.model.DefaultDBColumn("org.databene.jdbacl.SQLScriptException: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1: ", (org.databene.jdbacl.model.DBTable)var5, var31, (java.lang.Integer)3, (java.lang.Integer)69);
    java.lang.String var40 = var31.toString();
    int var41 = var31.getJdbcType();
    boolean var42 = var31.isLOB();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "DROP SEQUENCE "+ "'", var12.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var18.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "DROP SEQUENCE "+ "'", var40.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test447");


    org.databene.jdbacl.model.DefaultDBTable var1 = new org.databene.jdbacl.model.DefaultDBTable();
    var1.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var4 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var5 = var4.getForeignKeyConstraints();
    var1.addReferrer((org.databene.jdbacl.model.DBTable)var4);
    org.databene.jdbacl.model.DBDataType var9 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var10 = var9.isAlpha();
    java.lang.String var11 = var9.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var12 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var15 = var12.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var17 = var12.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var18 = var9.equals((java.lang.Object)var17);
    org.databene.jdbacl.model.DefaultDBColumn var21 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var4, var9, (java.lang.Integer)0, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DefaultDBTable var22 = new org.databene.jdbacl.model.DefaultDBTable();
    var22.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var25 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var26 = var25.getForeignKeyConstraints();
    var22.addReferrer((org.databene.jdbacl.model.DBTable)var25);
    var4.addReferrer((org.databene.jdbacl.model.DBTable)var22);
    var22.setDoc("hi!");
    org.databene.jdbacl.model.TableContainer var36 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var37 = var36.getTables();
    org.databene.jdbacl.model.TableContainer var38 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var36);
    org.databene.jdbacl.model.DefaultDBTable var39 = new org.databene.jdbacl.model.DefaultDBTable();
    var39.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var42 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var43 = var42.getForeignKeyConstraints();
    var39.addReferrer((org.databene.jdbacl.model.DBTable)var42);
    var36.addTable((org.databene.jdbacl.model.DBTable)var42);
    java.lang.String[] var50 = new java.lang.String[] { ""};
    java.lang.String[] var54 = new java.lang.String[] { ""};
    java.lang.String var55 = org.databene.jdbacl.SQLUtil.join("", "", var50, "hi!", "10", var54);
    java.lang.String var56 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var50);
    org.databene.jdbacl.model.TableContainer var59 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var60 = var59.getTables();
    org.databene.jdbacl.model.TableContainer var61 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var59);
    org.databene.jdbacl.model.DefaultDBTable var62 = new org.databene.jdbacl.model.DefaultDBTable();
    var62.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var65 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var66 = var65.getForeignKeyConstraints();
    var62.addReferrer((org.databene.jdbacl.model.DBTable)var65);
    var59.addTable((org.databene.jdbacl.model.DBTable)var65);
    java.lang.String[] var71 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var72 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var71);
    org.databene.jdbacl.model.DBForeignKeyConstraint var73 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var42, var50, (org.databene.jdbacl.model.DBTable)var65, var71);
    java.lang.String[] var74 = var73.getRefereeColumnNames();
    java.lang.String[] var75 = var73.getForeignKeyColumnNames();
    org.databene.jdbacl.identity.UniqueKeyIdentity var76 = new org.databene.jdbacl.identity.UniqueKeyIdentity("DROP SEQUENCE  NOT REGEXP 'VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).)'", var75);
    java.lang.String[] var80 = new java.lang.String[] { ""};
    java.lang.String[] var84 = new java.lang.String[] { ""};
    java.lang.String var85 = org.databene.jdbacl.SQLUtil.join("", "", var80, "hi!", "10", var84);
    var76.setColumns(var80);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.DBColumn[] var87 = var22.getColumns(var80);
      fail("Expected exception of type org.databene.commons.ObjectNotFoundException");
    } catch (org.databene.commons.ObjectNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "DROP SEQUENCE "+ "'", var11.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var17.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi! as 10 on . = 10."+ "'", var55.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "."+ "'", var56.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var72.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + "hi! as 10 on . = 10."+ "'", var85.equals("hi! as 10 on . = 10."));

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test448");


    org.databene.jdbacl.model.DBCatalog var0 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var1 = var0.getName();
    org.databene.jdbacl.model.Database var2 = var0.getDatabase();
    java.lang.String var3 = var0.getDoc();
    org.databene.jdbacl.dialect.DerbyDialect var5 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var7 = var5.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var8 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var9 = var8.getName();
    java.lang.String var10 = var5.formatValue((java.lang.Object)var8);
    var8.setName("'hi!'");
    java.util.List var13 = var8.getSchemas();
    org.databene.jdbacl.model.DBSchema var14 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var8);
    var0.removeSchema(var14);
    org.databene.jdbacl.dialect.DerbyDialect var18 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var20 = var18.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var21 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var22 = var21.getName();
    java.lang.String var23 = var18.formatValue((java.lang.Object)var21);
    var21.setName("'hi!'");
    java.util.List var26 = var21.getSchemas();
    org.databene.jdbacl.model.DBSchema var27 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var21);
    org.databene.jdbacl.model.DBTrigger var28 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var27);
    var28.setDescription("CREATE GENERATOR drop sequence ");
    java.lang.String var31 = var28.getTriggerBody();
    java.lang.String var32 = var28.getColumnName();
    java.lang.String var33 = var28.getWhenClause();
    var14.addTrigger(var28);
    java.util.List var35 = var14.getComponents();
    org.databene.jdbacl.dialect.DerbyDialect var37 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var39 = var37.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var40 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var41 = var40.getName();
    java.lang.String var42 = var37.formatValue((java.lang.Object)var40);
    var40.setName("'hi!'");
    java.util.List var45 = var40.getSchemas();
    org.databene.jdbacl.model.DBSchema var46 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var40);
    org.databene.jdbacl.dialect.DerbyDialect var49 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var51 = var49.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var52 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var53 = var52.getName();
    java.lang.String var54 = var49.formatValue((java.lang.Object)var52);
    var52.setName("'hi!'");
    java.util.List var57 = var52.getSchemas();
    org.databene.jdbacl.model.DBSchema var58 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var52);
    org.databene.jdbacl.model.DBTrigger var59 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var58);
    var46.addTrigger(var59);
    boolean var61 = var14.isIdentical((org.databene.jdbacl.model.DBObject)var59);
    var59.setActionType("alter sequence CREATE SEQUENCE 10 restart with 1");
    java.lang.String var64 = var59.getBaseObjectType();
    java.lang.String var65 = var59.getTableOwner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test449");


    java.lang.Boolean var1 = org.databene.jdbacl.SQLUtil.mutatesDataOrStructure("jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,69)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test450");


    org.databene.jdbacl.JDBCConnectData var6 = new org.databene.jdbacl.JDBCConnectData("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)", "hi!", "hi!", "drop generator sequence", "'hi!'", "hi!");
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var7 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter(var6);
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var8 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter(var6);
    org.databene.jdbacl.model.DBCatalog var10 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var11 = var10.getName();
    org.databene.jdbacl.model.Database var12 = var10.getDatabase();
    java.lang.String var13 = var10.getDoc();
    org.databene.jdbacl.dialect.DerbyDialect var15 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var17 = var15.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var18 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var19 = var18.getName();
    java.lang.String var20 = var15.formatValue((java.lang.Object)var18);
    var18.setName("'hi!'");
    java.util.List var23 = var18.getSchemas();
    org.databene.jdbacl.model.DBSchema var24 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var18);
    var10.removeSchema(var24);
    java.util.List var27 = var24.getTables(false);
    org.databene.jdbacl.model.DefaultDBTable var28 = new org.databene.jdbacl.model.DefaultDBTable("drop generator .", var24);
    org.databene.jdbacl.model.jdbc.LazyTable var31 = new org.databene.jdbacl.model.jdbc.LazyTable(var8, var24, "drop generator CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE ", "select nextval('CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT')");
    java.lang.String var32 = var31.toString();
    org.databene.jdbacl.model.DBCatalog var33 = var31.getCatalog();
    org.databene.jdbacl.JDBCDriverInfo var35 = new org.databene.jdbacl.JDBCDriverInfo();
    var35.setDriverClass("hi!");
    var35.setDefaultPort("CREATE SEQUENCE 10");
    var35.setDbSystem("SET GENERATOR . TO -1");
    java.lang.String var42 = var35.toString();
    org.databene.jdbacl.model.DefaultDBTable var44 = new org.databene.jdbacl.model.DefaultDBTable();
    var44.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var47 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var48 = var47.getForeignKeyConstraints();
    var44.addReferrer((org.databene.jdbacl.model.DBTable)var47);
    java.lang.String[] var55 = new java.lang.String[] { ""};
    java.lang.String[] var59 = new java.lang.String[] { ""};
    java.lang.String var60 = org.databene.jdbacl.SQLUtil.join("", "", var55, "hi!", "10", var59);
    org.databene.jdbacl.model.DBUniqueConstraint var61 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var47, "select nextval('')", false, var55);
    var47.setDoc("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT");
    java.lang.String[] var66 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var67 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var66);
    org.databene.jdbacl.model.DBUniqueConstraint var68 = var47.getUniqueConstraint(var66);
    org.databene.jdbacl.identity.UniqueKeyIdentity var69 = new org.databene.jdbacl.identity.UniqueKeyIdentity("select next value for SET GENERATOR.TO - 1", var66);
    var35.setJars(var66);
    org.databene.jdbacl.identity.UniqueKeyIdentity var71 = new org.databene.jdbacl.identity.UniqueKeyIdentity("NOT REGEXP_MATCHES(sequence, '')", var66);
    java.awt.Window[] var72 = java.awt.Window.getWindows();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var73 = org.databene.jdbacl.SQLUtil.renderQuery((org.databene.jdbacl.model.DBTable)var31, var66, (java.lang.Object[])var72);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "drop generator CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var32.equals("drop generator CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "SET GENERATOR . TO -1"+ "'", var42.equals("SET GENERATOR . TO -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "hi! as 10 on . = 10."+ "'", var60.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var67.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test451");


    org.databene.jdbacl.model.DefaultDBTable var1 = new org.databene.jdbacl.model.DefaultDBTable();
    var1.setDoc(".");
    java.util.Set var5 = var1.getUniqueConstraints(false);
    org.databene.jdbacl.model.DBDataType var8 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var9 = var8.isAlpha();
    boolean var10 = var8.isLOB();
    org.databene.jdbacl.model.DefaultDBColumn var13 = new org.databene.jdbacl.model.DefaultDBColumn("NOT drop generator sequence ~ 'hi!'", (org.databene.jdbacl.model.DBTable)var1, var8, (java.lang.Integer)100, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.TableContainer var16 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var17 = var16.getTables();
    org.databene.jdbacl.model.TableContainer var18 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var16);
    org.databene.jdbacl.model.DefaultDBTable var19 = new org.databene.jdbacl.model.DefaultDBTable();
    var19.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var22 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var23 = var22.getForeignKeyConstraints();
    var19.addReferrer((org.databene.jdbacl.model.DBTable)var22);
    var16.addTable((org.databene.jdbacl.model.DBTable)var22);
    var13.setTable((org.databene.jdbacl.model.DBTable)var22);
    java.util.Collection var27 = var22.getReferrers();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.DBTable var29 = var22.getProvider(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test452");


    org.databene.jdbacl.model.DefaultDBTable var1 = new org.databene.jdbacl.model.DefaultDBTable();
    var1.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var4 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var5 = var4.getForeignKeyConstraints();
    var1.addReferrer((org.databene.jdbacl.model.DBTable)var4);
    org.databene.jdbacl.model.DBDataType var9 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var10 = var9.isAlpha();
    java.lang.String var11 = var9.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var12 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var15 = var12.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var17 = var12.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var18 = var9.equals((java.lang.Object)var17);
    org.databene.jdbacl.model.DefaultDBColumn var21 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var4, var9, (java.lang.Integer)0, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DefaultDBTable var22 = new org.databene.jdbacl.model.DefaultDBTable();
    var22.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var25 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var26 = var25.getForeignKeyConstraints();
    var22.addReferrer((org.databene.jdbacl.model.DBTable)var25);
    var4.addReferrer((org.databene.jdbacl.model.DBTable)var22);
    org.databene.jdbacl.model.TableContainer var33 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var34 = var33.getTables();
    org.databene.jdbacl.model.TableContainer var35 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var33);
    org.databene.jdbacl.model.DefaultDBTable var36 = new org.databene.jdbacl.model.DefaultDBTable();
    var36.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var39 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var40 = var39.getForeignKeyConstraints();
    var36.addReferrer((org.databene.jdbacl.model.DBTable)var39);
    var33.addTable((org.databene.jdbacl.model.DBTable)var39);
    java.lang.String[] var47 = new java.lang.String[] { ""};
    java.lang.String[] var51 = new java.lang.String[] { ""};
    java.lang.String var52 = org.databene.jdbacl.SQLUtil.join("", "", var47, "hi!", "10", var51);
    java.lang.String var53 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var47);
    org.databene.jdbacl.model.TableContainer var56 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var57 = var56.getTables();
    org.databene.jdbacl.model.TableContainer var58 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var56);
    org.databene.jdbacl.model.DefaultDBTable var59 = new org.databene.jdbacl.model.DefaultDBTable();
    var59.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var62 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var63 = var62.getForeignKeyConstraints();
    var59.addReferrer((org.databene.jdbacl.model.DBTable)var62);
    var56.addTable((org.databene.jdbacl.model.DBTable)var62);
    java.lang.String[] var68 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var69 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var68);
    org.databene.jdbacl.model.DBForeignKeyConstraint var70 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var39, var47, (org.databene.jdbacl.model.DBTable)var62, var68);
    org.databene.jdbacl.model.DBTable var71 = var70.getRefereeTable();
    var4.addForeignKey(var70);
    org.databene.jdbacl.model.FKChangeRule var73 = var70.getDeleteRule();
    java.lang.String var74 = var73.toString();
    java.lang.String var75 = var73.toString();
    java.lang.Class var76 = var73.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var78 = java.lang.Enum.<java.lang.Enum>valueOf(var76, "jdbc:h2:mem:org.databene.jdbacl.SQLScriptException: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1: ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "DROP SEQUENCE "+ "'", var11.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var17.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi! as 10 on . = 10."+ "'", var52.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "."+ "'", var53.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var69.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "NO_ACTION"+ "'", var74.equals("NO_ACTION"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "NO_ACTION"+ "'", var75.equals("NO_ACTION"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test453");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.mT__69();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test454");


    org.databene.jdbacl.identity.xml.IdentityParseContext var0 = new org.databene.jdbacl.identity.xml.IdentityParseContext();
    org.databene.jdbacl.identity.xml.IdentityParser var1 = new org.databene.jdbacl.identity.xml.IdentityParser();
    var0.addParser((org.databene.webdecs.xml.XMLElementParser)var1);
    org.databene.jdbacl.model.DefaultDBTable var4 = new org.databene.jdbacl.model.DefaultDBTable();
    var4.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var7 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var8 = var7.getForeignKeyConstraints();
    var4.addReferrer((org.databene.jdbacl.model.DBTable)var7);
    org.databene.jdbacl.model.DefaultDBTable var11 = new org.databene.jdbacl.model.DefaultDBTable();
    var11.setDoc(".");
    java.util.Set var15 = var11.getUniqueConstraints(false);
    org.databene.jdbacl.model.DBDataType var18 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var19 = var18.isAlpha();
    boolean var20 = var18.isLOB();
    org.databene.jdbacl.model.DefaultDBColumn var23 = new org.databene.jdbacl.model.DefaultDBColumn("NOT drop generator sequence ~ 'hi!'", (org.databene.jdbacl.model.DBTable)var11, var18, (java.lang.Integer)100, (java.lang.Integer)(-1));
    var7.addColumn((org.databene.jdbacl.model.DBColumn)var23);
    org.databene.jdbacl.model.DBRow var25 = new org.databene.jdbacl.model.DBRow((org.databene.jdbacl.model.DBTable)var7);
    java.lang.Object[] var26 = var25.getPKValues();
    org.databene.jdbacl.model.DBSequence var31 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var31.setCache((java.lang.Long)100L);
    java.lang.String var34 = var31.getObjectType();
    java.math.BigInteger var35 = var31.getIncrementIfNotDefault();
    org.databene.jdbacl.model.DBSequence var39 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var39.setName("10");
    java.math.BigInteger var42 = var39.getIncrement();
    java.math.BigInteger var43 = var39.getIncrement();
    var31.setLastNumber(var43);
    var31.setOrder((java.lang.Boolean)false);
    var25.setCellValue("alter sequence  restart with -1", (java.lang.Object)var31);
    org.databene.jdbacl.model.TableContainer var52 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var53 = var52.getTables();
    org.databene.jdbacl.model.TableContainer var54 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var52);
    org.databene.jdbacl.model.DefaultDBTable var55 = new org.databene.jdbacl.model.DefaultDBTable();
    var55.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var58 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var59 = var58.getForeignKeyConstraints();
    var55.addReferrer((org.databene.jdbacl.model.DBTable)var58);
    var52.addTable((org.databene.jdbacl.model.DBTable)var58);
    java.lang.String[] var66 = new java.lang.String[] { ""};
    java.lang.String[] var70 = new java.lang.String[] { ""};
    java.lang.String var71 = org.databene.jdbacl.SQLUtil.join("", "", var66, "hi!", "10", var70);
    java.lang.String var72 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var66);
    org.databene.jdbacl.model.TableContainer var75 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var76 = var75.getTables();
    org.databene.jdbacl.model.TableContainer var77 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var75);
    org.databene.jdbacl.model.DefaultDBTable var78 = new org.databene.jdbacl.model.DefaultDBTable();
    var78.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var81 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var82 = var81.getForeignKeyConstraints();
    var78.addReferrer((org.databene.jdbacl.model.DBTable)var81);
    var75.addTable((org.databene.jdbacl.model.DBTable)var81);
    java.lang.String[] var87 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var88 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var87);
    org.databene.jdbacl.model.DBForeignKeyConstraint var89 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var58, var66, (org.databene.jdbacl.model.DBTable)var81, var87);
    boolean var90 = var89.isNameDeterministic();
    java.lang.Object[] var91 = var25.getFKComponents(var89);
    java.lang.Object[] var92 = var25.getPKValues();
    var0.set("drop sequence ", (java.lang.Object)var25);
    var0.remove("NOT select alter sequence drop sequence 10 restart with 0.nextval from dual ~ 'CONSTRAINT \"CREATE GENERATOR drop sequence \" '");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "sequence"+ "'", var34.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "hi! as 10 on . = 10."+ "'", var71.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "."+ "'", var72.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var88 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var88.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test455");


    org.databene.jdbacl.model.DBCatalog var0 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var1 = var0.getName();
    org.databene.jdbacl.model.Database var2 = var0.getDatabase();
    org.databene.jdbacl.model.DBSequence var6 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    java.lang.String var7 = var6.dropDDL();
    java.math.BigInteger var8 = var6.getMinValueIfNotDefault();
    boolean var9 = var0.isIdentical((org.databene.jdbacl.model.DBObject)var6);
    org.databene.jdbacl.model.DBTreeModel var10 = new org.databene.jdbacl.model.DBTreeModel((org.databene.jdbacl.model.CompositeDBObject)var0);
    org.databene.jdbacl.model.DefaultDBTable var13 = new org.databene.jdbacl.model.DefaultDBTable();
    var13.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var16 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var17 = var16.getForeignKeyConstraints();
    var13.addReferrer((org.databene.jdbacl.model.DBTable)var16);
    java.lang.String[] var24 = new java.lang.String[] { ""};
    java.lang.String[] var28 = new java.lang.String[] { ""};
    java.lang.String var29 = org.databene.jdbacl.SQLUtil.join("", "", var24, "hi!", "10", var28);
    org.databene.jdbacl.model.DBUniqueConstraint var30 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var16, "select nextval('')", false, var24);
    java.lang.String var31 = var30.toString();
    boolean var32 = var30.isNameDeterministic();
    org.databene.jdbacl.model.DBUniqueIndex var33 = new org.databene.jdbacl.model.DBUniqueIndex("select next value for SET GENERATOR . TO -1", false, var30);
    java.lang.String var34 = var30.toString();
    boolean var35 = var10.isLeaf((org.databene.jdbacl.model.DBObject)var30);
    org.databene.jdbacl.dialect.DerbyDialect var39 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var41 = var39.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var42 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var43 = var42.getName();
    java.lang.String var44 = var39.formatValue((java.lang.Object)var42);
    var42.setName("'hi!'");
    java.util.List var47 = var42.getSchemas();
    org.databene.jdbacl.model.DBSchema var48 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var42);
    org.databene.jdbacl.model.DBTrigger var49 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var48);
    java.util.List var50 = var48.getPackages();
    org.databene.jdbacl.model.DBPackage var51 = new org.databene.jdbacl.model.DBPackage("CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).", var48);
    java.lang.String var52 = var51.getStatus();
    java.util.List var53 = var51.getProcedures();
    java.lang.String var54 = var51.getStatus();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.DBObject var56 = var10.getChild((org.databene.jdbacl.model.DBObject)var51, 69);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "drop sequence "+ "'", var7.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi! as 10 on . = 10."+ "'", var29.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "CONSTRAINT \"select nextval('')\" UNIQUE ()"+ "'", var31.equals("CONSTRAINT \"select nextval('')\" UNIQUE ()"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "CONSTRAINT \"select nextval('')\" UNIQUE ()"+ "'", var34.equals("CONSTRAINT \"select nextval('')\" UNIQUE ()"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test456");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.JDBCConnectData var1 = org.databene.jdbacl.DBUtil.getConnectData("SET GENERATOR DROP SEQUENCE NOT drop generator sequence ~ 'hi!' RESTRICT identity by primary key TO 99");
      fail("Expected exception of type org.databene.commons.ConfigurationError");
    } catch (org.databene.commons.ConfigurationError e) {
      // Expected exception.
    }

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test457");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.skip();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var3 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var5 = var3.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var3);
    org.databene.jdbacl.sql.parser.SQLLexer var7 = new org.databene.jdbacl.sql.parser.SQLLexer();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var9 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var9.release((-1));
    boolean var13 = var7.mismatchIsUnwantedToken((org.antlr.runtime.IntStream)var9, 0);
    var0.setCharStream((org.antlr.runtime.CharStream)var9);
    var0.mIDENTIFIER();
    var0.mSIZE();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mT__137();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test458");


    org.databene.jdbacl.model.TableContainer var2 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var3 = var2.getTables();
    org.databene.jdbacl.model.TableContainer var4 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var2);
    org.databene.jdbacl.model.DefaultDBTable var5 = new org.databene.jdbacl.model.DefaultDBTable();
    var5.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var8 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var9 = var8.getForeignKeyConstraints();
    var5.addReferrer((org.databene.jdbacl.model.DBTable)var8);
    var2.addTable((org.databene.jdbacl.model.DBTable)var8);
    org.databene.jdbacl.model.DefaultDBTable var12 = new org.databene.jdbacl.model.DefaultDBTable();
    var2.removeTable((org.databene.jdbacl.model.DBTable)var12);
    org.databene.jdbacl.model.DefaultDBTable var14 = new org.databene.jdbacl.model.DefaultDBTable();
    var14.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var17 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var18 = var17.getForeignKeyConstraints();
    var14.addReferrer((org.databene.jdbacl.model.DBTable)var17);
    org.databene.jdbacl.model.DefaultDBTable var21 = new org.databene.jdbacl.model.DefaultDBTable();
    var21.setDoc(".");
    java.util.Set var25 = var21.getUniqueConstraints(false);
    org.databene.jdbacl.model.DBDataType var28 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var29 = var28.isAlpha();
    boolean var30 = var28.isLOB();
    org.databene.jdbacl.model.DefaultDBColumn var33 = new org.databene.jdbacl.model.DefaultDBColumn("NOT drop generator sequence ~ 'hi!'", (org.databene.jdbacl.model.DBTable)var21, var28, (java.lang.Integer)100, (java.lang.Integer)(-1));
    var17.addColumn((org.databene.jdbacl.model.DBColumn)var33);
    var2.removeTable((org.databene.jdbacl.model.DBTable)var17);
    org.databene.jdbacl.model.DBCatalog var36 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var37 = var36.getName();
    org.databene.jdbacl.model.Database var38 = var36.getDatabase();
    java.lang.String var39 = var36.getDoc();
    org.databene.jdbacl.dialect.DerbyDialect var41 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var43 = var41.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var44 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var45 = var44.getName();
    java.lang.String var46 = var41.formatValue((java.lang.Object)var44);
    var44.setName("'hi!'");
    java.util.List var49 = var44.getSchemas();
    org.databene.jdbacl.model.DBSchema var50 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var44);
    var36.removeSchema(var50);
    org.databene.jdbacl.dialect.DerbyDialect var54 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var56 = var54.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var57 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var58 = var57.getName();
    java.lang.String var59 = var54.formatValue((java.lang.Object)var57);
    var57.setName("'hi!'");
    java.util.List var62 = var57.getSchemas();
    org.databene.jdbacl.model.DBSchema var63 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var57);
    org.databene.jdbacl.model.DBTrigger var64 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var63);
    var64.setDescription("CREATE GENERATOR drop sequence ");
    java.lang.String var67 = var64.getTriggerBody();
    java.lang.String var68 = var64.getColumnName();
    java.lang.String var69 = var64.getWhenClause();
    var50.addTrigger(var64);
    java.util.List var71 = org.databene.jdbacl.DBUtil.dependencyOrderedTables((org.databene.jdbacl.model.TableHolder)var50);
    java.util.List var72 = var50.getTriggers();
    var17.setSchema(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test459");


    org.databene.jdbacl.JDBCDriverInfo var0 = new org.databene.jdbacl.JDBCDriverInfo();
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var7 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var7.setExcludeTables("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    boolean var10 = var0.equals((java.lang.Object)var7);
    java.lang.String[] var14 = new java.lang.String[] { ""};
    java.lang.String[] var18 = new java.lang.String[] { ""};
    java.lang.String var19 = org.databene.jdbacl.SQLUtil.join("", "", var14, "hi!", "10", var18);
    var0.setJars(var18);
    java.lang.String var21 = var0.getDefaultDatabase();
    var0.setDefaultPort("select next value for SET GENERATOR . TO -1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi! as 10 on . = 10."+ "'", var19.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test460");


    boolean var1 = org.databene.jdbacl.DBUtil.existsEnvironment("left join VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) as drop sequence alter sequence hi! restart with 1 on jdbc:h2:mem:select next value for 10.select next value for 10 = drop sequence alter sequence hi! restart with 1.DROP SEQUENCE ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test461");


    org.databene.jdbacl.model.DBCatalog var1 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var2 = var1.getName();
    org.databene.jdbacl.model.Database var3 = var1.getDatabase();
    java.lang.String var4 = var1.getDoc();
    org.databene.jdbacl.dialect.DerbyDialect var6 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var8 = var6.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var9 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var10 = var9.getName();
    java.lang.String var11 = var6.formatValue((java.lang.Object)var9);
    var9.setName("'hi!'");
    java.util.List var14 = var9.getSchemas();
    org.databene.jdbacl.model.DBSchema var15 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var9);
    var1.removeSchema(var15);
    org.databene.jdbacl.dialect.DerbyDialect var19 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var21 = var19.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var22 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var23 = var22.getName();
    java.lang.String var24 = var19.formatValue((java.lang.Object)var22);
    var22.setName("'hi!'");
    java.util.List var27 = var22.getSchemas();
    org.databene.jdbacl.model.DBSchema var28 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var22);
    org.databene.jdbacl.model.DBTrigger var29 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var28);
    var29.setDescription("CREATE GENERATOR drop sequence ");
    java.lang.String var32 = var29.getTriggerBody();
    java.lang.String var33 = var29.getColumnName();
    java.lang.String var34 = var29.getWhenClause();
    var15.addTrigger(var29);
    org.databene.jdbacl.model.DBTrigger var36 = new org.databene.jdbacl.model.DBTrigger("-1", var15);
    var36.setBaseObjectType("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT");
    var36.setBaseObjectType("No identity defined for table DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT");
    java.lang.String var41 = var36.getTriggeringEvent();
    var36.setColumnName("drop sequence 10");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test462");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.Database var8 = org.databene.jdbacl.DBUtil.getMetaData("DROP SEQUENCE NOT drop generator sequence ~ 'hi!' RESTRICT", true, true, false, false, "DROP SEQUENCE NOT drop generator sequence ~ 'hi!' RESTRICT identity by primary key", false, false);
      fail("Expected exception of type org.databene.commons.ConfigurationError");
    } catch (org.databene.commons.ConfigurationError e) {
      // Expected exception.
    }

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test463");


    org.databene.jdbacl.model.TableContainer var6 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var7 = var6.getTables();
    org.databene.jdbacl.model.TableContainer var8 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var6);
    org.databene.jdbacl.model.DefaultDBTable var9 = new org.databene.jdbacl.model.DefaultDBTable();
    var9.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var12 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var13 = var12.getForeignKeyConstraints();
    var9.addReferrer((org.databene.jdbacl.model.DBTable)var12);
    var6.addTable((org.databene.jdbacl.model.DBTable)var12);
    java.lang.String[] var20 = new java.lang.String[] { ""};
    java.lang.String[] var24 = new java.lang.String[] { ""};
    java.lang.String var25 = org.databene.jdbacl.SQLUtil.join("", "", var20, "hi!", "10", var24);
    java.lang.String var26 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var20);
    org.databene.jdbacl.model.TableContainer var29 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var30 = var29.getTables();
    org.databene.jdbacl.model.TableContainer var31 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var29);
    org.databene.jdbacl.model.DefaultDBTable var32 = new org.databene.jdbacl.model.DefaultDBTable();
    var32.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var35 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var36 = var35.getForeignKeyConstraints();
    var32.addReferrer((org.databene.jdbacl.model.DBTable)var35);
    var29.addTable((org.databene.jdbacl.model.DBTable)var35);
    java.lang.String[] var41 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var42 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var41);
    org.databene.jdbacl.model.DBForeignKeyConstraint var43 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var12, var20, (org.databene.jdbacl.model.DBTable)var35, var41);
    java.lang.String[] var44 = var43.getRefereeColumnNames();
    java.lang.String var45 = var43.toString();
    org.databene.jdbacl.model.DBTable var46 = var43.getTable();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.DBCheckConstraint var48 = new org.databene.jdbacl.model.DBCheckConstraint("select nextval('CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT')", false, var46, "CONSTRAINT \"select nextval('')\" UNIQUE ()");
      fail("Expected exception of type org.databene.commons.ParseException");
    } catch (org.databene.commons.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi! as 10 on . = 10."+ "'", var25.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "."+ "'", var26.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var42.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )"+ "'", var45.equals("CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test464");


    org.databene.jdbacl.model.DefaultDBTable var1 = new org.databene.jdbacl.model.DefaultDBTable();
    var1.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var4 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var5 = var4.getForeignKeyConstraints();
    var1.addReferrer((org.databene.jdbacl.model.DBTable)var4);
    org.databene.jdbacl.model.DBDataType var9 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var10 = var9.isAlpha();
    java.lang.String var11 = var9.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var12 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var15 = var12.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var17 = var12.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var18 = var9.equals((java.lang.Object)var17);
    org.databene.jdbacl.model.DefaultDBColumn var21 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var4, var9, (java.lang.Integer)0, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DefaultDBTable var22 = new org.databene.jdbacl.model.DefaultDBTable();
    var22.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var25 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var26 = var25.getForeignKeyConstraints();
    var22.addReferrer((org.databene.jdbacl.model.DBTable)var25);
    var4.addReferrer((org.databene.jdbacl.model.DBTable)var22);
    org.databene.jdbacl.model.TableContainer var33 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var34 = var33.getTables();
    org.databene.jdbacl.model.TableContainer var35 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var33);
    org.databene.jdbacl.model.DefaultDBTable var36 = new org.databene.jdbacl.model.DefaultDBTable();
    var36.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var39 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var40 = var39.getForeignKeyConstraints();
    var36.addReferrer((org.databene.jdbacl.model.DBTable)var39);
    var33.addTable((org.databene.jdbacl.model.DBTable)var39);
    java.lang.String[] var47 = new java.lang.String[] { ""};
    java.lang.String[] var51 = new java.lang.String[] { ""};
    java.lang.String var52 = org.databene.jdbacl.SQLUtil.join("", "", var47, "hi!", "10", var51);
    java.lang.String var53 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var47);
    org.databene.jdbacl.model.TableContainer var56 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var57 = var56.getTables();
    org.databene.jdbacl.model.TableContainer var58 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var56);
    org.databene.jdbacl.model.DefaultDBTable var59 = new org.databene.jdbacl.model.DefaultDBTable();
    var59.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var62 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var63 = var62.getForeignKeyConstraints();
    var59.addReferrer((org.databene.jdbacl.model.DBTable)var62);
    var56.addTable((org.databene.jdbacl.model.DBTable)var62);
    java.lang.String[] var68 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var69 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var68);
    org.databene.jdbacl.model.DBForeignKeyConstraint var70 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var39, var47, (org.databene.jdbacl.model.DBTable)var62, var68);
    org.databene.jdbacl.model.DBTable var71 = var70.getRefereeTable();
    var4.addForeignKey(var70);
    org.databene.jdbacl.model.FKChangeRule var73 = var70.getDeleteRule();
    java.lang.String var74 = var73.toString();
    java.lang.String var75 = var73.toString();
    java.lang.Class var76 = var73.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var78 = java.lang.Enum.<java.lang.Enum>valueOf(var76, "false");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "DROP SEQUENCE "+ "'", var11.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var17.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi! as 10 on . = 10."+ "'", var52.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "."+ "'", var53.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var69.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "NO_ACTION"+ "'", var74.equals("NO_ACTION"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "NO_ACTION"+ "'", var75.equals("NO_ACTION"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test465");


    org.databene.jdbacl.model.DefaultDBTable var2 = new org.databene.jdbacl.model.DefaultDBTable();
    var2.setDoc(".");
    java.util.Set var6 = var2.getUniqueConstraints(false);
    org.databene.jdbacl.model.DBDataType var9 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var10 = var9.isAlpha();
    boolean var11 = var9.isLOB();
    org.databene.jdbacl.model.DefaultDBColumn var14 = new org.databene.jdbacl.model.DefaultDBColumn("NOT drop generator sequence ~ 'hi!'", (org.databene.jdbacl.model.DBTable)var2, var9, (java.lang.Integer)100, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DBDataType var17 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var18 = var17.isAlpha();
    java.lang.String var19 = var17.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var20 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var23 = var20.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var25 = var20.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var26 = var17.equals((java.lang.Object)var25);
    boolean var27 = var17.isLOB();
    org.databene.jdbacl.model.DefaultDBColumn var28 = new org.databene.jdbacl.model.DefaultDBColumn("alter sequence CREATE GENERATOR drop sequence  restart with -1", (org.databene.jdbacl.model.DBTable)var2, var17);
    org.databene.jdbacl.model.DefaultDBTable var29 = new org.databene.jdbacl.model.DefaultDBTable();
    var29.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var32 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var33 = var32.getForeignKeyConstraints();
    var29.addReferrer((org.databene.jdbacl.model.DBTable)var32);
    java.lang.String[] var40 = new java.lang.String[] { ""};
    java.lang.String[] var44 = new java.lang.String[] { ""};
    java.lang.String var45 = org.databene.jdbacl.SQLUtil.join("", "", var40, "hi!", "10", var44);
    org.databene.jdbacl.model.DBUniqueConstraint var46 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var32, "select nextval('')", false, var40);
    java.lang.String var47 = var46.toString();
    boolean var48 = var46.isNameDeterministic();
    var46.setDoc("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT");
    var2.addUniqueConstraint(var46);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.DBTable var53 = var2.getProvider(14);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "DROP SEQUENCE "+ "'", var19.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var25.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi! as 10 on . = 10."+ "'", var45.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "CONSTRAINT \"select nextval('')\" UNIQUE ()"+ "'", var47.equals("CONSTRAINT \"select nextval('')\" UNIQUE ()"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test466");


    java.io.File var1 = org.databene.jdbacl.model.cache.CachingDBImporter.getCacheFile("SET GENERATOR . TO -1");
    org.databene.jdbacl.model.xml.XMLModelImporter var2 = new org.databene.jdbacl.model.xml.XMLModelImporter(var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.Database var3 = var2.importDatabase();
      fail("Expected exception of type org.databene.commons.ImportFailedException");
    } catch (org.databene.commons.ImportFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test467");


    org.databene.jdbacl.dialect.FirebirdDialect var0 = new org.databene.jdbacl.dialect.FirebirdDialect();
    boolean var2 = var0.isDeterministicUKName("10");
    boolean var4 = var0.isDeterministicPKName("'hi!'");
    java.lang.String var6 = var0.renderCreateSequence("drop sequence ");
    boolean var7 = var0.isSequenceBoundarySupported();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "CREATE GENERATOR drop sequence "+ "'", var6.equals("CREATE GENERATOR drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test468");


    org.databene.jdbacl.dialect.DerbyDialect var0 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var2 = var0.isDeterministicPKName("hi! as 10 on . = 10.");
    boolean var4 = var0.isDeterministicPKName("'hi!'");
    boolean var6 = var0.isDeterministicUKName("No identity defined for table DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test469");


    org.databene.jdbacl.model.DefaultDBTable var1 = new org.databene.jdbacl.model.DefaultDBTable("CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).");
    org.databene.jdbacl.model.DBPrimaryKeyConstraint var2 = var1.getPrimaryKeyConstraint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test470");


    org.databene.jdbacl.dialect.PostgreSQLDialect var0 = new org.databene.jdbacl.dialect.PostgreSQLDialect();
    boolean var3 = var0.isDefaultCatalog("", "");
    java.lang.String var5 = var0.formatValue((java.lang.Object)10);
    org.databene.jdbacl.model.DBSequence var9 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var9.setName("10");
    java.math.BigInteger var12 = var9.getIncrement();
    java.lang.Boolean var13 = var9.isCycle();
    java.lang.String var14 = var9.dropDDL();
    java.lang.String var15 = var0.renderCreateSequence(var9);
    boolean var17 = var0.isDeterministicFKName("CREATE SEQUENCE 10");
    boolean var18 = var0.supportsRegex();
    org.databene.jdbacl.model.DBSequence var22 = new org.databene.jdbacl.model.DBSequence("call next value for 'hi!'", "NOT REGEXP_MATCHES(sequence, '')", "'hi!'");
    org.databene.jdbacl.model.DBSequence var26 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var26.setName("10");
    java.math.BigInteger var29 = var26.getIncrement();
    java.math.BigInteger var30 = var26.getIncrement();
    var22.setMaxValue(var30);
    java.lang.String var32 = var0.renderCreateSequence(var22);
    boolean var34 = var0.isDeterministicUKName("SET GENERATOR alter sequence CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT restart with 1 TO -2");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "10"+ "'", var5.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "drop sequence 10"+ "'", var14.equals("drop sequence 10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "CREATE SEQUENCE 10"+ "'", var15.equals("CREATE SEQUENCE 10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "CREATE SEQUENCE call next value for 'hi!' MAXVALUE 1"+ "'", var32.equals("CREATE SEQUENCE call next value for 'hi!' MAXVALUE 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test471");


    org.databene.jdbacl.dialect.DerbyDialect var2 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var4 = var2.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var5 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var6 = var5.getName();
    java.lang.String var7 = var2.formatValue((java.lang.Object)var5);
    var5.setName("'hi!'");
    java.util.List var10 = var5.getSchemas();
    org.databene.jdbacl.model.DBSchema var11 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var5);
    org.databene.jdbacl.model.DBTrigger var12 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var11);
    var12.setDescription("CREATE GENERATOR drop sequence ");
    java.lang.String var15 = var12.getTriggerBody();
    java.lang.String var16 = var12.getTriggerBody();
    var12.setReferencingNames("NOT REGEXP_MATCHES(sequence, '')");
    org.databene.jdbacl.model.DefaultDBTable var19 = new org.databene.jdbacl.model.DefaultDBTable();
    var19.setDoc(".");
    java.util.Set var23 = var19.getUniqueConstraints(false);
    java.lang.String var24 = var19.getDoc();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var12.setOwner((org.databene.jdbacl.model.CompositeDBObject)var19);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "."+ "'", var24.equals("."));

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test472");


    org.databene.jdbacl.dialect.DerbyDialect var2 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var4 = var2.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var5 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var6 = var5.getName();
    java.lang.String var7 = var2.formatValue((java.lang.Object)var5);
    var5.setName("'hi!'");
    java.util.List var10 = var5.getSchemas();
    org.databene.jdbacl.model.DBSchema var11 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var5);
    org.databene.jdbacl.model.DBTrigger var12 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var11);
    var12.setDescription("CREATE GENERATOR drop sequence ");
    java.lang.String var15 = var12.getTriggerBody();
    java.lang.String var16 = var12.getTriggerBody();
    var12.setTriggeringEvent("jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1)");
    var12.setTriggerBody("DROP SEQUENCE -1 RESTRICT");
    var12.setTriggerType("CONSTRAINT \"select nextval('')\" UNIQUE ()");
    var12.setColumnName("alter sequence CREATE SEQUENCE 10 restart with 1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test473");


    org.databene.jdbacl.model.TableContainer var4 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var5 = var4.getTables();
    org.databene.jdbacl.model.TableContainer var6 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var4);
    org.databene.jdbacl.model.DefaultDBTable var7 = new org.databene.jdbacl.model.DefaultDBTable();
    var7.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var10 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var11 = var10.getForeignKeyConstraints();
    var7.addReferrer((org.databene.jdbacl.model.DBTable)var10);
    var4.addTable((org.databene.jdbacl.model.DBTable)var10);
    java.lang.String[] var18 = new java.lang.String[] { ""};
    java.lang.String[] var22 = new java.lang.String[] { ""};
    java.lang.String var23 = org.databene.jdbacl.SQLUtil.join("", "", var18, "hi!", "10", var22);
    java.lang.String var24 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var18);
    org.databene.jdbacl.model.TableContainer var27 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var28 = var27.getTables();
    org.databene.jdbacl.model.TableContainer var29 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var27);
    org.databene.jdbacl.model.DefaultDBTable var30 = new org.databene.jdbacl.model.DefaultDBTable();
    var30.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var33 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var34 = var33.getForeignKeyConstraints();
    var30.addReferrer((org.databene.jdbacl.model.DBTable)var33);
    var27.addTable((org.databene.jdbacl.model.DBTable)var33);
    java.lang.String[] var39 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var40 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var39);
    org.databene.jdbacl.model.DBForeignKeyConstraint var41 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var10, var18, (org.databene.jdbacl.model.DBTable)var33, var39);
    java.lang.String[] var42 = var41.getRefereeColumnNames();
    java.lang.String var43 = var41.toString();
    org.databene.jdbacl.model.DBTable var44 = var41.getRefereeTable();
    org.databene.jdbacl.model.FKChangeRule var45 = var41.getUpdateRule();
    java.lang.String var46 = var41.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi! as 10 on . = 10."+ "'", var23.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "."+ "'", var24.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var40.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )"+ "'", var43.equals("CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )"+ "'", var46.equals("CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )"));

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test474");


    java.lang.String var1 = org.databene.jdbacl.dialect.H2Util.getInMemoryURL("left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as CREATE GENERATOR  on jdbc:h2:mem:hi! as 10 on . = 10.-identity-..DROP SEQUENCE  = CREATE GENERATOR . REGEXP 'drop sequence '");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "jdbc:h2:mem:left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as CREATE GENERATOR  on jdbc:h2:mem:hi! as 10 on . = 10.-identity-..DROP SEQUENCE  = CREATE GENERATOR . REGEXP 'drop sequence '"+ "'", var1.equals("jdbc:h2:mem:left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as CREATE GENERATOR  on jdbc:h2:mem:hi! as 10 on . = 10.-identity-..DROP SEQUENCE  = CREATE GENERATOR . REGEXP 'drop sequence '"));

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test475");


    boolean var1 = org.databene.jdbacl.SQLUtil.isQuery("CONSTRAINT \"hi! identity by primary key\" PRIMARY KEY ()");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test476");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.skip();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var3 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var5 = var3.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var3);
    org.databene.jdbacl.sql.parser.SQLLexer var7 = new org.databene.jdbacl.sql.parser.SQLLexer();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var9 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var9.release((-1));
    boolean var13 = var7.mismatchIsUnwantedToken((org.antlr.runtime.IntStream)var9, 0);
    var0.setCharStream((org.antlr.runtime.CharStream)var9);
    var0.mIDENTIFIER();
    var0.mSIZE();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mLTGT();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test477");


    org.databene.jdbacl.dialect.PostgreSQLDialect var0 = new org.databene.jdbacl.dialect.PostgreSQLDialect();
    boolean var3 = var0.isDefaultCatalog("", "");
    java.lang.String var5 = var0.formatValue((java.lang.Object)10);
    org.databene.jdbacl.model.DBSequence var9 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var9.setName("10");
    java.math.BigInteger var12 = var9.getIncrement();
    java.lang.Boolean var13 = var9.isCycle();
    java.lang.String var14 = var9.dropDDL();
    java.lang.String var15 = var0.renderCreateSequence(var9);
    boolean var16 = var0.supportsRegex();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "10"+ "'", var5.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "drop sequence 10"+ "'", var14.equals("drop sequence 10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "CREATE SEQUENCE 10"+ "'", var15.equals("CREATE SEQUENCE 10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test478");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    var0.mCREATE_TABLE();
    org.databene.jdbacl.dialect.DerbyDialect var8 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var10 = var8.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var11 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var12 = var11.getName();
    java.lang.String var13 = var8.formatValue((java.lang.Object)var11);
    var11.setName("'hi!'");
    java.util.List var16 = var11.getSchemas();
    org.databene.jdbacl.model.DBSchema var17 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var11);
    org.databene.jdbacl.model.DBTrigger var18 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var17);
    var18.setDescription("CREATE GENERATOR drop sequence ");
    org.databene.jdbacl.model.DefaultDBTable var22 = new org.databene.jdbacl.model.DefaultDBTable();
    var22.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var25 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var26 = var25.getForeignKeyConstraints();
    var22.addReferrer((org.databene.jdbacl.model.DBTable)var25);
    org.databene.jdbacl.model.DBDataType var30 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var31 = var30.isAlpha();
    java.lang.String var32 = var30.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var33 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var36 = var33.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var38 = var33.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var39 = var30.equals((java.lang.Object)var38);
    org.databene.jdbacl.model.DefaultDBColumn var42 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var25, var30, (java.lang.Integer)0, (java.lang.Integer)(-1));
    boolean var43 = var18.isIdentical((org.databene.jdbacl.model.DBObject)var42);
    java.lang.String[] var49 = new java.lang.String[] { ""};
    java.lang.String[] var53 = new java.lang.String[] { ""};
    java.lang.String var54 = org.databene.jdbacl.SQLUtil.join("", "", var49, "hi!", "10", var53);
    java.lang.String var55 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var49);
    java.lang.String[] var62 = new java.lang.String[] { ""};
    java.lang.String[] var66 = new java.lang.String[] { ""};
    java.lang.String var67 = org.databene.jdbacl.SQLUtil.join("", "", var62, "hi!", "10", var66);
    java.lang.String var68 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var66);
    java.lang.String var69 = org.databene.jdbacl.SQLUtil.leftJoin("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE ", var49, "jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1)", "drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)", var66);
    boolean var70 = var42.equals((java.lang.Object)"drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)");
    org.databene.jdbacl.model.DefaultDBTable var72 = new org.databene.jdbacl.model.DefaultDBTable();
    var72.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var75 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var76 = var75.getForeignKeyConstraints();
    var72.addReferrer((org.databene.jdbacl.model.DBTable)var75);
    java.lang.String[] var83 = new java.lang.String[] { ""};
    java.lang.String[] var87 = new java.lang.String[] { ""};
    java.lang.String var88 = org.databene.jdbacl.SQLUtil.join("", "", var83, "hi!", "10", var87);
    org.databene.jdbacl.model.DBUniqueConstraint var89 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var75, "select nextval('')", false, var83);
    org.databene.jdbacl.model.DBDataType var92 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var93 = var92.isAlpha();
    org.databene.jdbacl.model.DefaultDBColumn var94 = new org.databene.jdbacl.model.DefaultDBColumn("'hi!'", (org.databene.jdbacl.model.DBTable)var75, var92);
    java.lang.String var95 = var92.getName();
    var42.setType(var92);
    java.util.List var97 = var42.getUkConstraints();
    var0.traceIn("CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).", 1, (java.lang.Object)var42);
    var0.mCOMMENT_TABLE();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "DROP SEQUENCE "+ "'", var32.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var38.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "hi! as 10 on . = 10."+ "'", var54.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "."+ "'", var55.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "hi! as 10 on . = 10."+ "'", var67.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "."+ "'", var68.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)."+ "'", var69.equals("left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var88 + "' != '" + "hi! as 10 on . = 10."+ "'", var88.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var95 + "' != '" + "DROP SEQUENCE "+ "'", var95.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test479");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.skip();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var3 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var5 = var3.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var3);
    org.databene.jdbacl.sql.parser.SQLLexer var7 = new org.databene.jdbacl.sql.parser.SQLLexer();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var9 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var9.release((-1));
    boolean var13 = var7.mismatchIsUnwantedToken((org.antlr.runtime.IntStream)var9, 0);
    var0.setCharStream((org.antlr.runtime.CharStream)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mT__102();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test480");


    org.databene.jdbacl.model.DBSchema var1 = new org.databene.jdbacl.model.DBSchema("select Identity definition by unique key: select next value for 10.nextval from dual");
    java.util.List var2 = var1.getComponents();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test481");


    org.databene.jdbacl.model.DefaultDBTable var0 = new org.databene.jdbacl.model.DefaultDBTable();
    var0.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var3 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var4 = var3.getForeignKeyConstraints();
    var0.addReferrer((org.databene.jdbacl.model.DBTable)var3);
    java.lang.String[] var11 = new java.lang.String[] { "select next value for 10"};
    org.databene.jdbacl.identity.UniqueKeyIdentity var12 = new org.databene.jdbacl.identity.UniqueKeyIdentity("CREATE SEQUENCE 10", var11);
    org.databene.jdbacl.model.DefaultDBTable var16 = new org.databene.jdbacl.model.DefaultDBTable();
    var16.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var19 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var20 = var19.getForeignKeyConstraints();
    var16.addReferrer((org.databene.jdbacl.model.DBTable)var19);
    java.lang.String[] var27 = new java.lang.String[] { ""};
    java.lang.String[] var31 = new java.lang.String[] { ""};
    java.lang.String var32 = org.databene.jdbacl.SQLUtil.join("", "", var27, "hi!", "10", var31);
    org.databene.jdbacl.model.DBUniqueConstraint var33 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var19, "select nextval('')", false, var27);
    var19.setDoc("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT");
    java.lang.String[] var38 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var39 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var38);
    org.databene.jdbacl.model.DBUniqueConstraint var40 = var19.getUniqueConstraint(var38);
    org.databene.jdbacl.identity.UniqueKeyIdentity var41 = new org.databene.jdbacl.identity.UniqueKeyIdentity("select next value for SET GENERATOR.TO - 1", var38);
    java.lang.String var42 = org.databene.jdbacl.SQLUtil.leftJoin("jdbc:h2:mem:select next value for 10", var11, "VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).)", "drop sequence alter sequence hi! restart with 1", var38);
    org.databene.jdbacl.model.DBUniqueConstraint var43 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var0, "drop sequence jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", false, var11);
    org.databene.jdbacl.model.DBSchema var44 = var0.getSchema();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi! as 10 on . = 10."+ "'", var32.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var39.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "left join VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) as drop sequence alter sequence hi! restart with 1 on jdbc:h2:mem:select next value for 10.select next value for 10 = drop sequence alter sequence hi! restart with 1.DROP SEQUENCE "+ "'", var42.equals("left join VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) as drop sequence alter sequence hi! restart with 1 on jdbc:h2:mem:select next value for 10.select next value for 10 = drop sequence alter sequence hi! restart with 1.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test482");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.DBCheckConstraint var4 = new org.databene.jdbacl.model.DBCheckConstraint("alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP 'alter sequence hi! restart with 1'", false, "hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", "alter sequence hi! restart with 1");
      fail("Expected exception of type org.databene.commons.SyntaxError");
    } catch (org.databene.commons.SyntaxError e) {
      // Expected exception.
    }

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test483");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    java.util.List var3 = var0.getRuleInvocationStack();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var5 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var5.setCharPositionInLine(1);
    int var8 = var5.getCharPositionInLine();
    var5.setCharPositionInLine(69);
    var5.setCharPositionInLine(1);
    var0.setCharStream((org.antlr.runtime.CharStream)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mT__91();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test484");


    org.databene.jdbacl.version.QueryVersionProvider var1 = new org.databene.jdbacl.version.QueryVersionProvider("((\"sequence\" BETWEEN \"sequence\" AND \"sequence\"))");

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test485");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.JDBCConnectData var1 = org.databene.jdbacl.DBUtil.getConnectData("'\\n'");
      fail("Expected exception of type org.databene.commons.ConfigurationError");
    } catch (org.databene.commons.ConfigurationError e) {
      // Expected exception.
    }

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test486");


    org.databene.jdbacl.dialect.FirebirdDialect var0 = new org.databene.jdbacl.dialect.FirebirdDialect();
    java.lang.String var3 = var0.renderSetSequenceValue(".", 0L);
    boolean var6 = var0.isDefaultCatalog("drop generator sequence", "alter sequence hi! restart with 1");
    boolean var9 = var0.isDefaultCatalog("drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)", "jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1)");
    boolean var11 = var0.isDeterministicUKName("alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP 'alter sequence hi! restart with 1'");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "SET GENERATOR . TO -1"+ "'", var3.equals("SET GENERATOR . TO -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test487");


    org.databene.jdbacl.JDBCDriverInfo var1 = org.databene.jdbacl.JDBCDriverInfo.getInstance("null.jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test488");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mT__80();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test489");


    org.databene.jdbacl.dialect.HSQL2Dialect var0 = new org.databene.jdbacl.dialect.HSQL2Dialect();
    boolean var2 = var0.isDeterministicUKName("CONSTRAINT \"select nextval('')\" UNIQUE ()");
    boolean var5 = var0.isDefaultCatalog("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE ", "No identity defined for table DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT");
    java.lang.String var7 = var0.renderFetchSequenceValue("select next value for select next value for SET GENERATOR.TO - 1 NOT REGEXP 'hi!'");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "call next value for select next value for select next value for SET GENERATOR.TO - 1 NOT REGEXP 'hi!'"+ "'", var7.equals("call next value for select next value for select next value for SET GENERATOR.TO - 1 NOT REGEXP 'hi!'"));

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test490");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.FKChangeRule var1 = org.databene.jdbacl.model.FKChangeRule.valueOf("null.jdbc:h2:mem:hi! as 10 on . = 10.-identity-. join org.databene.jdbacl.SQLScriptException: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1:  as CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.). on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE .DROP SEQUENCE  = CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)..");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test491");


    org.databene.jdbacl.dialect.DerbyDialect var3 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var5 = var3.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var6 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var7 = var6.getName();
    java.lang.String var8 = var3.formatValue((java.lang.Object)var6);
    var6.setName("'hi!'");
    java.util.List var11 = var6.getSchemas();
    org.databene.jdbacl.model.DBSchema var12 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var6);
    org.databene.jdbacl.model.DBTrigger var13 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var12);
    java.lang.String var14 = var12.getName();
    org.databene.jdbacl.model.DefaultDBTable var15 = new org.databene.jdbacl.model.DefaultDBTable("drop sequence 10", var12);
    org.databene.jdbacl.model.DefaultDBTable var18 = new org.databene.jdbacl.model.DefaultDBTable();
    var18.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var21 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var22 = var21.getForeignKeyConstraints();
    var18.addReferrer((org.databene.jdbacl.model.DBTable)var21);
    java.lang.String[] var29 = new java.lang.String[] { "select next value for 10"};
    org.databene.jdbacl.identity.UniqueKeyIdentity var30 = new org.databene.jdbacl.identity.UniqueKeyIdentity("CREATE SEQUENCE 10", var29);
    org.databene.jdbacl.model.DefaultDBTable var34 = new org.databene.jdbacl.model.DefaultDBTable();
    var34.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var37 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var38 = var37.getForeignKeyConstraints();
    var34.addReferrer((org.databene.jdbacl.model.DBTable)var37);
    java.lang.String[] var45 = new java.lang.String[] { ""};
    java.lang.String[] var49 = new java.lang.String[] { ""};
    java.lang.String var50 = org.databene.jdbacl.SQLUtil.join("", "", var45, "hi!", "10", var49);
    org.databene.jdbacl.model.DBUniqueConstraint var51 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var37, "select nextval('')", false, var45);
    var37.setDoc("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT");
    java.lang.String[] var56 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var57 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var56);
    org.databene.jdbacl.model.DBUniqueConstraint var58 = var37.getUniqueConstraint(var56);
    org.databene.jdbacl.identity.UniqueKeyIdentity var59 = new org.databene.jdbacl.identity.UniqueKeyIdentity("select next value for SET GENERATOR.TO - 1", var56);
    java.lang.String var60 = org.databene.jdbacl.SQLUtil.leftJoin("jdbc:h2:mem:select next value for 10", var29, "VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).)", "drop sequence alter sequence hi! restart with 1", var56);
    org.databene.jdbacl.model.DBUniqueConstraint var61 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var18, "drop sequence jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", false, var29);
    org.databene.jdbacl.model.DBUniqueIndex var62 = new org.databene.jdbacl.model.DBUniqueIndex("VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) = \"sequence\"", false, var61);
    var62.addColumnName("alter sequence CREATE SEQUENCE DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1. restart with 1");
    var15.addIndex((org.databene.jdbacl.model.DBIndex)var62);
    boolean var66 = var62.isUnique();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")"+ "'", var14.equals("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi! as 10 on . = 10."+ "'", var50.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var57.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "left join VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) as drop sequence alter sequence hi! restart with 1 on jdbc:h2:mem:select next value for 10.select next value for 10 = drop sequence alter sequence hi! restart with 1.DROP SEQUENCE "+ "'", var60.equals("left join VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) as drop sequence alter sequence hi! restart with 1 on jdbc:h2:mem:select next value for 10.select next value for 10 = drop sequence alter sequence hi! restart with 1.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test492");


    org.databene.jdbacl.dialect.DerbyDialect var4 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var6 = var4.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var7 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var8 = var7.getName();
    java.lang.String var9 = var4.formatValue((java.lang.Object)var7);
    var7.setName("'hi!'");
    java.util.List var12 = var7.getSchemas();
    org.databene.jdbacl.model.DBSchema var13 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var7);
    org.databene.jdbacl.model.DBTrigger var14 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var13);
    java.util.List var15 = var13.getPackages();
    org.databene.jdbacl.model.DBPackage var16 = new org.databene.jdbacl.model.DBPackage("CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).", var13);
    java.util.List var17 = var16.getComponents();
    org.databene.jdbacl.model.DBProcedure var18 = new org.databene.jdbacl.model.DBProcedure("CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var16);
    org.databene.jdbacl.dialect.DerbyDialect var23 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var25 = var23.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var26 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var27 = var26.getName();
    java.lang.String var28 = var23.formatValue((java.lang.Object)var26);
    var26.setName("'hi!'");
    java.util.List var31 = var26.getSchemas();
    org.databene.jdbacl.model.DBSchema var32 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var26);
    org.databene.jdbacl.model.DBTrigger var33 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var32);
    java.util.List var34 = var32.getPackages();
    org.databene.jdbacl.model.DBPackage var35 = new org.databene.jdbacl.model.DBPackage("CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).", var32);
    java.util.List var36 = var35.getComponents();
    org.databene.jdbacl.model.DBProcedure var37 = new org.databene.jdbacl.model.DBProcedure("CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var35);
    var16.addProcedure(var37);
    var16.setDataObjectId("left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).");
    java.lang.String var41 = var16.getDataObjectId();
    java.lang.String var42 = var16.getObjectType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)."+ "'", var41.equals("left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test493");


    org.databene.jdbacl.model.TableContainerSupport var0 = new org.databene.jdbacl.model.TableContainerSupport();
    org.databene.jdbacl.model.TableContainer var3 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var4 = var3.getTables();
    org.databene.jdbacl.model.TableContainer var5 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var3);
    org.databene.jdbacl.dialect.DerbyDialect var7 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var9 = var7.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var10 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var11 = var10.getName();
    java.lang.String var12 = var7.formatValue((java.lang.Object)var10);
    var10.setName("'hi!'");
    java.util.List var15 = var10.getSchemas();
    java.util.List var16 = var5.getTables(false, var15);
    org.databene.jdbacl.model.DBCatalog var19 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var20 = var19.getName();
    org.databene.jdbacl.model.Database var21 = var19.getDatabase();
    java.lang.String var22 = var19.getDoc();
    org.databene.jdbacl.dialect.DerbyDialect var24 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var26 = var24.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var27 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var28 = var27.getName();
    java.lang.String var29 = var24.formatValue((java.lang.Object)var27);
    var27.setName("'hi!'");
    java.util.List var32 = var27.getSchemas();
    org.databene.jdbacl.model.DBSchema var33 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var27);
    var19.removeSchema(var33);
    org.databene.jdbacl.dialect.DerbyDialect var37 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var39 = var37.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var40 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var41 = var40.getName();
    java.lang.String var42 = var37.formatValue((java.lang.Object)var40);
    var40.setName("'hi!'");
    java.util.List var45 = var40.getSchemas();
    org.databene.jdbacl.model.DBSchema var46 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var40);
    org.databene.jdbacl.model.DBTrigger var47 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var46);
    var47.setDescription("CREATE GENERATOR drop sequence ");
    java.lang.String var50 = var47.getTriggerBody();
    java.lang.String var51 = var47.getColumnName();
    java.lang.String var52 = var47.getWhenClause();
    var33.addTrigger(var47);
    org.databene.jdbacl.model.DBTrigger var54 = new org.databene.jdbacl.model.DBTrigger("-1", var33);
    java.util.List var56 = var33.getSequences(true);
    java.util.List var57 = var5.getSequences(true, var56);
    java.util.List var59 = var5.getSequences(true);
    org.databene.jdbacl.model.DefaultDBTable var60 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var61 = var60.getForeignKeyConstraints();
    var60.setDoc("drop sequence ");
    var60.setDoc("catalog");
    var5.removeTable((org.databene.jdbacl.model.DBTable)var60);
    var0.addSubContainer(var5);
    java.util.List var68 = var0.getTables();
    java.util.List var70 = var0.getSequences(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test494");


    org.databene.jdbacl.model.DBSchema var1 = new org.databene.jdbacl.model.DBSchema("select alter sequence drop sequence 10 restart with 0.nextval from dual");

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test495");


    org.databene.jdbacl.model.DefaultDBTable var3 = new org.databene.jdbacl.model.DefaultDBTable();
    var3.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var6 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var7 = var6.getForeignKeyConstraints();
    var3.addReferrer((org.databene.jdbacl.model.DBTable)var6);
    org.databene.jdbacl.model.DBDataType var11 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var12 = var11.isAlpha();
    java.lang.String var13 = var11.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var14 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var17 = var14.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var19 = var14.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var20 = var11.equals((java.lang.Object)var19);
    org.databene.jdbacl.model.DefaultDBColumn var23 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var6, var11, (java.lang.Integer)0, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DefaultDBTable var24 = new org.databene.jdbacl.model.DefaultDBTable();
    var24.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var27 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var28 = var27.getForeignKeyConstraints();
    var24.addReferrer((org.databene.jdbacl.model.DBTable)var27);
    var6.addReferrer((org.databene.jdbacl.model.DBTable)var24);
    org.databene.jdbacl.model.TableContainer var35 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var36 = var35.getTables();
    org.databene.jdbacl.model.TableContainer var37 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var35);
    org.databene.jdbacl.model.DefaultDBTable var38 = new org.databene.jdbacl.model.DefaultDBTable();
    var38.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var41 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var42 = var41.getForeignKeyConstraints();
    var38.addReferrer((org.databene.jdbacl.model.DBTable)var41);
    var35.addTable((org.databene.jdbacl.model.DBTable)var41);
    java.lang.String[] var49 = new java.lang.String[] { ""};
    java.lang.String[] var53 = new java.lang.String[] { ""};
    java.lang.String var54 = org.databene.jdbacl.SQLUtil.join("", "", var49, "hi!", "10", var53);
    java.lang.String var55 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var49);
    org.databene.jdbacl.model.TableContainer var58 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var59 = var58.getTables();
    org.databene.jdbacl.model.TableContainer var60 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var58);
    org.databene.jdbacl.model.DefaultDBTable var61 = new org.databene.jdbacl.model.DefaultDBTable();
    var61.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var64 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var65 = var64.getForeignKeyConstraints();
    var61.addReferrer((org.databene.jdbacl.model.DBTable)var64);
    var58.addTable((org.databene.jdbacl.model.DBTable)var64);
    java.lang.String[] var70 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var71 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var70);
    org.databene.jdbacl.model.DBForeignKeyConstraint var72 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var41, var49, (org.databene.jdbacl.model.DBTable)var64, var70);
    org.databene.jdbacl.model.DBTable var73 = var72.getRefereeTable();
    var6.addForeignKey(var72);
    org.databene.jdbacl.model.FKChangeRule var75 = var72.getDeleteRule();
    java.lang.String var76 = var75.toString();
    java.lang.String var77 = var75.toString();
    java.lang.Class var78 = var75.getDeclaringClass();
    org.databene.jdbacl.ColumnInfo var79 = new org.databene.jdbacl.ColumnInfo("alter sequence CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT restart with 1", 10, var78);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var81 = java.lang.Enum.<java.lang.Enum>valueOf(var78, "select next value for select next value for SET GENERATOR.TO - 1 NOT REGEXP 'hi!'");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "DROP SEQUENCE "+ "'", var13.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var19.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "hi! as 10 on . = 10."+ "'", var54.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "."+ "'", var55.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var71.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "NO_ACTION"+ "'", var76.equals("NO_ACTION"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "NO_ACTION"+ "'", var77.equals("NO_ACTION"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test496");


    org.databene.jdbacl.dialect.H2Dialect var0 = new org.databene.jdbacl.dialect.H2Dialect();
    java.lang.String var2 = var0.renderFetchSequenceValue("10");
    java.lang.String var5 = var0.setSequenceValue("CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", 1L);
    boolean var7 = var0.isDeterministicIndexName("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT");
    boolean var9 = var0.isDeterministicFKName("drop generator CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE ");
    boolean var12 = var0.isDefaultCatalog("-1.DROP SEQUENCE ", "select next value for 10");
    java.lang.String var15 = var0.setSequenceValue("call next value for 'hi!'", 100L);
    boolean var16 = var0.supportsRegex();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "select next value for 10"+ "'", var2.equals("select next value for 10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "alter sequence CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT restart with 1"+ "'", var5.equals("alter sequence CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT restart with 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "alter sequence call next value for 'hi!' restart with 100"+ "'", var15.equals("alter sequence call next value for 'hi!' restart with 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test497");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.sql.Connection var2 = org.databene.jdbacl.DBUtil.connect("select Identity definition by unique key: select next value for 10.nextval from dual", false);
      fail("Expected exception of type org.databene.commons.ConfigurationError");
    } catch (org.databene.commons.ConfigurationError e) {
      // Expected exception.
    }

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test498");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.sql.parser.ANTLRNoCaseFileStream var2 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseFileStream("select next value for SET GENERATOR.TO - 1", "'d'");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test499");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.DBCheckConstraint var4 = new org.databene.jdbacl.model.DBCheckConstraint("'hi!'", false, "alter sequence NOT REGEXP_LIKE(SET GENERATOR alter sequence CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT restart with 1 TO -2, '.') restart with 10", "NOT drop generator sequence ~ 'hi!'");
      fail("Expected exception of type org.databene.commons.SyntaxError");
    } catch (org.databene.commons.SyntaxError e) {
      // Expected exception.
    }

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test500");


    boolean var1 = org.databene.jdbacl.DBUtil.existsEnvironment("hi! as 10 on . = 10..NOT drop generator sequence ~ 'hi!', hi! as 10 on . = 10..alter sequence CREATE GENERATOR drop sequence  restart with -1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

}
