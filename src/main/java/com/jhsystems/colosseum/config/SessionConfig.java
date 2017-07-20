package com.jhsystems.colosseum.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.http.CookieSerializer;
import org.springframework.session.web.http.DefaultCookieSerializer;

/**
 * Created by LeeJangHyeop on 2017. 7. 13..
 */

@Configuration
@EnableRedisHttpSession
@PropertySource("classpath:database.properties")
public class SessionConfig {
    @Value("${spring.redis.host}")
    String host;

    @Value("${spring.redis.port}")
    int port;

    @Value("${spring.redis.password}")
    String password;

    @Bean
    public JedisConnectionFactory connectionFactory()
    {
        JedisConnectionFactory conn = new JedisConnectionFactory();
        conn.setHostName(host);
        conn.setPort(port);
        //conn.setPassword(password);
        conn.setUsePool(true);
        return conn;
    }

    @Bean
    public CookieSerializer cookieSerializer()
    {
        DefaultCookieSerializer serializer = new DefaultCookieSerializer();
        return serializer;
    }
}
