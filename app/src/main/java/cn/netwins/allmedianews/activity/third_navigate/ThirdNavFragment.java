package cn.netwins.allmedianews.activity.third_navigate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import cn.netwins.allmedianews.R;
import cn.netwins.allmedianews.base.BaseFragment;


/**
 * Created by desaco on 2017/6/22.
 */
public class ThirdNavFragment extends BaseFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.common_fragment, null);
        TextView showTv = (TextView)v.findViewById(R.id.show_text_tv);
        showTv.setText("ThirdNavFragment,第333个Fragment");
        return v;
    }
}
