package com.salikh.notesmember.Repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.salikh.notesmember.Dao.NotesDao;
import com.salikh.notesmember.DataBase.NoteDatabase;
import com.salikh.notesmember.Model.Notes;

import java.util.List;

public class NotesRepository {

    public NotesDao notesDao;
    public LiveData<List<Notes>> getAllNotes;

    public NotesRepository(Application application) {
        NoteDatabase database = NoteDatabase.getDatabaseInstance(application);
        notesDao = database.notesDao();
        getAllNotes = notesDao.getAllNotes();
    }

    public void insertNotes(Notes notes) {
        notesDao.insetNotes(notes);
    }

    public void deleteNotes(int id) {
        notesDao.deleteNotes(id);
    }

    public void updateNotes(Notes notes) {
        notesDao.updateNotes(notes);
    }


}
