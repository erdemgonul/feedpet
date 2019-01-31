package com.example.rup.feedyourpet;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
public class CreatePet extends FragmentActivity{


    public String nick;
    public String type;
    CreatePetNick nickFrag;
    CreatePetType typeFrag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        ViewPager pager = (ViewPager) findViewById(R.id.viewPager);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            switch(pos) {

                case 0: nickFrag=CreatePetNick.newInstance();
                    return nickFrag;
                case 1: typeFrag=CreatePetType.newInstance();
                return typeFrag;

            }
            return null;
        }

        @Override
        public int getCount() {
            return 2;
        }


    }

    public void setNick(String n){
        this.nick=n;
    }
    public void setType(String n){
        this.type=n;
    }
}
