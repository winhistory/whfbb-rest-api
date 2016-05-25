package net.winhistory.forum.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

//TODO: Outsource the values from this Configuration
@Configuration
public class MongoDBConfig extends AbstractMongoConfiguration {

    @Override
    protected String getDatabaseName() {
        return "whfdb";
    }

    @Bean
    public Mongo mongo() {
        return new MongoClient("localhost");
    }

    @Override
    protected String getMappingBasePackage() {
        return "net.winhistory.forum.domain";
    }
}
