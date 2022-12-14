package com.example.workc.controller;

import com.example.workc.modelo.Post;
import com.example.workc.service.IPostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    private IPostService postService;

    public PostController(IPostService postService){
        this.postService = postService;
    }

    @GetMapping()
    public List<Post> getAll(){
        return postService.getAll();
    }
}
