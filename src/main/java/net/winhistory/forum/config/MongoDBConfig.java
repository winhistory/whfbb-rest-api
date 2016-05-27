package net.winhistory.forum.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import net.winhistory.forum.settings.MongoDBSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

//TODO: Outsource the values from this Configuration
@Configuration
public class MongoDBConfig extends AbstractMongoConfiguration {

    @Autowired
    private MongoDBSettings settings;

    @Override
    protected String getDatabaseName() {
        return settings.getDatabaseName();
    }

    @Bean
    public Mongo mongo() {
        return new MongoClient(new MongoClientURI(settings.getConnectionUri()));
    }

    @Override
    protected String getMappingBasePackage() {
        return "net.winhistory.forum.domain";
    }
}
