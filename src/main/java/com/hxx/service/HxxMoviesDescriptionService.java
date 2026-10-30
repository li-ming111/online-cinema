package com.hxx.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hxx.entity.HxxMoviesDescriptionEntity;

import java.util.Map;

/**
 * 影视简介表
 *
 * @author siming
 * @email sunlightcs@gmail.com
 * @date 2025-12-06 08:45:45
 */
public interface HxxMoviesDescriptionService extends IService<HxxMoviesDescriptionEntity> {

    Page<HxxMoviesDescriptionEntity> queryPage(Page<HxxMoviesDescriptionEntity> page,HxxMoviesDescriptionEntity descriptionEntity);
}

