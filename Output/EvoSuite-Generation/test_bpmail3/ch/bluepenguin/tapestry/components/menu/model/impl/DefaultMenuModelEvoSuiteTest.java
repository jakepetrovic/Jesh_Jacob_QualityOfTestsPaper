/*
 * This file was automatically generated by EvoSuite
 */

package ch.bluepenguin.tapestry.components.menu.model.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import ch.bluepenguin.tapestry.components.menu.model.IMenuItem;
import ch.bluepenguin.tapestry.components.menu.model.MenuStructureException;
import ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuItem;
import ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel;
import ch.bluepenguin.tapestry.components.menu.model.impl.MenuItemList;
import ch.bluepenguin.tapestry.components.menu.renderer.IMenuItemRenderer;
import ch.bluepenguin.tapestry.components.menu.renderer.impl.HyperlinkMenuItemRenderer;
import java.util.Iterator;

public class DefaultMenuModelEvoSuiteTest {


  //Test case number: 0
  /*
   * 12 covered goals:
   * 1 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.getMenuItemsRecursion(Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;Ljava/util/ArrayList;)V: I4 Branch 1 IFNULL L37 - false
   * 2 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.getMenuItemsRecursion(Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;Ljava/util/ArrayList;)V: I20 Branch 2 IFEQ L39 - false
   * 3 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.getRootList()Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;: root-Branch
   * 4 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.<init>()V: root-Branch
   * 5 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.addMenuItemToList(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;)V: root-Branch
   * 6 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.getMenuItemsDepthFirst()Ljava/util/Iterator;: root-Branch
   * 7 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.addMenuItem(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;)V: root-Branch
   * 8 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.addMenuItem(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/renderer/IMenuItemRenderer;)V: I3 Branch 18 IFNONNULL L137 - true
   * 9 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.addMenuItem(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/renderer/IMenuItemRenderer;)V: I16 Branch 19 IFNONNULL L140 - false
   * 10 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.attachOrphans(Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;)V: I9 Branch 3 IF_ICMPGE L59 - true
   * 11 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.getMenuItemsRecursion(Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;Ljava/util/ArrayList;)V: I4 Branch 1 IFNULL L37 - true
   * 12 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.getMenuItemsRecursion(Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;Ljava/util/ArrayList;)V: I20 Branch 2 IFEQ L39 - true
   */
  @Test
  public void test0()  throws Throwable  {
      DefaultMenuModel defaultMenuModel0 = new DefaultMenuModel();
      MenuItemList menuItemList0 = defaultMenuModel0.getRootList();
      DefaultMenuItem defaultMenuItem0 = new DefaultMenuItem((Object) menuItemList0);
      defaultMenuModel0.addMenuItem((IMenuItem) defaultMenuItem0);
      defaultMenuModel0.getMenuItemsDepthFirst();
      assertEquals("(0) null\n   (0) null", defaultMenuModel0.displayMenuStructure());
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * 1 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.getMenuItemsDepthFirst()Ljava/util/Iterator;: root-Branch
   * 2 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.getMenuItemsRecursion(Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;Ljava/util/ArrayList;)V: I4 Branch 1 IFNULL L37 - true
   * 3 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.getMenuItemsRecursion(Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;Ljava/util/ArrayList;)V: I20 Branch 2 IFEQ L39 - true
   */
  @Test
  public void test1()  throws Throwable  {
      DefaultMenuModel defaultMenuModel0 = new DefaultMenuModel();
      Iterator<Object> iterator0 = defaultMenuModel0.getMenuItemsDepthFirst();
      assertEquals(false, iterator0.hasNext());
      assertNotNull(iterator0);
  }

  //Test case number: 2
  /*
   * 9 covered goals:
   * 1 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.attachOrphans(Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;)V: I43 Branch 5 IFEQ L64 - true
   * 2 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.attachOrphans(Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;)V: I9 Branch 3 IF_ICMPGE L59 - false
   * 3 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.attachOrphans(Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;)V: I36 Branch 4 IFNULL L64 - false
   * 4 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.attachOrphans(Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;)V: I43 Branch 5 IFEQ L64 - false
   * 5 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.addMenuItem(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/renderer/IMenuItemRenderer;)V: I16 Branch 19 IFNONNULL L140 - true
   * 6 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.addMenuItem(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/renderer/IMenuItemRenderer;)V: I36 Branch 20 IFNONNULL L146 - false
   * 7 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.findParentList(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;)Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;: I4 Branch 6 IFNONNULL L75 - true
   * 8 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.findParentList(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;)Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;: I13 Branch 7 IFNULL L77 - true
   * 9 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.findParentList(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;)Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;: I39 Branch 9 IFEQ L82 - true
   */
  @Test
  public void test2()  throws Throwable  {
      DefaultMenuModel defaultMenuModel0 = new DefaultMenuModel();
      MenuItemList menuItemList0 = defaultMenuModel0.getRootList();
      DefaultMenuItem defaultMenuItem0 = new DefaultMenuItem((Object) menuItemList0);
      Object object0 = new Object();
      defaultMenuItem0.setParent(object0);
      HyperlinkMenuItemRenderer hyperlinkMenuItemRenderer0 = new HyperlinkMenuItemRenderer();
      defaultMenuModel0.addMenuItem((IMenuItem) defaultMenuItem0, (IMenuItemRenderer) hyperlinkMenuItemRenderer0);
      defaultMenuModel0.addMenuItem((IMenuItem) defaultMenuItem0);
      DefaultMenuItem defaultMenuItem1 = new DefaultMenuItem(object0);
      defaultMenuModel0.addMenuItem((IMenuItem) defaultMenuItem1, (IMenuItemRenderer) hyperlinkMenuItemRenderer0);
  }

  //Test case number: 3
  /*
   * 6 covered goals:
   * 1 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.findParentList(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;)Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;: I13 Branch 7 IFNULL L77 - false
   * 2 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.findParentList(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;)Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;: I20 Branch 8 IFEQ L77 - true
   * 3 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.findParentList(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;)Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;: I39 Branch 9 IFEQ L82 - false
   * 4 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.findParentList(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;)Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;: I56 Branch 10 IFNULL L86 - true
   * 5 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.addMenuItem(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/renderer/IMenuItemRenderer;)V: I36 Branch 20 IFNONNULL L146 - false
   * 6 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.findParentList(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;)Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;: I39 Branch 9 IFEQ L82 - true
   */
  @Test
  public void test3()  throws Throwable  {
      DefaultMenuModel defaultMenuModel0 = new DefaultMenuModel();
      MenuItemList menuItemList0 = defaultMenuModel0.getRootList();
      DefaultMenuItem defaultMenuItem0 = new DefaultMenuItem((Object) menuItemList0);
      defaultMenuModel0.addMenuItem((IMenuItem) defaultMenuItem0);
      Object object0 = new Object();
      defaultMenuItem0.setParent(object0);
      HyperlinkMenuItemRenderer hyperlinkMenuItemRenderer0 = new HyperlinkMenuItemRenderer();
      defaultMenuModel0.addMenuItem((IMenuItem) defaultMenuItem0, (IMenuItemRenderer) hyperlinkMenuItemRenderer0);
  }

  //Test case number: 4
  /*
   * 8 covered goals:
   * 1 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.findParentList(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;)Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;: I20 Branch 8 IFEQ L77 - false
   * 2 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.findParentList(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;)Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;: I56 Branch 10 IFNULL L86 - false
   * 3 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.addMenuItem(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/renderer/IMenuItemRenderer;)V: I36 Branch 20 IFNONNULL L146 - true
   * 4 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.addMenuItem(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/renderer/IMenuItemRenderer;)V: I16 Branch 19 IFNONNULL L140 - true
   * 5 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.findParentList(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;)Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;: I4 Branch 6 IFNONNULL L75 - true
   * 6 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.findParentList(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;)Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;: I13 Branch 7 IFNULL L77 - true
   * 7 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.findParentList(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;)Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;: I13 Branch 7 IFNULL L77 - false
   * 8 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.findParentList(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;)Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;: I39 Branch 9 IFEQ L82 - false
   */
  @Test
  public void test4()  throws Throwable  {
      DefaultMenuModel defaultMenuModel0 = new DefaultMenuModel();
      MenuItemList menuItemList0 = defaultMenuModel0.getRootList();
      DefaultMenuItem defaultMenuItem0 = new DefaultMenuItem((Object) menuItemList0);
      Object object0 = new Object();
      defaultMenuItem0.setParent(object0);
      HyperlinkMenuItemRenderer hyperlinkMenuItemRenderer0 = new HyperlinkMenuItemRenderer();
      DefaultMenuItem defaultMenuItem1 = new DefaultMenuItem(object0);
      defaultMenuModel0.addMenuItem((IMenuItem) defaultMenuItem1, (IMenuItemRenderer) hyperlinkMenuItemRenderer0);
      defaultMenuModel0.addMenuItem((IMenuItem) defaultMenuItem0);
  }

  //Test case number: 5
  /*
   * 7 covered goals:
   * 1 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.findChildList(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;)Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;: I4 Branch 11 IFNULL L95 - false
   * 2 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.findChildList(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;)Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;: I9 Branch 12 IFEQ L95 - true
   * 3 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.findChildList(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;)Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;: I22 Branch 13 IFEQ L97 - false
   * 4 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.findChildList(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;)Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;: I39 Branch 14 IFNULL L101 - true
   * 5 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.findChildList(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;)Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;: I22 Branch 13 IFEQ L97 - true
   * 6 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.getChildList(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;)Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;: root-Branch
   * 7 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.findChildList(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;)Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;: I4 Branch 11 IFNULL L95 - true
   */
  @Test
  public void test5()  throws Throwable  {
      DefaultMenuModel defaultMenuModel0 = new DefaultMenuModel();
      MenuItemList menuItemList0 = defaultMenuModel0.getRootList();
      DefaultMenuItem defaultMenuItem0 = new DefaultMenuItem((Object) menuItemList0);
      defaultMenuModel0.addMenuItem((IMenuItem) defaultMenuItem0);
      defaultMenuModel0.getChildList((IMenuItem) null);
      assertEquals("(0) null\n   (0) null", defaultMenuModel0.displayMenuStructure());
  }

  //Test case number: 6
  /*
   * 6 covered goals:
   * 1 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.findChildList(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;)Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;: I9 Branch 12 IFEQ L95 - false
   * 2 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.findChildList(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;)Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;: I39 Branch 14 IFNULL L101 - false
   * 3 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.getChildList(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;)Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;: root-Branch
   * 4 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.findChildList(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;)Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;: I4 Branch 11 IFNULL L95 - true
   * 5 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.findChildList(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;)Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;: I4 Branch 11 IFNULL L95 - false
   * 6 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.findChildList(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;)Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;: I22 Branch 13 IFEQ L97 - false
   */
  @Test
  public void test6()  throws Throwable  {
      DefaultMenuModel defaultMenuModel0 = new DefaultMenuModel();
      MenuItemList menuItemList0 = defaultMenuModel0.getRootList();
      DefaultMenuItem defaultMenuItem0 = new DefaultMenuItem((Object) menuItemList0);
      defaultMenuModel0.addMenuItem((IMenuItem) defaultMenuItem0);
      defaultMenuModel0.getChildList((IMenuItem) defaultMenuItem0);
      assertEquals("(0) null\n   (0) null", defaultMenuModel0.displayMenuStructure());
  }

  //Test case number: 7
  /*
   * 2 covered goals:
   * 1 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.checkMenuModelHealth()V: I5 Branch 15 IFLE L111 - true
   * 2 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.checkMenuModelHealth()V: I18 Branch 16 IFNE L113 - true
   */
  @Test
  public void test7()  throws Throwable  {
      DefaultMenuModel defaultMenuModel0 = new DefaultMenuModel();
      defaultMenuModel0.checkMenuModelHealth();
      assertEquals("(0) null", defaultMenuModel0.displayMenuStructure());
  }

  //Test case number: 8
  /*
   * 8 covered goals:
   * 1 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.displayMenuList(Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;Ljava/lang/StringBuffer;)Ljava/lang/String;: I27 Branch 17 IFEQ L129 - false
   * 2 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.getRootList()Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;: root-Branch
   * 3 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.displayMenuStructure()Ljava/lang/String;: root-Branch
   * 4 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.addMenuItemToList(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;)V: root-Branch
   * 5 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.displayMenuList(Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;Ljava/lang/StringBuffer;)Ljava/lang/String;: I27 Branch 17 IFEQ L129 - true
   * 6 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.addMenuItem(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/renderer/IMenuItemRenderer;)V: I3 Branch 18 IFNONNULL L137 - true
   * 7 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.addMenuItem(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/renderer/IMenuItemRenderer;)V: I16 Branch 19 IFNONNULL L140 - false
   * 8 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.attachOrphans(Lch/bluepenguin/tapestry/components/menu/model/impl/MenuItemList;)V: I9 Branch 3 IF_ICMPGE L59 - true
   */
  @Test
  public void test8()  throws Throwable  {
      DefaultMenuModel defaultMenuModel0 = new DefaultMenuModel();
      MenuItemList menuItemList0 = defaultMenuModel0.getRootList();
      DefaultMenuItem defaultMenuItem0 = new DefaultMenuItem((Object) menuItemList0);
      defaultMenuModel0.addMenuItem((IMenuItem) defaultMenuItem0);
      assertEquals(1, menuItemList0.getChildrenSize());
      
      String string0 = defaultMenuModel0.displayMenuStructure();
      assertEquals("(0) null\n   (0) null", defaultMenuModel0.displayMenuStructure());
      assertEquals("(0) null\n   (0) null", string0);
  }

  //Test case number: 9
  /*
   * 3 covered goals:
   * 1 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.addMenuItem(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;Lch/bluepenguin/tapestry/components/menu/renderer/IMenuItemRenderer;)V: I3 Branch 18 IFNONNULL L137 - false
   * 2 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.<init>()V: root-Branch
   * 3 ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel.addMenuItem(Lch/bluepenguin/tapestry/components/menu/model/IMenuItem;)V: root-Branch
   */
  @Test
  public void test9()  throws Throwable  {
      DefaultMenuModel defaultMenuModel0 = new DefaultMenuModel();
      defaultMenuModel0.addMenuItem((IMenuItem) null);
      assertEquals("(0) null", defaultMenuModel0.displayMenuStructure());
  }
}
