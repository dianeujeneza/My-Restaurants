package com.moringaschool.myrestaurants.util;

import com.moringaschool.myrestaurants.models.Restaurant;

import java.util.ArrayList;

public interface OnRestaurantSelectedListener {
    public void onRestaurantSelected(Integer position, ArrayList<Restaurant> restaurants, String source);
}
