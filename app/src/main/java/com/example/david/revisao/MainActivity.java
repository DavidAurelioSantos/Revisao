package com.example.david.revisao;

import android.app.ListFragment;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewParent;

import com.example.david.revisao.Fragment.Fragmento_1;
import com.example.david.revisao.Fragment.Fragmento_2;
import com.example.david.revisao.Fragment.Fragmento_3;
import com.example.david.revisao.Fragment.Fragmento_4;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Fragment> fragmentList = new ArrayList<>();
        List<String> titulos = new ArrayList<>();

        //Criando os titulos
        String fragment1 = "EA";
        String fragment2 = "Capcom";
        String fragment3 = "Konami";
        String fragment4 = "Rockstar";

        //Adicionando os títulos na Lista de títulos
        titulos.add(fragment1);
        titulos.add(fragment2);
        titulos.add(fragment3);
        titulos.add(fragment4);

        //Criando os fragmentos
        Fragmento_1 fragmentEA = new Fragmento_1();
        Fragmento_2 fragmentCapCom = new Fragmento_2();
        Fragmento_3 fragmentKonami = new Fragmento_3();
        Fragmento_4 fragmentRockstar = new Fragmento_4();

        //inserindo os fragmentos na Lista
        fragmentList.add(fragmentEA);
        fragmentList.add(fragmentCapCom);
        fragmentList.add(fragmentKonami);
        fragmentList.add(fragmentRockstar);

        ViewPager viewPager = findViewById(R.id.viewPager);
        TabLayout tabLayout = findViewById(R.id.tabs);

        FragmentPagerAdapter fragmentPagerAdapter = new FragmentPageAdapter(getSupportFragmentManager(), fragmentList,titulos);

        viewPager.setAdapter(fragmentPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
