package com.hxx.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hxx.entity.HxxMoviesCollectEntity;
import com.hxx.mapper.HxxMoviesCollectDao;
import com.hxx.service.HxxMoviesCollectService;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service("hxxMoviesCollectService")
public class HxxMoviesCollectServiceImpl extends ServiceImpl<HxxMoviesCollectDao, HxxMoviesCollectEntity> implements HxxMoviesCollectService {

    @Override
    public Page<HxxMoviesCollectEntity> queryPage(Page<HxxMoviesCollectEntity> page, HxxMoviesCollectEntity collectEntity) {
        return null;
    }
}