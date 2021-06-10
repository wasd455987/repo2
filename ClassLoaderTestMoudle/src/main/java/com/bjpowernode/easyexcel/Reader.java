package com.bjpowernode.easyexcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.bjpowernode.model.Employee;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 宋秋宇
 * 日期:2021/6/5
 */
public class Reader {
    public static void main(String[] args) {
        List<Employee> list = new LinkedList<>();
        ExcelReaderBuilder excelReaderBuilder = EasyExcel.read();
        excelReaderBuilder.file("D:\\员工信息表.xls").sheet(0).head(Employee.class)
                .registerReadListener(new AnalysisEventListener<Employee>() {

            @Override
            public void invoke(Employee employee, AnalysisContext analysisContext) {
                list.add(employee);
            }

            @Override
            public void doAfterAllAnalysed(AnalysisContext analysisContext) {
                System.out.println("整完了");
            }
        }).doRead();
        //写
        EasyExcel.write("D:\\员工信息表_副本.xls").head(Employee.class).excelType(ExcelTypeEnum.XLS).
                sheet("sheet00001").doWrite(list);
    }
}
