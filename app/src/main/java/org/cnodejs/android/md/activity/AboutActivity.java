package org.cnodejs.android.md.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import org.cnodejs.android.md.BuildConfig;
import org.cnodejs.android.md.R;
import org.cnodejs.android.md.listener.NavigationFinishClickListener;
import org.cnodejs.android.md.util.ShipUtils;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AboutActivity extends AppCompatActivity {

    @Bind(R.id.about_toolbar)
    protected Toolbar toolbar;

    @Bind(R.id.about_tv_version)
    protected TextView tvVersion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        ButterKnife.bind(this);

        toolbar.setNavigationOnClickListener(new NavigationFinishClickListener(this));

        tvVersion.setText("v" + BuildConfig.VERSION_NAME + " (build-" + BuildConfig.VERSION_CODE + ")");
    }

    @OnClick(R.id.about_btn_open_source_url)
    protected void onBtnOpenSourceUrlClick() {
        ShipUtils.openUrlByBrowser(this, getString(R.string.open_source_url_content));
    }

    @OnClick(R.id.about_btn_about_cnode)
    protected void onBtnAboutCNodeClick() {
        ShipUtils.openUrlByBrowser(this, getString(R.string.about_cnode_content));
    }

    @OnClick(R.id.about_btn_about_author)
    protected void onBtnAboutAuthorClick() {
        ShipUtils.openUrlByBrowser(this, getString(R.string.about_author_content));
    }

    @OnClick(R.id.about_btn_advice_feedback)
    protected void onBtnAdviceFeedbackClick() {

    }

    @OnClick(R.id.about_btn_open_source_license)
    protected void onBtnOpenSourceLicenseClick() {
        
    }

}
