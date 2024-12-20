package com.techie.backend.video.repository;

import com.techie.backend.video.domain.Category;
import com.techie.backend.video.domain.Video;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface VideoRepository extends JpaRepository<Video, String> {
    List<Video> findByCategory(Category category);
    List<Video> findByTitleContaining(String keyword);
    Optional<Video> findByVideoId(String videoId);
}