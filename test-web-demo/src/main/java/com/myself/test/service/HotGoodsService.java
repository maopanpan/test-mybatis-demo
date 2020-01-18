package com.myself.test.service;

import com.myself.test.db.entity.HotGoods;
import com.myself.test.db.mapper.HotGoodsMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类名称：HotGoodsService<br>
 * 类描述：<br>
 * 创建时间：2020年01月12日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
@Service
public class HotGoodsService {

    private final HotGoodsMapper hotGoodsMapper;

    public HotGoodsService(HotGoodsMapper hotGoodsMapper) {
        this.hotGoodsMapper = hotGoodsMapper;
    }

    public HotGoods findById(Long id) {
        return hotGoodsMapper.selectByPrimaryKey(id);
    }


    public int insert(HotGoods hotGoods) {
        return hotGoodsMapper.insert(hotGoods);
    }

    public int batchInsert(List<HotGoods> hotGoodsList) {
        return hotGoodsMapper.batchInsert(hotGoodsList);
    }
}
