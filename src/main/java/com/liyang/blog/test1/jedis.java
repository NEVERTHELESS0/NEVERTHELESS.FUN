package com.liyang.blog.test1;

import com.sun.xml.internal.bind.v2.TODO;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @author: LIYANG
 * @program: myBlog
 * @description: none
 * @create: 2019-04-14 14:22
 **/


public class jedis {
    @Test
    public void main(){
        Jedis jedis = new Jedis("47.112.25.38", 6379);
        jedis.auth("123456");
        jedis.set("hello", "world");
        String value = jedis.get("hello");
        System.out.println(value);
        GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
        JedisPool jedisPool = new JedisPool(poolConfig, "47.112.25.38", 6379);
        Jedis jedis = null;
        jedis = jedisPool.getResource();
        jedis.auth("123456");
        int a = 1;
        jedis.set("hello", "world");
        String value = jedis.get("hello");
        System.out.println("\uD83D\uDC59");
        System.out.println("\uD83D\uDC14");
        for (int i = 0; i < 1; i++){
            System.out.println("U+1F618");
        }
    }
}
