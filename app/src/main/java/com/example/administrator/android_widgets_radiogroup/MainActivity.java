package com.example.administrator.android_widgets_radiogroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView str_radio_question;
    private RadioGroup sex_rg;
    private RadioButton male_rb;
    private RadioButton female_rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById();
        setListener();
    }

    private void setListener() {
        sex_rg.setOnCheckedChangeListener(mSexListener);
    }

    private RadioGroup.OnCheckedChangeListener mSexListener = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            if (checkedId == male_rb.getId()) {
                str_radio_question.setText(R.string.male_rb);
            }
            if (checkedId == female_rb.getId()) {
                str_radio_question.setText(R.string.female_rb);
            }
        }
    };

    private void findViewById() {
        str_radio_question = (TextView) findViewById(R.id.str_radio_question);
        sex_rg = (RadioGroup) findViewById(R.id.sex_rg);
        male_rb = (RadioButton) findViewById(R.id.male_rb);
        female_rb = (RadioButton) findViewById(R.id.female_rb);
    }
}
