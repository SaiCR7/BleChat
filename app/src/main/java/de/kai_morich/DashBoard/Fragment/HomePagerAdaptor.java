package de.kai_morich.DashBoard.Fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import de.kai_morich.DashBoard.Fragment.Tab.InitialFragment;
import de.kai_morich.DashBoard.Fragment.Tab.PartialFragment;

public class HomePagerAdaptor extends FragmentStateAdapter {


    public HomePagerAdaptor(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new InitialFragment();
            case 1:
                return new PartialFragment();
            case 2:
            default:
                return new InitialFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
