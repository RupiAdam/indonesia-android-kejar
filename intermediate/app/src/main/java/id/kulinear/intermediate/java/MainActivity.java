package id.kulinear.intermediate.java;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import id.kulinear.intermediate.R;

public class MainActivity extends AppCompatActivity {

    private Button btnToLogin, btnToSimpleRecycler, btnToCustomRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToLogin = findViewById(R.id.btnToLogin);
        btnToSimpleRecycler = findViewById(R.id.btnToSimpleRecycler);
        btnToCustomRecycler = findViewById(R.id.btnToCustomRecycler);

        btnToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });

        btnToCustomRecycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AddressListActivity.class));
            }
        });
    }
}
