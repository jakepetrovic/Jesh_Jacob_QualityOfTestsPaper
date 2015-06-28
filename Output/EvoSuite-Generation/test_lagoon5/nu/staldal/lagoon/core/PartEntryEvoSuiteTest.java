/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.lagoon.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.io.File;
import nu.staldal.lagoon.core.LagoonException;
import nu.staldal.lagoon.core.LagoonProcessor;
import nu.staldal.lagoon.core.PartEntry;
import nu.staldal.lagoon.core.Sitemap;
import nu.staldal.lagoon.core.XMLStreamProducer;
import nu.staldal.lagoon.producer.LSSITransformer;

public class PartEntryEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.core.PartEntry.setMyProducer(Lnu/staldal/lagoon/core/XMLStreamProducer;)V: root-Branch
   * 2 nu.staldal.lagoon.core.PartEntry.<init>(Lnu/staldal/lagoon/core/LagoonProcessor;Lnu/staldal/lagoon/core/Sitemap;Ljava/lang/String;Ljava/io/File;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      File file0 = new File("http://javax.xml.transform.stream.StreamSource/feature");
      PartEntry partEntry0 = new PartEntry((LagoonProcessor) null, (Sitemap) null, "http://javax.xml.transform.stream.StreamSource/feature", file0);
      LSSITransformer lSSITransformer0 = new LSSITransformer();
      partEntry0.setMyProducer((XMLStreamProducer) lSSITransformer0);
      assertEquals(0, lSSITransformer0.getPosition());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.core.PartEntry.getXMLProducer()Lnu/staldal/lagoon/core/XMLStreamProducer;: root-Branch
   * 2 nu.staldal.lagoon.core.PartEntry.<init>(Lnu/staldal/lagoon/core/LagoonProcessor;Lnu/staldal/lagoon/core/Sitemap;Ljava/lang/String;Ljava/io/File;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      File file0 = new File("http://javax.xml.transform.stream.StreamSource/feature");
      PartEntry partEntry0 = new PartEntry((LagoonProcessor) null, (Sitemap) null, "http://javax.xml.transform.stream.StreamSource/feature", file0);
      XMLStreamProducer xMLStreamProducer0 = partEntry0.getXMLProducer();
      assertNull(xMLStreamProducer0);
  }
}
