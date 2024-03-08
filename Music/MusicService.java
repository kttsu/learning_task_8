package com.example.Music;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MusicService {
    private final MusicMapper musicMapper;

    public MusicService(MusicMapper musicMapper) {
        this.musicMapper = musicMapper;
    }
    public Music findMusic(int id) {
        Optional<Music> music = this.musicMapper.findById(id);
        return music.orElseThrow(() -> new UserNotFoundException("user not found"));
    }
}



