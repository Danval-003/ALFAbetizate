package com.example.alfabetizate;


import android.speech.tts.TextToSpeech;

import android.util.Log;
import android.content.Context;

import java.util.Locale;

public class TTSManager {

    private TextToSpeech mTts = null;
    private boolean isLoaded = false;

    public void init(Context context) {
        mTts = new TextToSpeech(context, onInitListener);

    }

    private final TextToSpeech.OnInitListener onInitListener = new TextToSpeech.OnInitListener() {
        @Override
        public void onInit(int status) {
            Locale spanish = Locale.ENGLISH;

                int result = mTts.setLanguage(spanish);
                isLoaded = true;

                if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                    Log.e("[ERROR]", "Este lenguaje no está permitido");
                }
           /** } else {
                Log.e("[ERROR]", "Fallo al inicializar el asistent de voz");
            }*/

        }
    };



    public void shutDown() {
        mTts.shutdown();
    }

    public void adQueuue(String text) {
        if (isLoaded)
            mTts.speak(text, TextToSpeech.QUEUE_ADD, null);
        else
            Log.e("[ERROR]", "TTS No inicializado");
    }

    public void initQueue(String text) {
        if (isLoaded)
            mTts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
        else
            Log.e("[ERROR]", "TTS No inicializado");
    }
    }




