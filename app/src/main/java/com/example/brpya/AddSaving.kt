package com.example.brpya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.brpya.FormatUang
import java.util.*

class AddSaving : AppCompatActivity() {
    lateinit var inpNominal: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_saving)

        inpNominal = findViewById(R.id.inpNominal)
        inpNominal = findViewById<View>(R.id.inpNominal) as EditText
        inpNominal.addTextChangedListener(FormatUang(inpNominal))
        inpNominal.setText("0")
    }
}