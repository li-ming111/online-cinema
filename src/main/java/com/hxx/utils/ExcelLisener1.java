package com.hxx.utils;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.hxx.domain.ReadData;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//创建读取excel监听器
public class ExcelLisener1 extends AnalysisEventListener<ReadData> {

    //list集合封装最后的数据
    private List<ReadData> list = new ArrayList<>();

    @Override//读取Excel数据
    public void invoke(ReadData readData, AnalysisContext analysisContext) {
        System.out.println("------读取Excel数据----->>"+readData);
        list.add(readData);
    }

    @Override//读取Excel表头信息
    public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
        System.out.println("表头信息:"+headMap);
    }

    @Override//读取后的操作
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}