package retrofit.bwei.com.zhoukaoyisunday.view;

import retrofit.bwei.com.zhoukaoyisunday.bean.Bean;

/**
 * 此类的作用：
 *
 * @author: forever
 * @date: 2017/12/3 15:33
 */
public interface IMainView {
    public void onSuccess(Bean bean);
    public void onFailure(Exception e);
}
