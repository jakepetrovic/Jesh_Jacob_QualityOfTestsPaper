/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.lavalamp.application;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sf.lavalamp.LavaLogger;
import net.sf.lavalamp.application.Application;
import net.sf.lavalamp.application.UniversalRunner;
import net.sf.lavalamp.site.Console;

public class UniversalRunnerEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sf.lavalamp.application.UniversalRunner.run([Ljava/lang/String;Lnet/sf/lavalamp/application/Application;Lnet/sf/lavalamp/site/Console;Lnet/sf/lavalamp/LavaLogger;)V: I5 Branch 1 IF_ICMPEQ L22 - true
   * 2 net.sf.lavalamp.application.UniversalRunner.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      UniversalRunner universalRunner0 = new UniversalRunner();
      String[] stringArray0 = new String[1];
      Console console0 = new Console();
      LavaLogger lavaLogger0 = new LavaLogger();
      try {
        universalRunner0.run(stringArray0, (Application) null, console0, lavaLogger0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 net.sf.lavalamp.application.UniversalRunner.run([Ljava/lang/String;Lnet/sf/lavalamp/application/Application;Lnet/sf/lavalamp/site/Console;Lnet/sf/lavalamp/LavaLogger;)V: I5 Branch 1 IF_ICMPEQ L22 - false
   * 2 net.sf.lavalamp.application.UniversalRunner.<init>()V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      UniversalRunner universalRunner0 = new UniversalRunner();
      String[] stringArray0 = new String[3];
      Console console0 = new Console();
      LavaLogger lavaLogger0 = new LavaLogger();
      universalRunner0.run(stringArray0, (Application) null, console0, lavaLogger0);
  }
}
