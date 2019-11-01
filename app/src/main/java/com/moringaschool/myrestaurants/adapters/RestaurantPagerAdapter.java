package com.moringaschool.myrestaurants.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.moringaschool.myrestaurants.models.Restaurant;
import com.moringaschool.myrestaurants.ui.RestaurantDetailFragment;

import java.util.ArrayList;
import java.util.List;

public class RestaurantPagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Restaurant> mRestaurants;
    private String mSource;

    public RestaurantPagerAdapter(FragmentManager fm, ArrayList<Restaurant> restaurants, String source){
        super(fm);
        mRestaurants = restaurants;
        mSource = source;
    }

    @Override
    public Fragment getItem(int position){
        return RestaurantDetailFragment.newInstance(mRestaurants, position, mSource);
    }

    @Override
    public int getCount(){
        return mRestaurants.size();
    }

    @Override
    public CharSequence getPageTitle(int position){
        return mRestaurants.get(position).getName();
    }
}