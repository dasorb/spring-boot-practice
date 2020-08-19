package com.dasorb.dasorbcron;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import sun.security.action.GetPropertyAction;

import java.io.BufferedWriter;
import java.security.AccessController;
import java.util.Map;

@SpringBootTest
class DasorbCronApplicationTests {

    @Test
    void contextLoads() {
        String aaa = AccessController.doPrivileged(
                new GetPropertyAction("line.separator"));
        GetPropertyAction getPropertyAction = new GetPropertyAction("line.separator");
        String run = getPropertyAction.run();
        System.out.println("测试" + run + "测试");
    }

}
