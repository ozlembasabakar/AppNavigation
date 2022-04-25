package com.example.appnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.appnavigation.databinding.FragmentBlank6Binding

class BlankFragment6 : Fragment() {

    private lateinit var fragment6: FragmentBlank6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragment6 = DataBindingUtil.inflate(inflater, R.layout.fragment_blank6, container, false)
        return fragment6.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragment6.button6.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment6_to_blankFragment7)
        }
    }

}