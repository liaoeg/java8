package com.leg;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;


import java.util.ArrayList;
import java.util.Scanner;

/*
* 代码自动生成器*/
public class LegCodeAutomatic {
    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();

        //配置策略
        //1、全局配置

        GlobalConfig gc = new GlobalConfig();
        String propertyPath = System.getProperty("user.dir");
        System.out.println(propertyPath);
        gc.setOutputDir(propertyPath+"/src/main/java");
        gc.setAuthor("廖恩光");
        gc.setOpen(false);
        gc.setFileOverride(false);//不覆盖y原有文件
        gc.setServiceName("%sService");//去掉serviceI前缀
        gc.setIdType(IdType.AUTO);
        gc.setDateType(DateType.ONLY_DATE);
        gc.setSwagger2(true);
        mpg.setGlobalConfig(gc);

        //2、设置数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUrl("jdbc:mysql://localhost:3306/mybatis_plus?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf-8");
        dsc.setUsername("root");
        dsc.setPassword("root");
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);

        //3、包package配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName("test");
        pc.setParent("com.leg");
        pc.setEntity("pojo");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setController("controller");
        mpg.setPackageInfo(pc);

        //4、策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setInclude("user");
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);//自动生成Lombok
        strategy.setLogicDeleteFieldName("deleted");
        //自动填充配置
        /*TableFill gmtCreate = new TableFill("gmt_create", FieldFill.INSERT);
        TableFill gmt_modified = new TableFill("gmt_modified", FieldFill.UPDATE);
        ArrayList<TableFill> tableFills = new ArrayList<>();
        tableFills.add(gmtCreate);
        tableFills.add(gmt_modified);
        strategy.setTableFillList(tableFills);*/

        //乐观锁
        //strategy.setVersionFieldName("version");
        strategy.setRestControllerStyle(true);
        strategy.setControllerMappingHyphenStyle(true);//localhost:8080/test_id_name
        mpg.setStrategy(strategy);

        mpg.execute();//执行
    }
}
