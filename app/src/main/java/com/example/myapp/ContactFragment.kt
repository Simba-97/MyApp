package com.example.myapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.contact_fragment.*

class ContactFragment: Fragment(R.layout.contact_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnCall.setOnClickListener{
            val intent = Intent(android.content.Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:8167576728")
            startActivity(intent)
        }
    }
}