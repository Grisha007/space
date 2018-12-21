package com.eversis.spaceagencydatahub.repository;

import com.eversis.spaceagencydatahub.domain.Mission;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
import java.util.Optional;

public interface MissionRepository extends CrudRepository<Mission, Long> {
    @Override
    List<Mission> findAll();

    Optional<Mission> findById(Long id);

    @Override
    Mission save(Mission mission);

    void deleteById(Long id);

    @Override
    long count();
}
