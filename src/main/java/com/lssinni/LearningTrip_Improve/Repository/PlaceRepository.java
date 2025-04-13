package com.lssinni.LearningTrip_Improve.Repository;

import com.lssinni.LearningTrip_Improve.domain.Place;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepository extends JpaRepository<Place, Long> {
    Optional<Place> findById(long place_id);
}
