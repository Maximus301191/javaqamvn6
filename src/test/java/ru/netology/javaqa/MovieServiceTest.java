package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieServiceTest {

    String movie1 = "Бладшот";
    String movie2 = "Вперёд";
    String movie3 = "Отель Белград";
    String movie4 = "Джентельмены";
    String movie5 = "Человек-невидимка";
    String movie6 = "Тролли. Мировой Тур";
    String movie7 = "Номер один";

    @Test

    public void ShouldFindAll() {
        MovieService movieService = new MovieService();

        movieService.add(movie1);
        movieService.add(movie2);
        movieService.add(movie3);
        movieService.add(movie4);
        movieService.add(movie5);
        movieService.add(movie6);
        movieService.add(movie7);

        String[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        String[] actual = movieService.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void ShouldFindLast() {
        MovieService movieService = new MovieService();

        movieService.add(movie1);
        movieService.add(movie2);
        movieService.add(movie3);
        movieService.add(movie4);
        movieService.add(movie5);
        movieService.add(movie6);
        movieService.add(movie7);

        String[] expected = {movie7, movie6, movie5, movie4, movie3};
        String[] actual = movieService.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void ShouldFindLastLessLimit() {
        MovieService movieService = new MovieService(3);

        movieService.add(movie1);
        movieService.add(movie2);
        movieService.add(movie3);
        movieService.add(movie4);
        movieService.add(movie5);
        movieService.add(movie6);
        movieService.add(movie7);

        String[] expected = {movie7, movie6, movie5};
        String[] actual = movieService.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void ShouldFindLastUnderLimit() {
        MovieService movieService = new MovieService(7);

        movieService.add(movie1);
        movieService.add(movie2);
        movieService.add(movie3);
        movieService.add(movie4);
        movieService.add(movie5);
        movieService.add(movie6);
        movieService.add(movie7);

        String[] expected = {movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        String[] actual = movieService.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
}
