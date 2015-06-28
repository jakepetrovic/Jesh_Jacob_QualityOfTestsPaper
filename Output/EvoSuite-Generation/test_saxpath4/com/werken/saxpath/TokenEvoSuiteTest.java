/*
 * This file was automatically generated by EvoSuite
 */

package com.werken.saxpath;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.werken.saxpath.Token;

public class TokenEvoSuiteTest {


  //Test case number: 0
  /*
   * 6 covered goals:
   * 1 com.werken.saxpath.Token.getTokenType()I: root-Branch
   * 2 com.werken.saxpath.Token.setTokenEnd(I)V: root-Branch
   * 3 com.werken.saxpath.Token.setParseText(Ljava/lang/String;)V: root-Branch
   * 4 com.werken.saxpath.Token.<init>(ILjava/lang/String;II)V: root-Branch
   * 5 com.werken.saxpath.Token.setTokenType(I)V: root-Branch
   * 6 com.werken.saxpath.Token.setTokenBegin(I)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Token token0 = new Token(1, "", 1, 1);
      int int0 = token0.getTokenType();
      assertEquals(1, token0.getTokenBegin());
      assertEquals(1, token0.getTokenEnd());
      assertEquals(1, int0);
  }

  //Test case number: 1
  /*
   * 9 covered goals:
   * 1 com.werken.saxpath.Token.getTokenEnd()I: root-Branch
   * 2 com.werken.saxpath.Token.getTokenText()Ljava/lang/String;: root-Branch
   * 3 com.werken.saxpath.Token.toString()Ljava/lang/String;: root-Branch
   * 4 com.werken.saxpath.Token.getTokenBegin()I: root-Branch
   * 5 com.werken.saxpath.Token.setTokenEnd(I)V: root-Branch
   * 6 com.werken.saxpath.Token.setParseText(Ljava/lang/String;)V: root-Branch
   * 7 com.werken.saxpath.Token.<init>(ILjava/lang/String;II)V: root-Branch
   * 8 com.werken.saxpath.Token.setTokenType(I)V: root-Branch
   * 9 com.werken.saxpath.Token.setTokenBegin(I)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      Token token0 = new Token(0, "p$.? Kop.98b4FR", (-658), 0);
      // Undeclared exception!
      try {
        token0.toString();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      } catch(StringIndexOutOfBoundsException e) {
        /*
         * String index out of range: -658
         */
      }
  }
}
