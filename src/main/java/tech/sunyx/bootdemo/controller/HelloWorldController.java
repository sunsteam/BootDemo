package tech.sunyx.bootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

/**
 * HelloWorld
 *
 * @author by SunYuXing on 2018-11-27.
 */
@RestController
public class HelloWorldController {
    @ApiOperation(value="返回HelloWorld")
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {
        return "Hello World hahhhaha";
    }

}