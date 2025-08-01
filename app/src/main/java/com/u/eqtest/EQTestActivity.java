package com.u.eqtest;

import android.media.audiofx.AudioEffect;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class EQTestActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int sessionId = AudioEffect.SUCCESS;
        try {
            AudioEffect.Descriptor[] effects = AudioEffect.queryEffects();
            for (AudioEffect.Descriptor d : effects) {
                Log.i("EQTest", "Effect: " + d.name + " / UUID: " + d.uuid.toString());
            }
        } catch (Exception e) {
            Log.e("EQTest", "Error querying effects", e);
        }

        Log.i("EQTest", "Session ID = " + sessionId);
    }
}
