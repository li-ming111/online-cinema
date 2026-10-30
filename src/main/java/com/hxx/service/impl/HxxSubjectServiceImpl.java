package com.hxx.service.impl;

import com.alibaba.excel.EasyExcel;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hxx.entity.HxxSubjectEntity;
import com.hxx.entity.ReadData;
import com.hxx.mapper.HxxSubjectDao;
import com.hxx.service.HxxSubjectService;
import com.hxx.utils.ExcelLisener;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.Map;


@Service("hxxSubjectService")
public class HxxSubjectServiceImpl extends ServiceImpl<HxxSubjectDao, HxxSubjectEntity> implements HxxSubjectService {

    @Override
    public void batchImport(MultipartFile file, HxxSubjectService subjectService) {
        try {
            InputStream inputStream = file.getInputStream();
            //需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
            EasyExcel.read(inputStream, ReadData.class,
                    new ExcelLisener(subjectService)).sheet().doRead();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Page<HxxSubjectEntity> queryPage(Page<HxxSubjectEntity> page, HxxSubjectEntity subjectEntity) {
        return null;
    }
}