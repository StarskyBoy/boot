package com.midou.swagger2.controller;

import io.swagger.annotations.ApiImplicitParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author midou
 * @description 访问地址：http://localhost:8080/swagger-ui.html
 * @date 2018/10/30 11:58
 * @modified by
 */
@RestController
@RequestMapping(value="/hello")     // 通过这里配置使下面的映射都在/hello，可去除
public class HelloController {

//    @ApiIgnore
    @ApiImplicitParam(name = "hello", value = "hello world!", required = true)
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {
        return "Hello World";
    }

}