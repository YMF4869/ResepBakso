package com.yazidmf.resepmakanan;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class ResepMakananAdapter extends RecyclerView.Adapter<ResepMakananAdapter.ResepMakananViewHolder> {
    private Context context;
    private List<ResepMakananModel> daftarResepMakanan;

    public ResepMakananAdapter(Context context, List<ResepMakananModel> daftarResepMakanan) {
        this.context = context;
        this.daftarResepMakanan = daftarResepMakanan;
    }

    public class ResepMakananViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        LinearLayout layoutItem;
        TextView judul;
        TextView deskripsi;

        public ResepMakananViewHolder(View view) {
            super(view);
            layoutItem = (LinearLayout) view.findViewById(R.id.layout_item);
            layoutItem.setOnClickListener(this);
            judul = (TextView) view.findViewById(R.id.text_judul);
            deskripsi = (TextView) view.findViewById(R.id.text_deskripsi);
        }

        @Override
        public void onClick(View view) {
            context.startActivity(DetilActivity.getStartIntent(context, daftarResepMakanan.get(getAdapterPosition())));
        }
    }

    @Override
    public ResepMakananAdapter.ResepMakananViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler, parent, false);
        return new ResepMakananViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ResepMakananAdapter.ResepMakananViewHolder holder, int position) {
        holder.judul.setText(daftarResepMakanan.get(position).getJudul());
        holder.deskripsi.setText(daftarResepMakanan.get(position).getDeskripsi());
    }

    @Override
    public int getItemCount() {
        return daftarResepMakanan.size();
    }
}
