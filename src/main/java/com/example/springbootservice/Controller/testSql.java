package com.example.springbootservice.Controller;


import com.example.springbootservice.sqlTool.MysqlTool;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class testSql {


    @GetMapping("/testSQL")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {

        MysqlTool mysqlTool = new MysqlTool();

//        List<Object> list=mysqlTool.

        return String.format("Hello %s!", name);
    }
}
