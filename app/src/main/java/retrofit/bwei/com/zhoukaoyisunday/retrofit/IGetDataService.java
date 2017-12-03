package retrofit.bwei.com.zhoukaoyisunday.retrofit;

import retrofit.bwei.com.zhoukaoyisunday.bean.Bean;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * 此类的作用：
 *
 * @author: forever
 * @date: 2017/12/3 14:36
 */
public interface IGetDataService {
    @FormUrlEncoded
    @POST("/product/getProducts")
    Call<Bean> post(@Field("pscid") String pscid);
}
