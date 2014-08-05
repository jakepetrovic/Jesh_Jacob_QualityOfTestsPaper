/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.realm.ldap;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;
import javax.naming.ConfigurationException;
import javax.naming.NamingException;
import org.jsecurity.realm.ldap.DefaultLdapContextFactory;

public class DefaultLdapContextFactoryEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getSystemLdapContext()Ljavax/naming/ldap/LdapContext;: root-Branch
   * 2 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getLdapContext(Ljava/lang/String;Ljava/lang/String;)Ljavax/naming/ldap/LdapContext;: I4 Branch 1 IFNONNULL L203 - false
   * 3 org.jsecurity.realm.ldap.DefaultLdapContextFactory.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      DefaultLdapContextFactory defaultLdapContextFactory0 = new DefaultLdapContextFactory();
      // Undeclared exception!
      try {
        defaultLdapContextFactory0.getSystemLdapContext();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * A search base must be specified.
         */
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.jsecurity.realm.ldap.DefaultLdapContextFactory.setSystemPassword(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      DefaultLdapContextFactory defaultLdapContextFactory0 = new DefaultLdapContextFactory();
      defaultLdapContextFactory0.setSystemPassword("] and username [");
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 org.jsecurity.realm.ldap.DefaultLdapContextFactory.setAuthentication(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      DefaultLdapContextFactory defaultLdapContextFactory0 = new DefaultLdapContextFactory();
      defaultLdapContextFactory0.setAuthentication("");
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 org.jsecurity.realm.ldap.DefaultLdapContextFactory.setReferral(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      DefaultLdapContextFactory defaultLdapContextFactory0 = new DefaultLdapContextFactory();
      defaultLdapContextFactory0.setReferral("4D");
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 org.jsecurity.realm.ldap.DefaultLdapContextFactory.setContextFactoryClassName(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      DefaultLdapContextFactory defaultLdapContextFactory0 = new DefaultLdapContextFactory();
      defaultLdapContextFactory0.setContextFactoryClassName("4D");
  }

  //Test case number: 5
  /*
   * 3 covered goals:
   * 1 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getLdapContext(Ljava/lang/String;Ljava/lang/String;)Ljavax/naming/ldap/LdapContext;: I4 Branch 1 IFNONNULL L203 - true
   * 2 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getLdapContext(Ljava/lang/String;Ljava/lang/String;)Ljavax/naming/ldap/LdapContext;: I16 Branch 2 IFNONNULL L206 - false
   * 3 org.jsecurity.realm.ldap.DefaultLdapContextFactory.setSearchBase(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      DefaultLdapContextFactory defaultLdapContextFactory0 = new DefaultLdapContextFactory();
      defaultLdapContextFactory0.setSearchBase("4D");
      // Undeclared exception!
      try {
        defaultLdapContextFactory0.getSystemLdapContext();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * An LDAP URL must be specified of the form ldap://<hostname>:<port>
         */
      }
  }

  //Test case number: 6
  /*
   * 12 covered goals:
   * 1 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getLdapContext(Ljava/lang/String;Ljava/lang/String;)Ljavax/naming/ldap/LdapContext;: I30 Branch 4 IFNULL L210 - false
   * 2 org.jsecurity.realm.ldap.DefaultLdapContextFactory.setPrincipalSuffix(Ljava/lang/String;)V: root-Branch
   * 3 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getLdapContext(Ljava/lang/String;Ljava/lang/String;)Ljavax/naming/ldap/LdapContext;: I114 Branch 9 IFLE L228 - true
   * 4 org.jsecurity.realm.ldap.DefaultLdapContextFactory.setUrl(Ljava/lang/String;)V: root-Branch
   * 5 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getLdapContext(Ljava/lang/String;Ljava/lang/String;)Ljavax/naming/ldap/LdapContext;: I16 Branch 2 IFNONNULL L206 - true
   * 6 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getLdapContext(Ljava/lang/String;Ljava/lang/String;)Ljavax/naming/ldap/LdapContext;: I27 Branch 3 IFNULL L210 - false
   * 7 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getLdapContext(Ljava/lang/String;Ljava/lang/String;)Ljavax/naming/ldap/LdapContext;: I60 Branch 5 IFNULL L217 - false
   * 8 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getLdapContext(Ljava/lang/String;Ljava/lang/String;)Ljavax/naming/ldap/LdapContext;: I71 Branch 6 IFNULL L220 - false
   * 9 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getLdapContext(Ljava/lang/String;Ljava/lang/String;)Ljavax/naming/ldap/LdapContext;: I107 Branch 7 IFEQ L228 - false
   * 10 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getLdapContext(Ljava/lang/String;Ljava/lang/String;)Ljavax/naming/ldap/LdapContext;: I109 Branch 8 IFNULL L228 - false
   * 11 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getLdapContext(Ljava/lang/String;Ljava/lang/String;)Ljavax/naming/ldap/LdapContext;: I126 Branch 10 IFNULL L233 - true
   * 12 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getLdapContext(Ljava/lang/String;Ljava/lang/String;)Ljavax/naming/ldap/LdapContext;: I137 Branch 11 IFEQ L237 - true
   */
  @Test
  public void test6()  throws Throwable  {
      DefaultLdapContextFactory defaultLdapContextFactory0 = new DefaultLdapContextFactory();
      defaultLdapContextFactory0.setSearchBase("");
      defaultLdapContextFactory0.setUrl("");
      defaultLdapContextFactory0.setPrincipalSuffix("");
      try {
        defaultLdapContextFactory0.getLdapContext("", "");
        fail("Expecting exception: ConfigurationException");
      } catch(ConfigurationException e) {
        /*
         * java.naming.provider.url property does not contain a URL
         */
      }
  }

  //Test case number: 7
  /*
   * 5 covered goals:
   * 1 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getLdapContext(Ljava/lang/String;Ljava/lang/String;)Ljavax/naming/ldap/LdapContext;: I107 Branch 7 IFEQ L228 - true
   * 2 org.jsecurity.realm.ldap.DefaultLdapContextFactory.setUsePooling(Z)V: root-Branch
   * 3 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getLdapContext(Ljava/lang/String;Ljava/lang/String;)Ljavax/naming/ldap/LdapContext;: I27 Branch 3 IFNULL L210 - true
   * 4 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getLdapContext(Ljava/lang/String;Ljava/lang/String;)Ljavax/naming/ldap/LdapContext;: I60 Branch 5 IFNULL L217 - true
   * 5 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getLdapContext(Ljava/lang/String;Ljava/lang/String;)Ljavax/naming/ldap/LdapContext;: I71 Branch 6 IFNULL L220 - true
   */
  @Test
  public void test7()  throws Throwable  {
      DefaultLdapContextFactory defaultLdapContextFactory0 = new DefaultLdapContextFactory();
      defaultLdapContextFactory0.setSearchBase("You have more than one version of '");
      defaultLdapContextFactory0.setUsePooling(false);
      defaultLdapContextFactory0.setUrl("You have more than one version of '");
      try {
        defaultLdapContextFactory0.getSystemLdapContext();
        fail("Expecting exception: NamingException");
      } catch(NamingException e) {
        /*
         * Cannot parse url: '
         */
      }
  }

  //Test case number: 8
  /*
   * 8 covered goals:
   * 1 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getLdapContext(Ljava/lang/String;Ljava/lang/String;)Ljavax/naming/ldap/LdapContext;: I114 Branch 9 IFLE L228 - false
   * 2 org.jsecurity.realm.ldap.DefaultLdapContextFactory.setSystemUsername(Ljava/lang/String;)V: root-Branch
   * 3 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getLdapContext(Ljava/lang/String;Ljava/lang/String;)Ljavax/naming/ldap/LdapContext;: I27 Branch 3 IFNULL L210 - false
   * 4 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getLdapContext(Ljava/lang/String;Ljava/lang/String;)Ljavax/naming/ldap/LdapContext;: I30 Branch 4 IFNULL L210 - true
   * 5 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getLdapContext(Ljava/lang/String;Ljava/lang/String;)Ljavax/naming/ldap/LdapContext;: I60 Branch 5 IFNULL L217 - false
   * 6 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getLdapContext(Ljava/lang/String;Ljava/lang/String;)Ljavax/naming/ldap/LdapContext;: I71 Branch 6 IFNULL L220 - false
   * 7 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getLdapContext(Ljava/lang/String;Ljava/lang/String;)Ljavax/naming/ldap/LdapContext;: I109 Branch 8 IFNULL L228 - false
   * 8 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getLdapContext(Ljava/lang/String;Ljava/lang/String;)Ljavax/naming/ldap/LdapContext;: I126 Branch 10 IFNULL L233 - true
   */
  @Test
  public void test8()  throws Throwable  {
      DefaultLdapContextFactory defaultLdapContextFactory0 = new DefaultLdapContextFactory();
      defaultLdapContextFactory0.setSearchBase("");
      defaultLdapContextFactory0.setUrl("");
      defaultLdapContextFactory0.setSystemUsername("");
      try {
        defaultLdapContextFactory0.getLdapContext("", "");
        fail("Expecting exception: ConfigurationException");
      } catch(ConfigurationException e) {
        /*
         * java.naming.provider.url property does not contain a URL
         */
      }
  }

  //Test case number: 9
  /*
   * 14 covered goals:
   * 1 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getLdapContext(Ljava/lang/String;Ljava/lang/String;)Ljavax/naming/ldap/LdapContext;: I126 Branch 10 IFNULL L233 - false
   * 2 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getSystemLdapContext()Ljavax/naming/ldap/LdapContext;: root-Branch
   * 3 org.jsecurity.realm.ldap.DefaultLdapContextFactory.setAdditionalEnvironment(Ljava/util/Map;)V: root-Branch
   * 4 org.jsecurity.realm.ldap.DefaultLdapContextFactory.<init>()V: root-Branch
   * 5 org.jsecurity.realm.ldap.DefaultLdapContextFactory.setUrl(Ljava/lang/String;)V: root-Branch
   * 6 org.jsecurity.realm.ldap.DefaultLdapContextFactory.setSearchBase(Ljava/lang/String;)V: root-Branch
   * 7 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getLdapContext(Ljava/lang/String;Ljava/lang/String;)Ljavax/naming/ldap/LdapContext;: I4 Branch 1 IFNONNULL L203 - true
   * 8 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getLdapContext(Ljava/lang/String;Ljava/lang/String;)Ljavax/naming/ldap/LdapContext;: I16 Branch 2 IFNONNULL L206 - true
   * 9 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getLdapContext(Ljava/lang/String;Ljava/lang/String;)Ljavax/naming/ldap/LdapContext;: I27 Branch 3 IFNULL L210 - true
   * 10 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getLdapContext(Ljava/lang/String;Ljava/lang/String;)Ljavax/naming/ldap/LdapContext;: I60 Branch 5 IFNULL L217 - true
   * 11 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getLdapContext(Ljava/lang/String;Ljava/lang/String;)Ljavax/naming/ldap/LdapContext;: I71 Branch 6 IFNULL L220 - true
   * 12 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getLdapContext(Ljava/lang/String;Ljava/lang/String;)Ljavax/naming/ldap/LdapContext;: I107 Branch 7 IFEQ L228 - false
   * 13 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getLdapContext(Ljava/lang/String;Ljava/lang/String;)Ljavax/naming/ldap/LdapContext;: I109 Branch 8 IFNULL L228 - true
   * 14 org.jsecurity.realm.ldap.DefaultLdapContextFactory.getLdapContext(Ljava/lang/String;Ljava/lang/String;)Ljavax/naming/ldap/LdapContext;: I137 Branch 11 IFEQ L237 - true
   */
  @Test
  public void test9()  throws Throwable  {
      DefaultLdapContextFactory defaultLdapContextFactory0 = new DefaultLdapContextFactory();
      defaultLdapContextFactory0.setUrl("] and username [");
      defaultLdapContextFactory0.setSearchBase("] and username [");
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      defaultLdapContextFactory0.setAdditionalEnvironment((Map<String, String>) hashMap0);
      try {
        defaultLdapContextFactory0.getSystemLdapContext();
        fail("Expecting exception: NamingException");
      } catch(NamingException e) {
        /*
         * Cannot parse url: [
         */
      }
  }
}