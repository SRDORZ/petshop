package com.pet.shop.service;

import com.github.pagehelper.PageInfo;
import com.pet.shop.model.Resources;

import java.util.List;
import java.util.Map;

/**
 * Created by zhujr on 2017/11/02.
 */
public interface ResourcesService extends IService<Resources> {
    PageInfo<Resources> selectByPage(Resources resources, int start, int length);

    public List<Resources> queryAll();

    public List<Resources> loadUserResources(Map<String,Object> map);

    public List<Resources> queryResourcesListWithSelected(Integer rid);
}
