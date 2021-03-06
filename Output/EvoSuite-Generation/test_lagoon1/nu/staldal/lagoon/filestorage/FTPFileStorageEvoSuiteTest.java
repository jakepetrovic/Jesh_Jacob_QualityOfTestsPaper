/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.lagoon.filestorage;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import nu.staldal.ftp.FTPException;
import nu.staldal.lagoon.core.AuthenticationException;
import nu.staldal.lagoon.core.LagoonContext;
import nu.staldal.lagoon.filestorage.FTPFileStorage;

public class FTPFileStorageEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.filestorage.FTPFileStorage.deleteFile(Ljava/lang/String;)V: root-Branch
   * 2 nu.staldal.lagoon.filestorage.FTPFileStorage.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      FTPFileStorage fTPFileStorage0 = new FTPFileStorage();
      // Undeclared exception!
      try {
        fTPFileStorage0.deleteFile("");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.filestorage.FTPFileStorage.open(Ljava/lang/String;Lnu/staldal/lagoon/core/LagoonContext;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      FTPFileStorage fTPFileStorage0 = new FTPFileStorage();
      try {
        fTPFileStorage0.open("Date file is corrupt", (LagoonContext) null, "Date file is corrupt");
        fail("Expecting exception: MalformedURLException");
      } catch(MalformedURLException e) {
        /*
         * Date file is corrupt
         */
      }
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.filestorage.FTPFileStorage.createFile(Ljava/lang/String;)Lnu/staldal/lagoon/core/OutputHandler;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      FTPFileStorage fTPFileStorage0 = new FTPFileStorage();
      // Undeclared exception!
      try {
        fTPFileStorage0.createFile("");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.filestorage.FTPFileStorage.needPassword()Z: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      FTPFileStorage fTPFileStorage0 = new FTPFileStorage();
      boolean boolean0 = fTPFileStorage0.needPassword();
      assertEquals(true, boolean0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.filestorage.FTPFileStorage.isReentrant()Z: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      FTPFileStorage fTPFileStorage0 = new FTPFileStorage();
      boolean boolean0 = fTPFileStorage0.isReentrant();
      assertEquals(false, boolean0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.filestorage.FTPFileStorage.close()V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      FTPFileStorage fTPFileStorage0 = new FTPFileStorage();
      // Undeclared exception!
      try {
        fTPFileStorage0.close();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 6
  /*
   * 4 covered goals:
   * 1 nu.staldal.lagoon.filestorage.FTPFileStorage$FTPOutputHandler.commit()V: root-Branch
   * 2 nu.staldal.lagoon.filestorage.FTPFileStorage$FTPOutputHandler.discard()V: root-Branch
   * 3 nu.staldal.lagoon.filestorage.FTPFileStorage$FTPOutputHandler.<init>(Lnu/staldal/lagoon/filestorage/FTPFileStorage;Ljava/lang/String;Ljava/io/OutputStream;)V: root-Branch
   * 4 nu.staldal.lagoon.filestorage.FTPFileStorage.<init>()V: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      FTPFileStorage fTPFileStorage0 = new FTPFileStorage();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1905);
      FTPFileStorage.FTPOutputHandler fTPFileStorage_FTPOutputHandler0 = fTPFileStorage0.new FTPOutputHandler("", (OutputStream) byteArrayOutputStream0);
      // Undeclared exception!
      try {
        fTPFileStorage_FTPOutputHandler0.discard();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
