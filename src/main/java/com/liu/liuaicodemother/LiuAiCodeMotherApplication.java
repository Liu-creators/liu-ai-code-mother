package com.liu.liuaicodemother;

import dev.langchain4j.community.store.embedding.redis.spring.RedisEmbeddingStoreAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {RedisEmbeddingStoreAutoConfiguration.class})
@MapperScan("com.liu.liuaicodemother.mapper")
public class LiuAiCodeMotherApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiuAiCodeMotherApplication.class, args);
    }

}
