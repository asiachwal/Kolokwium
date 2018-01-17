package com.example.student.kolokwium;

/**
 * Created by student on 2018-01-17.
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LekarzeAdapter extends RecyclerView.Adapter<LekarzeAdapter.ViewHolder> {

    private ArrayList<Lekarze> lekarze = new ArrayList<>();
    private OnClickPlace listener;

    LekarzeAdapter(ArrayList<Lekarze> lekarze , OnClickPlace listener)
    {
        this.lekarze = lekarze;
        this.listener = listener;


    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item, null);

        return new ViewHolder(itemLayoutView, listener);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setImie(lekarze.get(position).getImie());
        holder.setNazwisko(lekarze.get(position).getNazwisko());



    }

    @Override
    public int getItemCount() {
        return lekarze.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        @BindView(R.id.lekarze_imie)
        TextView name;

        @BindView(R.id.lekarze_nazwisko)
        TextView cost;

        private OnClickPlace listener;

        @BindView(R.id.button_wybierz)
        ImageView Wybrane;


        @OnClick(R.id.button_wybierz)
        void onNameClick() {
            if (Wybrane.getVisibility() == View.INVISIBLE) {
                Wybrane.setVisibility(View.VISIBLE);
            } else {
                Wybrane.setVisibility(View.INVISIBLE);
            }
        }

        public ViewHolder(View itemView, OnClickPlace listener) {

            super(itemView);
            ButterKnife.bind(this,itemView);
            this.listener = listener;


        }

        private void setImie(String imie){name.setText(imie);}
        private void setNazwisko(String nazwisko) {cost.setText(nazwisko);}



        public void OnClick(View view)
        {
            listener.onClickPlace(view, getAdapterPosition());


        }
    }


}
