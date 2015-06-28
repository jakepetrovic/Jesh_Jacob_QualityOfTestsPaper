/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.schemaspy.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import net.sourceforge.schemaspy.util.ResourceWriter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class ResourceWriterEvoSuiteTest {

  private static ExecutorService executor; 

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = false; 
    executor = Executors.newCachedThreadPool(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    executor.shutdownNow(); 
  } 

  @Before 
  public void initTestCase(){ 
  } 

  @After 
  public void doneWithTestCase(){ 
  } 


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sourceforge.schemaspy.util.ResourceWriter.writeResource(Ljava/lang/String;Ljava/io/File;)V: I16 Branch 1 IFNONNULL L47 - false
   * 2 net.sourceforge.schemaspy.util.ResourceWriter.getInstance()Lnet/sourceforge/schemaspy/util/ResourceWriter;: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      ResourceWriter resourceWriter0 = ResourceWriter.getInstance();
      File file0 = new File("8NFRo'i2}H");
      File file1 = file0.getAbsoluteFile();
      try {
        resourceWriter0.writeResource("8NFRo'i2}H", file1);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
        /*
         * Resource \"8NFRo'i2}H\" not found
         */
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 net.sourceforge.schemaspy.util.ResourceWriter.writeResource(Ljava/lang/String;Ljava/io/File;)V: I16 Branch 1 IFNONNULL L47 - true
   * 2 net.sourceforge.schemaspy.util.ResourceWriter.<init>()V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          File file0 = new File("");
          File file1 = file0.getAbsoluteFile();
          ResourceWriter resourceWriter0 = new ResourceWriter();
          // Undeclared exception!
          try {
            resourceWriter0.writeResource("", file1);
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (\"java.io.FilePermission\" \"/home/jeshkracht\" \"write\")
             * java.lang.Thread.getStackTrace(Thread.java:1589)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             * java.io.FileOutputStream.<init>(FileOutputStream.java:209)
             * java.io.FileOutputStream.<init>(FileOutputStream.java:171)
             * net.sourceforge.schemaspy.util.ResourceWriter.writeResource(ResourceWriter.java:52)
             * sun.reflect.GeneratedMethodAccessor78.invoke(Unknown Source)
             * sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             * java.lang.reflect.Method.invoke(Method.java:606)
             * org.evosuite.testcase.MethodStatement$1.execute(MethodStatement.java:262)
             * org.evosuite.testcase.AbstractStatement.exceptionHandler(AbstractStatement.java:142)
             * org.evosuite.testcase.MethodStatement.execute(MethodStatement.java:217)
             * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:291)
             * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:44)
             * java.util.concurrent.FutureTask.run(FutureTask.java:262)
             * java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1145)
             * java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:615)
             * java.lang.Thread.run(Thread.java:745)
             */
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }
}
