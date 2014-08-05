/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.lagoon.producer;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.io.IOException;
import nu.staldal.lagoon.producer.MyInputStream;

public class MyInputStreamEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 nu.staldal.lagoon.producer.MyInputStream.avaliable()I: I4 Branch 1 IFNE L201 - true
   * 2 nu.staldal.lagoon.producer.MyInputStream.eof()V: root-Branch
   * 3 nu.staldal.lagoon.producer.MyInputStream.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      MyInputStream myInputStream0 = new MyInputStream();
      myInputStream0.eof();
      myInputStream0.avaliable();
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * 1 nu.staldal.lagoon.producer.MyInputStream.read()I: I4 Branch 3 IFEQ L213 - true
   * 2 nu.staldal.lagoon.producer.MyInputStream.read()I: I14 Branch 4 IFEQ L214 - false
   * 3 nu.staldal.lagoon.producer.MyInputStream.eof()V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      MyInputStream myInputStream0 = new MyInputStream();
      myInputStream0.eof();
      byte[] byteArray0 = new byte[1];
      myInputStream0.read(byteArray0);
  }

  //Test case number: 2
  /*
   * 7 covered goals:
   * 1 nu.staldal.lagoon.producer.MyInputStream.read()I: I14 Branch 4 IFEQ L214 - true
   * 2 nu.staldal.lagoon.producer.MyInputStream.read()I: I22 Branch 5 IF_ICMPNE L216 - true
   * 3 nu.staldal.lagoon.producer.MyInputStream.deliver(I)V: I4 Branch 7 IFEQ L241 - true
   * 4 nu.staldal.lagoon.producer.MyInputStream.deliver(I)V: I10 Branch 8 IFEQ L242 - true
   * 5 nu.staldal.lagoon.producer.MyInputStream.deliver(I)V: I21 Branch 9 IF_ICMPEQ L244 - true
   * 6 nu.staldal.lagoon.producer.MyInputStream.<init>()V: root-Branch
   * 7 nu.staldal.lagoon.producer.MyInputStream.read()I: I4 Branch 3 IFEQ L213 - true
   */
  @Test
  public void test2()  throws Throwable  {
      MyInputStream myInputStream0 = new MyInputStream();
      myInputStream0.deliver(1279);
      myInputStream0.read();
  }
}