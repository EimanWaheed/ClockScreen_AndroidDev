package com.example.clockscreen;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.*;
public class searchAdapter extends RecyclerView.Adapter<searchAdapter.ProgrammingViewHolder> implements Filterable {

    private World_Time data;
    private List<String> temp ;
    private ArrayList<String> cboxlist=new ArrayList<>();
    public searchAdapter(World_Time data) {
        this.data = data;
        temp = new ArrayList<>();
        temp = data.getCountryList();
    }
    public ArrayList<String> getCboxList(){
        return cboxlist;
    }
    @NonNull
    @Override
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view= inflater.inflate(R.layout.checkbox_row,parent,false);
        return  new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewHolder holder, int position) {

        holder.name.setText( temp.get(position)) ;
        holder.time.setText(data.getCountryTime());
        if(temp!=null && temp.size()>0){
            //holder.checkboxvalues.setText(temp.get(position));
            //holder.checkboxvalues.setOnClickListener(new View.OnClickListener() {
              //  @Override
                //public void onClick(View v) {
                    if(holder.checkboxvalues.isChecked()){
                        cboxlist.add(temp.get(position));
                    }
                    else{
                        cboxlist.remove(temp.get(position));
                    }
                //}
            //});
        }
    }

    @Override
    public int getItemCount() {
        return temp.size();
    }



    public class ProgrammingViewHolder extends RecyclerView.ViewHolder{
        ImageView flag;
        TextView name;
        TextView time;
        CheckBox checkboxvalues;
        public ProgrammingViewHolder(@NonNull View itemView) {
            super(itemView);
            checkboxvalues= (CheckBox) itemView.findViewById(R.id.cb);
            flag=(ImageView) itemView.findViewById(R.id.country_flag);
            name=(TextView) itemView.findViewById(R.id.country_name);
            time=(TextView) itemView.findViewById(R.id.country_time);
        }
    }

    @Override
    public Filter getFilter() {

        return exampleFiler;
    }
    Filter exampleFiler = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<String> filteredList = new ArrayList<>();

            if (constraint == null || constraint.length() == 0) {
                filteredList.addAll(data.getCountryList());
            } else {
                String filterPattern = constraint.toString().toLowerCase().trim();

                for (String item : data.getCountryList()) {
                    if (item.toLowerCase().contains(filterPattern)) {
                        filteredList.add(item);
                    }
                }
            }

            FilterResults results = new FilterResults();
            results.values = filteredList;

            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            temp.clear();
            temp.addAll((List) results.values);
            notifyDataSetChanged();
        }
    };
}
