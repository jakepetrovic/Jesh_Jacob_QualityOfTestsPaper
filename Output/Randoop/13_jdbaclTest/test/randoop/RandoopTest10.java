package randoop;

import junit.framework.*;

public class RandoopTest10 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test1");


    org.databene.jdbacl.model.jdbc.JDBCDBImporter var6 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var6.setImportingIndexes(true);
    var6.close();
    var6.setExcludeTables("alter sequence hi! restart with 1");
    java.lang.String var12 = var6.toString();
    org.databene.jdbacl.model.cache.CachingDBImporter var14 = new org.databene.jdbacl.model.cache.CachingDBImporter((org.databene.jdbacl.model.DBMetaDataImporter)var6, "select nextval for ') from REGEXP_MATCHES(CONSTRAINT \"select nextval('')\" , 'CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)");
    org.databene.jdbacl.model.cache.CachingDBImporter var16 = new org.databene.jdbacl.model.cache.CachingDBImporter((org.databene.jdbacl.model.DBMetaDataImporter)var6, "select NOT REGEXP_LIKE(SET GENERATOR alter sequence CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT restart with 1 TO -2, '.').nextval from dual");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.Database var17 = var16.importDatabase();
      fail("Expected exception of type org.databene.commons.ConnectFailedException");
    } catch (org.databene.commons.ConnectFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "JDBCDBImporter"+ "'", var12.equals("JDBCDBImporter"));

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test2");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    java.lang.String var9 = var0.getCharErrorDisplay(100);
    var0.mCOLUMN_NAME();
    var0.traceIn("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT (, sequence) unique", 69);
    var0.mCREATE_SEQUENCE();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mPRIMARY();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "'d'"+ "'", var9.equals("'d'"));

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test3");


    org.databene.jdbacl.model.DBSequence var5 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    java.math.BigInteger var6 = var5.getMaxValue();
    org.databene.jdbacl.model.DBCatalog var7 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var8 = var7.getName();
    org.databene.jdbacl.model.Database var9 = var7.getDatabase();
    java.lang.String var10 = var7.getDoc();
    org.databene.jdbacl.dialect.DerbyDialect var12 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var14 = var12.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var15 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var16 = var15.getName();
    java.lang.String var17 = var12.formatValue((java.lang.Object)var15);
    var15.setName("'hi!'");
    java.util.List var20 = var15.getSchemas();
    org.databene.jdbacl.model.DBSchema var21 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var15);
    var7.removeSchema(var21);
    org.databene.jdbacl.dialect.DerbyDialect var25 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var27 = var25.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var28 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var29 = var28.getName();
    java.lang.String var30 = var25.formatValue((java.lang.Object)var28);
    var28.setName("'hi!'");
    java.util.List var33 = var28.getSchemas();
    org.databene.jdbacl.model.DBSchema var34 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var28);
    org.databene.jdbacl.model.DBTrigger var35 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var34);
    var35.setDescription("CREATE GENERATOR drop sequence ");
    java.lang.String var38 = var35.getTriggerBody();
    java.lang.String var39 = var35.getColumnName();
    java.lang.String var40 = var35.getWhenClause();
    var21.addTrigger(var35);
    boolean var42 = var5.isIdentical((org.databene.jdbacl.model.DBObject)var21);
    java.util.List var43 = var21.getPackages();
    org.databene.jdbacl.model.DBSequence var44 = new org.databene.jdbacl.model.DBSequence("NO_ACTION", var21);
    org.databene.jdbacl.model.DBPackage var45 = new org.databene.jdbacl.model.DBPackage("jdbc:h2:mem:hi! as 10 on . = 10.-identity-. DROP SEQUENCE (0,-1) NULL", var21);
    var45.setDataObjectId("jdbc:h2:mem:select nextval('CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT')");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test4");


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
    int var16 = var0.getCharPositionInLine();
    boolean var17 = var0.failed();
    org.databene.jdbacl.sql.parser.SQLLexer var18 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var18.skip();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var21 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var23 = var21.LT(10);
    var18.setCharStream((org.antlr.runtime.CharStream)var21);
    org.databene.jdbacl.sql.parser.SQLLexer var25 = new org.databene.jdbacl.sql.parser.SQLLexer();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var27 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var27.release((-1));
    boolean var31 = var25.mismatchIsUnwantedToken((org.antlr.runtime.IntStream)var27, 0);
    var18.setCharStream((org.antlr.runtime.CharStream)var27);
    var0.matchAny((org.antlr.runtime.IntStream)var27);
    int var35 = var27.LT(4);
    int var37 = var27.LA(80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == (-1));

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test5");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mT__92();
    var10.mDROP_TABLE();
    var10.mT__124();
    var10.mGE();
    var10.match("left join jdbc : h2 : mem : hi ! as 10 on.= 10.- identity -.: DROP SEQUENCE (0, - 1) as CREATE GENERATOR on jdbc : h2 : mem : hi ! as 10 on.= 10.- identity -..DROP SEQUENCE = CREATE GENERATOR.");
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var29 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("org.databene.jdbacl.SQLScriptException: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1: ", "insert into \"'hi!'\".\"(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")\".\"drop generator CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE \" () values ()", "UniqueKeyIdentity(select next value for SET GENERATOR.TO - 1-identity-SubNkPkQueryIdentity(null) ~ 'VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) = \"sequence\" (select next value for 10, alter sequence CREATE SEQUENCE DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1. restart with 1) unique')", "jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1): class org.databene.jdbacl.model.FKChangeRule", "alter sequence catalog restart with 1", "'\u0006'");
    org.databene.jdbacl.model.cache.CachingDBImporter var31 = new org.databene.jdbacl.model.cache.CachingDBImporter((org.databene.jdbacl.model.DBMetaDataImporter)var29, "SELECT * FROM null WHERE  = 'CREATE GENERATOR '");
    var10.traceIn("drop sequence alter sequence hi! restart with 1 NOT REGEXP 'call next value for jdbc:h2:mem:DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT'", 10, (java.lang.Object)"SELECT * FROM null WHERE  = 'CREATE GENERATOR '");
    org.databene.jdbacl.sql.parser.SQLLexer var33 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var33.mCREATE_TABLE();
    var33.mNAME_LIST();
    var33.mCREATE_TABLE();
    var33.mCOMMENT_TABLE();
    var33.mDROP_TABLE();
    int var39 = var33.getRuleMemoizationCacheSize();
    org.databene.jdbacl.model.TableContainer var41 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var42 = var41.getTables();
    java.util.List var44 = var41.getTables(false);
    java.util.List var46 = var41.getSequences(false);
    java.util.List var47 = var33.toStrings(var46);
    org.databene.jdbacl.sql.parser.SQLLexer var48 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var48.mCREATE_TABLE();
    var48.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var52 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var54 = var52.LT(10);
    var48.setCharStream((org.antlr.runtime.CharStream)var52);
    int var57 = var52.LA(10);
    int var58 = var52.getLine();
    java.lang.String var59 = var52.toString();
    var52.consume();
    var33.matchAny((org.antlr.runtime.IntStream)var52);
    java.lang.String var62 = var52.toString();
    var10.matchAny((org.antlr.runtime.IntStream)var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "DROP SEQUENCE "+ "'", var59.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "DROP SEQUENCE "+ "'", var62.equals("DROP SEQUENCE "));

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test6");


    org.databene.jdbacl.identity.xml.IdentityParseContext var0 = new org.databene.jdbacl.identity.xml.IdentityParseContext();
    org.databene.jdbacl.identity.xml.IdentityParser var1 = new org.databene.jdbacl.identity.xml.IdentityParser();
    var0.addParser((org.databene.webdecs.xml.XMLElementParser)var1);
    java.lang.Object[] var4 = org.databene.jdbacl.SQLUtil.parseColumnTypeAndSize("drop sequence 10");
    java.lang.Object[] var6 = var0.createSubPath(var4, (java.lang.Object)(byte)(-1));
    org.databene.jdbacl.identity.IdentityProvider var7 = var0.getIdentityProvider();
    var0.remove("drop sequence CONSTRAINT \"select nextval('')\" UNIQUE ()");
    org.databene.jdbacl.identity.IdentityProvider var10 = var0.getIdentityProvider();
    org.databene.jdbacl.JDBCDriverInfo var12 = new org.databene.jdbacl.JDBCDriverInfo();
    var12.setDriverClass("hi!");
    var0.set("VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) = \"sequence\" (select next value for 10) unique", (java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test7");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.JDBCConnectData var1 = org.databene.jdbacl.JDBCConnectData.parseSingleDbProperties("false");
      fail("Expected exception of type org.databene.commons.ConfigurationError");
    } catch (org.databene.commons.ConfigurationError e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test8");


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
    var36.setDefaultValue("drop sequence 10");
    java.lang.Integer var40 = var36.getSize();
    
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
    assertTrue("'" + var40 + "' != '" + 0+ "'", var40.equals(0));

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test9");


    org.databene.jdbacl.JDBCDriverInfo var0 = new org.databene.jdbacl.JDBCDriverInfo();
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var7 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var7.setExcludeTables("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    boolean var10 = var0.equals((java.lang.Object)var7);
    var0.setDownloadUrl("jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1)");
    var0.setDefaultSchema("org.databene.jdbacl.SQLScriptException: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1:  as null[DROP SEQUENCE ] on DROP SEQUENCE NOT drop generator sequence ~ 'hi!' RESTRICT identity by primary key. = null[DROP SEQUENCE ].DROP SEQUENCE ");
    java.lang.String var15 = var0.getDefaultDatabase();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test10");


    org.databene.jdbacl.SQLScriptException var2 = new org.databene.jdbacl.SQLScriptException(1);
    org.databene.jdbacl.SQLScriptException var4 = var2.withUri("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    org.databene.jdbacl.SQLScriptException var6 = var4.withUri("SET GENERATOR . TO -1");
    org.databene.jdbacl.identity.InvalidIdentityDefinitionError var7 = new org.databene.jdbacl.identity.InvalidIdentityDefinitionError("DROP SEQUENCE CREATE GENERATOR  RESTRICT.DROP SEQUENCE ", (java.lang.Throwable)var6);
    int var8 = var6.getLineNo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test11");


    org.databene.jdbacl.model.DBCatalog var1 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var2 = var1.getName();
    java.util.List var3 = var1.getComponents();
    org.databene.jdbacl.model.DBSchema var5 = var1.getSchema("alter sequence hi! restart with 1");
    org.databene.jdbacl.model.DBSchema var7 = var1.getSchema("jdbc:h2:mem:hi! as 10 on . = 10.");
    java.lang.String var8 = var1.getName();
    org.databene.jdbacl.model.TableContainer var9 = new org.databene.jdbacl.model.TableContainer("drop sequence jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.CompositeDBObject)var1);
    org.databene.jdbacl.model.DBSchema var11 = var1.getSchema("alter sequence CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT restart with 1");
    var1.setDoc("call next value for 'O'");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test12");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.DBCheckConstraint var4 = new org.databene.jdbacl.model.DBCheckConstraint("CREATE SEQUENCE CONSTRAINT \"select nextval('')\" UNIQUE () DROP SEQUENCE (100) NULL", false, "10", "(\"sequence\" null \"sequence\" null \"sequence\")");
      fail("Expected exception of type org.databene.commons.ParseException");
    } catch (org.databene.commons.ParseException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test13");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mLE();
    var10.mT__99();
    var10.mXOR();
    var10.mALTER_TABLE();
    var10.mT__134();
    java.lang.String[] var20 = var10.getTokenNames();
    var10.mSUB();
    var10.mT__114();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test14");


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
    var0.mALTER_TABLE();
    var0.emitErrorMessage("hi! as 10 on . = 10.");
    java.lang.String var19 = var0.getSourceName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mT__95();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test15");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mCOLUMN_SPEC();
    var0.setBacktrackingLevel(6);
    var0.setText("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)");
    var0.mTABLE_DETAILS();
    var0.mARGUMENTS();

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test16");


    org.databene.jdbacl.dialect.H2Dialect var0 = new org.databene.jdbacl.dialect.H2Dialect();
    java.lang.String var2 = var0.renderFetchSequenceValue("SET GENERATOR . TO -1");
    boolean var3 = var0.isSequenceSupported();
    java.lang.String var7 = var0.regexQuery("CONSTRAINT hi! UNIQUE ()", false, "10");
    boolean var9 = var0.isDeterministicPKName("CONSTRAINT \"hi! identity by primary key\" PRIMARY KEY ().");
    java.lang.String var12 = var0.setSequenceValue("drop generator CREATE SEQUENCE \"hi! as 10 on . = 10.\".\"\" CACHE 100NOORDER", (-1L));
    boolean var15 = var0.isDefaultSchema("drop generator sequence", "drop generator sequence.NOT drop generator sequence ~ 'hi!'");
    org.databene.jdbacl.sql.parser.SQLLexer var16 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var16.mCREATE_TABLE();
    var16.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var20 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var22 = var20.LT(10);
    var16.setCharStream((org.antlr.runtime.CharStream)var20);
    int var25 = var20.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var26 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var20);
    var26.setText("select next value for SET GENERATOR.TO - 1");
    var26.setBacktrackingLevel(1);
    var26.mT__92();
    var26.mDROP_TABLE();
    var26.mT__124();
    var26.mDROP_TABLE();
    int var35 = var26.getBacktrackingLevel();
    var26.mCOMMENT_COLUMN();
    var26.mT__122();
    java.lang.String var38 = var0.formatValue((java.lang.Object)var26);
    var26.mCOLUMN_SPEC();
    var26.mGT();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "select next value for SET GENERATOR . TO -1"+ "'", var2.equals("select next value for SET GENERATOR . TO -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "CONSTRAINT hi! UNIQUE () REGEXP '10'"+ "'", var7.equals("CONSTRAINT hi! UNIQUE () REGEXP '10'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "alter sequence drop generator CREATE SEQUENCE \"hi! as 10 on . = 10.\".\"\" CACHE 100NOORDER restart with -1"+ "'", var12.equals("alter sequence drop generator CREATE SEQUENCE \"hi! as 10 on . = 10.\".\"\" CACHE 100NOORDER restart with -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test17");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    int var11 = var4.LT(3);
    int var13 = var4.LT(76);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.script.Expression var14 = org.databene.jdbacl.sql.SQLParserUtil.parseExpression((org.antlr.runtime.CharStream)var4);
      fail("Expected exception of type org.databene.commons.SyntaxError");
    } catch (org.databene.commons.SyntaxError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test18");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.sql.parser.ANTLRNoCaseFileStream var1 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseFileStream("CONSTRAINT \"CREATE GENERATOR drop sequence \" ");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test19");


    org.databene.jdbacl.model.DBDataType var2 = org.databene.jdbacl.model.DBDataType.getInstance(309, "select gen_id(VALUES (NEXT VALUE FOR call next value for 'hi!') SIMILAR TO 'alter sequence CREATE GENERATOR drop sequence  restart with -1', 1) from RDB$DATABASE;");
    int var3 = var2.getJdbcType();
    int var4 = var2.getJdbcType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 309);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 309);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test20");


    org.databene.jdbacl.dialect.DB2Dialect var0 = new org.databene.jdbacl.dialect.DB2Dialect();
    boolean var2 = var0.isDeterministicUKName("alter sequence CONSTRAINT \"select nextval('')\" UNIQUE () restart with -1");
    boolean var4 = var0.isDeterministicPKName("NaturalPkIdentity(hi!)");
    boolean var6 = var0.isDeterministicPKName("SET GENERATOR Sub identity of ():\nnull TO -1");
    boolean var8 = var0.isDeterministicIndexName("10");
    boolean var10 = var0.isDeterministicIndexName("drop sequence select gen_id(DROP SEQUENCE EQUEN RESTRICT, 1) from RDB$DATABASE;");
    boolean var12 = var0.isDeterministicPKName("DROP SEQUENCE (0,-1)");
    boolean var14 = var0.isDeterministicPKName("(\"sequence\")");
    boolean var17 = var0.isDefaultCatalog("() SIMILAR TO 'jdbc:hsqldb:mem:call next value for 'hi!' identity by primary key'", "call next value for 'hi!' identity by primary key");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test21");


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
    java.lang.String var66 = var35.getOverload();
    var35.setOverload("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\"): class org.databene.jdbacl.model.FKChangeRule");
    
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

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test22");


    org.databene.jdbacl.sql.ColumnExpression var2 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var5 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var6 = var5.getValue();
    org.databene.jdbacl.sql.ColumnExpression var9 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var10 = var9.getValue();
    org.databene.jdbacl.sql.BetweenExpression var11 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var2, (org.databene.script.Expression)var5, (org.databene.script.Expression)var9);
    java.lang.String var12 = var5.getColumnName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "sequence"+ "'", var6.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "sequence"+ "'", var10.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "sequence"+ "'", var12.equals("sequence"));

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test23");


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
    org.databene.jdbacl.model.DBTable var88 = var85.getRefereeTable();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test24");


    org.databene.jdbacl.model.DBCatalog var0 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var1 = var0.getName();
    org.databene.jdbacl.model.Database var2 = var0.getDatabase();
    java.lang.String var3 = var0.getDoc();
    java.util.List var4 = var0.getSequences();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeTable("drop sequence ()");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test25");


    java.lang.String[] var4 = new java.lang.String[] { ""};
    java.lang.String[] var8 = new java.lang.String[] { ""};
    java.lang.String var9 = org.databene.jdbacl.SQLUtil.join("", "", var4, "hi!", "10", var8);
    org.databene.jdbacl.identity.IdentityProvider var10 = new org.databene.jdbacl.identity.IdentityProvider();
    org.databene.jdbacl.identity.SubNkPkQueryIdentity var11 = new org.databene.jdbacl.identity.SubNkPkQueryIdentity("null", var4, var10);
    var11.setSubNkPkQuery("null");
    var11.setSubNkPkQuery("DROP SEQUENCE  NOT REGEXP 'VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).)'");
    java.lang.String var16 = var11.getName();
    java.lang.String var17 = var11.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi! as 10 on . = 10."+ "'", var9.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "null"+ "'", var16.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Sub identity of ():\nDROP SEQUENCE  NOT REGEXP 'VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).)'"+ "'", var17.equals("Sub identity of ():\nDROP SEQUENCE  NOT REGEXP 'VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).)'"));

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test26");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mLE();
    var10.mVARCHAR2();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var18 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("select next value for SET GENERATOR . TO -1 DROP SEQUENCE  NULL");
    boolean var20 = var10.mismatchIsUnwantedToken((org.antlr.runtime.IntStream)var18, 6);
    var10.mT__101();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test27");


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
    org.databene.jdbacl.model.DefaultDBTable var26 = new org.databene.jdbacl.model.DefaultDBTable();
    var26.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var29 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var30 = var29.getForeignKeyConstraints();
    var26.addReferrer((org.databene.jdbacl.model.DBTable)var29);
    var8.addReferrer((org.databene.jdbacl.model.DBTable)var26);
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
    org.databene.jdbacl.model.DBTable var75 = var74.getRefereeTable();
    var8.addForeignKey(var74);
    org.databene.jdbacl.model.FKChangeRule var77 = var74.getDeleteRule();
    java.lang.String var78 = var77.toString();
    java.lang.String var79 = var77.toString();
    java.lang.Class var80 = var77.getDeclaringClass();
    org.databene.jdbacl.ColumnInfo var81 = new org.databene.jdbacl.ColumnInfo("alter sequence CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT restart with 1", 10, var80);
    org.databene.jdbacl.ColumnInfo var82 = new org.databene.jdbacl.ColumnInfo("jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1)", 32, var80);
    org.databene.jdbacl.ResultSetConverter var84 = new org.databene.jdbacl.ResultSetConverter(var80, false);
    java.lang.Class var85 = var84.getTargetType();
    org.databene.jdbacl.ResultSetConverter var86 = new org.databene.jdbacl.ResultSetConverter(var85);
    org.databene.jdbacl.ResultSetConverter var88 = new org.databene.jdbacl.ResultSetConverter(var85, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var90 = java.lang.Enum.<java.lang.Enum>valueOf(var85, "drop sequence drop generator SET GENERATOR select nextval for  DROP SEQUENCE (0,-1) NULL from jdbc:h2:mem:hi! as 10 on . = 10.-identity- TO 0");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
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
    assertNotNull(var30);
    
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
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + "NO_ACTION"+ "'", var78.equals("NO_ACTION"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + "NO_ACTION"+ "'", var79.equals("NO_ACTION"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test28");


    org.databene.jdbacl.model.DBDataType var2 = org.databene.jdbacl.model.DBDataType.getInstance(0, "alter sequence CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT restart with 1");
    boolean var3 = var2.isNumber();
    boolean var4 = var2.isTemporal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test29");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mT__92();
    var10.mDROP_TABLE();
    var10.mT__124();
    var10.mDROP_TABLE();
    int var19 = var10.getBacktrackingLevel();
    var10.mCOMMENT_COLUMN();
    var10.mALTER_TABLE();
    var10.mT__90();
    var10.mT__121();
    int var24 = var10.getNumberOfSyntaxErrors();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test30");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.DBCheckConstraint var4 = new org.databene.jdbacl.model.DBCheckConstraint("derby", false, "'\u0135'.NOT drop generator sequence ~ 'hi!'.", "CREATE SEQUENCE \"hi! as 10 on . = 10.\".\"\" CACHE 100");
      fail("Expected exception of type org.databene.commons.SyntaxError");
    } catch (org.databene.commons.SyntaxError e) {
      // Expected exception.
    }

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test31");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var2 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var2.release((-1));
    boolean var6 = var0.mismatchIsUnwantedToken((org.antlr.runtime.IntStream)var2, 0);
    org.databene.jdbacl.sql.parser.SQLLexer var7 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var7.mCREATE_TABLE();
    var7.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var11 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var13 = var11.LT(10);
    var7.setCharStream((org.antlr.runtime.CharStream)var11);
    boolean var16 = var0.mismatchIsUnwantedToken((org.antlr.runtime.IntStream)var11, 69);
    var0.mCOLUMN_NAME();
    var0.mSIZE();
    var0.mINDEX_NAME();
    var0.traceOut("call next value for null[]", 14, (java.lang.Object)"select gen_id(CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)., 1) from RDB$DATABASE;");
    org.databene.jdbacl.sql.parser.SQLLexer var24 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var24.mCREATE_TABLE();
    var24.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var28 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var30 = var28.LT(10);
    var24.setCharStream((org.antlr.runtime.CharStream)var28);
    int var33 = var28.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var34 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var28);
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var36 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var38 = var36.LT(10);
    boolean var40 = var34.mismatchIsUnwantedToken((org.antlr.runtime.IntStream)var36, 69);
    int var41 = var36.size();
    java.lang.String var42 = var36.getSourceName();
    var0.consumeUntil((org.antlr.runtime.IntStream)var36, 14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test32");


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
    org.databene.jdbacl.model.DBTable var43 = var41.getTable();
    java.lang.String var44 = var41.toString();
    org.databene.jdbacl.model.CompositeDBObject var45 = var41.getOwner();
    java.lang.String[] var46 = var41.getRefereeColumnNames();
    org.databene.jdbacl.dialect.FirebirdDialect var47 = new org.databene.jdbacl.dialect.FirebirdDialect();
    boolean var49 = var47.isDeterministicUKName("10");
    boolean var52 = var47.isDefaultCatalog("CREATE SEQUENCE 10", "left join VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) as drop sequence alter sequence hi! restart with 1 on jdbc:h2:mem:select next value for 10.select next value for 10 = drop sequence alter sequence hi! restart with 1.DROP SEQUENCE ");
    boolean var54 = var47.isDeterministicUKName("select gen_id(CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)., 1) from RDB$DATABASE;");
    boolean var55 = var47.isSequenceBoundarySupported();
    java.lang.String var57 = var47.renderCreateSequence("'d'");
    boolean var58 = var41.equals((java.lang.Object)"'d'");
    java.lang.String var59 = var41.toString();
    org.databene.jdbacl.model.DBTable var60 = var41.getRefereeTable();
    java.lang.String[] var61 = var41.getRefereeColumnNames();
    
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
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )"+ "'", var44.equals("CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "CREATE GENERATOR 'd'"+ "'", var57.equals("CREATE GENERATOR 'd'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )"+ "'", var59.equals("CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test33");


    org.databene.jdbacl.model.TableContainerSupport var0 = new org.databene.jdbacl.model.TableContainerSupport();
    java.util.List var2 = var0.getTables(false);
    org.databene.jdbacl.model.TableContainer var5 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var6 = var5.getTables();
    java.util.List var8 = var5.getSequences(false);
    java.util.List var9 = var0.getSequences(false, var8);
    org.databene.jdbacl.model.TableContainer var11 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var12 = var11.getTables();
    org.databene.jdbacl.model.DefaultDBTable var13 = new org.databene.jdbacl.model.DefaultDBTable();
    var13.setDoc(".");
    boolean var17 = var13.equals((java.lang.Object)(-1.0f));
    var11.removeTable((org.databene.jdbacl.model.DBTable)var13);
    var0.addSubContainer(var11);
    org.databene.jdbacl.model.DBCatalog var22 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var23 = var22.getName();
    org.databene.jdbacl.model.Database var24 = var22.getDatabase();
    java.lang.String var25 = var22.getDoc();
    org.databene.jdbacl.dialect.DerbyDialect var27 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var29 = var27.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var30 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var31 = var30.getName();
    java.lang.String var32 = var27.formatValue((java.lang.Object)var30);
    var30.setName("'hi!'");
    java.util.List var35 = var30.getSchemas();
    org.databene.jdbacl.model.DBSchema var36 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var30);
    var22.removeSchema(var36);
    var22.setName("select nextval('CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT')");
    org.databene.jdbacl.model.DBSchema var40 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var22);
    java.util.List var41 = var22.getComponents();
    java.util.List var42 = var0.getSequences(false, var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test34");


    org.databene.jdbacl.identity.NaturalPkIdentity var1 = new org.databene.jdbacl.identity.NaturalPkIdentity("hi!");
    java.lang.String var2 = var1.getName();
    boolean var4 = var1.equals((java.lang.Object)(-1.0d));
    var1.addIrrelevantColumn("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")");
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
    org.databene.jdbacl.model.DBDataType var31 = var30.getType();
    org.databene.jdbacl.model.DefaultDBTable var32 = new org.databene.jdbacl.model.DefaultDBTable();
    var32.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var35 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var36 = var35.getForeignKeyConstraints();
    var32.addReferrer((org.databene.jdbacl.model.DBTable)var35);
    java.lang.String[] var43 = new java.lang.String[] { ""};
    java.lang.String[] var47 = new java.lang.String[] { ""};
    java.lang.String var48 = org.databene.jdbacl.SQLUtil.join("", "", var43, "hi!", "10", var47);
    org.databene.jdbacl.model.DBUniqueConstraint var49 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var35, "select nextval('')", false, var43);
    var49.addColumnName("sequence");
    var30.addUkConstraint(var49);
    org.databene.jdbacl.model.DBUniqueIndex var53 = new org.databene.jdbacl.model.DBUniqueIndex("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", false, var49);
    org.databene.jdbacl.model.DefaultDBTable var54 = new org.databene.jdbacl.model.DefaultDBTable();
    var54.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var57 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var58 = var57.getForeignKeyConstraints();
    var54.addReferrer((org.databene.jdbacl.model.DBTable)var57);
    java.lang.String[] var65 = new java.lang.String[] { ""};
    java.lang.String[] var69 = new java.lang.String[] { ""};
    java.lang.String var70 = org.databene.jdbacl.SQLUtil.join("", "", var65, "hi!", "10", var69);
    org.databene.jdbacl.model.DBUniqueConstraint var71 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var57, "select nextval('')", false, var65);
    boolean var72 = var53.equals((java.lang.Object)false);
    org.databene.jdbacl.model.DBTable var73 = var53.getTable();
    boolean var74 = var1.equals((java.lang.Object)var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi! as 10 on . = 10."+ "'", var48.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "hi! as 10 on . = 10."+ "'", var70.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test35");


    org.databene.jdbacl.sql.parser.SQLParser.add_constraints_return var0 = new org.databene.jdbacl.sql.parser.SQLParser.add_constraints_return();
    java.lang.Object var1 = var0.getTree();
    java.lang.Object var2 = var0.getStart();
    java.lang.Object var3 = var0.getTree();
    java.lang.Object var4 = var0.getTree();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test36");


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
    var8.setImportingUKs(true);
    
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

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test37");


    org.databene.jdbacl.sql.parser.SQLParser.exclusive_or_expression_return var0 = new org.databene.jdbacl.sql.parser.SQLParser.exclusive_or_expression_return();
    java.lang.Object var1 = var0.getTree();
    java.lang.Object var2 = var0.getTree();
    java.lang.Object var3 = var0.getTree();
    java.lang.Object var4 = var0.getTree();
    java.lang.Object var5 = var0.getTree();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test38");


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
    var8.setExcludeTables("drop sequence 10");
    
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

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test39");


    java.io.File var1 = org.databene.jdbacl.model.cache.CachingDBImporter.getCacheFile("SET GENERATOR . TO -1");
    org.databene.jdbacl.model.xml.XMLModelImporter var2 = new org.databene.jdbacl.model.xml.XMLModelImporter(var1);
    var2.close();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.Database var4 = var2.importDatabase();
      fail("Expected exception of type org.databene.commons.ImportFailedException");
    } catch (org.databene.commons.ImportFailedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test40");


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
    java.lang.String var85 = var59.getTableOwner();
    var59.setTriggeringEvent("Identity definition by unique key: select next value for 10");
    org.databene.jdbacl.model.DBCatalog var89 = new org.databene.jdbacl.model.DBCatalog("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE ");
    boolean var90 = var59.isIdentical((org.databene.jdbacl.model.DBObject)var89);
    java.lang.String var91 = var59.getDescription();
    java.lang.String var92 = var59.getDescription();
    
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
    assertNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var92);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test41");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mT__91();
    var10.setText("'SET GENERATOR catalog TO -2 (DROP SEQUENCE NOT drop generator sequence ~ 'hi!' RESTRICT)'");
    var10.mT__62();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test42");


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
    java.util.List var18 = var15.getSequences(true);
    org.databene.jdbacl.dialect.DerbyDialect var22 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var24 = var22.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var25 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var26 = var25.getName();
    java.lang.String var27 = var22.formatValue((java.lang.Object)var25);
    var25.setName("'hi!'");
    java.util.List var30 = var25.getSchemas();
    org.databene.jdbacl.model.DBSchema var31 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var25);
    org.databene.jdbacl.model.DBTrigger var32 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var31);
    java.util.List var33 = var31.getPackages();
    org.databene.jdbacl.model.DBPackage var34 = new org.databene.jdbacl.model.DBPackage("CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).", var31);
    java.util.List var35 = var34.getComponents();
    var15.addPackage(var34);
    java.lang.String var37 = var34.getSubObjectName();
    var34.setDataObjectId("drop sequence 10");
    org.databene.jdbacl.model.DBProcedure var40 = new org.databene.jdbacl.model.DBProcedure("select next value for CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT MAXVALUE 0", var34);
    java.lang.String var41 = var34.getSubObjectName();
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test43");


    org.databene.jdbacl.model.DefaultDBTable var1 = new org.databene.jdbacl.model.DefaultDBTable("postgres");
    java.lang.String var2 = org.databene.jdbacl.SQLUtil.typeAndName((org.databene.jdbacl.model.DBObject)var1);
    java.util.List var3 = var1.getColumns();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "table postgres"+ "'", var2.equals("table postgres"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test44");


    org.databene.jdbacl.dialect.MySQLDialect var0 = new org.databene.jdbacl.dialect.MySQLDialect();
    boolean var2 = var0.isDeterministicFKName("NaturalPkIdentity(hi!)");
    boolean var3 = var0.supportsRegex();
    boolean var4 = var0.supportsRegex();
    boolean var6 = var0.isDeterministicPKName("DROP SEQUENCE  NOT REGEXP 'VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).)'");
    boolean var7 = var0.supportsRegex();
    java.lang.String var11 = var0.regexQuery("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT MAXVALUE 0", false, "sequence 10");
    boolean var13 = var0.isDeterministicPKName("CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )");
    boolean var16 = var0.isDefaultSchema("DROP SEQUENCE CREATE GENERATOR  RESTRICT.DROP SEQUENCE ", "call next value for null[]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT MAXVALUE 0 REGEXP 'sequence 10'"+ "'", var11.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT MAXVALUE 0 REGEXP 'sequence 10'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test45");


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
    org.databene.jdbacl.model.DBSchema var59 = var4.getSchema();
    org.databene.jdbacl.model.DBSequence var63 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var63.setName("10");
    java.math.BigInteger var66 = var63.getIncrement();
    org.databene.jdbacl.model.DBSequence var70 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var70.setName("10");
    java.math.BigInteger var73 = var70.getIncrement();
    java.math.BigInteger var74 = var70.getIncrement();
    var63.setStart(var74);
    boolean var76 = var4.isIdentical((org.databene.jdbacl.model.DBObject)var63);
    java.util.List var78 = var4.getTables(true);
    org.databene.jdbacl.model.DBCatalog var81 = new org.databene.jdbacl.model.DBCatalog("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE ");
    java.util.List var82 = var81.getTables();
    java.util.List var83 = var4.getTables(false, var82);
    
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
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test46");


    org.databene.jdbacl.model.DefaultDBTable var0 = new org.databene.jdbacl.model.DefaultDBTable();
    var0.setDoc(".");
    java.util.Set var4 = var0.getUniqueConstraints(false);
    java.lang.String var5 = var0.getDoc();
    var0.setDoc("VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).)");
    org.databene.jdbacl.JDBCConnectData var14 = new org.databene.jdbacl.JDBCConnectData("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)", "hi!", "hi!", "drop generator sequence", "'hi!'", "hi!");
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var15 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter(var14);
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var16 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter(var14);
    boolean var17 = var0.equals((java.lang.Object)var14);
    java.lang.String[] var18 = var0.getPKColumnNames();
    java.util.Set var20 = var0.getUniqueConstraints(true);
    org.databene.jdbacl.model.TableContainer var25 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var26 = var25.getTables();
    org.databene.jdbacl.model.TableContainer var27 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var25);
    org.databene.jdbacl.model.DefaultDBTable var28 = new org.databene.jdbacl.model.DefaultDBTable();
    var28.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var31 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var32 = var31.getForeignKeyConstraints();
    var28.addReferrer((org.databene.jdbacl.model.DBTable)var31);
    var25.addTable((org.databene.jdbacl.model.DBTable)var31);
    java.lang.String[] var39 = new java.lang.String[] { ""};
    java.lang.String[] var43 = new java.lang.String[] { ""};
    java.lang.String var44 = org.databene.jdbacl.SQLUtil.join("", "", var39, "hi!", "10", var43);
    java.lang.String var45 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var39);
    org.databene.jdbacl.model.TableContainer var48 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var49 = var48.getTables();
    org.databene.jdbacl.model.TableContainer var50 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var48);
    org.databene.jdbacl.model.DefaultDBTable var51 = new org.databene.jdbacl.model.DefaultDBTable();
    var51.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var54 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var55 = var54.getForeignKeyConstraints();
    var51.addReferrer((org.databene.jdbacl.model.DBTable)var54);
    var48.addTable((org.databene.jdbacl.model.DBTable)var54);
    java.lang.String[] var60 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var61 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var60);
    org.databene.jdbacl.model.DBForeignKeyConstraint var62 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var31, var39, (org.databene.jdbacl.model.DBTable)var54, var60);
    java.lang.String[] var63 = var62.getRefereeColumnNames();
    org.databene.jdbacl.model.DBTable var64 = var62.getTable();
    java.lang.String var65 = var62.toString();
    org.databene.jdbacl.model.CompositeDBObject var66 = var62.getOwner();
    org.databene.jdbacl.model.FKChangeRule var67 = var62.getDeleteRule();
    var0.addForeignKey(var62);
    java.lang.String[] var69 = var62.getRefereeColumnNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "."+ "'", var5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi! as 10 on . = 10."+ "'", var44.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "."+ "'", var45.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var61.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )"+ "'", var65.equals("CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test47");


    org.databene.jdbacl.dialect.H2Dialect var0 = new org.databene.jdbacl.dialect.H2Dialect();
    java.lang.String var2 = var0.renderFetchSequenceValue("10");
    boolean var4 = var0.isDeterministicUKName("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    java.lang.String var6 = var0.renderDropSequence("alter sequence hi! restart with 1");
    boolean var9 = var0.isDefaultCatalog("select next value for SET GENERATOR . TO -1", "select nextval('alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP 'alter sequence hi! restart with 1'')");
    boolean var11 = var0.isDeterministicIndexName("SET GENERATOR org.databene.jdbacl.SQLScriptException: Error in execution of script line 1:  TO 0");
    boolean var12 = var0.isSequenceBoundarySupported();
    boolean var15 = var0.isDefaultCatalog("left join DROP SEQUENCE CREATE GENERATOR  RESTRICT.DROP SEQUENCE  as select null.nextval from dual on ", "jdbc:hsqldb:mem:select next value for CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT MAXVALUE 0");
    java.lang.String var19 = var0.regexQuery("drop generator select next value for jdbc:h2:mem:select next value for 10", true, "REGEXP_LIKE(select alter sequence drop sequence 10 restart with 0.nextval from dual, 'CONSTRAINT \"hi! identity by primary key\" ')");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "select next value for 10"+ "'", var2.equals("select next value for 10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "drop sequence alter sequence hi! restart with 1"+ "'", var6.equals("drop sequence alter sequence hi! restart with 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "drop generator select next value for jdbc:h2:mem:select next value for 10 NOT REGEXP 'REGEXP_LIKE(select alter sequence drop sequence 10 restart with 0.nextval from dual, 'CONSTRAINT \"hi! identity by primary key\" ')'"+ "'", var19.equals("drop generator select next value for jdbc:h2:mem:select next value for 10 NOT REGEXP 'REGEXP_LIKE(select alter sequence drop sequence 10 restart with 0.nextval from dual, 'CONSTRAINT \"hi! identity by primary key\" ')'"));

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test48");


    org.databene.jdbacl.JDBCDriverInfo var0 = new org.databene.jdbacl.JDBCDriverInfo();
    java.lang.String var1 = var0.getUrlPattern();
    var0.setDefaultUser("-1");
    java.lang.String var4 = var0.getUrlPattern();
    var0.setDriverClass("Identity definition by unique key: select next value for 10");
    org.databene.jdbacl.JDBCDriverInfo var7 = new org.databene.jdbacl.JDBCDriverInfo();
    var7.setDriverClass("hi!");
    var7.setDefaultPort("CREATE SEQUENCE 10");
    var7.setDriverClass("drop sequence ");
    var7.setId("CONSTRAINT \"select nextval('')\" UNIQUE ()");
    var7.setName("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")");
    org.databene.jdbacl.model.DefaultDBTable var21 = new org.databene.jdbacl.model.DefaultDBTable();
    var21.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var24 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var25 = var24.getForeignKeyConstraints();
    var21.addReferrer((org.databene.jdbacl.model.DBTable)var24);
    java.lang.String[] var32 = new java.lang.String[] { ""};
    java.lang.String[] var36 = new java.lang.String[] { ""};
    java.lang.String var37 = org.databene.jdbacl.SQLUtil.join("", "", var32, "hi!", "10", var36);
    org.databene.jdbacl.model.DBUniqueConstraint var38 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var24, "select nextval('')", false, var32);
    var24.setDoc("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT");
    java.lang.String[] var43 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var44 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var43);
    org.databene.jdbacl.model.DBUniqueConstraint var45 = var24.getUniqueConstraint(var43);
    java.lang.String[] var52 = new java.lang.String[] { ""};
    java.lang.String[] var56 = new java.lang.String[] { ""};
    java.lang.String var57 = org.databene.jdbacl.SQLUtil.join("", "", var52, "hi!", "10", var56);
    java.lang.String var58 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var52);
    java.lang.String var59 = org.databene.jdbacl.SQLUtil.join("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT", "CREATE SEQUENCE 10", var43, "select next value for SET GENERATOR . TO -1", "select next value for SET GENERATOR . TO -1", var52);
    java.lang.String[] var63 = new java.lang.String[] { "NOT drop generator sequence ~ 'hi!'"};
    java.lang.String var64 = org.databene.jdbacl.SQLUtil.innerJoin("CREATE GENERATOR jdbc:h2:mem:hi! as 10 on . = 10.", var52, "drop generator sequence", "catalog", var63);
    var7.setJars(var63);
    var0.setJars(var63);
    java.lang.String[] var67 = var0.getJars();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi! as 10 on . = 10."+ "'", var37.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var44.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "hi! as 10 on . = 10."+ "'", var57.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "."+ "'", var58.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1."+ "'", var59.equals("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "drop generator sequence as catalog on CREATE GENERATOR jdbc:h2:mem:hi! as 10 on . = 10.. = catalog.NOT drop generator sequence ~ 'hi!'"+ "'", var64.equals("drop generator sequence as catalog on CREATE GENERATOR jdbc:h2:mem:hi! as 10 on . = 10.. = catalog.NOT drop generator sequence ~ 'hi!'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test49");


    org.databene.jdbacl.dialect.UnknownDialect var1 = new org.databene.jdbacl.dialect.UnknownDialect("alter sequence call next value for 'hi!' restart with 100");
    boolean var3 = var1.isDeterministicUKName("EQUEN");
    boolean var5 = var1.isDeterministicFKName("DROP SEQUENCE ");
    boolean var7 = var1.isDeterministicIndexName("left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as CREATE GENERATOR  on jdbc:h2:mem:hi! as 10 on . = 10.-identity-..DROP SEQUENCE  = CREATE GENERATOR . REGEXP 'drop sequence '");
    boolean var10 = var1.isDefaultCatalog("drop generator CREATE GENERATOR 10.NOT drop generator sequence ~ 'hi!'", "(NOT drop generator sequence ~ 'hi!', alter sequence CREATE GENERATOR drop sequence  restart with -1)");
    boolean var12 = var1.isDeterministicPKName("(\"sequence\" null \"'hi!'\" null \"sequence\")");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test50");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mLE();
    var10.mT__111();
    var10.mSIZE();
    var10.mT__108();
    var10.mDROP_SEQUENCE();
    var10.mTIMESTAMP();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test51");


    org.databene.jdbacl.dialect.DerbyDialect var2 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var4 = var2.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var5 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var6 = var5.getName();
    java.lang.String var7 = var2.formatValue((java.lang.Object)var5);
    var5.setName("'hi!'");
    java.util.List var10 = var5.getSchemas();
    org.databene.jdbacl.model.DBSchema var11 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var5);
    org.databene.jdbacl.model.DBTrigger var12 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var11);
    var12.setTableName("sequence");
    java.lang.String var15 = var12.getTriggerBody();
    var12.setBaseObjectType("select alter sequence drop sequence 10 restart with 0.nextval from dual");
    
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

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test52");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mLE();
    var10.mT__99();
    var10.mT__110();
    var10.mAND();
    var10.mT__76();
    var10.mT__66();
    var10.mBETWEEN();
    var10.mT__105();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test53");


    org.databene.jdbacl.JDBCDriverInfo var0 = new org.databene.jdbacl.JDBCDriverInfo();
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var7 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var7.setExcludeTables("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    boolean var10 = var0.equals((java.lang.Object)var7);
    var0.setDownloadUrl("jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1)");
    var0.setDefaultPort("')'");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test54");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mLE();
    var10.mT__111();
    var10.mSIZE();
    var10.mT__108();
    var10.mDROP_SEQUENCE();
    var10.mT__96();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test55");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mT__92();
    var10.mDROP_TABLE();
    java.lang.String var17 = var10.getText();
    var10.mT__95();
    var10.mIN();
    var10.mT__137();
    var10.mT__78();
    var10.mLTGT();
    var10.mINVOCATION();
    var10.mXOR();
    var10.endResync();
    int var26 = var10.getBacktrackingLevel();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "select next value for SET GENERATOR.TO - 1"+ "'", var17.equals("select next value for SET GENERATOR.TO - 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test56");


    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var1 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var1.reset();
    var1.consume();
    int var4 = var1.mark();
    var1.rewind();
    java.lang.String var6 = var1.getSourceName();
    var1.setLine(85);
    var1.setCharPositionInLine(4);
    int var12 = var1.LT(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 32);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test57");


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
    org.databene.jdbacl.model.DBPrimaryKeyConstraint var22 = var4.getPrimaryKeyConstraint();
    java.lang.String[] var23 = var4.getColumnNames();
    
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
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test58");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.skip();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var3 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var5 = var3.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var3);
    var0.mCREATE_INDEX();
    var0.mIDENTIFIER();
    var0.mCOMMENT_COLUMN();
    java.lang.String var11 = var0.getCharErrorDisplay(0);
    int var12 = var0.getBacktrackingLevel();
    org.antlr.runtime.Token var13 = var0.nextToken();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "'\u0000'"+ "'", var11.equals("'\u0000'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test59");


    org.databene.jdbacl.model.DBSequence var3 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var3.setName("10");
    java.lang.String var6 = var3.getObjectType();
    java.math.BigInteger var7 = var3.getIncrementIfNotDefault();
    java.math.BigInteger var8 = var3.getMinValue();
    org.databene.jdbacl.model.DBSequence var12 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    java.lang.String var13 = var12.dropDDL();
    java.math.BigInteger var14 = var12.getStart();
    var3.setMinValue(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "sequence"+ "'", var6.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "drop sequence "+ "'", var13.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test60");


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
    java.util.List var16 = var15.getComponents();
    var15.setObjectType("-1");
    java.lang.String var19 = var15.getSubObjectName();
    var15.setStatus("DROP SEQUENCE CREATE GENERATOR  RESTRICT.DROP SEQUENCE ");
    org.databene.jdbacl.model.DefaultDBTable var24 = new org.databene.jdbacl.model.DefaultDBTable();
    var24.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var27 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var28 = var27.getForeignKeyConstraints();
    var24.addReferrer((org.databene.jdbacl.model.DBTable)var27);
    java.lang.String[] var35 = new java.lang.String[] { ""};
    java.lang.String[] var39 = new java.lang.String[] { ""};
    java.lang.String var40 = org.databene.jdbacl.SQLUtil.join("", "", var35, "hi!", "10", var39);
    org.databene.jdbacl.model.DBUniqueConstraint var41 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var27, "select nextval('')", false, var35);
    java.lang.String var42 = var41.toString();
    boolean var43 = var41.isNameDeterministic();
    var41.setDoc("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT");
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var54 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.", "select next value for SET GENERATOR . TO -1", "DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.", "jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", "10", "hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", "select next value for SET GENERATOR . TO -1", false);
    var54.setSchemaName("alter sequence hi! restart with 1");
    boolean var57 = var41.equals((java.lang.Object)var54);
    org.databene.jdbacl.model.DBTable var58 = var41.getTable();
    var41.addColumnName("Sub identity of ():\nnull");
    org.databene.jdbacl.model.DBTable var61 = var41.getTable();
    org.databene.jdbacl.model.DBUniqueIndex var62 = new org.databene.jdbacl.model.DBUniqueIndex("SET GENERATOR alter sequence CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT restart with 1 TO -2", true, var41);
    boolean var63 = var15.isIdentical((org.databene.jdbacl.model.DBObject)var62);
    java.lang.String var64 = var15.getSubObjectName();
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi! as 10 on . = 10."+ "'", var40.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "CONSTRAINT \"select nextval('')\" UNIQUE ()"+ "'", var42.equals("CONSTRAINT \"select nextval('')\" UNIQUE ()"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test61");


    org.databene.jdbacl.dialect.HSQL2Dialect var0 = new org.databene.jdbacl.dialect.HSQL2Dialect();
    java.lang.String var3 = var0.renderSequenceValue("hi!", 1L);
    java.lang.String var7 = var0.regexQuery("sequence", true, "");
    java.lang.String var10 = var0.renderSequenceValue("drop sequence 10", 0L);
    boolean var12 = var0.isDeterministicIndexName("drop sequence 10");
    java.lang.String var16 = var0.regexQuery("No identity defined for table DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT", false, "alter sequence CREATE SEQUENCE 10 restart with 1");
    boolean var18 = var0.isDeterministicFKName("drop generator sequence");
    boolean var19 = var0.supportsRegex();
    boolean var22 = var0.isDefaultCatalog("jdbc:hsqldb:mem:CREATE SEQUENCE \"hi! as 10 on . = 10.\".\"\" CACHE 100", "VALUES (NEXT VALUE FOR REGEXP_MATCHES(No identity defined for table DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT, 'alter sequence CREATE SEQUENCE 10 restart with 1'))");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "alter sequence hi! restart with 1"+ "'", var3.equals("alter sequence hi! restart with 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "NOT REGEXP_MATCHES(sequence, '')"+ "'", var7.equals("NOT REGEXP_MATCHES(sequence, '')"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "alter sequence drop sequence 10 restart with 0"+ "'", var10.equals("alter sequence drop sequence 10 restart with 0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "REGEXP_MATCHES(No identity defined for table DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT, 'alter sequence CREATE SEQUENCE 10 restart with 1')"+ "'", var16.equals("REGEXP_MATCHES(No identity defined for table DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT, 'alter sequence CREATE SEQUENCE 10 restart with 1')"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test62");


    org.databene.jdbacl.model.DefaultDBTable var3 = new org.databene.jdbacl.model.DefaultDBTable();
    var3.setDoc(".");
    java.util.Set var7 = var3.getUniqueConstraints(false);
    org.databene.jdbacl.model.DBDataType var10 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var11 = var10.isAlpha();
    boolean var12 = var10.isLOB();
    org.databene.jdbacl.model.DefaultDBColumn var15 = new org.databene.jdbacl.model.DefaultDBColumn("NOT drop generator sequence ~ 'hi!'", (org.databene.jdbacl.model.DBTable)var3, var10, (java.lang.Integer)100, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.TableContainer var18 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var19 = var18.getTables();
    org.databene.jdbacl.model.TableContainer var20 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var18);
    org.databene.jdbacl.model.DefaultDBTable var21 = new org.databene.jdbacl.model.DefaultDBTable();
    var21.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var24 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var25 = var24.getForeignKeyConstraints();
    var21.addReferrer((org.databene.jdbacl.model.DBTable)var24);
    var18.addTable((org.databene.jdbacl.model.DBTable)var24);
    var15.setTable((org.databene.jdbacl.model.DBTable)var24);
    org.databene.jdbacl.dialect.DerbyDialect var32 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var34 = var32.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var35 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var36 = var35.getName();
    java.lang.String var37 = var32.formatValue((java.lang.Object)var35);
    var35.setName("'hi!'");
    java.util.List var40 = var35.getSchemas();
    org.databene.jdbacl.model.DBSchema var41 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var35);
    org.databene.jdbacl.model.DBTrigger var42 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var41);
    java.lang.String var43 = var41.getName();
    org.databene.jdbacl.model.DefaultDBTable var44 = new org.databene.jdbacl.model.DefaultDBTable("drop sequence 10", var41);
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
    java.lang.String[] var87 = var86.getForeignKeyColumnNames();
    var44.removeForeignKeyConstraint(var86);
    java.lang.String[] var89 = var44.getColumnNames();
    org.databene.jdbacl.model.DBNonUniqueIndex var90 = new org.databene.jdbacl.model.DBNonUniqueIndex("SET GENERATOR catalog TO -2", false, (org.databene.jdbacl.model.DBTable)var24, var89);
    boolean var91 = var90.isUnique();
    boolean var92 = var90.isUnique();
    var90.addColumnName("DROP SEQUENCE NOT drop generator sequence ~ 'hi!' RESTRICT");
    java.lang.String var95 = var90.toString();
    boolean var96 = var90.isUnique();
    var90.addColumnName("call next value for alter sequence -1 restart with 1");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")"+ "'", var43.equals("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")"));
    
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
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var95 + "' != '" + "SET GENERATOR catalog TO -2 (DROP SEQUENCE NOT drop generator sequence ~ 'hi!' RESTRICT)"+ "'", var95.equals("SET GENERATOR catalog TO -2 (DROP SEQUENCE NOT drop generator sequence ~ 'hi!' RESTRICT)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == false);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test63");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mLE();
    var10.mVARCHAR2();
    var10.mT__77();
    var10.mT__75();
    var10.skip();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test64");


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
    int var92 = var90.ordinal();
    java.lang.String var93 = var90.name();
    
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
    assertTrue(var92 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var93 + "' != '" + "NO_ACTION"+ "'", var93.equals("NO_ACTION"));

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test65");


    org.databene.jdbacl.dialect.OracleDialect var0 = new org.databene.jdbacl.dialect.OracleDialect();
    boolean var2 = var0.isDeterministicUKName("alter sequence CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT restart with 1");
    boolean var4 = var0.isDeterministicFKName("false");
    boolean var7 = var0.isDefaultCatalog("alter sequence hi! restart with 1", "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT (, sequence, SELECT NEXT VALUE FOR SET GENERATOR.TO - 1 NOT REGEXP 'HI!') unique");
    java.lang.String var9 = var0.renderFetchSequenceValue("SELECT NEXT VALUE FOR SET GENERATOR.TO - 1 NOT REGEXP 'HI!'");
    java.lang.String var11 = var0.renderFetchSequenceValue("jdbc:h2:mem:DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT");
    boolean var14 = var0.isDefaultSchema("call next value for CONSTRAINT \"hi! identity by primary key\" PRIMARY KEY () ~ 'jdbc:h2:mem:hi! as 10 on . = 10.-identity-.' NOT REGEXP 'SET GENERATOR select nextval for  DROP SEQUENCE (0,-1) NULL from jdbc:h2:mem:hi! as 10 on . = 10.-identity- TO 0'", "UniqueKeyIdentity(select next value for SET GENERATOR.TO - 1-identity-SubNkPkQueryIdentity(null) ~ 'VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) = \"sequence\" (select next value for 10, alter sequence CREATE SEQUENCE DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1. restart with 1) unique')");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "select SELECT NEXT VALUE FOR SET GENERATOR.TO - 1 NOT REGEXP 'HI!'.nextval from dual"+ "'", var9.equals("select SELECT NEXT VALUE FOR SET GENERATOR.TO - 1 NOT REGEXP 'HI!'.nextval from dual"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "select jdbc:h2:mem:DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT.nextval from dual"+ "'", var11.equals("select jdbc:h2:mem:DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT.nextval from dual"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test66");


    org.databene.jdbacl.dialect.FirebirdDialect var0 = new org.databene.jdbacl.dialect.FirebirdDialect();
    java.lang.String var3 = var0.renderSetSequenceValue(".", 0L);
    boolean var4 = var0.isSequenceBoundarySupported();
    boolean var6 = var0.isDeterministicPKName("call next value for null[]");
    java.lang.String var9 = var0.renderSetSequenceValue("org.databene.jdbacl.SQLScriptException: Error in execution of script line 1: ", 1L);
    java.lang.String var10 = var0.getJDBCDriverClass();
    java.lang.String var13 = var0.renderSetSequenceValue("NOT REGEXP_LIKE(CONSTRAINT \"hi! identity by primary key\"  NOT REGEXP 'select next value for SET GENERATOR.TO - 1 NOT REGEXP 'hi!'', 'CREATE GENERATOR ')", 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "SET GENERATOR . TO -1"+ "'", var3.equals("SET GENERATOR . TO -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "SET GENERATOR org.databene.jdbacl.SQLScriptException: Error in execution of script line 1:  TO 0"+ "'", var9.equals("SET GENERATOR org.databene.jdbacl.SQLScriptException: Error in execution of script line 1:  TO 0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "org.firebirdsql.jdbc.FBDriver"+ "'", var10.equals("org.firebirdsql.jdbc.FBDriver"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "SET GENERATOR NOT REGEXP_LIKE(CONSTRAINT \"hi! identity by primary key\"  NOT REGEXP 'select next value for SET GENERATOR.TO - 1 NOT REGEXP 'hi!'', 'CREATE GENERATOR ') TO 0"+ "'", var13.equals("SET GENERATOR NOT REGEXP_LIKE(CONSTRAINT \"hi! identity by primary key\"  NOT REGEXP 'select next value for SET GENERATOR.TO - 1 NOT REGEXP 'hi!'', 'CREATE GENERATOR ') TO 0"));

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test67");


    org.databene.jdbacl.model.DBSequence var3 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    java.math.BigInteger var4 = var3.getMaxValue();
    java.lang.String var5 = var3.toString();
    java.lang.String var6 = var3.dropDDL();
    java.lang.Boolean var7 = var3.isOrder();
    java.lang.Boolean var8 = var3.isCycle();
    java.lang.String var9 = var3.getDoc();
    java.math.BigInteger var10 = var3.getMinValueIfNotDefault();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "drop sequence "+ "'", var6.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test68");


    org.databene.jdbacl.sql.ColumnExpression var4 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var7 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var8 = var7.getValue();
    org.databene.jdbacl.sql.ColumnExpression var11 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var12 = var11.getValue();
    org.databene.jdbacl.sql.BetweenExpression var13 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var4, (org.databene.script.Expression)var7, (org.databene.script.Expression)var11);
    org.databene.jdbacl.sql.ColumnExpression var16 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var19 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var20 = var19.getValue();
    org.databene.jdbacl.sql.ColumnExpression var23 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var24 = var23.getValue();
    org.databene.jdbacl.sql.BetweenExpression var25 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var16, (org.databene.script.Expression)var19, (org.databene.script.Expression)var23);
    var13.addTerm((org.databene.script.Expression)var19);
    org.databene.script.Expression[] var27 = new org.databene.script.Expression[] { var13};
    org.databene.jdbacl.sql.FunctionInvocation var28 = new org.databene.jdbacl.sql.FunctionInvocation("alter sequence drop sequence 10 restart with 0", var27);
    org.databene.jdbacl.identity.xml.IdentityParseContext var29 = new org.databene.jdbacl.identity.xml.IdentityParseContext();
    java.lang.Object var30 = var28.evaluate((org.databene.commons.Context)var29);
    org.databene.script.Expression[] var31 = var28.getTerms();
    org.databene.jdbacl.sql.FunctionInvocation var32 = new org.databene.jdbacl.sql.FunctionInvocation("VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).)", var31);
    java.lang.String var33 = var32.toString();
    org.databene.script.Expression[] var34 = var32.getSourceExpressions();
    java.lang.String var35 = var32.getFunctionName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "sequence"+ "'", var8.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "sequence"+ "'", var12.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "sequence"+ "'", var20.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "sequence"+ "'", var24.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "((\"sequence\" BETWEEN \"sequence\" AND \"sequence\"))"+ "'", var33.equals("((\"sequence\" BETWEEN \"sequence\" AND \"sequence\"))"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).)"+ "'", var35.equals("VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).)"));

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test69");


    org.databene.jdbacl.dialect.FirebirdDialect var0 = new org.databene.jdbacl.dialect.FirebirdDialect();
    java.lang.String var3 = var0.renderSetSequenceValue(".", 0L);
    boolean var4 = var0.isSequenceBoundarySupported();
    boolean var6 = var0.isDeterministicPKName("call next value for null[]");
    java.lang.String var9 = var0.renderSetSequenceValue("org.databene.jdbacl.SQLScriptException: Error in execution of script line 1: ", 1L);
    java.lang.String var10 = var0.getJDBCDriverClass();
    boolean var12 = var0.isDeterministicFKName("alter sequence CREATE GENERATOR drop sequence  restart with 10");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "SET GENERATOR . TO -1"+ "'", var3.equals("SET GENERATOR . TO -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "SET GENERATOR org.databene.jdbacl.SQLScriptException: Error in execution of script line 1:  TO 0"+ "'", var9.equals("SET GENERATOR org.databene.jdbacl.SQLScriptException: Error in execution of script line 1:  TO 0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "org.firebirdsql.jdbc.FBDriver"+ "'", var10.equals("org.firebirdsql.jdbc.FBDriver"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test70");


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
    java.util.List var16 = var15.getComponents();
    var15.setObjectType("-1");
    java.util.List var19 = var15.getComponents();
    java.lang.String var20 = var15.getStatus();
    java.lang.String var21 = var15.getSubObjectName();
    java.lang.String var22 = var15.getDataObjectId();
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test71");


    org.databene.jdbacl.model.DBCheckConstraint var4 = new org.databene.jdbacl.model.DBCheckConstraint("column", true, "call next value for select nextval(''alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP ''alter sequence hi! restart with 1'''')", "\"'hi!'\"");
    java.lang.String var5 = var4.getTableName();
    org.databene.jdbacl.model.DBCheckConstraint var10 = new org.databene.jdbacl.model.DBCheckConstraint("column", true, "call next value for select nextval(''alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP ''alter sequence hi! restart with 1'''')", "\"'hi!'\"");
    org.databene.jdbacl.model.DBCheckConstraint var15 = new org.databene.jdbacl.model.DBCheckConstraint("column", true, "call next value for select nextval(''alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP ''alter sequence hi! restart with 1'''')", "\"'hi!'\"");
    java.lang.String var16 = var15.getConditionText();
    org.databene.jdbacl.model.DBCheckConstraint var21 = new org.databene.jdbacl.model.DBCheckConstraint("column", true, "call next value for select nextval(''alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP ''alter sequence hi! restart with 1'''')", "\"'hi!'\"");
    java.lang.String var22 = var21.getTableName();
    boolean var23 = var15.isEquivalent(var21);
    boolean var24 = var10.isEquivalent(var15);
    boolean var25 = var4.isEquivalent(var15);
    org.databene.jdbacl.model.DBCheckConstraint var30 = new org.databene.jdbacl.model.DBCheckConstraint("column", true, "call next value for select nextval(''alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP ''alter sequence hi! restart with 1'''')", "\"'hi!'\"");
    org.databene.jdbacl.model.DBCheckConstraint var35 = new org.databene.jdbacl.model.DBCheckConstraint("column", true, "call next value for select nextval(''alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP ''alter sequence hi! restart with 1'''')", "\"'hi!'\"");
    java.lang.String var36 = var35.getConditionText();
    org.databene.jdbacl.model.DBCheckConstraint var41 = new org.databene.jdbacl.model.DBCheckConstraint("column", true, "call next value for select nextval(''alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP ''alter sequence hi! restart with 1'''')", "\"'hi!'\"");
    java.lang.String var42 = var41.getTableName();
    boolean var43 = var35.isEquivalent(var41);
    boolean var44 = var30.isEquivalent(var35);
    java.lang.String[] var45 = var35.getColumnNames();
    boolean var46 = var4.isEquivalent(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "call next value for select nextval(''alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP ''alter sequence hi! restart with 1'''')"+ "'", var5.equals("call next value for select nextval(''alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP ''alter sequence hi! restart with 1'''')"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "\"'hi!'\""+ "'", var16.equals("\"'hi!'\""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "call next value for select nextval(''alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP ''alter sequence hi! restart with 1'''')"+ "'", var22.equals("call next value for select nextval(''alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP ''alter sequence hi! restart with 1'''')"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "\"'hi!'\""+ "'", var36.equals("\"'hi!'\""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "call next value for select nextval(''alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP ''alter sequence hi! restart with 1'''')"+ "'", var42.equals("call next value for select nextval(''alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP ''alter sequence hi! restart with 1'''')"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test72");


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
    java.lang.String var16 = var15.getDoc();
    java.lang.String[] var17 = var15.getPKColumnNames();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var19 = var15.requiresProvider(41);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test73");


    org.databene.jdbacl.dialect.H2Dialect var0 = new org.databene.jdbacl.dialect.H2Dialect();
    java.lang.String var2 = var0.renderFetchSequenceValue("SET GENERATOR . TO -1");
    boolean var3 = var0.isSequenceSupported();
    java.lang.String var7 = var0.regexQuery("CONSTRAINT hi! UNIQUE ()", false, "10");
    boolean var9 = var0.isDeterministicPKName("CONSTRAINT \"hi! identity by primary key\" PRIMARY KEY ().");
    java.lang.String var12 = var0.setSequenceValue("drop generator CREATE SEQUENCE \"hi! as 10 on . = 10.\".\"\" CACHE 100NOORDER", (-1L));
    boolean var15 = var0.isDefaultSchema("drop generator sequence", "drop generator sequence.NOT drop generator sequence ~ 'hi!'");
    org.databene.jdbacl.sql.parser.SQLLexer var16 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var16.mCREATE_TABLE();
    var16.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var20 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var22 = var20.LT(10);
    var16.setCharStream((org.antlr.runtime.CharStream)var20);
    int var25 = var20.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var26 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var20);
    var26.setText("select next value for SET GENERATOR.TO - 1");
    var26.setBacktrackingLevel(1);
    var26.mT__92();
    var26.mDROP_TABLE();
    var26.mT__124();
    var26.mDROP_TABLE();
    int var35 = var26.getBacktrackingLevel();
    var26.mCOMMENT_COLUMN();
    var26.mT__122();
    java.lang.String var38 = var0.formatValue((java.lang.Object)var26);
    var26.mT__116();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "select next value for SET GENERATOR . TO -1"+ "'", var2.equals("select next value for SET GENERATOR . TO -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "CONSTRAINT hi! UNIQUE () REGEXP '10'"+ "'", var7.equals("CONSTRAINT hi! UNIQUE () REGEXP '10'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "alter sequence drop generator CREATE SEQUENCE \"hi! as 10 on . = 10.\".\"\" CACHE 100NOORDER restart with -1"+ "'", var12.equals("alter sequence drop generator CREATE SEQUENCE \"hi! as 10 on . = 10.\".\"\" CACHE 100NOORDER restart with -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test74");


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
    org.databene.jdbacl.model.DBPrimaryKeyConstraint var26 = var8.getPrimaryKeyConstraint();
    org.databene.jdbacl.JDBCDriverInfo var29 = new org.databene.jdbacl.JDBCDriverInfo();
    var29.setDriverClass("hi!");
    var29.setDefaultPort("CREATE SEQUENCE 10");
    var29.setDbSystem("SET GENERATOR . TO -1");
    java.lang.String var36 = var29.toString();
    org.databene.jdbacl.model.DefaultDBTable var38 = new org.databene.jdbacl.model.DefaultDBTable();
    var38.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var41 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var42 = var41.getForeignKeyConstraints();
    var38.addReferrer((org.databene.jdbacl.model.DBTable)var41);
    java.lang.String[] var49 = new java.lang.String[] { ""};
    java.lang.String[] var53 = new java.lang.String[] { ""};
    java.lang.String var54 = org.databene.jdbacl.SQLUtil.join("", "", var49, "hi!", "10", var53);
    org.databene.jdbacl.model.DBUniqueConstraint var55 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var41, "select nextval('')", false, var49);
    var41.setDoc("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT");
    java.lang.String[] var60 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var61 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var60);
    org.databene.jdbacl.model.DBUniqueConstraint var62 = var41.getUniqueConstraint(var60);
    org.databene.jdbacl.identity.UniqueKeyIdentity var63 = new org.databene.jdbacl.identity.UniqueKeyIdentity("select next value for SET GENERATOR.TO - 1", var60);
    var29.setJars(var60);
    org.databene.jdbacl.identity.UniqueKeyIdentity var65 = new org.databene.jdbacl.identity.UniqueKeyIdentity("NOT REGEXP_MATCHES(sequence, '')", var60);
    org.databene.jdbacl.identity.NaturalPkIdentity var69 = new org.databene.jdbacl.identity.NaturalPkIdentity("call next value for 'hi!'");
    java.lang.String[] var75 = new java.lang.String[] { ""};
    java.lang.String[] var79 = new java.lang.String[] { ""};
    java.lang.String var80 = org.databene.jdbacl.SQLUtil.join("", "", var75, "hi!", "10", var79);
    java.lang.String var81 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var75);
    java.lang.String[] var88 = new java.lang.String[] { ""};
    java.lang.String[] var92 = new java.lang.String[] { ""};
    java.lang.String var93 = org.databene.jdbacl.SQLUtil.join("", "", var88, "hi!", "10", var92);
    java.lang.String var94 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var92);
    java.lang.String var95 = org.databene.jdbacl.SQLUtil.leftJoin("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE ", var75, "jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1)", "drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)", var92);
    java.lang.String var96 = var69.extractNK((java.lang.Object[])var75);
    java.lang.String var97 = org.databene.jdbacl.SQLUtil.leftJoin("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", var60, "jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1)", "CREATE GENERATOR ", var75);
    org.databene.jdbacl.model.DBUniqueConstraint var98 = var8.getUniqueConstraint(var75);
    
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
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "SET GENERATOR . TO -1"+ "'", var36.equals("SET GENERATOR . TO -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "hi! as 10 on . = 10."+ "'", var54.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var61.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "hi! as 10 on . = 10."+ "'", var80.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + "."+ "'", var81.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var93 + "' != '" + "hi! as 10 on . = 10."+ "'", var93.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var94 + "' != '" + "."+ "'", var94.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var95 + "' != '" + "left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)."+ "'", var95.equals("left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var96 + "' != '" + ""+ "'", var96.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var97 + "' != '" + "left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as CREATE GENERATOR  on jdbc:h2:mem:hi! as 10 on . = 10.-identity-..DROP SEQUENCE  = CREATE GENERATOR ."+ "'", var97.equals("left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as CREATE GENERATOR  on jdbc:h2:mem:hi! as 10 on . = 10.-identity-..DROP SEQUENCE  = CREATE GENERATOR ."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test75");


    org.databene.jdbacl.model.DefaultDBTable var0 = new org.databene.jdbacl.model.DefaultDBTable();
    var0.setDoc(".");
    java.util.Set var4 = var0.getUniqueConstraints(false);
    var0.setDoc("select next value for SET GENERATOR.TO - 1");
    java.util.Set var8 = var0.getUniqueConstraints(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test76");


    org.databene.jdbacl.identity.IdentityProvider var0 = new org.databene.jdbacl.identity.IdentityProvider();
    org.databene.jdbacl.identity.NaturalPkIdentity var2 = new org.databene.jdbacl.identity.NaturalPkIdentity("hi!");
    java.lang.String var3 = var2.getName();
    var0.registerIdentity((org.databene.jdbacl.identity.IdentityModel)var2, "SET GENERATOR . TO -1");
    java.lang.String[] var8 = new java.lang.String[] { "select next value for 10"};
    org.databene.jdbacl.identity.UniqueKeyIdentity var9 = new org.databene.jdbacl.identity.UniqueKeyIdentity("CREATE SEQUENCE 10", var8);
    boolean var11 = var9.equals((java.lang.Object)"alter sequence hi! restart with 1");
    var0.registerIdentity((org.databene.jdbacl.identity.IdentityModel)var9, "hi! as 10 on . = 10..NOT drop generator sequence ~ 'hi!', hi! as 10 on . = 10..alter sequence CREATE GENERATOR drop sequence  restart with -1");
    java.lang.String[] var18 = new java.lang.String[] { ""};
    java.lang.String[] var22 = new java.lang.String[] { ""};
    java.lang.String var23 = org.databene.jdbacl.SQLUtil.join("", "", var18, "hi!", "10", var22);
    org.databene.jdbacl.identity.IdentityProvider var24 = new org.databene.jdbacl.identity.IdentityProvider();
    org.databene.jdbacl.identity.SubNkPkQueryIdentity var25 = new org.databene.jdbacl.identity.SubNkPkQueryIdentity("null", var18, var24);
    var25.setSubNkPkQuery("null");
    var0.registerIdentity((org.databene.jdbacl.identity.IdentityModel)var25, "drop sequence 10");
    java.lang.String var30 = var25.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi! as 10 on . = 10."+ "'", var23.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "Sub identity of ():\nnull"+ "'", var30.equals("Sub identity of ():\nnull"));

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test77");


    org.databene.jdbacl.model.DBCatalog var0 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var1 = var0.getName();
    org.databene.jdbacl.model.Database var2 = var0.getDatabase();
    java.lang.String var3 = var0.getDoc();
    java.util.List var4 = var0.getSequences();
    org.databene.jdbacl.dialect.DerbyDialect var7 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var9 = var7.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var10 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var11 = var10.getName();
    java.lang.String var12 = var7.formatValue((java.lang.Object)var10);
    var10.setName("'hi!'");
    java.util.List var15 = var10.getSchemas();
    org.databene.jdbacl.model.DBSchema var16 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var10);
    org.databene.jdbacl.model.DBTrigger var17 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var16);
    org.databene.jdbacl.dialect.DerbyDialect var18 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var20 = var18.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var21 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var22 = var21.getName();
    java.lang.String var23 = var18.formatValue((java.lang.Object)var21);
    java.util.List var24 = var21.getComponents();
    var16.setCatalog(var21);
    var0.removeSchema(var16);
    org.databene.jdbacl.model.DefaultDBTable var28 = new org.databene.jdbacl.model.DefaultDBTable("select next value for SET GENERATOR . TO -1");
    var16.removeTable((org.databene.jdbacl.model.DBTable)var28);
    java.util.List var30 = var28.getIndexes();
    int var31 = var28.countProviders();
    org.databene.jdbacl.dialect.Firebird2_5Dialect var32 = new org.databene.jdbacl.dialect.Firebird2_5Dialect();
    java.lang.String var36 = var32.regexQuery("call next value for null[]", true, "drop generator CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE ");
    boolean var37 = var32.supportsRegex();
    boolean var38 = var32.isSequenceBoundarySupported();
    boolean var39 = var32.supportsRegex();
    boolean var40 = var32.supportsRegex();
    boolean var41 = var32.supportsRegex();
    java.lang.String var45 = var32.regexQuery("select next value for Identity definition by unique key: select next value for 10", false, "call next value for 'd'");
    boolean var46 = var28.equals((java.lang.Object)false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.DBTable var48 = var28.getProvider((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
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
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "call next value for null[] NOT SIMILAR TO 'drop generator CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE '"+ "'", var36.equals("call next value for null[] NOT SIMILAR TO 'drop generator CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE '"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "select next value for Identity definition by unique key: select next value for 10 SIMILAR TO 'call next value for 'd''"+ "'", var45.equals("select next value for Identity definition by unique key: select next value for 10 SIMILAR TO 'call next value for 'd''"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test78");


    org.databene.jdbacl.dialect.Derby10_6Dialect var0 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var3 = var0.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    boolean var5 = var0.isDeterministicIndexName("select nextval('')");
    org.databene.jdbacl.model.DBSequence var9 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var9.setCache((java.lang.Long)100L);
    java.lang.String var12 = var9.getObjectType();
    java.lang.String var13 = var0.renderCreateSequence(var9);
    java.math.BigInteger var14 = var9.getMaxValueIfNotDefault();
    org.databene.jdbacl.dialect.Derby10_6Dialect var15 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var18 = var15.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var20 = var15.renderFetchSequenceValue("hi! as 10 on . = 10.");
    org.databene.jdbacl.model.DBSequence var24 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var24.setName("10");
    java.math.BigInteger var27 = var24.getIncrement();
    java.math.BigInteger var28 = var24.getIncrement();
    java.lang.String var29 = var15.renderCreateSequence(var24);
    boolean var30 = var9.equals((java.lang.Object)var29);
    java.lang.Long var31 = var9.getCache();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "sequence"+ "'", var12.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT"+ "'", var13.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var20.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT"+ "'", var29.equals("CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + 100L+ "'", var31.equals(100L));

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test79");


    org.databene.jdbacl.SQLScriptException var1 = new org.databene.jdbacl.SQLScriptException(1);
    org.databene.jdbacl.SQLScriptException var3 = var1.withUri("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT");
    org.databene.jdbacl.SQLScriptException var5 = new org.databene.jdbacl.SQLScriptException((java.lang.Throwable)var1, 0);
    org.databene.jdbacl.SQLScriptException var7 = new org.databene.jdbacl.SQLScriptException((java.lang.Throwable)var5, 10);
    org.databene.jdbacl.SQLScriptException var10 = new org.databene.jdbacl.SQLScriptException((java.lang.Throwable)var5, "jdbc:hsqldb:mem:jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", 41);
    org.databene.jdbacl.SQLScriptException var13 = new org.databene.jdbacl.SQLScriptException((java.lang.Throwable)var10, "CONSTRAINT hi! UNIQUE () REGEXP '10'", 85);
    org.databene.jdbacl.SQLScriptException var15 = var10.withUri("Sub identity of ():\nnull-identity-VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).DROP SEQUENCE .VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).)");
    org.databene.jdbacl.SQLScriptException var17 = new org.databene.jdbacl.SQLScriptException((java.lang.Throwable)var10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test80");


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
    var21.setNullable(true);
    java.lang.String var46 = org.databene.jdbacl.SQLUtil.ownerDotComponent((org.databene.jdbacl.model.DBObject)var21);
    var21.setSize((java.lang.Integer)100);
    var21.setFractionDigits((java.lang.Integer)14);
    
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
    assertTrue("'" + var46 + "' != '" + "null.jdbc:h2:mem:hi! as 10 on . = 10.-identity-."+ "'", var46.equals("null.jdbc:h2:mem:hi! as 10 on . = 10.-identity-."));

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test81");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mT__92();
    var10.mDROP_TABLE();
    java.lang.String var17 = var10.getText();
    var10.mT__95();
    var10.mIN();
    var10.mT__137();
    var10.emitErrorMessage("NOT REGEXP_MATCHES (DROP SEQUENCE EQUEN RESTRICT, 'DROP SEQUENCE CREATE GENERATOR  RESTRICT')");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "select next value for SET GENERATOR.TO - 1"+ "'", var17.equals("select next value for SET GENERATOR.TO - 1"));

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test82");


    org.databene.jdbacl.dialect.OracleDialect var0 = new org.databene.jdbacl.dialect.OracleDialect();
    boolean var3 = var0.isDefaultSchema("select next value for 10", "NaturalPkIdentity(hi!)");
    org.databene.jdbacl.dialect.FirebirdDialect var4 = new org.databene.jdbacl.dialect.FirebirdDialect();
    java.lang.String var7 = var4.renderSetSequenceValue(".", 0L);
    boolean var9 = var4.isDeterministicUKName("hi! identity by primary key");
    boolean var10 = var4.isSequenceBoundarySupported();
    org.databene.jdbacl.model.DBSequence var14 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var14.setCache((java.lang.Long)100L);
    java.lang.String var17 = var14.getObjectType();
    java.math.BigInteger var18 = var14.getIncrementIfNotDefault();
    java.lang.String var19 = var4.renderCreateSequence(var14);
    java.math.BigInteger var20 = var14.getMinValueIfNotDefault();
    java.lang.String var21 = var0.renderCreateSequence(var14);
    boolean var22 = var0.isSequenceSupported();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "SET GENERATOR . TO -1"+ "'", var7.equals("SET GENERATOR . TO -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "sequence"+ "'", var17.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "CREATE GENERATOR "+ "'", var19.equals("CREATE GENERATOR "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "CREATE SEQUENCE \"hi! as 10 on . = 10.\".\"\" CACHE 100"+ "'", var21.equals("CREATE SEQUENCE \"hi! as 10 on . = 10.\".\"\" CACHE 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test83");


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
    var23.setStatus("alter sequence drop generator sequence restart with 100");
    java.lang.String var27 = var23.getColumnName();
    var23.setWhenClause("DROP SEQUENCE -1 RESTRICT");
    java.lang.String var30 = var23.getStatus();
    java.lang.String var31 = var23.getActionType();
    java.lang.String var32 = var23.getTableOwner();
    
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
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "alter sequence drop generator sequence restart with 100"+ "'", var30.equals("alter sequence drop generator sequence restart with 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test84");


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
    boolean var88 = var41.isIdentical((org.databene.jdbacl.model.DBObject)var86);
    java.lang.String var89 = var41.toString();
    java.lang.String[] var90 = var41.getColumnNames();
    org.databene.jdbacl.model.TableContainer var92 = new org.databene.jdbacl.model.TableContainer("");
    org.databene.jdbacl.model.DBTable var94 = var92.getTable("VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) = \"sequence\"");
    org.databene.jdbacl.model.DBTable var96 = var92.getTable("Identity definition by unique key: ");
    boolean var97 = var41.equals((java.lang.Object)"Identity definition by unique key: ");
    java.lang.String[] var98 = var41.getForeignKeyColumnNames();
    java.lang.String[] var99 = var41.getRefereeColumnNames();
    
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
    assertTrue(var88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var89 + "' != '" + "CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )"+ "'", var89.equals("CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var99);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test85");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.model.Database var8 = org.databene.jdbacl.DBUtil.getMetaData("select next value for Sub identity of ():\nalter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0", false, false, true, false, "select Identity definition by unique key: select next value for 10.nextval from dual", true, false);
      fail("Expected exception of type org.databene.commons.ConfigurationError");
    } catch (org.databene.commons.ConfigurationError e) {
      // Expected exception.
    }

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test86");


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
    var0.setBacktrackingLevel(1);
    var0.mT__75();
    org.databene.jdbacl.sql.parser.SQLLexer var18 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var18.mCREATE_TABLE();
    var18.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var22 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var24 = var22.LT(10);
    var18.setCharStream((org.antlr.runtime.CharStream)var22);
    int var27 = var22.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var28 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var22);
    var28.setText("select next value for SET GENERATOR.TO - 1");
    var28.setBacktrackingLevel(1);
    var28.mLE();
    var28.mT__99();
    var28.mT__110();
    org.antlr.runtime.Token var36 = var28.emit();
    var0.emit(var36);
    var0.match(309);
    var0.skip();
    var0.mSTAR();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test87");


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
    var23.setStatus("alter sequence drop generator sequence restart with 100");
    java.lang.String var27 = var23.getReferencingNames();
    var23.setActionType("select CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT (, sequence) unique.nextval from dual");
    
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
    assertNull(var27);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test88");


    org.databene.jdbacl.sql.ColumnExpression var3 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var6 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var7 = var6.getValue();
    org.databene.jdbacl.sql.ColumnExpression var10 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var11 = var10.getValue();
    org.databene.jdbacl.sql.BetweenExpression var12 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var3, (org.databene.script.Expression)var6, (org.databene.script.Expression)var10);
    org.databene.jdbacl.sql.ColumnExpression var15 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var18 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var19 = var18.getValue();
    org.databene.jdbacl.sql.ColumnExpression var22 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var23 = var22.getValue();
    org.databene.jdbacl.sql.BetweenExpression var24 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var15, (org.databene.script.Expression)var18, (org.databene.script.Expression)var22);
    var12.addTerm((org.databene.script.Expression)var18);
    org.databene.script.Expression[] var26 = new org.databene.script.Expression[] { var12};
    org.databene.jdbacl.sql.FunctionInvocation var27 = new org.databene.jdbacl.sql.FunctionInvocation("alter sequence drop sequence 10 restart with 0", var26);
    org.databene.jdbacl.identity.xml.IdentityParseContext var28 = new org.databene.jdbacl.identity.xml.IdentityParseContext();
    java.lang.Object var29 = var27.evaluate((org.databene.commons.Context)var28);
    java.lang.String var30 = var27.getFunctionName();
    org.databene.jdbacl.sql.ColumnExpression var33 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var36 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var37 = var36.getValue();
    org.databene.jdbacl.sql.ColumnExpression var40 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var41 = var40.getValue();
    org.databene.jdbacl.sql.BetweenExpression var42 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var33, (org.databene.script.Expression)var36, (org.databene.script.Expression)var40);
    java.lang.String var43 = var42.toString();
    boolean var44 = var42.isConstant();
    org.databene.jdbacl.sql.ColumnExpression var48 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var51 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var52 = var51.getValue();
    org.databene.jdbacl.sql.ColumnExpression var55 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var56 = var55.getValue();
    org.databene.jdbacl.sql.BetweenExpression var57 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var48, (org.databene.script.Expression)var51, (org.databene.script.Expression)var55);
    org.databene.jdbacl.sql.ColumnExpression var60 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var63 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var64 = var63.getValue();
    org.databene.jdbacl.sql.ColumnExpression var67 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var68 = var67.getValue();
    org.databene.jdbacl.sql.BetweenExpression var69 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var60, (org.databene.script.Expression)var63, (org.databene.script.Expression)var67);
    org.databene.jdbacl.sql.ColumnExpression var72 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var75 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var76 = var75.getValue();
    org.databene.jdbacl.sql.ColumnExpression var79 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var80 = var79.getValue();
    org.databene.jdbacl.sql.BetweenExpression var81 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var72, (org.databene.script.Expression)var75, (org.databene.script.Expression)var79);
    org.databene.jdbacl.sql.BetweenExpression var82 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var55, (org.databene.script.Expression)var63, (org.databene.script.Expression)var75);
    org.databene.script.Expression[] var83 = new org.databene.script.Expression[] { var55};
    org.databene.jdbacl.sql.FunctionInvocation var84 = new org.databene.jdbacl.sql.FunctionInvocation("CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var83);
    java.lang.String var85 = var84.getFunctionName();
    java.lang.String var86 = var84.toString();
    boolean var87 = var84.isConstant();
    org.databene.jdbacl.sql.BetweenExpression var88 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var27, (org.databene.script.Expression)var42, (org.databene.script.Expression)var84);
    java.lang.String var89 = var42.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "sequence"+ "'", var7.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "sequence"+ "'", var11.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "sequence"+ "'", var19.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "sequence"+ "'", var23.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "alter sequence drop sequence 10 restart with 0"+ "'", var30.equals("alter sequence drop sequence 10 restart with 0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "sequence"+ "'", var37.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "sequence"+ "'", var41.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")"+ "'", var43.equals("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "sequence"+ "'", var52.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "sequence"+ "'", var56.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "sequence"+ "'", var64.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "sequence"+ "'", var68.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "sequence"+ "'", var76.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "sequence"+ "'", var80.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT"+ "'", var85.equals("CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var86 + "' != '" + "(\"sequence\")"+ "'", var86.equals("(\"sequence\")"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var89 + "' != '" + "(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")"+ "'", var89.equals("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")"));

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test89");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var2 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var2.release((-1));
    boolean var6 = var0.mismatchIsUnwantedToken((org.antlr.runtime.IntStream)var2, 0);
    int var7 = var0.getRuleMemoizationCacheSize();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var9 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var0.consumeUntil((org.antlr.runtime.IntStream)var9, 100);
    org.databene.jdbacl.sql.parser.SQLLexer var12 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var9);
    java.lang.String var13 = var9.getText();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "DROP SEQUENCE "+ "'", var13.equals("DROP SEQUENCE "));

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test90");


    org.databene.jdbacl.model.DefaultDBTable var2 = new org.databene.jdbacl.model.DefaultDBTable("NOT REGEXP_MATCHES(sequence, '')");
    org.databene.jdbacl.model.DefaultDBTable var5 = new org.databene.jdbacl.model.DefaultDBTable();
    var5.setDoc(".");
    java.util.Set var9 = var5.getUniqueConstraints(false);
    org.databene.jdbacl.model.DBDataType var12 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var13 = var12.isAlpha();
    boolean var14 = var12.isLOB();
    org.databene.jdbacl.model.DefaultDBColumn var17 = new org.databene.jdbacl.model.DefaultDBColumn("NOT drop generator sequence ~ 'hi!'", (org.databene.jdbacl.model.DBTable)var5, var12, (java.lang.Integer)100, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DBDataType var20 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var21 = var20.isAlpha();
    java.lang.String var22 = var20.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var23 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var26 = var23.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var28 = var23.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var29 = var20.equals((java.lang.Object)var28);
    boolean var30 = var20.isLOB();
    org.databene.jdbacl.model.DefaultDBColumn var31 = new org.databene.jdbacl.model.DefaultDBColumn("alter sequence CREATE GENERATOR drop sequence  restart with -1", (org.databene.jdbacl.model.DBTable)var5, var20);
    org.databene.jdbacl.model.DefaultDBColumn var33 = new org.databene.jdbacl.model.DefaultDBColumn("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", (org.databene.jdbacl.model.DBTable)var2, var20, (java.lang.Integer)6);
    org.databene.jdbacl.model.DefaultDBTable var37 = new org.databene.jdbacl.model.DefaultDBTable();
    var37.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var40 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var41 = var40.getForeignKeyConstraints();
    var37.addReferrer((org.databene.jdbacl.model.DBTable)var40);
    org.databene.jdbacl.model.DBDataType var45 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var46 = var45.isAlpha();
    java.lang.String var47 = var45.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var48 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var51 = var48.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var53 = var48.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var54 = var45.equals((java.lang.Object)var53);
    org.databene.jdbacl.model.DefaultDBColumn var57 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var40, var45, (java.lang.Integer)0, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DBDataType var58 = var57.getType();
    org.databene.jdbacl.model.DefaultDBTable var59 = new org.databene.jdbacl.model.DefaultDBTable();
    var59.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var62 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var63 = var62.getForeignKeyConstraints();
    var59.addReferrer((org.databene.jdbacl.model.DBTable)var62);
    java.lang.String[] var70 = new java.lang.String[] { ""};
    java.lang.String[] var74 = new java.lang.String[] { ""};
    java.lang.String var75 = org.databene.jdbacl.SQLUtil.join("", "", var70, "hi!", "10", var74);
    org.databene.jdbacl.model.DBUniqueConstraint var76 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var62, "select nextval('')", false, var70);
    var76.addColumnName("sequence");
    var57.addUkConstraint(var76);
    java.lang.String[] var80 = var76.getColumnNames();
    org.databene.jdbacl.model.DBPrimaryKeyConstraint var81 = new org.databene.jdbacl.model.DBPrimaryKeyConstraint((org.databene.jdbacl.model.DBTable)var2, "alter sequence drop sequence 10 restart with 0", true, var80);
    java.util.List var82 = var2.getComponents();
    java.util.List var83 = var2.getColumns();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "DROP SEQUENCE "+ "'", var22.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var28.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "DROP SEQUENCE "+ "'", var47.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var53.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "hi! as 10 on . = 10."+ "'", var75.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test91");


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
    java.lang.String var83 = var36.toString();
    org.databene.jdbacl.identity.xml.IdentityParseContext var84 = new org.databene.jdbacl.identity.xml.IdentityParseContext();
    org.databene.jdbacl.identity.xml.IdentityParser var85 = new org.databene.jdbacl.identity.xml.IdentityParser();
    var84.addParser((org.databene.webdecs.xml.XMLElementParser)var85);
    java.lang.Boolean var87 = var36.evaluate((org.databene.commons.Context)var84);
    java.lang.String var88 = var36.toString();
    
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
    assertTrue("'" + var83 + "' != '" + "(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")"+ "'", var83.equals("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var87 + "' != '" + true+ "'", var87.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var88 + "' != '" + "(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")"+ "'", var88.equals("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")"));

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test92");


    org.databene.jdbacl.JDBCDriverInfo var0 = new org.databene.jdbacl.JDBCDriverInfo();
    java.lang.String var1 = var0.getUrlPattern();
    var0.setDefaultUser("-1");
    java.lang.String var4 = var0.getUrlPattern();
    var0.setDriverClass("Identity definition by unique key: select next value for 10");
    java.lang.String var7 = var0.getUrlPattern();
    java.lang.String var8 = var0.getDefaultDatabase();
    java.lang.String var9 = var0.getDefaultSchema();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test93");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mLE();
    var10.mCOMMENT_TABLE();
    var10.mT__107();
    var10.mT__69();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test94");


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
    org.databene.jdbacl.model.DBTable var37 = var2.getTable("drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)");
    java.util.List var39 = var2.getTables(false);
    
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
    assertNotNull(var39);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test95");


    org.databene.jdbacl.sql.parser.SQLParser.value_return var0 = new org.databene.jdbacl.sql.parser.SQLParser.value_return();
    java.lang.Object var1 = var0.getTemplate();
    java.lang.Object var2 = var0.getTree();
    java.lang.Object var3 = var0.getTree();
    java.lang.Object var4 = var0.getTree();
    java.lang.Object var5 = var0.getStop();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test96");


    org.databene.jdbacl.dialect.PostgreSQLDialect var0 = new org.databene.jdbacl.dialect.PostgreSQLDialect();
    boolean var3 = var0.isDefaultCatalog("", "");
    java.lang.String var5 = var0.renderDropSequence("");
    boolean var7 = var0.isDeterministicFKName("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    java.lang.String var9 = var0.renderFetchSequenceValue("");
    org.databene.jdbacl.model.DBSequence var13 = new org.databene.jdbacl.model.DBSequence("left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).", "hi! identity by primary key", "jdbc:h2:mem:select next value for 10");
    java.lang.String var14 = var0.renderCreateSequence(var13);
    boolean var17 = var0.isDefaultSchema("CONSTRAINT \"select nextval('')\" ", "jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1)");
    boolean var19 = var0.isDeterministicIndexName("Sub identity of ():\nnull");
    org.databene.jdbacl.dialect.OracleDialect var20 = new org.databene.jdbacl.dialect.OracleDialect();
    boolean var22 = var20.isDeterministicUKName("alter sequence CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT restart with 1");
    boolean var24 = var20.isDeterministicIndexName("DROP SEQUENCE (100)");
    org.databene.jdbacl.model.DBSequence var28 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    java.math.BigInteger var29 = var28.getMaxValue();
    java.lang.String var30 = var28.toString();
    org.databene.jdbacl.model.DBSequence var34 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    java.lang.String var35 = var34.dropDDL();
    java.math.BigInteger var36 = var34.getMinValueIfNotDefault();
    java.math.BigInteger var37 = var34.getLastNumber();
    org.databene.jdbacl.model.DBSequence var41 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var41.setName("10");
    java.math.BigInteger var44 = var41.getIncrement();
    java.math.BigInteger var45 = var41.getIncrement();
    var34.setStart(var45);
    var28.setIncrement(var45);
    java.lang.String var48 = var20.renderCreateSequence(var28);
    var28.setCycle((java.lang.Boolean)true);
    java.lang.String var51 = var0.renderCreateSequence(var28);
    boolean var53 = var0.isDeterministicIndexName("/Users/volker/Documents/databene/jdbacl/src/main/g/SQL.g");
    
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
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "drop sequence "+ "'", var35.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "CREATE SEQUENCE \"hi! as 10 on . = 10.\".\"\""+ "'", var48.equals("CREATE SEQUENCE \"hi! as 10 on . = 10.\".\"\""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "CREATE SEQUENCE  CYCLE"+ "'", var51.equals("CREATE SEQUENCE  CYCLE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test97");


    org.databene.jdbacl.JDBCConnectData var7 = new org.databene.jdbacl.JDBCConnectData("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)", "hi!", "hi!", "drop generator sequence", "'hi!'", "hi!");
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var8 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter(var7);
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var9 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter(var7);
    org.databene.jdbacl.model.DBCatalog var11 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var12 = var11.getName();
    org.databene.jdbacl.model.Database var13 = var11.getDatabase();
    java.lang.String var14 = var11.getDoc();
    org.databene.jdbacl.dialect.DerbyDialect var16 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var18 = var16.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var19 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var20 = var19.getName();
    java.lang.String var21 = var16.formatValue((java.lang.Object)var19);
    var19.setName("'hi!'");
    java.util.List var24 = var19.getSchemas();
    org.databene.jdbacl.model.DBSchema var25 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var19);
    var11.removeSchema(var25);
    java.util.List var28 = var25.getTables(false);
    org.databene.jdbacl.model.DefaultDBTable var29 = new org.databene.jdbacl.model.DefaultDBTable("drop generator .", var25);
    org.databene.jdbacl.model.jdbc.LazyTable var32 = new org.databene.jdbacl.model.jdbc.LazyTable(var9, var25, "drop generator CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE ", "select nextval('CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT')");
    java.lang.String var33 = var32.getDoc();
    java.lang.String var34 = var32.getName();
    org.databene.jdbacl.model.TableContainer var35 = new org.databene.jdbacl.model.TableContainer("select nextval('')", (org.databene.jdbacl.model.CompositeDBObject)var32);
    org.databene.jdbacl.model.DBSchema var36 = var32.getSchema();
    java.lang.String var37 = var32.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "select nextval('CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT')"+ "'", var33.equals("select nextval('CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT')"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "drop generator CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var34.equals("drop generator CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "drop generator CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var37.equals("drop generator CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test98");


    java.lang.String var1 = org.databene.jdbacl.dialect.H2Util.getInMemoryURL("left join DROP SEQUENCE CREATE GENERATOR  RESTRICT.DROP SEQUENCE  as select null.nextval from dual on ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "jdbc:h2:mem:left join DROP SEQUENCE CREATE GENERATOR  RESTRICT.DROP SEQUENCE  as select null.nextval from dual on "+ "'", var1.equals("jdbc:h2:mem:left join DROP SEQUENCE CREATE GENERATOR  RESTRICT.DROP SEQUENCE  as select null.nextval from dual on "));

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test99");


    org.databene.jdbacl.dialect.H2Dialect var0 = new org.databene.jdbacl.dialect.H2Dialect();
    java.lang.String var2 = var0.renderFetchSequenceValue("SET GENERATOR . TO -1");
    boolean var3 = var0.isSequenceSupported();
    java.lang.String var7 = var0.regexQuery("CONSTRAINT hi! UNIQUE ()", false, "10");
    boolean var9 = var0.isDeterministicPKName("CONSTRAINT \"hi! identity by primary key\" PRIMARY KEY ().");
    java.lang.String var12 = var0.setSequenceValue("drop generator CREATE SEQUENCE \"hi! as 10 on . = 10.\".\"\" CACHE 100NOORDER", (-1L));
    boolean var15 = var0.isDefaultSchema("drop generator sequence", "drop generator sequence.NOT drop generator sequence ~ 'hi!'");
    org.databene.jdbacl.sql.parser.SQLLexer var16 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var16.mCREATE_TABLE();
    var16.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var20 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var22 = var20.LT(10);
    var16.setCharStream((org.antlr.runtime.CharStream)var20);
    int var25 = var20.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var26 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var20);
    var26.setText("select next value for SET GENERATOR.TO - 1");
    var26.setBacktrackingLevel(1);
    var26.mT__92();
    var26.mDROP_TABLE();
    var26.mT__124();
    var26.mDROP_TABLE();
    int var35 = var26.getBacktrackingLevel();
    var26.mCOMMENT_COLUMN();
    var26.mT__122();
    java.lang.String var38 = var0.formatValue((java.lang.Object)var26);
    var26.mT__114();
    var26.mT__64();
    var26.traceIn("jdbc:h2:mem:select next value for 10.", 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "select next value for SET GENERATOR . TO -1"+ "'", var2.equals("select next value for SET GENERATOR . TO -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "CONSTRAINT hi! UNIQUE () REGEXP '10'"+ "'", var7.equals("CONSTRAINT hi! UNIQUE () REGEXP '10'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "alter sequence drop generator CREATE SEQUENCE \"hi! as 10 on . = 10.\".\"\" CACHE 100NOORDER restart with -1"+ "'", var12.equals("alter sequence drop generator CREATE SEQUENCE \"hi! as 10 on . = 10.\".\"\" CACHE 100NOORDER restart with -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test100");


    org.databene.jdbacl.model.DBCatalog var2 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var3 = var2.getName();
    org.databene.jdbacl.model.Database var4 = var2.getDatabase();
    java.lang.String var5 = var2.getDoc();
    org.databene.jdbacl.dialect.DerbyDialect var7 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var9 = var7.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var10 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var11 = var10.getName();
    java.lang.String var12 = var7.formatValue((java.lang.Object)var10);
    var10.setName("'hi!'");
    java.util.List var15 = var10.getSchemas();
    org.databene.jdbacl.model.DBSchema var16 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var10);
    var2.removeSchema(var16);
    var2.setName("select nextval('CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT')");
    org.databene.jdbacl.model.DBSchema var20 = new org.databene.jdbacl.model.DBSchema("CREATE SEQUENCE call next value for 'hi!' MAXVALUE 1", var2);
    org.databene.jdbacl.model.DBSequence var21 = new org.databene.jdbacl.model.DBSequence("CONSTRAINT \"drop sequence jdbc:h2:mem:hi! as 10 on . = 10.-identity-.\" UNIQUE (select next value for 10)", var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test101");


    org.databene.jdbacl.model.DBSchema var2 = new org.databene.jdbacl.model.DBSchema("null[DROP SEQUENCE ]");
    org.databene.jdbacl.model.DBPackage var3 = new org.databene.jdbacl.model.DBPackage("alter sequence CREATE GENERATOR drop sequence  restart with -1 DROP SEQUENCE  NULL", var2);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test102");


    org.databene.jdbacl.model.DBCatalog var4 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var5 = var4.getName();
    org.databene.jdbacl.model.Database var6 = var4.getDatabase();
    java.lang.String var7 = var4.getDoc();
    org.databene.jdbacl.dialect.DerbyDialect var9 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var11 = var9.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var12 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var13 = var12.getName();
    java.lang.String var14 = var9.formatValue((java.lang.Object)var12);
    var12.setName("'hi!'");
    java.util.List var17 = var12.getSchemas();
    org.databene.jdbacl.model.DBSchema var18 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var12);
    var4.removeSchema(var18);
    org.databene.jdbacl.dialect.DerbyDialect var22 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var24 = var22.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var25 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var26 = var25.getName();
    java.lang.String var27 = var22.formatValue((java.lang.Object)var25);
    var25.setName("'hi!'");
    java.util.List var30 = var25.getSchemas();
    org.databene.jdbacl.model.DBSchema var31 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var25);
    org.databene.jdbacl.model.DBTrigger var32 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var31);
    var32.setDescription("CREATE GENERATOR drop sequence ");
    java.lang.String var35 = var32.getTriggerBody();
    java.lang.String var36 = var32.getColumnName();
    java.lang.String var37 = var32.getWhenClause();
    var18.addTrigger(var32);
    org.databene.jdbacl.model.DBTrigger var39 = new org.databene.jdbacl.model.DBTrigger("-1", var18);
    org.databene.jdbacl.model.DBSequence var40 = new org.databene.jdbacl.model.DBSequence("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.", var18);
    org.databene.jdbacl.model.DBTreeModel var41 = new org.databene.jdbacl.model.DBTreeModel((org.databene.jdbacl.model.CompositeDBObject)var18);
    org.databene.jdbacl.model.DBSequence var45 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    java.math.BigInteger var46 = var45.getMaxValue();
    org.databene.jdbacl.model.DBCatalog var47 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var48 = var47.getName();
    org.databene.jdbacl.model.Database var49 = var47.getDatabase();
    java.lang.String var50 = var47.getDoc();
    org.databene.jdbacl.dialect.DerbyDialect var52 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var54 = var52.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var55 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var56 = var55.getName();
    java.lang.String var57 = var52.formatValue((java.lang.Object)var55);
    var55.setName("'hi!'");
    java.util.List var60 = var55.getSchemas();
    org.databene.jdbacl.model.DBSchema var61 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var55);
    var47.removeSchema(var61);
    org.databene.jdbacl.dialect.DerbyDialect var65 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var67 = var65.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var68 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var69 = var68.getName();
    java.lang.String var70 = var65.formatValue((java.lang.Object)var68);
    var68.setName("'hi!'");
    java.util.List var73 = var68.getSchemas();
    org.databene.jdbacl.model.DBSchema var74 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var68);
    org.databene.jdbacl.model.DBTrigger var75 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var74);
    var75.setDescription("CREATE GENERATOR drop sequence ");
    java.lang.String var78 = var75.getTriggerBody();
    java.lang.String var79 = var75.getColumnName();
    java.lang.String var80 = var75.getWhenClause();
    var61.addTrigger(var75);
    boolean var82 = var45.isIdentical((org.databene.jdbacl.model.DBObject)var61);
    java.util.List var83 = var61.getPackages();
    org.databene.jdbacl.model.DBCatalog var84 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var85 = var84.getName();
    var61.setCatalog(var84);
    int var87 = var41.getChildCount((org.databene.jdbacl.model.DBObject)var61);
    org.databene.jdbacl.model.DBPackage var88 = new org.databene.jdbacl.model.DBPackage("VALUES (NEXT VALUE FOR SET GENERATOR Sub identity of ():\nnull TO -1)", var61);
    org.databene.jdbacl.model.DBTrigger var89 = new org.databene.jdbacl.model.DBTrigger("alter sequence CREATE GENERATOR drop sequence  restart with -1", var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == 1);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test103");


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
    org.databene.jdbacl.model.TableContainer var28 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var29 = var28.getTables();
    org.databene.jdbacl.model.TableContainer var30 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var28);
    org.databene.jdbacl.model.DefaultDBTable var31 = new org.databene.jdbacl.model.DefaultDBTable();
    var31.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var34 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var35 = var34.getForeignKeyConstraints();
    var31.addReferrer((org.databene.jdbacl.model.DBTable)var34);
    var28.addTable((org.databene.jdbacl.model.DBTable)var34);
    java.lang.String[] var42 = new java.lang.String[] { ""};
    java.lang.String[] var46 = new java.lang.String[] { ""};
    java.lang.String var47 = org.databene.jdbacl.SQLUtil.join("", "", var42, "hi!", "10", var46);
    java.lang.String var48 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var42);
    org.databene.jdbacl.model.TableContainer var51 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var52 = var51.getTables();
    org.databene.jdbacl.model.TableContainer var53 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var51);
    org.databene.jdbacl.model.DefaultDBTable var54 = new org.databene.jdbacl.model.DefaultDBTable();
    var54.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var57 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var58 = var57.getForeignKeyConstraints();
    var54.addReferrer((org.databene.jdbacl.model.DBTable)var57);
    var51.addTable((org.databene.jdbacl.model.DBTable)var57);
    java.lang.String[] var63 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var64 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var63);
    org.databene.jdbacl.model.DBForeignKeyConstraint var65 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var34, var42, (org.databene.jdbacl.model.DBTable)var57, var63);
    org.databene.jdbacl.model.DefaultDBTable var67 = new org.databene.jdbacl.model.DefaultDBTable();
    var67.setDoc(".");
    java.util.Set var71 = var67.getUniqueConstraints(false);
    org.databene.jdbacl.model.DBDataType var74 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var75 = var74.isAlpha();
    boolean var76 = var74.isLOB();
    org.databene.jdbacl.model.DefaultDBColumn var79 = new org.databene.jdbacl.model.DefaultDBColumn("NOT drop generator sequence ~ 'hi!'", (org.databene.jdbacl.model.DBTable)var67, var74, (java.lang.Integer)100, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DefaultDBColumn var81 = new org.databene.jdbacl.model.DefaultDBColumn("CONSTRAINT \"select nextval('')\" ", (org.databene.jdbacl.model.DBTable)var34, var74, (java.lang.Integer)10);
    java.util.List var82 = var34.getComponents();
    boolean var83 = var12.isIdentical((org.databene.jdbacl.model.DBObject)var34);
    java.lang.String var84 = var12.getTriggerType();
    var12.setBaseObjectType("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT (, sequence, null[DROP SEQUENCE ]) unique");
    
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
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi! as 10 on . = 10."+ "'", var47.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "."+ "'", var48.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var64.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + "CONSTRAINT \"select nextval('')\" UNIQUE ()"+ "'", var84.equals("CONSTRAINT \"select nextval('')\" UNIQUE ()"));

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test104");


    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var1 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,69)");
    var1.reset();

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test105");


    org.databene.jdbacl.model.DBSequence var3 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    java.lang.String var4 = var3.dropDDL();
    java.math.BigInteger var5 = var3.getMinValueIfNotDefault();
    java.lang.String var6 = var3.getSchemaName();
    java.lang.Long var7 = var3.getCache();
    java.lang.Long var8 = var3.getCache();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "drop sequence "+ "'", var4.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi! as 10 on . = 10."+ "'", var6.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test106");


    org.databene.jdbacl.model.DefaultDBTable var0 = new org.databene.jdbacl.model.DefaultDBTable();
    var0.setDoc(".");
    java.util.Set var4 = var0.getUniqueConstraints(false);
    java.lang.String var5 = var0.getDoc();
    var0.setDoc("VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).)");
    java.util.Collection var8 = var0.getReferrers();
    java.util.Collection var9 = org.databene.jdbacl.JDBCDriverInfo.getInstances();
    boolean var10 = var0.equals((java.lang.Object)var9);
    org.databene.jdbacl.dialect.DerbyDialect var13 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var15 = var13.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var16 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var17 = var16.getName();
    java.lang.String var18 = var13.formatValue((java.lang.Object)var16);
    var16.setName("'hi!'");
    java.util.List var21 = var16.getSchemas();
    org.databene.jdbacl.model.DBSchema var22 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var16);
    org.databene.jdbacl.model.DBTrigger var23 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var22);
    java.lang.String var24 = var22.getName();
    org.databene.jdbacl.dialect.DerbyDialect var26 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var28 = var26.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var29 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var30 = var29.getName();
    java.lang.String var31 = var26.formatValue((java.lang.Object)var29);
    var29.setName("'hi!'");
    java.util.List var34 = var29.getSchemas();
    org.databene.jdbacl.model.DBSchema var35 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var29);
    org.databene.jdbacl.dialect.DerbyDialect var38 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var40 = var38.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var41 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var42 = var41.getName();
    java.lang.String var43 = var38.formatValue((java.lang.Object)var41);
    var41.setName("'hi!'");
    java.util.List var46 = var41.getSchemas();
    org.databene.jdbacl.model.DBSchema var47 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var41);
    org.databene.jdbacl.model.DBTrigger var48 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var47);
    var35.addTrigger(var48);
    var22.addTrigger(var48);
    var0.setSchema(var22);
    org.databene.jdbacl.dialect.DerbyDialect var53 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var55 = var53.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var56 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var57 = var56.getName();
    java.lang.String var58 = var53.formatValue((java.lang.Object)var56);
    var56.setName("'hi!'");
    java.util.List var61 = var56.getSchemas();
    org.databene.jdbacl.model.DBSchema var62 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var56);
    org.databene.jdbacl.dialect.DerbyDialect var65 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var67 = var65.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var68 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var69 = var68.getName();
    java.lang.String var70 = var65.formatValue((java.lang.Object)var68);
    var68.setName("'hi!'");
    java.util.List var73 = var68.getSchemas();
    org.databene.jdbacl.model.DBSchema var74 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var68);
    org.databene.jdbacl.model.DBTrigger var75 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var74);
    var62.addTrigger(var75);
    java.lang.String var77 = var75.getTableOwner();
    var75.setReferencingNames("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT");
    java.lang.String var80 = var75.toString();
    var22.addTrigger(var75);
    java.util.List var82 = org.databene.jdbacl.DBUtil.dependencyOrderedTables((org.databene.jdbacl.model.TableHolder)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "."+ "'", var5.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")"+ "'", var24.equals("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT"+ "'", var80.equals("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test107");


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
    java.util.List var16 = var12.getTables(true);
    org.databene.jdbacl.model.DBPackage var17 = new org.databene.jdbacl.model.DBPackage("SELECT * FROM null WHERE  = ''", var12);
    org.databene.jdbacl.model.DBCatalog var18 = var12.getCatalog();
    org.databene.jdbacl.model.DBCatalog var20 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var21 = var20.getName();
    org.databene.jdbacl.model.Database var22 = var20.getDatabase();
    java.lang.String var23 = var20.getDoc();
    org.databene.jdbacl.dialect.DerbyDialect var25 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var27 = var25.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var28 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var29 = var28.getName();
    java.lang.String var30 = var25.formatValue((java.lang.Object)var28);
    var28.setName("'hi!'");
    java.util.List var33 = var28.getSchemas();
    org.databene.jdbacl.model.DBSchema var34 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var28);
    var20.removeSchema(var34);
    org.databene.jdbacl.dialect.DerbyDialect var38 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var40 = var38.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var41 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var42 = var41.getName();
    java.lang.String var43 = var38.formatValue((java.lang.Object)var41);
    var41.setName("'hi!'");
    java.util.List var46 = var41.getSchemas();
    org.databene.jdbacl.model.DBSchema var47 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var41);
    org.databene.jdbacl.model.DBTrigger var48 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var47);
    var48.setDescription("CREATE GENERATOR drop sequence ");
    java.lang.String var51 = var48.getTriggerBody();
    java.lang.String var52 = var48.getColumnName();
    java.lang.String var53 = var48.getWhenClause();
    var34.addTrigger(var48);
    org.databene.jdbacl.model.DBTrigger var55 = new org.databene.jdbacl.model.DBTrigger("-1", var34);
    org.databene.jdbacl.dialect.DerbyDialect var59 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var61 = var59.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var62 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var63 = var62.getName();
    java.lang.String var64 = var59.formatValue((java.lang.Object)var62);
    var62.setName("'hi!'");
    java.util.List var67 = var62.getSchemas();
    org.databene.jdbacl.model.DBSchema var68 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var62);
    org.databene.jdbacl.model.DBTrigger var69 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var68);
    java.util.List var70 = var68.getPackages();
    org.databene.jdbacl.model.DBPackage var71 = new org.databene.jdbacl.model.DBPackage("CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).", var68);
    java.lang.String var72 = var71.getStatus();
    var34.addPackage(var71);
    boolean var74 = var12.isIdentical((org.databene.jdbacl.model.DBObject)var71);
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test108");


    org.databene.jdbacl.dialect.HSQL2Dialect var0 = new org.databene.jdbacl.dialect.HSQL2Dialect();
    java.lang.String var2 = var0.renderFetchSequenceValue("'hi!'");
    boolean var3 = var0.supportsRegex();
    java.lang.String var6 = var0.renderSequenceValue("NOT drop generator sequence ~ 'hi!'", 10L);
    java.lang.String var8 = var0.renderFetchSequenceValue("jdbc:hsqldb:mem:CREATE SEQUENCE \"hi! as 10 on . = 10.\".\"\" CYCLE CACHE 100NOORDER");
    java.lang.String var12 = var0.regexQuery("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT", false, "alter sequence drop generator CREATE SEQUENCE \"hi! as 10 on . = 10.\".\"\" CACHE 100NOORDER restart with -1");
    java.lang.String var14 = var0.renderDropSequence("'\u0135'.NOT drop generator sequence ~ 'hi!'");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "call next value for 'hi!'"+ "'", var2.equals("call next value for 'hi!'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "alter sequence NOT drop generator sequence ~ 'hi!' restart with 10"+ "'", var6.equals("alter sequence NOT drop generator sequence ~ 'hi!' restart with 10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "call next value for jdbc:hsqldb:mem:CREATE SEQUENCE \"hi! as 10 on . = 10.\".\"\" CYCLE CACHE 100NOORDER"+ "'", var8.equals("call next value for jdbc:hsqldb:mem:CREATE SEQUENCE \"hi! as 10 on . = 10.\".\"\" CYCLE CACHE 100NOORDER"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "REGEXP_MATCHES(DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT, 'alter sequence drop generator CREATE SEQUENCE \"hi! as 10 on . = 10.\".\"\" CACHE 100NOORDER restart with -1')"+ "'", var12.equals("REGEXP_MATCHES(DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT, 'alter sequence drop generator CREATE SEQUENCE \"hi! as 10 on . = 10.\".\"\" CACHE 100NOORDER restart with -1')"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "drop sequence '\u0135'.NOT drop generator sequence ~ 'hi!'"+ "'", var14.equals("drop sequence '\u0135'.NOT drop generator sequence ~ 'hi!'"));

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test109");


    org.databene.jdbacl.dialect.OracleDialect var0 = new org.databene.jdbacl.dialect.OracleDialect();
    java.lang.String var4 = var0.regexQuery("drop sequence alter sequence hi! restart with 1", true, "CREATE GENERATOR DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.");
    boolean var6 = var0.isDeterministicUKName("hi! as 10 on . = 10.");
    org.databene.jdbacl.model.DBSequence var10 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var10.setCache((java.lang.Long)100L);
    java.lang.String var13 = var10.getObjectType();
    java.math.BigInteger var14 = var10.getIncrementIfNotDefault();
    org.databene.jdbacl.model.DBSequence var18 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var18.setName("10");
    java.math.BigInteger var21 = var18.getIncrement();
    java.math.BigInteger var22 = var18.getIncrement();
    var10.setLastNumber(var22);
    java.lang.String var24 = var0.renderCreateSequence(var10);
    boolean var26 = var0.isDeterministicCheckName("left join CONSTRAINT \"hi! identity by primary key\"  as select hi! as 10 on . = 10..NOT drop generator sequence ~ 'hi!', hi! as 10 on . = 10..alter sequence CREATE GENERATOR drop sequence  restart with -1.nextval from dual on No identity defined for table DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT.DROP SEQUENCE  = select hi! as 10 on . = 10..NOT drop generator sequence ~ 'hi!', hi! as 10 on . = 10..alter sequence CREATE GENERATOR drop sequence  restart with -1.nextval from dual.");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "NOT REGEXP_LIKE(drop sequence alter sequence hi! restart with 1, 'CREATE GENERATOR DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.')"+ "'", var4.equals("NOT REGEXP_LIKE(drop sequence alter sequence hi! restart with 1, 'CREATE GENERATOR DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.')"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "sequence"+ "'", var13.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "CREATE SEQUENCE \"hi! as 10 on . = 10.\".\"\" CACHE 100"+ "'", var24.equals("CREATE SEQUENCE \"hi! as 10 on . = 10.\".\"\" CACHE 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test110");


    org.databene.jdbacl.model.jdbc.JDBCDBImporter var6 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var6.setImportingIndexes(true);
    var6.close();
    java.lang.String var10 = var6.getDatabaseProductName();
    var6.setSchemaName("table as NOT REGEXP_MATCHES(sequence, '') on select next value for (\"sequence\"). = NOT REGEXP_MATCHES(sequence, '').DROP SEQUENCE ");
    var6.setSchemaName("'NOT drop generator sequence ~ ''hi!'''");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test111");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mT__92();
    var10.mDROP_TABLE();
    var10.mT__124();
    var10.mBANGEQ();
    var10.mT__71();
    var10.mCHAR();
    var10.mT__80();
    var10.mT__61();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test112");


    org.databene.jdbacl.dialect.H2Dialect var0 = new org.databene.jdbacl.dialect.H2Dialect();
    java.lang.String var2 = var0.renderFetchSequenceValue("10");
    boolean var3 = var0.isSequenceBoundarySupported();
    boolean var6 = var0.isDefaultCatalog("null", "jdbc:h2:mem:select next value for 10");
    boolean var8 = var0.isDeterministicFKName("\"'hi!'\"");
    java.lang.String var10 = var0.renderDropSequence("CONSTRAINT \"select nextval('')\" UNIQUE ()");
    boolean var13 = var0.isDefaultCatalog("CONSTRAINT \"hi! identity by primary key\" PRIMARY KEY ()", "No identity defined for table alter sequence drop generator sequence restart with 100");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "select next value for 10"+ "'", var2.equals("select next value for 10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "drop sequence CONSTRAINT \"select nextval('')\" UNIQUE ()"+ "'", var10.equals("drop sequence CONSTRAINT \"select nextval('')\" UNIQUE ()"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test113");


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
    java.lang.String var33 = var31.getObjectType();
    java.lang.String var34 = var31.getDoc();
    java.lang.String var35 = var31.toString();
    org.databene.jdbacl.model.DBCatalog var36 = var31.getCatalog();
    java.lang.String var37 = var36.getDoc();
    java.util.List var38 = var36.getComponents();
    
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
    assertTrue("'" + var33 + "' != '" + "table"+ "'", var33.equals("table"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "select nextval('CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT')"+ "'", var34.equals("select nextval('CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT')"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "drop generator CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var35.equals("drop generator CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test114");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.setBacktrackingLevel(10);
    var0.mALTER_TABLE();
    var0.setBacktrackingLevel(1);
    var0.mCOMMENT_COLUMN();
    int var8 = var0.getNumberOfSyntaxErrors();
    var0.emitErrorMessage("null.jdbc:h2:mem:select next value for 10");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test115");


    org.databene.jdbacl.model.jdbc.JDBCDBImporter var6 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var6.setImportingIndexes(true);
    var6.setCatalogName("null[false]");
    var6.setIncludeTables("jdbc:hsqldb:mem:CREATE SEQUENCE \"hi! as 10 on . = 10.\".\"\" CYCLE CACHE 100NOORDER NOT REGEXP 'jdbc:h2:mem:left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as CREATE GENERATOR  on jdbc:h2:mem:hi! as 10 on . = 10.-identity-..DROP SEQUENCE  = CREATE GENERATOR . REGEXP 'drop sequence ''");

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test116");


    org.databene.jdbacl.dialect.HSQL2Dialect var0 = new org.databene.jdbacl.dialect.HSQL2Dialect();
    java.lang.String var3 = var0.renderSequenceValue("hi!", 1L);
    boolean var6 = var0.isDefaultCatalog("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)", "jdbc:h2:mem:hi! as 10 on . = 10.");
    java.lang.String var9 = var0.renderSequenceValue("drop generator sequence", 100L);
    java.lang.String var11 = var0.renderDropSequence("\"'hi!'\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "alter sequence hi! restart with 1"+ "'", var3.equals("alter sequence hi! restart with 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "alter sequence drop generator sequence restart with 100"+ "'", var9.equals("alter sequence drop generator sequence restart with 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "drop sequence \"'hi!'\""+ "'", var11.equals("drop sequence \"'hi!'\""));

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test117");


    org.databene.jdbacl.model.DBSequence var3 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var3.setName("10");
    org.databene.jdbacl.model.DBSequence var9 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var9.setName("10");
    java.math.BigInteger var12 = var9.getIncrement();
    java.lang.Boolean var13 = var9.isCycle();
    java.lang.String var14 = var9.dropDDL();
    org.databene.jdbacl.model.DBSequence var18 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var18.setCache((java.lang.Long)100L);
    java.lang.String var21 = var18.getObjectType();
    java.math.BigInteger var22 = var18.getIncrementIfNotDefault();
    org.databene.jdbacl.model.DBSequence var26 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var26.setName("10");
    java.math.BigInteger var29 = var26.getIncrement();
    java.math.BigInteger var30 = var26.getIncrement();
    var18.setLastNumber(var30);
    var9.setIncrement(var30);
    var3.setIncrement(var30);
    org.databene.jdbacl.model.DBCatalog var35 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var36 = var35.getName();
    org.databene.jdbacl.model.Database var37 = var35.getDatabase();
    java.lang.String var38 = var35.getDoc();
    org.databene.jdbacl.dialect.DerbyDialect var40 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var42 = var40.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var43 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var44 = var43.getName();
    java.lang.String var45 = var40.formatValue((java.lang.Object)var43);
    var43.setName("'hi!'");
    java.util.List var48 = var43.getSchemas();
    org.databene.jdbacl.model.DBSchema var49 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var43);
    var35.removeSchema(var49);
    org.databene.jdbacl.dialect.DerbyDialect var53 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var55 = var53.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var56 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var57 = var56.getName();
    java.lang.String var58 = var53.formatValue((java.lang.Object)var56);
    var56.setName("'hi!'");
    java.util.List var61 = var56.getSchemas();
    org.databene.jdbacl.model.DBSchema var62 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var56);
    org.databene.jdbacl.model.DBTrigger var63 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var62);
    var63.setDescription("CREATE GENERATOR drop sequence ");
    java.lang.String var66 = var63.getTriggerBody();
    java.lang.String var67 = var63.getColumnName();
    java.lang.String var68 = var63.getWhenClause();
    var49.addTrigger(var63);
    org.databene.jdbacl.model.DBTrigger var70 = new org.databene.jdbacl.model.DBTrigger("-1", var49);
    java.util.List var72 = var49.getSequences(false);
    org.databene.jdbacl.dialect.DerbyDialect var76 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var78 = var76.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var79 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var80 = var79.getName();
    java.lang.String var81 = var76.formatValue((java.lang.Object)var79);
    var79.setName("'hi!'");
    java.util.List var84 = var79.getSchemas();
    org.databene.jdbacl.model.DBSchema var85 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var79);
    org.databene.jdbacl.model.DBTrigger var86 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var85);
    java.util.List var87 = var85.getPackages();
    org.databene.jdbacl.model.DBPackage var88 = new org.databene.jdbacl.model.DBPackage("CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).", var85);
    var49.addPackage(var88);
    boolean var90 = var3.isIdentical((org.databene.jdbacl.model.DBObject)var49);
    java.math.BigInteger var91 = var3.getMaxValue();
    java.math.BigInteger var92 = var3.getMinValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "drop sequence 10"+ "'", var14.equals("drop sequence 10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "sequence"+ "'", var21.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var92);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test118");


    org.databene.jdbacl.dialect.FirebirdDialect var0 = new org.databene.jdbacl.dialect.FirebirdDialect();
    java.lang.String var3 = var0.renderSetSequenceValue(".", 0L);
    boolean var5 = var0.isDeterministicUKName("hi! identity by primary key");
    boolean var6 = var0.isSequenceBoundarySupported();
    org.databene.jdbacl.model.DBSequence var10 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var10.setCache((java.lang.Long)100L);
    java.lang.String var13 = var10.getObjectType();
    java.math.BigInteger var14 = var10.getIncrementIfNotDefault();
    java.lang.String var15 = var0.renderCreateSequence(var10);
    boolean var16 = var0.isSequenceBoundarySupported();
    java.lang.String var17 = var0.getJDBCDriverClass();
    org.databene.jdbacl.model.DBSequence var21 = new org.databene.jdbacl.model.DBSequence("jdbc:hsqldb:mem:select next value for SET GENERATOR.TO - 1 DROP SEQUENCE NULL", "drop sequence select nextval('alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP 'alter sequence hi! restart with 1'')", "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT REGEXP 'hi! as 10 on . = 10..NOT drop generator sequence ~ 'hi!', hi! as 10 on . = 10..alter sequence CREATE GENERATOR drop sequence  restart with -1'");
    java.lang.String var22 = var0.renderCreateSequence(var21);
    
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
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "org.firebirdsql.jdbc.FBDriver"+ "'", var17.equals("org.firebirdsql.jdbc.FBDriver"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "CREATE GENERATOR jdbc:hsqldb:mem:select next value for SET GENERATOR.TO - 1 DROP SEQUENCE NULL"+ "'", var22.equals("CREATE GENERATOR jdbc:hsqldb:mem:select next value for SET GENERATOR.TO - 1 DROP SEQUENCE NULL"));

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test119");


    org.databene.jdbacl.SQLScriptException var2 = new org.databene.jdbacl.SQLScriptException(1);
    org.databene.jdbacl.SQLScriptException var5 = new org.databene.jdbacl.SQLScriptException((java.lang.Throwable)var2, "SELECT * FROM null WHERE DROP SEQUENCE  = 'hi!' : DROP SEQUENCE ", 100);
    org.databene.jdbacl.SQLScriptException var7 = var2.withUri("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    org.databene.jdbacl.SQLScriptException var9 = var2.withUri("drop generator left join alter sequence CREATE GENERATOR drop sequence  restart with -1 as call next value for 'hi!' on jdbc:h2:mem:org.databene.jdbacl.SQLScriptException: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1: . = call next value for 'hi!'.DROP SEQUENCE ");
    java.lang.Throwable[] var10 = var9.getSuppressed();
    org.databene.jdbacl.SQLScriptException var12 = var9.withUri("VALUES (NEXT VALUE FOR CREATE GENERATOR DROP SEQUENCE CREATE GENERATOR  RESTRICT)");
    org.databene.jdbacl.SQLScriptException var15 = new org.databene.jdbacl.SQLScriptException(1);
    org.databene.jdbacl.SQLScriptException var17 = var15.withUri("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT");
    org.databene.jdbacl.SQLScriptException var19 = new org.databene.jdbacl.SQLScriptException((java.lang.Throwable)var15, 0);
    org.databene.jdbacl.SQLScriptException var21 = new org.databene.jdbacl.SQLScriptException((java.lang.Throwable)var19, 10);
    org.databene.jdbacl.identity.InvalidIdentityDefinitionError var22 = new org.databene.jdbacl.identity.InvalidIdentityDefinitionError("select next value for CONSTRAINT \"select nextval('')\" UNIQUE (, NaturalPkIdentity(hi!))", (java.lang.Throwable)var21);
    int var23 = var21.getLineNo();
    var9.addSuppressed((java.lang.Throwable)var21);
    org.databene.jdbacl.identity.InvalidIdentityDefinitionError var25 = new org.databene.jdbacl.identity.InvalidIdentityDefinitionError("select gen_id(CONSTRAINT \"select nextval('')\" UNIQUE () DROP SEQUENCE (100) NULL, 1) from RDB$DATABASE;", (java.lang.Throwable)var21);
    org.databene.jdbacl.SQLScriptException var27 = var21.withUri("SubNkPkQueryIdentity(-1)");
    java.lang.String var28 = var27.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "org.databene.jdbacl.SQLScriptException: Error in execution of script SubNkPkQueryIdentity(-1) line 10: Error in execution of script line 0: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1: "+ "'", var28.equals("org.databene.jdbacl.SQLScriptException: Error in execution of script SubNkPkQueryIdentity(-1) line 10: Error in execution of script line 0: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1: "));

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test120");


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
    var0.setBacktrackingLevel(1);
    var0.mT__75();
    java.lang.String var19 = var0.getCharErrorDisplay(41);
    var0.mT__131();
    var0.beginResync();
    var0.mT__130();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "')'"+ "'", var19.equals("')'"));

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test121");


    org.databene.jdbacl.model.FKChangeRule var1 = org.databene.jdbacl.model.FKChangeRule.valueOf("NO_ACTION");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test122");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mT__92();
    var10.mDROP_TABLE();
    java.lang.String var17 = var10.getText();
    var10.mT__95();
    var10.mIS();
    var10.mCOMMENT_TABLE();
    var10.reset();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "select next value for SET GENERATOR.TO - 1"+ "'", var17.equals("select next value for SET GENERATOR.TO - 1"));

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test123");


    org.databene.jdbacl.dialect.SqlServerDialect var0 = new org.databene.jdbacl.dialect.SqlServerDialect();
    boolean var2 = var0.isDeterministicFKName("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    boolean var4 = var0.isDeterministicIndexName("drop generator .");
    boolean var6 = var0.isDeterministicUKName("alter sequence  restart with -1");
    boolean var9 = var0.isDefaultSchema("select nextval('CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT')", "foreign key constraint");
    boolean var11 = var0.isDeterministicPKName("drop sequence ()");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test124");


    org.databene.jdbacl.dialect.DerbyDialect var4 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var6 = var4.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var7 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var8 = var7.getName();
    java.lang.String var9 = var4.formatValue((java.lang.Object)var7);
    var7.setName("'hi!'");
    java.util.List var12 = var7.getSchemas();
    org.databene.jdbacl.model.DBSchema var13 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var7);
    org.databene.jdbacl.model.DBTrigger var14 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var13);
    java.lang.String var15 = var13.getName();
    org.databene.jdbacl.model.DefaultDBTable var16 = new org.databene.jdbacl.model.DefaultDBTable("drop sequence 10", var13);
    org.databene.jdbacl.model.DBTrigger var17 = new org.databene.jdbacl.model.DBTrigger("CONSTRAINT \"CREATE GENERATOR drop sequence \" .", var13);
    var17.setTableOwner("alter sequence REGEXP_LIKE((), 'drop sequence drop generator SET GENERATOR select nextval for  DROP SEQUENCE (0,-1) NULL from jdbc:h2:mem:hi! as 10 on . = 10.-identity- TO 0') restart with 100");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")"+ "'", var15.equals("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")"));

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test125");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mT__92();
    var10.mDROP_TABLE();
    java.lang.String var17 = var10.getText();
    var10.mT__99();
    var10.mT__130();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "select next value for SET GENERATOR.TO - 1"+ "'", var17.equals("select next value for SET GENERATOR.TO - 1"));

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test126");


    org.databene.jdbacl.dialect.DB2Dialect var0 = new org.databene.jdbacl.dialect.DB2Dialect();
    boolean var3 = var0.isDefaultSchema("CONSTRAINT \"hi! identity by primary key\" PRIMARY KEY () ~ 'jdbc:h2:mem:hi! as 10 on . = 10.-identity-.'", "select next value for jdbc:h2:mem:select next value for 10");
    boolean var5 = var0.isDeterministicIndexName("hi!");
    boolean var7 = var0.isDeterministicUKName("Identity definition by unique key: select next value for 10");
    boolean var9 = var0.isDeterministicIndexName("mysql");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test127");


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
    boolean var38 = var36.isNullable();
    org.databene.jdbacl.model.DBForeignKeyConstraint var39 = var36.getForeignKeyConstraint();
    boolean var40 = var36.isNullable();
    org.databene.jdbacl.model.DefaultDBTable var41 = new org.databene.jdbacl.model.DefaultDBTable();
    var41.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var44 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var45 = var44.getForeignKeyConstraints();
    var41.addReferrer((org.databene.jdbacl.model.DBTable)var44);
    java.lang.String[] var52 = new java.lang.String[] { ""};
    java.lang.String[] var56 = new java.lang.String[] { ""};
    java.lang.String var57 = org.databene.jdbacl.SQLUtil.join("", "", var52, "hi!", "10", var56);
    org.databene.jdbacl.model.DBUniqueConstraint var58 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var44, "select nextval('')", false, var52);
    var36.addUkConstraint(var58);
    org.databene.jdbacl.JDBCConnectData var66 = new org.databene.jdbacl.JDBCConnectData("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)", "hi!", "hi!", "drop generator sequence", "'hi!'", "hi!");
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var67 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter(var66);
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var68 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter(var66);
    org.databene.jdbacl.model.DBCatalog var70 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var71 = var70.getName();
    org.databene.jdbacl.model.Database var72 = var70.getDatabase();
    java.lang.String var73 = var70.getDoc();
    org.databene.jdbacl.dialect.DerbyDialect var75 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var77 = var75.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var78 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var79 = var78.getName();
    java.lang.String var80 = var75.formatValue((java.lang.Object)var78);
    var78.setName("'hi!'");
    java.util.List var83 = var78.getSchemas();
    org.databene.jdbacl.model.DBSchema var84 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var78);
    var70.removeSchema(var84);
    java.util.List var87 = var84.getTables(false);
    org.databene.jdbacl.model.DefaultDBTable var88 = new org.databene.jdbacl.model.DefaultDBTable("drop generator .", var84);
    org.databene.jdbacl.model.jdbc.LazyTable var91 = new org.databene.jdbacl.model.jdbc.LazyTable(var68, var84, "drop generator CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE ", "select nextval('CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT')");
    org.databene.jdbacl.model.DBCatalog var92 = var91.getCatalog();
    org.databene.jdbacl.model.DBCatalog var93 = var91.getCatalog();
    org.databene.jdbacl.model.DBTreeModel var94 = new org.databene.jdbacl.model.DBTreeModel((org.databene.jdbacl.model.CompositeDBObject)var91);
    java.lang.String var95 = var91.getObjectType();
    var36.setTable((org.databene.jdbacl.model.DBTable)var91);
    
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
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "hi! as 10 on . = 10."+ "'", var57.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var95 + "' != '" + "table"+ "'", var95.equals("table"));

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test128");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mT__92();
    var10.mDROP_TABLE();
    java.lang.String var17 = var10.getText();
    var10.mT__95();
    var10.mIN();
    var10.mT__137();
    var10.mT__78();
    var10.mLTGT();
    var10.mT__129();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "select next value for SET GENERATOR.TO - 1"+ "'", var17.equals("select next value for SET GENERATOR.TO - 1"));

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test129");


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
    var15.setDataObjectId("VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) = \"sequence\"");
    java.lang.String var19 = var15.getSubObjectName();
    
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
    assertNull(var19);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test130");


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
    org.databene.jdbacl.sql.parser.SQLLexer var16 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var9);
    var16.mT__123();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var16.mIN();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test131");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_SEQUENCE();
    var0.mCOLUMN_NAME();
    var0.mSIZE();
    var0.mTABLE_NAME();
    org.databene.jdbacl.sql.parser.SQLLexer var5 = new org.databene.jdbacl.sql.parser.SQLLexer();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var7 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var7.release((-1));
    boolean var11 = var5.mismatchIsUnwantedToken((org.antlr.runtime.IntStream)var7, 0);
    var7.reset();
    var7.setLine(79);
    org.databene.jdbacl.sql.parser.SQLLexer var15 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var7);
    var0.setCharStream((org.antlr.runtime.CharStream)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test132");


    org.databene.jdbacl.JDBCDriverInfo var3 = new org.databene.jdbacl.JDBCDriverInfo("select next value for SET GENERATOR.TO - 1", "jdbc:h2:mem:select next value for 10", "SET GENERATOR catalog TO -2");
    java.lang.String var4 = var3.getId();
    var3.setDbSystem("((\"sequence\" BETWEEN \"sequence\" AND \"sequence\") BETWEEN \"sequence\" AND \"'hi!'\")");
    org.databene.jdbacl.dialect.OracleDialect var7 = new org.databene.jdbacl.dialect.OracleDialect();
    boolean var9 = var7.isDeterministicUKName("alter sequence CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT restart with 1");
    boolean var11 = var7.isDeterministicFKName("false");
    boolean var14 = var7.isDefaultCatalog("alter sequence hi! restart with 1", "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT (, sequence, SELECT NEXT VALUE FOR SET GENERATOR.TO - 1 NOT REGEXP 'HI!') unique");
    boolean var15 = var3.equals((java.lang.Object)"CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT (, sequence, SELECT NEXT VALUE FOR SET GENERATOR.TO - 1 NOT REGEXP 'HI!') unique");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "select next value for SET GENERATOR.TO - 1"+ "'", var4.equals("select next value for SET GENERATOR.TO - 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test133");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mLE();
    var10.mVARCHAR2();
    var10.traceIn("CREATE GENERATOR 10", 309);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test134");


    org.databene.jdbacl.dialect.HSQL2Dialect var0 = new org.databene.jdbacl.dialect.HSQL2Dialect();
    java.lang.String var3 = var0.renderSequenceValue("hi!", 1L);
    boolean var6 = var0.isDefaultCatalog("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)", "jdbc:h2:mem:hi! as 10 on . = 10.");
    java.lang.String var9 = var0.renderSequenceValue("drop generator sequence", 100L);
    boolean var10 = var0.isSequenceSupported();
    boolean var13 = var0.isDefaultCatalog("Identity definition by unique key: select next value for 10", "alter sequence drop sequence 10 restart with 0");
    boolean var16 = var0.isDefaultSchema("Sub identity of ():\nnull", "NOT REGEXP_LIKE(drop sequence alter sequence hi! restart with 1, 'CREATE GENERATOR DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.')");
    boolean var18 = var0.isDeterministicUKName("hi! as 10 on . = 10..NOT drop generator sequence ~ 'hi!', hi! as 10 on . = 10..alter sequence CREATE GENERATOR drop sequence  restart with -1");
    java.lang.String var20 = var0.renderDropSequence("alter sequence CREATE SEQUENCE \"(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")\".\"NO_ACTION\" restart with 1");
    boolean var21 = var0.supportsRegex();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "alter sequence hi! restart with 1"+ "'", var3.equals("alter sequence hi! restart with 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "alter sequence drop generator sequence restart with 100"+ "'", var9.equals("alter sequence drop generator sequence restart with 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "drop sequence alter sequence CREATE SEQUENCE \"(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")\".\"NO_ACTION\" restart with 1"+ "'", var20.equals("drop sequence alter sequence CREATE SEQUENCE \"(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")\".\"NO_ACTION\" restart with 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test135");


    org.databene.jdbacl.model.DBCheckConstraint var4 = new org.databene.jdbacl.model.DBCheckConstraint("column", true, "call next value for select nextval(''alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP ''alter sequence hi! restart with 1'''')", "\"'hi!'\"");
    java.lang.String var5 = var4.toString();
    org.databene.jdbacl.model.DBCheckConstraint var10 = new org.databene.jdbacl.model.DBCheckConstraint("column", true, "call next value for select nextval(''alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP ''alter sequence hi! restart with 1'''')", "\"'hi!'\"");
    java.lang.String var11 = var10.getConditionText();
    java.lang.String var12 = var10.getConditionText();
    org.databene.jdbacl.model.DBCheckConstraint var17 = new org.databene.jdbacl.model.DBCheckConstraint("column", true, "call next value for select nextval(''alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP ''alter sequence hi! restart with 1'''')", "\"'hi!'\"");
    java.lang.String var18 = var17.getConditionText();
    org.databene.jdbacl.model.DBCheckConstraint var23 = new org.databene.jdbacl.model.DBCheckConstraint("column", true, "call next value for select nextval(''alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP ''alter sequence hi! restart with 1'''')", "\"'hi!'\"");
    java.lang.String var24 = var23.getTableName();
    boolean var25 = var17.isEquivalent(var23);
    boolean var26 = var10.isEquivalent(var23);
    org.databene.jdbacl.model.TableContainer var31 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var32 = var31.getTables();
    org.databene.jdbacl.model.TableContainer var33 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var31);
    org.databene.jdbacl.model.DefaultDBTable var34 = new org.databene.jdbacl.model.DefaultDBTable();
    var34.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var37 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var38 = var37.getForeignKeyConstraints();
    var34.addReferrer((org.databene.jdbacl.model.DBTable)var37);
    var31.addTable((org.databene.jdbacl.model.DBTable)var37);
    java.lang.String[] var45 = new java.lang.String[] { ""};
    java.lang.String[] var49 = new java.lang.String[] { ""};
    java.lang.String var50 = org.databene.jdbacl.SQLUtil.join("", "", var45, "hi!", "10", var49);
    java.lang.String var51 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var45);
    org.databene.jdbacl.model.TableContainer var54 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var55 = var54.getTables();
    org.databene.jdbacl.model.TableContainer var56 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var54);
    org.databene.jdbacl.model.DefaultDBTable var57 = new org.databene.jdbacl.model.DefaultDBTable();
    var57.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var60 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var61 = var60.getForeignKeyConstraints();
    var57.addReferrer((org.databene.jdbacl.model.DBTable)var60);
    var54.addTable((org.databene.jdbacl.model.DBTable)var60);
    java.lang.String[] var66 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var67 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var66);
    org.databene.jdbacl.model.DBForeignKeyConstraint var68 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var37, var45, (org.databene.jdbacl.model.DBTable)var60, var66);
    java.lang.String[] var69 = var68.getRefereeColumnNames();
    java.lang.String[] var70 = var68.getRefereeColumnNames();
    boolean var71 = var23.isIdentical((org.databene.jdbacl.model.DBObject)var68);
    boolean var72 = var4.isEquivalent(var23);
    java.lang.String var73 = var23.getConditionText();
    java.lang.String[] var74 = var23.getColumnNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "CONSTRAINT columnCHECK \"'hi!'\""+ "'", var5.equals("CONSTRAINT columnCHECK \"'hi!'\""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "\"'hi!'\""+ "'", var11.equals("\"'hi!'\""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "\"'hi!'\""+ "'", var12.equals("\"'hi!'\""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "\"'hi!'\""+ "'", var18.equals("\"'hi!'\""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "call next value for select nextval(''alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP ''alter sequence hi! restart with 1'''')"+ "'", var24.equals("call next value for select nextval(''alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP ''alter sequence hi! restart with 1'''')"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi! as 10 on . = 10."+ "'", var50.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "."+ "'", var51.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var67.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "\"'hi!'\""+ "'", var73.equals("\"'hi!'\""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test136");


    org.databene.jdbacl.model.TableContainer var2 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var3 = var2.getTables();
    org.databene.jdbacl.model.DefaultDBTable var4 = new org.databene.jdbacl.model.DefaultDBTable();
    var4.setDoc(".");
    boolean var8 = var4.equals((java.lang.Object)(-1.0f));
    var2.removeTable((org.databene.jdbacl.model.DBTable)var4);
    org.databene.jdbacl.model.DefaultDBTable var12 = new org.databene.jdbacl.model.DefaultDBTable();
    var12.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var15 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var16 = var15.getForeignKeyConstraints();
    var12.addReferrer((org.databene.jdbacl.model.DBTable)var15);
    java.lang.String[] var23 = new java.lang.String[] { ""};
    java.lang.String[] var27 = new java.lang.String[] { ""};
    java.lang.String var28 = org.databene.jdbacl.SQLUtil.join("", "", var23, "hi!", "10", var27);
    org.databene.jdbacl.model.DBUniqueConstraint var29 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var15, "select nextval('')", false, var23);
    org.databene.jdbacl.model.DBDataType var32 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var33 = var32.isAlpha();
    org.databene.jdbacl.model.DefaultDBColumn var34 = new org.databene.jdbacl.model.DefaultDBColumn("'hi!'", (org.databene.jdbacl.model.DBTable)var15, var32);
    org.databene.jdbacl.model.DefaultDBTable var36 = new org.databene.jdbacl.model.DefaultDBTable();
    var36.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var39 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var40 = var39.getForeignKeyConstraints();
    var36.addReferrer((org.databene.jdbacl.model.DBTable)var39);
    org.databene.jdbacl.model.DBDataType var44 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var45 = var44.isAlpha();
    java.lang.String var46 = var44.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var47 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var50 = var47.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var52 = var47.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var53 = var44.equals((java.lang.Object)var52);
    org.databene.jdbacl.model.DefaultDBColumn var56 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var39, var44, (java.lang.Integer)0, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DBDataType var59 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var60 = var59.isTemporal();
    boolean var61 = var44.equals((java.lang.Object)var59);
    org.databene.jdbacl.model.DefaultDBColumn var64 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.", (org.databene.jdbacl.model.DBTable)var15, var44, (java.lang.Integer)1, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DefaultDBColumn var67 = new org.databene.jdbacl.model.DefaultDBColumn("alter sequence call next value for 'hi!' restart with 100", (org.databene.jdbacl.model.DBTable)var4, var44, (java.lang.Integer)41, (java.lang.Integer)4);
    boolean var68 = var44.isAlpha();
    boolean var69 = var44.isTemporal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi! as 10 on . = 10."+ "'", var28.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "DROP SEQUENCE "+ "'", var46.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var52.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test137");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mT__92();
    var10.mT__92();
    var10.match(4);
    var10.mLE();
    var10.mT__101();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test138");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mT__92();
    var10.mDROP_TABLE();
    java.lang.String var17 = var10.getText();
    var10.mT__95();
    var10.mIS();
    var10.mCOMMENT_TABLE();
    var10.mT__116();
    java.lang.String var22 = var10.getSourceName();
    var10.mT__131();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "select next value for SET GENERATOR.TO - 1"+ "'", var17.equals("select next value for SET GENERATOR.TO - 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test139");


    org.databene.jdbacl.JDBCDriverInfo var0 = new org.databene.jdbacl.JDBCDriverInfo();
    var0.setDriverClass("hi!");
    var0.setDefaultUser("call next value for 'hi!'");
    java.lang.String var5 = var0.getDefaultPort();
    var0.setDriverClass("drop sequence select CREATE SEQUENCE \"(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")\".\"NO_ACTION\".nextval from dual");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test140");


    org.databene.jdbacl.dialect.H2Dialect var0 = new org.databene.jdbacl.dialect.H2Dialect();
    java.lang.String var2 = var0.renderFetchSequenceValue("SET GENERATOR . TO -1");
    java.lang.String var5 = var0.setSequenceValue("", (-1L));
    boolean var8 = var0.isDefaultCatalog("sequence", "drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)");
    boolean var10 = var0.isDeterministicIndexName("SELECT * FROM null WHERE DROP SEQUENCE  = 'hi!' : DROP SEQUENCE ");
    boolean var12 = var0.isDeterministicFKName("CREATE SEQUENCE call next value for 'hi!' MAXVALUE 1");
    boolean var14 = var0.isDeterministicIndexName("'\\n'");
    boolean var17 = var0.isDefaultCatalog("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", "call next value for 'hi!'");
    java.lang.String var19 = var0.renderDropSequence("Identity definition by NK-PK query: NOT drop generator sequence ~ 'hi!'");
    boolean var20 = var0.isSequenceBoundarySupported();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "select next value for SET GENERATOR . TO -1"+ "'", var2.equals("select next value for SET GENERATOR . TO -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "alter sequence  restart with -1"+ "'", var5.equals("alter sequence  restart with -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "drop sequence Identity definition by NK-PK query: NOT drop generator sequence ~ 'hi!'"+ "'", var19.equals("drop sequence Identity definition by NK-PK query: NOT drop generator sequence ~ 'hi!'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test141");


    org.databene.jdbacl.dialect.HSQL2Dialect var0 = new org.databene.jdbacl.dialect.HSQL2Dialect();
    java.lang.String var2 = var0.renderFetchSequenceValue("'hi!'");
    boolean var3 = var0.supportsRegex();
    boolean var5 = var0.isDeterministicUKName("catalog identity by primary key");
    boolean var6 = var0.supportsRegex();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "call next value for 'hi!'"+ "'", var2.equals("call next value for 'hi!'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test142");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var2 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var2.release((-1));
    boolean var6 = var0.mismatchIsUnwantedToken((org.antlr.runtime.IntStream)var2, 0);
    org.databene.jdbacl.sql.parser.SQLLexer var7 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var7.mCREATE_TABLE();
    var7.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var11 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var13 = var11.LT(10);
    var7.setCharStream((org.antlr.runtime.CharStream)var11);
    boolean var16 = var0.mismatchIsUnwantedToken((org.antlr.runtime.IntStream)var11, 69);
    var11.setLine(0);
    org.databene.jdbacl.dialect.Firebird2_5Dialect var19 = new org.databene.jdbacl.dialect.Firebird2_5Dialect();
    java.lang.String var22 = var19.renderSetSequenceValue("select gen_id(call next value for org.databene.jdbacl.SQLScriptException: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1: , 1) from RDB$DATABASE;", 100L);
    boolean var24 = var19.isDeterministicPKName("select nextval('select next value for SET GENERATOR . TO -1')");
    boolean var25 = var19.supportsRegex();
    java.lang.String var27 = var19.renderDropSequence("foreign key constraint CREATE GENERATOR drop sequence ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var28 = org.databene.jdbacl.sql.SQLParserUtil.parse((org.antlr.runtime.CharStream)var11, (org.databene.jdbacl.DatabaseDialect)var19);
      fail("Expected exception of type org.databene.commons.ParseException");
    } catch (org.databene.commons.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "SET GENERATOR select gen_id(call next value for org.databene.jdbacl.SQLScriptException: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1: , 1) from RDB$DATABASE; TO 99"+ "'", var22.equals("SET GENERATOR select gen_id(call next value for org.databene.jdbacl.SQLScriptException: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1: , 1) from RDB$DATABASE; TO 99"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "drop generator foreign key constraint CREATE GENERATOR drop sequence "+ "'", var27.equals("drop generator foreign key constraint CREATE GENERATOR drop sequence "));

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test143");


    org.databene.jdbacl.dialect.MySQLDialect var0 = new org.databene.jdbacl.dialect.MySQLDialect();
    boolean var2 = var0.isDeterministicFKName("NaturalPkIdentity(hi!)");
    boolean var3 = var0.supportsRegex();
    boolean var4 = var0.supportsRegex();
    boolean var6 = var0.isDeterministicPKName("DROP SEQUENCE  NOT REGEXP 'VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).)'");
    boolean var7 = var0.supportsRegex();
    boolean var9 = var0.isDeterministicFKName("CREATE SEQUENCE 10");
    boolean var10 = var0.supportsRegex();
    boolean var11 = var0.supportsRegex();
    boolean var13 = var0.isDeterministicFKName("jdbc:hsqldb:mem:select next value for SET GENERATOR.TO - 1 DROP SEQUENCE NULL");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test144");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mT__92();
    var10.mDROP_TABLE();
    var10.mT__124();
    var10.mDROP_TABLE();
    var10.mSLASH();
    var10.mCHAR();
    var10.mCOMMENT_TABLE();
    var10.skip();
    var10.mT__81();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test145");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.NameSpec var1 = org.databene.jdbacl.NameSpec.valueOf("VALUES (NEXT VALUE FOR REGEXP_MATCHES(No identity defined for table DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT, 'alter sequence CREATE SEQUENCE 10 restart with 1'))");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test146");


    org.databene.jdbacl.dialect.PostgreSQLDialect var0 = new org.databene.jdbacl.dialect.PostgreSQLDialect();
    org.databene.jdbacl.model.DBSequence var4 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var4.setCache((java.lang.Long)100L);
    java.lang.String var7 = var4.getObjectType();
    java.math.BigInteger var8 = var4.getIncrementIfNotDefault();
    org.databene.jdbacl.model.DBSequence var12 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var12.setName("10");
    java.math.BigInteger var15 = var12.getIncrement();
    java.math.BigInteger var16 = var12.getIncrement();
    var4.setLastNumber(var16);
    java.lang.String var18 = var0.renderCreateSequence(var4);
    java.lang.String var22 = var0.regexQuery("select alter sequence drop sequence 10 restart with 0.nextval from dual", true, "CONSTRAINT \"CREATE GENERATOR drop sequence \" ");
    java.lang.String var24 = var0.renderFetchSequenceValue("REGEXP_MATCHES(CREATE SEQUENCE  CACHE 100, '(\"sequence\" BETWEEN \"sequence\" AND \"sequence\").')");
    boolean var26 = var0.isDeterministicPKName("Sub identity of ():\nalter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0");
    boolean var28 = var0.isDeterministicPKName("DROP SEQUENCE  = \"sequence\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "sequence"+ "'", var7.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "CREATE SEQUENCE  CACHE 100"+ "'", var18.equals("CREATE SEQUENCE  CACHE 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "NOT select alter sequence drop sequence 10 restart with 0.nextval from dual ~ 'CONSTRAINT \"CREATE GENERATOR drop sequence \" '"+ "'", var22.equals("NOT select alter sequence drop sequence 10 restart with 0.nextval from dual ~ 'CONSTRAINT \"CREATE GENERATOR drop sequence \" '"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "select nextval('REGEXP_MATCHES(CREATE SEQUENCE  CACHE 100, '(\"sequence\" BETWEEN \"sequence\" AND \"sequence\").')')"+ "'", var24.equals("select nextval('REGEXP_MATCHES(CREATE SEQUENCE  CACHE 100, '(\"sequence\" BETWEEN \"sequence\" AND \"sequence\").')')"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test147");


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
    java.lang.String var65 = org.databene.jdbacl.SQLUtil.renderColumnTypeWithSize((org.databene.jdbacl.model.DBColumn)var36);
    var36.setVersionColumn(false);
    org.databene.jdbacl.model.DBDataType var68 = var36.getType();
    
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
    assertTrue("'" + var65 + "' != '" + "DROP SEQUENCE (0,-1)"+ "'", var65.equals("DROP SEQUENCE (0,-1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test148");


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
    org.databene.jdbacl.model.DBDataType var24 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var25 = var24.isTemporal();
    boolean var26 = var9.equals((java.lang.Object)var24);
    java.lang.String var27 = var24.toString();
    boolean var28 = var24.isLOB();
    
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
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "DROP SEQUENCE "+ "'", var27.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test149");


    org.databene.jdbacl.model.DefaultDBTable var1 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var2 = var1.getForeignKeyConstraints();
    var1.setDoc("drop sequence ");
    java.lang.String[] var9 = new java.lang.String[] { ""};
    java.lang.String[] var13 = new java.lang.String[] { ""};
    java.lang.String var14 = org.databene.jdbacl.SQLUtil.join("", "", var9, "hi!", "10", var13);
    java.lang.String var15 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var13);
    java.lang.Object[] var17 = org.databene.jdbacl.SQLUtil.parseColumnTypeAndSize("CREATE GENERATOR ");
    java.lang.String var18 = org.databene.jdbacl.SQLUtil.renderQuery((org.databene.jdbacl.model.DBTable)var1, var13, var17);
    org.databene.jdbacl.model.DefaultDBTable var21 = new org.databene.jdbacl.model.DefaultDBTable();
    var21.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var24 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var25 = var24.getForeignKeyConstraints();
    var21.addReferrer((org.databene.jdbacl.model.DBTable)var24);
    java.lang.String[] var32 = new java.lang.String[] { ""};
    java.lang.String[] var36 = new java.lang.String[] { ""};
    java.lang.String var37 = org.databene.jdbacl.SQLUtil.join("", "", var32, "hi!", "10", var36);
    org.databene.jdbacl.model.DBUniqueConstraint var38 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var24, "select nextval('')", false, var32);
    org.databene.jdbacl.model.DBDataType var41 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var42 = var41.isAlpha();
    org.databene.jdbacl.model.DefaultDBColumn var43 = new org.databene.jdbacl.model.DefaultDBColumn("'hi!'", (org.databene.jdbacl.model.DBTable)var24, var41);
    org.databene.jdbacl.model.DefaultDBTable var45 = new org.databene.jdbacl.model.DefaultDBTable();
    var45.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var48 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var49 = var48.getForeignKeyConstraints();
    var45.addReferrer((org.databene.jdbacl.model.DBTable)var48);
    org.databene.jdbacl.model.DBDataType var53 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var54 = var53.isAlpha();
    java.lang.String var55 = var53.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var56 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var59 = var56.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var61 = var56.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var62 = var53.equals((java.lang.Object)var61);
    org.databene.jdbacl.model.DefaultDBColumn var65 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var48, var53, (java.lang.Integer)0, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DBDataType var68 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var69 = var68.isTemporal();
    boolean var70 = var53.equals((java.lang.Object)var68);
    org.databene.jdbacl.model.DefaultDBColumn var73 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.", (org.databene.jdbacl.model.DBTable)var24, var53, (java.lang.Integer)1, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DefaultDBColumn var76 = new org.databene.jdbacl.model.DefaultDBColumn("call next value for SET GENERATOR org.databene.jdbacl.SQLScriptException: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1:  as null[DROP SEQUENCE ] on DROP SEQUENCE NOT drop generator sequence ~ 'hi!' RESTRICT identity by primary key. = null[DROP SEQUENCE ].DROP SEQUENCE  TO -1 NOT REGEXP 'drop generator drop generator .'", (org.databene.jdbacl.model.DBTable)var1, var53, (java.lang.Integer)14, (java.lang.Integer)(-1));
    var76.setVersionColumn(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi! as 10 on . = 10."+ "'", var14.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "."+ "'", var15.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "SELECT * FROM null WHERE  = 'CREATE GENERATOR '"+ "'", var18.equals("SELECT * FROM null WHERE  = 'CREATE GENERATOR '"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi! as 10 on . = 10."+ "'", var37.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "DROP SEQUENCE "+ "'", var55.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var61.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == true);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test150");


    org.databene.jdbacl.model.DefaultDBTable var3 = new org.databene.jdbacl.model.DefaultDBTable();
    var3.setDoc(".");
    java.util.Set var7 = var3.getUniqueConstraints(false);
    org.databene.jdbacl.model.DBDataType var10 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var11 = var10.isAlpha();
    boolean var12 = var10.isLOB();
    org.databene.jdbacl.model.DefaultDBColumn var15 = new org.databene.jdbacl.model.DefaultDBColumn("NOT drop generator sequence ~ 'hi!'", (org.databene.jdbacl.model.DBTable)var3, var10, (java.lang.Integer)100, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.TableContainer var18 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var19 = var18.getTables();
    org.databene.jdbacl.model.TableContainer var20 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var18);
    org.databene.jdbacl.model.DefaultDBTable var21 = new org.databene.jdbacl.model.DefaultDBTable();
    var21.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var24 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var25 = var24.getForeignKeyConstraints();
    var21.addReferrer((org.databene.jdbacl.model.DBTable)var24);
    var18.addTable((org.databene.jdbacl.model.DBTable)var24);
    var15.setTable((org.databene.jdbacl.model.DBTable)var24);
    org.databene.jdbacl.dialect.DerbyDialect var32 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var34 = var32.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var35 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var36 = var35.getName();
    java.lang.String var37 = var32.formatValue((java.lang.Object)var35);
    var35.setName("'hi!'");
    java.util.List var40 = var35.getSchemas();
    org.databene.jdbacl.model.DBSchema var41 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var35);
    org.databene.jdbacl.model.DBTrigger var42 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var41);
    java.lang.String var43 = var41.getName();
    org.databene.jdbacl.model.DefaultDBTable var44 = new org.databene.jdbacl.model.DefaultDBTable("drop sequence 10", var41);
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
    java.lang.String[] var87 = var86.getForeignKeyColumnNames();
    var44.removeForeignKeyConstraint(var86);
    java.lang.String[] var89 = var44.getColumnNames();
    org.databene.jdbacl.model.DBNonUniqueIndex var90 = new org.databene.jdbacl.model.DBNonUniqueIndex("SET GENERATOR catalog TO -2", false, (org.databene.jdbacl.model.DBTable)var24, var89);
    boolean var91 = var90.isUnique();
    boolean var92 = var90.isUnique();
    boolean var93 = var90.isUnique();
    boolean var94 = var90.isUnique();
    boolean var95 = var90.isUnique();
    java.lang.String[] var96 = var90.getColumnNames();
    boolean var97 = var90.isUnique();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")"+ "'", var43.equals("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")"));
    
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
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == false);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test151");


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
    org.databene.jdbacl.dialect.DerbyDialect var17 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var19 = var17.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var20 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var21 = var20.getName();
    java.lang.String var22 = var17.formatValue((java.lang.Object)var20);
    var20.setName("'hi!'");
    java.util.List var25 = var20.getSchemas();
    org.databene.jdbacl.model.DBSchema var26 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var20);
    org.databene.jdbacl.model.DBTrigger var27 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var26);
    java.lang.String var28 = var26.getName();
    org.databene.jdbacl.model.DefaultDBTable var29 = new org.databene.jdbacl.model.DefaultDBTable("drop sequence 10", var26);
    org.databene.jdbacl.model.DefaultDBTable var32 = new org.databene.jdbacl.model.DefaultDBTable();
    var32.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var35 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var36 = var35.getForeignKeyConstraints();
    var32.addReferrer((org.databene.jdbacl.model.DBTable)var35);
    java.lang.String[] var43 = new java.lang.String[] { "select next value for 10"};
    org.databene.jdbacl.identity.UniqueKeyIdentity var44 = new org.databene.jdbacl.identity.UniqueKeyIdentity("CREATE SEQUENCE 10", var43);
    org.databene.jdbacl.model.DefaultDBTable var48 = new org.databene.jdbacl.model.DefaultDBTable();
    var48.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var51 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var52 = var51.getForeignKeyConstraints();
    var48.addReferrer((org.databene.jdbacl.model.DBTable)var51);
    java.lang.String[] var59 = new java.lang.String[] { ""};
    java.lang.String[] var63 = new java.lang.String[] { ""};
    java.lang.String var64 = org.databene.jdbacl.SQLUtil.join("", "", var59, "hi!", "10", var63);
    org.databene.jdbacl.model.DBUniqueConstraint var65 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var51, "select nextval('')", false, var59);
    var51.setDoc("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT");
    java.lang.String[] var70 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var71 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var70);
    org.databene.jdbacl.model.DBUniqueConstraint var72 = var51.getUniqueConstraint(var70);
    org.databene.jdbacl.identity.UniqueKeyIdentity var73 = new org.databene.jdbacl.identity.UniqueKeyIdentity("select next value for SET GENERATOR.TO - 1", var70);
    java.lang.String var74 = org.databene.jdbacl.SQLUtil.leftJoin("jdbc:h2:mem:select next value for 10", var43, "VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).)", "drop sequence alter sequence hi! restart with 1", var70);
    org.databene.jdbacl.model.DBUniqueConstraint var75 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var32, "drop sequence jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", false, var43);
    org.databene.jdbacl.model.DBUniqueIndex var76 = new org.databene.jdbacl.model.DBUniqueIndex("VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) = \"sequence\"", false, var75);
    var76.addColumnName("alter sequence CREATE SEQUENCE DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1. restart with 1");
    var29.addIndex((org.databene.jdbacl.model.DBIndex)var76);
    java.lang.String var80 = var76.toString();
    org.databene.jdbacl.model.DBTable var81 = var76.getTable();
    java.lang.String var82 = var76.toString();
    var12.removeIndex((org.databene.jdbacl.model.DBIndex)var76);
    java.lang.String[] var84 = var12.getColumnNames();
    java.util.List var85 = var12.getComponents();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")"+ "'", var28.equals("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "hi! as 10 on . = 10."+ "'", var64.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var71.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "left join VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) as drop sequence alter sequence hi! restart with 1 on jdbc:h2:mem:select next value for 10.select next value for 10 = drop sequence alter sequence hi! restart with 1.DROP SEQUENCE "+ "'", var74.equals("left join VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) as drop sequence alter sequence hi! restart with 1 on jdbc:h2:mem:select next value for 10.select next value for 10 = drop sequence alter sequence hi! restart with 1.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) = \"sequence\" (select next value for 10, alter sequence CREATE SEQUENCE DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1. restart with 1) unique"+ "'", var80.equals("VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) = \"sequence\" (select next value for 10, alter sequence CREATE SEQUENCE DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1. restart with 1) unique"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + "VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) = \"sequence\" (select next value for 10, alter sequence CREATE SEQUENCE DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1. restart with 1) unique"+ "'", var82.equals("VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) = \"sequence\" (select next value for 10, alter sequence CREATE SEQUENCE DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1. restart with 1) unique"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test152");


    org.databene.jdbacl.dialect.DerbyDialect var0 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var2 = var0.isDeterministicPKName("hi! as 10 on . = 10.");
    boolean var5 = var0.isDefaultCatalog("", ".");
    boolean var7 = var0.isDeterministicIndexName("NOT REGEXP_MATCHES(DROP SEQUENCE EQUEN RESTRICT, 'DROP SEQUENCE CREATE GENERATOR  RESTRICT')");
    boolean var10 = var0.isDefaultCatalog("CONSTRAINT \"jdbc:h2:mem:select next value for 10\" ", "drop generator CREATE GENERATOR 10.NOT drop generator sequence ~ 'hi!'");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test153");


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
    org.databene.jdbacl.ResultSetConverter var81 = new org.databene.jdbacl.ResultSetConverter(var78, false);
    boolean var82 = var81.isThreadSafe();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test154");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mLE();
    var10.mT__111();
    org.databene.jdbacl.sql.parser.SQLLexer var17 = new org.databene.jdbacl.sql.parser.SQLLexer();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var19 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var19.release((-1));
    boolean var23 = var17.mismatchIsUnwantedToken((org.antlr.runtime.IntStream)var19, 0);
    int var24 = var17.getRuleMemoizationCacheSize();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var26 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var26.release((-1));
    var17.consumeUntil((org.antlr.runtime.IntStream)var26, 14);
    boolean var32 = var10.mismatchIsUnwantedToken((org.antlr.runtime.IntStream)var26, 3);
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var34 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("No identity defined for table DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT");
    java.lang.String var35 = var34.getSourceName();
    int var36 = var34.index();
    var10.matchAny((org.antlr.runtime.IntStream)var34);
    java.lang.String var38 = var34.getText();
    int var40 = var34.LT(76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "No identity defined for table DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT"+ "'", var38.equals("No identity defined for table DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 32);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test155");


    org.databene.jdbacl.model.DBSequence var4 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    java.lang.String var5 = var4.dropDDL();
    java.math.BigInteger var6 = var4.getIncrementIfNotDefault();
    java.math.BigInteger var7 = var4.getMinValue();
    java.math.BigInteger var8 = var4.getMinValue();
    java.lang.Boolean var9 = var4.isOrder();
    org.databene.jdbacl.model.TableContainer var15 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var16 = var15.getTables();
    org.databene.jdbacl.model.TableContainer var17 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var15);
    org.databene.jdbacl.model.DefaultDBTable var18 = new org.databene.jdbacl.model.DefaultDBTable();
    var18.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var21 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var22 = var21.getForeignKeyConstraints();
    var18.addReferrer((org.databene.jdbacl.model.DBTable)var21);
    var15.addTable((org.databene.jdbacl.model.DBTable)var21);
    java.lang.String[] var29 = new java.lang.String[] { ""};
    java.lang.String[] var33 = new java.lang.String[] { ""};
    java.lang.String var34 = org.databene.jdbacl.SQLUtil.join("", "", var29, "hi!", "10", var33);
    java.lang.String var35 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var29);
    org.databene.jdbacl.model.TableContainer var38 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var39 = var38.getTables();
    org.databene.jdbacl.model.TableContainer var40 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var38);
    org.databene.jdbacl.model.DefaultDBTable var41 = new org.databene.jdbacl.model.DefaultDBTable();
    var41.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var44 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var45 = var44.getForeignKeyConstraints();
    var41.addReferrer((org.databene.jdbacl.model.DBTable)var44);
    var38.addTable((org.databene.jdbacl.model.DBTable)var44);
    java.lang.String[] var50 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var51 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var50);
    org.databene.jdbacl.model.DBForeignKeyConstraint var52 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var21, var29, (org.databene.jdbacl.model.DBTable)var44, var50);
    java.lang.String[] var53 = var52.getRefereeColumnNames();
    java.lang.String[] var54 = var52.getForeignKeyColumnNames();
    org.databene.jdbacl.identity.UniqueKeyIdentity var55 = new org.databene.jdbacl.identity.UniqueKeyIdentity("DROP SEQUENCE  NOT REGEXP 'VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).)'", var54);
    boolean var56 = var4.equals((java.lang.Object)var54);
    org.databene.jdbacl.identity.IdentityProvider var57 = new org.databene.jdbacl.identity.IdentityProvider();
    org.databene.jdbacl.identity.NaturalPkIdentity var59 = new org.databene.jdbacl.identity.NaturalPkIdentity("hi!");
    java.lang.String var60 = var59.getName();
    var57.registerIdentity((org.databene.jdbacl.identity.IdentityModel)var59, "SET GENERATOR . TO -1");
    org.databene.jdbacl.identity.SubNkPkQueryIdentity var63 = new org.databene.jdbacl.identity.SubNkPkQueryIdentity("jdbc:hsqldb:mem:left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as CREATE GENERATOR  on jdbc:h2:mem:hi! as 10 on . = 10.-identity-..DROP SEQUENCE  = CREATE GENERATOR . REGEXP 'drop sequence '", var54, var57);
    org.databene.jdbacl.identity.xml.IdentityParseContext var64 = new org.databene.jdbacl.identity.xml.IdentityParseContext(var57);
    org.databene.jdbacl.identity.IdentityModel var67 = var57.getIdentity("'O'", false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.identity.IdentityModel var70 = var57.getIdentity("jdbc:h2:mem:hi! as 10 on . = 10.-identity-. DROP SEQUENCE (32,-1) NULL", true);
      fail("Expected exception of type org.databene.commons.ObjectNotFoundException");
    } catch (org.databene.commons.ObjectNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "drop sequence "+ "'", var5.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi! as 10 on . = 10."+ "'", var34.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "."+ "'", var35.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var51.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "hi!"+ "'", var60.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test156");


    org.databene.jdbacl.JDBCDriverInfo var0 = new org.databene.jdbacl.JDBCDriverInfo();
    java.lang.String var1 = var0.getDriverClass();
    java.lang.String var2 = var0.getId();
    var0.setDriverClass("DROP SEQUENCE (100,-1)");
    java.lang.String var5 = var0.getDownloadUrl();
    var0.setDriverClass("select next value for SET GENERATOR.TO - 1");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test157");


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
    org.databene.jdbacl.model.TableContainer var28 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var29 = var28.getTables();
    org.databene.jdbacl.model.TableContainer var30 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var28);
    org.databene.jdbacl.model.DefaultDBTable var31 = new org.databene.jdbacl.model.DefaultDBTable();
    var31.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var34 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var35 = var34.getForeignKeyConstraints();
    var31.addReferrer((org.databene.jdbacl.model.DBTable)var34);
    var28.addTable((org.databene.jdbacl.model.DBTable)var34);
    java.lang.String[] var42 = new java.lang.String[] { ""};
    java.lang.String[] var46 = new java.lang.String[] { ""};
    java.lang.String var47 = org.databene.jdbacl.SQLUtil.join("", "", var42, "hi!", "10", var46);
    java.lang.String var48 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var42);
    org.databene.jdbacl.model.TableContainer var51 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var52 = var51.getTables();
    org.databene.jdbacl.model.TableContainer var53 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var51);
    org.databene.jdbacl.model.DefaultDBTable var54 = new org.databene.jdbacl.model.DefaultDBTable();
    var54.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var57 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var58 = var57.getForeignKeyConstraints();
    var54.addReferrer((org.databene.jdbacl.model.DBTable)var57);
    var51.addTable((org.databene.jdbacl.model.DBTable)var57);
    java.lang.String[] var63 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var64 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var63);
    org.databene.jdbacl.model.DBForeignKeyConstraint var65 = new org.databene.jdbacl.model.DBForeignKeyConstraint("CREATE GENERATOR drop sequence ", true, (org.databene.jdbacl.model.DBTable)var34, var42, (org.databene.jdbacl.model.DBTable)var57, var63);
    org.databene.jdbacl.model.DefaultDBTable var67 = new org.databene.jdbacl.model.DefaultDBTable();
    var67.setDoc(".");
    java.util.Set var71 = var67.getUniqueConstraints(false);
    org.databene.jdbacl.model.DBDataType var74 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var75 = var74.isAlpha();
    boolean var76 = var74.isLOB();
    org.databene.jdbacl.model.DefaultDBColumn var79 = new org.databene.jdbacl.model.DefaultDBColumn("NOT drop generator sequence ~ 'hi!'", (org.databene.jdbacl.model.DBTable)var67, var74, (java.lang.Integer)100, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DefaultDBColumn var81 = new org.databene.jdbacl.model.DefaultDBColumn("CONSTRAINT \"select nextval('')\" ", (org.databene.jdbacl.model.DBTable)var34, var74, (java.lang.Integer)10);
    java.util.List var82 = var34.getComponents();
    boolean var83 = var12.isIdentical((org.databene.jdbacl.model.DBObject)var34);
    org.databene.jdbacl.model.DBRow var84 = new org.databene.jdbacl.model.DBRow((org.databene.jdbacl.model.DBTable)var34);
    java.lang.Object[] var85 = var84.getPKValues();
    
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
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi! as 10 on . = 10."+ "'", var47.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "."+ "'", var48.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var64.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test158");


    org.databene.jdbacl.JDBCDriverInfo var0 = new org.databene.jdbacl.JDBCDriverInfo();
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var7 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var7.setExcludeTables("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    boolean var10 = var0.equals((java.lang.Object)var7);
    java.lang.String var11 = var0.getDefaultPort();
    var0.setDriverClass("hi!");
    org.databene.jdbacl.dialect.FirebirdDialect var14 = new org.databene.jdbacl.dialect.FirebirdDialect();
    java.lang.String var17 = var14.renderSetSequenceValue(".", 0L);
    boolean var19 = var14.isDeterministicUKName("hi! identity by primary key");
    boolean var20 = var14.isSequenceBoundarySupported();
    java.lang.String var22 = var14.renderDropSequence(".");
    boolean var23 = var0.equals((java.lang.Object)".");
    java.lang.String var24 = var0.getId();
    java.lang.String var25 = var0.getDriverClass();
    java.lang.String var26 = var0.getDefaultDatabase();
    var0.setDefaultDatabase("select null.nextval from dual");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "SET GENERATOR . TO -1"+ "'", var17.equals("SET GENERATOR . TO -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "drop generator ."+ "'", var22.equals("drop generator ."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test159");


    java.io.File var1 = org.databene.jdbacl.model.cache.CachingDBImporter.getCacheFile("SET GENERATOR . TO -1");
    org.databene.jdbacl.model.xml.XMLModelExporter var3 = new org.databene.jdbacl.model.xml.XMLModelExporter(var1, "sequence");
    org.databene.jdbacl.model.xml.XMLModelExporter var4 = new org.databene.jdbacl.model.xml.XMLModelExporter(var1);
    org.databene.jdbacl.model.xml.XMLModelExporter var5 = new org.databene.jdbacl.model.xml.XMLModelExporter(var1);
    org.databene.jdbacl.model.xml.XMLModelImporter var6 = new org.databene.jdbacl.model.xml.XMLModelImporter(var1);
    org.databene.jdbacl.model.csv.CSVModelExporter var7 = new org.databene.jdbacl.model.csv.CSVModelExporter(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test160");


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
    java.util.List var19 = var16.getComponents();
    org.databene.jdbacl.model.DefaultDBTable var21 = new org.databene.jdbacl.model.DefaultDBTable();
    var21.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var24 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var25 = var24.getForeignKeyConstraints();
    var21.addReferrer((org.databene.jdbacl.model.DBTable)var24);
    org.databene.jdbacl.model.DBDataType var29 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var30 = var29.isAlpha();
    java.lang.String var31 = var29.getName();
    org.databene.jdbacl.dialect.Derby10_6Dialect var32 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var35 = var32.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var37 = var32.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var38 = var29.equals((java.lang.Object)var37);
    org.databene.jdbacl.model.DefaultDBColumn var41 = new org.databene.jdbacl.model.DefaultDBColumn("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.DBTable)var24, var29, (java.lang.Integer)0, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.DefaultDBTable var42 = new org.databene.jdbacl.model.DefaultDBTable();
    var42.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var45 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var46 = var45.getForeignKeyConstraints();
    var42.addReferrer((org.databene.jdbacl.model.DBTable)var45);
    var24.addReferrer((org.databene.jdbacl.model.DBTable)var42);
    var42.setDoc("hi!");
    var16.setOwner((org.databene.jdbacl.model.CompositeDBObject)var42);
    java.lang.String var52 = var42.getDoc();
    
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "DROP SEQUENCE "+ "'", var31.equals("DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var37.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test161");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mT__92();
    var10.mDROP_TABLE();
    var10.mT__124();
    var10.mGE();
    boolean var19 = var10.failed();
    var10.mT__82();
    var10.mT__73();
    var10.mT__124();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test162");


    org.databene.jdbacl.dialect.Derby10_6Dialect var0 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var3 = var0.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var5 = var0.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var6 = var0.supportsRegex();
    boolean var8 = var0.isDeterministicFKName("REGEXP_MATCHES(No identity defined for table DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT, 'alter sequence CREATE SEQUENCE 10 restart with 1')");
    java.lang.String var10 = var0.renderDropSequence("CREATE GENERATOR ");
    java.lang.String var12 = var0.renderFetchSequenceValue("REGEXP_LIKE(CONSTRAINT \"jdbc:h2:mem:select next value for 10\" PRIMARY KEY (), 'jdbc:h2:mem:hi! as 10 on . = 10.-identity-. DROP SEQUENCE (0,-1) NULL')");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var5.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "DROP SEQUENCE CREATE GENERATOR  RESTRICT"+ "'", var10.equals("DROP SEQUENCE CREATE GENERATOR  RESTRICT"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "VALUES (NEXT VALUE FOR REGEXP_LIKE(CONSTRAINT \"jdbc:h2:mem:select next value for 10\" PRIMARY KEY (), 'jdbc:h2:mem:hi! as 10 on . = 10.-identity-. DROP SEQUENCE (0,-1) NULL'))"+ "'", var12.equals("VALUES (NEXT VALUE FOR REGEXP_LIKE(CONSTRAINT \"jdbc:h2:mem:select next value for 10\" PRIMARY KEY (), 'jdbc:h2:mem:hi! as 10 on . = 10.-identity-. DROP SEQUENCE (0,-1) NULL'))"));

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test163");


    org.databene.jdbacl.sql.ColumnExpression var2 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var3 = var2.getValue();
    org.databene.jdbacl.dialect.HSQL2Dialect var4 = new org.databene.jdbacl.dialect.HSQL2Dialect();
    java.lang.String var6 = var4.renderFetchSequenceValue("'hi!'");
    var2.setValue("'hi!'");
    java.lang.Object var8 = var2.getValue();
    org.databene.jdbacl.sql.ColumnExpression var11 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var14 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var15 = var14.getValue();
    org.databene.jdbacl.sql.ColumnExpression var18 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var19 = var18.getValue();
    org.databene.jdbacl.sql.BetweenExpression var20 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var11, (org.databene.script.Expression)var14, (org.databene.script.Expression)var18);
    org.databene.jdbacl.sql.ColumnExpression var23 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var26 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var27 = var26.getValue();
    org.databene.jdbacl.sql.ColumnExpression var30 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var31 = var30.getValue();
    org.databene.jdbacl.sql.BetweenExpression var32 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var23, (org.databene.script.Expression)var26, (org.databene.script.Expression)var30);
    var20.addTerm((org.databene.script.Expression)var26);
    org.databene.jdbacl.sql.ColumnExpression var36 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var39 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var40 = var39.getValue();
    org.databene.jdbacl.sql.ColumnExpression var43 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var44 = var43.getValue();
    org.databene.jdbacl.sql.BetweenExpression var45 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var36, (org.databene.script.Expression)var39, (org.databene.script.Expression)var43);
    java.lang.Object var46 = var36.getValue();
    org.databene.jdbacl.sql.ColumnExpression var49 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var50 = var49.getValue();
    org.databene.jdbacl.dialect.HSQL2Dialect var51 = new org.databene.jdbacl.dialect.HSQL2Dialect();
    java.lang.String var53 = var51.renderFetchSequenceValue("'hi!'");
    var49.setValue("'hi!'");
    boolean var55 = var49.isConstant();
    org.databene.jdbacl.sql.ColumnExpression var58 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    boolean var59 = var58.isConstant();
    java.lang.Object var60 = var58.getValue();
    org.databene.jdbacl.sql.BetweenExpression var61 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var36, (org.databene.script.Expression)var49, (org.databene.script.Expression)var58);
    org.databene.jdbacl.sql.BetweenExpression var62 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var2, (org.databene.script.Expression)var20, (org.databene.script.Expression)var36);
    java.lang.String var63 = var2.toString();
    boolean var64 = var2.isQuoted();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "sequence"+ "'", var3.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "call next value for 'hi!'"+ "'", var6.equals("call next value for 'hi!'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "'hi!'"+ "'", var8.equals("'hi!'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "sequence"+ "'", var15.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "sequence"+ "'", var19.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "sequence"+ "'", var27.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "sequence"+ "'", var31.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "sequence"+ "'", var40.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "sequence"+ "'", var44.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "sequence"+ "'", var46.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "sequence"+ "'", var50.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "call next value for 'hi!'"+ "'", var53.equals("call next value for 'hi!'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "sequence"+ "'", var60.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "\"'hi!'\""+ "'", var63.equals("\"'hi!'\""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test164");


    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var1 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var1.setCharPositionInLine(1);
    int var4 = var1.getCharPositionInLine();
    var1.setCharPositionInLine(69);
    var1.setCharPositionInLine(1);
    int var9 = var1.getCharPositionInLine();
    int var11 = var1.LT(2);
    var1.setCharPositionInLine(46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 82);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test165");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mLE();
    var10.mT__111();
    var10.mSIZE();
    var10.mT__107();
    java.lang.String var19 = var10.getText();
    var10.mNULL();
    var10.mT__124();
    var10.mT__114();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "select next value for SET GENERATOR.TO - 1"+ "'", var19.equals("select next value for SET GENERATOR.TO - 1"));

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test166");


    org.databene.jdbacl.dialect.Derby10_6Dialect var0 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var3 = var0.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var5 = var0.renderFetchSequenceValue("hi! as 10 on . = 10.");
    boolean var6 = var0.isSequenceSupported();
    boolean var8 = var0.isDeterministicIndexName("alter sequence CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT restart with 1");
    boolean var10 = var0.isDeterministicUKName("DROP SEQUENCE DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1. RESTRICT");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var5.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test167");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mT__92();
    var10.mDROP_TABLE();
    java.lang.String var17 = var10.getText();
    var10.mT__95();
    var10.mIS();
    var10.mCOMMENT_TABLE();
    var10.mT__116();
    java.lang.String var22 = var10.getSourceName();
    var10.mDATE();
    var10.mT__68();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "select next value for SET GENERATOR.TO - 1"+ "'", var17.equals("select next value for SET GENERATOR.TO - 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test168");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    var0.mALTER_TABLE();
    java.lang.String var9 = var0.getGrammarFileName();
    var0.mDROP_TABLE();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "/Users/volker/Documents/databene/jdbacl/src/main/g/SQL.g"+ "'", var9.equals("/Users/volker/Documents/databene/jdbacl/src/main/g/SQL.g"));

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test169");


    org.databene.jdbacl.sql.ColumnExpression var4 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var7 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var8 = var7.getValue();
    org.databene.jdbacl.sql.ColumnExpression var11 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var12 = var11.getValue();
    org.databene.jdbacl.sql.BetweenExpression var13 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var4, (org.databene.script.Expression)var7, (org.databene.script.Expression)var11);
    org.databene.jdbacl.sql.ColumnExpression var16 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var19 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var20 = var19.getValue();
    org.databene.jdbacl.sql.ColumnExpression var23 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var24 = var23.getValue();
    org.databene.jdbacl.sql.BetweenExpression var25 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var16, (org.databene.script.Expression)var19, (org.databene.script.Expression)var23);
    org.databene.jdbacl.sql.ColumnExpression var28 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var31 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var32 = var31.getValue();
    org.databene.jdbacl.sql.ColumnExpression var35 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var36 = var35.getValue();
    org.databene.jdbacl.sql.BetweenExpression var37 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var28, (org.databene.script.Expression)var31, (org.databene.script.Expression)var35);
    org.databene.jdbacl.sql.BetweenExpression var38 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var11, (org.databene.script.Expression)var19, (org.databene.script.Expression)var31);
    org.databene.script.Expression[] var39 = new org.databene.script.Expression[] { var11};
    org.databene.jdbacl.sql.FunctionInvocation var40 = new org.databene.jdbacl.sql.FunctionInvocation("CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var39);
    org.databene.jdbacl.sql.FunctionInvocation var41 = new org.databene.jdbacl.sql.FunctionInvocation("jdbc:h2:mem:drop generator CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "sequence"+ "'", var8.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "sequence"+ "'", var12.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "sequence"+ "'", var20.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "sequence"+ "'", var24.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "sequence"+ "'", var32.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "sequence"+ "'", var36.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test170");


    org.databene.jdbacl.model.TableContainerSupport var0 = new org.databene.jdbacl.model.TableContainerSupport();
    java.util.List var2 = var0.getTables(true);
    org.databene.jdbacl.model.DBCatalog var4 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var5 = var4.getName();
    java.util.List var6 = var4.getComponents();
    java.util.List var7 = var0.getSequences(true, var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test171");


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
    java.lang.String var15 = var12.getTriggerType();
    var12.setTriggerType("org.firebirdsql.jdbc.FBDriver");
    java.lang.String var18 = org.databene.jdbacl.SQLUtil.ownerDotComponent((org.databene.jdbacl.model.DBObject)var12);
    var12.setWhenClause("org.databene.jdbacl.SQLScriptException: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1: ");
    java.lang.String var21 = var12.getTriggerType();
    java.lang.String var22 = var12.getActionType();
    
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
    assertTrue("'" + var18 + "' != '" + "(\"sequence\" BETWEEN \"sequence\" AND \"sequence\").hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT"+ "'", var18.equals("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\").hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "org.firebirdsql.jdbc.FBDriver"+ "'", var21.equals("org.firebirdsql.jdbc.FBDriver"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test172");


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
    java.util.List var46 = var22.getComponents();
    org.databene.jdbacl.model.DefaultDBTable var47 = new org.databene.jdbacl.model.DefaultDBTable();
    var47.setDoc(".");
    java.util.Set var51 = var47.getUniqueConstraints(false);
    java.lang.String var52 = var47.getDoc();
    var47.setDoc("VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).)");
    org.databene.jdbacl.JDBCConnectData var61 = new org.databene.jdbacl.JDBCConnectData("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)", "hi!", "hi!", "drop generator sequence", "'hi!'", "hi!");
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var62 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter(var61);
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var63 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter(var61);
    boolean var64 = var47.equals((java.lang.Object)var61);
    java.lang.String[] var65 = var47.getPKColumnNames();
    var22.addTable((org.databene.jdbacl.model.DBTable)var47);
    java.util.List var67 = var22.getPackages();
    
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
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "."+ "'", var52.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test173");


    org.databene.jdbacl.model.DefaultDBTable var2 = new org.databene.jdbacl.model.DefaultDBTable();
    var2.setDoc(".");
    java.util.Set var6 = var2.getUniqueConstraints(false);
    org.databene.jdbacl.model.DBDataType var9 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var10 = var9.isAlpha();
    boolean var11 = var9.isLOB();
    org.databene.jdbacl.model.DefaultDBColumn var14 = new org.databene.jdbacl.model.DefaultDBColumn("NOT drop generator sequence ~ 'hi!'", (org.databene.jdbacl.model.DBTable)var2, var9, (java.lang.Integer)100, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.TableContainer var17 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var18 = var17.getTables();
    org.databene.jdbacl.model.TableContainer var19 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var17);
    org.databene.jdbacl.model.DefaultDBTable var20 = new org.databene.jdbacl.model.DefaultDBTable();
    var20.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var23 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var24 = var23.getForeignKeyConstraints();
    var20.addReferrer((org.databene.jdbacl.model.DBTable)var23);
    var17.addTable((org.databene.jdbacl.model.DBTable)var23);
    var14.setTable((org.databene.jdbacl.model.DBTable)var23);
    java.util.Collection var28 = var23.getReferrers();
    org.databene.jdbacl.model.TableContainer var29 = new org.databene.jdbacl.model.TableContainer("select next value for SET GENERATOR.TO - 1 NOT REGEXP 'hi!'", (org.databene.jdbacl.model.CompositeDBObject)var23);
    org.databene.jdbacl.model.DefaultDBTable var30 = new org.databene.jdbacl.model.DefaultDBTable();
    var30.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var33 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var34 = var33.getForeignKeyConstraints();
    var30.addReferrer((org.databene.jdbacl.model.DBTable)var33);
    java.lang.String[] var41 = new java.lang.String[] { ""};
    java.lang.String[] var45 = new java.lang.String[] { ""};
    java.lang.String var46 = org.databene.jdbacl.SQLUtil.join("", "", var41, "hi!", "10", var45);
    org.databene.jdbacl.model.DBUniqueConstraint var47 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var33, "select nextval('')", false, var41);
    var33.setDoc("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT");
    org.databene.jdbacl.JDBCDriverInfo var53 = new org.databene.jdbacl.JDBCDriverInfo();
    var53.setDriverClass("hi!");
    var53.setDefaultPort("CREATE SEQUENCE 10");
    var53.setDbSystem("SET GENERATOR . TO -1");
    java.lang.String var60 = var53.toString();
    org.databene.jdbacl.model.DefaultDBTable var62 = new org.databene.jdbacl.model.DefaultDBTable();
    var62.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var65 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var66 = var65.getForeignKeyConstraints();
    var62.addReferrer((org.databene.jdbacl.model.DBTable)var65);
    java.lang.String[] var73 = new java.lang.String[] { ""};
    java.lang.String[] var77 = new java.lang.String[] { ""};
    java.lang.String var78 = org.databene.jdbacl.SQLUtil.join("", "", var73, "hi!", "10", var77);
    org.databene.jdbacl.model.DBUniqueConstraint var79 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var65, "select nextval('')", false, var73);
    var65.setDoc("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT");
    java.lang.String[] var84 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var85 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var84);
    org.databene.jdbacl.model.DBUniqueConstraint var86 = var65.getUniqueConstraint(var84);
    org.databene.jdbacl.identity.UniqueKeyIdentity var87 = new org.databene.jdbacl.identity.UniqueKeyIdentity("select next value for SET GENERATOR.TO - 1", var84);
    var53.setJars(var84);
    org.databene.jdbacl.identity.UniqueKeyIdentity var89 = new org.databene.jdbacl.identity.UniqueKeyIdentity("NOT REGEXP_MATCHES(sequence, '')", var84);
    org.databene.jdbacl.model.DBUniqueConstraint var90 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var33, "CREATE SEQUENCE ", false, var84);
    org.databene.jdbacl.model.DBSchema var91 = var33.getSchema();
    var29.removeTable((org.databene.jdbacl.model.DBTable)var33);
    java.util.List var94 = var29.getSequences(true);
    org.databene.jdbacl.model.DBTable var96 = var29.getTable("CONSTRAINT \"hi! identity by primary key\" PRIMARY KEY () identity by primary key");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi! as 10 on . = 10."+ "'", var46.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "SET GENERATOR . TO -1"+ "'", var60.equals("SET GENERATOR . TO -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + "hi! as 10 on . = 10."+ "'", var78.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var85.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var96);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test174");


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
    var0.mALTER_TABLE();
    var0.emitErrorMessage("hi! as 10 on . = 10.");
    var0.mCREATE_TABLE();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test175");


    org.databene.jdbacl.dialect.FirebirdDialect var0 = new org.databene.jdbacl.dialect.FirebirdDialect();
    boolean var2 = var0.isDeterministicUKName("10");
    java.lang.String var4 = var0.renderDropSequence("sequence");
    boolean var7 = var0.isDefaultCatalog("drop sequence ", "call next value for 'hi!'");
    java.lang.String var9 = var0.renderCreateSequence("drop sequence call next value for CONSTRAINT \"hi! identity by primary key\" PRIMARY KEY () ~ 'jdbc:h2:mem:hi! as 10 on . = 10.-identity-.' NOT REGEXP 'SET GENERATOR select nextval for  DROP SEQUENCE (0,-1) NULL from jdbc:h2:mem:hi! as 10 on . = 10.-identity- TO 0'");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "drop generator sequence"+ "'", var4.equals("drop generator sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "CREATE GENERATOR drop sequence call next value for CONSTRAINT \"hi! identity by primary key\" PRIMARY KEY () ~ 'jdbc:h2:mem:hi! as 10 on . = 10.-identity-.' NOT REGEXP 'SET GENERATOR select nextval for  DROP SEQUENCE (0,-1) NULL from jdbc:h2:mem:hi! as 10 on . = 10.-identity- TO 0'"+ "'", var9.equals("CREATE GENERATOR drop sequence call next value for CONSTRAINT \"hi! identity by primary key\" PRIMARY KEY () ~ 'jdbc:h2:mem:hi! as 10 on . = 10.-identity-.' NOT REGEXP 'SET GENERATOR select nextval for  DROP SEQUENCE (0,-1) NULL from jdbc:h2:mem:hi! as 10 on . = 10.-identity- TO 0'"));

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test176");


    org.databene.jdbacl.identity.InvalidIdentityDefinitionError var1 = new org.databene.jdbacl.identity.InvalidIdentityDefinitionError("column jdbc:h2:mem:hi! as 10 on . = 10.");
    org.databene.jdbacl.SQLScriptException var3 = new org.databene.jdbacl.SQLScriptException((java.lang.Throwable)var1, 14);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test177");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mLE();
    var10.mVARCHAR2();
    var10.mT__77();
    var10.mT__130();
    var10.mVARCHAR2();
    var10.mT__88();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test178");


    org.databene.jdbacl.model.DBCheckConstraint var4 = new org.databene.jdbacl.model.DBCheckConstraint("column", true, "call next value for select nextval(''alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP ''alter sequence hi! restart with 1'''')", "\"'hi!'\"");
    java.lang.String var5 = var4.getConditionText();
    java.lang.String var6 = var4.getConditionText();
    java.lang.String var7 = var4.getConditionText();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "\"'hi!'\""+ "'", var5.equals("\"'hi!'\""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "\"'hi!'\""+ "'", var6.equals("\"'hi!'\""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "\"'hi!'\""+ "'", var7.equals("\"'hi!'\""));

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test179");


    org.databene.jdbacl.JDBCDriverInfo var0 = new org.databene.jdbacl.JDBCDriverInfo();
    var0.setDriverClass("hi!");
    var0.setDownloadUrl("drop generator CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT");
    var0.setDbSystem("alter sequence hi! restart with 1");
    java.lang.String var7 = var0.getName();
    java.lang.String var8 = var0.getDefaultSchema();
    var0.setDbSystem("SET GENERATOR drop generator CREATE GENERATOR 10 TO 0");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test180");


    boolean var1 = org.databene.jdbacl.DBUtil.existsEnvironment("jdbc:hsqldb:mem:left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as CREATE GENERATOR  on jdbc:h2:mem:hi! as 10 on . = 10.-identity-..DROP SEQUENCE  = CREATE GENERATOR . REGEXP 'drop sequence '");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test181");


    org.databene.jdbacl.JDBCDriverInfo var0 = new org.databene.jdbacl.JDBCDriverInfo();
    var0.setDriverClass("hi!");
    java.lang.String var3 = var0.getUrlPattern();
    java.lang.String var4 = var0.toString();
    var0.setDbSystem("select nextval for CREATE SEQUENCE call next value for 'hi!' MAXVALUE 1 from sysibm.sysdummy1");
    java.lang.String var7 = var0.toString();
    var0.setUrlPattern("CONSTRAINT \"alter sequence drop sequence 10 restart with 0\" PRIMARY KEY (, sequence)");
    java.lang.String var10 = var0.getDefaultSchema();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "select nextval for CREATE SEQUENCE call next value for 'hi!' MAXVALUE 1 from sysibm.sysdummy1"+ "'", var7.equals("select nextval for CREATE SEQUENCE call next value for 'hi!' MAXVALUE 1 from sysibm.sysdummy1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test182");


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
    org.databene.jdbacl.model.DefaultDBTable var71 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var72 = var71.getForeignKeyConstraints();
    var71.setDoc("drop sequence ");
    java.lang.String[] var79 = new java.lang.String[] { ""};
    java.lang.String[] var83 = new java.lang.String[] { ""};
    java.lang.String var84 = org.databene.jdbacl.SQLUtil.join("", "", var79, "hi!", "10", var83);
    java.lang.String var85 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var83);
    java.lang.Object[] var87 = org.databene.jdbacl.SQLUtil.parseColumnTypeAndSize("CREATE GENERATOR ");
    java.lang.String var88 = org.databene.jdbacl.SQLUtil.renderQuery((org.databene.jdbacl.model.DBTable)var71, var83, var87);
    int var89 = var71.countProviders();
    var41.setTable((org.databene.jdbacl.model.DBTable)var71);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + "hi! as 10 on . = 10."+ "'", var84.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + "."+ "'", var85.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var88 + "' != '" + "SELECT * FROM null WHERE  = 'CREATE GENERATOR '"+ "'", var88.equals("SELECT * FROM null WHERE  = 'CREATE GENERATOR '"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == 0);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test183");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mLE();
    var10.mT__99();
    var10.mLE();
    var10.mSLASH();
    var10.mT__93();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test184");


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
    java.util.List var19 = var14.getSequences(false);
    org.databene.jdbacl.dialect.DerbyDialect var21 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var23 = var21.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var24 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var25 = var24.getName();
    java.lang.String var26 = var21.formatValue((java.lang.Object)var24);
    var24.setName("'hi!'");
    java.util.List var29 = var24.getSchemas();
    org.databene.jdbacl.model.DBSchema var30 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var24);
    org.databene.jdbacl.dialect.DerbyDialect var33 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var35 = var33.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var36 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var37 = var36.getName();
    java.lang.String var38 = var33.formatValue((java.lang.Object)var36);
    var36.setName("'hi!'");
    java.util.List var41 = var36.getSchemas();
    org.databene.jdbacl.model.DBSchema var42 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var36);
    org.databene.jdbacl.model.DBTrigger var43 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var42);
    var30.addTrigger(var43);
    var43.setStatus("alter sequence drop generator sequence restart with 100");
    java.lang.String var47 = var43.getColumnName();
    var43.setWhenClause("DROP SEQUENCE -1 RESTRICT");
    var43.setTriggeringEvent("SELECT * FROM null WHERE  = ''");
    var43.setReferencingNames("REGEXP_MATCHES(CONSTRAINT \"select nextval('')\" , 'CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).')");
    var43.setTableName("NO_ACTION");
    var14.addTrigger(var43);
    
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test185");


    org.databene.jdbacl.dialect.FirebirdDialect var0 = new org.databene.jdbacl.dialect.FirebirdDialect();
    boolean var2 = var0.isDeterministicUKName("10");
    boolean var3 = var0.isSequenceSupported();
    java.lang.String var5 = var0.renderDropSequence("CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT");
    java.lang.String var6 = var0.getJDBCDriverClass();
    boolean var8 = var0.isDeterministicIndexName("DROP SEQUENCE null.jdbc:h2:mem:hi! as 10 on . = 10.-identity-. RESTRICT");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "drop generator CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT"+ "'", var5.equals("drop generator CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.firebirdsql.jdbc.FBDriver"+ "'", var6.equals("org.firebirdsql.jdbc.FBDriver"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test186");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mLE();
    var10.mT__99();
    var10.mXOR();
    var10.mALTER_TABLE();
    var10.mT__134();
    var10.mT__111();
    java.lang.String var21 = var10.getText();
    boolean var22 = var10.failed();
    var10.mTABLE_DETAILS();
    java.lang.String var24 = var10.getGrammarFileName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "select next value for SET GENERATOR.TO - 1"+ "'", var21.equals("select next value for SET GENERATOR.TO - 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "/Users/volker/Documents/databene/jdbacl/src/main/g/SQL.g"+ "'", var24.equals("/Users/volker/Documents/databene/jdbacl/src/main/g/SQL.g"));

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test187");


    org.databene.jdbacl.dialect.DB2Dialect var0 = new org.databene.jdbacl.dialect.DB2Dialect();
    boolean var2 = var0.isDeterministicUKName("alter sequence CONSTRAINT \"select nextval('')\" UNIQUE () restart with -1");
    boolean var4 = var0.isDeterministicPKName("NaturalPkIdentity(hi!)");
    boolean var6 = var0.isDeterministicPKName("SET GENERATOR Sub identity of ():\nnull TO -1");
    boolean var8 = var0.isDeterministicIndexName("10");
    org.databene.jdbacl.model.DBCatalog var11 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var12 = var11.getName();
    org.databene.jdbacl.model.Database var13 = var11.getDatabase();
    java.lang.String var14 = var11.getDoc();
    java.util.List var15 = var11.getSequences();
    org.databene.jdbacl.dialect.DerbyDialect var18 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var20 = var18.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var21 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var22 = var21.getName();
    java.lang.String var23 = var18.formatValue((java.lang.Object)var21);
    var21.setName("'hi!'");
    java.util.List var26 = var21.getSchemas();
    org.databene.jdbacl.model.DBSchema var27 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var21);
    org.databene.jdbacl.model.DBTrigger var28 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var27);
    org.databene.jdbacl.dialect.DerbyDialect var29 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var31 = var29.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var32 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var33 = var32.getName();
    java.lang.String var34 = var29.formatValue((java.lang.Object)var32);
    java.util.List var35 = var32.getComponents();
    var27.setCatalog(var32);
    var11.removeSchema(var27);
    org.databene.jdbacl.model.DefaultDBTable var39 = new org.databene.jdbacl.model.DefaultDBTable("select next value for SET GENERATOR . TO -1");
    var27.removeTable((org.databene.jdbacl.model.DBTable)var39);
    org.databene.jdbacl.model.DefaultDBTable var43 = new org.databene.jdbacl.model.DefaultDBTable();
    var43.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var46 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var47 = var46.getForeignKeyConstraints();
    var43.addReferrer((org.databene.jdbacl.model.DBTable)var46);
    java.lang.String[] var54 = new java.lang.String[] { ""};
    java.lang.String[] var58 = new java.lang.String[] { ""};
    java.lang.String var59 = org.databene.jdbacl.SQLUtil.join("", "", var54, "hi!", "10", var58);
    org.databene.jdbacl.model.DBUniqueConstraint var60 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var46, "select nextval('')", false, var54);
    java.lang.String var61 = var60.toString();
    boolean var62 = var60.isNameDeterministic();
    var60.setDoc("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT");
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var73 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.", "select next value for SET GENERATOR . TO -1", "DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.", "jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", "10", "hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", "select next value for SET GENERATOR . TO -1", false);
    var73.setSchemaName("alter sequence hi! restart with 1");
    boolean var76 = var60.equals((java.lang.Object)var73);
    org.databene.jdbacl.model.DBTable var77 = var60.getTable();
    var60.addColumnName("Sub identity of ():\nnull");
    org.databene.jdbacl.model.DBTable var80 = var60.getTable();
    org.databene.jdbacl.model.DBUniqueIndex var81 = new org.databene.jdbacl.model.DBUniqueIndex("SET GENERATOR alter sequence CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT restart with 1 TO -2", true, var60);
    var39.addIndex((org.databene.jdbacl.model.DBIndex)var81);
    java.lang.String[] var83 = var81.getColumnNames();
    java.lang.String var84 = var0.renderCase("jdbc:h2:mem:select next value for 10.", "select gen_id(CONSTRAINT \"select nextval('')\" UNIQUE () DROP SEQUENCE (100) NULL, 1) from RDB$DATABASE;", var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "hi! as 10 on . = 10."+ "'", var59.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "CONSTRAINT \"select nextval('')\" UNIQUE ()"+ "'", var61.equals("CONSTRAINT \"select nextval('')\" UNIQUE ()"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + "CASE WHEN  THEN Sub identity of ():\nnull ELSE select gen_id(CONSTRAINT \"select nextval('')\" UNIQUE () DROP SEQUENCE (100) NULL, 1) from RDB$DATABASE; END AS jdbc:h2:mem:select next value for 10."+ "'", var84.equals("CASE WHEN  THEN Sub identity of ():\nnull ELSE select gen_id(CONSTRAINT \"select nextval('')\" UNIQUE () DROP SEQUENCE (100) NULL, 1) from RDB$DATABASE; END AS jdbc:h2:mem:select next value for 10."));

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test188");


    org.databene.jdbacl.model.DefaultDBTable var2 = new org.databene.jdbacl.model.DefaultDBTable();
    var2.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var5 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var6 = var5.getForeignKeyConstraints();
    var2.addReferrer((org.databene.jdbacl.model.DBTable)var5);
    java.lang.String[] var13 = new java.lang.String[] { ""};
    java.lang.String[] var17 = new java.lang.String[] { ""};
    java.lang.String var18 = org.databene.jdbacl.SQLUtil.join("", "", var13, "hi!", "10", var17);
    org.databene.jdbacl.model.DBUniqueConstraint var19 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var5, "select nextval('')", false, var13);
    java.lang.String var20 = var19.toString();
    boolean var21 = var19.isNameDeterministic();
    org.databene.jdbacl.model.DBUniqueIndex var22 = new org.databene.jdbacl.model.DBUniqueIndex("select next value for SET GENERATOR . TO -1", false, var19);
    java.lang.String[] var23 = var19.getColumnNames();
    var19.addColumnName("drop generator CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT");
    var19.addColumnName("alter sequence CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT restart with 1");
    var19.addColumnName("\"'hi!'\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi! as 10 on . = 10."+ "'", var18.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "CONSTRAINT \"select nextval('')\" UNIQUE ()"+ "'", var20.equals("CONSTRAINT \"select nextval('')\" UNIQUE ()"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test189");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mT__92();
    var10.mDROP_TABLE();
    var10.mDEFAULT();
    var10.mT__88();
    var10.mT__92();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test190");


    org.databene.jdbacl.dialect.OracleDialect var0 = new org.databene.jdbacl.dialect.OracleDialect();
    java.lang.String var4 = var0.regexQuery("drop sequence alter sequence hi! restart with 1", true, "CREATE GENERATOR DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.");
    boolean var6 = var0.isDeterministicFKName("\"sequence\"");
    java.lang.String var10 = var0.regexQuery("select alter sequence drop sequence 10 restart with 0.nextval from dual", false, "CONSTRAINT \"hi! identity by primary key\" ");
    boolean var12 = var0.isDeterministicPKName("alter sequence CONSTRAINT \"select nextval('')\" UNIQUE () restart with -1");
    boolean var14 = var0.isDeterministicCheckName("hi! as 10 on . = 10..NOT drop generator sequence ~ 'hi!', hi! as 10 on . = 10..alter sequence CREATE GENERATOR drop sequence  restart with -1");
    boolean var15 = var0.supportsRegex();
    java.lang.String var19 = var0.regexQuery("CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", false, "DROP SEQUENCE (100)");
    boolean var21 = var0.isDeterministicPKName("select next value for ()");
    boolean var23 = var0.isDeterministicIndexName("CONSTRAINT \"select nextval('')\" UNIQUE () DROP SEQUENCE (100) NULL");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "NOT REGEXP_LIKE(drop sequence alter sequence hi! restart with 1, 'CREATE GENERATOR DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.')"+ "'", var4.equals("NOT REGEXP_LIKE(drop sequence alter sequence hi! restart with 1, 'CREATE GENERATOR DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.')"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "REGEXP_LIKE(select alter sequence drop sequence 10 restart with 0.nextval from dual, 'CONSTRAINT \"hi! identity by primary key\" ')"+ "'", var10.equals("REGEXP_LIKE(select alter sequence drop sequence 10 restart with 0.nextval from dual, 'CONSTRAINT \"hi! identity by primary key\" ')"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "REGEXP_LIKE(CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT, 'DROP SEQUENCE (100)')"+ "'", var19.equals("REGEXP_LIKE(CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT, 'DROP SEQUENCE (100)')"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test191");


    org.databene.jdbacl.dialect.DB2Dialect var0 = new org.databene.jdbacl.dialect.DB2Dialect();
    boolean var3 = var0.isDefaultSchema("CONSTRAINT \"hi! identity by primary key\" PRIMARY KEY () ~ 'jdbc:h2:mem:hi! as 10 on . = 10.-identity-.'", "select next value for jdbc:h2:mem:select next value for 10");
    java.lang.String var5 = var0.renderFetchSequenceValue("jdbc:h2:mem:hi! as 10 on . = 10.-identity-. DROP SEQUENCE (0,-1) NULL");
    boolean var7 = var0.isDeterministicPKName("drop generator CREATE GENERATOR 10.NOT drop generator sequence ~ 'hi!'");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "select nextval for  DROP SEQUENCE (0,-1) NULL from jdbc:h2:mem:hi! as 10 on . = 10.-identity-"+ "'", var5.equals("select nextval for  DROP SEQUENCE (0,-1) NULL from jdbc:h2:mem:hi! as 10 on . = 10.-identity-"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test192");


    java.lang.String var1 = org.databene.jdbacl.dialect.H2Util.getInMemoryURL("REGEXP_MATCHES(catalog, 'call next value for null[]')");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "jdbc:h2:mem:REGEXP_MATCHES(catalog, 'call next value for null[]')"+ "'", var1.equals("jdbc:h2:mem:REGEXP_MATCHES(catalog, 'call next value for null[]')"));

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test193");


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
    java.lang.String var65 = var59.getReferencingNames();
    java.lang.String var66 = var59.getTableOwner();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test194");


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
    java.lang.String[] var14 = var0.getTokenNames();
    var0.mT__123();
    java.util.List var16 = var0.getRuleInvocationStack();
    var0.mNAME_LIST();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test195");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var2 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var2.release((-1));
    boolean var6 = var0.mismatchIsUnwantedToken((org.antlr.runtime.IntStream)var2, 0);
    int var7 = var2.getLine();
    int var8 = var2.index();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test196");


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
    var36.setVersionColumn(false);
    
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

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test197");


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
    var23.setStatus("alter sequence drop generator sequence restart with 100");
    java.lang.String var27 = var23.getColumnName();
    var23.setWhenClause("DROP SEQUENCE -1 RESTRICT");
    java.lang.String var30 = var23.getStatus();
    var23.setTriggerBody("VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) = \"sequence\"");
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
    java.lang.String[] var75 = var74.getRefereeColumnNames();
    java.lang.String var76 = var74.toString();
    java.lang.String var77 = var74.toString();
    org.databene.jdbacl.model.DBTable var78 = var74.getRefereeTable();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var23.setOwner((org.databene.jdbacl.model.CompositeDBObject)var78);
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
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "alter sequence drop generator sequence restart with 100"+ "'", var30.equals("alter sequence drop generator sequence restart with 100"));
    
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
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )"+ "'", var76.equals("CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )"+ "'", var77.equals("CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test198");


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
    org.databene.jdbacl.identity.NaturalPkIdentity var81 = new org.databene.jdbacl.identity.NaturalPkIdentity("hi!");
    boolean var83 = var81.equals((java.lang.Object)(short)(-1));
    java.lang.String var84 = var81.toString();
    java.lang.String var85 = var81.getTableName();
    boolean var86 = var77.equals((java.lang.Object)var81);
    org.databene.jdbacl.model.DBTable var87 = var77.getTable();
    java.lang.String[] var88 = var77.getColumnNames();
    org.databene.jdbacl.model.CompositeDBObject var89 = var77.getOwner();
    java.lang.String[] var90 = var77.getColumnNames();
    
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
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + "NaturalPkIdentity(hi!)"+ "'", var84.equals("NaturalPkIdentity(hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + "hi!"+ "'", var85.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test199");


    org.databene.jdbacl.model.DefaultDBTable var0 = new org.databene.jdbacl.model.DefaultDBTable();
    var0.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var3 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var4 = var3.getForeignKeyConstraints();
    var0.addReferrer((org.databene.jdbacl.model.DBTable)var3);
    org.databene.jdbacl.model.DefaultDBTable var6 = new org.databene.jdbacl.model.DefaultDBTable();
    var6.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var9 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var10 = var9.getForeignKeyConstraints();
    var6.addReferrer((org.databene.jdbacl.model.DBTable)var9);
    java.lang.String[] var17 = new java.lang.String[] { ""};
    java.lang.String[] var21 = new java.lang.String[] { ""};
    java.lang.String var22 = org.databene.jdbacl.SQLUtil.join("", "", var17, "hi!", "10", var21);
    org.databene.jdbacl.model.DBUniqueConstraint var23 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var9, "select nextval('')", false, var17);
    java.lang.String[] var29 = new java.lang.String[] { ""};
    java.lang.String[] var33 = new java.lang.String[] { ""};
    java.lang.String var34 = org.databene.jdbacl.SQLUtil.join("", "", var29, "hi!", "10", var33);
    java.lang.String var35 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var29);
    java.lang.String[] var42 = new java.lang.String[] { ""};
    java.lang.String[] var46 = new java.lang.String[] { ""};
    java.lang.String var47 = org.databene.jdbacl.SQLUtil.join("", "", var42, "hi!", "10", var46);
    java.lang.String var48 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("", var46);
    java.lang.String var49 = org.databene.jdbacl.SQLUtil.leftJoin("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE ", var29, "jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1)", "drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)", var46);
    org.databene.jdbacl.identity.NaturalPkIdentity var51 = new org.databene.jdbacl.identity.NaturalPkIdentity("hi!");
    java.lang.String var52 = var51.getName();
    boolean var54 = var51.equals((java.lang.Object)(-1.0d));
    org.databene.jdbacl.model.DefaultDBTable var55 = new org.databene.jdbacl.model.DefaultDBTable();
    var55.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var58 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var59 = var58.getForeignKeyConstraints();
    var55.addReferrer((org.databene.jdbacl.model.DBTable)var58);
    java.lang.String[] var66 = new java.lang.String[] { ""};
    java.lang.String[] var70 = new java.lang.String[] { ""};
    java.lang.String var71 = org.databene.jdbacl.SQLUtil.join("", "", var66, "hi!", "10", var70);
    org.databene.jdbacl.model.DBUniqueConstraint var72 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var58, "select nextval('')", false, var66);
    java.lang.String var73 = var51.extractNK((java.lang.Object[])var66);
    java.lang.String var74 = org.databene.jdbacl.SQLUtil.renderQuery((org.databene.jdbacl.model.DBTable)var9, var29, (java.lang.Object[])var66);
    java.lang.String[] var80 = new java.lang.String[] { ""};
    java.lang.String[] var84 = new java.lang.String[] { ""};
    java.lang.String var85 = org.databene.jdbacl.SQLUtil.join("", "", var80, "hi!", "10", var84);
    org.databene.jdbacl.model.DBPrimaryKeyConstraint var86 = new org.databene.jdbacl.model.DBPrimaryKeyConstraint((org.databene.jdbacl.model.DBTable)var9, "jdbc:h2:mem:select next value for 10", false, var84);
    var0.setPrimaryKey(var86);
    java.lang.String var88 = var86.toString();
    java.lang.String var89 = org.databene.jdbacl.SQLUtil.ownerDotComponent((org.databene.jdbacl.model.DBObject)var86);
    var86.addColumnName("select next value for Identity definition by unique key: select next value for 10");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi! as 10 on . = 10."+ "'", var22.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi! as 10 on . = 10."+ "'", var34.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "."+ "'", var35.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi! as 10 on . = 10."+ "'", var47.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "."+ "'", var48.equals("."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)."+ "'", var49.equals("left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "hi! as 10 on . = 10."+ "'", var71.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + ""+ "'", var73.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "SELECT * FROM null WHERE  = ''"+ "'", var74.equals("SELECT * FROM null WHERE  = ''"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + "hi! as 10 on . = 10."+ "'", var85.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var88 + "' != '" + "CONSTRAINT \"jdbc:h2:mem:select next value for 10\" PRIMARY KEY ()"+ "'", var88.equals("CONSTRAINT \"jdbc:h2:mem:select next value for 10\" PRIMARY KEY ()"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var89 + "' != '" + "null.jdbc:h2:mem:select next value for 10"+ "'", var89.equals("null.jdbc:h2:mem:select next value for 10"));

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test200");


    org.databene.jdbacl.dialect.Derby10_6Dialect var0 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var3 = var0.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var5 = var0.renderFetchSequenceValue("hi! as 10 on . = 10.");
    org.databene.jdbacl.model.DBSequence var9 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var9.setName("10");
    java.math.BigInteger var12 = var9.getIncrement();
    java.lang.String var13 = var0.renderCreateSequence(var9);
    org.databene.jdbacl.model.DBSequence var17 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    java.lang.String var18 = var17.dropDDL();
    java.lang.String var19 = var0.renderCreateSequence(var17);
    boolean var22 = var0.isDefaultSchema("VALUES (NEXT VALUE FOR call next value for 'hi!')", "catalog null");
    java.lang.String var24 = var0.renderDropSequence("sequence 10");
    java.lang.String var26 = var0.renderDropSequence("select next value for SET GENERATOR . TO -1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var5.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT"+ "'", var13.equals("CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "drop sequence "+ "'", var18.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT"+ "'", var19.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "DROP SEQUENCE sequence 10 RESTRICT"+ "'", var24.equals("DROP SEQUENCE sequence 10 RESTRICT"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "DROP SEQUENCE select next value for SET GENERATOR . TO -1 RESTRICT"+ "'", var26.equals("DROP SEQUENCE select next value for SET GENERATOR . TO -1 RESTRICT"));

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test201");


    org.databene.jdbacl.model.jdbc.JDBCDBImporter var6 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var6.setImportingIndexes(true);
    org.databene.jdbacl.model.cache.CachingDBImporter var10 = new org.databene.jdbacl.model.cache.CachingDBImporter((org.databene.jdbacl.model.DBMetaDataImporter)var6, "hi! identity by primary key");
    org.databene.jdbacl.dialect.DerbyDialect var13 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var15 = var13.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var16 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var17 = var16.getName();
    java.lang.String var18 = var13.formatValue((java.lang.Object)var16);
    var16.setName("'hi!'");
    java.util.List var21 = var16.getSchemas();
    org.databene.jdbacl.model.DBSchema var22 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var16);
    org.databene.jdbacl.model.DBTrigger var23 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var22);
    org.databene.jdbacl.model.jdbc.LazyTable var26 = new org.databene.jdbacl.model.jdbc.LazyTable(var6, var22, "VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) = \"sequence\"", "DROP SEQUENCE NOT drop generator sequence ~ 'hi!' RESTRICT");
    java.lang.String var27 = var26.getName();
    java.lang.String var28 = var26.toString();
    org.databene.jdbacl.SQLScriptException var30 = new org.databene.jdbacl.SQLScriptException(1);
    org.databene.jdbacl.SQLScriptException var32 = var30.withUri("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT");
    org.databene.jdbacl.SQLScriptException var34 = new org.databene.jdbacl.SQLScriptException(1);
    var32.addSuppressed((java.lang.Throwable)var34);
    org.databene.jdbacl.SQLScriptException var38 = new org.databene.jdbacl.SQLScriptException((java.lang.Throwable)var32, "drop sequence ", (-1));
    org.databene.jdbacl.SQLScriptException var40 = var32.withUri("SELECT NEXT VALUE FOR SET GENERATOR.TO - 1 NOT REGEXP 'HI!'");
    org.databene.jdbacl.SQLScriptException var42 = new org.databene.jdbacl.SQLScriptException(1);
    java.lang.String var43 = var42.toString();
    org.databene.jdbacl.SQLScriptException var45 = new org.databene.jdbacl.SQLScriptException(1);
    org.databene.jdbacl.SQLScriptException var47 = var45.withUri("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT");
    org.databene.jdbacl.SQLScriptException var50 = new org.databene.jdbacl.SQLScriptException((java.lang.Throwable)var45, "CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", (-1));
    org.databene.jdbacl.SQLScriptException var53 = new org.databene.jdbacl.SQLScriptException((java.lang.Throwable)var50, "CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", 69);
    org.databene.jdbacl.SQLScriptException var55 = new org.databene.jdbacl.SQLScriptException(1);
    java.lang.String var56 = var55.toString();
    java.lang.String var57 = var55.toString();
    var50.addSuppressed((java.lang.Throwable)var55);
    var42.addSuppressed((java.lang.Throwable)var50);
    java.lang.String var60 = var50.toString();
    var40.addSuppressed((java.lang.Throwable)var50);
    boolean var62 = var26.equals((java.lang.Object)var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) = \"sequence\""+ "'", var27.equals("VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) = \"sequence\""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) = \"sequence\""+ "'", var28.equals("VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) = \"sequence\""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "org.databene.jdbacl.SQLScriptException: Error in execution of script line 1: "+ "'", var43.equals("org.databene.jdbacl.SQLScriptException: Error in execution of script line 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "org.databene.jdbacl.SQLScriptException: Error in execution of script line 1: "+ "'", var56.equals("org.databene.jdbacl.SQLScriptException: Error in execution of script line 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "org.databene.jdbacl.SQLScriptException: Error in execution of script line 1: "+ "'", var57.equals("org.databene.jdbacl.SQLScriptException: Error in execution of script line 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "org.databene.jdbacl.SQLScriptException: Error in execution of script CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT line -1: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1: "+ "'", var60.equals("org.databene.jdbacl.SQLScriptException: Error in execution of script CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT line -1: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test202");


    org.databene.jdbacl.sql.parser.SQLParser.inline_constraint_return var0 = new org.databene.jdbacl.sql.parser.SQLParser.inline_constraint_return();
    java.lang.Object var1 = var0.getTree();
    java.lang.Object var2 = var0.getTree();
    java.lang.Object var3 = var0.getTree();
    java.lang.Object var4 = var0.getTree();
    java.lang.Object var5 = var0.getTree();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test203");


    java.lang.String[] var4 = new java.lang.String[] { ""};
    java.lang.String[] var8 = new java.lang.String[] { ""};
    java.lang.String var9 = org.databene.jdbacl.SQLUtil.join("", "", var4, "hi!", "10", var8);
    org.databene.jdbacl.identity.IdentityProvider var10 = new org.databene.jdbacl.identity.IdentityProvider();
    org.databene.jdbacl.identity.SubNkPkQueryIdentity var11 = new org.databene.jdbacl.identity.SubNkPkQueryIdentity("null", var4, var10);
    var11.setSubNkPkQuery("null");
    var11.setSubNkPkQuery("DROP SEQUENCE  NOT REGEXP 'VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).)'");
    var11.addIrrelevantColumn("null.jdbc : h2 : mem : hi ! as 10 on.= 10.- identity -.");
    var11.setSubNkPkQuery("call next value for 'hi!'");
    java.lang.String var20 = var11.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi! as 10 on . = 10."+ "'", var9.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Sub identity of ():\ncall next value for 'hi!'"+ "'", var20.equals("Sub identity of ():\ncall next value for 'hi!'"));

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test204");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mT__92();
    var10.mDROP_TABLE();
    var10.mT__124();
    var10.mGE();
    var10.mT__137();
    var10.skip();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test205");


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
    org.databene.jdbacl.model.DBTable var45 = var41.getTable();
    org.databene.jdbacl.model.FKChangeRule var46 = var41.getUpdateRule();
    org.databene.jdbacl.model.FKChangeRule var47 = var41.getDeleteRule();
    
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
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test206");


    org.databene.jdbacl.model.jdbc.JDBCDBImporter var6 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("catalog", "jdbc:h2:mem:select next value for 10", "drop sequence ", "SET GENERATOR . TO -1", "drop sequence ", "DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT");
    var6.setImportingUKs(false);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test207");


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
    org.databene.script.Expression[] var83 = var36.getTerms();
    org.databene.jdbacl.sql.ColumnExpression var86 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    var36.addTerm((org.databene.script.Expression)var86);
    boolean var88 = var86.isQuoted();
    boolean var89 = var86.isConstant();
    
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
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == true);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test208");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mT__92();
    var10.mT__126();
    var10.mT__78();
    var10.mTABLE_DETAILS();
    var10.traceOut("alter sequence drop generator CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT restart with 0", 82, (java.lang.Object)"10");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test209");


    org.databene.jdbacl.dialect.PostgreSQLDialect var0 = new org.databene.jdbacl.dialect.PostgreSQLDialect();
    boolean var3 = var0.isDefaultCatalog("", "");
    java.lang.String var5 = var0.renderDropSequence("");
    boolean var7 = var0.isDeterministicFKName("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    java.lang.String var9 = var0.renderFetchSequenceValue("");
    java.lang.String var13 = var0.regexQuery("drop generator sequence", true, "hi!");
    boolean var15 = var0.isDeterministicPKName("left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).");
    boolean var17 = var0.isDeterministicFKName("SET GENERATOR . TO -1");
    boolean var19 = var0.isDeterministicPKName("DROP SEQUENCE select next value for SET GENERATOR.TO - 1 NOT REGEXP 'hi!' RESTRICT");
    boolean var20 = var0.supportsRegex();
    org.databene.jdbacl.dialect.Derby10_6Dialect var21 = new org.databene.jdbacl.dialect.Derby10_6Dialect();
    boolean var24 = var21.isDefaultCatalog("jdbc:h2:mem:hi! as 10 on . = 10.", "SET GENERATOR . TO -1");
    java.lang.String var26 = var21.renderFetchSequenceValue("hi! as 10 on . = 10.");
    org.databene.jdbacl.model.DBSequence var30 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var30.setName("10");
    java.math.BigInteger var33 = var30.getIncrement();
    java.lang.String var34 = var21.renderCreateSequence(var30);
    org.databene.jdbacl.model.DBSequence var38 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    java.lang.String var39 = var38.dropDDL();
    java.math.BigInteger var40 = var38.getMinValueIfNotDefault();
    java.lang.String var41 = var38.getSchemaName();
    org.databene.jdbacl.model.DBSequence var45 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    java.lang.String var46 = var45.dropDDL();
    java.math.BigInteger var47 = var45.getMinValueIfNotDefault();
    java.lang.String var48 = var45.getSchemaName();
    java.lang.Boolean var49 = var45.isOrder();
    org.databene.jdbacl.model.DBSequence var53 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    java.lang.String var54 = var53.dropDDL();
    java.math.BigInteger var55 = var53.getMinValueIfNotDefault();
    java.math.BigInteger var56 = var53.getLastNumber();
    var45.setIncrement(var56);
    var38.setMaxValue(var56);
    java.lang.String var59 = var21.renderCreateSequence(var38);
    org.databene.jdbacl.model.DBSequence var63 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var63.setName("10");
    java.math.BigInteger var66 = var63.getIncrement();
    org.databene.jdbacl.model.DBSequence var70 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    var70.setName("10");
    java.math.BigInteger var73 = var70.getIncrement();
    var63.setMaxValue(var73);
    var38.setStart(var73);
    java.math.BigInteger var76 = var38.getLastNumber();
    java.lang.String var77 = var0.renderCreateSequence(var38);
    java.lang.String var81 = var0.regexQuery("select gen_id('d', 1) from RDB$DATABASE;", false, "select next value for CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT MAXVALUE 0");
    boolean var83 = var0.isDeterministicIndexName("select nextval('select next value for SET GENERATOR . TO -1')");
    
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
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"+ "'", var26.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT"+ "'", var34.equals("CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "drop sequence "+ "'", var39.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi! as 10 on . = 10."+ "'", var41.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "drop sequence "+ "'", var46.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi! as 10 on . = 10."+ "'", var48.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "drop sequence "+ "'", var54.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT MAXVALUE 0"+ "'", var59.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT MAXVALUE 0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "CREATE SEQUENCE  MAXVALUE 0"+ "'", var77.equals("CREATE SEQUENCE  MAXVALUE 0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + "select gen_id('d', 1) from RDB$DATABASE; ~ 'select next value for CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT MAXVALUE 0'"+ "'", var81.equals("select gen_id('d', 1) from RDB$DATABASE; ~ 'select next value for CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT MAXVALUE 0'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == true);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test210");


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
    boolean var56 = var0.isDeterministicUKName("sequence");
    boolean var57 = var0.supportsRegex();
    boolean var59 = var0.isDeterministicIndexName("select next value for 10");
    
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
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test211");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.sql.Connection var5 = org.databene.jdbacl.DBUtil.connect("((\"sequence\" BETWEEN \"sequence\" AND \"sequence\"))|null", "select nextval('drop generator CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT')", "DROP SEQUENCE (100,-1) REGEXP 'DROP SEQUENCE (10,69)'", "drop generator DROP SEQUENCE NOT drop generator sequence ~ 'hi!' RESTRICT identity by primary key", true);
      fail("Expected exception of type org.databene.commons.ConnectFailedException");
    } catch (org.databene.commons.ConnectFailedException e) {
      // Expected exception.
    }

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test212");


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
    java.util.List var16 = var0.getSchemas();
    java.lang.String var17 = var0.getDoc();
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test214");


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
    java.lang.String var16 = var15.getDoc();
    java.util.List var17 = var15.getIndexes();
    int var18 = var15.countProviders();
    java.lang.String[] var19 = var15.getColumnNames();
    java.util.List var20 = var15.getComponents();
    
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
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test215");


    org.databene.jdbacl.dialect.DerbyDialect var0 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var2 = var0.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var3 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var4 = var3.getName();
    java.lang.String var5 = var0.formatValue((java.lang.Object)var3);
    java.lang.String var6 = var3.getObjectType();
    java.lang.String var7 = var3.getName();
    var3.setDoc("select hi! as 10 on . = 10..NOT drop generator sequence ~ 'hi!', hi! as 10 on . = 10..alter sequence CREATE GENERATOR drop sequence  restart with -1.nextval from dual");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "catalog"+ "'", var6.equals("catalog"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test216");


    org.databene.jdbacl.version.QueryVersionProvider var1 = new org.databene.jdbacl.version.QueryVersionProvider("NOT drop generator sequence ~ 'hi!'");
    java.lang.String var2 = var1.getQuery();
    var1.setQuery("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).DROP SEQUENCE ");
    java.lang.String var5 = var1.getQuery();
    var1.setQuery("CREATE SEQUENCE \"hi! as 10 on . = 10.\".\"\" CACHE 100NOORDER");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NOT drop generator sequence ~ 'hi!'"+ "'", var2.equals("NOT drop generator sequence ~ 'hi!'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).DROP SEQUENCE "+ "'", var5.equals("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).DROP SEQUENCE "));

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test217");


    org.databene.jdbacl.model.DBCatalog var1 = new org.databene.jdbacl.model.DBCatalog("\"sequence\"");
    org.databene.jdbacl.model.DBTable var4 = var1.getTable("CREATE SEQUENCE ", false);
    java.util.List var5 = var1.getTables();
    org.databene.jdbacl.model.DBSchema var7 = var1.getSchema("jdbc:h2:mem:CONSTRAINT \"hi! identity by primary key\" ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test218");


    java.io.File var1 = org.databene.jdbacl.model.cache.CachingDBImporter.getCacheFile("SET GENERATOR . TO -1");
    org.databene.jdbacl.model.xml.XMLModelImporter var2 = new org.databene.jdbacl.model.xml.XMLModelImporter(var1);
    org.databene.jdbacl.model.csv.CSVModelExporter var3 = new org.databene.jdbacl.model.csv.CSVModelExporter(var1);
    org.databene.jdbacl.model.csv.CSVModelExporter var4 = new org.databene.jdbacl.model.csv.CSVModelExporter(var1);
    org.databene.jdbacl.model.xml.XMLModelExporter var5 = new org.databene.jdbacl.model.xml.XMLModelExporter(var1);
    org.databene.jdbacl.model.sql.CreateExporter var6 = new org.databene.jdbacl.model.sql.CreateExporter(var1);
    org.databene.jdbacl.model.xml.XMLModelImporter var7 = new org.databene.jdbacl.model.xml.XMLModelImporter(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test219");


    java.lang.String[] var2 = new java.lang.String[] { "select next value for 10"};
    org.databene.jdbacl.identity.UniqueKeyIdentity var3 = new org.databene.jdbacl.identity.UniqueKeyIdentity("CREATE SEQUENCE 10", var2);
    var3.addIrrelevantColumn("CREATE GENERATOR drop sequence ");
    org.databene.jdbacl.sql.ColumnExpression var8 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var11 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var12 = var11.getValue();
    org.databene.jdbacl.sql.ColumnExpression var15 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var16 = var15.getValue();
    org.databene.jdbacl.sql.BetweenExpression var17 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var8, (org.databene.script.Expression)var11, (org.databene.script.Expression)var15);
    java.lang.Object var18 = var8.getValue();
    org.databene.jdbacl.sql.ColumnExpression var21 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var22 = var21.getValue();
    org.databene.jdbacl.dialect.HSQL2Dialect var23 = new org.databene.jdbacl.dialect.HSQL2Dialect();
    java.lang.String var25 = var23.renderFetchSequenceValue("'hi!'");
    var21.setValue("'hi!'");
    boolean var27 = var21.isConstant();
    org.databene.jdbacl.sql.ColumnExpression var30 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    boolean var31 = var30.isConstant();
    java.lang.Object var32 = var30.getValue();
    org.databene.jdbacl.sql.BetweenExpression var33 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var8, (org.databene.script.Expression)var21, (org.databene.script.Expression)var30);
    org.databene.script.Expression[] var34 = var33.getSourceExpressions();
    java.lang.String var35 = var3.extractNK((java.lang.Object[])var34);
    java.lang.String var36 = var3.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "sequence"+ "'", var12.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "sequence"+ "'", var16.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "sequence"+ "'", var18.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "sequence"+ "'", var22.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "call next value for 'hi!'"+ "'", var25.equals("call next value for 'hi!'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "sequence"+ "'", var32.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "\"sequence\""+ "'", var35.equals("\"sequence\""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "Identity definition by unique key: select next value for 10"+ "'", var36.equals("Identity definition by unique key: select next value for 10"));

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test220");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    var0.mCREATE_TABLE();
    var0.mCOMMENT_TABLE();
    var0.mCREATE_SEQUENCE();
    org.databene.jdbacl.sql.parser.SQLLexer var6 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var6.skip();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var9 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var11 = var9.LT(10);
    var6.setCharStream((org.antlr.runtime.CharStream)var9);
    org.databene.jdbacl.sql.parser.SQLLexer var13 = new org.databene.jdbacl.sql.parser.SQLLexer();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var15 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var15.release((-1));
    boolean var19 = var13.mismatchIsUnwantedToken((org.antlr.runtime.IntStream)var15, 0);
    var6.setCharStream((org.antlr.runtime.CharStream)var15);
    java.lang.String var21 = var15.getSourceName();
    var0.consumeUntil((org.antlr.runtime.IntStream)var15, 1);
    var15.release(10);
    java.lang.String var26 = var15.getText();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "DROP SEQUENCE "+ "'", var26.equals("DROP SEQUENCE "));

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test221");


    org.databene.jdbacl.JDBCConnectData var7 = new org.databene.jdbacl.JDBCConnectData("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)", "hi!", "hi!", "drop generator sequence", "'hi!'", "hi!");
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var8 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter(var7);
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var9 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter(var7);
    org.databene.jdbacl.model.DBCatalog var11 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var12 = var11.getName();
    org.databene.jdbacl.model.Database var13 = var11.getDatabase();
    java.lang.String var14 = var11.getDoc();
    org.databene.jdbacl.dialect.DerbyDialect var16 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var18 = var16.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var19 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var20 = var19.getName();
    java.lang.String var21 = var16.formatValue((java.lang.Object)var19);
    var19.setName("'hi!'");
    java.util.List var24 = var19.getSchemas();
    org.databene.jdbacl.model.DBSchema var25 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var19);
    var11.removeSchema(var25);
    java.util.List var28 = var25.getTables(false);
    org.databene.jdbacl.model.DefaultDBTable var29 = new org.databene.jdbacl.model.DefaultDBTable("drop generator .", var25);
    org.databene.jdbacl.model.jdbc.LazyTable var32 = new org.databene.jdbacl.model.jdbc.LazyTable(var9, var25, "drop generator CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE ", "select nextval('CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT')");
    org.databene.jdbacl.model.DBCatalog var33 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var34 = var33.getName();
    org.databene.jdbacl.model.Database var35 = var33.getDatabase();
    java.lang.String var36 = var33.getDoc();
    org.databene.jdbacl.dialect.DerbyDialect var38 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var40 = var38.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var41 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var42 = var41.getName();
    java.lang.String var43 = var38.formatValue((java.lang.Object)var41);
    var41.setName("'hi!'");
    java.util.List var46 = var41.getSchemas();
    org.databene.jdbacl.model.DBSchema var47 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var41);
    var33.removeSchema(var47);
    java.util.List var50 = var47.getSequences(true);
    org.databene.jdbacl.dialect.DerbyDialect var54 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var56 = var54.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var57 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var58 = var57.getName();
    java.lang.String var59 = var54.formatValue((java.lang.Object)var57);
    var57.setName("'hi!'");
    java.util.List var62 = var57.getSchemas();
    org.databene.jdbacl.model.DBSchema var63 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var57);
    org.databene.jdbacl.model.DBTrigger var64 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var63);
    java.util.List var65 = var63.getPackages();
    org.databene.jdbacl.model.DBPackage var66 = new org.databene.jdbacl.model.DBPackage("CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).", var63);
    java.util.List var67 = var66.getComponents();
    var47.addPackage(var66);
    java.lang.String var69 = var66.getSubObjectName();
    var25.addPackage(var66);
    org.databene.jdbacl.dialect.DerbyDialect var73 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var75 = var73.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var76 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var77 = var76.getName();
    java.lang.String var78 = var73.formatValue((java.lang.Object)var76);
    var76.setName("'hi!'");
    java.util.List var81 = var76.getSchemas();
    org.databene.jdbacl.model.DBSchema var82 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var76);
    org.databene.jdbacl.model.DefaultDBTable var83 = new org.databene.jdbacl.model.DefaultDBTable("select next value for 10", var82);
    var25.removeTable((org.databene.jdbacl.model.DBTable)var83);
    java.lang.String var85 = var25.getName();
    org.databene.jdbacl.model.DBTrigger var86 = new org.databene.jdbacl.model.DBTrigger("select nextval('alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP 'alter sequence hi! restart with 1'')", var25);
    java.lang.String var87 = var86.getTriggerBody();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + "(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")"+ "'", var85.equals("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var87);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test222");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var2 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    var2.release((-1));
    boolean var6 = var0.mismatchIsUnwantedToken((org.antlr.runtime.IntStream)var2, 0);
    int var7 = var0.getRuleMemoizationCacheSize();
    var0.mCOLUMN_SPEC();
    boolean var9 = var0.failed();
    var0.endResync();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var12 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).)");
    java.lang.String var13 = var12.getSourceName();
    int var14 = var12.size();
    var0.matchAny((org.antlr.runtime.IntStream)var12);
    int var16 = var12.index();
    org.databene.jdbacl.sql.parser.SQLLexer var17 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var12);
    var17.mORA_CONFIGS();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 309);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test223");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mT__92();
    var10.mDROP_TABLE();
    var10.mT__124();
    var10.mDROP_TABLE();
    int var19 = var10.getBacktrackingLevel();
    var10.mCOMMENT_COLUMN();
    var10.mT__122();
    var10.mT__101();
    var10.mBYTE();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test224");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mT__134();
    var10.mT__76();
    var10.mT__73();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test225");


    org.databene.jdbacl.dialect.DerbyDialect var1 = new org.databene.jdbacl.dialect.DerbyDialect(false);
    boolean var3 = var1.isDeterministicUKName("CONSTRAINT \"select nextval('')\" UNIQUE (, NaturalPkIdentity(hi!))");
    boolean var5 = var1.isDeterministicIndexName("VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).)");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test226");


    org.databene.jdbacl.dialect.HSQL2Dialect var0 = new org.databene.jdbacl.dialect.HSQL2Dialect();
    java.lang.String var3 = var0.renderSequenceValue("hi!", 1L);
    java.lang.String var7 = var0.regexQuery("sequence", true, "");
    java.lang.String var10 = var0.renderSequenceValue("drop sequence 10", 0L);
    boolean var12 = var0.isDeterministicIndexName("drop sequence 10");
    java.lang.String var16 = var0.regexQuery("No identity defined for table DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT", false, "alter sequence CREATE SEQUENCE 10 restart with 1");
    boolean var18 = var0.isDeterministicFKName("drop generator sequence");
    boolean var20 = var0.isDeterministicIndexName("db2");
    boolean var23 = var0.isDefaultSchema("CONSTRAINT hi! .", "alter sequence drop generator CREATE SEQUENCE hi ! as 10 on.= 10..10 AS BIGINT restart with 0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "alter sequence hi! restart with 1"+ "'", var3.equals("alter sequence hi! restart with 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "NOT REGEXP_MATCHES(sequence, '')"+ "'", var7.equals("NOT REGEXP_MATCHES(sequence, '')"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "alter sequence drop sequence 10 restart with 0"+ "'", var10.equals("alter sequence drop sequence 10 restart with 0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "REGEXP_MATCHES(No identity defined for table DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT, 'alter sequence CREATE SEQUENCE 10 restart with 1')"+ "'", var16.equals("REGEXP_MATCHES(No identity defined for table DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT, 'alter sequence CREATE SEQUENCE 10 restart with 1')"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test227");


    java.io.File var1 = org.databene.jdbacl.model.cache.CachingDBImporter.getCacheFile("SET GENERATOR . TO -1");
    org.databene.jdbacl.model.xml.XMLModelExporter var3 = new org.databene.jdbacl.model.xml.XMLModelExporter(var1, "(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")");
    org.databene.jdbacl.model.xml.XMLModelExporter var5 = new org.databene.jdbacl.model.xml.XMLModelExporter(var1, "jdbc:h2:mem:org.databene.jdbacl.SQLScriptException: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1: ");
    org.databene.jdbacl.model.csv.CSVModelExporter var6 = new org.databene.jdbacl.model.csv.CSVModelExporter(var1);
    org.databene.jdbacl.model.csv.CSVModelExporter var7 = new org.databene.jdbacl.model.csv.CSVModelExporter(var1);
    org.databene.jdbacl.model.xml.XMLModelImporter var8 = new org.databene.jdbacl.model.xml.XMLModelImporter(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test228");


    org.databene.jdbacl.sql.ColumnExpression var2 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var5 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var6 = var5.getValue();
    org.databene.jdbacl.sql.ColumnExpression var9 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var10 = var9.getValue();
    org.databene.jdbacl.sql.BetweenExpression var11 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var2, (org.databene.script.Expression)var5, (org.databene.script.Expression)var9);
    java.lang.Object var12 = var2.getValue();
    org.databene.jdbacl.sql.ColumnExpression var15 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var16 = var15.getValue();
    org.databene.jdbacl.dialect.HSQL2Dialect var17 = new org.databene.jdbacl.dialect.HSQL2Dialect();
    java.lang.String var19 = var17.renderFetchSequenceValue("'hi!'");
    var15.setValue("'hi!'");
    boolean var21 = var15.isConstant();
    org.databene.jdbacl.sql.ColumnExpression var24 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    boolean var25 = var24.isConstant();
    java.lang.Object var26 = var24.getValue();
    org.databene.jdbacl.sql.BetweenExpression var27 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var2, (org.databene.script.Expression)var15, (org.databene.script.Expression)var24);
    org.databene.jdbacl.sql.ColumnExpression var31 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var34 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var35 = var34.getValue();
    org.databene.jdbacl.sql.ColumnExpression var38 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var39 = var38.getValue();
    org.databene.jdbacl.sql.BetweenExpression var40 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var31, (org.databene.script.Expression)var34, (org.databene.script.Expression)var38);
    org.databene.jdbacl.sql.ColumnExpression var43 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var46 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var47 = var46.getValue();
    org.databene.jdbacl.sql.ColumnExpression var50 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var51 = var50.getValue();
    org.databene.jdbacl.sql.BetweenExpression var52 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var43, (org.databene.script.Expression)var46, (org.databene.script.Expression)var50);
    var40.addTerm((org.databene.script.Expression)var46);
    org.databene.script.Expression[] var54 = new org.databene.script.Expression[] { var40};
    org.databene.jdbacl.sql.FunctionInvocation var55 = new org.databene.jdbacl.sql.FunctionInvocation("alter sequence drop sequence 10 restart with 0", var54);
    java.lang.String var56 = var55.getFunctionName();
    org.databene.jdbacl.identity.xml.IdentityParseContext var57 = new org.databene.jdbacl.identity.xml.IdentityParseContext();
    org.databene.jdbacl.identity.xml.IdentityParser var58 = new org.databene.jdbacl.identity.xml.IdentityParser();
    var57.addParser((org.databene.webdecs.xml.XMLElementParser)var58);
    org.databene.jdbacl.identity.xml.IdentityParseContext var60 = new org.databene.jdbacl.identity.xml.IdentityParseContext();
    org.databene.jdbacl.identity.xml.IdentityParser var61 = new org.databene.jdbacl.identity.xml.IdentityParser();
    var60.addParser((org.databene.webdecs.xml.XMLElementParser)var61);
    var57.addParser((org.databene.webdecs.xml.XMLElementParser)var61);
    boolean var65 = var57.contains("drop sequence alter sequence hi! restart with 1");
    org.databene.jdbacl.identity.IdentityProvider var66 = var57.getIdentityProvider();
    java.lang.Object var67 = var55.evaluate((org.databene.commons.Context)var57);
    org.databene.jdbacl.sql.ColumnExpression var70 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var73 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var74 = var73.getValue();
    org.databene.jdbacl.sql.ColumnExpression var77 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var78 = var77.getValue();
    org.databene.jdbacl.sql.BetweenExpression var79 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var70, (org.databene.script.Expression)var73, (org.databene.script.Expression)var77);
    org.databene.jdbacl.identity.xml.IdentityParseContext var80 = new org.databene.jdbacl.identity.xml.IdentityParseContext();
    org.databene.jdbacl.identity.xml.IdentityParser var81 = new org.databene.jdbacl.identity.xml.IdentityParser();
    var80.addParser((org.databene.webdecs.xml.XMLElementParser)var81);
    java.lang.Boolean var83 = var79.evaluate((org.databene.commons.Context)var80);
    org.databene.jdbacl.identity.xml.IdentityParser var84 = new org.databene.jdbacl.identity.xml.IdentityParser();
    var80.addParser((org.databene.webdecs.xml.XMLElementParser)var84);
    var57.addParser((org.databene.webdecs.xml.XMLElementParser)var84);
    var57.set("drop sequence 10", (java.lang.Object)"CREATE SEQUENCE CONSTRAINT \"select nextval('')\" UNIQUE () DROP SEQUENCE (100) NULL");
    java.lang.Boolean var90 = var27.evaluate((org.databene.commons.Context)var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "sequence"+ "'", var6.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "sequence"+ "'", var10.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "sequence"+ "'", var12.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "sequence"+ "'", var16.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "call next value for 'hi!'"+ "'", var19.equals("call next value for 'hi!'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "sequence"+ "'", var26.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "sequence"+ "'", var35.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "sequence"+ "'", var39.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "sequence"+ "'", var47.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "sequence"+ "'", var51.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "alter sequence drop sequence 10 restart with 0"+ "'", var56.equals("alter sequence drop sequence 10 restart with 0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "sequence"+ "'", var74.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + "sequence"+ "'", var78.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var83 + "' != '" + true+ "'", var83.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var90 + "' != '" + true+ "'", var90.equals(true));

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test229");


    org.databene.jdbacl.dialect.HSQL2Dialect var0 = new org.databene.jdbacl.dialect.HSQL2Dialect();
    java.lang.String var2 = var0.renderFetchSequenceValue("'hi!'");
    boolean var3 = var0.supportsRegex();
    java.lang.String var6 = var0.renderSequenceValue("drop generator .", 10L);
    java.lang.String var8 = var0.renderFetchSequenceValue("CONSTRAINT \"hi! identity by primary key\" PRIMARY KEY ().");
    boolean var11 = var0.isDefaultSchema("call next value for DROP SEQUENCE select next value for SET GENERATOR.TO - 1 NOT REGEXP 'hi!' RESTRICT", "REGEXP_LIKE(CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT, 'DROP SEQUENCE (100)')");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "call next value for 'hi!'"+ "'", var2.equals("call next value for 'hi!'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "alter sequence drop generator . restart with 10"+ "'", var6.equals("alter sequence drop generator . restart with 10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "call next value for CONSTRAINT \"hi! identity by primary key\" PRIMARY KEY ()."+ "'", var8.equals("call next value for CONSTRAINT \"hi! identity by primary key\" PRIMARY KEY ()."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test230");


    org.databene.jdbacl.sql.parser.SQLParser.table_comment_details_return var0 = new org.databene.jdbacl.sql.parser.SQLParser.table_comment_details_return();
    java.lang.Object var1 = var0.getTree();
    java.lang.Object var2 = var0.getTree();
    java.lang.Object var3 = var0.getTree();
    java.lang.Object var4 = var0.getTree();
    java.lang.Object var5 = var0.getTree();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test231");


    org.databene.jdbacl.model.DefaultDBTable var1 = new org.databene.jdbacl.model.DefaultDBTable();
    var1.setDoc(".");
    java.util.Set var5 = var1.getUniqueConstraints(false);
    org.databene.jdbacl.model.DBDataType var8 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var9 = var8.isAlpha();
    boolean var10 = var8.isLOB();
    org.databene.jdbacl.model.DefaultDBColumn var13 = new org.databene.jdbacl.model.DefaultDBColumn("NOT drop generator sequence ~ 'hi!'", (org.databene.jdbacl.model.DBTable)var1, var8, (java.lang.Integer)100, (java.lang.Integer)(-1));
    org.databene.jdbacl.identity.NaturalPkIdentity var15 = new org.databene.jdbacl.identity.NaturalPkIdentity("hi!");
    java.lang.String var16 = var15.getName();
    boolean var18 = var15.equals((java.lang.Object)(-1.0d));
    org.databene.jdbacl.model.DefaultDBTable var19 = new org.databene.jdbacl.model.DefaultDBTable();
    var19.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var22 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var23 = var22.getForeignKeyConstraints();
    var19.addReferrer((org.databene.jdbacl.model.DBTable)var22);
    java.lang.String[] var30 = new java.lang.String[] { ""};
    java.lang.String[] var34 = new java.lang.String[] { ""};
    java.lang.String var35 = org.databene.jdbacl.SQLUtil.join("", "", var30, "hi!", "10", var34);
    org.databene.jdbacl.model.DBUniqueConstraint var36 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var22, "select nextval('')", false, var30);
    java.lang.String var37 = var15.extractNK((java.lang.Object[])var30);
    boolean var38 = var1.equals((java.lang.Object)var15);
    org.databene.jdbacl.sql.parser.SQLLexer var39 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var39.mCREATE_TABLE();
    var39.emitErrorMessage("call next value for 'hi!'");
    var39.mCOLUMN_SPEC();
    java.lang.String var45 = var39.getCharErrorDisplay(69);
    var39.mDROP_TABLE();
    boolean var47 = var1.equals((java.lang.Object)var39);
    java.util.List var48 = var39.getRuleInvocationStack();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi! as 10 on . = 10."+ "'", var35.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "'E'"+ "'", var45.equals("'E'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test232");


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
    java.lang.String var32 = var31.getDoc();
    org.databene.jdbacl.model.DBSchema var33 = var31.getSchema();
    java.lang.String var34 = var31.toString();
    java.lang.String var35 = var31.getName();
    
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
    assertTrue("'" + var32 + "' != '" + "select nextval('CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT')"+ "'", var32.equals("select nextval('CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT')"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "drop generator CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var34.equals("drop generator CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "drop generator CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var35.equals("drop generator CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test233");


    org.databene.jdbacl.sql.parser.SQLParser.nullability_return var0 = new org.databene.jdbacl.sql.parser.SQLParser.nullability_return();
    java.lang.Object var1 = var0.getTree();
    java.lang.Object var2 = var0.getTree();
    java.lang.Object var3 = var0.getTree();
    java.lang.Object var4 = var0.getTree();
    java.lang.Object var5 = var0.getTree();
    java.lang.Object var6 = var0.getTree();
    java.lang.Object var7 = var0.getTree();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
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

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test234");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_SEQUENCE();
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
    java.util.List var16 = var0.toStrings(var15);
    var0.mCREATE_SEQUENCE();
    var0.mALTER_TABLE();
    var0.mDROP_SEQUENCE();
    org.databene.jdbacl.sql.parser.SQLLexer var20 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var20.mCREATE_TABLE();
    var20.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var24 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var26 = var24.LT(10);
    var20.setCharStream((org.antlr.runtime.CharStream)var24);
    var24.reset();
    int var30 = var24.LA(79);
    var24.reset();
    int var33 = var24.LT(10);
    var0.consumeUntil((org.antlr.runtime.IntStream)var24, 10);
    int var36 = var24.size();
    int var37 = var24.size();
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 14);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test235");


    org.databene.jdbacl.dialect.HSQL2Dialect var0 = new org.databene.jdbacl.dialect.HSQL2Dialect();
    boolean var2 = var0.isDeterministicUKName("CONSTRAINT \"select nextval('')\" UNIQUE ()");
    boolean var5 = var0.isDefaultCatalog("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE ", "No identity defined for table DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT");
    boolean var7 = var0.isDeterministicIndexName("alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP 'alter sequence hi! restart with 1'");
    java.lang.String var10 = var0.renderSequenceValue("drop generator CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", 0L);
    boolean var12 = var0.isDeterministicFKName("select nextval for ') from REGEXP_MATCHES(CONSTRAINT \"select nextval('')\" , 'CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)");
    boolean var14 = var0.isDeterministicUKName("null.jdbc : h2 : mem : hi ! as 10 on.= 10.- identity -.");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "alter sequence drop generator CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT restart with 0"+ "'", var10.equals("alter sequence drop generator CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT restart with 0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test236");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.JDBCConnectData var1 = org.databene.jdbacl.JDBCConnectData.parseSingleDbProperties("drop sequence CREATE SEQUENCE  MAXVALUE 0");
      fail("Expected exception of type org.databene.commons.ConfigurationError");
    } catch (org.databene.commons.ConfigurationError e) {
      // Expected exception.
    }

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test237");


    org.databene.jdbacl.model.DBSequence var3 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    java.lang.String var4 = var3.dropDDL();
    java.math.BigInteger var5 = var3.getIncrementIfNotDefault();
    java.math.BigInteger var6 = var3.getMinValue();
    java.math.BigInteger var7 = var3.getMinValue();
    java.lang.Boolean var8 = var3.isOrder();
    java.math.BigInteger var9 = var3.getIncrementIfNotDefault();
    var3.setCycle((java.lang.Boolean)true);
    java.math.BigInteger var12 = var3.getLastNumber();
    java.lang.String var13 = var3.getSchemaName();
    
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
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi! as 10 on . = 10."+ "'", var13.equals("hi! as 10 on . = 10."));

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test238");


    org.databene.jdbacl.model.DefaultDBTable var1 = new org.databene.jdbacl.model.DefaultDBTable();
    var1.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var4 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var5 = var4.getForeignKeyConstraints();
    var1.addReferrer((org.databene.jdbacl.model.DBTable)var4);
    java.lang.String[] var12 = new java.lang.String[] { ""};
    java.lang.String[] var16 = new java.lang.String[] { ""};
    java.lang.String var17 = org.databene.jdbacl.SQLUtil.join("", "", var12, "hi!", "10", var16);
    org.databene.jdbacl.model.DBUniqueConstraint var18 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var4, "select nextval('')", false, var12);
    var4.setDoc("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT");
    java.lang.String[] var23 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var24 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var23);
    org.databene.jdbacl.model.DBUniqueConstraint var25 = var4.getUniqueConstraint(var23);
    org.databene.jdbacl.identity.UniqueKeyIdentity var26 = new org.databene.jdbacl.identity.UniqueKeyIdentity("select next value for SET GENERATOR.TO - 1", var23);
    org.databene.jdbacl.model.DefaultDBTable var28 = new org.databene.jdbacl.model.DefaultDBTable();
    var28.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var31 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var32 = var31.getForeignKeyConstraints();
    var28.addReferrer((org.databene.jdbacl.model.DBTable)var31);
    java.lang.String[] var39 = new java.lang.String[] { ""};
    java.lang.String[] var43 = new java.lang.String[] { ""};
    java.lang.String var44 = org.databene.jdbacl.SQLUtil.join("", "", var39, "hi!", "10", var43);
    org.databene.jdbacl.model.DBUniqueConstraint var45 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var31, "select nextval('')", false, var39);
    org.databene.jdbacl.model.DBDataType var48 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var49 = var48.isAlpha();
    org.databene.jdbacl.model.DefaultDBColumn var50 = new org.databene.jdbacl.model.DefaultDBColumn("'hi!'", (org.databene.jdbacl.model.DBTable)var31, var48);
    var50.setDefaultValue("CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )");
    org.databene.jdbacl.model.DBDataType var53 = var50.getType();
    boolean var54 = var26.equals((java.lang.Object)var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi! as 10 on . = 10."+ "'", var17.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var24.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi! as 10 on . = 10."+ "'", var44.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test239");


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
    org.databene.jdbacl.ResultSetConverter var80 = new org.databene.jdbacl.ResultSetConverter(var78);
    java.lang.String var81 = var80.toString();
    java.lang.Class var82 = var80.getTargetType();
    boolean var83 = var80.isThreadSafe();
    java.lang.Class var84 = var80.getTargetType();
    org.databene.jdbacl.ResultSetConverter var86 = new org.databene.jdbacl.ResultSetConverter(var84, false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + "ResultSetConverter"+ "'", var81.equals("ResultSetConverter"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test240");


    org.databene.jdbacl.sql.parser.SQLParser.foreign_key_constraint_return var0 = new org.databene.jdbacl.sql.parser.SQLParser.foreign_key_constraint_return();
    java.lang.Object var1 = var0.getTree();
    java.lang.Object var2 = var0.getTree();
    java.lang.Object var3 = var0.getTree();
    java.lang.Object var4 = var0.getTree();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test241");


    org.databene.jdbacl.sql.ColumnExpression var6 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var9 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var10 = var9.getValue();
    org.databene.jdbacl.sql.ColumnExpression var13 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var14 = var13.getValue();
    org.databene.jdbacl.sql.BetweenExpression var15 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var6, (org.databene.script.Expression)var9, (org.databene.script.Expression)var13);
    java.lang.Object var16 = var6.getValue();
    org.databene.jdbacl.sql.ColumnExpression var19 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var20 = var19.getValue();
    org.databene.jdbacl.dialect.HSQL2Dialect var21 = new org.databene.jdbacl.dialect.HSQL2Dialect();
    java.lang.String var23 = var21.renderFetchSequenceValue("'hi!'");
    var19.setValue("'hi!'");
    boolean var25 = var19.isConstant();
    org.databene.jdbacl.sql.ColumnExpression var28 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    boolean var29 = var28.isConstant();
    java.lang.Object var30 = var28.getValue();
    org.databene.jdbacl.sql.BetweenExpression var31 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var6, (org.databene.script.Expression)var19, (org.databene.script.Expression)var28);
    org.databene.script.Expression[] var32 = var31.getSourceExpressions();
    org.databene.jdbacl.sql.FunctionInvocation var33 = new org.databene.jdbacl.sql.FunctionInvocation("alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP 'alter sequence hi! restart with 1'", var32);
    org.databene.jdbacl.identity.mem.GlobalRowId var34 = new org.databene.jdbacl.identity.mem.GlobalRowId("select   REGEXP 'VALUES (NEXT VALUE FOR SET GENERATOR Sub identity of ():\nnull TO -1)'.nextval from dual", "No identity defined for table alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP 'alter sequence hi! restart with 1'", (java.lang.Object)var32);
    org.databene.jdbacl.sql.FunctionInvocation var35 = new org.databene.jdbacl.sql.FunctionInvocation("select nextval for null[DROP SEQUENCE ] from sysibm.sysdummy1", var32);
    org.databene.script.Expression[] var36 = var35.getSourceExpressions();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "sequence"+ "'", var10.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "sequence"+ "'", var14.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "sequence"+ "'", var16.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "sequence"+ "'", var20.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "call next value for 'hi!'"+ "'", var23.equals("call next value for 'hi!'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "sequence"+ "'", var30.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test242");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mOR();
    java.lang.String var16 = var10.getText();
    var10.mT__114();
    var10.mCOMMENT_TABLE();
    var10.mT__137();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "select next value for SET GENERATOR.TO - 1"+ "'", var16.equals("select next value for SET GENERATOR.TO - 1"));

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test243");


    org.databene.jdbacl.model.jdbc.JDBCDBImporter var6 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var6.setImportingChecks(false);
    var6.setExcludeTables("select nextval('')");
    var6.setExcludeTables("CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).");
    var6.setImportingIndexes(false);
    var6.setExcludeTables("CONSTRAINT \"hi! identity by primary key\" PRIMARY KEY () ~ 'jdbc:h2:mem:hi! as 10 on . = 10.-identity-.' NOT REGEXP 'SET GENERATOR select nextval for  DROP SEQUENCE (0,-1) NULL from jdbc:h2:mem:hi! as 10 on . = 10.-identity- TO 0'");

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test244");


    boolean var1 = org.databene.jdbacl.SQLUtil.isDML("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT CYCLE");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test245");


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
    java.lang.String var92 = var90.name();
    int var93 = var90.ordinal();
    java.lang.Class var94 = var90.getDeclaringClass();
    org.databene.jdbacl.ResultSetConverter var95 = new org.databene.jdbacl.ResultSetConverter(var94);
    java.lang.Class var96 = var95.getTargetType();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test246");


    org.databene.jdbacl.identity.IdentityProvider var0 = new org.databene.jdbacl.identity.IdentityProvider();
    org.databene.jdbacl.identity.NaturalPkIdentity var2 = new org.databene.jdbacl.identity.NaturalPkIdentity("hi!");
    java.lang.String var3 = var2.getName();
    var0.registerIdentity((org.databene.jdbacl.identity.IdentityModel)var2, "SET GENERATOR . TO -1");
    java.lang.String[] var10 = new java.lang.String[] { ""};
    java.lang.String[] var14 = new java.lang.String[] { ""};
    java.lang.String var15 = org.databene.jdbacl.SQLUtil.join("", "", var10, "hi!", "10", var14);
    org.databene.jdbacl.identity.IdentityProvider var16 = new org.databene.jdbacl.identity.IdentityProvider();
    org.databene.jdbacl.identity.SubNkPkQueryIdentity var17 = new org.databene.jdbacl.identity.SubNkPkQueryIdentity("null", var10, var16);
    java.lang.String var18 = var17.getDescription();
    java.lang.String var19 = var17.getDescription();
    var0.registerIdentity((org.databene.jdbacl.identity.IdentityModel)var17, "select gen_id(call next value for org.databene.jdbacl.SQLScriptException: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1: , 1) from RDB$DATABASE;");
    org.databene.jdbacl.identity.NaturalPkIdentity var23 = new org.databene.jdbacl.identity.NaturalPkIdentity("catalog");
    java.lang.String var24 = var23.getDescription();
    var0.registerIdentity((org.databene.jdbacl.identity.IdentityModel)var23, "SET GENERATOR alter sequence call next value for 'hi!' restart with 100 TO -1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi! as 10 on . = 10."+ "'", var15.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Sub identity of ():\nnull"+ "'", var18.equals("Sub identity of ():\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Sub identity of ():\nnull"+ "'", var19.equals("Sub identity of ():\nnull"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "catalog identity by primary key"+ "'", var24.equals("catalog identity by primary key"));

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test247");


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
      var0.mT__110();
      fail("Expected exception of type org.antlr.runtime.MismatchedTokenException");
    } catch (org.antlr.runtime.MismatchedTokenException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test248");


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
    java.lang.String var39 = var37.getObjectId();
    var37.setOverload("");
    var37.setObjectId("left join VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) as drop sequence alter sequence hi! restart with 1 on jdbc:h2:mem:select next value for 10.select next value for 10 = drop sequence alter sequence hi! restart with 1.DROP SEQUENCE  NOT SIMILAR TO 'CONSTRAINT \"hi! identity by primary key\"  NOT REGEXP 'select next value for SET GENERATOR.TO - 1 NOT REGEXP 'hi!''' NOT REGEXP 'VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)'");
    
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
    assertNull(var39);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test249");


    org.databene.jdbacl.dialect.FirebirdDialect var0 = new org.databene.jdbacl.dialect.FirebirdDialect();
    boolean var2 = var0.isDeterministicUKName("10");
    boolean var5 = var0.isDefaultCatalog("CREATE SEQUENCE 10", "left join VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) as drop sequence alter sequence hi! restart with 1 on jdbc:h2:mem:select next value for 10.select next value for 10 = drop sequence alter sequence hi! restart with 1.DROP SEQUENCE ");
    boolean var7 = var0.isDeterministicUKName("select gen_id(CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)., 1) from RDB$DATABASE;");
    boolean var8 = var0.isSequenceBoundarySupported();
    boolean var10 = var0.isDeterministicFKName("select 'SET GENERATOR org.databene.jdbacl.SQLScriptException: Error in execution of script line 1:  TO 0'.nextval from dual");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test250");


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
    org.databene.jdbacl.model.DBSequence var24 = new org.databene.jdbacl.model.DBSequence("", "drop sequence ", "hi! as 10 on . = 10.");
    java.math.BigInteger var25 = var24.getMaxValue();
    org.databene.jdbacl.model.DBCatalog var26 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var27 = var26.getName();
    org.databene.jdbacl.model.Database var28 = var26.getDatabase();
    java.lang.String var29 = var26.getDoc();
    org.databene.jdbacl.dialect.DerbyDialect var31 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var33 = var31.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var34 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var35 = var34.getName();
    java.lang.String var36 = var31.formatValue((java.lang.Object)var34);
    var34.setName("'hi!'");
    java.util.List var39 = var34.getSchemas();
    org.databene.jdbacl.model.DBSchema var40 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var34);
    var26.removeSchema(var40);
    org.databene.jdbacl.dialect.DerbyDialect var44 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var46 = var44.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var47 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var48 = var47.getName();
    java.lang.String var49 = var44.formatValue((java.lang.Object)var47);
    var47.setName("'hi!'");
    java.util.List var52 = var47.getSchemas();
    org.databene.jdbacl.model.DBSchema var53 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var47);
    org.databene.jdbacl.model.DBTrigger var54 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var53);
    var54.setDescription("CREATE GENERATOR drop sequence ");
    java.lang.String var57 = var54.getTriggerBody();
    java.lang.String var58 = var54.getColumnName();
    java.lang.String var59 = var54.getWhenClause();
    var40.addTrigger(var54);
    boolean var61 = var24.isIdentical((org.databene.jdbacl.model.DBObject)var40);
    java.util.List var62 = var40.getPackages();
    org.databene.jdbacl.model.DBSequence var63 = new org.databene.jdbacl.model.DBSequence("NO_ACTION", var40);
    org.databene.jdbacl.model.DBSequence var64 = new org.databene.jdbacl.model.DBSequence("REGEXP_MATCHES(NOT REGEXP_LIKE(DROP SEQUENCE (100), 'CONSTRAINT \"select nextval('')\" '), 'jdbc:h2:mem:hi! as 10 on . = 10.')", var40);
    boolean var65 = var17.isIdentical((org.databene.jdbacl.model.DBObject)var64);
    
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
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test251");


    org.databene.jdbacl.JDBCConnectData var6 = new org.databene.jdbacl.JDBCConnectData("drop generator REGEXP_LIKE(select next value for SET GENERATOR.TO - 1, 'NOT drop sequence  ~ 'alter sequence  restart with -1''): class org.databene.jdbacl.model.FKChangeRule", "select next value for SET GENERATOR . TO -1", "Sub identity of ():\nSET GENERATOR select gen_id(call next value for org.databene.jdbacl.SQLScriptException: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1: , 1) from RDB$DATABASE; TO 99", "CONSTRAINT \"hi! identity by primary key\" ", "CREATE GENERATOR 10; SET GENERATOR 10 TO -1;", "null.jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test252");


    java.io.File var1 = org.databene.jdbacl.model.cache.CachingDBImporter.getCacheFile("SET GENERATOR . TO -1");
    org.databene.jdbacl.model.xml.XMLModelExporter var3 = new org.databene.jdbacl.model.xml.XMLModelExporter(var1, "(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")");
    org.databene.jdbacl.model.xml.XMLModelExporter var5 = new org.databene.jdbacl.model.xml.XMLModelExporter(var1, "left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).");
    org.databene.jdbacl.model.xml.XMLModelExporter var6 = new org.databene.jdbacl.model.xml.XMLModelExporter(var1);
    org.databene.jdbacl.model.xml.XMLModelExporter var8 = new org.databene.jdbacl.model.xml.XMLModelExporter(var1, "CONSTRAINT \"jdbc:h2:mem:select next value for 10\" ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test253");


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
    java.lang.String var33 = var31.getObjectType();
    org.databene.jdbacl.dialect.DerbyDialect var38 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var40 = var38.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var41 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var42 = var41.getName();
    java.lang.String var43 = var38.formatValue((java.lang.Object)var41);
    var41.setName("'hi!'");
    java.util.List var46 = var41.getSchemas();
    org.databene.jdbacl.model.DBSchema var47 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var41);
    org.databene.jdbacl.model.DBTrigger var48 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var47);
    java.util.List var49 = var47.getPackages();
    org.databene.jdbacl.model.DBPackage var50 = new org.databene.jdbacl.model.DBPackage("CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).", var47);
    java.util.List var51 = var50.getComponents();
    org.databene.jdbacl.model.DBProcedure var52 = new org.databene.jdbacl.model.DBProcedure("CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var50);
    org.databene.jdbacl.dialect.DerbyDialect var57 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var59 = var57.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var60 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var61 = var60.getName();
    java.lang.String var62 = var57.formatValue((java.lang.Object)var60);
    var60.setName("'hi!'");
    java.util.List var65 = var60.getSchemas();
    org.databene.jdbacl.model.DBSchema var66 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var60);
    org.databene.jdbacl.model.DBTrigger var67 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var66);
    java.util.List var68 = var66.getPackages();
    org.databene.jdbacl.model.DBPackage var69 = new org.databene.jdbacl.model.DBPackage("CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).", var66);
    java.util.List var70 = var69.getComponents();
    org.databene.jdbacl.model.DBProcedure var71 = new org.databene.jdbacl.model.DBProcedure("CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var69);
    var50.addProcedure(var71);
    java.util.List var73 = var50.getProcedures();
    boolean var74 = var31.equals((java.lang.Object)var50);
    java.lang.String var75 = var31.getDoc();
    
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
    assertTrue("'" + var33 + "' != '" + "table"+ "'", var33.equals("table"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "select nextval('CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT')"+ "'", var75.equals("select nextval('CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT')"));

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test254");


    org.databene.jdbacl.dialect.DerbyDialect var2 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var4 = var2.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var5 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var6 = var5.getName();
    java.lang.String var7 = var2.formatValue((java.lang.Object)var5);
    var5.setName("'hi!'");
    java.util.List var10 = var5.getSchemas();
    org.databene.jdbacl.model.DBSchema var11 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var5);
    org.databene.jdbacl.dialect.DerbyDialect var14 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var16 = var14.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var17 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var18 = var17.getName();
    java.lang.String var19 = var14.formatValue((java.lang.Object)var17);
    var17.setName("'hi!'");
    java.util.List var22 = var17.getSchemas();
    org.databene.jdbacl.model.DBSchema var23 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var17);
    org.databene.jdbacl.model.DBTrigger var24 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var23);
    var11.addTrigger(var24);
    org.databene.jdbacl.model.DBTrigger var26 = new org.databene.jdbacl.model.DBTrigger("SELECT * FROM null WHERE  = ''", var11);
    org.databene.jdbacl.dialect.DerbyDialect var30 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var32 = var30.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var33 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var34 = var33.getName();
    java.lang.String var35 = var30.formatValue((java.lang.Object)var33);
    var33.setName("'hi!'");
    java.util.List var38 = var33.getSchemas();
    org.databene.jdbacl.model.DBSchema var39 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var33);
    org.databene.jdbacl.model.DBTrigger var40 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var39);
    java.util.List var41 = var39.getPackages();
    org.databene.jdbacl.model.DBPackage var42 = new org.databene.jdbacl.model.DBPackage("CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).", var39);
    java.util.List var43 = var42.getComponents();
    var11.addPackage(var42);
    java.lang.String var45 = var42.getSubObjectName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test255");


    org.databene.jdbacl.model.TableContainerSupport var0 = new org.databene.jdbacl.model.TableContainerSupport();
    java.util.List var2 = var0.getTables(true);
    java.util.Collection var3 = var0.getSubContainers();
    java.util.List var5 = var0.getTables(false);
    org.databene.jdbacl.model.DBCatalog var8 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var9 = var8.getName();
    java.util.List var10 = var8.getComponents();
    org.databene.jdbacl.model.DBSchema var12 = var8.getSchema("alter sequence hi! restart with 1");
    org.databene.jdbacl.model.DBSchema var14 = var8.getSchema("jdbc:h2:mem:hi! as 10 on . = 10.");
    java.lang.String var15 = var8.getName();
    org.databene.jdbacl.model.TableContainer var16 = new org.databene.jdbacl.model.TableContainer("drop sequence jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", (org.databene.jdbacl.model.CompositeDBObject)var8);
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
    org.databene.jdbacl.dialect.DerbyDialect var58 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var60 = var58.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var61 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var62 = var61.getName();
    java.lang.String var63 = var58.formatValue((java.lang.Object)var61);
    var61.setName("'hi!'");
    java.util.List var66 = var61.getSchemas();
    org.databene.jdbacl.model.DBSchema var67 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var61);
    org.databene.jdbacl.model.DBTrigger var68 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var67);
    java.util.List var69 = var67.getPackages();
    org.databene.jdbacl.model.DBPackage var70 = new org.databene.jdbacl.model.DBPackage("CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).", var67);
    java.lang.String var71 = var70.getStatus();
    var33.addPackage(var70);
    java.util.List var73 = var33.getTriggers();
    java.util.List var74 = var16.getTables(false, var73);
    java.util.List var75 = var0.getSequences(true, var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
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
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test256");


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
    java.lang.String var65 = var59.getReferencingNames();
    var59.setTriggerBody("DROP SEQUENCE NOT drop generator sequence ~ 'hi!' RESTRICT");
    
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

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test257");


    org.databene.jdbacl.model.DBSequence var3 = new org.databene.jdbacl.model.DBSequence("SELECT * FROM null WHERE DROP SEQUENCE  = 'hi!' : DROP SEQUENCE ", "Identity definition by unique key: select next value for 10", "()");
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
    org.databene.jdbacl.model.DefaultDBColumn var29 = new org.databene.jdbacl.model.DefaultDBColumn("NOT REGEXP_MATCHES(sequence, '')", (org.databene.jdbacl.model.DBTable)var9, (-1), "hi! identity by primary key");
    boolean var30 = var29.isNullable();
    var29.setNullable(true);
    boolean var33 = var3.isIdentical((org.databene.jdbacl.model.DBObject)var29);
    var29.setSize((java.lang.Integer)3);
    java.lang.String var36 = org.databene.jdbacl.SQLUtil.renderColumn((org.databene.jdbacl.model.DBColumn)var29);
    var29.setVersionColumn(false);
    
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
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "NOT REGEXP_MATCHES(sequence, '') HI! IDENTITY BY PRIMARY KEY(3) NULL"+ "'", var36.equals("NOT REGEXP_MATCHES(sequence, '') HI! IDENTITY BY PRIMARY KEY(3) NULL"));

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test258");


    org.databene.jdbacl.identity.NkPkQueryIdentity var2 = new org.databene.jdbacl.identity.NkPkQueryIdentity("DROP SEQUENCE -1 RESTRICT", "VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) = \"sequence\"");
    java.lang.String var3 = var2.getDescription();
    var2.setNkPkQuery("hi! as 10 on . = 10.");
    java.lang.String var6 = var2.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Identity definition by NK-PK query: VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) = \"sequence\""+ "'", var3.equals("Identity definition by NK-PK query: VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) = \"sequence\""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Identity definition by NK-PK query: hi! as 10 on . = 10."+ "'", var6.equals("Identity definition by NK-PK query: hi! as 10 on . = 10."));

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test259");


    org.databene.jdbacl.model.DBCatalog var1 = new org.databene.jdbacl.model.DBCatalog("select nextval('(NOT drop generator sequence ~ 'hi!')')");

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test260");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.skip();
    var0.mCREATE_INDEX();
    var0.mVALUE_LIST();
    var0.mALTER_TABLE();

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test261");


    java.io.File var1 = org.databene.jdbacl.model.cache.CachingDBImporter.getCacheFile("select gen_id(DROP SEQUENCE EQUEN RESTRICT, 1) from RDB$DATABASE;");
    org.databene.jdbacl.model.sql.CreateExporter var2 = new org.databene.jdbacl.model.sql.CreateExporter(var1);
    org.databene.jdbacl.model.xml.XMLModelExporter var4 = new org.databene.jdbacl.model.xml.XMLModelExporter(var1, "Identity definition by NK-PK query: NOT drop generator sequence ~ 'hi!'");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test262");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mT__92();
    var10.mDROP_TABLE();
    java.lang.String var17 = var10.getText();
    var10.mT__95();
    var10.mIN();
    var10.mT__137();
    org.antlr.runtime.CharStream var21 = var10.getCharStream();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "select next value for SET GENERATOR.TO - 1"+ "'", var17.equals("select next value for SET GENERATOR.TO - 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test263");


    org.databene.jdbacl.dialect.OracleDialect var0 = new org.databene.jdbacl.dialect.OracleDialect();
    boolean var2 = var0.isDeterministicUKName("alter sequence CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT restart with 1");
    boolean var4 = var0.isDeterministicIndexName("DROP SEQUENCE (100)");
    boolean var6 = var0.isDeterministicCheckName("drop sequence derby");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test264");


    org.databene.jdbacl.dialect.DB2Dialect var0 = new org.databene.jdbacl.dialect.DB2Dialect();
    boolean var2 = var0.isDeterministicUKName("alter sequence CONSTRAINT \"select nextval('')\" UNIQUE () restart with -1");
    boolean var4 = var0.isDeterministicPKName("NaturalPkIdentity(hi!)");
    boolean var6 = var0.isDeterministicPKName("SET GENERATOR Sub identity of ():\nnull TO -1");
    boolean var8 = var0.isDeterministicIndexName("10");
    boolean var10 = var0.isDeterministicIndexName("drop sequence select gen_id(DROP SEQUENCE EQUEN RESTRICT, 1) from RDB$DATABASE;");
    boolean var12 = var0.isDeterministicUKName("CREATE SEQUENCE \"(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")\".\"REGEXP_MATCHES(NOT REGEXP_LIKE(DROP SEQUENCE (100), 'CONSTRAINT \"select nextval('')\" '), 'jdbc:h2:mem:hi! as 10 on . = 10.')\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test265");


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
    java.lang.String var45 = var41.toString();
    org.databene.jdbacl.model.DBTable var46 = var41.getRefereeTable();
    
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
    assertTrue("'" + var45 + "' != '" + "CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )"+ "'", var45.equals("CONSTRAINT \"CREATE GENERATOR drop sequence \" FOREIGN KEY () REFERENCES null(DROP SEQUENCE )"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test266");


    org.databene.jdbacl.model.DBDataType var2 = org.databene.jdbacl.model.DBDataType.getInstance(309, "select gen_id(CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT (, sequence, SELECT NEXT VALUE FOR SET GENERATOR.TO - 1 NOT REGEXP 'HI!') unique, 1) from RDB$DATABASE;");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test267");


    org.databene.jdbacl.dialect.H2Dialect var0 = new org.databene.jdbacl.dialect.H2Dialect();
    java.lang.String var2 = var0.renderFetchSequenceValue("10");
    java.lang.String var5 = var0.setSequenceValue("CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", 1L);
    boolean var7 = var0.isDeterministicIndexName("jdbc:h2:mem:hi! as 10 on . = 10.");
    boolean var10 = var0.isDefaultCatalog("call next value for SET GENERATOR org.databene.jdbacl.SQLScriptException: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1:  as null[DROP SEQUENCE ] on DROP SEQUENCE NOT drop generator sequence ~ 'hi!' RESTRICT identity by primary key. = null[DROP SEQUENCE ].DROP SEQUENCE  TO -1", "call next value for select next value for SET GENERATOR.TO - 1 DROP SEQUENCE NULL");
    boolean var13 = var0.isDefaultSchema("NOT REGEXP_LIKE(jdbc:hsqldb:mem:CREATE SEQUENCE \"hi! as 10 on . = 10.\".\"\" CACHE 100, 'null.jdbc:h2:mem:hi! as 10 on . = 10.-identity-.')", "(\"sequence\")");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "select next value for 10"+ "'", var2.equals("select next value for 10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "alter sequence CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT restart with 1"+ "'", var5.equals("alter sequence CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT restart with 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test268");


    org.databene.jdbacl.model.DefaultDBTable var2 = new org.databene.jdbacl.model.DefaultDBTable();
    var2.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var5 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var6 = var5.getForeignKeyConstraints();
    var2.addReferrer((org.databene.jdbacl.model.DBTable)var5);
    java.lang.String[] var13 = new java.lang.String[] { "select next value for 10"};
    org.databene.jdbacl.identity.UniqueKeyIdentity var14 = new org.databene.jdbacl.identity.UniqueKeyIdentity("CREATE SEQUENCE 10", var13);
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
    java.lang.String var44 = org.databene.jdbacl.SQLUtil.leftJoin("jdbc:h2:mem:select next value for 10", var13, "VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).)", "drop sequence alter sequence hi! restart with 1", var40);
    org.databene.jdbacl.model.DBUniqueConstraint var45 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var2, "drop sequence jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", false, var13);
    org.databene.jdbacl.model.DBUniqueIndex var46 = new org.databene.jdbacl.model.DBUniqueIndex("VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) = \"sequence\"", false, var45);
    java.lang.String var47 = org.databene.jdbacl.SQLUtil.ownerDotComponent((org.databene.jdbacl.model.DBObject)var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
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
    assertTrue("'" + var44 + "' != '" + "left join VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) as drop sequence alter sequence hi! restart with 1 on jdbc:h2:mem:select next value for 10.select next value for 10 = drop sequence alter sequence hi! restart with 1.DROP SEQUENCE "+ "'", var44.equals("left join VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) as drop sequence alter sequence hi! restart with 1 on jdbc:h2:mem:select next value for 10.select next value for 10 = drop sequence alter sequence hi! restart with 1.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "null.drop sequence jdbc:h2:mem:hi! as 10 on . = 10.-identity-."+ "'", var47.equals("null.drop sequence jdbc:h2:mem:hi! as 10 on . = 10.-identity-."));

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test269");


    org.databene.jdbacl.dialect.H2Dialect var0 = new org.databene.jdbacl.dialect.H2Dialect();
    java.lang.String var2 = var0.renderFetchSequenceValue("10");
    java.lang.String var5 = var0.setSequenceValue("CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", 1L);
    boolean var7 = var0.isDeterministicIndexName("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT");
    boolean var9 = var0.isDeterministicFKName("drop generator CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE ");
    boolean var12 = var0.isDefaultCatalog("-1.DROP SEQUENCE ", "select next value for 10");
    java.lang.String var14 = var0.renderFetchSequenceValue("select nextval for select nextval('alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP 'alter sequence hi! restart with 1'') from sysibm.sysdummy1");
    java.lang.String var17 = var0.setSequenceValue("select next value for 10", 0L);
    
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
    assertTrue("'" + var14 + "' != '" + "select next value for select nextval for select nextval('alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP 'alter sequence hi! restart with 1'') from sysibm.sysdummy1"+ "'", var14.equals("select next value for select nextval for select nextval('alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP 'alter sequence hi! restart with 1'') from sysibm.sysdummy1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "alter sequence select next value for 10 restart with 0"+ "'", var17.equals("alter sequence select next value for 10 restart with 0"));

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test270");


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
    java.io.File var75 = org.databene.jdbacl.model.cache.CachingDBImporter.getCacheFile("select gen_id(DROP SEQUENCE EQUEN RESTRICT, 1) from RDB$DATABASE;");
    org.databene.jdbacl.model.xml.XMLModelExporter var77 = new org.databene.jdbacl.model.xml.XMLModelExporter(var75, " ");
    boolean var78 = var73.equals((java.lang.Object)" ");
    java.lang.String var79 = var73.name();
    int var80 = var73.ordinal();
    
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
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + "NO_ACTION"+ "'", var79.equals("NO_ACTION"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 0);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test271");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.databene.jdbacl.JDBCConnectData var1 = org.databene.jdbacl.DBUtil.getConnectData("select next value for drop sequence NOT SIMILAR TO ''jdbc:h2:mem:hi! as 10 on . = 10.-identity-.''");
      fail("Expected exception of type org.databene.commons.ConfigurationError");
    } catch (org.databene.commons.ConfigurationError e) {
      // Expected exception.
    }

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test272");


    org.databene.jdbacl.model.DefaultDBTable var3 = new org.databene.jdbacl.model.DefaultDBTable();
    var3.setDoc(".");
    java.util.Set var7 = var3.getUniqueConstraints(false);
    org.databene.jdbacl.model.DBDataType var10 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var11 = var10.isAlpha();
    boolean var12 = var10.isLOB();
    org.databene.jdbacl.model.DefaultDBColumn var15 = new org.databene.jdbacl.model.DefaultDBColumn("NOT drop generator sequence ~ 'hi!'", (org.databene.jdbacl.model.DBTable)var3, var10, (java.lang.Integer)100, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.TableContainer var18 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var19 = var18.getTables();
    org.databene.jdbacl.model.TableContainer var20 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var18);
    org.databene.jdbacl.model.DefaultDBTable var21 = new org.databene.jdbacl.model.DefaultDBTable();
    var21.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var24 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var25 = var24.getForeignKeyConstraints();
    var21.addReferrer((org.databene.jdbacl.model.DBTable)var24);
    var18.addTable((org.databene.jdbacl.model.DBTable)var24);
    var15.setTable((org.databene.jdbacl.model.DBTable)var24);
    org.databene.jdbacl.dialect.DerbyDialect var32 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var34 = var32.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var35 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var36 = var35.getName();
    java.lang.String var37 = var32.formatValue((java.lang.Object)var35);
    var35.setName("'hi!'");
    java.util.List var40 = var35.getSchemas();
    org.databene.jdbacl.model.DBSchema var41 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var35);
    org.databene.jdbacl.model.DBTrigger var42 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var41);
    java.lang.String var43 = var41.getName();
    org.databene.jdbacl.model.DefaultDBTable var44 = new org.databene.jdbacl.model.DefaultDBTable("drop sequence 10", var41);
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
    java.lang.String[] var87 = var86.getForeignKeyColumnNames();
    var44.removeForeignKeyConstraint(var86);
    java.lang.String[] var89 = var44.getColumnNames();
    org.databene.jdbacl.model.DBNonUniqueIndex var90 = new org.databene.jdbacl.model.DBNonUniqueIndex("SET GENERATOR catalog TO -2", false, (org.databene.jdbacl.model.DBTable)var24, var89);
    boolean var91 = var90.isUnique();
    boolean var92 = var90.isUnique();
    var90.addColumnName("DROP SEQUENCE NOT drop generator sequence ~ 'hi!' RESTRICT");
    var90.addColumnName("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT");
    var90.addColumnName("sequence 10");
    java.lang.String var99 = var90.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")"+ "'", var43.equals("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")"));
    
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
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var99 + "' != '" + "SET GENERATOR catalog TO -2"+ "'", var99.equals("SET GENERATOR catalog TO -2"));

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test273");


    org.databene.jdbacl.JDBCDriverInfo var0 = new org.databene.jdbacl.JDBCDriverInfo();
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var7 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var7.setExcludeTables("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    boolean var10 = var0.equals((java.lang.Object)var7);
    var0.setDownloadUrl("jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1)");
    var0.setId("CREATE GENERATOR drop sequence ");
    java.lang.String var15 = var0.getDefaultSchema();
    java.lang.String var16 = var0.getDefaultSchema();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test274");


    org.databene.jdbacl.JDBCDriverInfo var0 = new org.databene.jdbacl.JDBCDriverInfo();
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var7 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("hi!", "hi!", "hi!", "hi!", "hi!", "");
    var7.setExcludeTables("jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    boolean var10 = var0.equals((java.lang.Object)var7);
    var0.setDownloadUrl("jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1)");
    var0.setDefaultSchema("org.databene.jdbacl.SQLScriptException: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1:  as null[DROP SEQUENCE ] on DROP SEQUENCE NOT drop generator sequence ~ 'hi!' RESTRICT identity by primary key. = null[DROP SEQUENCE ].DROP SEQUENCE ");
    java.lang.String[] var18 = new java.lang.String[] { "select next value for 10"};
    org.databene.jdbacl.identity.UniqueKeyIdentity var19 = new org.databene.jdbacl.identity.UniqueKeyIdentity("CREATE SEQUENCE 10", var18);
    org.databene.jdbacl.model.DefaultDBTable var23 = new org.databene.jdbacl.model.DefaultDBTable();
    var23.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var26 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var27 = var26.getForeignKeyConstraints();
    var23.addReferrer((org.databene.jdbacl.model.DBTable)var26);
    java.lang.String[] var34 = new java.lang.String[] { ""};
    java.lang.String[] var38 = new java.lang.String[] { ""};
    java.lang.String var39 = org.databene.jdbacl.SQLUtil.join("", "", var34, "hi!", "10", var38);
    org.databene.jdbacl.model.DBUniqueConstraint var40 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var26, "select nextval('')", false, var34);
    var26.setDoc("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT");
    java.lang.String[] var45 = new java.lang.String[] { "DROP SEQUENCE "};
    java.lang.String var46 = org.databene.jdbacl.SQLUtil.renderColumnListWithTableName("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT", var45);
    org.databene.jdbacl.model.DBUniqueConstraint var47 = var26.getUniqueConstraint(var45);
    org.databene.jdbacl.identity.UniqueKeyIdentity var48 = new org.databene.jdbacl.identity.UniqueKeyIdentity("select next value for SET GENERATOR.TO - 1", var45);
    java.lang.String var49 = org.databene.jdbacl.SQLUtil.leftJoin("jdbc:h2:mem:select next value for 10", var18, "VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).)", "drop sequence alter sequence hi! restart with 1", var45);
    var0.setJars(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi! as 10 on . = 10."+ "'", var39.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var46.equals("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "left join VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) as drop sequence alter sequence hi! restart with 1 on jdbc:h2:mem:select next value for 10.select next value for 10 = drop sequence alter sequence hi! restart with 1.DROP SEQUENCE "+ "'", var49.equals("left join VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) as drop sequence alter sequence hi! restart with 1 on jdbc:h2:mem:select next value for 10.select next value for 10 = drop sequence alter sequence hi! restart with 1.DROP SEQUENCE "));

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test275");


    org.databene.jdbacl.identity.InvalidIdentityDefinitionError var1 = new org.databene.jdbacl.identity.InvalidIdentityDefinitionError("call next value for CREATE SEQUENCE \"hi! as 10 on . = 10.\".\"\"");
    org.databene.jdbacl.SQLScriptException var4 = new org.databene.jdbacl.SQLScriptException(1);
    org.databene.jdbacl.SQLScriptException var7 = new org.databene.jdbacl.SQLScriptException((java.lang.Throwable)var4, "SELECT * FROM null WHERE DROP SEQUENCE  = 'hi!' : DROP SEQUENCE ", 100);
    org.databene.jdbacl.identity.InvalidIdentityDefinitionError var8 = new org.databene.jdbacl.identity.InvalidIdentityDefinitionError("NOT drop sequence  ~ 'alter sequence  restart with -1'", (java.lang.Throwable)var4);
    var1.addSuppressed((java.lang.Throwable)var4);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test276");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_SEQUENCE();
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
    java.util.List var16 = var0.toStrings(var15);
    var0.mCREATE_SEQUENCE();
    var0.setBacktrackingLevel(14);
    var0.setBacktrackingLevel(69);
    
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
    assertNotNull(var16);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test277");


    org.databene.jdbacl.dialect.MySQLDialect var0 = new org.databene.jdbacl.dialect.MySQLDialect();
    boolean var2 = var0.isDeterministicUKName("call next value for 'hi!'");
    java.lang.String var6 = var0.regexQuery("alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0", false, "alter sequence hi! restart with 1");
    boolean var8 = var0.isDeterministicUKName("jdbc:h2:mem:VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).DROP SEQUENCE ");
    boolean var9 = var0.supportsRegex();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP 'alter sequence hi! restart with 1'"+ "'", var6.equals("alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP 'alter sequence hi! restart with 1'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test278");


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
    java.lang.String var22 = var21.toString();
    org.databene.jdbacl.dialect.PostgreSQLDialect var23 = new org.databene.jdbacl.dialect.PostgreSQLDialect();
    boolean var26 = var23.isDefaultCatalog("", "");
    java.lang.String var28 = var23.renderDropSequence("");
    org.databene.jdbacl.model.DBCatalog var29 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var30 = var23.formatValue((java.lang.Object)var29);
    java.lang.String var31 = org.databene.jdbacl.SQLUtil.ownerDotComponent((org.databene.jdbacl.model.DBObject)var29);
    org.databene.jdbacl.model.Database var32 = var29.getDatabase();
    org.databene.jdbacl.dialect.DerbyDialect var36 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var38 = var36.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var39 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var40 = var39.getName();
    java.lang.String var41 = var36.formatValue((java.lang.Object)var39);
    var39.setName("'hi!'");
    java.util.List var44 = var39.getSchemas();
    org.databene.jdbacl.model.DBSchema var45 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var39);
    org.databene.jdbacl.model.DBTrigger var46 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var45);
    java.lang.String var47 = var45.getName();
    org.databene.jdbacl.model.DefaultDBTable var48 = new org.databene.jdbacl.model.DefaultDBTable("drop sequence 10", var45);
    var29.addSchema(var45);
    boolean var50 = var21.equals((java.lang.Object)var29);
    var29.setName("select nextval for  from left join CONSTRAINT \"hi! identity by primary key\"  as select hi! as 10 on . = 10..NOT drop generator sequence ~ 'hi!', hi! as 10 on . = 10..alter sequence CREATE GENERATOR drop sequence  restart with -1.nextval from dual on No identity defined for table DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT.DROP SEQUENCE  = select hi! as 10 on . = 10..NOT drop generator sequence ~ 'hi!', hi! as 10 on . = 10..alter sequence CREATE GENERATOR drop sequence  restart with -1.nextval from dual., select nextval for  from left join CONSTRAINT \"hi! identity by primary key\"  as select hi! as 10 on . = 10..NOT drop generator sequence ~ 'hi!', hi! as 10 on . = 10..alter sequence CREATE GENERATOR drop sequence  restart with -1.nextval from dual on No identity defined for table DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT.DROP SEQUENCE  = select hi! as 10 on . = 10..NOT drop generator sequence ~ 'hi!', hi! as 10 on . = 10..alter sequence CREATE GENERATOR drop sequence  restart with -1.nextval from dual.sequence");
    
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
    assertTrue("'" + var22 + "' != '" + "jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1)"+ "'", var22.equals("jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "drop sequence "+ "'", var28.equals("drop sequence "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "null"+ "'", var31.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")"+ "'", var47.equals("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test279");


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
    java.lang.String var15 = var12.getTriggerType();
    var12.setTriggerType("org.firebirdsql.jdbc.FBDriver");
    java.lang.String var18 = org.databene.jdbacl.SQLUtil.ownerDotComponent((org.databene.jdbacl.model.DBObject)var12);
    var12.setWhenClause("org.databene.jdbacl.SQLScriptException: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1: ");
    var12.setTableName("jdbc:h2:mem:VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).DROP SEQUENCE ");
    
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
    assertTrue("'" + var18 + "' != '" + "(\"sequence\" BETWEEN \"sequence\" AND \"sequence\").hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT"+ "'", var18.equals("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\").hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT"));

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test280");


    org.databene.jdbacl.dialect.FirebirdDialect var0 = new org.databene.jdbacl.dialect.FirebirdDialect();
    java.lang.String var3 = var0.renderSetSequenceValue(".", 0L);
    boolean var4 = var0.isSequenceBoundarySupported();
    java.lang.String var6 = var0.renderDropSequence("CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE ");
    java.lang.String var8 = var0.renderDropSequence("alter sequence -1 restart with 1");
    java.lang.String var11 = var0.renderSetSequenceValue("null.jdbc : h2 : mem : hi ! as 10 on.= 10.- identity -.", 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "SET GENERATOR . TO -1"+ "'", var3.equals("SET GENERATOR . TO -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "drop generator CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var6.equals("drop generator CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "drop generator alter sequence -1 restart with 1"+ "'", var8.equals("drop generator alter sequence -1 restart with 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "SET GENERATOR null.jdbc : h2 : mem : hi ! as 10 on.= 10.- identity -. TO -1"+ "'", var11.equals("SET GENERATOR null.jdbc : h2 : mem : hi ! as 10 on.= 10.- identity -. TO -1"));

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test281");


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
    org.databene.jdbacl.model.DefaultDBTable var38 = new org.databene.jdbacl.model.DefaultDBTable();
    var38.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var41 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var42 = var41.getForeignKeyConstraints();
    var38.addReferrer((org.databene.jdbacl.model.DBTable)var41);
    java.lang.String[] var49 = new java.lang.String[] { ""};
    java.lang.String[] var53 = new java.lang.String[] { ""};
    java.lang.String var54 = org.databene.jdbacl.SQLUtil.join("", "", var49, "hi!", "10", var53);
    org.databene.jdbacl.model.DBUniqueConstraint var55 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var41, "select nextval('')", false, var49);
    java.lang.String var56 = var55.toString();
    boolean var57 = var36.isEquivalent((org.databene.jdbacl.model.DBObject)var55);
    org.databene.jdbacl.model.DBTable var58 = var36.getTable();
    var36.setNullable(true);
    java.util.List var61 = var36.getUkConstraints();
    
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
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "hi! as 10 on . = 10."+ "'", var54.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "CONSTRAINT \"select nextval('')\" UNIQUE ()"+ "'", var56.equals("CONSTRAINT \"select nextval('')\" UNIQUE ()"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test282");


    org.databene.jdbacl.sql.parser.SQLParser.drop_index_return var0 = new org.databene.jdbacl.sql.parser.SQLParser.drop_index_return();
    java.lang.Object var1 = var0.getTree();
    java.lang.Object var2 = var0.getTree();
    java.lang.Object var3 = var0.getTree();
    java.lang.Object var4 = var0.getTree();
    java.lang.Object var5 = var0.getTree();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test283");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mT__92();
    var10.mDROP_TABLE();
    var10.mT__124();
    var10.mDROP_TABLE();
    var10.beginResync();
    var10.mT__62();
    var10.match("Sub identity of ():\nnull-identity-VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).DROP SEQUENCE ");
    var10.reset();
    var10.mORA_CONFIGS();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test284");


    org.databene.jdbacl.dialect.PostgreSQLDialect var0 = new org.databene.jdbacl.dialect.PostgreSQLDialect();
    boolean var3 = var0.isDefaultCatalog("", "");
    boolean var4 = var0.supportsRegex();
    boolean var5 = var0.supportsRegex();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test285");


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
    org.databene.jdbacl.model.DBTable var44 = var41.getTable();
    java.lang.String[] var45 = var41.getColumnNames();
    org.databene.jdbacl.model.FKChangeRule var46 = var41.getUpdateRule();
    
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
    assertNotNull(var46);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test286");


    org.databene.jdbacl.sql.ColumnExpression var4 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var7 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var8 = var7.getValue();
    org.databene.jdbacl.sql.ColumnExpression var11 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var12 = var11.getValue();
    org.databene.jdbacl.sql.BetweenExpression var13 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var4, (org.databene.script.Expression)var7, (org.databene.script.Expression)var11);
    org.databene.jdbacl.sql.ColumnExpression var16 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var19 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var20 = var19.getValue();
    org.databene.jdbacl.sql.ColumnExpression var23 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var24 = var23.getValue();
    org.databene.jdbacl.sql.BetweenExpression var25 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var16, (org.databene.script.Expression)var19, (org.databene.script.Expression)var23);
    org.databene.jdbacl.sql.ColumnExpression var28 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var31 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var32 = var31.getValue();
    org.databene.jdbacl.sql.ColumnExpression var35 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var36 = var35.getValue();
    org.databene.jdbacl.sql.BetweenExpression var37 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var28, (org.databene.script.Expression)var31, (org.databene.script.Expression)var35);
    org.databene.jdbacl.sql.BetweenExpression var38 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var11, (org.databene.script.Expression)var19, (org.databene.script.Expression)var31);
    org.databene.jdbacl.sql.ColumnExpression var41 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var44 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var45 = var44.getValue();
    org.databene.jdbacl.sql.ColumnExpression var48 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var49 = var48.getValue();
    org.databene.jdbacl.sql.BetweenExpression var50 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var41, (org.databene.script.Expression)var44, (org.databene.script.Expression)var48);
    org.databene.jdbacl.sql.ColumnExpression var53 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var56 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var57 = var56.getValue();
    org.databene.jdbacl.sql.ColumnExpression var60 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var61 = var60.getValue();
    org.databene.jdbacl.sql.BetweenExpression var62 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var53, (org.databene.script.Expression)var56, (org.databene.script.Expression)var60);
    org.databene.jdbacl.sql.ColumnExpression var65 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    org.databene.jdbacl.sql.ColumnExpression var68 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var69 = var68.getValue();
    org.databene.jdbacl.sql.ColumnExpression var72 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var73 = var72.getValue();
    org.databene.jdbacl.sql.BetweenExpression var74 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var65, (org.databene.script.Expression)var68, (org.databene.script.Expression)var72);
    org.databene.jdbacl.sql.BetweenExpression var75 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var48, (org.databene.script.Expression)var56, (org.databene.script.Expression)var68);
    org.databene.jdbacl.sql.ColumnExpression var78 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var79 = var78.getValue();
    org.databene.jdbacl.dialect.HSQL2Dialect var80 = new org.databene.jdbacl.dialect.HSQL2Dialect();
    java.lang.String var82 = var80.renderFetchSequenceValue("'hi!'");
    var78.setValue("'hi!'");
    org.databene.jdbacl.sql.BetweenExpression var84 = new org.databene.jdbacl.sql.BetweenExpression((org.databene.script.Expression)var38, (org.databene.script.Expression)var68, (org.databene.script.Expression)var78);
    org.databene.script.Expression[] var85 = var38.getTerms();
    org.databene.jdbacl.sql.FunctionInvocation var86 = new org.databene.jdbacl.sql.FunctionInvocation("Identity definition by unique key: select next value for 10", var85);
    org.databene.script.Expression[] var87 = var86.getSourceExpressions();
    org.databene.jdbacl.sql.FunctionInvocation var88 = new org.databene.jdbacl.sql.FunctionInvocation("() = CASE WHEN NOT drop generator sequence ~ 'hi!' THEN alter sequence CREATE GENERATOR drop sequence  restart with -1 ELSE SET GENERATOR alter sequence CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT restart with 1 TO -2 END", var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "sequence"+ "'", var8.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "sequence"+ "'", var12.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "sequence"+ "'", var20.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "sequence"+ "'", var24.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "sequence"+ "'", var32.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "sequence"+ "'", var36.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "sequence"+ "'", var45.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "sequence"+ "'", var49.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "sequence"+ "'", var57.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "sequence"+ "'", var61.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "sequence"+ "'", var69.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "sequence"+ "'", var73.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + "sequence"+ "'", var79.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + "call next value for 'hi!'"+ "'", var82.equals("call next value for 'hi!'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test287");


    org.databene.jdbacl.dialect.DerbyDialect var0 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var2 = var0.isDeterministicIndexName(".");
    boolean var5 = var0.isDefaultSchema("alter sequence call next value for 'hi!' restart with 100", "Identity definition by NK-PK query: VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) = \"sequence\"");
    boolean var8 = var0.isDefaultCatalog("drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)", "select nextval('alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP 'alter sequence hi! restart with 1'')");
    boolean var10 = var0.isDeterministicIndexName("jdbc:hsqldb:mem:jdbc:h2:mem:hi! as 10 on . = 10.-identity-.");
    boolean var12 = var0.isDeterministicIndexName("call next value for select next value for select next value for SET GENERATOR.TO - 1 NOT REGEXP 'hi!'");
    org.databene.jdbacl.model.TableContainerSupport var13 = new org.databene.jdbacl.model.TableContainerSupport();
    java.util.List var15 = var13.getTables(true);
    org.databene.jdbacl.JDBCConnectData var22 = new org.databene.jdbacl.JDBCConnectData("VALUES (NEXT VALUE FOR hi! as 10 on . = 10.)", "hi!", "hi!", "drop generator sequence", "'hi!'", "hi!");
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var23 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter(var22);
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var24 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter(var22);
    org.databene.jdbacl.model.DBCatalog var26 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var27 = var26.getName();
    org.databene.jdbacl.model.Database var28 = var26.getDatabase();
    java.lang.String var29 = var26.getDoc();
    org.databene.jdbacl.dialect.DerbyDialect var31 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var33 = var31.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var34 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var35 = var34.getName();
    java.lang.String var36 = var31.formatValue((java.lang.Object)var34);
    var34.setName("'hi!'");
    java.util.List var39 = var34.getSchemas();
    org.databene.jdbacl.model.DBSchema var40 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var34);
    var26.removeSchema(var40);
    java.util.List var43 = var40.getTables(false);
    org.databene.jdbacl.model.DefaultDBTable var44 = new org.databene.jdbacl.model.DefaultDBTable("drop generator .", var40);
    org.databene.jdbacl.model.jdbc.LazyTable var47 = new org.databene.jdbacl.model.jdbc.LazyTable(var24, var40, "drop generator CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE ", "select nextval('CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT')");
    org.databene.jdbacl.model.DBCatalog var48 = var47.getCatalog();
    var13.addTable((org.databene.jdbacl.model.DBTable)var47);
    java.lang.String var50 = var0.formatValue((java.lang.Object)var47);
    boolean var52 = var0.isDeterministicIndexName("alter sequence CREATE SEQUENCE DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1. restart with 1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "drop generator CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var50.equals("drop generator CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test288");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    var0.mCREATE_TABLE();
    var0.mCOMMENT_TABLE();
    var0.mCREATE_SEQUENCE();
    org.databene.jdbacl.sql.parser.SQLLexer var6 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var6.mCREATE_TABLE();
    var6.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var10 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var12 = var10.LT(10);
    var6.setCharStream((org.antlr.runtime.CharStream)var10);
    int var14 = var10.getLine();
    boolean var16 = var0.mismatchIsUnwantedToken((org.antlr.runtime.IntStream)var10, 1);
    var0.mCOMMENT_COLUMN();
    var0.mCOMMENT_TABLE();
    org.databene.jdbacl.model.TableContainerSupport var19 = new org.databene.jdbacl.model.TableContainerSupport();
    java.util.Collection var20 = var19.getSubContainers();
    java.util.List var22 = var19.getSequences(false);
    org.databene.jdbacl.model.DefaultDBTable var23 = new org.databene.jdbacl.model.DefaultDBTable();
    var23.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var26 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var27 = var26.getForeignKeyConstraints();
    var23.addReferrer((org.databene.jdbacl.model.DBTable)var26);
    java.lang.String[] var34 = new java.lang.String[] { ""};
    java.lang.String[] var38 = new java.lang.String[] { ""};
    java.lang.String var39 = org.databene.jdbacl.SQLUtil.join("", "", var34, "hi!", "10", var38);
    org.databene.jdbacl.model.DBUniqueConstraint var40 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var26, "select nextval('')", false, var34);
    java.lang.String var41 = var40.toString();
    boolean var42 = var40.isNameDeterministic();
    var40.setDoc("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT");
    org.databene.jdbacl.model.jdbc.JDBCDBImporter var53 = new org.databene.jdbacl.model.jdbc.JDBCDBImporter("DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.", "select next value for SET GENERATOR . TO -1", "DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1.", "jdbc:h2:mem:hi! as 10 on . = 10.-identity-.", "10", "hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", "select next value for SET GENERATOR . TO -1", false);
    var53.setSchemaName("alter sequence hi! restart with 1");
    boolean var56 = var40.equals((java.lang.Object)var53);
    org.databene.jdbacl.model.DBTable var57 = var40.getTable();
    var40.addColumnName("Sub identity of ():\nnull");
    java.lang.String var60 = var40.getObjectType();
    org.databene.jdbacl.model.TableContainer var62 = new org.databene.jdbacl.model.TableContainer("");
    boolean var63 = var40.isIdentical((org.databene.jdbacl.model.DBObject)var62);
    var19.addSubContainer(var62);
    java.util.List var65 = var19.getComponents();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var66 = var0.toStrings(var65);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
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
    assertTrue("'" + var41 + "' != '" + "CONSTRAINT \"select nextval('')\" UNIQUE ()"+ "'", var41.equals("CONSTRAINT \"select nextval('')\" UNIQUE ()"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "unique constraint"+ "'", var60.equals("unique constraint"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test289");


    org.databene.jdbacl.model.TableContainer var1 = new org.databene.jdbacl.model.TableContainer("");
    org.databene.jdbacl.model.DBTable var3 = var1.getTable("VALUES (NEXT VALUE FOR CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).) = \"sequence\"");
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
    org.databene.jdbacl.model.DefaultDBTable var26 = new org.databene.jdbacl.model.DefaultDBTable();
    var26.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var29 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var30 = var29.getForeignKeyConstraints();
    var26.addReferrer((org.databene.jdbacl.model.DBTable)var29);
    var8.addReferrer((org.databene.jdbacl.model.DBTable)var26);
    java.util.Collection var33 = var26.getReferrers();
    var1.removeTable((org.databene.jdbacl.model.DBTable)var26);
    org.databene.jdbacl.model.DBSchema var35 = var26.getSchema();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
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
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test290");


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
    java.lang.String var33 = var31.getObjectType();
    java.lang.String var34 = var31.getDoc();
    java.lang.String var35 = var31.toString();
    org.databene.jdbacl.model.DBCatalog var36 = var31.getCatalog();
    org.databene.jdbacl.model.DBSchema var38 = var36.getSchema("select gen_id(DROP SEQUENCE EQUEN RESTRICT, 1) from RDB$DATABASE;");
    
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
    assertTrue("'" + var33 + "' != '" + "table"+ "'", var33.equals("table"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "select nextval('CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT')"+ "'", var34.equals("select nextval('CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT')"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "drop generator CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "+ "'", var35.equals("drop generator CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test291");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mLE();
    var10.mT__111();
    var10.mSIZE();
    var10.mT__107();
    java.lang.String var19 = var10.getText();
    var10.mNULL();
    var10.mT__124();
    var10.reset();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "select next value for SET GENERATOR.TO - 1"+ "'", var19.equals("select next value for SET GENERATOR.TO - 1"));

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test292");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mLE();
    var10.mT__99();
    var10.mT__102();
    var10.mNULL();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test293");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mLE();
    var10.mT__99();
    var10.mT__110();
    var10.mAND();
    var10.mT__76();
    var10.mT__84();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test294");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mARGUMENTS();
    var10.mAND();
    var10.mVALUE_LIST();
    var10.mT__133();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test295");


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
    var76.setVersionColumn(true);
    org.databene.jdbacl.model.DBNotNullConstraint var79 = var76.getNotNullConstraint();
    var76.setVersionColumn(false);
    org.databene.jdbacl.model.DBNotNullConstraint var82 = var76.getNotNullConstraint();
    org.databene.jdbacl.model.DBDataType var83 = var76.getType();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test296");


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
    java.util.Set var94 = var0.entrySet();
    var0.set("UniqueKeyIdentity(drop sequence CREATE SEQUENCE \"hi! as 10 on . = 10.\".\"\" CACHE 100NOORDER)", (java.lang.Object)"drop generator sequence");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test297");


    org.databene.jdbacl.sql.ColumnExpression var2 = new org.databene.jdbacl.sql.ColumnExpression("sequence", true);
    java.lang.Object var3 = var2.getValue();
    org.databene.jdbacl.dialect.HSQL2Dialect var4 = new org.databene.jdbacl.dialect.HSQL2Dialect();
    java.lang.String var6 = var4.renderFetchSequenceValue("'hi!'");
    var2.setValue("'hi!'");
    boolean var8 = var2.isConstant();
    java.lang.Object var9 = var2.getValue();
    java.lang.String var10 = var2.getColumnName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "sequence"+ "'", var3.equals("sequence"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "call next value for 'hi!'"+ "'", var6.equals("call next value for 'hi!'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "'hi!'"+ "'", var9.equals("'hi!'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "'hi!'"+ "'", var10.equals("'hi!'"));

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test298");


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
    boolean var32 = var23.isNullable();
    org.databene.jdbacl.model.DefaultDBTable var35 = new org.databene.jdbacl.model.DefaultDBTable();
    var35.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var38 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var39 = var38.getForeignKeyConstraints();
    var35.addReferrer((org.databene.jdbacl.model.DBTable)var38);
    java.lang.String[] var46 = new java.lang.String[] { ""};
    java.lang.String[] var50 = new java.lang.String[] { ""};
    java.lang.String var51 = org.databene.jdbacl.SQLUtil.join("", "", var46, "hi!", "10", var50);
    org.databene.jdbacl.model.DBUniqueConstraint var52 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var38, "select nextval('')", false, var46);
    java.lang.String var53 = var52.toString();
    boolean var54 = var52.isNameDeterministic();
    org.databene.jdbacl.model.DBUniqueIndex var55 = new org.databene.jdbacl.model.DBUniqueIndex("select next value for SET GENERATOR . TO -1", false, var52);
    java.lang.String var56 = var52.toString();
    java.lang.String var57 = var52.toString();
    var23.addUkConstraint(var52);
    org.databene.jdbacl.model.DefaultDBTable var60 = new org.databene.jdbacl.model.DefaultDBTable("select next value for SET GENERATOR . TO -1");
    org.databene.jdbacl.model.DefaultDBTable var61 = new org.databene.jdbacl.model.DefaultDBTable();
    var61.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var64 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var65 = var64.getForeignKeyConstraints();
    var61.addReferrer((org.databene.jdbacl.model.DBTable)var64);
    java.lang.String[] var72 = new java.lang.String[] { ""};
    java.lang.String[] var76 = new java.lang.String[] { ""};
    java.lang.String var77 = org.databene.jdbacl.SQLUtil.join("", "", var72, "hi!", "10", var76);
    org.databene.jdbacl.model.DBUniqueConstraint var78 = new org.databene.jdbacl.model.DBUniqueConstraint((org.databene.jdbacl.model.DBTable)var64, "select nextval('')", false, var72);
    java.lang.String var79 = var78.toString();
    boolean var80 = var78.isNameDeterministic();
    var60.addUniqueConstraint(var78);
    java.lang.String[] var82 = var78.getColumnNames();
    java.lang.String var83 = var78.getName();
    var23.addUkConstraint(var78);
    var78.addColumnName("alter sequence alter sequence CREATE GENERATOR drop sequence  restart with 10 restart with 0");
    
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
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi! as 10 on . = 10."+ "'", var51.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "CONSTRAINT \"select nextval('')\" UNIQUE ()"+ "'", var53.equals("CONSTRAINT \"select nextval('')\" UNIQUE ()"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "CONSTRAINT \"select nextval('')\" UNIQUE ()"+ "'", var56.equals("CONSTRAINT \"select nextval('')\" UNIQUE ()"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "CONSTRAINT \"select nextval('')\" UNIQUE ()"+ "'", var57.equals("CONSTRAINT \"select nextval('')\" UNIQUE ()"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "hi! as 10 on . = 10."+ "'", var77.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + "CONSTRAINT \"select nextval('')\" UNIQUE ()"+ "'", var79.equals("CONSTRAINT \"select nextval('')\" UNIQUE ()"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var83 + "' != '" + "select nextval('')"+ "'", var83.equals("select nextval('')"));

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test299");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mT__65();
    var10.mPLUS();
    var10.mT__62();
    var10.mPERCENT();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test300");


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
    java.util.List var18 = var15.getSequences(true);
    org.databene.jdbacl.dialect.DerbyDialect var22 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var24 = var22.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var25 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var26 = var25.getName();
    java.lang.String var27 = var22.formatValue((java.lang.Object)var25);
    var25.setName("'hi!'");
    java.util.List var30 = var25.getSchemas();
    org.databene.jdbacl.model.DBSchema var31 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var25);
    org.databene.jdbacl.model.DBTrigger var32 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var31);
    java.util.List var33 = var31.getPackages();
    org.databene.jdbacl.model.DBPackage var34 = new org.databene.jdbacl.model.DBPackage("CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).", var31);
    java.util.List var35 = var34.getComponents();
    var15.addPackage(var34);
    java.lang.String var37 = var34.getSubObjectName();
    var34.setDataObjectId("drop sequence 10");
    java.util.List var40 = var34.getProcedures();
    org.databene.jdbacl.dialect.DerbyDialect var45 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var47 = var45.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var48 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var49 = var48.getName();
    java.lang.String var50 = var45.formatValue((java.lang.Object)var48);
    var48.setName("'hi!'");
    java.util.List var53 = var48.getSchemas();
    org.databene.jdbacl.model.DBSchema var54 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var48);
    org.databene.jdbacl.model.DBTrigger var55 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var54);
    java.util.List var56 = var54.getPackages();
    org.databene.jdbacl.model.DBPackage var57 = new org.databene.jdbacl.model.DBPackage("CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).", var54);
    java.util.List var58 = var57.getComponents();
    org.databene.jdbacl.model.DBProcedure var59 = new org.databene.jdbacl.model.DBProcedure("CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var57);
    java.lang.String var60 = var59.getSubProgramId();
    var59.setSubProgramId("jdbc:h2:mem:select next value for 10");
    var59.setSubProgramId("NOT drop sequence  ~ 'alter sequence  restart with -1'");
    var59.setSubProgramId("org.databene.jdbacl.SQLScriptException: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1: ");
    java.lang.String var67 = var59.getOverload();
    var59.setSubProgramId("SET GENERATOR org.databene.jdbacl.SQLScriptException: Error in execution of script line 1:  TO 0");
    var34.addProcedure(var59);
    org.databene.jdbacl.model.DBProcedure var71 = new org.databene.jdbacl.model.DBProcedure("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var34);
    var34.setStatus("DROP SEQUENCE NOT drop generator sequence ~ 'hi!' RESTRICT identity by primary key");
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test301");


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
    org.databene.jdbacl.dialect.DerbyDialect var62 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var64 = var62.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var65 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var66 = var65.getName();
    java.lang.String var67 = var62.formatValue((java.lang.Object)var65);
    var65.setName("'hi!'");
    java.util.List var70 = var65.getSchemas();
    org.databene.jdbacl.model.DBSchema var71 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var65);
    org.databene.jdbacl.dialect.DerbyDialect var74 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var76 = var74.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var77 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var78 = var77.getName();
    java.lang.String var79 = var74.formatValue((java.lang.Object)var77);
    var77.setName("'hi!'");
    java.util.List var82 = var77.getSchemas();
    org.databene.jdbacl.model.DBSchema var83 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var77);
    org.databene.jdbacl.model.DBTrigger var84 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var83);
    var71.addTrigger(var84);
    var11.removeSchema(var71);
    org.databene.jdbacl.model.DBSchema var88 = var11.getSchema("CREATE GENERATOR CREATE SEQUENCE SELECT * FROM null WHERE DROP SEQUENCE  = 'hi!' : DROP SEQUENCE ");
    
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
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var88);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test302");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mT__92();
    var10.mDROP_TABLE();
    java.lang.String var17 = var10.getText();
    var10.mT__95();
    var10.mIN();
    var10.mT__70();
    var10.mT__79();
    var10.match("hi! as 10 on . = 10..NOT drop generator sequence ~ 'hi!', hi! as 10 on . = 10..alter sequence CREATE GENERATOR drop sequence  restart with -1");
    var10.mT__62();
    var10.mT__102();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "select next value for SET GENERATOR.TO - 1"+ "'", var17.equals("select next value for SET GENERATOR.TO - 1"));

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test303");


    org.databene.jdbacl.dialect.H2Dialect var0 = new org.databene.jdbacl.dialect.H2Dialect();
    java.lang.String var2 = var0.renderFetchSequenceValue("10");
    java.lang.String var5 = var0.setSequenceValue("CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", 1L);
    boolean var7 = var0.isDeterministicIndexName("jdbc:h2:mem:hi! as 10 on . = 10.");
    boolean var9 = var0.isDeterministicIndexName("NOT () SIMILAR TO 'jdbc:hsqldb:mem:call next value for 'hi!' identity by primary key' ~ 'alter sequence hi! restart with 1'");
    java.lang.String var11 = var0.renderFetchSequenceValue("alter sequence drop sequence 10 restart with 0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "select next value for 10"+ "'", var2.equals("select next value for 10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "alter sequence CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT restart with 1"+ "'", var5.equals("alter sequence CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT restart with 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "select next value for alter sequence drop sequence 10 restart with 0"+ "'", var11.equals("select next value for alter sequence drop sequence 10 restart with 0"));

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test304");


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
    var21.setNullable(true);
    var21.setFractionDigits((java.lang.Integer)69);
    java.lang.String var48 = var21.toString();
    java.lang.String var49 = var21.getDoc();
    java.util.List var50 = var21.getUkConstraints();
    
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
    assertTrue("'" + var48 + "' != '" + "jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,69)"+ "'", var48.equals("jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,69)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test305");


    org.databene.jdbacl.dialect.MySQLDialect var0 = new org.databene.jdbacl.dialect.MySQLDialect();
    boolean var2 = var0.isDeterministicUKName("call next value for 'hi!'");
    boolean var4 = var0.isDeterministicPKName("alter sequence CREATE SEQUENCE DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT join select next value for SET GENERATOR . TO -1 as select next value for SET GENERATOR . TO -1 on CREATE SEQUENCE 10.DROP SEQUENCE  = select next value for SET GENERATOR . TO -1. restart with 1");
    boolean var7 = var0.isDefaultCatalog("jdbc:h2:mem:drop generator CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", "select hi! as 10 on . = 10..NOT drop generator sequence ~ 'hi!', hi! as 10 on . = 10..alter sequence CREATE GENERATOR drop sequence  restart with -1.nextval from dual");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test306");


    java.lang.String[] var4 = new java.lang.String[] { ""};
    java.lang.String[] var8 = new java.lang.String[] { ""};
    java.lang.String var9 = org.databene.jdbacl.SQLUtil.join("", "", var4, "hi!", "10", var8);
    org.databene.jdbacl.identity.IdentityProvider var10 = new org.databene.jdbacl.identity.IdentityProvider();
    org.databene.jdbacl.identity.SubNkPkQueryIdentity var11 = new org.databene.jdbacl.identity.SubNkPkQueryIdentity("null", var4, var10);
    org.databene.jdbacl.identity.xml.IdentityParseContext var12 = new org.databene.jdbacl.identity.xml.IdentityParseContext(var10);
    var12.remove("drop sequence 10");
    org.databene.jdbacl.identity.IdentityProvider var15 = var12.getIdentityProvider();
    org.databene.jdbacl.identity.NkPkQueryIdentity var18 = new org.databene.jdbacl.identity.NkPkQueryIdentity("10", "NkPkQueryIdentity(DROP SEQUENCE -1 RESTRICT)");
    var15.registerIdentity((org.databene.jdbacl.identity.IdentityModel)var18, "alter sequence CREATE GENERATOR drop sequence  restart with -1");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi! as 10 on . = 10."+ "'", var9.equals("hi! as 10 on . = 10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test307");


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
    java.util.List var17 = var15.getProcedures();
    org.databene.jdbacl.dialect.DerbyDialect var22 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var24 = var22.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var25 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var26 = var25.getName();
    java.lang.String var27 = var22.formatValue((java.lang.Object)var25);
    var25.setName("'hi!'");
    java.util.List var30 = var25.getSchemas();
    org.databene.jdbacl.model.DBSchema var31 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var25);
    org.databene.jdbacl.model.DBTrigger var32 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var31);
    java.util.List var33 = var31.getPackages();
    org.databene.jdbacl.model.DBPackage var34 = new org.databene.jdbacl.model.DBPackage("CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).", var31);
    java.util.List var35 = var34.getComponents();
    org.databene.jdbacl.model.DBProcedure var36 = new org.databene.jdbacl.model.DBProcedure("CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var34);
    java.lang.String var37 = var36.getSubProgramId();
    var36.setSubProgramId("jdbc:h2:mem:select next value for 10");
    java.lang.String var40 = var36.getSubProgramId();
    var15.addProcedure(var36);
    var36.setObjectId("call next value for SET GENERATOR org.databene.jdbacl.SQLScriptException: Error in execution of script DROP SEQUENCE jdbc:h2:mem:hi! as 10 on . = 10. RESTRICT line 1:  as null[DROP SEQUENCE ] on DROP SEQUENCE NOT drop generator sequence ~ 'hi!' RESTRICT identity by primary key. = null[DROP SEQUENCE ].DROP SEQUENCE  TO -1 NOT REGEXP 'drop generator drop generator .'");
    var36.setObjectId("select next value for SET GENERATOR.TO - 1");
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "jdbc:h2:mem:select next value for 10"+ "'", var40.equals("jdbc:h2:mem:select next value for 10"));

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test308");


    org.databene.jdbacl.sql.parser.SQLLexer var0 = new org.databene.jdbacl.sql.parser.SQLLexer();
    var0.mCREATE_TABLE();
    var0.mNAME_LIST();
    org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream var4 = new org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream("DROP SEQUENCE ");
    int var6 = var4.LT(10);
    var0.setCharStream((org.antlr.runtime.CharStream)var4);
    int var9 = var4.LA(10);
    org.databene.jdbacl.sql.parser.SQLLexer var10 = new org.databene.jdbacl.sql.parser.SQLLexer((org.antlr.runtime.CharStream)var4);
    var10.setText("select next value for SET GENERATOR.TO - 1");
    var10.setBacktrackingLevel(1);
    var10.mOR();
    java.lang.String var16 = var10.getText();
    var10.mT__114();
    var10.mT__95();
    boolean var19 = var10.failed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "select next value for SET GENERATOR.TO - 1"+ "'", var16.equals("select next value for SET GENERATOR.TO - 1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test309");


    org.databene.jdbacl.model.DBCheckConstraint var4 = new org.databene.jdbacl.model.DBCheckConstraint("column", true, "call next value for select nextval(''alter sequence alter sequence CREATE GENERATOR drop sequence  restart with -1 restart with 0 REGEXP ''alter sequence hi! restart with 1'''')", "\"'hi!'\"");
    org.databene.jdbacl.dialect.DerbyDialect var8 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var10 = var8.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var11 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var12 = var11.getName();
    java.lang.String var13 = var8.formatValue((java.lang.Object)var11);
    var11.setName("'hi!'");
    java.util.List var16 = var11.getSchemas();
    org.databene.jdbacl.model.DBSchema var17 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var11);
    org.databene.jdbacl.model.DBTrigger var18 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var17);
    java.util.List var19 = var17.getPackages();
    org.databene.jdbacl.model.DBPackage var20 = new org.databene.jdbacl.model.DBPackage("CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).", var17);
    java.lang.String var21 = var20.getStatus();
    org.databene.jdbacl.dialect.DerbyDialect var26 = new org.databene.jdbacl.dialect.DerbyDialect();
    boolean var28 = var26.isDeterministicIndexName(".");
    org.databene.jdbacl.model.DBCatalog var29 = new org.databene.jdbacl.model.DBCatalog();
    java.lang.String var30 = var29.getName();
    java.lang.String var31 = var26.formatValue((java.lang.Object)var29);
    var29.setName("'hi!'");
    java.util.List var34 = var29.getSchemas();
    org.databene.jdbacl.model.DBSchema var35 = new org.databene.jdbacl.model.DBSchema("(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")", var29);
    org.databene.jdbacl.model.DBTrigger var36 = new org.databene.jdbacl.model.DBTrigger("hi!-identity-CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var35);
    java.util.List var37 = var35.getPackages();
    org.databene.jdbacl.model.DBPackage var38 = new org.databene.jdbacl.model.DBPackage("CREATE SEQUENCE left join jdbc:h2:mem:hi! as 10 on . = 10.-identity-. : DROP SEQUENCE (0,-1) as drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.) on CREATE SEQUENCE hi! as 10 on . = 10.. AS BIGINT.DROP SEQUENCE . = drop generator VALUES (NEXT VALUE FOR hi! as 10 on . = 10.).", var35);
    java.util.List var39 = var38.getComponents();
    org.databene.jdbacl.model.DBProcedure var40 = new org.databene.jdbacl.model.DBProcedure("CREATE SEQUENCE hi! as 10 on . = 10..10 AS BIGINT", var38);
    java.lang.String var41 = var40.getSubProgramId();
    org.databene.jdbacl.model.DefaultDBTable var43 = new org.databene.jdbacl.model.DefaultDBTable();
    var43.setDoc(".");
    java.util.Set var47 = var43.getUniqueConstraints(false);
    org.databene.jdbacl.model.DBDataType var50 = org.databene.jdbacl.model.DBDataType.getInstance(1, "drop sequence ");
    boolean var51 = var50.isAlpha();
    boolean var52 = var50.isLOB();
    org.databene.jdbacl.model.DefaultDBColumn var55 = new org.databene.jdbacl.model.DefaultDBColumn("NOT drop generator sequence ~ 'hi!'", (org.databene.jdbacl.model.DBTable)var43, var50, (java.lang.Integer)100, (java.lang.Integer)(-1));
    org.databene.jdbacl.model.TableContainer var58 = new org.databene.jdbacl.model.TableContainer("");
    java.util.List var59 = var58.getTables();
    org.databene.jdbacl.model.TableContainer var60 = new org.databene.jdbacl.model.TableContainer("SET GENERATOR . TO -1", (org.databene.jdbacl.model.CompositeDBObject)var58);
    org.databene.jdbacl.model.DefaultDBTable var61 = new org.databene.jdbacl.model.DefaultDBTable();
    var61.setDoc(".");
    org.databene.jdbacl.model.DefaultDBTable var64 = new org.databene.jdbacl.model.DefaultDBTable();
    java.util.Set var65 = var64.getForeignKeyConstraints();
    var61.addReferrer((org.databene.jdbacl.model.DBTable)var64);
    var58.addTable((org.databene.jdbacl.model.DBTable)var64);
    var55.setTable((org.databene.jdbacl.model.DBTable)var64);
    boolean var69 = var40.isIdentical((org.databene.jdbacl.model.DBObject)var64);
    var20.addProcedure(var40);
    java.lang.String var71 = var40.getSubProgramId();
    var40.setObjectId("SET GENERATOR catalog TO -2");
    boolean var74 = var4.isIdentical((org.databene.jdbacl.model.DBObject)var40);
    var40.setObjectId("CREATE GENERATOR drop sequence alter sequence CREATE SEQUENCE \"(\"sequence\" BETWEEN \"sequence\" AND \"sequence\")\".\"NO_ACTION\" restart with 1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);

  }

}
