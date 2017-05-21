package com.xlab_group.software.mediaplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(this.getApplicationContext(), R.raw.a1);
    }

    public void PlaySound(View view) {
        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                Toast.makeText(getApplicationContext(), "Player Complete!", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void PauseSound(View view) {
        mediaPlayer.pause();
    }

    public void forward(View view) {
        mediaPlayer.seekTo(mediaPlayer.getCurrentPosition() + 30000);
    }

    public void volUp(View view) {
        mediaPlayer.setVolume(50, 50);
    }

    public void volDown(View view) {
        mediaPlayer.setVolume(1, 1);
    }
}
