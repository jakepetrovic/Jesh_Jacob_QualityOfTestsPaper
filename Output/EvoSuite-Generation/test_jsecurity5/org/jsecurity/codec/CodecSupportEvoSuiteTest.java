/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.codec;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.jsecurity.authc.AuthenticationInfo;
import org.jsecurity.authc.AuthenticationToken;
import org.jsecurity.authc.SimpleAuthenticationInfo;
import org.jsecurity.authc.UsernamePasswordToken;
import org.jsecurity.authc.credential.Sha256CredentialsMatcher;
import org.jsecurity.authc.credential.Sha512CredentialsMatcher;
import org.jsecurity.codec.CodecException;
import org.jsecurity.codec.CodecSupport;
import org.jsecurity.crypto.hash.Md2Hash;
import org.jsecurity.crypto.hash.Sha512Hash;

public class CodecSupportEvoSuiteTest {


  //Test case number: 0
  /*
   * 7 covered goals:
   * 1 org.jsecurity.codec.CodecSupport.toString(Ljava/lang/Object;)Ljava/lang/String;: I45 Branch 8 IFEQ L196 - false
   * 2 org.jsecurity.codec.CodecSupport.toBytes(Ljava/lang/String;)[B: root-Branch
   * 3 org.jsecurity.codec.CodecSupport.toBytes(Ljava/lang/String;Ljava/lang/String;)[B: root-Branch
   * 4 org.jsecurity.codec.CodecSupport.<init>()V: root-Branch
   * 5 org.jsecurity.codec.CodecSupport.toString(Ljava/lang/Object;)Ljava/lang/String;: I3 Branch 5 IFNONNULL L188 - true
   * 6 org.jsecurity.codec.CodecSupport.toString(Ljava/lang/Object;)Ljava/lang/String;: I19 Branch 6 IFEQ L192 - true
   * 7 org.jsecurity.codec.CodecSupport.toString(Ljava/lang/Object;)Ljava/lang/String;: I31 Branch 7 IFEQ L194 - true
   */
  @Test
  public void test0()  throws Throwable  {
      Md2Hash md2Hash0 = Md2Hash.fromBase64String("");
      assertNotNull(md2Hash0);
      
      String string0 = md2Hash0.toString((Object) "false");
      assertEquals("", md2Hash0.toString());
      assertNotNull(string0);
      assertEquals("", md2Hash0.toHex());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.jsecurity.codec.CodecSupport.toBytes([CLjava/lang/String;)[B: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      char[] charArray0 = new char[11];
      try {
        CodecSupport.toBytes(charArray0, "De");
        fail("Expecting exception: CodecException");
      } catch(CodecException e) {
        /*
         * Unable to convert source [\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000] to byte array using encoding 'De'
         */
      }
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 org.jsecurity.codec.CodecSupport.toString([BLjava/lang/String;)Ljava/lang/String;: root-Branch
   * 2 org.jsecurity.codec.CodecSupport.toString([B)Ljava/lang/String;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      String string0 = CodecSupport.toString(byteArray0);
      assertEquals("\u0000", string0);
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * 1 org.jsecurity.codec.CodecSupport.toChars([BLjava/lang/String;)[C: root-Branch
   * 2 org.jsecurity.codec.CodecSupport.toChars([B)[C: root-Branch
   * 3 org.jsecurity.codec.CodecSupport.toString([BLjava/lang/String;)Ljava/lang/String;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      char[] charArray0 = CodecSupport.toChars(byteArray0);
      assertNotNull(charArray0);
  }

  //Test case number: 4
  /*
   * 5 covered goals:
   * 1 org.jsecurity.codec.CodecSupport.objectToString(Ljava/lang/Object;)Ljava/lang/String;: root-Branch
   * 2 org.jsecurity.codec.CodecSupport.toString(Ljava/lang/Object;)Ljava/lang/String;: I3 Branch 5 IFNONNULL L188 - true
   * 3 org.jsecurity.codec.CodecSupport.toString(Ljava/lang/Object;)Ljava/lang/String;: I19 Branch 6 IFEQ L192 - true
   * 4 org.jsecurity.codec.CodecSupport.toString(Ljava/lang/Object;)Ljava/lang/String;: I31 Branch 7 IFEQ L194 - true
   * 5 org.jsecurity.codec.CodecSupport.toString(Ljava/lang/Object;)Ljava/lang/String;: I45 Branch 8 IFEQ L196 - true
   */
  @Test
  public void test4()  throws Throwable  {
      Sha512Hash sha512Hash0 = new Sha512Hash();
      String string0 = sha512Hash0.toString((Object) false);
      assertEquals("false", string0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 org.jsecurity.codec.CodecSupport.toBytes(Ljava/lang/Object;)[B: I3 Branch 1 IFNONNULL L160 - false
   */
  @Test
  public void test5()  throws Throwable  {
      Sha512Hash sha512Hash0 = null;
      try {
        sha512Hash0 = new Sha512Hash((Object) null, (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument for byte conversion cannot be null.
         */
      }
  }

  //Test case number: 6
  /*
   * 10 covered goals:
   * 1 org.jsecurity.codec.CodecSupport.toBytes(Ljava/lang/Object;)[B: I42 Branch 4 IFEQ L168 - false
   * 2 org.jsecurity.codec.CodecSupport.toBytes(Ljava/lang/String;)[B: root-Branch
   * 3 org.jsecurity.codec.CodecSupport.toBytes([C)[B: root-Branch
   * 4 org.jsecurity.codec.CodecSupport.objectToBytes(Ljava/lang/Object;)[B: root-Branch
   * 5 org.jsecurity.codec.CodecSupport.toBytes(Ljava/lang/String;Ljava/lang/String;)[B: root-Branch
   * 6 org.jsecurity.codec.CodecSupport.toBytes(Ljava/lang/Object;)[B: I3 Branch 1 IFNONNULL L160 - true
   * 7 org.jsecurity.codec.CodecSupport.toBytes(Ljava/lang/Object;)[B: I19 Branch 2 IFEQ L164 - true
   * 8 org.jsecurity.codec.CodecSupport.toBytes(Ljava/lang/Object;)[B: I30 Branch 3 IFEQ L166 - true
   * 9 org.jsecurity.codec.CodecSupport.toBytes(Ljava/lang/Object;)[B: I30 Branch 3 IFEQ L166 - false
   * 10 org.jsecurity.codec.CodecSupport.toBytes(Ljava/lang/Object;)[B: I42 Branch 4 IFEQ L168 - true
   */
  @Test
  public void test6()  throws Throwable  {
      Sha512CredentialsMatcher sha512CredentialsMatcher0 = new Sha512CredentialsMatcher();
      sha512CredentialsMatcher0.setHashSalted(true);
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "", false);
      Object object0 = new Object();
      SimpleAuthenticationInfo simpleAuthenticationInfo0 = new SimpleAuthenticationInfo((Object) "false", object0, "");
      // Undeclared exception!
      try {
        sha512CredentialsMatcher0.doCredentialsMatch((AuthenticationToken) usernamePasswordToken0, (AuthenticationInfo) simpleAuthenticationInfo0);
        fail("Expecting exception: CodecException");
      } catch(CodecException e) {
        /*
         * The org.jsecurity.authc.credential.Sha512CredentialsMatcher implementation only supports conversion to byte[] if the source is of type byte[], char[] or String.  The instance provided as a method argument is of type [java.lang.Object].  If you would like to convert this argument type to a byte[], you can 1) convert the argument to a byte[], char[] or String yourself and then use that as the method argument or 2) subclass org.jsecurity.authc.credential.Sha512CredentialsMatcher and override the objectToBytes(Object o) method.
         */
      }
  }

  //Test case number: 7
  /*
   * 2 covered goals:
   * 1 org.jsecurity.codec.CodecSupport.toString(Ljava/lang/Object;)Ljava/lang/String;: I3 Branch 5 IFNONNULL L188 - false
   * 2 org.jsecurity.codec.CodecSupport.<init>()V: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      Sha256CredentialsMatcher sha256CredentialsMatcher0 = new Sha256CredentialsMatcher();
      // Undeclared exception!
      try {
        sha256CredentialsMatcher0.toString((Object) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument for String conversion cannot be null.
         */
      }
  }
}
