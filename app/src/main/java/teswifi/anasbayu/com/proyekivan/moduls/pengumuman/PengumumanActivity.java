package teswifi.anasbayu.com.proyekivan.moduls.pengumuman;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import teswifi.anasbayu.com.proyekivan.R;

public class PengumumanActivity extends AppCompatActivity implements PengumumanView{

    private PengumumanView mView;
    private PengumumanPresenter mPresenter;
    private PengumumanAdapter mAdapter;
    private RecyclerView rv;
    private ProgressDialog mDialog;
    private TextView txtNotice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

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
}
