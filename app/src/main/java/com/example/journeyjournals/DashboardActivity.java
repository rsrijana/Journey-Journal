package com.example.journeyjournals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.journeyjournals.databinding.ActivityDashboardBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class DashboardActivity extends AppCompatActivity {
    private RecyclerView rcv;

    private Toolbar toolbar;
    private BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        initView();
        setUpToolsBarWithNavigationComponent();
        setBottomNavigationViewWithNavigationComponent();

        // recycle review code

    }
    private void initView (){
        toolbar = findViewById(R.id.toolbar_dashboard);
        bottomNavigationView = findViewById(R.id.btnNav_View);
    }
    private void setUpToolsBarWithNavigationComponent()
    {
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.nav_host_fragment);
        NavController navController = navHostFragment.getNavController();
        AppBarConfiguration appBarConfiguration =
                new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupWithNavController(
                toolbar, navController, appBarConfiguration);
    }
    private void setBottomNavigationViewWithNavigationComponent()
    {
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        NavController navController = navHostFragment.getNavController();
        NavigationUI.setupWithNavController(bottomNavigationView, navController);
    }


}