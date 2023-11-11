package com.goranotes.selectdatawithbottomsheetdialogfragment.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.goranotes.selectdatawithbottomsheetdialogfragment.databinding.BottomSheetDialogBinding

class SelectCarBottomSheetDialogFragment: BottomSheetDialogFragment() {

    val activityParent
        get() = activity as MainActivity

    lateinit var binding: BottomSheetDialogBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = BottomSheetDialogBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvHonda.setOnClickListener {
            activityParent.onSelectCar(binding.tvHonda.text.toString())
            dismiss()
        }
        binding.tvSuzuki.setOnClickListener {
            activityParent.onSelectCar(binding.tvSuzuki.text.toString())
            dismiss()
        }
        binding.tvMazda.setOnClickListener {
            activityParent.onSelectCar(binding.tvMazda.text.toString())
            dismiss()
        }
        binding.tvToyota.setOnClickListener {
            activityParent.onSelectCar(binding.tvToyota.text.toString())
            dismiss()
        }
        binding.tvDaihatsu.setOnClickListener {
            activityParent.onSelectCar(binding.tvDaihatsu.text.toString())
            dismiss()
        }
    }
}