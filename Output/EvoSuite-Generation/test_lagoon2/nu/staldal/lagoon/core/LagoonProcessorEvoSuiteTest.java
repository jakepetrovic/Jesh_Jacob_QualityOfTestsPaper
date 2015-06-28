/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.lagoon.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import nu.staldal.lagoon.core.AuthenticationException;
import nu.staldal.lagoon.core.AuthenticationMissingException;
import nu.staldal.lagoon.core.LagoonException;
import nu.staldal.lagoon.core.LagoonProcessor;
import nu.staldal.xtree.Element;

public class LagoonProcessorEvoSuiteTest {


  //Test case number: 0
  /*
   * 10 covered goals:
   * 1 nu.staldal.lagoon.core.LagoonProcessor.<init>(Ljava/lang/String;Lnu/staldal/xtree/Element;Ljava/io/File;Ljava/lang/String;Ljava/io/PrintWriter;Ljava/io/PrintWriter;)V: I51 Branch 1 IFNONNULL L112 - true
   * 2 nu.staldal.lagoon.core.LagoonProcessor.<init>(Ljava/lang/String;Lnu/staldal/xtree/Element;Ljava/io/File;Ljava/lang/String;Ljava/io/PrintWriter;Ljava/io/PrintWriter;)V: I71 Branch 2 IFEQ L116 - true
   * 3 nu.staldal.lagoon.core.LagoonProcessor.<init>(Ljava/lang/String;Lnu/staldal/xtree/Element;Ljava/io/File;Ljava/lang/String;Ljava/io/PrintWriter;Ljava/io/PrintWriter;)V: I98 Branch 4 IFNE L123 - true
   * 4 nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(Ljava/lang/String;)Lnu/staldal/lagoon/core/FileStorage;: I14 Branch 44 IF_ICMPGE L607 - false
   * 5 nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(Ljava/lang/String;)Lnu/staldal/lagoon/core/FileStorage;: I58 Branch 46 IFNONNULL L622 - false
   * 6 nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(Ljava/lang/String;)Lnu/staldal/lagoon/core/FileStorage;: I68 Branch 47 IF_ACMPNE L625 - false
   * 7 nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(Ljava/lang/String;)Lnu/staldal/lagoon/core/FileStorage;: I94 Branch 48 IFNONNULL L630 - true
   * 8 nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(Ljava/lang/String;)Lnu/staldal/lagoon/core/FileStorage;: I113 Branch 49 IFNONNULL L639 - true
   * 9 nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(Ljava/lang/String;)Lnu/staldal/lagoon/core/FileStorage;: I139 Branch 50 IFNONNULL L644 - true
   * 10 nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(Ljava/lang/String;)Lnu/staldal/lagoon/core/FileStorage;: I169 Branch 51 IFNE L652 - true
   */
  @Test
  public void test0()  throws Throwable  {
      Element element0 = new Element("", "");
      File file0 = new File("");
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      PrintWriter printWriter0 = new PrintWriter((OutputStream) byteArrayOutputStream0, false);
      LagoonProcessor lagoonProcessor0 = null;
      try {
        lagoonProcessor0 = new LagoonProcessor("", element0, file0, "", printWriter0, printWriter0);
        fail("Expecting exception: LagoonException");
      } catch(LagoonException e) {
        /*
         * root element must be <sitemap>
         */
      }
  }

  //Test case number: 1
  /*
   * 7 covered goals:
   * 1 nu.staldal.lagoon.core.LagoonProcessor.<init>(Ljava/lang/String;Lnu/staldal/xtree/Element;Ljava/io/File;Ljava/lang/String;Ljava/io/PrintWriter;Ljava/io/PrintWriter;)V: I71 Branch 2 IFEQ L116 - false
   * 2 nu.staldal.lagoon.core.LagoonProcessor.<init>(Ljava/lang/String;Lnu/staldal/xtree/Element;Ljava/io/File;Ljava/lang/String;Ljava/io/PrintWriter;Ljava/io/PrintWriter;)V: I73 Branch 3 IFNONNULL L116 - true
   * 3 nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(Ljava/lang/String;)Lnu/staldal/lagoon/core/FileStorage;: I14 Branch 44 IF_ICMPGE L607 - true
   * 4 nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(Ljava/lang/String;)Lnu/staldal/lagoon/core/FileStorage;: I46 Branch 45 IFNONNULL L616 - false
   * 5 nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(Ljava/lang/String;)Lnu/staldal/lagoon/core/FileStorage;: I68 Branch 47 IF_ACMPNE L625 - true
   * 6 nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(Ljava/lang/String;)Lnu/staldal/lagoon/core/FileStorage;: I94 Branch 48 IFNONNULL L630 - true
   * 7 nu.staldal.lagoon.core.LagoonProcessor.<init>(Ljava/lang/String;Lnu/staldal/xtree/Element;Ljava/io/File;Ljava/lang/String;Ljava/io/PrintWriter;Ljava/io/PrintWriter;)V: I98 Branch 4 IFNE L123 - true
   */
  @Test
  public void test1()  throws Throwable  {
      Element element0 = new Element("", "");
      File file0 = new File("");
      LagoonProcessor lagoonProcessor0 = null;
      try {
        lagoonProcessor0 = new LagoonProcessor("ftp://", element0, file0, "", (PrintWriter) null, (PrintWriter) null);
        fail("Expecting exception: LagoonException");
      } catch(LagoonException e) {
        /*
         * root element must be <sitemap>
         */
      }
  }

  //Test case number: 2
  /*
   * 11 covered goals:
   * 1 nu.staldal.lagoon.core.LagoonProcessor.<init>(Ljava/lang/String;Lnu/staldal/xtree/Element;Ljava/io/File;Ljava/lang/String;Ljava/io/PrintWriter;Ljava/io/PrintWriter;)V: I98 Branch 4 IFNE L123 - false
   * 2 nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(Ljava/lang/String;)Lnu/staldal/lagoon/core/FileStorage;: I94 Branch 48 IFNONNULL L630 - false
   * 3 nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(Ljava/lang/String;)Lnu/staldal/lagoon/core/FileStorage;: I14 Branch 44 IF_ICMPGE L607 - true
   * 4 nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(Ljava/lang/String;)Lnu/staldal/lagoon/core/FileStorage;: I46 Branch 45 IFNONNULL L616 - false
   * 5 nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(Ljava/lang/String;)Lnu/staldal/lagoon/core/FileStorage;: I58 Branch 46 IFNONNULL L622 - false
   * 6 nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(Ljava/lang/String;)Lnu/staldal/lagoon/core/FileStorage;: I68 Branch 47 IF_ACMPNE L625 - true
   * 7 nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(Ljava/lang/String;)Lnu/staldal/lagoon/core/FileStorage;: I113 Branch 49 IFNONNULL L639 - true
   * 8 nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(Ljava/lang/String;)Lnu/staldal/lagoon/core/FileStorage;: I139 Branch 50 IFNONNULL L644 - true
   * 9 nu.staldal.lagoon.core.LagoonProcessor.createFileStorage(Ljava/lang/String;)Lnu/staldal/lagoon/core/FileStorage;: I169 Branch 51 IFNE L652 - true
   * 10 nu.staldal.lagoon.core.LagoonProcessor.<init>(Ljava/lang/String;Lnu/staldal/xtree/Element;Ljava/io/File;Ljava/lang/String;Ljava/io/PrintWriter;Ljava/io/PrintWriter;)V: I51 Branch 1 IFNONNULL L112 - true
   * 11 nu.staldal.lagoon.core.LagoonProcessor.<init>(Ljava/lang/String;Lnu/staldal/xtree/Element;Ljava/io/File;Ljava/lang/String;Ljava/io/PrintWriter;Ljava/io/PrintWriter;)V: I71 Branch 2 IFEQ L116 - true
   */
  @Test
  public void test2()  throws Throwable  {
      File file0 = new File("J^+.TO|+2O", "J^+.TO|+2O");
      LagoonProcessor lagoonProcessor0 = null;
      try {
        lagoonProcessor0 = new LagoonProcessor("http://javax.xml.transform.sax.SAXSource/feature", (Element) null, file0, "J^+.TO|+2O", (PrintWriter) null, (PrintWriter) null);
        fail("Expecting exception: LagoonException");
      } catch(LagoonException e) {
        /*
         * sourceDir must be an existing directory: J^+.TO|+2O/J^+.TO|+2O
         */
      }
  }
}
