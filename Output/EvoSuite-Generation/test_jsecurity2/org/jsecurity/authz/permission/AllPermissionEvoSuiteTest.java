/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.authz.permission;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.jsecurity.authz.Permission;
import org.jsecurity.authz.permission.AllPermission;

public class AllPermissionEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.jsecurity.authz.permission.AllPermission.implies(Lorg/jsecurity/authz/Permission;)Z: root-Branch
   * 2 org.jsecurity.authz.permission.AllPermission.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      AllPermission allPermission0 = new AllPermission();
      boolean boolean0 = allPermission0.implies((Permission) null);
      assertEquals(true, boolean0);
  }
}
