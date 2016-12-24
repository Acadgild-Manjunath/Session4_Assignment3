package com.acadgild.com.session4_assignment3;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    GridView gridViewImages;
    Context c1;
 ImageAdapter img1 = new ImageAdapter(c1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridViewImages = (GridView)findViewById(R.id.gridView1);

        gridViewImages.setAdapter(new ImageAdapter(this));

        gridViewImages.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
        Toast.makeText(this, img1.versionNames[pos], Toast.LENGTH_SHORT).show();
    }
}
