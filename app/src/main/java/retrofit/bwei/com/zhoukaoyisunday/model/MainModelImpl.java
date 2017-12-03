package retrofit.bwei.com.zhoukaoyisunday.model;

import retrofit.bwei.com.zhoukaoyisunday.bean.Bean;
import retrofit.bwei.com.zhoukaoyisunday.utils.IApplication;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * 此类的作用：
 *
 * @author: forever
 * @date: 2017/12/3 15:03
 */
public class MainModelImpl {
    public void postData(final ModelCallBack callBack){
        Call<Bean> call= IApplication.service.post("1");
  call.enqueue(new Callback<Bean>() {
      @Override
      public void onResponse(Call<Bean> call, Response<Bean> response) {
          Bean bean=response.body();
          callBack.onSuccess(bean);
      }

      @Override
      public void onFailure(Call<Bean> call, Throwable t) {
          callBack.onFailure(new Exception(""));
      }
  });
   }



}
