package com.example.bodytrainingapp.ui.dashboard;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Calendar;
import java.util.Date;

public class DashboardViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    Date date;
    Calendar calendar;
    TextView textView;
    Button button;
    LinearLayout linearLayout;

    public DashboardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
        calendar =  Calendar.getInstance();
        int data = calendar.get(Calendar.DATE);
        mText.setValue(String.valueOf(calendar.get(Calendar.DATE)));
        sButton();

//        textView.setText(data);


    }

    public LiveData<String> getText() {
        return mText;
    }
    public LiveData<String> getTextOfData() {
        return mText;
    }

    public void sButton() {
//        linearLayout = new LinearLayout(this);
//        button = new Button(this);



    }
}