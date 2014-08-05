/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.lavalamp.site;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.List;
import net.sf.lavalamp.site.Build;
import net.sf.lavalamp.site.Builds;
import net.sf.lavalamp.site.MissingBuildException;

public class BuildsEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sf.lavalamp.site.Builds.getBuilds()Ljava/util/List;: root-Branch
   * 2 net.sf.lavalamp.site.Builds.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Builds builds0 = new Builds();
      List<Build> list0 = builds0.getBuilds();
      assertEquals(true, list0.isEmpty());
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * 1 net.sf.lavalamp.site.Builds.allSuccessful()Z: I9 Branch 1 IFEQ L28 - false
   * 2 net.sf.lavalamp.site.Builds.allSuccessful()Z: I40 Branch 2 IFNE L31 - true
   * 3 net.sf.lavalamp.site.Builds.add(Lnet/sf/lavalamp/site/Build;)V: root-Branch
   * 4 net.sf.lavalamp.site.Builds.allSuccessful()Z: I9 Branch 1 IFEQ L28 - true
   */
  @Test
  public void test1()  throws Throwable  {
      Builds builds0 = new Builds();
      Build build0 = new Build("!$|bdd5ctJ@50i");
      builds0.add(build0);
      boolean boolean0 = builds0.allSuccessful();
      assertEquals(true, boolean0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.site.Builds.allSuccessful()Z: I9 Branch 1 IFEQ L28 - true
   */
  @Test
  public void test2()  throws Throwable  {
      Builds builds0 = new Builds();
      boolean boolean0 = builds0.allSuccessful();
      assertEquals(true, boolean0);
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 net.sf.lavalamp.site.Builds.allSuccessful()Z: I40 Branch 2 IFNE L31 - false
   * 2 net.sf.lavalamp.site.Builds.allSuccessful()Z: I9 Branch 1 IFEQ L28 - false
   */
  @Test
  public void test3()  throws Throwable  {
      Builds builds0 = new Builds();
      Build build0 = new Build("!$|bdd5ctJ@50i");
      builds0.add(build0);
      build0.setSuccessful(false);
      boolean boolean0 = builds0.allSuccessful();
      assertEquals(false, builds0.allSuccessful());
      assertEquals(false, boolean0);
  }

  //Test case number: 4
  /*
   * 3 covered goals:
   * 1 net.sf.lavalamp.site.Builds.getBuild(Ljava/lang/String;)Lnet/sf/lavalamp/site/Build;: I9 Branch 3 IFEQ L39 - false
   * 2 net.sf.lavalamp.site.Builds.getBuild(Ljava/lang/String;)Lnet/sf/lavalamp/site/Build;: I20 Branch 4 IFLE L40 - true
   * 3 net.sf.lavalamp.site.Builds.getBuild(Ljava/lang/String;)Lnet/sf/lavalamp/site/Build;: I9 Branch 3 IFEQ L39 - true
   */
  @Test
  public void test4()  throws Throwable  {
      Builds builds0 = new Builds();
      Build build0 = new Build("!$|bdd5ctJ@50i");
      builds0.add(build0);
      try {
        builds0.getBuild("aWAWceSSVz.$zu (");
        fail("Expecting exception: MissingBuildException");
      } catch(MissingBuildException e) {
        /*
         * aWAWceSSVz.$zu ( not found
         */
      }
  }

  //Test case number: 5
  /*
   * 4 covered goals:
   * 1 net.sf.lavalamp.site.Builds.getBuild(Ljava/lang/String;)Lnet/sf/lavalamp/site/Build;: I20 Branch 4 IFLE L40 - false
   * 2 net.sf.lavalamp.site.Builds.<init>()V: root-Branch
   * 3 net.sf.lavalamp.site.Builds.add(Lnet/sf/lavalamp/site/Build;)V: root-Branch
   * 4 net.sf.lavalamp.site.Builds.getBuild(Ljava/lang/String;)Lnet/sf/lavalamp/site/Build;: I9 Branch 3 IFEQ L39 - false
   */
  @Test
  public void test5()  throws Throwable  {
      Builds builds0 = new Builds();
      Build build0 = new Build("aWAWceSSVz.$zu (");
      builds0.add(build0);
      Build build1 = builds0.getBuild("aWAWceSSVz.$zu (");
      assertEquals("aWAWceSSVz.$zu (", build1.getIdentity());
  }
}