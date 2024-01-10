package com.sofia.eiameapp.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.sofia.eiameapp.upperbar.kasusanalisis.FragmentKasus1;
import com.sofia.eiameapp.upperbar.kasusanalisis.FragmentKasus2;
import com.sofia.eiameapp.upperbar.kasusanalisis.FragmentKasus3;
import com.sofia.eiameapp.upperbar.kasusanalisis.FragmentKasus4;
import com.sofia.eiameapp.upperbar.kasusanalisis.FragmentKasus5;
import com.sofia.eiameapp.upperbar.kasusanalisis.FragmentKasus6;
import com.sofia.eiameapp.upperbar.kasusanalisis.FragmentKasusPetunjuk;

public class ViewPagerKasusAnalisisAdapter extends FragmentPagerAdapter {

    public ViewPagerKasusAnalisisAdapter(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FragmentKasusPetunjuk();
            case 1:
                return new FragmentKasus1();
            case 2:
                return new FragmentKasus2();
            case 3:
                return new FragmentKasus3();
            case 4:
                return new FragmentKasus4();
            case 5:
                return new FragmentKasus5();
            case 6:
                return new FragmentKasus6();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 7; // Number of tabs
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        String title = null;
        if (position == 0)
            title = "Petunjuk";
        else if (position == 1)
            title = "Kasus\nAnalisis 1";
        else if (position == 2)
            title = "Kasus\nAnalisis 2";
        else if (position == 3)
            title = "Kasus\nAnalisis 3";
        else if (position == 4)
            title = "Kasus\nAnalisis 4";
        else if (position == 5)
            title = "Kasus\nAnalisis 5";
        else if (position == 6)
            title = "Kasus\nAnalisis 6";
        return title;
    }
}
