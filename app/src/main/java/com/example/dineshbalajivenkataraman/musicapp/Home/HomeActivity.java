package com.example.dineshbalajivenkataraman.musicapp.Home;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import com.example.dineshbalajivenkataraman.musicapp.Home.Fragments.BuyFragment;
import com.example.dineshbalajivenkataraman.musicapp.Home.Fragments.CuratedAlbumFragment;
import com.example.dineshbalajivenkataraman.musicapp.Home.Fragments.SearchFragment;
import com.example.dineshbalajivenkataraman.musicapp.R;
import com.example.dineshbalajivenkataraman.musicapp.Utils.BottomNavigationViewHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
public class HomeActivity extends AppCompatActivity {
    private static final String TAG = "HomeActivity";
    private Context mContext = HomeActivity.this;
    private static final int BOTTOM_ACTIVITY_NUM = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG, "onCreate: Started");
        setupBottomNavigationView();
        Log.i(TAG, "I am from HomeActivity");
        setupViewPager();
    }
    private void setupViewPager() {
        SectionPagerAdapter sectionPagerAdapter = new SectionPagerAdapter(getSupportFragmentManager());
        sectionPagerAdapter.addFragments(new CuratedAlbumFragment()); //index 0
        sectionPagerAdapter.addFragments(new SearchFragment()); //index 1
        sectionPagerAdapter.addFragments(new BuyFragment()); //index 2
        ViewPager viewPager = (ViewPager) findViewById(R.id.container);
        viewPager.setAdapter(sectionPagerAdapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_home);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_search_music);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_buy);
    }
    private void setupBottomNavigationView() {
        Log.d(TAG, "setupBottomNavigationView: Setting up Bottom");
        BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx) findViewById(R.id.bottomNavViewBar);
        BottomNavigationViewHelper.setupBottomNavigaitonView(bottomNavigationViewEx);
        BottomNavigationViewHelper.enableNavigation(mContext, bottomNavigationViewEx);
        Menu menu = bottomNavigationViewEx.getMenu();
        MenuItem menuItem = menu.getItem(BOTTOM_ACTIVITY_NUM);
        menuItem.setChecked(true);

    }
}
