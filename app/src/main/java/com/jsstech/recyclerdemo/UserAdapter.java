package com.jsstech.recyclerdemo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder> {
    private List<UserModel> listItems;
    private Context context;


    public UserAdapter(Context context,List<UserModel> listItems) {
        this.listItems = listItems;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent,int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);
        return new MyViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder,int position) {
        //UserModel model=listItems.get(position);
        holder.txtdes.setText(listItems.get(position).getExplanation());

        Picasso.get().load(listItems.get(position).getUrl()).into(holder.imageView);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,ShowImageData.class);

                intent.putExtra("image",listItems.get(position).getUrl());
                intent.putExtra("title",listItems.get(position).getExplanation());
                intent.addFlags(FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(context,"show msg",Toast.LENGTH_SHORT).show();
//
//
//            }
//        });


    }


    @Override
    public int getItemCount() {
        return listItems.size();
    }
//

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        TextView txtdes;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            imageView = itemView.findViewById(R.id.img);

            txtdes = itemView.findViewById(R.id.explain);


        }

        }
    }

