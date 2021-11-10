package com.example.hw_product_recycleview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw_product_recycleview.adapter.itemAdapter
import com.example.hw_product_recycleview.databinding.FragmentMobileListBinding

class mobileList : Fragment() {
private var _binding :FragmentMobileListBinding? = null

private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMobileListBinding.inflate(inflater,container,false)
        return binding?.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       binding.recycleN.adapter = itemAdapter(this.context)
        binding.recycleN.setHasFixedSize(true)

        }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}