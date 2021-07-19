package com.jsstech.recyclerdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;


public class ShowImageData extends AppCompatActivity {

ImageView imagem;
TextView desTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_image_data);

            desTv=findViewById(R.id.des);
            imagem=findViewById(R.id.showimg);


//        Intent intent = getIntent();
//        String imageUrl = intent.getStringExtra(String.valueOf(image));

        imagem.setImageResource(getIntent().getIntExtra("image",0));
        desTv.setText(getIntent().getStringExtra("title"));
       // Picasso.get().load(imageUrl).fit().centerInside().into(image);


    }

    }
