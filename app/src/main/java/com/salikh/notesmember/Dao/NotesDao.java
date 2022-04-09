package com.salikh.notesmember.Dao;


import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.salikh.notesmember.Model.Notes;

import java.util.List;

@androidx.room.Dao
public interface NotesDao {

    @Query("SELECT * FROM Notes_DataBase")
    LiveData<List<Notes>> getAllNotes();

    @Insert
    void insetNotes(Notes... notes);

    @Query("DELETE FROM Notes_DataBase WHERE id=:id")
    void deleteNotes(int id);

    @Update
    void updateNotes(Notes notes);

}
