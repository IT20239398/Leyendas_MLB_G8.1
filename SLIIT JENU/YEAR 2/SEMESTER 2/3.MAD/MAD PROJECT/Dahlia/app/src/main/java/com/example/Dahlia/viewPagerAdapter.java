package com.example.Dahlia;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class viewPagerAdapter  extends FragmentPagerAdapter {
        private final List<Fragment> fragmentName = new ArrayList<>();
        private final List<String> fragmentTitle = new ArrayList<>();

        //constructor

        public viewPagerAdapter(@NonNull FragmentManager fm) {
                super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
                return fragmentName.get(position);
        }


        @Override
        public int getCount() {
                return fragmentTitle.size();
        }

        //Add fragment Manager
        public void AddFragment(Fragment fragment, String title){
                fragmentName.add(fragment);
                fragmentTitle.add(title);
        }
}
