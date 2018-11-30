package tech.sunyx.bootdemo.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tech.sunyx.bootdemo.support.ModuleProperties;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private ModuleProperties properties;


    @Test
    public void getHello() throws Exception {
        Assert.assertEquals(properties.name, "Yomii");
        Assert.assertEquals(properties.title, "Yomii Spring Demo");
    }

}