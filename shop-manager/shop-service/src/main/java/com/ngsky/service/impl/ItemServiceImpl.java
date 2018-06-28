package com.ngsky.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ngsky.interfaces.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
    @Override
    public String find(long id) {
        return "hello:" + id;
    }
}
