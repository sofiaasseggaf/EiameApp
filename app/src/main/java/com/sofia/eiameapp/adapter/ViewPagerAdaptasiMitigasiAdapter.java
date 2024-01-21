package com.sofia.eiameapp.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.sofia.eiameapp.upperbar.adaptasimitigasi.FragmentAdaptasiMitigasi1;
import com.sofia.eiameapp.upperbar.adaptasimitigasi.FragmentAdaptasiMitigasi2;
import com.sofia.eiameapp.upperbar.adaptasimitigasi.FragmentAdaptasiMitigasi3;
import com.sofia.eiameapp.upperbar.adaptasimitigasi.FragmentAdaptasiMitigasi4;
import com.sofia.eiameapp.upperbar.adaptasimitigasi.FragmentAdaptasiMitigasi5;
import com.sofia.eiameapp.upperbar.adaptasimitigasi.FragmentAdaptasiMitigasi6;
import com.sofia.eiameapp.upperbar.adaptasimitigasi.FragmentAdaptasiMitigasi7;
import com.sofia.eiameapp.upperbar.adaptasimitigasi.FragmentAdaptasiMitigasi8;
import com.sofia.eiameapp.upperbar.adaptasimitigasi.FragmentAdaptasiMitigasi9;
import com.sofia.eiameapp.upperbar.kasusanalisis.FragmentKasus1;
import com.sofia.eiameapp.upperbar.kasusanalisis.FragmentKasus2;
import com.sofia.eiameapp.upperbar.kasusanalisis.FragmentKasus3;
import com.sofia.eiameapp.upperbar.kasusanalisis.FragmentKasus4;
import com.sofia.eiameapp.upperbar.kasusanalisis.FragmentKasus5;
import com.sofia.eiameapp.upperbar.kasusanalisis.FragmentKasus6;
import com.sofia.eiameapp.upperbar.kasusanalisis.FragmentKasusPetunjuk;

public class ViewPagerAdaptasiMitigasiAdapter extends FragmentPagerAdapter {

    public ViewPagerAdaptasiMitigasiAdapter(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FragmentAdaptasiMitigasi1();
            case 1:
                return new FragmentAdaptasiMitigasi2();
            case 2:
                return new FragmentAdaptasiMitigasi3();
            case 3:
                return new FragmentAdaptasiMitigasi4();
            case 4:
                return new FragmentAdaptasiMitigasi5();
            case 5:
                return new FragmentAdaptasiMitigasi6();
            case 6:
                return new FragmentAdaptasiMitigasi7();
            case 7:
                return new FragmentAdaptasiMitigasi8();
            case 8:
                return new FragmentAdaptasiMitigasi9();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 9; // Number of tabs
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        String title = null;
        if (position == 0)
            title = "Materi 1";
        else if (position == 1)
            title = "Materi 2";
        else if (position == 2)
            title = "Materi 3";
        else if (position == 3)
            title = "Materi 4";
        else if (position == 4)
            title = "Materi 5";
        else if (position == 5)
            title = "Materi 6";
        else if (position == 6)
            title = "Materi 7";
        else if (position == 7)
            title = "Materi 8";
        else if (position == 8)
            title = "Materi 9";
        return title;
    }
}
