package com.example.brpya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.brpya.FormatUang
import java.util.*

class AddNewDebt : AppCompatActivity() {
    lateinit var inpNominal: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_new_debt)

        inpNominal = findViewById(R.id.inpNominal)
        inpNominal = findViewById<View>(R.id.inpNominal) as EditText
        inpNominal.addTextChangedListener(FormatUang(inpNominal))
        inpNominal.setText("0")
    }
}