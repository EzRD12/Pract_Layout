package com.example.ezrodriguez.dayonepract2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.linearLayoutVertical).setOnClickListener(this);
        findViewById(R.id.linearLayoutHorizontal).setOnClickListener(this);
        findViewById(R.id.relativeLayout).setOnClickListener(this);
        findViewById(R.id.TableLayout).setOnClickListener(this);
        findViewById(R.id.FrameLayout).setOnClickListener(this);
        findViewById(R.id.ListLayout).setOnClickListener(this);
        findViewById(R.id.GridView).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()){
            case R.id.linearLayoutVertical:
                intent = new Intent(MainActivity.this,LinearLayoutVertical.class);
                break;
            case R.id.linearLayoutHorizontal:
                intent = new Intent(MainActivity.this,LinearLayoutHorizontal.class);
                break;
            case R.id.TableLayout:
                intent = new Intent(MainActivity.this,TableLayout.class);
                break;
            case R.id.FrameLayout:
                intent = new Intent(MainActivity.this,FrameLayout.class);
                break;
            case R.id.ListLayout:
                intent = new Intent(MainActivity.this,ListView.class);
                break;
            case R.id.relativeLayout:
                intent = new Intent(MainActivity.this,RelativeLayout.class);
                break;
            case R.id.GridView:
                intent = new Intent(MainActivity.this,GridViewActivity.class);
                break;
        }
        if(intent != null)
            startActivity(intent);


    }
}
