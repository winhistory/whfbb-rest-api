package net.winhistory.forum.repository;

import net.winhistory.forum.domain.Thread;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ThreadRepository extends MongoRepository<Thread, ObjectId> {
}
