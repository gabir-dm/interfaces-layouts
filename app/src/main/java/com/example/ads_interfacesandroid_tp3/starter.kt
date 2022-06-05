package com.example.ads_interfacesandroid_tp3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class starter : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_starter, container, false)


        val btnRelative = view.findViewById<Button>(R.id.btnRelative)
        btnRelative.setOnClickListener {
            val navController = findNavController()
            navController.navigate(R.id.action_starter_to_relative)
        }

        val btnTable = view.findViewById<Button>(R.id.btnTable)
        btnTable.setOnClickListener {
            val navController = findNavController()
            navController.navigate(R.id.action_starter_to_table)
        }

        val btnLinear = view.findViewById<Button>(R.id.btnLinear)
        btnLinear.setOnClickListener {
            val navController = findNavController()
                navController.navigate(R.id.action_starter_to_linear)
        }

        return view
    }
}