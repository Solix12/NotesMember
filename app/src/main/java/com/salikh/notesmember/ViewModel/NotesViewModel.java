package com.salikh.notesmember.ViewModel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.salikh.notesmember.Model.Notes;
import com.salikh.notesmember.Repository.NotesRepository;

import java.util.List;

public class NotesViewModel extends AndroidViewModel {

    public NotesRepository repository;
    public LiveData<List<Notes>> getAllNotes;


    public NotesViewModel(Application application) {
        super(application);
        repository = new NotesRepository(application);
        getAllNotes = repository.getAllNotes;

    }


    void insertNotes(Notes notes) {
        repository.insertNotes(notes);
    }

    void deleteNotes(int id) {
        repository.deleteNotes(id);
    }

    void updateNotes(Notes notes) {
        repository.updateNotes(notes);
    }

}
