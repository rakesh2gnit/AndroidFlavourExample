package com.rakesh.androidflavour;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    @BindView(R.id.tv_title)
    TextView tvTitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);

        AppDelegate.Log("Main","Hello for testing purpose",2);
    }

    @Override
    protected int getActivityLayout() {
        return R.layout.activity_main;
    }
}
