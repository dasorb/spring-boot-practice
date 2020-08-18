package com.daosorb.dasorbretrofit;

import com.daosorb.dasorbretrofit.client.HttpApi;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DasorbRetrofitApplicationTests {

    @Autowired
    private HttpApi httpApi;

    @Test
    void contextLoads() {

        Object top = httpApi.get("top");
        System.out.println(top);

    }

}
