package com.lucasia.ginquiry.ui;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import com.lucasia.ginquiry.dao.WordRepository;
import com.lucasia.ginquiry.entity.Word;

import java.util.List;

public class WordViewModel extends AndroidViewModel {

    private WordRepository wordRepository;

    private LiveData<List<Word>> allWords;

    public WordViewModel (Application application) {
        super(application);
        wordRepository = new WordRepository(application);
        allWords = wordRepository.getAllWords();
    }

    public LiveData<List<Word>> getAllWords() { return allWords; }

    public void insert(Word word) { wordRepository.insert(word); }

}