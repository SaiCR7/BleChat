package de.kai_morich.DashBoard.Fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.MaterialDatePicker;

import java.util.Calendar;
import java.util.TimeZone;

import de.kai_morich.Adaptor.WorkOrderAdaptor;
import de.kai_morich.Utils.DateValidatorWeekdays;
import de.kai_morich.simple_bluetooth_terminal.R;
import de.kai_morich.simple_bluetooth_terminal.databinding.FragmentHistoryBinding;


public class HistoryFragment extends Fragment {

    public FragmentHistoryBinding binding;
    private Handler mHandler;

    private static int resolveOrThrow(Context context, @AttrRes int attributeResId) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(attributeResId, typedValue, true)) {
            return typedValue.data;
        }
        throw new IllegalArgumentException(context.getResources().getResourceName(attributeResId));
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHistoryBinding.inflate(inflater, container, false);
        mHandler = new Handler();
        View view = binding.getRoot();
        LoadRecycle();
        return view;

    }

    private void LoadRecycle() {
        mHandler.postDelayed(() -> {
            binding.shimmerLayout.setVisibility(View.GONE);
            LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
            layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
            binding.recyProduct.setLayoutManager(layoutManager);
            WorkOrderAdaptor workOrderAdaptor = new WorkOrderAdaptor();
            binding.recyProduct.setAdapter(workOrderAdaptor);                             //Connects to the device selected and passed to us by the DeviceScanActivity
        }, 5000);

    }

    @SuppressLint("ResourceType")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

}