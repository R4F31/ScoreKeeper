package com.example.scorekeeper;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String STATE_SCORE_1 = "";
    private static final String STATE_SCORE_2 = "";
    private TextView score1;
    private TextView score2;
    private ImageButton mas1;
    private ImageButton menos1;
    private ImageButton mas2;
    private ImageButton menos2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        score1 = findViewById(R.id.res1);
        score2 = findViewById(R.id.res2);
        mas1 = findViewById(R.id.imgmas1);
        menos1 = findViewById(R.id.imgmenos1);
        mas2 = findViewById(R.id.imgmas2);
        menos2 = findViewById(R.id.imgmenos2);

        score1.setText("0");
        score2.setText("0");

        if (savedInstanceState != null){
            String mScore1 = savedInstanceState.getString(STATE_SCORE_1);
            String mScore2 = savedInstanceState.getString(STATE_SCORE_2);

            score1.setText(mScore1);
            score2.setText(mScore2);
        }

        mas1.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // cambiar el estilo del botón cuando se pulsa
                        mas1.setBackground(getResources().getDrawable(R.drawable.press_button_background));
                        break;
                    case MotionEvent.ACTION_UP:
                        // cambiar el estilo del botón cuando se suelta
                        mas1.setBackground(getResources().getDrawable(R.drawable.button_background));
                        break;
                }
                return false;
            }
        });


        mas2.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // cambiar el estilo del botón cuando se pulsa
                        mas2.setBackground(getResources().getDrawable(R.drawable.press_button_background));
                        break;
                    case MotionEvent.ACTION_UP:
                        // cambiar el estilo del botón cuando se suelta
                        mas2.setBackground(getResources().getDrawable(R.drawable.button_background));
                        break;
                }
                return false;
            }
        });
        menos1.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // cambiar el estilo del botón cuando se pulsa
                        menos1.setBackground(getResources().getDrawable(R.drawable.press_button_background));
                        break;
                    case MotionEvent.ACTION_UP:
                        // cambiar el estilo del botón cuando se suelta
                        menos1.setBackground(getResources().getDrawable(R.drawable.button_background));
                        break;
                }
                return false;
            }
        });

        menos2.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // cambiar el estilo del botón cuando se pulsa
                        menos2.setBackground(getResources().getDrawable(R.drawable.press_button_background));
                        break;
                    case MotionEvent.ACTION_UP:
                        // cambiar el estilo del botón cuando se suelta
                        menos2.setBackground(getResources().getDrawable(R.drawable.button_background));
                        break;
                }
                return false;
            }
        });






    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putString(STATE_SCORE_1, (String) score1.getText());
        outState.putString(STATE_SCORE_2, (String) score2.getText());
        super.onSaveInstanceState(outState);


    }

    public void increaseScore(View view) {
        int res;

        if (view.getId() == mas1.getId()) {
            res = Integer.parseInt((String) score1.getText());
            score1.setText(res + 1+"");

        } else {
            if (view.getId() == mas2.getId()) {
                res = Integer.parseInt((String) score2.getText());
                score2.setText(res + 1+"");
            } else {
                if (view.getId() == menos1.getId()) {
                    res = Integer.parseInt((String) score1.getText());
                    if (res<1){
                    }else {
                        score1.setText(res - 1+"");
                    }
                } else {
                        res = Integer.parseInt((String) score2.getText());
                        if (res<1){
                        }else{
                            score2.setText(res - 1+"");
                        }
                }
            }
        }

    }



}







