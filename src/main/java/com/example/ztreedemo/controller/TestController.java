package com.example.ztreedemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


@RestController
public class TestController {


    @RequestMapping("/")
    public Object i(HttpServletRequest request) {
        Map<String, Object> res = new HashMap<String, Object>();
        res.put("ip:", request.getScheme() + "://" + request.getServerName()
                + ":" + request.getServerPort() + request.getRequestURI());
        return res;

    }



    //-----------------------------------------收藏夹树------------------------------------------------------
    /**
     * 返回收藏夹树json
     */
    @RequestMapping("/tree")
    @ResponseBody
    public String tree(String name,String par_id) {
        System.out.println(name);
        System.out.println(par_id);

       String strjson = "{\n" +
               "\t\"infor\":[\n" +
               "        {\"id\":\"01\", \"name\":\"bangong\", \"title\":\"办公室\", \"link\":\"http://localhost:8999/tree\"},\n" +
               "        {\"id\":\"02\", \"name\":\"bangong\", \"title\":\"警卫处\", \"link\":\"json/03ren.js\"},\n" +
               "        {\"id\":\"03\", \"name\":\"bangong\", \"title\":\"局领导\", \"link\":\"json/03ren.js\"},\n" +
               "        {\"id\":\"04\", \"name\":\"bangong\", \"title\":\"会议室\", \"link\":\"json/03ren.js\"},\n" +
               "        {\"id\":\"05\", \"name\":\"bangong\", \"title\":\"监察科\"}\n" +
               "    ]\n" +
               "}";
        return strjson;
    }

        /**
         * 添加一个
         */
        @RequestMapping("/add")
        public void add(HttpServletRequest request) {
            System.out.println(request.getParameter("upid"));
            System.out.println(request.getParameter("title"));

        }



}
