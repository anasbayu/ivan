package ekonsul.anasbayu.com.ekonsul.moduls.pengumuman.DetailPengumuman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import ekonsul.anasbayu.com.ekonsul.R;
import ekonsul.anasbayu.com.ekonsul.model.Pengumuman;

public class DetailPengumumanActivity extends AppCompatActivity implements DetailPengumumanView{

    private DetailPengumumanPresenter mPresenter;
    private TextView txtJudul;
    private TextView txtWaktu;
    private TextView txtIsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pengumuman);

        initView();
    }

    @Override
    public void initView(){
        setTitle("Pengumuman");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        txtJudul = (TextView) findViewById(R.id.txt_judul);
        txtWaktu = (TextView) findViewById(R.id.txt_waktu);
        txtIsi = (TextView) findViewById(R.id.txt_isi);
    }

    @Override
    public void initPresenter() {
        mPresenter = new DetailPengumumanPresenter();
    }

    private void getIntentData(){
        Pengumuman model = getIntent().getParcelableExtra("pengumuman");
    }
}
