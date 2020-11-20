package com.dyzwj.springbootredis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class SpringbootRedisApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Test
    public void test1(){
//        stringRedisTemplate.opsForList();
        System.out.println(redisTemplate);
        redisTemplate.opsForList().leftPush("name","zwj");

    }




}
