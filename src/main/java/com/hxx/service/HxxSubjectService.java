package com.hxx.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hxx.entity.HxxSubjectEntity;
import org.springframework.web.multipart.MultipartFile;

/**
 * 影视类别表
 *
 * @author siming
 * @email sunlightcs@gmail.com
 * @date 2025-12-06 08:45:45
 */
public interface HxxSubjectService extends IService<HxxSubjectEntity> {

    void batchImport(MultipartFile file, HxxSubjectService subjectService);
    Page<HxxSubjectEntity> queryPage(Page<HxxSubjectEntity> page,HxxSubjectEntity subjectEntity);
}

