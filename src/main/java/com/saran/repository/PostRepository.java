package com.saran.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saran.entity.Post;

public interface PostRepository extends JpaRepository<Post,Integer> {
}
