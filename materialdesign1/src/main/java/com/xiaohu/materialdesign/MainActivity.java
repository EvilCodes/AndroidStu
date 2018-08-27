package com.xiaohu.materialdesign;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        mToolbar = (Toolbar) findViewById(R.id.mToolbar);
//        setSupportActionBar(mToolbar);
        mToolbar.inflateMenu(R.menu.toolbar);

        mToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.backup:
                        Toast.makeText(MainActivity.this,"您点击了Backup按钮",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.delete:
                        Toast.makeText(MainActivity.this,"您点击了Delete按钮",Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.settings:
                        Toast.makeText(MainActivity.this,"您点击了Settings按钮",Toast.LENGTH_SHORT).show();

                }
                return true;
            }
        });
//        if (supportActionBar != null) {

//            supportActionBar.setDisplayHomeAsUpEnabled(true);
//            supportActionBar.setHomeAsUpIndicator(R.drawable.bg_cart_selected);
//        }

    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.toolbar,menu);
//        return true;
//    }

}
