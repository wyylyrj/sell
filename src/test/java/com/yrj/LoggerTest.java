package com.yrj;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author YIN
 * Date: 2018/12/19 11:55
 * Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {
    @Test
    public void Test1(){
        String name = "yrj";
        String password = "123456";
        log.trace("trace...");
        log.debug("debug...");
        log.info("info...");
        log.info("name:"+name+",password:"+password);
        log.info("name:{},password:{}",name,password);
        log.warn("warn...");
        log.error("error...");
    }
}
