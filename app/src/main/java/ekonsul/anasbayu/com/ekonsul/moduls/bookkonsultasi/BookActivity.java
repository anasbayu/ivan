package ekonsul.anasbayu.com.ekonsul.moduls.bookkonsultasi;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import ekonsul.anasbayu.com.ekonsul.R;

public class BookActivity extends AppCompatActivity implements BookView {

    private TextView txtNamaDosen;
    private ProgressDialog mProgressDialog;
    private BookPresenter mPresenter;
    private Spinner spinnerKeperluan;
    private Spinner spinnerWaktu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_main);

        initView();
        initPresenter();
    }

    private void initView(){
        setTitle("Form Booking");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        spinnerKeperluan = (Spinner) findViewById(R.id.spiner_keperluan);
        spinnerWaktu = (Spinner) findViewById(R.id.spiner_waktu);

        ArrayAdapter<CharSequence> adapterKeperluan = ArrayAdapter.createFromResource(this,
                R.array.keperluan, android.R.layout.simple_spinner_item);
        adapterKeperluan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerKeperluan.setAdapter(adapterKeperluan);


        List<String> spinnerArray =  new ArrayList<String>();
        spinnerArray.add("Senin, 07.00");
        spinnerArray.add("Rabu, 10.00");
        spinnerArray.add("Kamis, 10.00");
        spinnerArray.add("Kamis, 13.00");
        spinnerArray.add("Jumat, 08.45");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, spinnerArray);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerWaktu.setAdapter(adapter);

        txtNamaDosen = (TextView) findViewById(R.id.txt_dosen);
        String namaDosen = getIntent().getStringExtra("nama_dosen");
        txtNamaDosen.setText(namaDosen);
    }

    private void initPresenter(){
        mPresenter = new BookPresenter();
    }


    @Override
    public void onProgress() {

    }

    @Override
    public void onFinishedProgress() {

    }

    @Override
    public void onDisplayError(String msg) {

    }

    @Override
    public void onDisplaySuccess(String msg) {

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

}
