package retrofit.bwei.com.zhoukaoyisunday.prensent;





import android.widget.ImageView;


import retrofit.bwei.com.zhoukaoyisunday.bean.Bean;
import retrofit.bwei.com.zhoukaoyisunday.model.MainModelImpl;
import retrofit.bwei.com.zhoukaoyisunday.model.ModelCallBack;
import retrofit.bwei.com.zhoukaoyisunday.view.IMainView;

/**
 * 此类的作用：
 *
 * @author: forever
 * @date: 2017/12/3 15:30
 */
public class MainPresenter {
    private IMainView iView;
    private MainModelImpl mainModel;
    public MainPresenter(IMainView view){
           this.iView=view;
        this.mainModel=new MainModelImpl();
    }
   public void post(){
        mainModel.postData(new ModelCallBack() {
            @Override
            public void onSuccess(Bean bean) {
                if(iView != null){
                    iView.onSuccess(bean);
                }
            }

            @Override
            public void onFailure(Exception e) {
                if(iView != null){
                    iView.onFailure(e);
                }
            }
        });
    }

}
