package com.data2.demo.test;

import com.data2.project.system.menu.entity.Menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MenuTree {


    /**
     * 根据传入的父ID获取子菜单列表
     * @param list
     * @param parentId
     * @return
     */
    public static List<Menu> getMenuChildList(List<Menu> list,int parentId){
       List<Menu> listChild = new ArrayList<Menu>();
       for (Iterator<Menu> it = list.iterator();it.hasNext();){
           Menu t = (Menu) it.next();
           if (t.getParentId() == parentId){
               recursionMenu(list,t);
               listChild.add(t);
           }
       }

       return listChild;
    }

    /**
     * 得到菜单子节点
     * @param list
     * @param t
     * @return
     */
    public static List<Menu> getChildList(List<Menu> list,Menu t){
        List<Menu> tlist = new ArrayList<Menu>();
        Iterator<Menu> it = list.iterator();
        while (it.hasNext()){
            Menu n = (Menu) it.next();
            if (n.getParentId().longValue() == t.getMenuId().longValue()){
                tlist.add(n);
            }
        }
        return tlist;
    }

    /**
     * 递归列表 menu
     * @param list
     * @param t
     */
    public static void recursionMenu(List<Menu> list,Menu t){
       //得到子节点列表
        List<Menu> childList = getChildList(list, t);
        t.setChildren(childList);
        for (Menu tchild : childList){
            if (hasChild(list,tchild)){
                Iterator<Menu> it = childList.iterator();
                while (it.hasNext()){
                    Menu n = (Menu) it.next();
                    recursionMenu(list,n);
                }
            }
        }

    }

    /**
     * 判断是否有子节点
     * @param list
     * @param t
     * @return
     */
    public static boolean hasChild(List<Menu> list,Menu t){
        return getChildList(list,t).size() > 0 ? true : false;
    }
}
