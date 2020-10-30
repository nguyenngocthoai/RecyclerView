package com.example.recyclerviewbasic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHoder> {
    private LayoutInflater layoutInflater;
    private ArrayList<USB> arrayList;


    public CustomAdapter(Context context, ArrayList<USB> arrayList) {
        layoutInflater = LayoutInflater.from(context);
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_gridview, parent, false);
        return new ViewHoder(view, this);
//        return new ViewHoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoder holder, int position) {
//        final USB list = arrayList.get(position);
//        String mCurrent = arrayList.get(position);
//        holder.name.setText(mCurrent);
//        holder.price.setText();
        holder.image.setImageResource(arrayList.get(position).getImage());
        holder.name.setText(arrayList.get(position).getName());


//        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(view.getContext(),"click on item: "+list.getName(),Toast.LENGTH_LONG).show();
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    public class ViewHoder extends RecyclerView.ViewHolder {
        public TextView name;
        public ImageView image;
        public TextView price;
        public ConstraintLayout relativeLayout;


        private CustomAdapter customAdapter;

        public ViewHoder(@NonNull View itemView, CustomAdapter adapter) {
            super(itemView);
            name = itemView.findViewById(R.id.tvName);
            image = itemView.findViewById(R.id.imgThing);
            price = itemView.findViewById(R.id.Price);
            relativeLayout = itemView.findViewById(R.id.relative);
            this.customAdapter = adapter;
        }

//        public ViewHoder(@NonNull View itemView) {
//            super(itemView);
//            name = itemView.findViewById(R.id.tvName);
//            image = itemView.findViewById(R.id.imgThing);
//            price = itemView.findViewById(R.id.Price);
//            relativeLayout = itemView.findViewById(R.id.relative);
//        }
    }
}
