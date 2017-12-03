package retrofit.bwei.com.zhoukaoyisunday.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit.bwei.com.zhoukaoyisunday.R;
import retrofit.bwei.com.zhoukaoyisunday.bean.Bean;
import retrofit.bwei.com.zhoukaoyisunday.bean.DataBean;

/**
 * Created by Menglucywhh on 2017/12/2.
 */

public class RecyAdapter extends RecyclerView.Adapter<RecyAdapter.MyViewHolder> {

    List<DataBean> listDa;
    Context context;

    public RecyAdapter(Context context) {
        this.context = context;
    }

    //传进来数据的方法
    public void addData(Bean bean) {
        if(listDa==null){
            listDa= new ArrayList<>();
        }
        listDa.addAll(bean.getData());
        notifyDataSetChanged();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.recy_item, null);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        String[] split = listDa.get(position).getImages().split("\\|");
        holder.recySimpleView.setImageURI(split[0]);
        holder.recyText.setText(listDa.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return listDa==null?0:listDa.size();
    }


    static class MyViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.recy_simple_view)
        SimpleDraweeView recySimpleView;
        @BindView(R.id.recy_text)
        TextView recyText;

        MyViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
