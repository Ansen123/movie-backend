package com.nestdigital.moviebackend.Controller;

import com.nestdigital.moviebackend.Dao.MovieDao;
import com.nestdigital.moviebackend.Model.MovieModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    private MovieDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/movieadd",consumes = "application/json",produces="application/json")
    public String movie(@RequestBody MovieModel movie){
        dao.save(movie);
        return"{status:'Success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewMovies")
    public List<MovieModel> viewMovies(){
        return (List<MovieModel>)dao.findAll();
    }
}
