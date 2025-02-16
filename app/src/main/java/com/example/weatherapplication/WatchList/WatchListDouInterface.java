package com.example.weatherapplication.WatchList;

import static androidx.room.OnConflictStrategy.REPLACE;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public interface WatchListDouInterface {
    @Insert(onConflict = REPLACE)
    long add(WatchListWeather watchListWeather);

    @Delete
    int delete(WatchListWeather watchListWeather);

    @Query("SELECT * From table_watch_lists order by createdTime desc")
    List<WatchListWeather> getAll();

    @Query("SELECT count(*) From table_watch_lists")
    int getNumberOfCityInDatabase();

}
