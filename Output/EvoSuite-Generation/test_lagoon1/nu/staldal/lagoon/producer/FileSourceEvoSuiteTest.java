/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.lagoon.producer;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import nu.staldal.lagoon.core.LagoonException;
import nu.staldal.lagoon.core.Target;
import nu.staldal.lagoon.producer.FileSource;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLFilterImpl;
import org.xml.sax.helpers.XMLReaderAdapter;

public class FileSourceEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.producer.FileSource.init()V: root-Branch
   * 2 nu.staldal.lagoon.producer.FileSource.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      FileSource fileSource0 = new FileSource();
      fileSource0.init();
      assertEquals(0, fileSource0.getPosition());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.producer.FileSource.start(Lorg/xml/sax/ContentHandler;Lnu/staldal/lagoon/core/Target;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      FileSource fileSource0 = new FileSource();
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      XMLReaderAdapter xMLReaderAdapter0 = new XMLReaderAdapter((XMLReader) xMLFilterImpl0);
      // Undeclared exception!
      try {
        fileSource0.start((ContentHandler) xMLReaderAdapter0, (Target) null);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
        /*
         * No SourceManager avaliable
         */
      }
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.producer.FileSource.hasBeenUpdated(J)Z: root-Branch
   * 2 nu.staldal.lagoon.producer.FileSource.<init>()V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      FileSource fileSource0 = new FileSource();
      // Undeclared exception!
      try {
        fileSource0.hasBeenUpdated(0L);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
        /*
         * No SourceManager avaliable
         */
      }
  }
}
