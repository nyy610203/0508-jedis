package com.atguigu.jedis.test;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class JedisTest {
	@Test
	public void test() {
		//创建客户端对象
		Jedis jedis = new Jedis("192.168.4.4", 6379, 20000);
		//使用
		String result = jedis.ping();
		System.out.println(result);
		System.out.println("remote");
		
		
		//关闭客户端
		jedis.close();
	}
}
