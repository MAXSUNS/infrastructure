package cn.sunsd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;


/**
 * Created by sund on 2018/1/5.
 */
@RestController
public class BaseController {

    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public String applyZhongAnInsurance(HttpServletRequest a) {
        return "test123";
    }


}
