package com.xy.MeiFour.ui.dapei;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.xy.MeiFour.R;
import com.xy.MeiFour.ui.common.ActivityBaseNoSliding;

/**
 * Created by xiaoyu on 2016/4/9.
 */
public class ActivityMyInfo extends ActivityBaseNoSliding implements View.OnClickListener {

    public static void open(Activity activity) {
        Intent intent = new Intent(activity, ActivityMyInfo.class);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_info);
    }

    @Override
    protected void getViews() {

    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void setListeners() {

    }

    @Override
    public void onClick(View view) {

    }
}
