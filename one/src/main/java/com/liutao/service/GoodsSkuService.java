package com.liutao.service;

import com.liutao.db.dao.DaoSupport;
import com.liutao.entity.GoodsSku;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsSkuService {

    @Resource(name = "daoSupport")
    private DaoSupport dao;


    public List<GoodsSku> findList(GoodsSku goodsSku) throws Exception {
        return (List<GoodsSku>) dao.findForList("GoodsSkuMapper.findList", goodsSku);
    }

}
