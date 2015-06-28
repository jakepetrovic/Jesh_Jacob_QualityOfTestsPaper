/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.lavalamp.device;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sf.lavalamp.device.DeviceProperties;
import net.sf.lavalamp.device.OnError;
import net.sf.lavalamp.properties.MissingPropertyException;
import net.sf.lavalamp.properties.Off;
import net.sf.lavalamp.site.BuildProperties;

public class DevicePropertiesEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sf.lavalamp.device.DeviceProperties.toString()Ljava/lang/String;: root-Branch
   * 2 net.sf.lavalamp.device.DeviceProperties.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      DeviceProperties deviceProperties0 = new DeviceProperties();
      String string0 = deviceProperties0.toString();
      assertEquals("\n\tdevice=null, className=null,  off=[start=00:00, end=00:00], onError=BLINK, onWhenSuccessful=false, path=nullnull", string0);
      assertNotNull(string0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.device.DeviceProperties.getOnError()Lnet/sf/lavalamp/device/OnError;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      DeviceProperties deviceProperties0 = new DeviceProperties();
      deviceProperties0.getOnError();
      assertEquals("\n\tdevice=null, className=null,  off=[start=00:00, end=00:00], onError=BLINK, onWhenSuccessful=false, path=nullnull", deviceProperties0.toString());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.device.DeviceProperties.isOnWhenSuccessful()Z: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      DeviceProperties deviceProperties0 = new DeviceProperties();
      boolean boolean0 = deviceProperties0.isOnWhenSuccessful();
      assertEquals("\n\tdevice=null, className=null,  off=[start=00:00, end=00:00], onError=BLINK, onWhenSuccessful=false, path=nullnull", deviceProperties0.toString());
      assertEquals(false, boolean0);
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 net.sf.lavalamp.device.DeviceProperties.setOff(Lnet/sf/lavalamp/properties/Off;)V: root-Branch
   * 2 net.sf.lavalamp.device.DeviceProperties.getOff()Lnet/sf/lavalamp/properties/Off;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      DeviceProperties deviceProperties0 = new DeviceProperties();
      Off off0 = deviceProperties0.getOff();
      deviceProperties0.setOff(off0);
      assertEquals("\n\tdevice=null, className=null,  off=[start=00:00, end=00:00], onError=BLINK, onWhenSuccessful=false, path=nullnull", deviceProperties0.toString());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.device.DeviceProperties.getPath()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      DeviceProperties deviceProperties0 = new DeviceProperties();
      deviceProperties0.getPath();
      assertEquals("\n\tdevice=null, className=null,  off=[start=00:00, end=00:00], onError=BLINK, onWhenSuccessful=false, path=nullnull", deviceProperties0.toString());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.device.DeviceProperties.getIdentity()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      DeviceProperties deviceProperties0 = new DeviceProperties();
      deviceProperties0.getIdentity();
      assertEquals("\n\tdevice=null, className=null,  off=[start=00:00, end=00:00], onError=BLINK, onWhenSuccessful=false, path=nullnull", deviceProperties0.toString());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.device.DeviceProperties.setOnWhenSuccessful(Z)V: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      DeviceProperties deviceProperties0 = new DeviceProperties();
      deviceProperties0.setOnWhenSuccessful(false);
      assertEquals("\n\tdevice=null, className=null,  off=[start=00:00, end=00:00], onError=BLINK, onWhenSuccessful=false, path=nullnull", deviceProperties0.toString());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.device.DeviceProperties.setOnError(Lnet/sf/lavalamp/device/OnError;)V: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      DeviceProperties deviceProperties0 = new DeviceProperties();
      OnError onError0 = OnError.BLINK;
      deviceProperties0.setOnError(onError0);
      assertEquals("\n\tdevice=null, className=null,  off=[start=00:00, end=00:00], onError=BLINK, onWhenSuccessful=false, path=nullnull", deviceProperties0.toString());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.device.DeviceProperties.getClassName()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      DeviceProperties deviceProperties0 = new DeviceProperties();
      deviceProperties0.getClassName();
      assertEquals("\n\tdevice=null, className=null,  off=[start=00:00, end=00:00], onError=BLINK, onWhenSuccessful=false, path=nullnull", deviceProperties0.toString());
      assertEquals(false, deviceProperties0.isOnWhenSuccessful());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.device.DeviceProperties.setPath(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test9()  throws Throwable  {
      DeviceProperties deviceProperties0 = new DeviceProperties();
      deviceProperties0.setPath(", onWhenSuccessful=");
      assertEquals("\n\tdevice=null, className=null,  off=[start=00:00, end=00:00], onError=BLINK, onWhenSuccessful=false, path=, onWhenSuccessful=null", deviceProperties0.toString());
  }

  //Test case number: 10
  /*
   * 3 covered goals:
   * 1 net.sf.lavalamp.device.DeviceProperties.check()V: I4 Branch 1 IFNONNULL L33 - true
   * 2 net.sf.lavalamp.device.DeviceProperties.check()V: I16 Branch 2 IFNONNULL L37 - false
   * 3 net.sf.lavalamp.device.DeviceProperties.setIdentity(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test10()  throws Throwable  {
      DeviceProperties deviceProperties0 = new DeviceProperties();
      deviceProperties0.setIdentity("_QdNfR[,ltN<L.i");
      // Undeclared exception!
      try {
        deviceProperties0.check();
        fail("Expecting exception: MissingPropertyException");
      } catch(MissingPropertyException e) {
        /*
         * className must be specified in properties file
         */
      }
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.device.DeviceProperties.getBuildProperties()[Lnet/sf/lavalamp/site/BuildProperties;: root-Branch
   */
  @Test
  public void test11()  throws Throwable  {
      DeviceProperties deviceProperties0 = new DeviceProperties();
      deviceProperties0.getBuildProperties();
      assertEquals("\n\tdevice=null, className=null,  off=[start=00:00, end=00:00], onError=BLINK, onWhenSuccessful=false, path=nullnull", deviceProperties0.toString());
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.device.DeviceProperties.check()V: I4 Branch 1 IFNONNULL L33 - false
   */
  @Test
  public void test12()  throws Throwable  {
      DeviceProperties deviceProperties0 = new DeviceProperties();
      // Undeclared exception!
      try {
        deviceProperties0.check();
        fail("Expecting exception: MissingPropertyException");
      } catch(MissingPropertyException e) {
        /*
         * identity must be specified in properties file
         */
      }
  }

  //Test case number: 13
  /*
   * 8 covered goals:
   * 1 net.sf.lavalamp.device.DeviceProperties.check()V: I39 Branch 3 IF_ICMPGE L42 - true
   * 2 net.sf.lavalamp.device.DeviceProperties.check()V: I39 Branch 3 IF_ICMPGE L42 - false
   * 3 net.sf.lavalamp.device.DeviceProperties.<init>()V: root-Branch
   * 4 net.sf.lavalamp.device.DeviceProperties.setIdentity(Ljava/lang/String;)V: root-Branch
   * 5 net.sf.lavalamp.device.DeviceProperties.setClassName(Ljava/lang/String;)V: root-Branch
   * 6 net.sf.lavalamp.device.DeviceProperties.setBuildProperties([Lnet/sf/lavalamp/site/BuildProperties;)V: root-Branch
   * 7 net.sf.lavalamp.device.DeviceProperties.check()V: I4 Branch 1 IFNONNULL L33 - true
   * 8 net.sf.lavalamp.device.DeviceProperties.check()V: I16 Branch 2 IFNONNULL L37 - true
   */
  @Test
  public void test13()  throws Throwable  {
      DeviceProperties deviceProperties0 = new DeviceProperties();
      deviceProperties0.setClassName("ye$7vps4Z'DSoim{");
      deviceProperties0.setIdentity("ye$7vps4Z'DSoim{");
      BuildProperties[] buildPropertiesArray0 = new BuildProperties[1];
      BuildProperties buildProperties0 = new BuildProperties();
      buildPropertiesArray0[0] = buildProperties0;
      deviceProperties0.setBuildProperties(buildPropertiesArray0);
      buildPropertiesArray0[0].setBuild("");
      deviceProperties0.check();
      assertEquals("\n\tdevice=ye$7vps4Z'DSoim{, className=ye$7vps4Z'DSoim{,  off=[start=00:00, end=00:00], onError=BLINK, onWhenSuccessful=false, path=null[\n\t\tbuildId=,  null]", deviceProperties0.toString());
  }
}
