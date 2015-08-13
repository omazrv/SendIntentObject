package com.example.mazur.sendintentobject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button sButton, pButton;
    public final static String SER_KEY = "com.easyinfogeek.objectPass.ser";
    public final static String PAR_KEY = "com.easyinfogeek.objectPass.par";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupViews();
    }

    public void setupViews() {
        sButton = (Button) findViewById(R.id.button1);
        pButton = (Button) findViewById(R.id.button2);
        sButton.setOnClickListener(this);
        pButton.setOnClickListener(this);
    }

    public void SerializeMethod() {
        Person mPerson = new Person();
        mPerson.setName("Oleh");
        mPerson.setAge(30);
        Intent mIntent = new Intent(this, ObjectTransDemoSerializable.class);
        Bundle mBundle = new Bundle();
        mBundle.putSerializable(SER_KEY, mPerson);
        mIntent.putExtras(mBundle);
        startActivity(mIntent);
    }

    public void PacelableMethod() {
        Book mBook = new Book();
        mBook.setBookName("Android Developer Guide");
        mBook.setAuthor("Oleh");
        mBook.setPublishTime(2015);
        Intent mIntent = new Intent(this, ObjectTranDemoParcelable.class);
        Bundle mBundle = new Bundle();
        mBundle.putParcelable(PAR_KEY, mBook);
        mIntent.putExtras(mBundle);
        startActivity(mIntent);
    }

    public void onClick(View v) {
        if (v == sButton) {
            SerializeMethod();
        } else {
            PacelableMethod();
        }
    }
}
