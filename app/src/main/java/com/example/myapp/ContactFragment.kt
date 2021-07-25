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

        tvGithub.setOnClickListener {
            val gitURL = Intent(android.content.Intent.ACTION_VIEW)
            gitURL.data = Uri.parse("https://github.com/Simba-97")
            startActivity(gitURL)
        }

        tvLinkedin.setOnClickListener {
            val linkedinURL = Intent(android.content.Intent.ACTION_VIEW)
            linkedinURL.data = Uri.parse("https://www.linkedin.com/in/hritik-kumar-singh-2a7664193/")
            startActivity(linkedinURL)
        }

        tvTwitter.setOnClickListener {
            val twitterURL = Intent(android.content.Intent.ACTION_VIEW)
            twitterURL.data = Uri.parse("https://twitter.com/HritikKSingh")
            startActivity(twitterURL)
        }

        tvInstagram.setOnClickListener {
            val instaURL = Intent(android.content.Intent.ACTION_VIEW)
            instaURL.data = Uri.parse("https://www.instagram.com/_hritik_kumar_singh_/")
            startActivity(instaURL)
        }

        tvYoutube.setOnClickListener {
            val utubeURL = Intent(android.content.Intent.ACTION_VIEW)
            utubeURL.data = Uri.parse("https://www.youtube.com/channel/UCfoPEplnGbCdkwaf6UdQVKA")
            startActivity(utubeURL)
        }
    }
}