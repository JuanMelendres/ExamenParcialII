package com.example.activity21;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Handler.Callback, View.OnClickListener {

    private Handler dataHandler;
    ArrayList<Dog> friendsArray;
    private RecyclerView rvFriendsList;
    JSONArray datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvFriendsList = findViewById(R.id.rvFriendsList);
        dataHandler = new Handler(Looper.getMainLooper(), this);
    }
    public void request(View v){

        Request r = new Request("https://api.jsonbin.io/b/5ea9743566e603359fe0b477", dataHandler);
        r.start();
    }

    @Override
    public boolean handleMessage(@NonNull Message msg) {
        friendsArray = new ArrayList<>();
        datos = (JSONArray) msg.obj;
        try{
            for (int i=0; i<datos.length();i++) {
                Dog newDog = new Dog();
                newDog.setPerrito(datos.getJSONObject(i).getString("perrito"));
                newDog.setPeso(datos.getJSONObject(i).getString("peso"));
                friendsArray.add(newDog);
                //Toast.makeText(this, datos.getJSONObject(i).toString(), Toast.LENGTH_SHORT).show();
            }
            DogAdapter dogAdapter = new DogAdapter(friendsArray, this);
            LinearLayoutManager llm = new LinearLayoutManager(this);
            llm.setOrientation(LinearLayoutManager.VERTICAL);

            GridLayoutManager glm = new GridLayoutManager(this, 2);


            rvFriendsList.setLayoutManager(llm);
            rvFriendsList.setAdapter(dogAdapter);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return true;
    }
    @Override
    public void onClick(View v) {
        /*
        int pos = rvFriendsList.getChildLayoutPosition(v);
        Intent showDogInfo = new Intent(this, FriendInfo.class);
        showDogInfo.putExtra("perrito", friendsArray.get(pos).getPerrito());
        showDogInfo.putExtra("peso", friendsArray.get(pos).getPeso());

        startActivity(showDogInfo);
        try {
            Toast.makeText(this, datos.getJSONObject(pos).getString("perrito"), Toast.LENGTH_SHORT).show();
        } catch (JSONException e) {
            e.printStackTrace();
        }*/
    }
}
