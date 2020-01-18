package com.myself.test.service;

import com.myself.test.BaseTestCase;
import com.myself.test.db.entity.HotGoods;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 类名称：HotGoodsServiceTest<br>
 * 类描述：<br>
 * 创建时间：2020年01月17日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
public class HotGoodsServiceTest extends BaseTestCase {

    @Autowired
    private HotGoodsService hotGoodsService;

    @Test
    public void insert() {
        HotGoods hotGoods = new HotGoods();
        hotGoods.setDept("测试油品公司001");
        hotGoods.setGoodsName("测试油品0011");
        hotGoods.setGoodsPrice(new BigDecimal("111.000"));
        hotGoods.setCrtUser(6604647678926128149L);
        hotGoods.setCrtTime(new Date());
        int result = hotGoodsService.insert(hotGoods);
        assert result > 0;
    }

    @Test
    public void batchInsert() {
        HotGoods hotGoods = new HotGoods();
        hotGoods.setDept("测试油品公司001");
        hotGoods.setGoodsName("测试油品0011");
        hotGoods.setGoodsPrice(new BigDecimal("111.000"));
        hotGoods.setCrtUser(6604647678926128149L);
        hotGoods.setCrtTime(new Date());

        HotGoods hotGoods1 = new HotGoods();
        hotGoods1.setDept("测试油品公司001");
        hotGoods1.setGoodsName("测试油品0011");
        hotGoods1.setGoodsPrice(new BigDecimal("111.000"));
        hotGoods1.setCrtUser(6604647678926128149L);
        hotGoods1.setCrtTime(new Date());

        List<HotGoods> hotGoodsList = new ArrayList<>();
        hotGoodsList.add(hotGoods);
        hotGoodsList.add(hotGoods1);

        int result = hotGoodsService.batchInsert(hotGoodsList);
        assert result > 0;
    }
}
