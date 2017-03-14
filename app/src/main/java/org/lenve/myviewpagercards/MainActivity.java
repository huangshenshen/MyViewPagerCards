package org.lenve.myviewpagercards;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        List<Integer> list = new ArrayList<>();
        list.add(R.drawable.p001);
        list.add(R.drawable.p002);
        list.add(R.drawable.p003);
        list.add(R.drawable.p004);
        list.add(R.drawable.p005);
        MyVpAdater adater = new MyVpAdater(this, list);
        viewPager.setAdapter(adater);
        viewPager.setPageTransformer(false, new ScaleTransformer());
//        viewPager.setPageMargin((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,0,getResources().getDisplayMetrics()));
        viewPager.setOffscreenPageLimit(5);
    }
}
