package com.hxx.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hxx.entity.HxxBannerEntity;
import com.hxx.mapper.HxxBannerDao;
import com.hxx.service.HxxBannerService;
import org.springframework.stereotype.Service;

@Service("hxxBannerService")
public class HxxBannerServiceImpl extends ServiceImpl<HxxBannerDao, HxxBannerEntity> implements HxxBannerService {


    @Override
    public Page<HxxBannerEntity> queryPage(Page<HxxBannerEntity> page, HxxBannerEntity bannerEntity) {
        return null;
    }
}