package com.hxx.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hxx.entity.HxxMoviesEntity;
import com.hxx.mapper.HxxMoviesDao;
import com.hxx.service.HxxMoviesService;
import org.springframework.stereotype.Service;
import java.util.Map;


@Service("hxxMoviesService")
public class HxxMoviesServiceImpl extends ServiceImpl<HxxMoviesDao, HxxMoviesEntity> implements HxxMoviesService {

    @Override
    public Page<HxxMoviesEntity> queryPage(Page<HxxMoviesEntity> page, HxxMoviesEntity moviesEntity) {
        return null;
    }
}