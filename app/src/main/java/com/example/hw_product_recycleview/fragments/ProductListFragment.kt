package com.example.hw_product_recycleview.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hw_product_recycleview.ItemAdapter
import com.example.hw_product_recycleview.databinding.FragmentProductListBinding
import com.example.product_recycleview.data.Datasource

class ProductListFragment : Fragment() {

    private lateinit var binding: FragmentProductListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProductListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpRecyclerview()
    }

    private fun setUpRecyclerview(){
        val dataSet = Datasource().loadProduct()
        binding.recyclerView.adapter = ItemAdapter(requireActivity(), dataSet)

    }
}