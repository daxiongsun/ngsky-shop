package com.ngsky.interfaces;

import com.ngsky.bean.ItemParam;
import com.ngsky.common.pojo.DataResult;

/**
 * @Description TODO
 * @Author daxiong
 * @Date 8/9/2018 8:31 PM
 **/
public interface ItemParamService {
    ItemParam getItemParamById(Long id);
    DataResult getItemParamList(Long itemCatId);
}
