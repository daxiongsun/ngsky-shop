package com.ngsky.mapper;

import com.ngsky.bean.Item;
import com.ngsky.bean.ItemExample;

/**
 * ItemDAO继承基类
 */
public interface ItemDAO extends MyBatisBaseDao<Item, Long, ItemExample> {
}