/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.jndi;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.Properties;
import javax.naming.NamingException;
import javax.naming.NoInitialContextException;
import org.jsecurity.jndi.JndiTemplate;

public class JndiTemplateEvoSuiteTest {


  //Test case number: 0
  /*
   * 6 covered goals:
   * 1 org.jsecurity.jndi.JndiTemplate$1.<init>(Lorg/jsecurity/jndi/JndiTemplate;Ljava/lang/String;)V: root-Branch
   * 2 org.jsecurity.jndi.JndiTemplate.getEnvironment()Ljava/util/Properties;: root-Branch
   * 3 org.jsecurity.jndi.JndiTemplate.<init>()V: root-Branch
   * 4 org.jsecurity.jndi.JndiTemplate.execute(Lorg/jsecurity/jndi/JndiCallback;)Ljava/lang/Object;: root-Branch
   * 5 org.jsecurity.jndi.JndiTemplate.createInitialContext()Ljavax/naming/Context;: I12 Branch 2 IFNULL L121 - true
   * 6 org.jsecurity.jndi.JndiTemplate.lookup(Ljava/lang/String;)Ljava/lang/Object;: I4 Branch 4 IFEQ L141 - true
   */
  @Test
  public void test0()  throws Throwable  {
      JndiTemplate jndiTemplate0 = new JndiTemplate();
      Class<?> class0 = JndiTemplate.class;
      try {
        jndiTemplate0.lookup("", (Class) class0);
        fail("Expecting exception: NoInitialContextException");
      } catch(NoInitialContextException e) {
        /*
         * Need to specify class name in environment or system property, or as an applet parameter, or in an application resource file:  java.naming.factory.initial
         */
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 org.jsecurity.jndi.JndiTemplate.setEnvironment(Ljava/util/Properties;)V: root-Branch
   * 2 org.jsecurity.jndi.JndiTemplate.<init>(Ljava/util/Properties;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      Properties properties0 = new Properties();
      JndiTemplate jndiTemplate0 = new JndiTemplate(properties0);
      jndiTemplate0.setEnvironment(properties0);
      assertEquals(0, properties0.size());
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * 1 org.jsecurity.jndi.JndiTemplate$3.doInContext(Ljavax/naming/Context;)Ljava/lang/Object;: root-Branch
   * 2 org.jsecurity.jndi.JndiTemplate$3.<init>(Lorg/jsecurity/jndi/JndiTemplate;Ljava/lang/String;Ljava/lang/Object;)V: root-Branch
   * 3 org.jsecurity.jndi.JndiTemplate.rebind(Ljava/lang/String;Ljava/lang/Object;)V: I4 Branch 8 IFEQ L208 - true
   */
  @Test
  public void test2()  throws Throwable  {
      JndiTemplate jndiTemplate0 = new JndiTemplate();
      try {
        jndiTemplate0.rebind("", "");
        fail("Expecting exception: NoInitialContextException");
      } catch(NoInitialContextException e) {
        /*
         * Need to specify class name in environment or system property, or as an applet parameter, or in an application resource file:  java.naming.factory.initial
         */
      }
  }

  //Test case number: 3
  /*
   * 5 covered goals:
   * 1 org.jsecurity.jndi.JndiTemplate$2.doInContext(Ljavax/naming/Context;)Ljava/lang/Object;: root-Branch
   * 2 org.jsecurity.jndi.JndiTemplate$2.<init>(Lorg/jsecurity/jndi/JndiTemplate;Ljava/lang/String;Ljava/lang/Object;)V: root-Branch
   * 3 org.jsecurity.jndi.JndiTemplate.bind(Ljava/lang/String;Ljava/lang/Object;)V: I4 Branch 7 IFEQ L188 - true
   * 4 org.jsecurity.jndi.JndiTemplate.<init>()V: root-Branch
   * 5 org.jsecurity.jndi.JndiTemplate.createInitialContext()Ljavax/naming/Context;: I12 Branch 2 IFNULL L121 - true
   */
  @Test
  public void test3()  throws Throwable  {
      JndiTemplate jndiTemplate0 = new JndiTemplate();
      try {
        jndiTemplate0.bind("((Q5%9i0MO$Hzm 9", "((Q5%9i0MO$Hzm 9");
        fail("Expecting exception: NoInitialContextException");
      } catch(NoInitialContextException e) {
        /*
         * Need to specify class name in environment or system property, or as an applet parameter, or in an application resource file:  java.naming.factory.initial
         */
      }
  }

  //Test case number: 4
  /*
   * 9 covered goals:
   * 1 org.jsecurity.jndi.JndiTemplate.createInitialContext()Ljavax/naming/Context;: I29 Branch 3 IFEQ L123 - false
   * 2 org.jsecurity.jndi.JndiTemplate.getEnvironment()Ljava/util/Properties;: root-Branch
   * 3 org.jsecurity.jndi.JndiTemplate.<init>(Ljava/util/Properties;)V: root-Branch
   * 4 org.jsecurity.jndi.JndiTemplate.execute(Lorg/jsecurity/jndi/JndiCallback;)Ljava/lang/Object;: root-Branch
   * 5 org.jsecurity.jndi.JndiTemplate.createInitialContext()Ljavax/naming/Context;: I12 Branch 2 IFNULL L121 - false
   * 6 org.jsecurity.jndi.JndiTemplate.createInitialContext()Ljavax/naming/Context;: I29 Branch 3 IFEQ L123 - true
   * 7 org.jsecurity.jndi.JndiTemplate.unbind(Ljava/lang/String;)V: I4 Branch 9 IFEQ L226 - true
   * 8 org.jsecurity.jndi.JndiTemplate$4.doInContext(Ljavax/naming/Context;)Ljava/lang/Object;: root-Branch
   * 9 org.jsecurity.jndi.JndiTemplate$4.<init>(Lorg/jsecurity/jndi/JndiTemplate;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      Properties properties0 = new Properties();
      JndiTemplate jndiTemplate0 = new JndiTemplate(properties0);
      properties0.put((Object) "{}", (Object) "{}");
      try {
        jndiTemplate0.unbind("");
        fail("Expecting exception: NoInitialContextException");
      } catch(NoInitialContextException e) {
        /*
         * Need to specify class name in environment or system property, or as an applet parameter, or in an application resource file:  java.naming.factory.initial
         */
      }
  }
}
