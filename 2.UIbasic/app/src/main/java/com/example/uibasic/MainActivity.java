package com.example.uibasic;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView display;
    Button buttonleft,buttonright,buttonture;
    Switch aSwitch;
    ProgressBar progressBar;
    EditText editText;
    RadioGroup radioGroup;
    CheckBox checkBox1,checkBox2,checkBox3;
    ImageView imageView;
    SeekBar seekBar;
    RatingBar ratingBar;
    String yuwen,yingyu,chishaokao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.textView);
        buttonleft = findViewById(R.id.button1);
        buttonright = findViewById(R.id.button2);
        buttonture = findViewById(R.id.button3);
        aSwitch = findViewById(R.id.switch1);
        progressBar = findViewById(R.id.progressBar);
        editText = findViewById(R.id.editTextNumber);
        radioGroup = findViewById(R.id.RadioGroup);
        checkBox1 = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        imageView = findViewById(R.id.imageView2);
        seekBar = findViewById(R.id.seekBar);
        ratingBar = findViewById(R.id.ratingBar);
        buttonleft.setOnClickListener(v -> display.setText(R.string.button1));
        buttonright.setOnClickListener(v -> display.setText(R.string.button2));
        buttonture.setOnClickListener(v -> {
            String s = editText.getText().toString();
            if (TextUtils.isEmpty(s)) {
                s = "0";
            }
            progressBar.setProgress((Integer.parseInt(s)));
            display.setText(s);
        });
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
                if (b) {
                    display.setText("???");
                } else {
                    display.setText("???");
                }
            }
        });
        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean b) {

                if (b) {
                    yuwen = "??????";
                } else {
                    yuwen = "";
                }
                display.setText(yuwen);
            }
        });
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
                if (b) {
                    yingyu = "?????????";
                } else {
                    yingyu = "";
                }

                display.setText(yuwen+yingyu);
            }
        });
        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
                if (b) {
                    chishaokao = "?????????";
                } else {
                    chishaokao = "";
                }
                display.setText(yuwen+yingyu+chishaokao);
            }
        });
        radioGroup.setOnCheckedChangeListener((group, i) -> {
            if (i==R.id.radioButton) {
                imageView.setImageResource(R.drawable.lianai);
            } else{
                imageView.setImageResource(R.drawable.fenshou);
            }
        });
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean fromUser) {
                display.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        ratingBar.setOnRatingBarChangeListener((ratingBar, v, fromUser) -> Toast.makeText(getApplicationContext(), v +"?????????",Toast.LENGTH_LONG));
    }
}