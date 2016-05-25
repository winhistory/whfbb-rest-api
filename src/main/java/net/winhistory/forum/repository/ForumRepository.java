package net.winhistory.forum.repository;


import net.winhistory.forum.domain.Forum;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ForumRepository extends MongoRepository<Forum, ObjectId> {
    Forum findByName(String name);
}
