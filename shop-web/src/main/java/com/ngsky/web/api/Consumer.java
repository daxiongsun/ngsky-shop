package com.ngsky.web.api;

import com.alibaba.dubbo.config.annotation.Reference;
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
    public String test(){
        String str = itemService.find(25);
        System.out.println(str);
        return str;
    }
}
