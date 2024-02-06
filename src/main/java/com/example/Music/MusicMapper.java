package com.example.Music;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MusicMapper {
    @Select("SELECT * FROM music")
    List<Music>findAll();
    @Select("SELECT * FROM music WHERE name LIKE CONCAT(#{prefix}, '%')")
    List<Music> findByMusicStartingWith(String prefix);


}
