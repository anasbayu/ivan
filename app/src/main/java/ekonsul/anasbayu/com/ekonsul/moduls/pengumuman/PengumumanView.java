package ekonsul.anasbayu.com.ekonsul.moduls.pengumuman;

import ekonsul.anasbayu.com.ekonsul.moduls.Base.BaseView;

/**
 * Created by AnasBayu on 19/08/2017.
 */

public interface PengumumanView extends BaseView{
    void onProgressFetchData();
    void onFinishedFetchData();
    void onTidakAdaPengumuman();
}
