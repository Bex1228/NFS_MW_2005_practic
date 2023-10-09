package com.example.nfs_mw_2005

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.nfs_mw_2005.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private var list = arrayListOf(
        NfsModel("Ford Mustang GT/BMW M3 GTR","Razor","1",R.drawable.img_1),
        NfsModel("Mercedes-Benz SLR McLaren","Bull","2",R.drawable.img_2),
        NfsModel("Aston Martin DB9","Ronnie","3",R.drawable.img_3),
        NfsModel("Dodge Viper SRT-10","JW","4",R.drawable.img_4),
        NfsModel("Chevrolet Corvette C6","Webster","5",R.drawable.img_5),
        NfsModel("Lamborghini Gallardo","Ming","6",R.drawable.img_6),
        NfsModel("Mercedes-Benz CLK 500","Kamikaze","7",R.drawable.img_7),
        NfsModel("Ford Mustang GT","Jewels","8",R.drawable.img_8),
        NfsModel("Mitsubishi Lancer EVOLUTION VIII","Earl","9",R.drawable.img_9),
        NfsModel("Porsche Cayman S","Baron","10",R.drawable.img_10),
        NfsModel("Mitsubishi Eclipse GT","Big Lou","11",R.drawable.img_11),
        NfsModel("Mazda RX-8","Issy","12",R.drawable.img_12),
        NfsModel("Toyota Supra","Vic","13",R.drawable.img_13),
        NfsModel("Lexus IS 300","Taz","14",R.drawable.img_14),
        NfsModel("Volkswagen Golf GTI","Sonny","15", R.drawable.img_15),
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = NfsAdapter(list,this::onClick)
        binding.rvContainer.adapter = adapter
    }

    private fun onClick(nfsModel: NfsModel) {

        findNavController().navigate(R.id.detailFragment, bundleOf("key" to nfsModel))

    }

}