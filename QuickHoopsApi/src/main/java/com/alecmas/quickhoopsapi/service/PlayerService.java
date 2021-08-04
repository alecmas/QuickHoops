package com.alecmas.quickhoopsapi.service;


import com.alecmas.quickhoopsapi.exception.PlayerNotFoundException;

import com.alecmas.quickhoopsapi.model.Player;
import com.alecmas.quickhoopsapi.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Player addPlayer(Player player) {
        return playerRepository.save(player);
    }

    public List<Player> findAllPlayers() {
        return playerRepository.findAll();
    }

    public Player updatePlayer(Player player) {
        return playerRepository.save(player);
    }

    public Player findPlayerById(Long id) {
        return playerRepository.findPlayerById(id)
                .orElseThrow(() -> new PlayerNotFoundException("Player by id " + id + " was not found"));
    }

    @Transactional
    public void deletePlayer(Long id) {
        playerRepository.deletePlayerById(id);
    }
}

