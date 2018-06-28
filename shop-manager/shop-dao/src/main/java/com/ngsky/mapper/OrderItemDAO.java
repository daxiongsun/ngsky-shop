package com.ngsky.mapper;

import com.ngsky.bean.OrderItem;
import com.ngsky.bean.OrderItemExample;

/**
 * OrderItemDAO继承基类
 */
public interface OrderItemDAO extends MyBatisBaseDao<OrderItem, String, OrderItemExample> {
}