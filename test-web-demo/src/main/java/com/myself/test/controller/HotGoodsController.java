package com.myself.test.controller;

import com.myself.test.db.entity.HotGoods;
import com.myself.test.service.HotGoodsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类名称：HotGoodsController<br>
 * 类描述：<br>
 * 创建时间：2020年01月12日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
@RestController
public class HotGoodsController {

    private final HotGoodsService hotGoodsService;

    public HotGoodsController(HotGoodsService hotGoodsService) {
        this.hotGoodsService = hotGoodsService;
    }

    @GetMapping(value = "/get")
    public HotGoods get(@RequestParam("id") Long id) {
        return hotGoodsService.findById(id);
    }
}
