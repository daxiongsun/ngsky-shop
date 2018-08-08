package com.ngsky.interfaces;

import com.ngsky.bean.Item;
import com.ngsky.common.pojo.DataResult;

public interface ItemService {
    Item getItemById(long id);
    DataResult getItemList(int page, int rows);
}
