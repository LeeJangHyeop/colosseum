package com.jhsystems.colosseum.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by LeeJangHyeop on 2017. 7. 19..
 */
@Configuration
@EntityScan(basePackages="com.jhsystems.colosseum.model")
@EnableJpaRepositories(basePackages="com.jhsystems.colosseum.repository")
public class JpaRepositoryConfig {
}
