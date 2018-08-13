package com.ngsky.interfaces;

import com.ngsky.bean.Order;
import com.ngsky.common.pojo.DataResult;

/**
 * @Description TODO
 * @Author daxiong
 * @Date 8/9/2018 8:32 PM
 **/
public interface OrderService {
    Order getOrderById(Long orderId);
    DataResult getOrderList(Long userId);
}
