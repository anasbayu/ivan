package ekonsul.anasbayu.com.ekonsul.moduls.pengumuman;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import ekonsul.anasbayu.com.ekonsul.R;
import ekonsul.anasbayu.com.ekonsul.moduls.daftardosen.DaftarDosenActivity;
import ekonsul.anasbayu.com.ekonsul.moduls.login.LoginActivity;
import ekonsul.anasbayu.com.ekonsul.moduls.profil.ProfilActivity;

public class PengumumanActivity extends AppCompatActivity implements PengumumanView, View.OnClickListener{

    private PengumumanView mView;
    private PengumumanPresenter mPresenter;
    private PengumumanAdapter mAdapter;
    private RecyclerView rv;
    private ProgressDialog mDialog;
    private TextView txtNotice;
    private LinearLayout menuDosen;
    private LinearLayout menuKeluar;
    private LinearLayout menuProfil;
    private LinearLayout menuPesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengumuman);

        initView();
        initPresenter();
        populatePengumuman();
    }

    @Override
    public void initView() {
        txtNotice = (TextView) findViewById(R.id.txt_notice_pengumuman);
        rv = (RecyclerView) findViewById(R.id.rv_pengumuman);
        mAdapter = new PengumumanAdapter(this);
        mDialog = new ProgressDialog(this);
        mDialog.setMessage("Loading...");
        mDialog.setCancelable(false);

        // Sembunyikan notice.
        txtNotice.setVisibility(View.GONE);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setAdapter(mAdapter);

        menuDosen = (LinearLayout) findViewById(R.id.menu_dosen);
        menuKeluar = (LinearLayout) findViewById(R.id.menu_keluar);
        menuProfil = (LinearLayout) findViewById(R.id.menu_profil);
        menuPesan = (LinearLayout) findViewById(R.id.menu_chat);

        // Set onclick.
        menuDosen.setOnClickListener(this);
        menuKeluar.setOnClickListener(this);
        menuProfil.setOnClickListener(this);
        menuPesan.setOnClickListener(this);
    }

    @Override
    public void initPresenter() {
        mPresenter = new PengumumanPresenter(this);

    }

    @Override
    public void onProgressFetchData() {
        mDialog.show();
    }

    @Override
    public void onFinishedFetchData() {
        mDialog.dismiss();
    }

    @Override
    public void onTidakAdaPengumuman() {
        txtNotice.setVisibility(View.VISIBLE);
    }

    private void populatePengumuman(){
        mAdapter.setData(mPresenter.ambilPengumuman());
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.menu_profil:
                startActivity(new Intent(this, ProfilActivity.class));
                break;
            case R.id.menu_dosen:
                startActivity(new Intent(this, DaftarDosenActivity.class));
                break;
            case R.id.menu_chat:
//                startActivity(new Intent(this, DaftarDosenActivity.class));
                Toast.makeText(this, "Fitur pesan belum tersedia", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_keluar:
                startActivity(new Intent(this, LoginActivity.class));
                finish();
                break;
        }
    }
}
