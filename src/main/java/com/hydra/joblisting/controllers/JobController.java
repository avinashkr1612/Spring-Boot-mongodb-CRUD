package com.hydra.joblisting.controllers;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletResponse;

public class JobController {
    
    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse response) throws IOException{
        response.sendRedirect("/swagger-ui.html");
    }
}
