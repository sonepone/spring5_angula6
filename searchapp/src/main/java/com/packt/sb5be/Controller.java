package com.packt.sb5be;

import com.packt.sb5be.searchapp.dbmodel.orm.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class Controller {

    @Autowired
    TopicRepository topicRepository;

    @RequestMapping("/")
    public List<Topic> index()
    {
        return topicRepository.findByDescriptionLikeIgnoreCase("%spring%");
    }
    @RequestMapping(value = "/sone/{description}", method = RequestMethod.POST)
    public List<Topic> lookByParameter(@PathVariable("description") String description)
    {
        // return "Ono sto je proslijedjeno >" + description + "< + kolika je lista = "
        // + topicRepository.findByDescriptionLikeIgnoreCase("%" + description + "%" ).size();
        return topicRepository.findByDescriptionLikeIgnoreCase("%" + description + "%" );
    }
}
