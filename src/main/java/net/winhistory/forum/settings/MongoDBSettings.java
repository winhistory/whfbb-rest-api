package net.winhistory.forum.settings;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="mongodb")
public class MongoDBSettings {

    private String databaseName;

    private String connectionUri;

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getConnectionUri() {
        return connectionUri;
    }

    public void setConnectionUri(String connectionUri) {
        this.connectionUri = connectionUri;
    }
}
