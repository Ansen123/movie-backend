package com.nestdigital.moviebackend.Dao;

import com.nestdigital.moviebackend.Model.MovieModel;
import org.springframework.data.repository.CrudRepository;

public interface MovieDao extends CrudRepository<MovieModel,Integer> {
}
