package id.kulinear.intermediate.java;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import id.kulinear.intermediate.R;
import id.kulinear.intermediate.object.AddressObject;

/**
 * Created by rupi on 2/2/2018.
 */

public class AddressDetailActivity extends AppCompatActivity {

    private TextView fullAddress;
    private Button btnToMaps;
    private AddressObject address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address_detail);

        address = (AddressObject) getIntent().getExtras().getSerializable("address");

        fullAddress = findViewById(R.id.fullAddress);
        btnToMaps = findViewById(R.id.button_to_maps);

        fullAddress.setText("Nama tempat: " + address.placename);

        btnToMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=" + address.lat + ","+address.lng);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");

                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });
    }
}
