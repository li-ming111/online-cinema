package com.hxx.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hxx.entity.HxxMoviesDescriptionEntity;
import com.hxx.mapper.HxxMoviesDescriptionDao;
import org.springframework.stereotype.Service;
import com.hxx.service.HxxMoviesDescriptionService;

@Service("hxxMoviesDescriptionService")
public class HxxMoviesDescriptionServiceImpl extends ServiceImpl<HxxMoviesDescriptionDao, HxxMoviesDescriptionEntity>
        implements HxxMoviesDescriptionService {

    @Override
    public Page<HxxMoviesDescriptionEntity> queryPage(Page<HxxMoviesDescriptionEntity> page, HxxMoviesDescriptionEntity descriptionEntity) {
        return null;
    }
}