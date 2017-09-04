package ekonsul.anasbayu.com.ekonsul.model;

/**
 * Created by AnasBayu on 28/08/2017.
 */

public class Profil {
    private String nama;
    private String noInduk;
    private String username;

    public Profil(String nama, String noInduk, String username) {
        this.nama = nama;
        this.noInduk = noInduk;
        this.username = username;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoInduk() {
        return noInduk;
    }

    public void setNoInduk(String noInduk) {
        this.noInduk = noInduk;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
