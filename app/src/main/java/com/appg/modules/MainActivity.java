package com.appg.modules;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
//    private ArrayList<String> mNames = new ArrayList<>();
//    private ArrayList<String> mImageUrls = new ArrayList<>();

    //항목 구성 데이터
    // ArrayList<ItemForm> options = new ArrayList<>();
    private List<ItemForm> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        list.add(new ItemForm("Havasu Falls","https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg"));
        list.add(new ItemForm("Trondheim","https://i.redd.it/tpsnoz5bzo501.jpg"));
        list.add(new ItemForm("Portugal","https://i.redd.it/qn7f9oqu7o501.jpg"));
        list.add(new ItemForm("Rocky Mountain National Park","https://i.redd.it/j6myfqglup501.jpg"));
        list.add(new ItemForm("Mahahual","https://i.redd.it/0h2gm1ix6p501.jpg"));
        list.add(new ItemForm("Frozen Lake","https://i.redd.it/k98uzl68eh501.jpg"));
        list.add(new ItemForm("White Sands Desert","https://i.redd.it/glin0nwndo501.jpg"));
        list.add(new ItemForm("Austrailia","https://i.redd.it/obx4zydshg601.jpg"));
        list.add(new ItemForm("Washington","https://i.imgur.com/ZcLLrkY.jpg"));



        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}






















