/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.lavalamp.application;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sf.lavalamp.application.ApplicationProperties;
import net.sf.lavalamp.device.DeviceProperties;

public class ApplicationPropertiesEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sf.lavalamp.application.ApplicationProperties.setPort(I)V: root-Branch
   * 2 net.sf.lavalamp.application.ApplicationProperties.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      ApplicationProperties applicationProperties0 = new ApplicationProperties();
      applicationProperties0.setPort(9);
      assertEquals("debug=false, port=9, runInterval=30000, null", applicationProperties0.toString());
      assertEquals(9, applicationProperties0.getPort());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.application.ApplicationProperties.getDeviceProperties()[Lnet/sf/lavalamp/device/DeviceProperties;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      ApplicationProperties applicationProperties0 = new ApplicationProperties();
      applicationProperties0.getDeviceProperties();
      assertEquals("debug=false, port=0, runInterval=30000, null", applicationProperties0.toString());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.application.ApplicationProperties.getRunInterval()I: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      ApplicationProperties applicationProperties0 = new ApplicationProperties();
      int int0 = applicationProperties0.getRunInterval();
      assertEquals(30000, int0);
      assertEquals(false, applicationProperties0.isDebug());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.application.ApplicationProperties.isDebug()Z: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      ApplicationProperties applicationProperties0 = new ApplicationProperties();
      boolean boolean0 = applicationProperties0.isDebug();
      assertEquals("debug=false, port=0, runInterval=30000, null", applicationProperties0.toString());
      assertEquals(false, boolean0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.application.ApplicationProperties.toString()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      ApplicationProperties applicationProperties0 = new ApplicationProperties();
      String string0 = applicationProperties0.toString();
      assertNotNull(string0);
      assertEquals("debug=false, port=0, runInterval=30000, null", string0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.application.ApplicationProperties.setDebug(Z)V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      ApplicationProperties applicationProperties0 = new ApplicationProperties();
      applicationProperties0.setDebug(false);
      assertEquals("debug=false, port=0, runInterval=30000, null", applicationProperties0.toString());
      assertEquals(30000, applicationProperties0.getRunInterval());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.application.ApplicationProperties.setRunInterval(I)V: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      ApplicationProperties applicationProperties0 = new ApplicationProperties();
      applicationProperties0.setRunInterval(30000);
      assertEquals("debug=false, port=0, runInterval=30000, null", applicationProperties0.toString());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.application.ApplicationProperties.getPort()I: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      ApplicationProperties applicationProperties0 = new ApplicationProperties();
      int int0 = applicationProperties0.getPort();
      assertEquals(0, int0);
      assertEquals("debug=false, port=0, runInterval=30000, null", applicationProperties0.toString());
  }

  //Test case number: 8
  /*
   * 3 covered goals:
   * 1 net.sf.lavalamp.application.ApplicationProperties.check()V: I15 Branch 1 IF_ICMPGE L15 - false
   * 2 net.sf.lavalamp.application.ApplicationProperties.<init>()V: root-Branch
   * 3 net.sf.lavalamp.application.ApplicationProperties.setDeviceProperties([Lnet/sf/lavalamp/device/DeviceProperties;)V: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      ApplicationProperties applicationProperties0 = new ApplicationProperties();
      DeviceProperties[] devicePropertiesArray0 = new DeviceProperties[1];
      applicationProperties0.setDeviceProperties(devicePropertiesArray0);
      // Undeclared exception!
      try {
        applicationProperties0.check();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}