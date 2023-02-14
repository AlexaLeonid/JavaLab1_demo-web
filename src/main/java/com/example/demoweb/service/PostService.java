package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;


@Service
public class PostService {

    private List<Post> Posts = Arrays.asList(new Post("Я не плачу, это просто слезы", new Date()), new Post("Человек-спичка плюс человек-электричка", new Date()),new Post("Умные мысли преследовали его, но он был быстрее", new Date()));

    public List<Post> listAllPosts(){
        return Posts;
    }

}
