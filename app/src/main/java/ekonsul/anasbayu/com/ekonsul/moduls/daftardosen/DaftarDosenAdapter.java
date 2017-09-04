package ekonsul.anasbayu.com.ekonsul.moduls.daftardosen;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

import ekonsul.anasbayu.com.ekonsul.R;
import ekonsul.anasbayu.com.ekonsul.model.Dosen;
import ekonsul.anasbayu.com.ekonsul.moduls.bookkonsultasi.BookActivity;

/**
 * Created by AnasBayu on 20/08/2017.
 */

public class DaftarDosenAdapter extends RecyclerView.Adapter<DaftarDosenAdapter.mViewHolder> {
    private List<Dosen> data;
    private Context mConteext;

    public static class mViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitle, txtIsi;
        LinearLayout row;

        mViewHolder(View itemView) {
            super(itemView);
            row = (LinearLayout) itemView.findViewById(R.id.row_dosen);
            txtTitle = (TextView) itemView.findViewById(R.id.txt_judul);
            txtIsi = (TextView) itemView.findViewById(R.id.txt_isi);
        }
    }

    // Konstruktor.
    public DaftarDosenAdapter(Context konteks){
        this.mConteext = konteks;
        this.data = Collections.emptyList();
    }

    public void setData(List<Dosen> data){
        this.data = Collections.emptyList();
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public DaftarDosenAdapter.mViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;

        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_dosen, parent, false);
        DaftarDosenAdapter.mViewHolder vh = new DaftarDosenAdapter.mViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(DaftarDosenAdapter.mViewHolder holder, final int position) {
        holder.txtTitle.setText(data.get(position).getNama());
        holder.txtIsi.setText(data.get(position).getMataKuliah());

        holder.row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent iDosen = new Intent(mConteext, BookActivity.class);
            iDosen.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            iDosen.putExtra("nama_dosen", data.get(position).getNama());
            mConteext.startActivity(iDosen);
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
