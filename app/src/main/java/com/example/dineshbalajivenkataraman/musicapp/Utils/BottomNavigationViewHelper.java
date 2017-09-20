package com.example.dineshbalajivenkataraman.musicapp.Utils;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;
import com.example.dineshbalajivenkataraman.musicapp.Feed.FriendsFeedActivity;
import com.example.dineshbalajivenkataraman.musicapp.Home.HomeActivity;
import com.example.dineshbalajivenkataraman.musicapp.Playlist.UserPlaylistActivity;
import com.example.dineshbalajivenkataraman.musicapp.Profile.UserProfileActivity;
import com.example.dineshbalajivenkataraman.musicapp.R;
import com.example.dineshbalajivenkataraman.musicapp.Trending.TrendingActivity;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
public class BottomNavigationViewHelper {
    private static final String TAG = "BottomNavigationViewHelper";
    public static void setupBottomNavigaitonView(BottomNavigationViewEx bottomNavigationViewEx) {
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
    }
    public static void enableNavigation(final Context context, BottomNavigationViewEx view) {
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.ic_home_music:
                        Intent intent1 = new Intent(context, HomeActivity.class); //ACTIVITY_NUM =0
                        context.startActivity(intent1);
                        break;
                    case R.id.ic_friends_feed:
                        Intent intent2 = new Intent(context, FriendsFeedActivity.class); //ACTIVITY_NUM =1
                        context.startActivity(intent2);
                        break;
                    case R.id.ic_trending_now:
                        Intent intent3 = new Intent(context, TrendingActivity.class); //ACTIVITY_NUM =2
                        context.startActivity(intent3);
                        break;
                    case R.id.ic_user_playist:
                        Intent intent4 = new Intent(context, UserPlaylistActivity.class); //ACTIVITY_NUM =3
                        context.startActivity(intent4);
                        break;
                    case R.id.ic_user_profile:
                        Intent intent5 = new Intent(context, UserProfileActivity.class); //ACTIVITY_NUM =4
                        context.startActivity(intent5);
                        break;
                }
                return false;
            }
        });
    }
}
