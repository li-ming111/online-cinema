package com.hxx.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hxx.entity.HxxActorEntity;
import com.hxx.entity.HxxBannerEntity;

import java.util.Map;

/**
 * 影视图片表
 *
 * @author siming
 * @email sunlightcs@gmail.com
 * @date 2025-12-06 08:45:45
 */
public interface HxxBannerService extends IService<HxxBannerEntity> {
    Page<HxxBannerEntity> queryPage(Page<HxxBannerEntity> page, HxxBannerEntity bannerEntity);
}

