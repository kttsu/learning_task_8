package com.example.Music;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MusicMapper {
    @Select("SELECT * FROM music WHERE id = #{id}")
    Optional<Music> findById(int id);
    @Select("SELECT * FROM music WHERE name LIKE CONCAT(#{prefix}, '%') AND name LIKE CONCAT('%',#{suffix}) AND name LIKE CONCAT('%',#{contains}, '%')")
    List<Music> findByMusicStartingWith(String prefix, String suffix, String contains);

}
