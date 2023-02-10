package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Service
public class PostService {

    private List<Post> Posts = Arrays.asList(new Post("postik"), new Post("postttt"),new Post("poooost"));

    public List<Post> listAllPosts(){
        return Posts;
    }

}
