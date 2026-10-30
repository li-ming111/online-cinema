package com.hxx.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hxx.entity.HxxMoviesCollectEntity;

import java.util.Map;

/**
 * 影视收藏表
 *
 * @author siming
 * @email sunlightcs@gmail.com
 * @date 2025-12-06 08:45:45
 */
public interface HxxMoviesCollectService extends IService<HxxMoviesCollectEntity> {

    Page<HxxMoviesCollectEntity> queryPage(Page<HxxMoviesCollectEntity> page,
                                           HxxMoviesCollectEntity collectEntity);
}

