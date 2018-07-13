package com.appg.modules;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by User on 1/1/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private static final String TAG = "RecyclerViewAdapter";

//    private ArrayList<String> mImageNames = new ArrayList<>();
//    private ArrayList<String> mImages = new ArrayList<>();
    private Context mContext;
    //항목 구성 데이터
    private List<ItemForm> list;

    public RecyclerViewAdapter(Context context, List<ItemForm> list ) {
//        mImageNames = imageNames;
//        mImages = images;
        mContext = context;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");
        // list.get(position).getImageUrls() ==? data.getImageUrls()

        ItemForm data = list.get(position);

        Glide.with(mContext)
                .asBitmap()
                .load(data.getmImageUrls())
                .into(holder.image);

        holder.imageName.setText(data.getmNames());

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked on: " + list.get(position).getmNames());

                Toast.makeText(mContext, list.get(position).getmNames(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mContext, GalleryActivity.class);
                intent.putExtra("image_url", list.get(position).getmImageUrls());
                intent.putExtra("image_name", list.get(position).getmNames());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView image;
        TextView imageName;
        RelativeLayout parentLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            imageName = itemView.findViewById(R.id.image_name);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}















