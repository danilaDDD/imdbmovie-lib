package ru.danila.api;

import ru.danila.data.IMDBMovie;

public interface MovieFinder {
    IMDBMovie find(String movieTitle, int year);
}
