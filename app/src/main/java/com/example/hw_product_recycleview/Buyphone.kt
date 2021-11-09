package com.example.hw_product_recycleview

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.hw_product_recycleview.adapter.itemAdapter
import com.example.hw_product_recycleview.databinding.FragmentBuyphoneBinding
import javax.sql.DataSource

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
class Buyphone : Fragment() {
    private var _binding : FragmentBuyphoneBinding? = null

    private val binding get() = _binding!!

    private lateinit var PhoneName :String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(false)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBuyphoneBinding.inflate(inflater,container,false)
        return binding.root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.let {

            binding.textView.text = it.getString("namePhone").toString()
            binding.imageView2.setImageResource(it.getInt("imageId"))
            println(it.getInt(it.getString("namePhone").toString()))
            println(it.getInt("imageId"))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}