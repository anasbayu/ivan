package ekonsul.anasbayu.com.ekonsul.network;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import ekonsul.anasbayu.com.ekonsul.model.ResponseModel;

/**
 * Created by AnasBayu on 15/08/2017.
 */

public interface ApiInterface {
    @FormUrlEncoded
    @POST(ApiConfig.LOGIN)
    Call<ResponseModel> login(@Field("username") String username, @Field("pass") String pass);

    @FormUrlEncoded
    @POST(ApiConfig.REGISTER)
    Call<ResponseModel> register(@Field("username") String username, @Field("pass") String pass);

    @FormUrlEncoded
    @POST(ApiConfig.GET_PENGUMUMAN)
    Call<ResponseModel> getPengumuman();

    @FormUrlEncoded
    @POST(ApiConfig.GET_DOSEN)
    Call<ResponseModel> getDosen();

    @FormUrlEncoded
    @POST(ApiConfig.GET_JADWAL)
    Call<ResponseModel> getJadwal(@Field("id_dosen") String noDosen);
}
