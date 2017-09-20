package com.example.dineshbalajivenkataraman.musicapp.Playlist;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import com.example.dineshbalajivenkataraman.musicapp.R;
import com.example.dineshbalajivenkataraman.musicapp.Utils.BottomNavigationViewHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
public class UserPlaylistActivity extends AppCompatActivity {
    private static final String TAG = "UserPlaylistActivity";
    private Context mContext = UserPlaylistActivity.this;
    private static final int BOTTOM_ACTIVITY_NUM = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_playlist);
        setupBottomNavigationView();
        Log.i(TAG, "I am from UserPlaylistActivity");
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
