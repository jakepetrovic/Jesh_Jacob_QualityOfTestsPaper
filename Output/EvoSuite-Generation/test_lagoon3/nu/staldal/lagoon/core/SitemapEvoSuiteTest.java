/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.lagoon.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import nu.staldal.lagoon.core.AuthenticationException;
import nu.staldal.lagoon.core.AuthenticationMissingException;
import nu.staldal.lagoon.core.LagoonException;
import nu.staldal.lagoon.core.LagoonProcessor;
import nu.staldal.xtree.Element;

public class SitemapEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.core.Sitemap.<init>(Lnu/staldal/lagoon/core/LagoonProcessor;Lnu/staldal/xtree/Element;Ljava/io/File;)V: I10 Branch 1 IFGT L90 - false
   */
  @Test
  public void test0()  throws Throwable  {
      Element element0 = new Element("", "");
      File file0 = new File("");
      LagoonProcessor lagoonProcessor0 = null;
      try {
        lagoonProcessor0 = new LagoonProcessor("", element0, file0, "", (PrintWriter) null, (PrintWriter) null);
        fail("Expecting exception: LagoonException");
      } catch(LagoonException e) {
        /*
         * root element must be <sitemap>
         */
      }
  }
}