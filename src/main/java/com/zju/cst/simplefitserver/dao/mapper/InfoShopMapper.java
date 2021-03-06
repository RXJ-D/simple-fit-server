package com.zju.cst.simplefitserver.dao.mapper;

import com.zju.cst.simplefitserver.model.InfoShop;


public interface InfoShopMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InfoShop record);

    int insertSelective(InfoShop record);

    InfoShop selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InfoShop record);

    int updateByPrimaryKey(InfoShop record);
}