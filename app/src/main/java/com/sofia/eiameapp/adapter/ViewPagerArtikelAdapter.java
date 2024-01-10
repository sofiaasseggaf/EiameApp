package com.sofia.eiameapp.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.sofia.eiameapp.upperbar.artikel.FragmentArtikel1;
import com.sofia.eiameapp.upperbar.artikel.FragmentArtikel2;
import com.sofia.eiameapp.upperbar.artikel.FragmentArtikel3;
import com.sofia.eiameapp.upperbar.artikel.FragmentArtikel4;
import com.sofia.eiameapp.upperbar.artikel.FragmentArtikel5;
import com.sofia.eiameapp.upperbar.kasusanalisis.FragmentKasus1;
import com.sofia.eiameapp.upperbar.kasusanalisis.FragmentKasus2;
import com.sofia.eiameapp.upperbar.kasusanalisis.FragmentKasus3;
import com.sofia.eiameapp.upperbar.kasusanalisis.FragmentKasus4;
import com.sofia.eiameapp.upperbar.kasusanalisis.FragmentKasus5;
import com.sofia.eiameapp.upperbar.kasusanalisis.FragmentKasus6;
import com.sofia.eiameapp.upperbar.kasusanalisis.FragmentKasusPetunjuk;

public class ViewPagerArtikelAdapter extends FragmentPagerAdapter {

    public ViewPagerArtikelAdapter(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FragmentArtikel1();
            case 1:
                return new FragmentArtikel2();
            case 2:
                return new FragmentArtikel3();
            case 3:
                return new FragmentArtikel4();
            case 4:
                return new FragmentArtikel5();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 5; // Number of tabs
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        String title = null;
        if (position == 0)
            title = "Artikel 1";
        else if (position == 1)
            title = "Artikel 2";
        else if (position == 2)
            title = "Artikel 3";
        else if (position == 3)
            title = "Artikel 4";
        else if (position == 4)
            title = "Artikel 5";
        return title;
    }
}
