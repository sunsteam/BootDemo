package tech.sunyx.bootdemo.support;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 配置信息
 *
 * @author by SunYuXing on 2018-11-29.
 */
@Component
public class ModuleProperties {

    @Value("${tech.sunyx.name}")
    public String name;
    @Value("${tech.sunyx.title}")
    public String title;


}