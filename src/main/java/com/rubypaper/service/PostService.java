package com.rubypaper.service;

import com.rubypaper.domain.post.Post;

import java.util.List;

public interface PostService {
    List<Post> getpostList();

    Post readPost(Long id);

    Post savePost(Post post);

    void deletePost(Long id);

    /**
     * 카테고리별 글 목록 조회
     */
//    void searchByCategory();

//    void searchPost();



}
