package com.example.ezrodriguez.dayonepract2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.ezrodriguez.dayonepract2.Class.User;
import com.example.ezrodriguez.dayonepract2.Class.UserAdapter;

import java.util.ArrayList;
import java.util.List;

public class ListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        android.widget.ListView mylistView = (android.widget.ListView) findViewById(R.id.myListView);

        List<User> users = new ArrayList<>();
        for (int i=0; i<100; i++){
            users.add(new User("Nombre "+ i , "Direccion " + i));
        }
        UserAdapter adapter = new UserAdapter(this,users);
        mylistView.setAdapter(adapter);
    }
}
