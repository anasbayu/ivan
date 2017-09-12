package ekonsul.anasbayu.com.ekonsul.moduls.register;

import android.util.Log;

import ekonsul.anasbayu.com.ekonsul.model.ResponseModel;
import ekonsul.anasbayu.com.ekonsul.network.ApiClient;
import ekonsul.anasbayu.com.ekonsul.network.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by AnasBayu on 14/08/2017.
 */

public class RegisterPresenter {

    private RegisterView mView;


    public RegisterPresenter(RegisterView view) {
        mView = view;
    }

//    private boolean isLoginValid(String uname, String pass){
//        if(uname != null && pass != null){
//            if(uname.length() > 0 && pass.length() > 0){
//                return true;
//            }else{
//                return false;
//            }
//        }else{
//            return false;
//        }
//    }

    public void register(String uname, String pass){
//        mView.onProgress();

        ApiInterface iApi = ApiClient.buatRequest();
        Call<ResponseModel> data = iApi.register(uname, pass);
        data.enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                Log.d("LOG_RESPONSE", response.toString());
                Log.d("LOG_RESPONSE2", response.body().toString());
                Log.d("LOG_RESPONSE2", response.body().getStatus().toString());
//                mView.onDisplaySuccess("Berhasil login");
            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {
                t.printStackTrace();
                Log.d("LOG_RESPONSE_ERR", "ERR");
//                mView.onDisplayError("gagal login");
            }
        });
    }
}
