package net.winhistory.forum.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Map;

@Document(collection = "posts")
public class Post {
    @Id
    private ObjectId id;

    private Thread thread;

    private String subject;
    private String message;

    @JsonIgnore
    @Field("_imported")
    private Map<String, Object> imported;

    public ObjectId getId() {
        return id;
    }

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getImported() {
        return imported;
    }

    public void setImported(Map<String, Object> imported) {
        this.imported = imported;
    }
}
