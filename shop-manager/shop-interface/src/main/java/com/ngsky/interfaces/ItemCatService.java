package com.ngsky.interfaces;

import com.ngsky.bean.ItemCat;
import com.ngsky.common.pojo.TreeNode;

import java.util.List;

/**
 * @Description item cat
 * @Author daxiong
 * @Date 8/9/2018 12:03 AM
 **/
public interface ItemCatService {
    /**
     * @date: 8/9/2018
     * @author: daxiong
     * @description: 根据父级id查询分类
     * @param parentId 父级id
     * @return 树形结构集合
     **/
    List<TreeNode> getItemCatByPatentId(Long parentId);

    ItemCat getItemCatById(Long id);
}
