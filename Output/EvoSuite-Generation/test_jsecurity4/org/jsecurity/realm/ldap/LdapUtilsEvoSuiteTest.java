/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.realm.ldap;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.Collection;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.BasicAttribute;
import javax.naming.ldap.InitialLdapContext;
import javax.naming.ldap.LdapContext;
import org.jsecurity.realm.ldap.LdapUtils;

public class LdapUtilsEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 org.jsecurity.realm.ldap.LdapUtils.closeContext(Ljavax/naming/ldap/LdapContext;)V: I3 Branch 1 IFNULL L58 - true
   */
  @Test
  public void test0()  throws Throwable  {
      LdapUtils.closeContext((LdapContext) null);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.jsecurity.realm.ldap.LdapUtils.closeContext(Ljavax/naming/ldap/LdapContext;)V: I3 Branch 1 IFNULL L58 - false
   */
  @Test
  public void test1()  throws Throwable  {
      InitialLdapContext initialLdapContext0 = new InitialLdapContext();
      LdapUtils.closeContext((LdapContext) initialLdapContext0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 org.jsecurity.realm.ldap.LdapUtils.getAllAttributeValues(Ljavax/naming/directory/Attribute;)Ljava/util/Collection;: I14 Branch 3 IFEQ L78 - true
   * 2 org.jsecurity.realm.ldap.LdapUtils.getAllAttributeValues(Ljavax/naming/directory/Attribute;)Ljava/util/Collection;: I14 Branch 3 IFEQ L78 - false
   */
  @Test
  public void test2()  throws Throwable  {
      BasicAttribute basicAttribute0 = new BasicAttribute("", "");
      Collection<String> collection0 = LdapUtils.getAllAttributeValues((Attribute) basicAttribute0);
      assertNotNull(collection0);
      assertEquals(false, collection0.isEmpty());
  }
}
