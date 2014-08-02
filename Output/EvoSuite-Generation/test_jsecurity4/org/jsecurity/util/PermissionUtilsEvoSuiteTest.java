/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.Set;
import org.jsecurity.authz.Permission;
import org.jsecurity.authz.permission.PermissionResolver;
import org.jsecurity.authz.permission.WildcardPermissionResolver;
import org.jsecurity.util.PermissionUtils;

public class PermissionUtilsEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 org.jsecurity.util.PermissionUtils.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      PermissionUtils permissionUtils0 = new PermissionUtils();
      assertNotNull(permissionUtils0);
  }

  //Test case number: 1
  /*
   * 5 covered goals:
   * 1 org.jsecurity.util.PermissionUtils.resolveDelimitedPermissions(Ljava/lang/String;Lorg/jsecurity/authz/permission/PermissionResolver;)Ljava/util/Set;: root-Branch
   * 2 org.jsecurity.util.PermissionUtils.toPermissionStrings(Ljava/lang/String;)Ljava/util/Set;: I8 Branch 1 IFNULL L44 - false
   * 3 org.jsecurity.util.PermissionUtils.toPermissionStrings(Ljava/lang/String;)Ljava/util/Set;: I11 Branch 2 IFLE L44 - false
   * 4 org.jsecurity.util.PermissionUtils.resolvePermissions(Ljava/util/Collection;Lorg/jsecurity/authz/permission/PermissionResolver;)Ljava/util/Set;: I16 Branch 3 IFEQ L52 - true
   * 5 org.jsecurity.util.PermissionUtils.resolvePermissions(Ljava/util/Collection;Lorg/jsecurity/authz/permission/PermissionResolver;)Ljava/util/Set;: I16 Branch 3 IFEQ L52 - false
   */
  @Test
  public void test1()  throws Throwable  {
      WildcardPermissionResolver wildcardPermissionResolver0 = new WildcardPermissionResolver();
      Set<Permission> set0 = PermissionUtils.resolveDelimitedPermissions("q6MXcv XG", (PermissionResolver) wildcardPermissionResolver0);
      assertEquals(1, set0.size());
      assertNotNull(set0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 org.jsecurity.util.PermissionUtils.toPermissionStrings(Ljava/lang/String;)Ljava/util/Set;: I8 Branch 1 IFNULL L44 - true
   */
  @Test
  public void test2()  throws Throwable  {
      Set<String> set0 = PermissionUtils.toPermissionStrings("");
      assertNull(set0);
  }
}
