package com.example.young.androidweek3;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * Created by younglin on 3/3/2016.
 */
public class KobeAdapter extends RecyclerView.Adapter<KobeAdapter.CustomViewHolder> {

    private Context context;
    private ArrayList<KobeMoment> KobeMomentsArray;

    public KobeAdapter(Context context, ArrayList<KobeMoment> KobeMoments) {
        this.context = context;
        KobeMomentsArray = KobeMoments;
    }


    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        This "inflates" the views, using the layout R.layout.row_view
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_list, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        KobeMoment KobeMoment = KobeMomentsArray.get(position);

        holder.nameTextView.setText(KobeMoment.name);
        holder.descriptionTextView.setText(KobeMoment.description);
        holder.imageView.setImageResource(KobeMoment.imageId);


    }

    @Override
    public int getItemCount() {
        return KobeMomentsArray.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;
        TextView descriptionTextView;
        ImageView imageView;


        public CustomViewHolder (View view) {
            super(view);
            this.nameTextView = (TextView) view.findViewById(R.id.nameTextView);
            this.imageView= (ImageView) view.findViewById(R.id.imageView);
            this.descriptionTextView= (TextView) view.findViewById(R.id.descriptionTextView);
//
//            view.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    int row=(int) getAdapterPosition();
//                    String subjectName= (String) KobeMomentsArray.get(row).name;
//                    Toast toast= Toast.makeText(context,,Toast.LENGTH_SHORT);
//                    toast.show();
//                }
//            });

        }
    }
}