package com.hxx.service;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hxx.entity.HxxChapterEntity;
import com.hxx.entity.HxxVideoEntity;

import java.util.Map;

/**
 * 影视片段表
 *
 * @author siming
 * @email sunlightcs@gmail.com
 * @date 2025-12-06 08:45:45
 */
public interface HxxChapterService extends IService<HxxChapterEntity> {

    Page<HxxChapterEntity> queryPage(Page<HxxChapterEntity> page,
                                     HxxVideoEntity videoEntity);
}

