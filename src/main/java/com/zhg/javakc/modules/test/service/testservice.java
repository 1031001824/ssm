package com.zhg.javakc.modules.test.service;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.base.service.BaseService;
import com.zhg.javakc.modules.test.dao.testdao;
import com.zhg.javakc.modules.test.entity.testentity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class testservice extends BaseService<testdao,testentity> {
@Autowired
testdao dao;
public Page<testentity> query(testentity entity,Page<testentity> page){

    entity.setPage(page);
List<testentity> list=dao.findList(entity);
page.setList(list);
    return page;
}
 }
