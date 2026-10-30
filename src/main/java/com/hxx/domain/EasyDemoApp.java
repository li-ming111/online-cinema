package com.hxx.domain;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.hxx.utils.ExcelLisener1;
import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class EasyDemoApp {

    @Test
    public void test1() {
        //文件路径
        String fileName = "d:/zmx/112.xlsx";
        //读取
        EasyExcel.read(fileName, ReadData.class,new ExcelLisener1()).sheet().doRead();
    }

    @Test
    public void test2() throws Exception{
        //文件路径
        String fileName = "d:/zmx/112.xlsx";
        //读取
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(fileName));
        ExcelReader excelReader = EasyExcel.read(in, ReadData.class, new ExcelLisener1()).build();
        ReadSheet readSheet = EasyExcel.readSheet(0).build();
        excelReader.read(readSheet);
        //必须关闭
        excelReader.finish();
    }
}
















