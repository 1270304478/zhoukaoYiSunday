package retrofit.bwei.com.zhoukaoyisunday;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit.bwei.com.zhoukaoyisunday.adapter.RecyAdapter;
import retrofit.bwei.com.zhoukaoyisunday.bean.Bean;
import retrofit.bwei.com.zhoukaoyisunday.prensent.MainPresenter;
import retrofit.bwei.com.zhoukaoyisunday.view.IMainView;
public class MainActivity extends Activity implements IMainView {
    @BindView(R.id.recycleview)
    RecyclerView recycleview;
    private MainPresenter presenter;
    private RecyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        presenter = new MainPresenter(this);
        presenter.post();
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        adapter = new RecyAdapter(this);

        recycleview.setLayoutManager(manager);
        recycleview.setAdapter(adapter);

    }
    @Override
    public void onSuccess(Bean bean) {
        adapter.addData(bean);
    }
    @Override
    public void onFailure(Exception e) {

    }
}
