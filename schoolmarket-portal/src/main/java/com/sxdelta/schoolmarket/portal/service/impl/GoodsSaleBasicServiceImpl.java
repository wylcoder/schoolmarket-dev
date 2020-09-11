package com.sxdelta.schoolmarket.portal.service.impl;

import com.github.pagehelper.PageHelper;
import com.sxdelta.schoolmarket.mapper.SmGoodsSaleMapper;
import com.sxdelta.schoolmarket.model.SmGoodsSale;
import com.sxdelta.schoolmarket.model.SmGoodsSaleExample;
import com.sxdelta.schoolmarket.portal.dao.GoodsSaleDao;
import com.sxdelta.schoolmarket.portal.domain.GoodsSale;
import com.sxdelta.schoolmarket.portal.dto.OssCallbackParam;
import com.sxdelta.schoolmarket.portal.dto.OssCallbackResult;
import com.sxdelta.schoolmarket.portal.service.GoodsSaleBasicService;
import com.sxdelta.schoolmarket.portal.service.OssService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class GoodsSaleBasicServiceImpl implements GoodsSaleBasicService {

    @Autowired
    SmGoodsSaleMapper smGoodsSaleMapper;
    @Autowired
    GoodsSaleDao goodsSaleDao;

    @Override
    public int addGoodsSale(SmGoodsSale smGoodsSale) {
        int count = 0;
        count = smGoodsSaleMapper.insert(smGoodsSale);
        return count;
    }

    @Override
    public int updateShelveStatus(List<String> goodsIDs, Integer shelveStatus) {
        SmGoodsSale goods = new SmGoodsSale();
        goods.setStatus(shelveStatus);
        SmGoodsSaleExample example = new SmGoodsSaleExample();
        example.createCriteria().andGoodsIdIn(goodsIDs);
        return smGoodsSaleMapper.updateByExample(goods, example);
    }

    @Override
    public int deleteGoodsSale(List<String> goodsIDs) {
        SmGoodsSaleExample example = new SmGoodsSaleExample();
        example.createCriteria().andGoodsIdIn(goodsIDs);
        return smGoodsSaleMapper.deleteByExample(example);
    }

    @Override
    public int updateGoodsSale(String goodsID, SmGoodsSale smGoodsSale) {
        SmGoodsSaleExample example = new SmGoodsSaleExample();
        example.createCriteria().andGoodsIdEqualTo(goodsID);
        return smGoodsSaleMapper.updateByExample(smGoodsSale, example);
    }

    @Override
    public SmGoodsSale getSmGoodsSaleInfo(String goodsID) {
        SmGoodsSaleExample example = new SmGoodsSaleExample();
        SmGoodsSaleExample.Criteria criteria = example.createCriteria();
        criteria.andGoodsIdEqualTo(goodsID);
        return smGoodsSaleMapper.selectByExample(example).get(0);
    }

    @Override
    public List<SmGoodsSale> getGoodsListBySchoolAndConditions(String school, String condition, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        SmGoodsSaleExample example = new SmGoodsSaleExample();
        example.createCriteria().andAddressSchoolEqualTo(school);
        example.setOrderByClause(condition + " desc");
        return smGoodsSaleMapper.selectByExample(example);
    }


}
