package com.example.demotvtokyo.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.demotvtokyo.R
import com.example.demotvtokyo.viewmodel.HomeLoginFrgVM
import kotlinx.android.synthetic.main.fragment_home__login__frg.*


class Home_Login_Frg : Fragment() {
    var number = 4

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_home__login__frg, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var homeLoginVM = ViewModelProvider(this).get(HomeLoginFrgVM::class.java)
        tv_logIn_log_out.setOnClickListener {
            findNavController().navigate(R.id.action_home_Login_Frg_to_playerFrg)
        }
        homeLoginVM.fetchEpisode()




    }


}