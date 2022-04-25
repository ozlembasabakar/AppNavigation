package com.example.appnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.appnavigation.databinding.FragmentBlank3Binding

class BlankFragment3 : Fragment() {

    private lateinit var fragment3: FragmentBlank3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragment3 = DataBindingUtil.inflate(inflater, R.layout.fragment_blank3, container, false)
        return fragment3.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragment3.button3.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment3_to_blankFragment4)
        }
    }
}