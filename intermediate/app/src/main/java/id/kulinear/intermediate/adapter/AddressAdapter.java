package id.kulinear.intermediate.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import id.kulinear.intermediate.R;
import id.kulinear.intermediate.object.AddressObject;

/**
 * Created by Rupi Adam on 20/10/2017.
 * reach me at: rupi.adam@gmail.com
 */

public class AddressAdapter extends RecyclerView.Adapter<AddressAdapter.ViewHolder>{

    private Context context;
    private List<AddressObject> listAddress;
    private AddressObject selectedAddress;

    public AddressAdapter(Context context, List<AddressObject> listAddress) {
        this.context = context;
        this.listAddress = listAddress;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.adapter_address, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final AddressObject item = listAddress.get(position);
        holder.title.setText(item.placename);
        holder.detail.setText(item.full_address);
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedAddress = item;
            }
        });
    }

    @Override
    public int getItemCount() {
        return listAddress.size();
    }

    public AddressObject getSelectedAddress(){
        return selectedAddress;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        TextView detail;
        LinearLayout parent;

        public ViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            detail = itemView.findViewById(R.id.subtitle);
            parent = itemView.findViewById(R.id.parent);
        }
    }

}
