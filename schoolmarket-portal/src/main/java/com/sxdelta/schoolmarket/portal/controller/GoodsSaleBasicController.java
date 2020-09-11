package com.sxdelta.schoolmarket.portal.controller;

import com.sxdelta.schoolmarket.common.api.CommonPage;
import com.sxdelta.schoolmarket.common.api.CommonResult;
import com.sxdelta.schoolmarket.model.SmGoodsSale;
import com.sxdelta.schoolmarket.portal.service.GoodsSaleBasicService;
import com.sxdelta.schoolmarket.portal.service.OssService;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 卖家商品类
 */
@RestController
@RequestMapping(value = "/goodsSale")
public class GoodsSaleBasicController {

    @Autowired
    GoodsSaleBasicService goodsSaleBasicService;
    @Autowired
    OssService ossService;

    @ApiOperation("卖家发布商品")
    @RequestMapping(value = "/addGoodsSale", method = RequestMethod.POST)
    public CommonResult addGoodsSale(@RequestBody SmGoodsSale goods){
        int count = goodsSaleBasicService.addGoodsSale(goods);
        if(count>0){
            return CommonResult.success(count);
        }else{
            return CommonResult.failed();
        }
    }

    @ApiOperation("卖家批量上下架商品")
    @RequestMapping(value = "/update/shelveStatus", method = RequestMethod.POST)
    public CommonResult updateShelveStatus(@RequestParam("goodsIDs") List<String> goodsIDs,
                                             @RequestParam("shelveStatus") Integer shelveStatus){
        int count = goodsSaleBasicService.updateShelveStatus(goodsIDs, shelveStatus);
        if(count>0){
            return CommonResult.success(count);
        }else{
            return CommonResult.failed();
        }
    }

    @ApiOperation("更新商品")
    @RequestMapping(value = "/update/{goodsID}", method = RequestMethod.POST)
    public CommonResult updateGoodsSale(@PathVariable String goodsId, @RequestBody SmGoodsSale smGoodsSale){
        int count = goodsSaleBasicService.updateGoodsSale(goodsId, smGoodsSale);
        if(count>0){
            return CommonResult.success(count);
        }else{
            return CommonResult.failed();
        }
    }

    @ApiOperation("卖家批量删除商品")
    @RequestMapping(value = "/deleteGoodsSale", method = RequestMethod.POST)
    public CommonResult deleteGoodsSale(@RequestParam("goodsIDs") List<String> goodsIDs){
        int count = goodsSaleBasicService.deleteGoodsSale(goodsIDs);
        if(count>0){
            return CommonResult.success(count);
        }else{
            return CommonResult.failed();
        }
    }

    @ApiOperation("查询具体商品")
    @RequestMapping(value = "/getGoodsSaleInfo", method = RequestMethod.POST)
    public CommonResult<SmGoodsSale> getGoodsSaleInfo(@RequestParam("goodsID") String goodsID){
        SmGoodsSale goodsSale = goodsSaleBasicService.getSmGoodsSaleInfo(goodsID);
        return CommonResult.success(goodsSale);
    }

    @ApiOperation("根据所在学校以及所给条件的数列出商品，默认点赞数")
    @RequestMapping(value = "/getGoodsListBySchoolAndConditions", method = RequestMethod.POST)
    public CommonResult<CommonPage<SmGoodsSale>> getGoodsListBySchoolAndStar(@RequestParam("school") String school,
                                                                             @RequestParam("condition") String condition,//collect_num,comment_num, star_num
                                                                             @RequestParam(required = false, defaultValue = "1") Integer pageNum,
                                                                             @RequestParam(required = false, defaultValue = "5") Integer pageSize){
        List<SmGoodsSale> goodsSaleList = goodsSaleBasicService.getGoodsListBySchoolAndConditions(school, condition, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(goodsSaleList));
    }

    //@ApiOperation("点击购买按钮，进行支付宝支付")


}
