package ekonsul.anasbayu.com.ekonsul.moduls.profil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ekonsul.anasbayu.com.ekonsul.R;

public class ProfilActivity extends AppCompatActivity implements ProfilView{

    private ProfilPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_main);

        initView();
        initPresenter();
    }

    @Override
    public void initView() {
        setTitle("Profil");
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void initPresenter() {
        mPresenter = new ProfilPresenter();
    }
}
