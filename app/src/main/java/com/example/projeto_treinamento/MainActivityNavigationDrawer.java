package com.example.projeto_treinamento;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.projeto_treinamento.databinding.ActivityMainNavigationDrawerBinding;
import com.example.projeto_treinamento.db.dao.FilmeDAO;
import com.example.projeto_treinamento.models.Filme;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class MainActivityNavigationDrawer extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainNavigationDrawerBinding binding;
    FilmeDAO dao_filme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        binding = ActivityMainNavigationDrawerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMainActivityNavigationDrawer.toolbar);
        binding.appBarMainActivityNavigationDrawer.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_recycler_card, R.id.nav_recycler_view)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main_activity_navigation_drawer);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);


        /*TESTES DB*/
        //DADOS DB:
        dao_filme = new FilmeDAO(getApplicationContext());
        this.carregarFilmes();
        //Filme f = new Filme("HOME ARANHA", "Ficção", 2005);
        //dao_filme.save(f);
    }



    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main_activity_navigation_drawer);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    private void carregarFilmes() {

        List<Filme> list;;

        list = dao_filme.list();


        if (list != null) {

            for (Filme f: list) {

                Log.i("**********","***");
                Log.i("FILME - ID", String.valueOf(f.getId()));
                Log.i("FILME - TITLE", String.valueOf(f.getTitle()));
                Log.i("FILME - DESCRICAO", String.valueOf(f.getYear()));

            }
        }
    }
}