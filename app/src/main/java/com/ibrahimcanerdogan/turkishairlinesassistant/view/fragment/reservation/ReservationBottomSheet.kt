package com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment.reservation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.ibrahimcanerdogan.turkishairlinesassistant.databinding.BottomSheetReservationBinding
import com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response.ReservationResponse

class ReservationBottomSheet(
    private val response: ReservationResponse
) : BottomSheetDialogFragment() {

    private var _binding: BottomSheetReservationBinding? = null
    val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = BottomSheetReservationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dialog?.let {
            val sheet = it as BottomSheetDialog
            sheet.behavior.state = BottomSheetBehavior.STATE_HALF_EXPANDED
        }

        with(binding) {
            response.data.retrieveReservationOTAResponse.apply {
                // Contact Information
                textViewPassengerName.text = this.contact.name
                textViewPassengerSurname.text = this.OTA_AirBookRS.AirReservation.TravelerInfo.AirTraveler.PersonName.Surname
                textViewMobilePhone.text = this.contact.mobilePhone
                textViewEmailAddress.text = this.contact.email
                textViewBirthDate.text = this.OTA_AirBookRS.AirReservation.TravelerInfo.AirTraveler.Document[1].BirthDate
                // Payment Details
                textViewCardNumber.text = this.OTA_AirBookRS.AirReservation.Fulfillment.PaymentDetails.PaymentDetail[1].PaymentCard.CardNumber.PlainText
                textViewAmount.text = this.OTA_AirBookRS.AirReservation.Fulfillment.PaymentDetails.PaymentDetail[1].PaymentAmount.Amount
                textViewCurrencyCode.text = this.OTA_AirBookRS.AirReservation.Fulfillment.PaymentDetails.PaymentDetail[1].PaymentAmount.CurrencyCode
                // Ticket Information
                textViewTicketType.text = this.OTA_AirBookRS.AirReservation.Ticketing.TicketType
                textViewTicketDocumentNbr.text = this.OTA_AirBookRS.AirReservation.Ticketing.TicketDocumentNbr
                textViewPseudoCityCode.text = this.OTA_AirBookRS.AirReservation.Ticketing.PseudoCityCode
                // Booking Details
                textViewBookingPNR.text = this.OTA_AirBookRS.AirReservation.BookingReferenceID[0].ID
                textViewBookingRecordKey.text = this.OTA_AirBookRS.AirReservation.BookingReferenceID[1].ID
                textViewBookingReference.text = this.OTA_AirBookRS.AirReservation.BookingReferenceID[2].ID
                // Customer Loyalty
                textViewMembershipID.text = this.OTA_AirBookRS.AirReservation.TravelerInfo.AirTraveler.CustLoyalty.MembershipID
                textViewCustomerType.text = this.OTA_AirBookRS.AirReservation.TravelerInfo.AirTraveler.CustLoyalty.CustomerType ?: "UNDEFINED"
                // Created Date
                textViewCreatedDate.text = "Data was created on ${this.OTA_AirBookRS.AirReservation.CreateDateTime}."
            }

        }
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }

    companion object {
        const val TAG = "ReservationBottomSheet"

        @JvmStatic
        fun newInstance(response: ReservationResponse) = ReservationBottomSheet(response).apply {
            arguments = Bundle().apply {
                putParcelable(TAG, response)
            }
        }
    }
}