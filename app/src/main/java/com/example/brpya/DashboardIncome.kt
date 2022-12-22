package com.example.brpya

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class DashboardIncome: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_income)
    }

    fun fSpend(view: View){
        val pindah = Intent(this, DashboardSpend::class.java)
        startActivity(pindah)
    }

    fun fSaving(view: View){
        val pindah = Intent(this, AddSaving::class.java)
        startActivity(pindah)
    }
}