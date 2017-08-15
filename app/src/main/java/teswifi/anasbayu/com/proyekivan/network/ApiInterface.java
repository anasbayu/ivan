package teswifi.anasbayu.com.proyekivan.network;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import teswifi.anasbayu.com.proyekivan.model.ResponseModel;

/**
 * Created by AnasBayu on 15/08/2017.
 */

public interface ApiInterface {
    @FormUrlEncoded
    @POST(ApiConfig.LOGIN)
    Call<ResponseModel> login(@Field("username") String username, @Field("pass") String pass);
}
