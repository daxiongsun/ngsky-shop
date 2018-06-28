package com.ngsky.mapper;

import com.ngsky.bean.Content;
import com.ngsky.bean.ContentExample;

/**
 * ContentDAO继承基类
 */
public interface ContentDAO extends MyBatisBaseDao<Content, Long, ContentExample> {
}