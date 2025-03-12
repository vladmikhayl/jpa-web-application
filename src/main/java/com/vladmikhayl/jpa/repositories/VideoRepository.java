package com.vladmikhayl.jpa.repositories;

import com.vladmikhayl.jpa.models.recources.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {

}
