package com.example.kanwalpc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button left_button, right_button;
    TextView textView_score;
    int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        left_button=(Button)this.findViewById(R.id.button_left);
        right_button=(Button)this.findViewById(R.id.button_right);
        textView_score=(TextView)this.findViewById(R.id.textView_score);
    }

    public void button_right_click(View view) {
        score++;
        textView_score.setText("The Score is : "+score);
        if (score >20) {
            if (score % 2 == 0)
                Toast.makeText(this, "Helloooo this is even "+score, Toast.LENGTH_SHORT).show();
        }
    }

    public void button_left_click(View view) {
        score--;
        textView_score.setText("The Score is : "+score);
    }
}
