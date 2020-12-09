package com.example.mynicestart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
/**
 * Ventana de inicio
 * @author fabid
 * @see MainActivity2
 */
public class MainActivity extends AppCompatActivity {
    protected Button goproButton;
    protected ImageView avatarIV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goproButton = (Button) findViewById(R.id.goproButton);
        goproButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        avatarIV = findViewById(R.id.avatarIV);
        Glide.with(this)
                .load("https://cdn.iconscout.com/icon/free/png-256/avatar-370-456322.png")
                .centerCrop()
                .transition(DrawableTransitionOptions.withCrossFade(500))
                .circleCrop()
                .into(avatarIV);
    }

}
