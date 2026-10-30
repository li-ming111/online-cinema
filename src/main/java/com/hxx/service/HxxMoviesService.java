package com.hxx.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hxx.entity.HxxMoviesEntity;

import java.util.Map;

/**
 * 影片表
 *
 * @author siming
 * @email sunlightcs@gmail.com
 * @date 2025-12-06 08:45:45
 */
public interface HxxMoviesService extends IService<HxxMoviesEntity> {

    Page<HxxMoviesEntity> queryPage(Page<HxxMoviesEntity> page,HxxMoviesEntity moviesEntity);
}

