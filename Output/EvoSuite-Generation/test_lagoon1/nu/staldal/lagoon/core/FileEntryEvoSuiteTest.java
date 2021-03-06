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
import nu.staldal.lagoon.core.FileEntry;

public class FileEntryEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.core.FileEntry$TempOutputHandler.commit()V: root-Branch
   * 2 nu.staldal.lagoon.core.FileEntry$TempOutputHandler.<init>(Ljava/io/File;Ljava/io/OutputStream;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      File file0 = new File(")ukvNTx");
      FileEntry.TempOutputHandler fileEntry_TempOutputHandler0 = new FileEntry.TempOutputHandler(file0, (OutputStream) null);
      // Undeclared exception!
      try {
        fileEntry_TempOutputHandler0.commit();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.core.FileEntry$TempOutputHandler.discard()V: I10 Branch 1 IFNE L618 - false
   * 2 nu.staldal.lagoon.core.FileEntry$TempOutputHandler.<init>(Ljava/io/File;Ljava/io/OutputStream;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      File file0 = new File("J>u-OP68&S~U{");
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      FileEntry.TempOutputHandler fileEntry_TempOutputHandler0 = new FileEntry.TempOutputHandler(file0, (OutputStream) byteArrayOutputStream0);
      fileEntry_TempOutputHandler0.discard();
  }
}
