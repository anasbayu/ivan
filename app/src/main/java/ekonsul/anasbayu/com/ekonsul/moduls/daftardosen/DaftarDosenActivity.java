package ekonsul.anasbayu.com.ekonsul.moduls.daftardosen;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import ekonsul.anasbayu.com.ekonsul.R;

public class DaftarDosenActivity extends AppCompatActivity implements DaftarDosenView{

    private RecyclerView rvDosen;
    private DaftarDosenAdapter mAdapter;
    private DaftarDosenPresenter mPresenter;
    private ProgressDialog mDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_dosen);

        initView();
        initPresenter();
        populateDosen();
    }


    @Override
    public void initView() {
        setTitle("Pilih Dosen");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rvDosen = (RecyclerView) findViewById(R.id.rv_dosen);
        mAdapter = new DaftarDosenAdapter(this);
        mDialog = new ProgressDialog(this);
        mDialog.setMessage("Loading...");
        mDialog.setCancelable(false);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rvDosen.setLayoutManager(llm);
        rvDosen.setAdapter(mAdapter);
    }

    @Override
    public void initPresenter() {
        mPresenter = new DaftarDosenPresenter(this);
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
    public void onTidakAdaDosen() {

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void populateDosen(){
        mAdapter.setData(mPresenter.ambilDosen());
        mAdapter.notifyDataSetChanged();
    }
}
