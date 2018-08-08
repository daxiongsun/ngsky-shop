package com.ngsky.web.api;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ngsky.bean.Item;
import com.ngsky.interfaces.ItemService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class Consumer {

    @Reference
    public ItemService itemService;

    @RequestMapping("/index")
    public Item test() {
        Item item = itemService.getItemById(12);
        System.out.println(item.toString());
        return item;
    }
}
