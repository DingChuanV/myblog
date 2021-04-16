package com.example.dao;

import com.example.po.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: YUN
 * \* Date: 2021/4/11
 * \* Time: 11:00
 * \* Description:
 * \
 */
public interface CommentRepository extends JpaRepository<Comment,Long>{

    List<Comment> findByBlogId(Long blogId, Sort sort);

    List<Comment> findByBlogIdAndParentCommentNull(Long blogId, Sort sort);
}
