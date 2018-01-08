package cn.sunsd.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by sund on 2018/1/5.
 */
@RestController
public class BaseController {

    @RequestMapping("/hello")
    public String applyZhongAnInsurance(String a) {
        return "test";
    }
}
