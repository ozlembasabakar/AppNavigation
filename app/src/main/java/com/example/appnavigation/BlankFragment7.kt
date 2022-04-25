package com.example.appnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.appnavigation.databinding.FragmentBlank7Binding

class BlankFragment7 : Fragment() {

    private lateinit var fragment7: FragmentBlank7Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragment7 = DataBindingUtil.inflate(inflater, R.layout.fragment_blank7, container, false)
        return fragment7.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragment7.button7.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment7_to_blankFragment8)
        }
    }

}