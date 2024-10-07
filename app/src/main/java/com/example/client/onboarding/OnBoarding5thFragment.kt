package com.example.client.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import com.example.client.R
import com.example.client.databinding.FragmentOnBoarding5thBinding


class OnBoarding5thFragment : Fragment() {

    lateinit var binding: FragmentOnBoarding5thBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnBoarding5thBinding.inflate(inflater,container,false)

        val animate = AnimationUtils.loadAnimation(requireContext(),R.anim.scale_animation)
        binding.ivConfetti.startAnimation(animate)

        return binding.root
    }
}