package com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.ibrahimcanerdogan.turkishairlinesassistant.databinding.FragmentPortBinding
import com.ibrahimcanerdogan.turkishairlinesassistant.model.port.request.PortRequest
import com.ibrahimcanerdogan.turkishairlinesassistant.model.port.request.PortRequestHeader
import com.ibrahimcanerdogan.turkishairlinesassistant.model.port.request.portToJsonObject
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.port.PortViewModel
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.port.PortViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class PortFragment : Fragment() {

    private var _binding: FragmentPortBinding? = null
    private val binding get() = _binding!!

    private val viewModel by lazy {
        ViewModelProvider(this, factory).get(PortViewModel::class.java)
    }

    @Inject
    lateinit var factory: PortViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPortBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.getPortData(PortRequest(requestHeader = PortRequestHeader()).portToJsonObject())

        viewModel.portData.observe(viewLifecycleOwner) {
            it?.let {
                println(it.portResponseMessage.portMessageDescription)
                Toast.makeText(requireContext(), it.portResponseMessage.portMessageDescription, Toast.LENGTH_LONG).show()
            }
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}