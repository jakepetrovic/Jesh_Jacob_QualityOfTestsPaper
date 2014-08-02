/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.lavalamp.device;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import net.sf.lavalamp.device.Actions;
import net.sf.lavalamp.device.DeviceProperties;
import net.sf.lavalamp.device.DummyDevice;
import net.sf.lavalamp.device.OnError;
import net.sf.lavalamp.device.Period;
import net.sf.lavalamp.site.Builds;

public class AbstractDeviceEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sf.lavalamp.device.AbstractDevice.setBuilds(Lnet/sf/lavalamp/site/Builds;)V: root-Branch
   * 2 net.sf.lavalamp.device.AbstractDevice.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      DummyDevice dummyDevice0 = new DummyDevice();
      dummyDevice0.setBuilds((Builds) null);
      assertEquals("dummy device null", dummyDevice0.toString());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.device.AbstractDevice.setAlwaysOffPeriod(Lnet/sf/lavalamp/device/Period;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      DummyDevice dummyDevice0 = new DummyDevice();
      dummyDevice0.setAlwaysOffPeriod((Period) null);
      assertEquals("dummy device null", dummyDevice0.toString());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.device.AbstractDevice.getActions()Lnet/sf/lavalamp/device/Actions;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      DummyDevice dummyDevice0 = new DummyDevice();
      Actions actions0 = dummyDevice0.getActions();
      assertNull(actions0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.device.AbstractDevice.turnOff()V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      DummyDevice dummyDevice0 = new DummyDevice();
      dummyDevice0.turnOff();
      assertEquals("dummy device null", dummyDevice0.toString());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.device.AbstractDevice.isAlwaysOff(Ljava/util/Calendar;)Z: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      DummyDevice dummyDevice0 = new DummyDevice();
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(100, 100, 100, 100, 100, 100);
      // Undeclared exception!
      try {
        dummyDevice0.isAlwaysOff((Calendar) gregorianCalendar0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.device.AbstractDevice.turnOn()V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      DummyDevice dummyDevice0 = new DummyDevice();
      dummyDevice0.turnOn();
      assertEquals("dummy device null", dummyDevice0.toString());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.device.AbstractDevice.getBuilds()Lnet/sf/lavalamp/site/Builds;: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      DummyDevice dummyDevice0 = new DummyDevice();
      Builds builds0 = dummyDevice0.getBuilds();
      assertNull(builds0);
  }

  //Test case number: 7
  /*
   * 4 covered goals:
   * 1 net.sf.lavalamp.device.AbstractDevice.makeActions()V: I17 Branch 1 IFEQ L54 - false
   * 2 net.sf.lavalamp.device.AbstractDevice.makeErrorAction()Lnet/sf/lavalamp/device/Action;: I25 Branch 3 IFEQ L71 - true
   * 3 net.sf.lavalamp.device.AbstractDevice.setProperties(Lnet/sf/lavalamp/device/DeviceProperties;)V: root-Branch
   * 4 net.sf.lavalamp.device.AbstractDevice.makeErrorAction()Lnet/sf/lavalamp/device/Action;: I11 Branch 2 IFEQ L69 - true
   */
  @Test
  public void test7()  throws Throwable  {
      DummyDevice dummyDevice0 = new DummyDevice();
      DeviceProperties deviceProperties0 = new DeviceProperties();
      deviceProperties0.setOnWhenSuccessful(true);
      dummyDevice0.setProperties(deviceProperties0);
      assertNull(deviceProperties0.getClassName());
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * 1 net.sf.lavalamp.device.AbstractDevice.makeErrorAction()Lnet/sf/lavalamp/device/Action;: I11 Branch 2 IFEQ L69 - false
   * 2 net.sf.lavalamp.device.AbstractDevice.makeActions()V: I17 Branch 1 IFEQ L54 - true
   */
  @Test
  public void test8()  throws Throwable  {
      DummyDevice dummyDevice0 = new DummyDevice();
      DeviceProperties deviceProperties0 = new DeviceProperties();
      OnError onError0 = OnError.CRASH;
      deviceProperties0.setOnError(onError0);
      dummyDevice0.setProperties(deviceProperties0);
      assertNull(deviceProperties0.getPath());
  }

  //Test case number: 9
  /*
   * 5 covered goals:
   * 1 net.sf.lavalamp.device.AbstractDevice.makeErrorAction()Lnet/sf/lavalamp/device/Action;: I25 Branch 3 IFEQ L71 - false
   * 2 net.sf.lavalamp.device.AbstractDevice.<init>()V: root-Branch
   * 3 net.sf.lavalamp.device.AbstractDevice.setProperties(Lnet/sf/lavalamp/device/DeviceProperties;)V: root-Branch
   * 4 net.sf.lavalamp.device.AbstractDevice.makeActions()V: I17 Branch 1 IFEQ L54 - true
   * 5 net.sf.lavalamp.device.AbstractDevice.makeErrorAction()Lnet/sf/lavalamp/device/Action;: I11 Branch 2 IFEQ L69 - true
   */
  @Test
  public void test9()  throws Throwable  {
      DummyDevice dummyDevice0 = new DummyDevice();
      DeviceProperties deviceProperties0 = new DeviceProperties();
      OnError onError0 = OnError.STATUSQUO;
      deviceProperties0.setOnError(onError0);
      dummyDevice0.setProperties(deviceProperties0);
      assertNull(deviceProperties0.getPath());
  }
}
