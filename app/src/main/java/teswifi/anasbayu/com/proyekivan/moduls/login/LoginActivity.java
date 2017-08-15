package teswifi.anasbayu.com.proyekivan.moduls.login;

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

import teswifi.anasbayu.com.proyekivan.R;
import teswifi.anasbayu.com.proyekivan.moduls.Base.BaseView;
import teswifi.anasbayu.com.proyekivan.moduls.Dashboard.DashboardActivity;
import teswifi.anasbayu.com.proyekivan.moduls.register.RegisterActivity;

public class LoginActivity extends AppCompatActivity implements LoginView, BaseView{

    private ProgressDialog mProgressDialog;
    private LoginPresenter mPresenter;
    private Button btnLogin;
    private EditText etUname, etPass;
    private TextView txtRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Menyembunyikan action bar.
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_login);

        initView();
        initPresenter();
    }


    @Override
    public void onProgress() {
        mProgressDialog.setMessage("Loading...");
        mProgressDialog.setCancelable(false);
        mProgressDialog.show();
    }

    @Override
    public void onFinishedProgress() {
        mProgressDialog.dismiss();
    }

    @Override
    public void onDisplayError(String msg) {
        onFinishedProgress();

        // Kosongkan form.
        etPass.setText("");
        etUname.setText("");

        // Munculkan err.
        etPass.setError(msg);
        etUname.setError(msg);
    }

    @Override
    public void onDisplaySuccess(String msg) {
        onFinishedProgress();
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

        // Pindah ke dashboard.
        Intent iDashboard = new Intent(this, DashboardActivity.class);
        startActivity(iDashboard);
        finish();
    }

    @Override
    public void initView() {
        mProgressDialog = new ProgressDialog(this);
        btnLogin = (Button) findViewById(R.id.btn_masuk);
        etUname = (EditText) findViewById(R.id.et_uname);
        etPass = (EditText) findViewById(R.id.et_pass);
        txtRegister = (TextView) findViewById(R.id.txt_register);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.login(etUname.getText().toString(), etPass.getText().toString());
            }
        });

        txtRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke register.
                Intent iRegister = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(iRegister);
                finish();
            }
        });
    }

    @Override
    public void initPresenter() {
        mPresenter = new LoginPresenter(this);
    }


}
