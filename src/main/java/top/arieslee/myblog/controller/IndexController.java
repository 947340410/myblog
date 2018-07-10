package top.arieslee.myblog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import top.arieslee.myblog.constant.WebConstant;
import top.arieslee.myblog.service.impl.ContentService;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName IndexController
 * @Description 首页controller
 * @Author Aries
 * @Date 2018/7/6 15:38
 * @Version 1.0
 **/
@Controller
public class IndexController {
    //日志对象
    private final static Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    //注入相关业务层接口
    @Autowired
    private ContentService contentService;

    /**
     * @Author: Aries
     * @Description : 初始主页访问，门面模式，为客户暴露简单url接口
     * @Date : 16:20 2018/7/10
     * @Param [request, limit:每页文章数量]
     **/
    @GetMapping(value = {"/", "index"})
    public String index(HttpServletRequest request, @RequestParam(value = "limit", defaultValue = "1") int limit) {
        //调用子接口处理
        return this.index(request, 1, limit);
    }
    
    /**
     * @Author: Aries
     * @Description :分页控制
     * @Date : 16:57 2018/7/10
     * @Param [request, p:当前页码, limit:每页文章数量]
     **/
    @GetMapping(value = "page/{p}")
    public String index(HttpServletRequest request, @PathVariable("p") int p, @RequestParam(value = "limit", defaultValue = "1") int limit) {
        //判断页码是否合法,不合法置为1
        p = p < 1 || p > WebConstant.MAX_PAGE ? 1 : p;
        //调用业务层接口，获取mybatis分页插件执行结果

        return "";
    }
}