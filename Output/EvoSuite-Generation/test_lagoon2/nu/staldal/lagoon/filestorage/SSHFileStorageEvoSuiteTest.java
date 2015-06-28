/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.lagoon.filestorage;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import nu.staldal.lagoon.core.LagoonContext;
import nu.staldal.lagoon.filestorage.SSHFileStorage;

public class SSHFileStorageEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.filestorage.SSHFileStorage.isReentrant()Z: root-Branch
   * 2 nu.staldal.lagoon.filestorage.SSHFileStorage.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      SSHFileStorage sSHFileStorage0 = new SSHFileStorage();
      boolean boolean0 = sSHFileStorage0.isReentrant();
      assertEquals(true, boolean0);
  }

  //Test case number: 1
  /*
   * 5 covered goals:
   * 1 nu.staldal.lagoon.filestorage.SSHFileStorage.deleteFile(Ljava/lang/String;)V: root-Branch
   * 2 nu.staldal.lagoon.filestorage.SSHFileStorage.runSSH([Ljava/lang/String;)Ljava/lang/Process;: I6 Branch 1 IFLE L69 - true
   * 3 nu.staldal.lagoon.filestorage.SSHFileStorage.runSSH([Ljava/lang/String;)Ljava/lang/Process;: I56 Branch 2 IFLE L77 - true
   * 4 nu.staldal.lagoon.filestorage.SSHFileStorage.runSSH([Ljava/lang/String;)Ljava/lang/Process;: I76 Branch 3 IFLE L82 - true
   * 5 nu.staldal.lagoon.filestorage.SSHFileStorage.runSSH([Ljava/lang/String;)Ljava/lang/Process;: I92 Branch 4 IFLE L84 - true
   */
  @Test
  public void test1()  throws Throwable  {
      SSHFileStorage sSHFileStorage0 = new SSHFileStorage();
      // Undeclared exception!
      try {
        sSHFileStorage0.deleteFile("qKL{5)mw8^wZ");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.filestorage.SSHFileStorage.close()V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      SSHFileStorage sSHFileStorage0 = new SSHFileStorage();
      // Undeclared exception!
      try {
        sSHFileStorage0.close();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.filestorage.SSHFileStorage.needPassword()Z: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      SSHFileStorage sSHFileStorage0 = new SSHFileStorage();
      boolean boolean0 = sSHFileStorage0.needPassword();
      assertEquals(false, boolean0);
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.filestorage.SSHFileStorage$SSHOutputHandler.commit()V: root-Branch
   * 2 nu.staldal.lagoon.filestorage.SSHFileStorage$SSHOutputHandler.<init>(Lnu/staldal/lagoon/filestorage/SSHFileStorage;Ljava/lang/String;Ljava/lang/Process;Ljava/io/OutputStream;)V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      SSHFileStorage sSHFileStorage0 = new SSHFileStorage();
      SSHFileStorage.SSHOutputHandler sSHFileStorage_SSHOutputHandler0 = sSHFileStorage0.new SSHOutputHandler("Ur7a+D", (Process) null, (OutputStream) null);
      // Undeclared exception!
      try {
        sSHFileStorage_SSHOutputHandler0.commit();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.filestorage.SSHFileStorage$SSHOutputHandler.discard()V: root-Branch
   * 2 nu.staldal.lagoon.filestorage.SSHFileStorage$SSHOutputHandler.<init>(Lnu/staldal/lagoon/filestorage/SSHFileStorage;Ljava/lang/String;Ljava/lang/Process;Ljava/io/OutputStream;)V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      SSHFileStorage sSHFileStorage0 = new SSHFileStorage();
      SSHFileStorage.SSHOutputHandler sSHFileStorage_SSHOutputHandler0 = sSHFileStorage0.new SSHOutputHandler("e[%Q3", (Process) null, (OutputStream) null);
      // Undeclared exception!
      try {
        sSHFileStorage_SSHOutputHandler0.discard();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.filestorage.SSHFileStorage.open(Ljava/lang/String;Lnu/staldal/lagoon/core/LagoonContext;Ljava/lang/String;)V: I6 Branch 5 IFGT L121 - true
   * 2 nu.staldal.lagoon.filestorage.SSHFileStorage.open(Ljava/lang/String;Lnu/staldal/lagoon/core/LagoonContext;Ljava/lang/String;)V: I27 Branch 6 IFGE L126 - false
   */
  @Test
  public void test6()  throws Throwable  {
      SSHFileStorage sSHFileStorage0 = new SSHFileStorage();
      try {
        sSHFileStorage0.open("ssh://*Qvza", (LagoonContext) null, "ssh://*Qvza");
        fail("Expecting exception: MalformedURLException");
      } catch(MalformedURLException e) {
        /*
         * ssh://*Qvza
         */
      }
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.filestorage.SSHFileStorage.open(Ljava/lang/String;Lnu/staldal/lagoon/core/LagoonContext;Ljava/lang/String;)V: I6 Branch 5 IFGT L121 - false
   */
  @Test
  public void test7()  throws Throwable  {
      SSHFileStorage sSHFileStorage0 = new SSHFileStorage();
      try {
        sSHFileStorage0.open("xE.`6J^Y:%[Kx", (LagoonContext) null, "xE.`6J^Y:%[Kx");
        fail("Expecting exception: MalformedURLException");
      } catch(MalformedURLException e) {
        /*
         * xE.`6J^Y:%[Kx
         */
      }
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.filestorage.SSHFileStorage.createFile(Ljava/lang/String;)Lnu/staldal/lagoon/core/OutputHandler;: I25 Branch 18 IFGE L198 - true
   */
  @Test
  public void test8()  throws Throwable  {
      SSHFileStorage sSHFileStorage0 = new SSHFileStorage();
      // Undeclared exception!
      try {
        sSHFileStorage0.createFile("Ch/7");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 9
  /*
   * 6 covered goals:
   * 1 nu.staldal.lagoon.filestorage.SSHFileStorage.createFile(Ljava/lang/String;)Lnu/staldal/lagoon/core/OutputHandler;: I25 Branch 18 IFGE L198 - false
   * 2 nu.staldal.lagoon.filestorage.SSHFileStorage.<init>()V: root-Branch
   * 3 nu.staldal.lagoon.filestorage.SSHFileStorage.runSSH([Ljava/lang/String;)Ljava/lang/Process;: I6 Branch 1 IFLE L69 - true
   * 4 nu.staldal.lagoon.filestorage.SSHFileStorage.runSSH([Ljava/lang/String;)Ljava/lang/Process;: I56 Branch 2 IFLE L77 - true
   * 5 nu.staldal.lagoon.filestorage.SSHFileStorage.runSSH([Ljava/lang/String;)Ljava/lang/Process;: I76 Branch 3 IFLE L82 - true
   * 6 nu.staldal.lagoon.filestorage.SSHFileStorage.runSSH([Ljava/lang/String;)Ljava/lang/Process;: I92 Branch 4 IFLE L84 - true
   */
  @Test
  public void test9()  throws Throwable  {
      SSHFileStorage sSHFileStorage0 = new SSHFileStorage();
      // Undeclared exception!
      try {
        sSHFileStorage0.createFile("x:_d_YEsS");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
