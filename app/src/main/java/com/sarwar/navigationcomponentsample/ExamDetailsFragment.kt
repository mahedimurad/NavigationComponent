package com.sarwar.navigationcomponentsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.sarwar.navigationcomponentsample.databinding.FragmentExamDetailsBinding

class ExamDetailsFragment : Fragment() {

    private lateinit var scores: Scores


    lateinit var binding: FragmentExamDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_exam_details, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //show example of data binding

        scores = ExamDetailsFragmentArgs.fromBundle(requireArguments()).scores
        binding.scores = scores

      /*  binding.tvBanglaScore.text = scores.bScore.toString()
        binding.tvEnglishScore.text = scores.eScore.toString()
        binding.tvMathScore.text = scores.mScore.toString()*/

    }

}