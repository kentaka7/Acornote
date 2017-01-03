package tonnysunm.com.acornote.activity.home;

import tonnysunm.com.acornote.model.Folder;
import tonnysunm.com.acornote.mvp.BasePresenter;

/**
 * Created by Tonny on 20/12/16.
 */

class HomePresenter extends BasePresenter<HomeMVP.View> implements HomeMVP.Presenter {
    private static final String TAG = HomePresenter.class.getSimpleName();

    @Override
    public void loadData(){
        Folder.findAllAsync(result -> {
            mView.refresh(result);
        });
    }

}