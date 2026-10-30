package com.hxx.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hxx.entity.HxxVideoEntity;
import com.hxx.mapper.HxxVideoDao;
import com.hxx.service.HxxVideoService;
import org.springframework.stereotype.Service;
import java.util.Map;


@Service("hxxVideoService")
public class HxxVideoServiceImpl extends ServiceImpl<HxxVideoDao, HxxVideoEntity> implements HxxVideoService {

    @Override
    public Page<HxxVideoEntity> queryPage(Page<HxxVideoEntity> page, HxxVideoEntity videoEntity) {
        return null;
    }
}