package com.hxx.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hxx.entity.HxxVideoEntity;

/**
 * 电影视频表
 *
 * @author siming
 * @email sunlightcs@gmail.com
 * @date 2025-12-06 08:45:45
 */
public interface HxxVideoService extends IService<HxxVideoEntity> {

    Page<HxxVideoEntity> queryPage(Page<HxxVideoEntity> page,HxxVideoEntity videoEntity);
}

