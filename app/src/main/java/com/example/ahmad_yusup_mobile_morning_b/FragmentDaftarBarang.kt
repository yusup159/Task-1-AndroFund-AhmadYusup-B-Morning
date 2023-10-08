package com.example.ahmad_yusup_mobile_morning_b

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class FragmentDaftarBarang : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
    val view = inflater.inflate(R.layout.fragmentdaftarbarang, container, false)
        val text: TextView = view.findViewById(R.id.liat)
        val value = arguments?.getString("nama")
        text.setText(value)
        return view
    }


}