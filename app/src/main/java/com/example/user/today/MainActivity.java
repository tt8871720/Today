package com.example.user.today;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int num[] = {1 , 4 ,6 , 8 , 9 , 89 , 7 , 65 , 45 , 334  , 34 };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new NumAdapter());
    }
    class NumAdapter extends RecyclerView.Adapter<NumAdapter.NumViewHolder>{
        @NonNull
        @Override
        public NumViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View view = getLayoutInflater().inflate(R.layout.num_row , viewGroup , false);
            return new NumViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull NumViewHolder numViewHolder, int i) {
numViewHolder.numtext.setText(num[i] + "");
        }

        @Override
        public int getItemCount() {
            return num.length;
        }

        class NumViewHolder extends RecyclerView.ViewHolder {
            TextView numtext;
            public NumViewHolder(@NonNull View itemView) {
                super(itemView);
                numtext = itemView.findViewById(R.id.textnum);
            }
        }
    }
}
