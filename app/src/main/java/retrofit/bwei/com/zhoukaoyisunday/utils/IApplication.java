package retrofit.bwei.com.zhoukaoyisunday.utils;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;


import org.greenrobot.greendao.database.Database;

import retrofit.bwei.com.zhoukaoyisunday.dao.DaoMaster;
import retrofit.bwei.com.zhoukaoyisunday.dao.DaoSession;
import retrofit.bwei.com.zhoukaoyisunday.retrofit.IGetDataService;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 此类的作用：
 *
 * @author: forever
 * @date: 2017/12/3 14:23
 */
public class IApplication extends Application{

    public static IGetDataService service;
    private static DaoSession session;


    @Override
    public void onCreate() {
        super.onCreate();

        Fresco.initialize(this);
     Retrofit retrofit=new Retrofit.Builder()
             .baseUrl("https://www.zhaoapi.cn")
             .addConverterFactory(GsonConverterFactory.create())
             .build();
        //对IGteDatabase编译。请求数据
        service = retrofit.create(IGetDataService.class);
    //初始化Greendao


        DaoMaster.DevOpenHelper openHelper = new DaoMaster.DevOpenHelper(this, "tablename");
//打开数据库
        Database database=openHelper.getWritableDb();
        //操作数据库对象
        session = new DaoMaster(database).newSession();
    }
}
