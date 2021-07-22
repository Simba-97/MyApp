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

        btnCall.setOnClickListener {
            val callIntent = Intent(android.content.Intent.ACTION_DIAL)
            callIntent.data = Uri.parse("tel:8167576728")
            startActivity(callIntent)
        }

        btnMail.setOnClickListener {
            val mailIntent = Intent(android.content.Intent.ACTION_SENDTO, Uri.fromParts("mailto", "singhhritik978@gmail.com", null))
            startActivity(mailIntent)
        }

        btnLocation.setOnClickListener {
            val location = "https://www.google.com/maps/place/Newtown,+Kolkata,+West+Bengal/@22.5862314,88.4577813,13z/data=!3m1!4b1!4m5!3m4!1s0x3a0275350398a5b9:0x75e165b244323425!8m2!3d22.5753931!4d88.4797903"
            val locationIntent = Intent(android.content.Intent.ACTION_VIEW, Uri.parse(location))
            startActivity(locationIntent)
        }
    }
}