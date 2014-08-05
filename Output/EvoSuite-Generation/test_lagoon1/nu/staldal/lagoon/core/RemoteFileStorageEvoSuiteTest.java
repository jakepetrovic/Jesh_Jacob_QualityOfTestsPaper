/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.lagoon.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.io.IOException;
import nu.staldal.lagoon.filestorage.FTPFileStorage;
import nu.staldal.lagoon.filestorage.SSHFileStorage;

public class RemoteFileStorageEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.core.RemoteFileStorage.closeDateFile()V: root-Branch
   * 2 nu.staldal.lagoon.core.RemoteFileStorage.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      FTPFileStorage fTPFileStorage0 = new FTPFileStorage();
      // Undeclared exception!
      try {
        fTPFileStorage0.close();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.core.RemoteFileStorage.fileModified(Ljava/lang/String;)V: root-Branch
   * 2 nu.staldal.lagoon.core.RemoteFileStorage.<init>()V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      SSHFileStorage sSHFileStorage0 = new SSHFileStorage();
      // Undeclared exception!
      try {
        sSHFileStorage0.fileModified("user.home");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}