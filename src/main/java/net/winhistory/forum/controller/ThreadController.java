package net.winhistory.forum.controller;

import net.winhistory.forum.domain.Thread;
import net.winhistory.forum.repository.ThreadRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/threads")
public class ThreadController {

    private final ThreadRepository threadRepository;

    @Autowired
    public ThreadController(ThreadRepository threadRepository) {
        this.threadRepository = threadRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Page<Thread> listThreads(Pageable pageable) {
        return threadRepository.findAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Thread getThread(@PathVariable final String id) {
        return threadRepository.findOne(new ObjectId(id));
    }
}
