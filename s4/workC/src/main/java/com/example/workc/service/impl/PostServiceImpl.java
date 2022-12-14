package com.example.workc.service.impl;

import com.example.workc.modelo.Post;
import com.example.workc.service.IPostService;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class PostServiceImpl implements IPostService {

    private List<Post> posts;

    public PostServiceImpl(){
        posts = new LinkedList<>();
        posts.add(new Post("Hola mundo",1));
        posts.add(new Post("Prueba",2));
    }

    @Override
    public List<Post> getAll() {
        return posts;
    }
}
