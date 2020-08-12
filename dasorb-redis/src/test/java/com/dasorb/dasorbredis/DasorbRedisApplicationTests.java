package com.dasorb.dasorbredis;

import com.dasorb.dasorbredis.config.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class DasorbRedisApplicationTests {

    @Autowired
    @Qualifier("redisTemplate")
    private RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        ValueOperations valueOperations = redisTemplate.opsForValue();

        User user = new User();
        user.setUsername("xiao");

        valueOperations.set("xxxx", user);
        System.out.println(valueOperations.get("xxxx"));
    }

}
