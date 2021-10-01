package de.kai_morich.DashBoard;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import de.kai_morich.DashBoard.Fragment.HistoryFragment;
import de.kai_morich.DashBoard.Fragment.HomeFragment;
import de.kai_morich.DashBoard.Fragment.ProfileFragment;
import de.kai_morich.DashBoard.Fragment.SettingFragment;
import de.kai_morich.simple_bluetooth_terminal.R;
import de.kai_morich.simple_bluetooth_terminal.databinding.DashboardBinding;

public class DashBoard extends AppCompatActivity {

    private DashboardBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DashboardBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_body, new HomeFragment()).commit();
        binding.navBottom.setOnItemSelectedListener(item -> {
            Fragment fragment = null;
            switch (item.getItemId()) {
                case R.id.nav_home:
                    fragment = new HomeFragment();
                    break;
                case R.id.nav_history:
                    fragment = new HistoryFragment();
                    break;
                case R.id.nav_settings:
                    fragment = new SettingFragment();
                    break;
                case R.id.nav_profie:
                    fragment = new ProfileFragment();
                    break;
                default:
                    fragment = new HomeFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_body, fragment).commit();
            return true;
        });
    }

}
