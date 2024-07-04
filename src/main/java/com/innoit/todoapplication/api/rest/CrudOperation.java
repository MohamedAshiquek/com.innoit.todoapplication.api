package com.innoit.todoapplication.api.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CrudOperation {
    @RequestMapping("home")
    @ResponseBody
    public String SayHello(){
        return "hello welcome page";
    }
    @RequestMapping("html-form")
    @ResponseBody
    public String HtmlForm(){
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>project head</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("project body");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }
}
