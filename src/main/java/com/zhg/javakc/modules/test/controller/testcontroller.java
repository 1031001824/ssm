package com.zhg.javakc.modules.test.controller;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.base.util.CommonUtil;
import com.zhg.javakc.modules.test.entity.testentity;
import com.zhg.javakc.modules.test.service.testservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("test")
public class testcontroller {

    @Autowired
    testservice service;
    @RequestMapping("query")
public ModelAndView query(testentity entity, HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView =new ModelAndView("test/list");
     Page<testentity> page=  service.query(entity,new Page<testentity>(request,response));
        modelAndView.addObject("page",page);
    return modelAndView;
}
@RequestMapping("save")
public String save(testentity entity){
        entity.setTestid(CommonUtil.uuid());
        service.save(entity);
        return "redirect:query.do";
}
@RequestMapping("view")
public String view(String ids, ModelMap model){
    System.out.println(ids);
        testentity entity =service.get(ids);
    System.out.println(entity.getTestdate());
        model.put("entity",entity);
        return "test/update";

}
@RequestMapping("update")
public String update(testentity entity){
        service.update(entity);
        return "redirect:query.do";
}
@RequestMapping("delete")
public String delete(String [] ids){
    System.out.println(ids);
        service.delete(ids);
    return "redirect:query.do";
}
}
