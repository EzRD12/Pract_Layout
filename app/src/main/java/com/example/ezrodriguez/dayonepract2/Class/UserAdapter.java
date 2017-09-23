package com.example.ezrodriguez.dayonepract2.Class;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.ezrodriguez.dayonepract2.R;

import java.util.List;

/**
 * Created by Ez. Rodriguez on 9/16/2017.
 */

public class UserAdapter extends ArrayAdapter<User> {

    public UserAdapter (Context context, List<User> users){
        super(context,0,users);
    }

    @NonNull
    @Override
    public View getView(int position,
                        @Nullable View convertView,
                        @NonNull ViewGroup parent) {
        User _user = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater
                    .from(getContext())
                    .inflate(R.layout.user_item, parent, false);
        }
        //Nuestro user_item.xml
        TextView name = (TextView) convertView.findViewById(R.id.userName);
        TextView addrs = (TextView) convertView.findViewById(R.id.userAddress);
        name.setText(_user.name);
        addrs.setText(_user.address);

        return convertView;
    }
}
