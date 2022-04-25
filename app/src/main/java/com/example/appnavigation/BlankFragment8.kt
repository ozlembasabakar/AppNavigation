package com.example.appnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.appnavigation.databinding.FragmentBlank8Binding

class BlankFragment8 : Fragment() {

    private lateinit var fragment8: FragmentBlank8Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragment8 = DataBindingUtil.inflate(inflater, R.layout.fragment_blank8, container, false)
        return fragment8.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragment8.button8.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment8_to_blankFragment1)
        }
    }

}