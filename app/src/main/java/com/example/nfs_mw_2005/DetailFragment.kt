package com.example.nfs_mw_2005

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.nfs_mw_2005.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            val model= it.getSerializable("key") as NfsModel
            binding.tvNameDetail.text = model.name
            binding.tvCarNameDetail.text = model.carName
            binding.tvNumberDetail.text = model.number
            binding.ivCarDetail.setImageResource(model.imageCar)
        }
    }
}

