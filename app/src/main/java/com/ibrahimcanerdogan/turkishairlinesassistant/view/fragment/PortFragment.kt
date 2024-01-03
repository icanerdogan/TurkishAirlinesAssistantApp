package com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.ibrahimcanerdogan.turkishairlinesassistant.R
import com.ibrahimcanerdogan.turkishairlinesassistant.databinding.FragmentPortBinding
import com.ibrahimcanerdogan.turkishairlinesassistant.model.port.request.PortRequest
import com.ibrahimcanerdogan.turkishairlinesassistant.model.port.request.PortRequestHeader
import com.ibrahimcanerdogan.turkishairlinesassistant.model.port.request.portToJsonObject
import com.ibrahimcanerdogan.turkishairlinesassistant.model.port.response.PortResponse
import com.ibrahimcanerdogan.turkishairlinesassistant.view.adapter.port.PortAdapter
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

    @Inject
    lateinit var portAdapter: PortAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPortBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        handleObserve()
        viewModel.getPortTurkishAirlinesData()

        binding.apply {
            recyclerViewPort.apply {
                layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
                adapter = portAdapter
            }

            radioButtonTurkishAirlines.setOnCheckedChangeListener { _, checkedId ->
                if (checkedId) {
                    viewModel.getPortTurkishAirlinesData()
                    radioButtonAJet.isChecked = false
                }
            }
            radioButtonAJet.setOnCheckedChangeListener { _, checkedId ->
                if (checkedId) {
                    viewModel.getPortAnadoluJetData(PortRequest(requestHeader = PortRequestHeader()).portToJsonObject())
                    radioButtonTurkishAirlines.isChecked = false
                }
            }
        }
    }

    private fun handleObserve() {
        viewModel.portAnadoluJetData.observe(viewLifecycleOwner, ::observeAnadoluJet)
        viewModel.portTurkishAirlinesData.observe(viewLifecycleOwner, ::observeTurkishAirlines)
    }

    private fun observeAnadoluJet(portResponse: PortResponse?) {
        portResponse?.let {
            portAdapter.setData(it.portResponseData.portResponseInfo)

            println(it.portResponseMessage.portMessageDescription)
            Toast.makeText(requireContext(), it.portResponseMessage.portMessageDescription, Toast.LENGTH_LONG).show()
            Log.i("PortFragment", it.portResponseMessage.portMessageDescription)
        }
    }

    private fun observeTurkishAirlines(portResponse: PortResponse?) {
        portResponse?.let {
            portAdapter.setData(it.portResponseData.portResponseInfo)

            println(it.portResponseMessage.portMessageDescription)
            Toast.makeText(requireContext(), it.portResponseMessage.portMessageDescription, Toast.LENGTH_LONG).show()
            Log.i("PortFragment", it.portResponseMessage.portMessageDescription)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}