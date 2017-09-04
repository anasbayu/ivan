package ekonsul.anasbayu.com.ekonsul.moduls.Base;

/**
 * Created by AnasBayu on 14/08/2017.
 */

public interface BaseFormView {
    void onProgress();
    void onFinishedProgress();
    void onDisplayError(String msg);
    void onDisplaySuccess(String msg);
}
