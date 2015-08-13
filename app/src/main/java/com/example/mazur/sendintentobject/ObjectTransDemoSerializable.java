package com.example.mazur.sendintentobject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Mazur on 13.08.2015.
 */
public class ObjectTransDemoSerializable extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView mTextView = new TextView(this);
        Person mPerson = (Person)getIntent().getSerializableExtra(MainActivity.SER_KEY);
        mTextView.setText("You name is: " + mPerson.getName() + "/n" +
                "You age is: " + mPerson.getAge());

        setContentView(mTextView);
    }
}
