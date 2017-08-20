package teswifi.anasbayu.com.proyekivan.moduls.pengumuman;

import teswifi.anasbayu.com.proyekivan.moduls.Base.BaseView;

/**
 * Created by AnasBayu on 19/08/2017.
 */

public interface PengumumanView extends BaseView{
    void onProgressFetchData();
    void onFinishedFetchData();
    void onTidakAdaPengumuman();
}
