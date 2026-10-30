package com.hxx.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hxx.entity.HxxActorEntity;
import com.hxx.entity.HxxVideoEntity;

import java.util.Map;

/**
 * 演员表
 *
 * @author siming
 * @email sunlightcs@gmail.com
 * @date 2025-12-06 08:45:45
 */
public interface HxxActorService extends IService<HxxActorEntity> {
    Page<HxxActorEntity> queryPage(Page<HxxActorEntity> page, HxxActorEntity actorEntity);
}

