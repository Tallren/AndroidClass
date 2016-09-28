package com.iandavis.android.personaltrainer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Ian on 9/21/2016.
 */
public class MyActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        ListView myListView = (ListView) findViewById(R.id.customerListView);

        ArrayList<String> myStringArray = new ArrayList<String>();

        int layoutID = android.R.layout.simple_list_item_1;

        ArrayAdapter<String> myAdapterInstance;
        myAdapterInstance = new ArrayAdapter<String>(this, layoutID, myStringArray);

        myListView.setAdapter(myAdapterInstance);

        myStringArray.add("test");
        myStringArray.add("test2");

        myAdapterInstance.notifyDataSetChanged();
    }

}
