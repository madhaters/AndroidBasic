package com.madhatters.androidbasic;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ListActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        recyclerView=findViewById(R.id.listView);
        this.context=this;
        OurAdapter adapter=new OurAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private class OurAdapter extends RecyclerView.Adapter<OurAdapter.ViewHolder>{
        private String[] names={"Adil","Hussnain","Rana","Osama"};
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new ViewHolder(
                    LayoutInflater.from(context).inflate(R.layout.item_list,parent,false));
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            String name=names[position];
            holder.tvNames.setText(name);
        }

        @Override
        public int getItemCount() {
            return names.length;
        }

        class ViewHolder extends RecyclerView.ViewHolder{
            TextView tvNames;
            public ViewHolder(View itemView) {
                super(itemView);
                tvNames=itemView.findViewById(R.id.tvListItem);
            }
        }
    }
}
