package com.ibrahimcanerdogan.turkishairlinesassistant.view.adapter.port

import androidx.recyclerview.widget.RecyclerView
import com.ibrahimcanerdogan.turkishairlinesassistant.databinding.ItemAirlinesPortBinding
import com.ibrahimcanerdogan.turkishairlinesassistant.model.port.response.PortResponseInfo

class PortViewHolder(
    private val binding: ItemAirlinesPortBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(data: PortResponseInfo) {
        with(binding) {
            textViewPortName.text = data.portResponseInfoCode

            //textViewPortName.text = data.portResponseInfoLanguageInfo.portBaseLanguageList[0].portBaseLanguageName
            //textViewPortCountryName.text = "${data.portResponseInfoCountry.portCountryLanguageInfo.portCountryBaseLanguage.portBaseLanguageName} (${data.portResponseInfoCountry.portCountryLanguageInfo.portCountryBaseLanguage.portBaseLanguageCode})"
            //textViewContinentName.text = "${data.portResponseInfoRegion.portRegionLanguageInfo.portBaseLanguageList[0].portBaseLanguageName} (${data.portResponseInfoRegion.portRegionLanguageInfo.portBaseLanguageList[0].portBaseLanguageCode})"
        }

    }
}