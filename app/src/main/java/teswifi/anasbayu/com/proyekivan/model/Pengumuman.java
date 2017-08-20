package teswifi.anasbayu.com.proyekivan.model;

/**
 * Created by AnasBayu on 20/08/2017.
 */

public class Pengumuman {
    private String judul;
    private String isi;

    public Pengumuman(String judul, String isi) {
        this.judul = judul;
        this.isi = isi;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }
}
