/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.lavalamp.site;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sf.lavalamp.site.Build;
import net.sf.lavalamp.site.BuildSite;

public class BuildEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sf.lavalamp.site.Build.getIdentity()Ljava/lang/String;: root-Branch
   * 2 net.sf.lavalamp.site.Build.<init>(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Build build0 = new Build(" ");
      String string0 = build0.getIdentity();
      assertEquals(true, build0.isSuccessful());
      assertNotNull(string0);
      assertEquals("<font color='green'> build   successful (null)</font>", build0.toString());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.site.Build.getBuildSite()Lnet/sf/lavalamp/site/BuildSite;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      Build build0 = new Build(" ");
      build0.getBuildSite();
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.site.Build.isSuccessful()Z: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      Build build0 = new Build(" ");
      boolean boolean0 = build0.isSuccessful();
      assertEquals(true, boolean0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.site.Build.setBuildSite(Lnet/sf/lavalamp/site/BuildSite;)V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      Build build0 = new Build(" ");
      build0.setBuildSite((BuildSite) null);
      assertEquals(true, build0.isSuccessful());
      assertEquals("<font color='green'> build   successful (null)</font>", build0.toString());
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * 1 net.sf.lavalamp.site.Build.toString()Ljava/lang/String;: I12 Branch 1 IFEQ L35 - true
   * 2 net.sf.lavalamp.site.Build.setSuccessful(Z)V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      Build build0 = new Build(" ");
      assertEquals(true, build0.isSuccessful());
      
      build0.setSuccessful(false);
      String string0 = build0.toString();
      assertEquals(false, build0.isSuccessful());
      assertEquals("<font color='red'> build   failed (null)</font>", string0);
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * 1 net.sf.lavalamp.site.Build.toString()Ljava/lang/String;: I12 Branch 1 IFEQ L35 - false
   * 2 net.sf.lavalamp.site.Build.<init>(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      Build build0 = new Build(" ");
      String string0 = build0.toString();
      assertEquals("<font color='green'> build   successful (null)</font>", string0);
      assertNotNull(string0);
  }
}
