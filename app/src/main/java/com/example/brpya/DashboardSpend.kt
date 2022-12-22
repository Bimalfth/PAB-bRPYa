package com.example.brpya

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class DashboardSpend: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_spending)
    }

    fun fIncome(view: View){
        val pindah = Intent(this, DashboardIncome::class.java)
        startActivity(pindah)
    }
}