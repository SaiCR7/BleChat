package de.kai_morich.Adaptor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import de.kai_morich.simple_bluetooth_terminal.R;

public class WorkOrderAdaptor extends RecyclerView.Adapter<WorkOrderAdaptor.ViewHolder> {


    @NonNull
    @Override
    public WorkOrderAdaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.workorder_view, null);
        return new WorkOrderAdaptor.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WorkOrderAdaptor.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }
}
