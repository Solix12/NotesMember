package com.salikh.notesmember.DataBase;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.salikh.notesmember.Dao.NotesDao;
import com.salikh.notesmember.Model.Notes;


@Database(entities = {Notes.class}, version = 1)
public abstract class NoteDatabase extends RoomDatabase {


    public static NoteDatabase INSTANCE;

    public static NoteDatabase getDatabaseInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), NoteDatabase.class, "Notes_DataBase").build();
        }
        return INSTANCE;
    }

    public abstract NotesDao notesDao();


}
