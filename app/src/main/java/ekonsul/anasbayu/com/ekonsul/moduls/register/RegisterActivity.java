package ekonsul.anasbayu.com.ekonsul.moduls.register;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import ekonsul.anasbayu.com.ekonsul.R;
import ekonsul.anasbayu.com.ekonsul.moduls.Base.BaseFormView;
import ekonsul.anasbayu.com.ekonsul.moduls.login.LoginActivity;

public class RegisterActivity extends AppCompatActivity implements RegisterView, BaseFormView{

    private RegisterPresenter mPresenter;
    private ProgressDialog mProgressDialog;
    private EditText etNama;
    private EditText etNoInduk;
    private EditText etPass;
    private TextView txtLogin;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Menyembunyikan action bar.
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_register);

        initView();
        initPresenter();
    }


    @Override
    public void onProgress() {
        mProgressDialog.show();
    }

    @Override
    public void onFinishedProgress() {
        mProgressDialog.dismiss();
    }

    @Override
    public void onDisplayError(String msg) {
        onFinishedProgress();
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDisplaySuccess(String msg) {
        onFinishedProgress();
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

        Intent iLogin = new Intent(this, LoginActivity.class);
        startActivity(iLogin);
        finish();
    }

    @Override
    public void initView() {
        mProgressDialog = new ProgressDialog(this);
        mProgressDialog.setCancelable(false);
        mProgressDialog.setMessage("Loading...");

        etNama = (EditText) findViewById(R.id.et_uname);
        etPass = (EditText) findViewById(R.id.et_pass);
        etNoInduk = (EditText) findViewById(R.id.et_no_induk);
        txtLogin = (TextView) findViewById(R.id.txt_login);
        btnRegister = (Button) findViewById(R.id.btn_daftar);

//        txtLogin.setText(Html.fromHtml("Belum memiliki akun? Daftar <a>disini</a>"));

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        txtLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iLogin = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(iLogin);
                finish();
            }
        });

    }

    @Override
    public void initPresenter() {
        mPresenter = new RegisterPresenter(this);
    }
}
