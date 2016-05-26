package net.winhistory.forum.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Map;

@Document(collection = "threads")
public class Thread {
    @Id
    private ObjectId id;

    private String subject;

    @JsonIgnore
    @Field("_imported")
    private Map<String, Object> imported;

    public ObjectId getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Map<String, Object> getImported() {
        return imported;
    }

    public void setImported(Map<String, Object> imported) {
        this.imported = imported;
    }
}
