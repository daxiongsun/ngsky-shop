package com.ngsky.mapper;

import com.ngsky.bean.Order;
import com.ngsky.bean.OrderExample;

/**
 * OrderDAO继承基类
 */
public interface OrderDAO extends MyBatisBaseDao<Order, String, OrderExample> {
}