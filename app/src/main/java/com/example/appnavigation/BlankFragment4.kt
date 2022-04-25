package com.example.appnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.appnavigation.databinding.FragmentBlank4Binding

class BlankFragment4 : Fragment() {

    private lateinit var fragment4: FragmentBlank4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragment4 = DataBindingUtil.inflate(inflater, R.layout.fragment_blank4, container, false)
        return fragment4.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragment4.button4.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment4_to_blankFragment5)
        }
    }
}