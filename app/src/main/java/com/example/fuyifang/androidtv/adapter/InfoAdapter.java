package com.example.fuyifang.androidtv.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.fuyifang.androidtv.R;
import com.example.fuyifang.androidtv.bean.InfoBean;
import com.example.fuyifang.androidtv.bean.TodayRecommende;
import com.example.fuyifang.androidtv.utils.LogUtil;

import java.util.List;

/**
 * Created by fuyifang on 2016/7/26.
 */
public class InfoAdapter extends BaseQuickAdapter {
    public InfoAdapter(int layoutResId, List data) {
        super(layoutResId, data);
        LogUtil.i(data+"data");
//        LogUtil.i(data.get(0).getRecommend().get(0).getName());
    }

    @Override
    protected void convert(BaseViewHolder baseViewHolder, Object object) {
        if (object instanceof InfoBean.RecommendBean) {
            baseViewHolder.setText(R.id.recommon_name, ((InfoBean.RecommendBean) object).getName());
        }else if (object instanceof InfoBean.MovieBean){
            baseViewHolder.setText(R.id.recommon_name,((InfoBean.TvLiveBean)object).getClassName());
        }else if (object instanceof InfoBean.TvLiveBean){
            baseViewHolder.setText(R.id.recommon_name,((InfoBean.TvLiveBean)object).getClassName());
        }

    }


}
