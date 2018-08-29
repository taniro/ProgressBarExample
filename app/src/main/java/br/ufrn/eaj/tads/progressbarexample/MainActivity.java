package br.ufrn.eaj.tads.progressbarexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView pbValue;
    TextView sbValue;
    TextView dsbValue;
    TextView rbValue;

    ProgressBar progressBar;
    SeekBar seekBar;
    SeekBar discreteSeekBar;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pbValue = findViewById(R.id.pbValue);
        sbValue = findViewById(R.id.sbValue);
        dsbValue = findViewById(R.id.dsbValue);
        rbValue = findViewById(R.id.rbValue);

        progressBar = findViewById(R.id.progressBar);
        seekBar = findViewById(R.id.seekBar);
        discreteSeekBar = findViewById(R.id.seekBar2);
        ratingBar = findViewById(R.id.ratingBar);

        pbValue.setText(progressBar.getProgress()+"");
        sbValue.setText(seekBar.getProgress()+"");
        dsbValue.setText(discreteSeekBar.getProgress()+"");
        rbValue.setText(ratingBar.getRating()+"");

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                sbValue.setText(i+"");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        discreteSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                dsbValue.setText(i+"");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                rbValue.setText(ratingBar.getRating()+"");
                //rbValue.setText(ratingBar.getNumStars()+"");
            }
        });

    }
}
