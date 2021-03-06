package com.rubypaper.service;

import com.rubypaper.domain.blog.Blog;
import com.rubypaper.domain.blog.BlogStatus;
import com.rubypaper.domain.user.User;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface BlogService {

    Page<Blog> blogListNonCondition();
    /**
     * 블로그 검색
     * @param searchKeyword : 검색어
     * @param searchCondition   : 검색 조건 (블로그 제목, 태그, 블로그 이름)
     * @return
     */
    List<Blog> searchBlog(String searchCondition , String searchKeyword);

    /**
     * 블로그 등록
     */
    void createBlog(String title, User username);
    
    void deleteBlog(Long deleteBlogId);

    void updateBlog();

    Optional<Blog> findMyBlog(Long userId);

    Optional<Blog> findBlog(Long id);

    void saveBlog(Blog newBlog);

    List<Blog> findByBlogStatus(BlogStatus blogStatus);
}
