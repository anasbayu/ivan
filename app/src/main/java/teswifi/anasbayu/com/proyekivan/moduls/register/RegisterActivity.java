package teswifi.anasbayu.com.proyekivan.moduls.register;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import teswifi.anasbayu.com.proyekivan.R;

public class RegisterActivity extends AppCompatActivity implements RegisterView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
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
}
