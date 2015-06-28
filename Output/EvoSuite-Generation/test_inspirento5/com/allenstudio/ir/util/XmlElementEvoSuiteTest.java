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
   * 3 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.insertElement(Lcom/allenstudio/ir/util/XmlElement;I)V: root-Branch
   * 2 com.allenstudio.ir.util.XmlElement.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * 3 com.allenstudio.ir.util.XmlElement.removeFromParent()V: I4 Branch 6 IFNONNULL L242 - false
   */
  @Test
  public void test0()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("x", "x");
      // Undeclared exception!
      try {
        xmlElement0.insertElement(xmlElement0, 1504);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 1504 > 0
         */
      }
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
        xmlElement0.removeElement(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * Array index out of range: 0
         */
      }
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.getAttributeNames()Ljava/util/Enumeration;: root-Branch
   * 2 com.allenstudio.ir.util.XmlElement.<init>(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("hcdVvU/KWnS3");
      Enumeration<Object> enumeration0 = xmlElement0.getAttributeNames();
      assertEquals(false, enumeration0.hasMoreElements());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.util.XmlElement.setName(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement();
      xmlElement0.setName("");
      assertEquals(false, xmlElement0.hasChanged());
  }

  //Test case number: 4
  /*
   * 12 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;)Z: I45 Branch 31 IFEQ L640 - true
   * 2 com.allenstudio.ir.util.XmlElement.setData(Ljava/lang/String;)V: root-Branch
   * 3 com.allenstudio.ir.util.XmlElement.setParent(Lcom/allenstudio/ir/util/XmlElement;)V: root-Branch
   * 4 com.allenstudio.ir.util.XmlElement.addSubElement(Ljava/lang/String;Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: root-Branch
   * 5 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I7 Branch 22 IFNONNULL L621 - true
   * 6 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I18 Branch 24 IFNULL L623 - false
   * 7 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I20 Branch 25 IFNULL L623 - false
   * 8 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;)Z: I7 Branch 26 IFNULL L637 - false
   * 9 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;)Z: I10 Branch 27 IFEQ L637 - false
   * 10 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;)Z: I24 Branch 28 IFEQ L640 - false
   * 11 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;)Z: I31 Branch 29 IFEQ L640 - false
   * 12 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;)Z: I38 Branch 30 IFEQ L640 - false
   */
  @Test
  public void test4()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("CQU,.s>S,Z\"", "CQU,.s>S,Z\"");
      assertNotNull(xmlElement0);
      
      XmlElement xmlElement1 = xmlElement0.addSubElement("CQU,.s>S,Z\"", "CQU,.s>S,Z\"");
      boolean boolean0 = xmlElement1.equals((Object) xmlElement0);
      assertEquals(1, xmlElement0.count());
      assertEquals(false, boolean0);
  }

  //Test case number: 5
  /*
   * 14 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.getName()Ljava/lang/String;: root-Branch
   * 2 com.allenstudio.ir.util.XmlElement.addElement(Lcom/allenstudio/ir/util/XmlElement;)Z: root-Branch
   * 3 com.allenstudio.ir.util.XmlElement.getElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I9 Branch 7 IFNE L300 - true
   * 4 com.allenstudio.ir.util.XmlElement.getElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I25 Branch 8 IFLE L305 - true
   * 5 com.allenstudio.ir.util.XmlElement.getElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I25 Branch 8 IFLE L305 - false
   * 6 com.allenstudio.ir.util.XmlElement.getElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I60 Branch 9 IF_ICMPGE L315 - true
   * 7 com.allenstudio.ir.util.XmlElement.getElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I60 Branch 9 IF_ICMPGE L315 - false
   * 8 com.allenstudio.ir.util.XmlElement.getElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I71 Branch 10 IFLE L316 - false
   * 9 com.allenstudio.ir.util.XmlElement.getElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I75 Branch 11 IFNULL L317 - true
   * 10 com.allenstudio.ir.util.XmlElement.getElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I75 Branch 11 IFNULL L317 - false
   * 11 com.allenstudio.ir.util.XmlElement.addSubElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I10 Branch 12 IF_ICMPEQ L346 - true
   * 12 com.allenstudio.ir.util.XmlElement.addSubElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I10 Branch 12 IF_ICMPEQ L346 - false
   * 13 com.allenstudio.ir.util.XmlElement.addSubElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I34 Branch 13 IFNE L351 - true
   * 14 com.allenstudio.ir.util.XmlElement.addSubElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I43 Branch 14 IFNULL L354 - true
   */
  @Test
  public void test5()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("';.yy[X4H0", "';.yy[X4H0");
      assertNotNull(xmlElement0);
      
      XmlElement xmlElement1 = xmlElement0.addSubElement("';.yy[X4H0");
      XmlElement xmlElement2 = xmlElement0.getElement("';.yy[X4H0");
      assertEquals(1, xmlElement0.count());
      assertSame(xmlElement2, xmlElement1);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.util.XmlElement.notifyObservers()V: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement();
      xmlElement0.notifyObservers();
      assertEquals(0, xmlElement0.count());
  }

  //Test case number: 7
  /*
   * 2 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.append(Lcom/allenstudio/ir/util/XmlElement;)V: root-Branch
   * 2 com.allenstudio.ir.util.XmlElement.removeFromParent()V: I4 Branch 6 IFNONNULL L242 - false
   */
  @Test
  public void test7()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement();
      assertNotNull(xmlElement0);
      
      xmlElement0.append(xmlElement0);
      assertEquals(1, xmlElement0.count());
  }

  //Test case number: 8
  /*
   * 6 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.getElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I71 Branch 10 IFLE L316 - true
   * 2 com.allenstudio.ir.util.XmlElement.getElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I9 Branch 7 IFNE L300 - true
   * 3 com.allenstudio.ir.util.XmlElement.getElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I25 Branch 8 IFLE L305 - true
   * 4 com.allenstudio.ir.util.XmlElement.getElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I60 Branch 9 IF_ICMPGE L315 - true
   * 5 com.allenstudio.ir.util.XmlElement.getElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I60 Branch 9 IF_ICMPGE L315 - false
   * 6 com.allenstudio.ir.util.XmlElement.addSubElement(Lcom/allenstudio/ir/util/XmlElement;)Lcom/allenstudio/ir/util/XmlElement;: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("CQU,.s>S,Z\"", "CQU,.s>S,Z\"");
      assertNotNull(xmlElement0);
      
      XmlElement xmlElement1 = xmlElement0.addSubElement(xmlElement0);
      xmlElement1.getElement(" = '");
      assertEquals(1, xmlElement0.count());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.util.XmlElement.getElement(I)Lcom/allenstudio/ir/util/XmlElement;: root-Branch
   */
  @Test
  public void test9()  throws Throwable  {
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

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.util.XmlElement.removeAllElements()V: root-Branch
   */
  @Test
  public void test10()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("CQU,.s>S,Z\"", "CQU,.s>S,Z\"");
      xmlElement0.removeAllElements();
      assertEquals("CQU,.s>S,Z\"", xmlElement0.getName());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.util.XmlElement.count()I: root-Branch
   */
  @Test
  public void test11()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement();
      int int0 = xmlElement0.count();
      assertEquals(0, int0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.util.XmlElement.getParent()Lcom/allenstudio/ir/util/XmlElement;: root-Branch
   */
  @Test
  public void test12()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("hcdVvU/KWnS3");
      XmlElement xmlElement1 = xmlElement0.getParent();
      assertNull(xmlElement1);
  }

  //Test case number: 13
  /*
   * 3 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.addAttribute(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;: I3 Branch 1 IFNULL L131 - true
   * 2 com.allenstudio.ir.util.XmlElement.getAttribute(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I5 Branch 3 IFNONNULL L153 - false
   * 3 com.allenstudio.ir.util.XmlElement.getAttribute(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */
  @Test
  public void test13()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement();
      String string0 = xmlElement0.getAttribute("|.3Fr[c<]ch", (String) null);
      assertNull(string0);
  }

  //Test case number: 14
  /*
   * 2 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.addAttribute(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;: I5 Branch 2 IFNULL L131 - true
   * 2 com.allenstudio.ir.util.XmlElement.addAttribute(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;: I3 Branch 1 IFNULL L131 - false
   */
  @Test
  public void test14()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement();
      Object object0 = xmlElement0.addAttribute((String) null, "Could not clone XmlElement: ");
      assertNull(object0);
  }

  //Test case number: 15
  /*
   * 3 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.removeElement(Lcom/allenstudio/ir/util/XmlElement;)Lcom/allenstudio/ir/util/XmlElement;: I13 Branch 4 IF_ICMPGE L211 - false
   * 2 com.allenstudio.ir.util.XmlElement.removeElement(Lcom/allenstudio/ir/util/XmlElement;)Lcom/allenstudio/ir/util/XmlElement;: I26 Branch 5 IF_ACMPNE L217 - true
   * 3 com.allenstudio.ir.util.XmlElement.removeElement(Lcom/allenstudio/ir/util/XmlElement;)Lcom/allenstudio/ir/util/XmlElement;: I13 Branch 4 IF_ICMPGE L211 - true
   */
  @Test
  public void test15()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement();
      assertNotNull(xmlElement0);
      
      xmlElement0.addSubElement("Px");
      xmlElement0.removeElement(xmlElement0);
      assertEquals(1, xmlElement0.count());
  }

  //Test case number: 16
  /*
   * 5 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.removeElement(Lcom/allenstudio/ir/util/XmlElement;)Lcom/allenstudio/ir/util/XmlElement;: I26 Branch 5 IF_ACMPNE L217 - false
   * 2 com.allenstudio.ir.util.XmlElement.removeFromParent()V: I4 Branch 6 IFNONNULL L242 - true
   * 3 com.allenstudio.ir.util.XmlElement.append(Lcom/allenstudio/ir/util/XmlElement;)V: root-Branch
   * 4 com.allenstudio.ir.util.XmlElement.removeElement(Lcom/allenstudio/ir/util/XmlElement;)Lcom/allenstudio/ir/util/XmlElement;: I13 Branch 4 IF_ICMPGE L211 - true
   * 5 com.allenstudio.ir.util.XmlElement.removeElement(Lcom/allenstudio/ir/util/XmlElement;)Lcom/allenstudio/ir/util/XmlElement;: I13 Branch 4 IF_ICMPGE L211 - false
   */
  @Test
  public void test16()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement();
      assertNotNull(xmlElement0);
      
      XmlElement xmlElement1 = xmlElement0.addSubElement("");
      xmlElement0.append(xmlElement1);
      assertEquals(1, xmlElement0.count());
  }

  //Test case number: 17
  /*
   * 2 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.addSubElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I34 Branch 13 IFNE L351 - false
   * 2 com.allenstudio.ir.util.XmlElement.addSubElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I10 Branch 12 IF_ICMPEQ L346 - false
   */
  @Test
  public void test17()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement();
      assertNotNull(xmlElement0);
      
      xmlElement0.addSubElement(".3R`P: ajzBl+sq;");
      assertEquals(1, xmlElement0.count());
  }

  //Test case number: 18
  /*
   * 7 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.printNode(Lcom/allenstudio/ir/util/XmlElement;Ljava/lang/String;)V: I12 Branch 16 IFLE L527 - true
   * 2 com.allenstudio.ir.util.XmlElement.getAttributes()Ljava/util/Hashtable;: root-Branch
   * 3 com.allenstudio.ir.util.XmlElement.getData()Ljava/lang/String;: root-Branch
   * 4 com.allenstudio.ir.util.XmlElement.getElements()Ljava/util/List;: root-Branch
   * 5 com.allenstudio.ir.util.XmlElement.printNode(Lcom/allenstudio/ir/util/XmlElement;Ljava/lang/String;)V: I8 Branch 15 IFNULL L527 - false
   * 6 com.allenstudio.ir.util.XmlElement.printNode(Lcom/allenstudio/ir/util/XmlElement;Ljava/lang/String;)V: I56 Branch 17 IFEQ L535 - true
   * 7 com.allenstudio.ir.util.XmlElement.printNode(Lcom/allenstudio/ir/util/XmlElement;Ljava/lang/String;)V: I101 Branch 18 IFEQ L543 - true
   */
  @Test
  public void test18()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("hcdVvU/KWnS3");
      assertEquals("", xmlElement0.getData());
      assertNotNull(xmlElement0);
      
      xmlElement0.setData("hcdVvU/KWnS3");
      XmlElement.printNode(xmlElement0, "hcdVvU/KWnS3");
      assertEquals("hcdVvU/KWnS3", xmlElement0.getData());
  }

  //Test case number: 19
  /*
   * 6 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.printNode(Lcom/allenstudio/ir/util/XmlElement;Ljava/lang/String;)V: I56 Branch 17 IFEQ L535 - false
   * 2 com.allenstudio.ir.util.XmlElement.getAttribute(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * 3 com.allenstudio.ir.util.XmlElement.addAttribute(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;: I3 Branch 1 IFNULL L131 - false
   * 4 com.allenstudio.ir.util.XmlElement.addAttribute(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;: I5 Branch 2 IFNULL L131 - false
   * 5 com.allenstudio.ir.util.XmlElement.printNode(Lcom/allenstudio/ir/util/XmlElement;Ljava/lang/String;)V: I8 Branch 15 IFNULL L527 - false
   * 6 com.allenstudio.ir.util.XmlElement.printNode(Lcom/allenstudio/ir/util/XmlElement;Ljava/lang/String;)V: I12 Branch 16 IFLE L527 - false
   */
  @Test
  public void test19()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("hcdVvU/KWnS3");
      assertNotNull(xmlElement0);
      
      xmlElement0.addAttribute("hcdVvU/KWnS3", "hcdVvU/KWnS3");
      XmlElement.printNode(xmlElement0, "hcdVvU/KWnS3");
      assertEquals("", xmlElement0.getData());
      assertEquals("hcdVvU/KWnS3", xmlElement0.getName());
  }

  //Test case number: 20
  /*
   * 8 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.printNode(Lcom/allenstudio/ir/util/XmlElement;Ljava/lang/String;)V: I101 Branch 18 IFEQ L543 - false
   * 2 com.allenstudio.ir.util.XmlElement.getData()Ljava/lang/String;: root-Branch
   * 3 com.allenstudio.ir.util.XmlElement.setData(Ljava/lang/String;)V: root-Branch
   * 4 com.allenstudio.ir.util.XmlElement.getName()Ljava/lang/String;: root-Branch
   * 5 com.allenstudio.ir.util.XmlElement.addSubElement(Ljava/lang/String;Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: root-Branch
   * 6 com.allenstudio.ir.util.XmlElement.printNode(Lcom/allenstudio/ir/util/XmlElement;Ljava/lang/String;)V: I8 Branch 15 IFNULL L527 - true
   * 7 com.allenstudio.ir.util.XmlElement.printNode(Lcom/allenstudio/ir/util/XmlElement;Ljava/lang/String;)V: I56 Branch 17 IFEQ L535 - true
   * 8 com.allenstudio.ir.util.XmlElement.printNode(Lcom/allenstudio/ir/util/XmlElement;Ljava/lang/String;)V: I101 Branch 18 IFEQ L543 - true
   */
  @Test
  public void test20()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement();
      assertNotNull(xmlElement0);
      
      XmlElement xmlElement1 = xmlElement0.addSubElement("", (String) null);
      XmlElement.printNode(xmlElement0, "");
      assertEquals(1, xmlElement0.count());
      assertNotSame(xmlElement0, xmlElement1);
  }

  //Test case number: 21
  /*
   * 8 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.clone()Ljava/lang/Object;: I44 Branch 21 IFEQ L570 - false
   * 2 com.allenstudio.ir.util.XmlElement.setAttributes(Ljava/util/Hashtable;)V: root-Branch
   * 3 com.allenstudio.ir.util.XmlElement.getAttributes()Ljava/util/Hashtable;: root-Branch
   * 4 com.allenstudio.ir.util.XmlElement.addSubElement(Lcom/allenstudio/ir/util/XmlElement;)Lcom/allenstudio/ir/util/XmlElement;: root-Branch
   * 5 com.allenstudio.ir.util.XmlElement.getElements()Ljava/util/List;: root-Branch
   * 6 com.allenstudio.ir.util.XmlElement.clone()Ljava/lang/Object;: I10 Branch 19 IFNULL L560 - false
   * 7 com.allenstudio.ir.util.XmlElement.clone()Ljava/lang/Object;: I23 Branch 20 IFNULL L564 - false
   * 8 com.allenstudio.ir.util.XmlElement.clone()Ljava/lang/Object;: I44 Branch 21 IFEQ L570 - true
   */
  @Test
  public void test21()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement();
      assertNotNull(xmlElement0);
      
      XmlElement xmlElement1 = xmlElement0.addSubElement("");
      XmlElement xmlElement2 = (XmlElement)xmlElement0.clone();
      assertEquals(1, xmlElement0.count());
      assertFalse(xmlElement2.equals(xmlElement1));
  }

  //Test case number: 22
  /*
   * 4 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I7 Branch 22 IFNONNULL L621 - false
   * 2 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I9 Branch 23 IFNONNULL L621 - false
   * 3 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;)Z: I38 Branch 30 IFEQ L640 - false
   * 4 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;)Z: I45 Branch 31 IFEQ L640 - false
   */
  @Test
  public void test22()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement();
      assertNotNull(xmlElement0);
      
      boolean boolean0 = xmlElement0.equals((Object) xmlElement0);
      assertEquals(true, boolean0);
  }

  //Test case number: 23
  /*
   * 4 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I9 Branch 23 IFNONNULL L621 - true
   * 2 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I18 Branch 24 IFNULL L623 - true
   * 3 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;)Z: I31 Branch 29 IFEQ L640 - true
   * 4 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I7 Branch 22 IFNONNULL L621 - false
   */
  @Test
  public void test23()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement();
      assertNotNull(xmlElement0);
      
      XmlElement xmlElement1 = xmlElement0.addSubElement("'");
      boolean boolean0 = xmlElement0.equals((Object) xmlElement1);
      assertEquals(1, xmlElement0.count());
      assertEquals(false, boolean0);
  }

  //Test case number: 24
  /*
   * 3 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I20 Branch 25 IFNULL L623 - true
   * 2 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;)Z: I31 Branch 29 IFEQ L640 - true
   * 3 com.allenstudio.ir.util.XmlElement.<init>(Ljava/lang/String;Ljava/util/Hashtable;)V: root-Branch
   */
  @Test
  public void test24()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("hcdVvU/KWnS3");
      assertNotNull(xmlElement0);
      
      XmlElement xmlElement1 = new XmlElement("hcdVvU/KWnS3", xmlElement0.attributes);
      boolean boolean0 = xmlElement0.equals((Object) xmlElement1);
      assertEquals(false, boolean0);
      assertFalse(xmlElement1.equals(xmlElement0));
  }

  //Test case number: 25
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;)Z: I7 Branch 26 IFNULL L637 - true
   */
  @Test
  public void test25()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement();
      assertNotNull(xmlElement0);
      
      boolean boolean0 = xmlElement0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;)Z: I10 Branch 27 IFEQ L637 - true
   */
  @Test
  public void test26()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement();
      assertNotNull(xmlElement0);
      
      boolean boolean0 = xmlElement0.equals((Object) "");
      assertEquals(false, boolean0);
  }

  //Test case number: 27
  /*
   * 12 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;)Z: I38 Branch 30 IFEQ L640 - true
   * 2 com.allenstudio.ir.util.XmlElement.setParent(Lcom/allenstudio/ir/util/XmlElement;)V: root-Branch
   * 3 com.allenstudio.ir.util.XmlElement.<init>(Ljava/lang/String;)V: root-Branch
   * 4 com.allenstudio.ir.util.XmlElement.addElement(Lcom/allenstudio/ir/util/XmlElement;)Z: root-Branch
   * 5 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I7 Branch 22 IFNONNULL L621 - true
   * 6 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I18 Branch 24 IFNULL L623 - false
   * 7 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I20 Branch 25 IFNULL L623 - false
   * 8 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;)Z: I7 Branch 26 IFNULL L637 - false
   * 9 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;)Z: I10 Branch 27 IFEQ L637 - false
   * 10 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;)Z: I24 Branch 28 IFEQ L640 - false
   * 11 com.allenstudio.ir.util.XmlElement.equals(Ljava/lang/Object;)Z: I31 Branch 29 IFEQ L640 - false
   * 12 com.allenstudio.ir.util.XmlElement.addSubElement(Ljava/lang/String;)Lcom/allenstudio/ir/util/XmlElement;: I10 Branch 12 IF_ICMPEQ L346 - true
   */
  @Test
  public void test27()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("Could not clone XmlElement: ");
      assertNotNull(xmlElement0);
      
      XmlElement xmlElement1 = xmlElement0.addSubElement("Px");
      boolean boolean0 = xmlElement0.equals((Object) xmlElement1);
      assertEquals(1, xmlElement0.count());
      assertEquals(false, boolean0);
  }

  //Test case number: 28
  /*
   * 5 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.hashCode()I: I8 Branch 32 IFNULL L656 - true
   * 2 com.allenstudio.ir.util.XmlElement.hashCode()I: I23 Branch 33 IFNULL L660 - true
   * 3 com.allenstudio.ir.util.XmlElement.hashCode()I: I38 Branch 34 IFNULL L664 - false
   * 4 com.allenstudio.ir.util.XmlElement.hashCode()I: I53 Branch 35 IFNULL L668 - false
   * 5 com.allenstudio.ir.util.XmlElement.<init>(Ljava/lang/String;Ljava/util/Hashtable;)V: root-Branch
   */
  @Test
  public void test28()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("", (Hashtable<String, String>) null);
      int int0 = xmlElement0.hashCode();
      assertEquals(80, int0);
  }

  //Test case number: 29
  /*
   * 4 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.hashCode()I: I8 Branch 32 IFNULL L656 - false
   * 2 com.allenstudio.ir.util.XmlElement.hashCode()I: I23 Branch 33 IFNULL L660 - false
   * 3 com.allenstudio.ir.util.XmlElement.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * 4 com.allenstudio.ir.util.XmlElement.hashCode()I: I38 Branch 34 IFNULL L664 - false
   */
  @Test
  public void test29()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement("x", "x");
      assertNotNull(xmlElement0);
      
      int int0 = xmlElement0.hashCode();
      assertEquals(5600, int0);
  }

  //Test case number: 30
  /*
   * 5 covered goals:
   * 1 com.allenstudio.ir.util.XmlElement.hashCode()I: I38 Branch 34 IFNULL L664 - true
   * 2 com.allenstudio.ir.util.XmlElement.<init>()V: root-Branch
   * 3 com.allenstudio.ir.util.XmlElement.hashCode()I: I8 Branch 32 IFNULL L656 - false
   * 4 com.allenstudio.ir.util.XmlElement.hashCode()I: I23 Branch 33 IFNULL L660 - true
   * 5 com.allenstudio.ir.util.XmlElement.hashCode()I: I53 Branch 35 IFNULL L668 - false
   */
  @Test
  public void test30()  throws Throwable  {
      XmlElement xmlElement0 = new XmlElement();
      assertNotNull(xmlElement0);
      
      int int0 = xmlElement0.hashCode();
      assertEquals(80, int0);
  }
}
