package com.alecmas.quickhoopsapi.repository;

import com.alecmas.quickhoopsapi.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    // both of these are query methods that Spring can automatically create a query for
    void deletePlayerById(Long id);
    Optional<Player> findPlayerById(Long id);
}
