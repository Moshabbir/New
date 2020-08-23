package com.example.anew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val pera = intent.getParcelableExtra<Pera>(MainActivity.INTENT_PARCELABLE)


         val peraSrc = findViewById<TextView>(R.id._peraTitle)
         val peraDetail = findViewById<TextView>(R.id._pera_detail)

        if (pera != null) {
            peraSrc.text = pera.pera_title
        }
        if (pera != null) {
            peraDetail.text= pera.pera_detail
        }

    }
}