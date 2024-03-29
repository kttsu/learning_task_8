package com.example.Music;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MusicController {
    private final MusicMapper musicMapper;

    public MusicController(MusicMapper musicMapper) {
        this.musicMapper = musicMapper;
    }
    @GetMapping("/music")
    public List<Music> findByMusic(MusicSearchRequest request) {
        return musicMapper.findByMusicStartingWith(request.getStartsWith(),request.getEndsWith(),request.getContains());
    }
}
