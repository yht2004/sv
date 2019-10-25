package com.data2.common.utils;


import com.data2.project.system.menu.entity.Menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TreeUtils {

    /**
     * 根据传入的父节点获取菜单
     * @param list
     * @param parentId
     * @return
     */
    public static List<Menu> getChildListMenu(List<Menu> list,int parentId){
        List<Menu> returnList = new ArrayList<Menu>();
        Iterator<Menu> it = list.iterator();
        while (it.hasNext()){
            Menu n = (Menu) it.next();
            if (n.getParentId() == parentId){
                recursionFn(list,n);
                returnList.add(n);
            }
        }

        return returnList;
    }

    /**
     * 获取子节点列表
     * @param list
     * @param t
     * @return
     */
    public static List<Menu> getListChild(List<Menu> list,Menu t){
        List<Menu> tlist = new ArrayList<Menu>();
        Iterator<Menu> it = list.iterator();
        while (it.hasNext()){
            Menu n = (Menu) it.next();
            if (n.getParentId().intValue() == t.getMenuId().intValue()){
                tlist.add(n);
            }
        }
        return tlist;
    }

    /**
     * 递归列表
     */
    public static void recursionFn(List<Menu> list,Menu t){
        //得到所有子节点列表
        List<Menu> listChild = getListChild(list, t);
        t.setChildren(listChild);
        for (Menu tchild : listChild){
            if (hasChild(list,tchild)){
                Iterator<Menu> it = listChild.iterator();
                while(it.hasNext()){
                    Menu m = (Menu) it.next();
                    recursionFn(list,m);
                }
            }
        }

    }

    /**
     * 判断是否存在子节点
     */
    public static boolean hasChild(List<Menu> list,Menu t){
        return getListChild(list,t).size() > 0 ? true : false;
    }
}
