/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.lagoon;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import nu.staldal.lagoon.BuildSitemap;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class BuildSitemapEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.BuildSitemap.processDirectory(Ljava/io/File;Lorg/xml/sax/ContentHandler;)V: I3 Branch 1 IFNONNULL L108 - true
   * 2 nu.staldal.lagoon.BuildSitemap.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      BuildSitemap buildSitemap0 = new BuildSitemap();
      DefaultHandler defaultHandler0 = new DefaultHandler();
      // Undeclared exception!
      try {
        BuildSitemap.processDirectory(buildSitemap0.baseDir, (ContentHandler) defaultHandler0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
