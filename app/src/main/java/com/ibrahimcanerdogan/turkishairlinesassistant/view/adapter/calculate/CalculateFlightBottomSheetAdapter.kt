package com.ibrahimcanerdogan.turkishairlinesassistant.view.adapter.calculate

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ibrahimcanerdogan.turkishairlinesassistant.databinding.BottomSheetCalculateFlightMilesRowItemBinding
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.response.FlightMilesResponseDataDetail

class CalculateFlightBottomSheetAdapter(
    private val calculateFlightMilesResponse: ArrayList<FlightMilesResponseDataDetail>
) :  RecyclerView.Adapter<CalculateFlightBottomSheetAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: BottomSheetCalculateFlightMilesRowItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : ViewHolder {
        return ViewHolder(BottomSheetCalculateFlightMilesRowItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return calculateFlightMilesResponse.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder){
            with(calculateFlightMilesResponse[position]){
                binding.rowTextViewClassCodes.text = this.flightMilesDetailClassCodes
                binding.rowTextViewCabinType.text = this.flightMilesDetailCabinType
                binding.rowTextViewBaseMiles.text = this.flightMilesDetailBaseMiles
                binding.rowTextViewPromoMiles.text = this.flightMilesDetailPromoMiles
                binding.rowTextViewTotalMiles.text = this.flightMilesDetailTotalMiles
            }
        }
    }
}

