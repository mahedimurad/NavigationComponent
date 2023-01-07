package com.sarwar.navigationcomponentsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.sarwar.navigationcomponentsample.databinding.FragmentExamBinding

class ExamFragment : Fragment() {

    private lateinit var binding: FragmentExamBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_exam, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnExamDetails1.setOnClickListener {
            findNavController().navigate(ExamFragmentDirections.actionExamFragmentToExamDetailsFragment(Scores(96,92,91)))
        }

        binding.btnExamDetails2.setOnClickListener {
            findNavController().navigate(ExamFragmentDirections.actionExamFragmentToExamDetailsFragment(Scores(70, 66, 54)))
        }

    }

}