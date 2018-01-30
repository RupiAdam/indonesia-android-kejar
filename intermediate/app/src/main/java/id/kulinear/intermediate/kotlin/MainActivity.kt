package id.kulinear.intermediate.kotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import id.kulinear.intermediate.R
import id.kulinear.intermediate.java.LoginActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by Rupi on 30/01/2018.
 */
class MainActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToLogin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}