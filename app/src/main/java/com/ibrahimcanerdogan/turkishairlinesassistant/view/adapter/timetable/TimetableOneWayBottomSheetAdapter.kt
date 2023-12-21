package com.ibrahimcanerdogan.turkishairlinesassistant.view.adapter.timetable

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ibrahimcanerdogan.turkishairlinesassistant.R
import com.ibrahimcanerdogan.turkishairlinesassistant.databinding.BottomSheetTimetableRowItemBinding
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.OriginDestinationOption
import com.ibrahimcanerdogan.turkishairlinesassistant.util.AppConstant

class TimetableOneWayBottomSheetAdapter(
    private val timetableOneWayResponse : List<OriginDestinationOption>
) :  RecyclerView.Adapter<TimetableOneWayBottomSheetAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: BottomSheetTimetableRowItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : ViewHolder {
        return ViewHolder(BottomSheetTimetableRowItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return timetableOneWayResponse.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder){
            val sortedList = timetableOneWayResponse.sortedBy { it.FlightSegment.DepartureDateTime.split("T")[0] }

            with(sortedList[position]){
                if (this.FlightSegment.OperatingAirline.Code == "AJ") {
                    binding.imageViewAirlines.setImageResource(R.drawable.icon_anadolu_jet_circle)
                }

                binding.textViewDepartureTime.text = this.FlightSegment.DepartureDateTime.split("T")[1].dropLast(3)
                binding.textViewDepartureAirport.text = this.FlightSegment.DepartureAirport.LocationCode
                binding.textViewArrivalTime.text = this.FlightSegment.ArrivalDateTime.split("T")[1].dropLast(3)
                binding.textViewArrivalAirport.text = this.FlightSegment.ArrivalAirport.LocationCode

                binding.textViewFlightDate.text = AppConstant.convertFormatDate(this.FlightSegment.DepartureDateTime.split("T")[0])
                binding.textViewFlightCode.text = this.FlightSegment.FlightNumber
            }
        }
    }
}
