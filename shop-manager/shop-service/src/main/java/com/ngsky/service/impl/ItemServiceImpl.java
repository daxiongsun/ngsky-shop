package com.ngsky.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ngsky.bean.Item;
import com.ngsky.bean.ItemExample;
import com.ngsky.common.pojo.DataResult;
import com.ngsky.interfaces.ItemService;
import com.ngsky.mapper.ItemDAO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDAO itemDAO;

    @Override
    public Item getItemById(long id) {
        ItemExample example = new ItemExample();
        ItemExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        List<Item> itemList = itemDAO.selectByExample(example);
        if (null != itemList && itemList.size() > 0)
            return itemList.get(0);
        else
            return null;
    }

    @Override
    public com.ngsky.common.pojo.DataResult getItemList(int page, int rows) {
        PageHelper.startPage(page, rows);
        ItemExample example = new ItemExample();
        List<Item> itemList = itemDAO.selectByExample(example);
        DataResult result = new DataResult();
        result.setRows(itemList);
        PageInfo<Item> pageInfo = new PageInfo<>(itemList);
        long total = pageInfo.getTotal();
        result.setTotal(total);
        return result;
    }
}
