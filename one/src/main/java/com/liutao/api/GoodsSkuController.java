package com.liutao.api;

import com.liutao.entity.GoodsSku;
import com.liutao.service.GoodsSkuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/goodsSku")
public class GoodsSkuController {


    @Resource
    private GoodsSkuService goodsSkuService;

    @GetMapping("/selectAll")
    public List<GoodsSku> selectAll(GoodsSku goodsSku) throws Exception {
        return goodsSkuService.findList(goodsSku);
    }
}