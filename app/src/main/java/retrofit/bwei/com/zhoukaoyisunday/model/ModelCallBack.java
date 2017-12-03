package retrofit.bwei.com.zhoukaoyisunday.model;

import retrofit.bwei.com.zhoukaoyisunday.bean.Bean;

/**
 * 此类的作用：
 *
 * @author: forever
 * @date: 2017/12/3 15:00
 */
public interface ModelCallBack {
    public void onSuccess(Bean bean);
    public void onFailure(Exception e);
}
