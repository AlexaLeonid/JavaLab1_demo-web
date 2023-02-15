package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


@Service
public class PostService {
    private List<Post> posts;
    PostService(){
        posts = new ArrayList<>();
        posts.addAll(Arrays.asList(new Post(0l, "Я не плачу, это просто слезы", new Date()), new Post(1l, "Человек-спичка плюс человек-электричка", new Date()),new Post(2l,"Умные мысли преследовали его, но он был быстрее", new Date())));
    }

    public List<Post> listAllPosts(){
        return posts;
    }
    public void create(String text) {
        posts.add(new Post((long) (posts.size()), text, new Date()));
    }

}
