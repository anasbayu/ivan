package ekonsul.anasbayu.com.ekonsul.moduls.daftardosen;

import ekonsul.anasbayu.com.ekonsul.moduls.Base.BaseView;

/**
 * Created by AnasBayu on 20/08/2017.
 */

public interface DaftarDosenView extends BaseView {
    void onProgressFetchData();
    void onFinishedFetchData();
    void onTidakAdaDosen();
}
