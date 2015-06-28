/*
 * This file was automatically generated by EvoSuite
 */

package com.allenstudio.ir.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.allenstudio.ir.util.XmlElement;
import java.util.Enumeration;
import java.util.Hashtable;

public class XmlElementEvoSuiteTest {


  //Test case number: 0
  /*
   * 14 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.setAttributes(Ljava/util/Hashtable;)V: root-Branch
   * 2 com.allenstudio.ir.util.XmlElement.getAttributes()Ljava/util/Hashtable;: root-Branch
   * 3 com.allenstudio.ir.util.XmlElement.setData(Ljava/lang/String;)V: root-Branch
   * 4 com.allenstudio.ir.util.XmlElement.<init>(Ljava/lang/String;)V: root-Branch
   * 5 com.allenstudio.ir.util.XmlElement.addSubElement(Ljava/lang/String;Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: root-Branch
   * 6 com.allenstudio.ir.util.XmlElement.addSubElement(Lcom/allenstudio/ir/util/XmlElement;)Lcom/allenstudio/ir/util/XmlElement;: root-Branch
   * 7 com.allenstudio.ir.util.XmlElement.getElements()Ljava/util/List;: root-Branch
   * 8 com.allenstudio.ir.util.XmlElement.clone()Ljava/lang/Object;: I10 Branch 19 IFNULL L560 - true
   * 9 com.allenstudio.ir.util.XmlElement.clone()Ljava/lang/Object;: I10 Branch 19 IFNULL L560 - false
   * 10 com.allenstudio.ir.util.XmlElement.clone()Ljava/lang/Object;: I23 Branch 20 IFNULL L564 - false
   * 11 com.allenstudio.ir.util.XmlElement.clone()Ljava/lang/Object;: I44 Branch 21 IFEQ L570 - true
   * 12 com.allenstudio.ir.util.XmlElement.clone()Ljava/lang/Object;: I44 Branch 21 IFEQ L570 - false
   * 13 com.allenstudio.ir.util.XmlElement.setParent(Lcom/allenstudio/ir/util/XmlElement;)V: root-Branch
   * 14 com.allenstudio.ir.util.XmlElement.<init>(Ljava/lang/String;Ljava/util/Hashtable;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("#}=%}nPEQAp", (Hashtable<String, String>) null);
      XmlElement xmlElement1 = xmlElement0.addSubElement(" rcg%^3Xy", "#}=%}nPEQAp");
      XmlElement xmlElement2 = (XmlElement)xmlElement0.clone();
      assertEquals(1, xmlElement0.count());
      assertFalse(xmlElement2.equals(xmlElement1));
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.removeElement(I)Lcom/allenstudio/ir/util/XmlElement;: root-Branch
   * 2 com.allenstudio.ir.util.XmlElement.<init>()V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement();
      // Undeclared exception!
      try {
        xmlElement0.removeElement(46);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * Array index out of range: 46
         */
      }
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.util.XmlElement.getAttributeNames()Ljava/util/Enumeration;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement(">b;czI:");
      Enumeration<Object> enumeration0 = xmlElement0.getAttributeNames();
      assertEquals(false, enumeration0.hasMoreElements());
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.getData()Ljava/lang/String;: root-Branch
   * 2 com.allenstudio.ir.util.XmlElement.getName()Ljava/lang/String;: root-Branch
   * 3 com.allenstudio.ir.util.XmlElement.printNode(Lcom/allenstudio/ir/util/XmlElement;Ljava/lang/String;)V: I8 Branch 15 IFNULL L527 - true
   */
  @Test
  public void test3()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("#}=%}nPEQAp", (Hashtable<String, String>) null);
      // Undeclared exception!
      try {
        XmlElement.printNode(xmlElement0, "    ");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.util.XmlElement.setName(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("#}=%}nPEQAp", (Hashtable<String, String>) null);
      xmlElement0.setName("KZ}4=&");
      assertEquals("KZ}4=&", xmlElement0.getName());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.util.XmlElement.notifyObservers()V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement(">b;czI:");
      xmlElement0.notifyObservers();
      assertEquals(false, xmlElement0.hasChanged());
  }

  //Test case number: 6
  /*
   * 3 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.append(Lcom/allenstudio/ir/util/XmlElement;)V: root-Branch
   * 2 com.allenstudio.ir.util.XmlElement.addElement(Lcom/allenstudio/ir/util/XmlElement;)Z: root-Branch
   * 3 com.allenstudio.ir.util.XmlElement.removeFromParent()V: I4 Branch 6 IFNONNULL L242 - false
   */
  @Test
  public void test6()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement();
      assertNotNull(xmlElement0);
      
      xmlElement0.append(xmlElement0);
      assertEquals(1, xmlElement0.count());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.util.XmlElement.getElement(I)Lcom/allenstudio/ir/util/XmlElement;: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement();
      // Undeclared exception!
      try {
        xmlElement0.getElement(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * Array index out of range: 0
         */
      }
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.util.XmlElement.removeAllElements()V: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("#}=%}nPEQAp", (Hashtable<String, String>) null);
      xmlElement0.removeAllElements();
      assertNull(xmlElement0.getData());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.util.XmlElement.count()I: root-Branch
   */
  @Test
  public void test9()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("#}=%}nPEQAp", (Hashtable<String, String>) null);
      int int0 = xmlElement0.count();
      assertEquals(0, int0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.util.XmlElement.addAttribute(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;: I3 Branch 1 IFNULL L131 - true
   */
  @Test
  public void test10()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement();
      Object object0 = xmlElement0.addAttribute((String) null, (String) null);
      assertNull(object0);
  }

  //Test case number: 11
  /*
   * 4 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.addAttribute(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;: I3 Branch 1 IFNULL L131 - false
   * 2 com.allenstudio.ir.util.XmlElement.addAttribute(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;: I5 Branch 2 IFNULL L131 - false
   * 3 com.allenstudio.ir.util.XmlElement.getAttribute(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I5 Branch 3 IFNONNULL L153 - false
   * 4 com.allenstudio.ir.util.XmlElement.getAttribute(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */
  @Test
  public void test11()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("#}=%}nPEQAp", (Hashtable<String, String>) null);
      XmlElement xmlElement1 = xmlElement0.addSubElement(" rcg%^3Xy", "#}=%}nPEQAp");
      String string0 = xmlElement1.getAttribute("KZ}4=&", "");
      assertEquals(1, xmlElement0.count());
      assertEquals("", string0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.util.XmlElement.getAttribute(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I5 Branch 3 IFNONNULL L153 - true
   */
  @Test
  public void test12()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("KZ}4=&");
      assertNotNull(xmlElement0);
      
      xmlElement0.addAttribute("    ", "    ");
      String string0 = xmlElement0.getAttribute("    ", "");
      assertNotNull(string0);
      assertEquals("    ", string0);
  }

  //Test case number: 13
  /*
   * 5 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.removeElement(Lcom/allenstudio/ir/util/XmlElement;)Lcom/allenstudio/ir/util/XmlElement;: I13 Branch 4 IF_ICMPGE L211 - false
   * 2 com.allenstudio.ir.util.XmlElement.removeElement(Lcom/allenstudio/ir/util/XmlElement;)Lcom/allenstudio/ir/util/XmlElement;: I26 Branch 5 IF_ACMPNE L217 - true
   * 3 com.allenstudio.ir.util.XmlElement.insertElement(Lcom/allenstudio/ir/util/XmlElement;I)V: root-Branch
   * 4 com.allenstudio.ir.util.XmlElement.removeFromParent()V: I4 Branch 6 IFNONNULL L242 - true
   * 5 com.allenstudio.ir.util.XmlElement.removeElement(Lcom/allenstudio/ir/util/XmlElement;)Lcom/allenstudio/ir/util/XmlElement;: I13 Branch 4 IF_ICMPGE L211 - true
   */
  @Test
  public void test13()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement(">b;czI:");
      assertNotNull(xmlElement0);
      
      xmlElement0.setParent(xmlElement0);
      xmlElement0.addSubElement("Y/CzH.W", "Y/CzH.W");
      xmlElement0.insertElement(xmlElement0, 1);
      assertEquals(2, xmlElement0.count());
  }

  //Test case number: 14
  /*
   * 12 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.removeElement(Lcom/allenstudio/ir/util/XmlElement;)Lcom/allenstudio/ir/util/XmlElement;: I26 Branch 5 IF_ACMPNE L217 - false
   * 2 com.allenstudio.ir.util.XmlElement.getElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I9 Branch 7 IFNE L300 - true
   * 3 com.allenstudio.ir.util.XmlElement.getElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I25 Branch 8 IFLE L305 - true
   * 4 com.allenstudio.ir.util.XmlElement.getElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I60 Branch 9 IF_ICMPGE L315 - true
   * 5 com.allenstudio.ir.util.XmlElement.addSubElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I10 Branch 12 IF_ICMPEQ L346 - true
   * 6 com.allenstudio.ir.util.XmlElement.addSubElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I10 Branch 12 IF_ICMPEQ L346 - false
   * 7 com.allenstudio.ir.util.XmlElement.addSubElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I34 Branch 13 IFNE L351 - true
   * 8 com.allenstudio.ir.util.XmlElement.addSubElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I43 Branch 14 IFNULL L354 - true
   * 9 com.allenstudio.ir.util.XmlElement.append(Lcom/allenstudio/ir/util/XmlElement;)V: root-Branch
   * 10 com.allenstudio.ir.util.XmlElement.removeFromParent()V: I4 Branch 6 IFNONNULL L242 - true
   * 11 com.allenstudio.ir.util.XmlElement.removeElement(Lcom/allenstudio/ir/util/XmlElement;)Lcom/allenstudio/ir/util/XmlElement;: I13 Branch 4 IF_ICMPGE L211 - true
   * 12 com.allenstudio.ir.util.XmlElement.removeElement(Lcom/allenstudio/ir/util/XmlElement;)Lcom/allenstudio/ir/util/XmlElement;: I13 Branch 4 IF_ICMPGE L211 - false
   */
  @Test
  public void test14()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement();
      XmlElement xmlElement1 = xmlElement0.addSubElement("%{U:6G+um]T.S");
      xmlElement0.append(xmlElement1);
      assertEquals(2, xmlElement0.count());
      assertEquals("S", xmlElement1.getName());
  }

  //Test case number: 15
  /*
   * 3 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.getElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I71 Branch 10 IFLE L316 - true
   * 2 com.allenstudio.ir.util.XmlElement.getParent()Lcom/allenstudio/ir/util/XmlElement;: root-Branch
   * 3 com.allenstudio.ir.util.XmlElement.getElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I60 Branch 9 IF_ICMPGE L315 - false
   */
  @Test
  public void test15()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement(">b;czI:");
      assertNotNull(xmlElement0);
      
      xmlElement0.setParent(xmlElement0);
      xmlElement0.addSubElement("Y/CzH.W", "Y/CzH.W");
      XmlElement xmlElement1 = xmlElement0.getParent();
      xmlElement1.getElement("");
      assertEquals(1, xmlElement0.count());
      assertEquals("", xmlElement1.getData());
  }

  //Test case number: 16
  /*
   * 10 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.addSubElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I43 Branch 14 IFNULL L354 - false
   * 2 com.allenstudio.ir.util.XmlElement.getElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I9 Branch 7 IFNE L300 - true
   * 3 com.allenstudio.ir.util.XmlElement.getElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I25 Branch 8 IFLE L305 - true
   * 4 com.allenstudio.ir.util.XmlElement.getElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I60 Branch 9 IF_ICMPGE L315 - true
   * 5 com.allenstudio.ir.util.XmlElement.getElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I60 Branch 9 IF_ICMPGE L315 - false
   * 6 com.allenstudio.ir.util.XmlElement.getElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I71 Branch 10 IFLE L316 - false
   * 7 com.allenstudio.ir.util.XmlElement.getElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I75 Branch 11 IFNULL L317 - true
   * 8 com.allenstudio.ir.util.XmlElement.addSubElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I10 Branch 12 IF_ICMPEQ L346 - false
   * 9 com.allenstudio.ir.util.XmlElement.addSubElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I34 Branch 13 IFNE L351 - true
   * 10 com.allenstudio.ir.util.XmlElement.addSubElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I43 Branch 14 IFNULL L354 - true
   */
  @Test
  public void test16()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement();
      xmlElement0.addSubElement("%{U:6G+um]T.S");
      xmlElement0.addSubElement("%{U:6G+um]T.S");
      assertEquals(1, xmlElement0.count());
  }

  //Test case number: 17
  /*
   * 8 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.printNode(Lcom/allenstudio/ir/util/XmlElement;Ljava/lang/String;)V: I56 Branch 17 IFEQ L535 - false
   * 2 com.allenstudio.ir.util.XmlElement.getAttribute(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * 3 com.allenstudio.ir.util.XmlElement.addAttribute(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;: I3 Branch 1 IFNULL L131 - false
   * 4 com.allenstudio.ir.util.XmlElement.addAttribute(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;: I5 Branch 2 IFNULL L131 - false
   * 5 com.allenstudio.ir.util.XmlElement.printNode(Lcom/allenstudio/ir/util/XmlElement;Ljava/lang/String;)V: I8 Branch 15 IFNULL L527 - false
   * 6 com.allenstudio.ir.util.XmlElement.printNode(Lcom/allenstudio/ir/util/XmlElement;Ljava/lang/String;)V: I12 Branch 16 IFLE L527 - true
   * 7 com.allenstudio.ir.util.XmlElement.printNode(Lcom/allenstudio/ir/util/XmlElement;Ljava/lang/String;)V: I56 Branch 17 IFEQ L535 - true
   * 8 com.allenstudio.ir.util.XmlElement.printNode(Lcom/allenstudio/ir/util/XmlElement;Ljava/lang/String;)V: I101 Branch 18 IFEQ L543 - true
   */
  @Test
  public void test17()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("#}=%}nPEQAp", (Hashtable<String, String>) null);
      XmlElement xmlElement1 = xmlElement0.addSubElement(" rcg%^3Xy", "#}=%}nPEQAp");
      xmlElement1.addAttribute("    ", "    ");
      XmlElement.printNode(xmlElement1, "p)UVU%X2^~");
      assertEquals(1, xmlElement0.count());
      assertEquals("#}=%}nPEQAp", xmlElement1.getData());
  }

  //Test case number: 18
  /*
   * 10 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.printNode(Lcom/allenstudio/ir/util/XmlElement;Ljava/lang/String;)V: I101 Branch 18 IFEQ L543 - false
   * 2 com.allenstudio.ir.util.XmlElement.getAttributes()Ljava/util/Hashtable;: root-Branch
   * 3 com.allenstudio.ir.util.XmlElement.getData()Ljava/lang/String;: root-Branch
   * 4 com.allenstudio.ir.util.XmlElement.getName()Ljava/lang/String;: root-Branch
   * 5 com.allenstudio.ir.util.XmlElement.getElements()Ljava/util/List;: root-Branch
   * 6 com.allenstudio.ir.util.XmlElement.printNode(Lcom/allenstudio/ir/util/XmlElement;Ljava/lang/String;)V: I8 Branch 15 IFNULL L527 - false
   * 7 com.allenstudio.ir.util.XmlElement.printNode(Lcom/allenstudio/ir/util/XmlElement;Ljava/lang/String;)V: I12 Branch 16 IFLE L527 - true
   * 8 com.allenstudio.ir.util.XmlElement.printNode(Lcom/allenstudio/ir/util/XmlElement;Ljava/lang/String;)V: I12 Branch 16 IFLE L527 - false
   * 9 com.allenstudio.ir.util.XmlElement.printNode(Lcom/allenstudio/ir/util/XmlElement;Ljava/lang/String;)V: I56 Branch 17 IFEQ L535 - true
   * 10 com.allenstudio.ir.util.XmlElement.printNode(Lcom/allenstudio/ir/util/XmlElement;Ljava/lang/String;)V: I101 Branch 18 IFEQ L543 - true
   */
  @Test
  public void test18()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("#}=%}nPEQAp", (Hashtable<String, String>) null);
      XmlElement xmlElement1 = xmlElement0.addSubElement(" rcg%^3Xy", "#}=%}nPEQAp");
      xmlElement1.addSubElement("KZ}4=&");
      XmlElement.printNode(xmlElement1, "p)UVU%X2^~");
      assertEquals(1, xmlElement0.count());
      assertEquals("#}=%}nPEQAp", xmlElement1.getData());
  }

  //Test case number: 19
  /*
   * 11 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I7 Branch 22 IFNONNULL L621 - false
   * 2 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I9 Branch 23 IFNONNULL L621 - false
   * 3 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;)Z: I45 Branch 31 IFEQ L640 - false
   * 4 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I7 Branch 22 IFNONNULL L621 - true
   * 5 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I18 Branch 24 IFNULL L623 - false
   * 6 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I20 Branch 25 IFNULL L623 - false
   * 7 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;)Z: I7 Branch 26 IFNULL L637 - false
   * 8 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;)Z: I10 Branch 27 IFEQ L637 - false
   * 9 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;)Z: I24 Branch 28 IFEQ L640 - false
   * 10 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;)Z: I31 Branch 29 IFEQ L640 - false
   * 11 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;)Z: I38 Branch 30 IFEQ L640 - false
   */
  @Test
  public void test19()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement();
      assertNotNull(xmlElement0);
      
      boolean boolean0 = xmlElement0.equals((Object) xmlElement0);
      assertEquals(true, boolean0);
  }

  //Test case number: 20
  /*
   * 2 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I20 Branch 25 IFNULL L623 - true
   * 2 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;)Z: I31 Branch 29 IFEQ L640 - true
   */
  @Test
  public void test20()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement(">b;czI:");
      assertNotNull(xmlElement0);
      
      XmlElement xmlElement1 = new XmlElement();
      assertNotNull(xmlElement1);
      
      boolean boolean0 = xmlElement0.equals((Object) xmlElement1);
      assertEquals(false, boolean0);
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;)Z: I7 Branch 26 IFNULL L637 - true
   */
  @Test
  public void test21()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement();
      assertNotNull(xmlElement0);
      
      boolean boolean0 = xmlElement0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  //Test case number: 22
  /*
   * 2 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;)Z: I10 Branch 27 IFEQ L637 - true
   * 2 com.allenstudio.ir.util.XmlElement.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test22()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("og|Z", "og|Z");
      assertNotNull(xmlElement0);
      
      Hashtable<String, Hashtable<Object, String>> hashtable0 = new Hashtable<String, Hashtable<Object, String>>();
      boolean boolean0 = xmlElement0.equals((Object) hashtable0);
      assertEquals(false, boolean0);
  }

  //Test case number: 23
  /*
   * 12 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;)Z: I45 Branch 31 IFEQ L640 - true
   * 2 com.allenstudio.ir.util.XmlElement.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * 3 com.allenstudio.ir.util.XmlElement.addElement(Lcom/allenstudio/ir/util/XmlElement;)Z: root-Branch
   * 4 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I7 Branch 22 IFNONNULL L621 - true
   * 5 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I18 Branch 24 IFNULL L623 - false
   * 6 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I20 Branch 25 IFNULL L623 - false
   * 7 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;)Z: I7 Branch 26 IFNULL L637 - false
   * 8 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;)Z: I10 Branch 27 IFEQ L637 - false
   * 9 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;)Z: I24 Branch 28 IFEQ L640 - false
   * 10 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;)Z: I31 Branch 29 IFEQ L640 - false
   * 11 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;)Z: I38 Branch 30 IFEQ L640 - false
   * 12 com.allenstudio.ir.util.XmlElement.addSubElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I10 Branch 12 IF_ICMPEQ L346 - true
   */
  @Test
  public void test23()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("og|Z", "og|Z");
      assertNotNull(xmlElement0);
      
      XmlElement xmlElement1 = xmlElement0.addSubElement("og|Z");
      XmlElement xmlElement2 = xmlElement1.parent;
      XmlElement xmlElement3 = new XmlElement("og|Z", "og|Z");
      boolean boolean0 = xmlElement2.equals((Object) xmlElement3);
      assertEquals(1, xmlElement0.count());
      assertEquals(false, boolean0);
  }

  //Test case number: 24
  /*
   * 11 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.hashCode()I: I8 Branch 32 IFNULL L656 - false
   * 2 com.allenstudio.ir.util.XmlElement.hashCode()I: I23 Branch 33 IFNULL L660 - false
   * 3 com.allenstudio.ir.util.XmlElement.setData(Ljava/lang/String;)V: root-Branch
   * 4 com.allenstudio.ir.util.XmlElement.setParent(Lcom/allenstudio/ir/util/XmlElement;)V: root-Branch
   * 5 com.allenstudio.ir.util.XmlElement.<init>(Ljava/lang/String;)V: root-Branch
   * 6 com.allenstudio.ir.util.XmlElement.<init>(Ljava/lang/String;Ljava/util/Hashtable;)V: root-Branch
   * 7 com.allenstudio.ir.util.XmlElement.addSubElement(Ljava/lang/String;Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: root-Branch
   * 8 com.allenstudio.ir.util.XmlElement.hashCode()I: I8 Branch 32 IFNULL L656 - true
   * 9 com.allenstudio.ir.util.XmlElement.hashCode()I: I38 Branch 34 IFNULL L664 - false
   * 10 com.allenstudio.ir.util.XmlElement.hashCode()I: I23 Branch 33 IFNULL L660 - true
   * 11 com.allenstudio.ir.util.XmlElement.hashCode()I: I53 Branch 35 IFNULL L668 - false
   */
  @Test
  public void test24()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("#}=%}nPEQAp", (Hashtable<String, String>) null);
      xmlElement0.addSubElement(" rcg%^3Xy", "#}=%}nPEQAp");
      int int0 = xmlElement0.hashCode();
      assertEquals(1, xmlElement0.count());
      assertEquals(1997406023, int0);
  }

  //Test case number: 25
  /*
   * 5 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.hashCode()I: I38 Branch 34 IFNULL L664 - true
   * 2 com.allenstudio.ir.util.XmlElement.<init>()V: root-Branch
   * 3 com.allenstudio.ir.util.XmlElement.hashCode()I: I8 Branch 32 IFNULL L656 - false
   * 4 com.allenstudio.ir.util.XmlElement.hashCode()I: I23 Branch 33 IFNULL L660 - true
   * 5 com.allenstudio.ir.util.XmlElement.hashCode()I: I53 Branch 35 IFNULL L668 - false
   */
  @Test
  public void test25()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement();
      assertNotNull(xmlElement0);
      
      int int0 = xmlElement0.hashCode();
      assertEquals(80, int0);
  }
}
