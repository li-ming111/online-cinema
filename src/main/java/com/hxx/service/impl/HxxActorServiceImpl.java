package com.hxx.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hxx.entity.HxxActorEntity;
import com.hxx.mapper.HxxActorDao;
import com.hxx.service.HxxActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


@Service("hxxActorService")
public class HxxActorServiceImpl extends ServiceImpl<HxxActorDao, HxxActorEntity> implements HxxActorService {

    @Autowired
    private HxxActorDao hxxActorDao;

    @Override
    public Page<HxxActorEntity> queryPage(Page<HxxActorEntity> page, HxxActorEntity actorEntity) {
        return hxxActorDao.selectPage(page,null) ;
    }
}