/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.lavalamp.device;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sf.lavalamp.device.DummyDevice;

public class DummyDeviceEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sf.lavalamp.device.DummyDevice.toString()Ljava/lang/String;: root-Branch
   * 2 net.sf.lavalamp.device.DummyDevice.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      DummyDevice dummyDevice0 = new DummyDevice();
      dummyDevice0.turnOn();
      assertEquals("dummy device null", dummyDevice0.toString());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 net.sf.lavalamp.device.DummyDevice.init()V: root-Branch
   * 2 net.sf.lavalamp.device.DummyDevice.<init>()V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      DummyDevice dummyDevice0 = new DummyDevice();
      dummyDevice0.init();
      assertEquals("dummy device null", dummyDevice0.toString());
  }
}