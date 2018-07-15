package com.ceyentra.tattle;

import android.support.v7.app.AppCompatActivity;

public abstract class AbstractActivity extends AppCompatActivity {
    @Override
    protected void onResume() {
        super.onResume();
        TattleApplication.activityResumed();
    }

    @Override
    protected void onPause() {
        super.onPause();
        TattleApplication.activityPaused();
    }
}
