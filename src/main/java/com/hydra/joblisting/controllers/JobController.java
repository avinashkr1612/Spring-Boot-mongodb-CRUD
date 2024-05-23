package com.hydra.joblisting.controllers;

import com.hydra.joblisting.JobRepository;
import com.hydra.joblisting.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.annotations.ApiIgnore;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

@RestController
public class JobController
{
    @Autowired
    JobRepository job;

    @ApiIgnore
    @RequestMapping(value="/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/getJobList")
    public List<Post> getAllJobPosts()
    {
        return job.findAll();
    }

}
