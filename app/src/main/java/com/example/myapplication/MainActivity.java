package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ToggleButton;
public class MainActivity extends AppCompatActivity {
    TextView myText;
    Button onTop,up,down;
    ToggleButton mySwitch;
    ScrollView myScroll;
    ProgressBar ProgBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myText=(TextView) findViewById(R.id.textView2);
        onTop=(Button) findViewById(R.id.button);
        up=(Button) findViewById(R.id.button2);
        down=(Button) findViewById(R.id.button3);
        mySwitch=(ToggleButton) findViewById(R.id.toggleButton);
        myScroll=(ScrollView) findViewById(R.id.scrollView);
        myText.setText(R.string.my_text);
        ProgBar=(ProgressBar) findViewById(R.id.progressBar2);
        myText.setVisibility(myText.INVISIBLE);
        onTop.setVisibility(onTop.INVISIBLE);
        up.setVisibility(up.INVISIBLE);
        down.setVisibility(down.INVISIBLE);
        mySwitch.setOnCheckedChangeListener(new
                                                    CompoundButton.OnCheckedChangeListener() {
                                                        @Override
                                                        public void onCheckedChanged(CompoundButton buttonView, boolean
                                                                isChecked) {
                                                            if (!isChecked) {

                                                                mySwitch.setOnClickListener(new View.OnClickListener()
                                                                {
                                                                    @Override
                                                                    public void onClick(View v)
                                                                    {
                                                                        myText.setVisibility(myText.INVISIBLE);
                                                                        onTop.setVisibility(onTop.INVISIBLE);
                                                                        up.setVisibility(up.INVISIBLE);
                                                                        down.setVisibility(down.INVISIBLE);
                                                                        ProgBar.setVisibility(ProgBar.VISIBLE);
                                                                    }
                                                                });

                                                            }
                                                            else {
                                                                mySwitch.setOnClickListener(new View.OnClickListener()
                                                                {
                                                                    @Override
                                                                    public void onClick(View v)
                                                                    {
                                                                        myText.setVisibility(myText.VISIBLE);
                                                                        onTop.setVisibility(onTop.VISIBLE);
                                                                        up.setVisibility(up.VISIBLE);
                                                                        down.setVisibility(down.VISIBLE);
                                                                        ProgBar.setVisibility(ProgBar.INVISIBLE);
                                                                    }
                                                                });

                                                                up.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {
                                                                        myText.scrollBy(0, -20);
                                                                    }
                                                                });
                                                                down.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {
                                                                        myText.scrollTo(0, +20);
                                                                    }

                                                                });

                                                            }
                                                        }
                                                    });
        onTop.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myText.scrollTo(0, 0);
            }
        });
    }
}

