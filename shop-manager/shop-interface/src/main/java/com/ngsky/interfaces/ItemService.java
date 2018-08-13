package com.ngsky.interfaces;

import com.ngsky.bean.Item;
import com.ngsky.common.pojo.DataResult;

public interface ItemService {
    /**
     * @author sunyx
     * @param id item id
     * @return item
     * */
    Item getItemById(long id);

    /**
     * @author sunyx
     * @param categoryId: 内容类目Id, 为null或者"" 时，不作为条件查询
     * @param startTime: 起始时间
     * @param endTime: 终止时间
     * @param page 第几页， 可配置
     * @param rows 每页多少条, 可配置
     * @return 总数及集合
     * */
    DataResult getItemList(Long categoryId, String startTime, String endTime, int page, int rows);
}
