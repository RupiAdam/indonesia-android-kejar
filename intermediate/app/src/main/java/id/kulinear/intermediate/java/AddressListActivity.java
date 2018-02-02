package id.kulinear.intermediate.java;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import id.kulinear.intermediate.R;
import id.kulinear.intermediate.adapter.AddressAdapter;
import id.kulinear.intermediate.object.AddressObject;

/**
 * Created by rupi on 2/2/2018.
 */

public class AddressListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<AddressObject> listAddress = new ArrayList<>();
    private AddressAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address_list);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        adapter = new AddressAdapter(this, listAddress);

        recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        getDemoData();

    }

    private void getDemoData(){
        AddressObject object = new AddressObject("1", -6.2091676, 106.7362708, "Mercubuana", "PIC",
                "021-123456789", "Jakarta", "jakarta Barat", "Meruya", 10000, "Indonesia",
                "Mercu Buana, Jalan Meruya Selatan No.1, Joglo, Kembangan, RT.4/RW.1, Meruya Selatan, RT.4/RW.1, Meruya Selatan, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta");
        listAddress.add(object);
        adapter.notifyDataSetChanged();
    }
}