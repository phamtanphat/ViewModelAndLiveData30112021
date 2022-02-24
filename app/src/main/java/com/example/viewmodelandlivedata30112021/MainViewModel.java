package com.example.viewmodelandlivedata30112021;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    private MutableLiveData<String> textData = new MutableLiveData<>();

    public LiveData<String> getTextData() {
        return textData;
    }

    public void changeText(String text){
        textData.setValue(text);
    }
}
