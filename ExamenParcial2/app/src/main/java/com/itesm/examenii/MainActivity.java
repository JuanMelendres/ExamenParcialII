package com.itesm.examenii;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment1Activity crsiete = new Fragment1Activity();
        FragmentManager zidane = getSupportFragmentManager();
        FragmentTransaction tranza = zidane.beginTransaction();
        tranza.add(R.id.contenedor,crsiete,"richie");
        tranza.commit();
    }

    public void swapFragemetRichie(View v){
        FragmentManager manager = getSupportFragmentManager();
        Fragment f = manager.findFragmentByTag("juan");
        Fragment h = manager.findFragmentByTag("hector");

        if (f != null){
            Fragment1Activity nuevo = new Fragment1Activity();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.remove(f);
            transaction.add(R.id.contenedor, nuevo,"richie");
            transaction.commit();
        }else if(h != null){
            Fragment1Activity nuevo = new Fragment1Activity();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.remove(h);
            transaction.add(R.id.contenedor, nuevo,"richie");
            transaction.commit();
        }
    }

    public void swapFragmentJuan(View v){
        FragmentManager manager = getSupportFragmentManager();
        Fragment f = manager.findFragmentByTag("richie");
        Fragment h = manager.findFragmentByTag("hector");

        if (f != null){
            Fragment2Activity nuevo = new Fragment2Activity();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.remove(f);
            transaction.add(R.id.contenedor, nuevo,"juan");
            transaction.commit();
        }else if(h != null){
            Fragment2Activity nuevo = new Fragment2Activity();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.remove(h);
            transaction.add(R.id.contenedor, nuevo,"juan");
            transaction.commit();
        }
    }

    public void swapFragmentHector(View v){
        FragmentManager manager = getSupportFragmentManager();
        Fragment f = manager.findFragmentByTag("richie");
        Fragment h = manager.findFragmentByTag("juan");

        if (f != null){
            Fragment3Activity nuevo = new Fragment3Activity();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.remove(f);
            transaction.add(R.id.contenedor, nuevo,"hector");
            transaction.commit();
        }else if(h != null){
            Fragment3Activity nuevo = new Fragment3Activity();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.remove(h);
            transaction.add(R.id.contenedor, nuevo,"hector");
            transaction.commit();
        }
    }


}
