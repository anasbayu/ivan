package teswifi.anasbayu.com.proyekivan.moduls.pengumuman;

import java.util.ArrayList;
import java.util.List;

import teswifi.anasbayu.com.proyekivan.model.Pengumuman;

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
        data.add(new Pengumuman("Judul 1", "Isi 1"));
        data.add(new Pengumuman("Judul 2", "Isi 2"));

        return data;
    }
}
