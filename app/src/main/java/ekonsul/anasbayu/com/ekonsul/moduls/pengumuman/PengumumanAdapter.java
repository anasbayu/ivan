package ekonsul.anasbayu.com.ekonsul.moduls.pengumuman;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;
import java.util.List;

import ekonsul.anasbayu.com.ekonsul.R;
import ekonsul.anasbayu.com.ekonsul.model.Pengumuman;
import ekonsul.anasbayu.com.ekonsul.moduls.daftardosen.DaftarDosenActivity;

/**
 * Created by AnasBayu on 19/08/2017.
 */

public class PengumumanAdapter extends RecyclerView.Adapter<PengumumanAdapter.mViewHolder> {
    private List<Pengumuman> data;
    private Context mConteext;

    public static class mViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitle, txtIsi;
        LinearLayout row;

        mViewHolder(View itemView) {
            super(itemView);
            row = (LinearLayout) itemView.findViewById(R.id.row_pengumuman);
            txtTitle = (TextView) itemView.findViewById(R.id.txt_judul);
            txtIsi = (TextView) itemView.findViewById(R.id.txt_isi);
        }
    }

    // Konstruktor.
    public PengumumanAdapter(Context konteks){
        this.mConteext = konteks;
        this.data = Collections.emptyList();
    }

    public void setData(List<Pengumuman> data){
        this.data = Collections.emptyList();
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public PengumumanAdapter.mViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;

        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_pengumuman, parent, false);
        mViewHolder vh = new mViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(PengumumanAdapter.mViewHolder holder, final int position) {
        holder.txtTitle.setText(data.get(position).getJudul());
        holder.txtIsi.setText(data.get(position).getIsi());
//
        holder.row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent iDetail = new Intent(mConteext, DetailActivity.class);
//                iDetail.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                iDetail.putExtra("data", data.get(position));
//
//                mConteext.startActivity(iDetail);

                if(position == 0){
                    Intent iDosen = new Intent(mConteext, DaftarDosenActivity.class);
                    iDosen.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                    iDosen.putExtra("data", data.get(position));
                    mConteext.startActivity(iDosen);
                }else{
                    Toast.makeText(mConteext, "Tes " + position, Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
