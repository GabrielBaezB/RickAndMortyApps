package cl.inacap.rickandmorty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import cl.inacap.rickandmorty.adapters.TabsNavPageAdapter;

public class MainActivity extends AppCompatActivity {

    private TabsNavPageAdapter tpa;
    private TabLayout tl;
    private ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tl = findViewById(R.id.tab_layout);
        this.vp = findViewById(R.id.view_pager);
        this.tpa = new TabsNavPageAdapter(getSupportFragmentManager());
        this.vp.setAdapter(this.tpa);
        this.tl.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vp.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}