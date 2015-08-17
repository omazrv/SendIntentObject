package com.example.mazur.sendintentobject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Mazur on 13.08.2015.
 */
public class ParcelableExample extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView mTextView = new TextView(this);
        Book mBook = getIntent().getParcelableExtra(MainActivity.PAR_KEY);
        mTextView.setText("Book name is: " + mBook.getBookName() + "/n" +
                "Author is: " + mBook.getAuthor() + "/n" +
                "PublishTime is: " + mBook.getPublishTime());
        setContentView(mTextView);
    }
}
