package org.pursuit.Group_portfolio_HW_TEAM_THE_TRIPLE_THREAT;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ActionMenuView;
import android.widget.Button;
import android.widget.Toolbar;

public class ChoosePerson extends AppCompatActivity {
    private Button johnBtn;
    private Button veenBtn;
    private Button evelynBtn;
    private DrawerLayout drawerLayout;
    private NavigationView navView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_drawer);

        drawerLayout = findViewById(R.id.nav_drawer);

        navView = findViewById(R.id.nav_view);
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case android.R.id.home:
                        drawerLayout.openDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_john:
                        moveToJohn();
                        break;
                    case R.id.nav_kelveen:
                        moveToKelveen();
                        break;
                    case R.id.nav_evelyn:
                        moveToEvelyn();
                        break;

                }
                return true;
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


    public void moveToJohn() {
        Intent intent = new Intent(this, JohnActivity.class);
        startActivity(intent);
    }

    public void moveToKelveen() {
        Intent intent = new Intent(this, VeenActivity.class);
        startActivity(intent);
    }

    public void moveToEvelyn() {
        Intent intent = new Intent(this, EvelynActivity.class);
        startActivity(intent);
    }
}
