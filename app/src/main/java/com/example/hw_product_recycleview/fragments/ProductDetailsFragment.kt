package com.example.hw_product_recycleview.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hw_product_recycleview.databinding.FragmentProductDetailsBinding

class ProductDetailsFragment : Fragment() {
    private lateinit var binding: FragmentProductDetailsBinding
    private lateinit var productName: String
    private lateinit var productimg: String


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProductDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fetchArguments()
        binding.textView.text = productName
        binding.productImage.setImageResource(productimg.toInt() )

    }

    private fun fetchArguments(){
        arguments?.let {
            val args = ProductDetailsFragmentArgs.fromBundle(it)
            productName = args.productName
            productimg = args.productImage
        }
    }
}