/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.jndi;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.nio.charset.CharsetEncoder;
import java.util.Properties;
import javax.naming.NamingException;
import javax.naming.NoInitialContextException;
import org.jsecurity.jndi.JndiLocator;
import org.jsecurity.jndi.JndiTemplate;

public class JndiLocatorEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.jsecurity.jndi.JndiLocator.getJndiEnvironment()Ljava/util/Properties;: root-Branch
   * 2 org.jsecurity.jndi.JndiLocator.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      JndiLocator jndiLocator0 = new JndiLocator();
      jndiLocator0.getJndiEnvironment();
      assertEquals(false, jndiLocator0.isResourceRef());
  }

  //Test case number: 1
  /*
   * 6 covered goals:
   * 1 org.jsecurity.jndi.JndiLocator.lookup(Ljava/lang/String;)Ljava/lang/Object;: root-Branch
   * 2 org.jsecurity.jndi.JndiLocator.getJndiTemplate()Lorg/jsecurity/jndi/JndiTemplate;: root-Branch
   * 3 org.jsecurity.jndi.JndiLocator.isResourceRef()Z: root-Branch
   * 4 org.jsecurity.jndi.JndiLocator.lookup(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;: I3 Branch 2 IFNONNULL L138 - true
   * 5 org.jsecurity.jndi.JndiLocator.lookup(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;: I36 Branch 3 IFGT L147 - true
   * 6 org.jsecurity.jndi.JndiLocator.convertJndiName(Ljava/lang/String;)Ljava/lang/String;: I4 Branch 6 IFEQ L176 - true
   */
  @Test
  public void test1()  throws Throwable  {
      JndiLocator jndiLocator0 = new JndiLocator();
      try {
        jndiLocator0.lookup("java:comp/env/2");
        fail("Expecting exception: NoInitialContextException");
      } catch(NoInitialContextException e) {
        /*
         * Need to specify class name in environment or system property, or as an applet parameter, or in an application resource file:  java.naming.factory.initial
         */
      }
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 org.jsecurity.jndi.JndiLocator.setJndiEnvironment(Ljava/util/Properties;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      JndiLocator jndiLocator0 = new JndiLocator();
      Properties properties0 = new Properties();
      jndiLocator0.setJndiEnvironment(properties0);
      assertEquals(false, jndiLocator0.isResourceRef());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 org.jsecurity.jndi.JndiLocator.setJndiTemplate(Lorg/jsecurity/jndi/JndiTemplate;)V: I4 Branch 1 IFNULL L67 - true
   */
  @Test
  public void test3()  throws Throwable  {
      JndiLocator jndiLocator0 = new JndiLocator();
      jndiLocator0.setJndiTemplate((JndiTemplate) null);
      assertEquals(false, jndiLocator0.isResourceRef());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 org.jsecurity.jndi.JndiLocator.setJndiTemplate(Lorg/jsecurity/jndi/JndiTemplate;)V: I4 Branch 1 IFNULL L67 - false
   */
  @Test
  public void test4()  throws Throwable  {
      JndiLocator jndiLocator0 = new JndiLocator();
      JndiTemplate jndiTemplate0 = jndiLocator0.getJndiTemplate();
      assertNotNull(jndiTemplate0);
      
      jndiLocator0.setJndiTemplate(jndiTemplate0);
      assertEquals(false, jndiLocator0.isResourceRef());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 org.jsecurity.jndi.JndiLocator.lookup(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;: I3 Branch 2 IFNONNULL L138 - false
   */
  @Test
  public void test5()  throws Throwable  {
      JndiLocator jndiLocator0 = new JndiLocator();
      Class<?> class0 = CharsetEncoder.class;
      // Undeclared exception!
      try {
        jndiLocator0.lookup((String) null, (Class) class0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * jndiName argument must not be null
         */
      }
  }

  //Test case number: 6
  /*
   * 6 covered goals:
   * 1 org.jsecurity.jndi.JndiLocator.lookup(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;: I36 Branch 3 IFGT L147 - false
   * 2 org.jsecurity.jndi.JndiLocator.lookup(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;: I41 Branch 4 IFEQ L149 - true
   * 3 org.jsecurity.jndi.JndiLocator.convertJndiName(Ljava/lang/String;)Ljava/lang/String;: I4 Branch 6 IFEQ L176 - false
   * 4 org.jsecurity.jndi.JndiLocator.convertJndiName(Ljava/lang/String;)Ljava/lang/String;: I9 Branch 7 IFGT L176 - false
   * 5 org.jsecurity.jndi.JndiLocator.convertJndiName(Ljava/lang/String;)Ljava/lang/String;: I14 Branch 8 IF_ICMPNE L176 - false
   * 6 org.jsecurity.jndi.JndiLocator.setResourceRef(Z)V: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      JndiLocator jndiLocator0 = new JndiLocator();
      assertEquals(false, jndiLocator0.isResourceRef());
      
      Class<?> class0 = JndiLocator.class;
      jndiLocator0.setResourceRef(true);
      try {
        jndiLocator0.lookup("' s of type [", (Class) class0);
        fail("Expecting exception: NoInitialContextException");
      } catch(NoInitialContextException e) {
        /*
         * Need to specify class name in environment or system property, or as an applet parameter, or in an application resource file:  java.naming.factory.initial
         */
      }
  }

  //Test case number: 7
  /*
   * 5 covered goals:
   * 1 org.jsecurity.jndi.JndiLocator.convertJndiName(Ljava/lang/String;)Ljava/lang/String;: I9 Branch 7 IFGT L176 - true
   * 2 org.jsecurity.jndi.JndiLocator.lookup(Ljava/lang/String;)Ljava/lang/Object;: root-Branch
   * 3 org.jsecurity.jndi.JndiLocator.getJndiTemplate()Lorg/jsecurity/jndi/JndiTemplate;: root-Branch
   * 4 org.jsecurity.jndi.JndiLocator.lookup(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;: I3 Branch 2 IFNONNULL L138 - true
   * 5 org.jsecurity.jndi.JndiLocator.lookup(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;: I36 Branch 3 IFGT L147 - true
   */
  @Test
  public void test7()  throws Throwable  {
      JndiLocator jndiLocator0 = new JndiLocator();
      assertEquals(false, jndiLocator0.isResourceRef());
      
      jndiLocator0.setResourceRef(true);
      try {
        jndiLocator0.lookup("java:comp/env/2");
        fail("Expecting exception: NoInitialContextException");
      } catch(NoInitialContextException e) {
        /*
         * Need to specify class name in environment or system property, or as an applet parameter, or in an application resource file:  java.naming.factory.initial
         */
      }
  }

  //Test case number: 8
  /*
   * 6 covered goals:
   * 1 org.jsecurity.jndi.JndiLocator.convertJndiName(Ljava/lang/String;)Ljava/lang/String;: I14 Branch 8 IF_ICMPNE L176 - true
   * 2 org.jsecurity.jndi.JndiLocator.<init>()V: root-Branch
   * 3 org.jsecurity.jndi.JndiLocator.setResourceRef(Z)V: root-Branch
   * 4 org.jsecurity.jndi.JndiLocator.isResourceRef()Z: root-Branch
   * 5 org.jsecurity.jndi.JndiLocator.convertJndiName(Ljava/lang/String;)Ljava/lang/String;: I4 Branch 6 IFEQ L176 - false
   * 6 org.jsecurity.jndi.JndiLocator.convertJndiName(Ljava/lang/String;)Ljava/lang/String;: I9 Branch 7 IFGT L176 - false
   */
  @Test
  public void test8()  throws Throwable  {
      JndiLocator jndiLocator0 = new JndiLocator();
      assertEquals(false, jndiLocator0.isResourceRef());
      
      jndiLocator0.setResourceRef(true);
      String string0 = jndiLocator0.convertJndiName(".a/lW z:!_5:Qg");
      assertEquals(true, jndiLocator0.isResourceRef());
      assertEquals(".a/lW z:!_5:Qg", string0);
  }
}
