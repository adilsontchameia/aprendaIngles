package com.example.aprendaingles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.aprendaingles.fragments.BichosFragment;
import com.example.aprendaingles.fragments.NumerosFragment;
import com.example.aprendaingles.fragments.VogaisFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {

    /*ViewPager - SmartLayout*/
    ViewPager viewPager;
    SmartTabLayout smartTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ActionBar
        actionBar();
        ligacoes();
        smartTabEadpter();

    }

    public void smartTabEadpter() {
        //Configurar Abas
        //Configuration of Tabs
        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(),
                FragmentPagerItems.with(this)
                        .add(R.string.animais, BichosFragment.class)
                        .add(R.string.numeros, NumerosFragment.class)
                        .add(R.string.vogais, VogaisFragment.class)
                        .create()

        );
        //Configurar o Adapter
        //The Adapter Configuration
        viewPager.setAdapter(adapter);
        smartTabLayout.setViewPager(viewPager);
    }
    public void ligacoes() {
        viewPager = findViewById(R.id.viewPager);
        smartTabLayout = findViewById(R.id.viewPagerTab);
    }
    public void actionBar() {
        getSupportActionBar().setElevation(0);
        getSupportActionBar().setTitle(R.string.titulo);
    }
}