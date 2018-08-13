package com.ngsky.service.impl;

import com.ngsky.bean.ItemCat;
import com.ngsky.bean.ItemCatExample;
import com.ngsky.common.pojo.TreeNode;
import com.ngsky.interfaces.ItemCatService;
import com.ngsky.mapper.ItemCatDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author daxiong
 * @Date 8/9/2018 8:27 PM
 **/
@Service
public class ItemCatServiceImpl implements ItemCatService {

    @Autowired
    private ItemCatDAO itemCatDAO;

    @Override
    public List<TreeNode> getItemCatByPatentId(Long parentId) {
        ItemCatExample example = new ItemCatExample();
        ItemCatExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        List<ItemCat> itemCats = itemCatDAO.selectByExample(example);
        List<TreeNode> treeNodes = new ArrayList<>();
        for(ItemCat ic : itemCats){
            TreeNode treeNode = new TreeNode();
            treeNode.setId(ic.getId());
            treeNode.setState("0");
            treeNode.setContent(ic.getName());
            treeNodes.add(treeNode);
        }
        return treeNodes;
    }

    @Override
    public ItemCat getItemCatById(Long id) {
        return itemCatDAO.selectByPrimaryKey(id);
    }
}
