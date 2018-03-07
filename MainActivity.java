package com.jeffsacco.jsacco.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view)
    {
        ImageView leafs = (ImageView)findViewById(R.id.leafs);

        float num = leafs.getAlpha();

        if(num == 1)
        {
            leafs.animate().alpha(0f).setDuration(1000);
        }
        else
        {
            leafs.animate().alpha(1f).setDuration(1000);
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
