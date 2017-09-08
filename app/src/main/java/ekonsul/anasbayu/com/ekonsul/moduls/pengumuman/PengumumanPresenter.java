package ekonsul.anasbayu.com.ekonsul.moduls.pengumuman;

import java.util.ArrayList;
import java.util.List;

import ekonsul.anasbayu.com.ekonsul.model.Pengumuman;

/**
 * Created by AnasBayu on 19/08/2017.
 */

public class PengumumanPresenter {
    private PengumumanView mView;

    public PengumumanPresenter(PengumumanView mView) {
        this.mView = mView;
    }

    public List<Pengumuman> ambilPengumuman(){
        List<Pengumuman> data = new ArrayList<>();

//        if(){
//
//        }else{
//            mView.onTidakAdaPengumuman();
//        }
        // Ambil dr server. (dummy).
        data.add(new Pengumuman("Judul Pengumuman 1", "Isi pengumuman 1", ""));
        data.add(new Pengumuman("Judul Pengumuman 2", "Isi pengumumannya", ""));

        return data;
    }
}
