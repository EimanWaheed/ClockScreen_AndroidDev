package com.example.clockscreen;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Locale;
import java.util.Vector;
public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewHolder> {

    private World_Time data;
    public ProgrammingAdapter(World_Time data) {
        this.data= data;
    }

    @NonNull
    @Override
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view= inflater.inflate(R.layout.single_row,parent,false);
        return  new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewHolder holder, int position) {

        holder.name.setText( data.getCountryName(position)) ;
        holder.time.setText(data.getCountryTime());
    }

    @Override
    public int getItemCount() {
        return data.getLength();
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder{
        ImageView flag;
        TextView name;
        TextView time;
        public ProgrammingViewHolder(@NonNull View itemView) {
            super(itemView);
            flag=(ImageView) itemView.findViewById(R.id.country_flag);
            name=(TextView) itemView.findViewById(R.id.country_name);
            time=(TextView) itemView.findViewById(R.id.country_time);
        }
    }
}
