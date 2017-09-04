package ekonsul.anasbayu.com.ekonsul.model;

/**
 * Created by AnasBayu on 20/08/2017.
 */

public class Dosen {
    private String nama;
    private String mataKuliah;

    public Dosen(String nama, String mataKuliah) {
        this.nama = nama;
        this.mataKuliah = mataKuliah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
}
