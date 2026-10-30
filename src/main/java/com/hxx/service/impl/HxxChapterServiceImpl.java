package com.hxx.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.Query;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hxx.entity.HxxChapterEntity;
import com.hxx.entity.HxxVideoEntity;
import com.hxx.mapper.HxxChapterDao;
import com.hxx.service.HxxChapterService;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service("hxxChapterService")
public class HxxChapterServiceImpl extends ServiceImpl<HxxChapterDao, HxxChapterEntity> implements HxxChapterService {

    @Override
    public Page<HxxChapterEntity> queryPage(Page<HxxChapterEntity> page, HxxVideoEntity videoEntity) {
        return null;
    }
}