package ekonsul.anasbayu.com.ekonsul.moduls.daftardosen;

import java.util.ArrayList;
import java.util.List;

import ekonsul.anasbayu.com.ekonsul.model.Dosen;

/**
 * Created by AnasBayu on 20/08/2017.
 */

public class DaftarDosenPresenter {
    private DaftarDosenView mView;

    public DaftarDosenPresenter(DaftarDosenView mView) {
        this.mView = mView;
    }

    public List<Dosen> ambilDosen(){
        List<Dosen> data = new ArrayList<>();

//        if(){
//
//        }else{
//            mView.onTidakAdaPengumuman();
//        }
        // Ambil dr server. (dummy).data.add(new Dosen("Ivam", "RPL"));
        data.add(new Dosen("Ivan, S.T., M.Cs.", "Jaringan Komputer"));
        data.add(new Dosen("Arafi, S.Si., M.T.", "Sistem Informasi"));
        data.add(new Dosen("Sasongko, S.Kom., M.Kom.", "Kecerdasan Buatan"));
        data.add(new Dosen("Anas, S.Kom., M.Kom.", "Software Quality Assurance"));
        data.add(new Dosen("Bayu, S.Kom., M.Cs.", "E-Commerce"));
        data.add(new Dosen("Kusuma, S.T., M.Kom.", "Jaringan Syaraf Tiruan"));

        return data;
    }
}
