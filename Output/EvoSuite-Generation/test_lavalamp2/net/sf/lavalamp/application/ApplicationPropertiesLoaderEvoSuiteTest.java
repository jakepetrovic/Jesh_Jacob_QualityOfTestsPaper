/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.lavalamp.application;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.io.FileNotFoundException;
import net.sf.lavalamp.application.ApplicationPropertiesLoader;

public class ApplicationPropertiesLoaderEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sf.lavalamp.application.ApplicationPropertiesLoader.load(Ljava/lang/String;)Lnet/sf/lavalamp/application/ApplicationProperties;: root-Branch
   * 2 net.sf.lavalamp.application.ApplicationPropertiesLoader.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      ApplicationPropertiesLoader applicationPropertiesLoader0 = new ApplicationPropertiesLoader();
      // Undeclared exception!
      try {
        applicationPropertiesLoader0.load("@U<uUTxn,~jW6z");
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * org/ho/yaml/Yaml
         */
      }
  }
}
