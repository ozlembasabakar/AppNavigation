package com.example.appnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.appnavigation.databinding.FragmentBlank5Binding

class BlankFragment5 : Fragment() {

    private lateinit var fragment5: FragmentBlank5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragment5 = DataBindingUtil.inflate(inflater, R.layout.fragment_blank5, container, false)
        return fragment5.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragment5.button5.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment5_to_blankFragment6)
        }
    }

}