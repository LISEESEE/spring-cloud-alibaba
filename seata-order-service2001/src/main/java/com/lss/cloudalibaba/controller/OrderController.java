package com.lss.cloudalibaba.controller;

import com.lss.cloudalibaba.domain.CommonResult;
import com.lss.cloudalibaba.domain.Order;
import com.lss.cloudalibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController
{
    @Resource
    private OrderService orderService;


    @GetMapping("/ordDataSourceProxyConfig\n" +
            "MyBatisConfiger/create")
    public CommonResult create(Order order)
    {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
