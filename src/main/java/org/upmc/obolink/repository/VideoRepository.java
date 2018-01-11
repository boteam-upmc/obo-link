package org.upmc.obolink.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.upmc.obolink.model.Video;

import java.sql.Timestamp;
import java.util.List;

@Repository("videoRepository")
public interface VideoRepository extends JpaRepository<Video, Long> {
    List<Video> findByUserId(int id);
    Video findById(int videoID);
    List<Video> findByUserIdAndRobotIdAndCreationDateIsAfter(int id, int robotId, Timestamp date);
}
