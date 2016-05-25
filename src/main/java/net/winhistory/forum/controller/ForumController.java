package net.winhistory.forum.controller;

import net.winhistory.forum.domain.Forum;
import net.winhistory.forum.repository.ForumRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/forums")
public class ForumController {

    private final ForumRepository forumRepository;

    @Autowired
    public ForumController(ForumRepository forumRepository) {
        this.forumRepository = forumRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Forum> listForums() {
        return forumRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Forum getForum(@PathVariable final String id) {
        return forumRepository.findOne(new ObjectId(id));
    }
}
