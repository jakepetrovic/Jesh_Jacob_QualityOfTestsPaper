/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.netweaver.porta.core.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.ApplicationStatus;
import com.sap.netweaver.porta.core.mock.ApplicationMock;
import java.io.File;

public class ApplicationMockEvoSuiteTest {


  //Test case number: 0
  /*
   * 4 covered goals:
   * 1 com.sap.netweaver.porta.core.mock.ApplicationMock.setName(Ljava/lang/String;)V: root-Branch
   * 2 com.sap.netweaver.porta.core.mock.ApplicationMock.<init>(Ljava/io/File;)V: root-Branch
   * 3 com.sap.netweaver.porta.core.mock.ApplicationMock.getTimeStamp()Ljava/lang/String;: root-Branch
   * 4 com.sap.netweaver.porta.core.mock.ApplicationMock.getAppName(Ljava/io/File;)Ljava/lang/String;: I15 Branch 1 IF_ICMPEQ L101 - true
   */
  @Test
  public void test0()  throws Throwable  {
      File file0 = new File("#hOUu", "");
      ApplicationMock applicationMock0 = new ApplicationMock(file0);
      assertNotNull(applicationMock0);
      
      applicationMock0.setName("#hOUu");
      assertEquals("name: '#hOUu', vendor: 'sap.com'|#hOUu|sap.com|7.1003.20140427111438.0000|SAP AG|started", applicationMock0.toString());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 com.sap.netweaver.porta.core.mock.ApplicationMock.getStatus()Lcom/sap/netweaver/porta/core/ApplicationStatus;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      File file0 = new File("#hOUu", "");
      ApplicationMock applicationMock0 = new ApplicationMock(file0);
      assertNotNull(applicationMock0);
      
      applicationMock0.getStatus();
      assertEquals("name: '#hOUu', vendor: 'sap.com'|#hOUu|sap.com|7.1003.20140427111439.0000|SAP AG|started", applicationMock0.toString());
      assertEquals("name: '#hOUu', vendor: 'sap.com'", applicationMock0.getId());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 com.sap.netweaver.porta.core.mock.ApplicationMock.getName()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      File file0 = new File("");
      ApplicationMock applicationMock0 = new ApplicationMock(file0);
      assertNotNull(applicationMock0);
      
      String string0 = applicationMock0.getName();
      assertNotNull(string0);
      assertEquals("name: '', vendor: 'sap.com'||sap.com|7.1003.20140427111440.0000|SAP AG|started", applicationMock0.toString());
      assertEquals("sap.com", applicationMock0.getVendor());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 com.sap.netweaver.porta.core.mock.ApplicationMock.getLocation()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      File file0 = new File("");
      ApplicationMock applicationMock0 = new ApplicationMock(file0);
      assertNotNull(applicationMock0);
      
      String string0 = applicationMock0.getLocation();
      assertNotNull(string0);
      assertEquals("name: '', vendor: 'sap.com'||sap.com|7.1003.20140427111440.0000|SAP AG|started", applicationMock0.toString());
      assertEquals("SAP AG", string0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 com.sap.netweaver.porta.core.mock.ApplicationMock.setVendor(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      File file0 = new File("=mj=;?,{ ");
      ApplicationMock applicationMock0 = new ApplicationMock(file0);
      assertNotNull(applicationMock0);
      
      applicationMock0.setVendor("");
      assertEquals("name: '=mj=;?,{ ', vendor: 'sap.com'|=mj=;?,{ ||7.1003.20140427111441.0000|SAP AG|started", applicationMock0.toString());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 com.sap.netweaver.porta.core.mock.ApplicationMock.setVersion(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      File file0 = new File("");
      ApplicationMock applicationMock0 = new ApplicationMock(file0);
      assertNotNull(applicationMock0);
      
      applicationMock0.setVersion("");
      assertEquals("name: '', vendor: 'sap.com'||sap.com||SAP AG|started", applicationMock0.toString());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 com.sap.netweaver.porta.core.mock.ApplicationMock.hashCode()I: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      File file0 = new File("");
      ApplicationMock applicationMock0 = new ApplicationMock(file0);
      assertNotNull(applicationMock0);
      
      int int0 = applicationMock0.hashCode();
      assertEquals((-132277850), int0);
      assertEquals("name: '', vendor: 'sap.com'||sap.com|7.1003.20140427111442.0000|SAP AG|started", applicationMock0.toString());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 com.sap.netweaver.porta.core.mock.ApplicationMock.setStatus(Lcom/sap/netweaver/porta/core/ApplicationStatus;)V: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      File file0 = new File("=mj=;?,{ ");
      ApplicationMock applicationMock0 = new ApplicationMock(file0);
      assertNotNull(applicationMock0);
      
      ApplicationStatus applicationStatus0 = ApplicationStatus.UNKNOWN;
      applicationMock0.setStatus(applicationStatus0);
      assertEquals("name: '=mj=;?,{ ', vendor: 'sap.com'|=mj=;?,{ |sap.com|7.1003.20140427111442.0000|SAP AG|unknown", applicationMock0.toString());
      assertEquals("name: '=mj=;?,{ ', vendor: 'sap.com'", applicationMock0.getId());
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * 1 com.sap.netweaver.porta.core.mock.ApplicationMock.getVersion()Ljava/lang/String;: root-Branch
   * 2 com.sap.netweaver.porta.core.mock.ApplicationMock.getAppName(Ljava/io/File;)Ljava/lang/String;: I15 Branch 1 IF_ICMPEQ L101 - false
   */
  @Test
  public void test8()  throws Throwable  {
      File file0 = new File(".0000", ".0000");
      ApplicationMock applicationMock0 = new ApplicationMock(file0);
      assertNotNull(applicationMock0);
      
      String string0 = applicationMock0.getVersion();
      assertNotNull(string0);
      assertEquals("name: '', vendor: 'sap.com'||sap.com|7.1003.20140427111443.0000|SAP AG|started", applicationMock0.toString());
      assertEquals("7.1003.20140427111443.0000", string0);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 com.sap.netweaver.porta.core.mock.ApplicationMock.setId(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test9()  throws Throwable  {
      File file0 = new File("=mj=;?,{ ");
      ApplicationMock applicationMock0 = new ApplicationMock(file0);
      assertNotNull(applicationMock0);
      
      applicationMock0.setId("=mj=;?,{ ");
      assertEquals("=mj=;?,{ |=mj=;?,{ |sap.com|7.1003.20140427111443.0000|SAP AG|started", applicationMock0.toString());
      assertEquals("=mj=;?,{ ", applicationMock0.getName());
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 com.sap.netweaver.porta.core.mock.ApplicationMock.setLocation(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test10()  throws Throwable  {
      File file0 = new File("#hOUu", "");
      ApplicationMock applicationMock0 = new ApplicationMock(file0);
      assertEquals("SAP AG", applicationMock0.getLocation());
      assertNotNull(applicationMock0);
      
      applicationMock0.setLocation("");
      assertEquals("name: '#hOUu', vendor: 'sap.com'|#hOUu|sap.com|7.1003.20140427111444.0000||started", applicationMock0.toString());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 com.sap.netweaver.porta.core.mock.ApplicationMock.equals(Ljava/lang/Object;)Z: root-Branch
   */
  @Test
  public void test11()  throws Throwable  {
      File file0 = new File("eyUaap");
      ApplicationMock applicationMock0 = new ApplicationMock(file0);
      assertNotNull(applicationMock0);
      
      // Undeclared exception!
      try {
        applicationMock0.equals((Object) ":");
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * java.lang.String cannot be cast to com.sap.netweaver.porta.core.mock.ApplicationMock
         */
      }
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 com.sap.netweaver.porta.core.mock.ApplicationMock.toString()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test12()  throws Throwable  {
      File file0 = new File("");
      ApplicationMock applicationMock0 = new ApplicationMock(file0);
      assertNotNull(applicationMock0);
      
      String string0 = applicationMock0.toString();
      assertEquals("name: '', vendor: 'sap.com'||sap.com|7.1003.20140427111445.0000|SAP AG|started", string0);
      assertNotNull(string0);
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * 1 com.sap.netweaver.porta.core.mock.ApplicationMock.getId()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test13()  throws Throwable  {
      File file0 = new File("");
      ApplicationMock applicationMock0 = new ApplicationMock(file0);
      assertNotNull(applicationMock0);
      
      String string0 = applicationMock0.getId();
      assertEquals("name: '', vendor: 'sap.com'||sap.com|7.1003.20140427111446.0000|SAP AG|started", applicationMock0.toString());
      assertNotNull(string0);
      assertEquals("name: '', vendor: 'sap.com'", string0);
  }

  //Test case number: 14
  /*
   * 4 covered goals:
   * 1 com.sap.netweaver.porta.core.mock.ApplicationMock.getVendor()Ljava/lang/String;: root-Branch
   * 2 com.sap.netweaver.porta.core.mock.ApplicationMock.<init>(Ljava/io/File;)V: root-Branch
   * 3 com.sap.netweaver.porta.core.mock.ApplicationMock.getTimeStamp()Ljava/lang/String;: root-Branch
   * 4 com.sap.netweaver.porta.core.mock.ApplicationMock.getAppName(Ljava/io/File;)Ljava/lang/String;: I15 Branch 1 IF_ICMPEQ L101 - true
   */
  @Test
  public void test14()  throws Throwable  {
      File file0 = new File("");
      ApplicationMock applicationMock0 = new ApplicationMock(file0);
      assertNotNull(applicationMock0);
      
      String string0 = applicationMock0.getVendor();
      assertNotNull(string0);
      assertEquals("name: '', vendor: 'sap.com'||sap.com|7.1003.20140427111446.0000|SAP AG|started", applicationMock0.toString());
      assertEquals("sap.com", string0);
  }
}
