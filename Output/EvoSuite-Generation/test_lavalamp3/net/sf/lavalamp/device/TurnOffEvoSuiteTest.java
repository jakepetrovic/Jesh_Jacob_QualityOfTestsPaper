/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.lavalamp.device;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import net.sf.lavalamp.device.Device;
import net.sf.lavalamp.device.DummyDevice;
import net.sf.lavalamp.device.TurnOff;

public class TurnOffEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sf.lavalamp.device.TurnOff.perform(Ljava/util/List;Lnet/sf/lavalamp/device/Device;)V: root-Branch
   * 2 net.sf.lavalamp.device.TurnOff.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      TurnOff turnOff0 = new TurnOff();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      DummyDevice dummyDevice0 = new DummyDevice();
      turnOff0.perform((List<String>) linkedList0, (Device) dummyDevice0);
      assertEquals(1, linkedList0.size());
      assertEquals("[dummy device null turned off]", linkedList0.toString());
  }
}
