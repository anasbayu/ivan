package ekonsul.anasbayu.com.ekonsul.moduls.pengumuman.DetailPengumuman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ekonsul.anasbayu.com.ekonsul.R;

public class DetailPengumumanActivity extends AppCompatActivity implements DetailPengumumanView{

    DetailPengumumanPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pengumuman);
    }
}
