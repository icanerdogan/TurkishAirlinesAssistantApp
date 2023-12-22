package com.ibrahimcanerdogan.turkishairlinesassistant.util

import android.text.Editable
import android.text.TextWatcher
import com.google.android.material.textfield.MaterialAutoCompleteTextView
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

object AppConstant {
    const val BASE_URL = "https://api.turkishairlines.com/test/"
    const val NETWORK_CALL_TIMEOUT = 300L

    fun getDeviceLanguage() : String {
        return if (Locale.getDefault().displayLanguage == "tr") "TR"
        else "EN"
    }

    fun getTodayDate() : String {
        val calendar: Calendar = Calendar.getInstance()
        val today: Date = calendar.time

        val dateFormat = SimpleDateFormat("dd.MM.yyyy", Locale("tr", "TR"))
        return dateFormat.format(today)
    }

    fun getTomorrowDate() : String {
        val calendar: Calendar = Calendar.getInstance()
        calendar.add(Calendar.DAY_OF_YEAR, 1);

        val today: Date = calendar.time

        val dateFormat = SimpleDateFormat("dd.MM.yyyy", Locale("tr", "TR"))
        return dateFormat.format(today)
    }

    fun getFormattedTodayDate() : String {
        val calendar: Calendar = Calendar.getInstance()
        val today: Date = calendar.time

        val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale("tr", "TR"))
        return dateFormat.format(today)
    }

    fun getFormattedTomorrowDate() : String {
        val calendar: Calendar = Calendar.getInstance()
        calendar.add(Calendar.DAY_OF_YEAR, 1);

        val tomorrow: Date = calendar.time

        val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale("tr", "TR"))
        return dateFormat.format(tomorrow)
    }

    fun convertFormatDate(date : String) : String {
        val currentFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        val dateObject = currentFormat.parse(date)
        val convertedFormat = SimpleDateFormat("dd.MM.yyyy", Locale.getDefault())

        return convertedFormat.format(dateObject!!)
    }

    fun flightTextWatcher(textView: MaterialAutoCompleteTextView) {
        textView.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {
                val text = s.toString()
                val upperCaseText = text.uppercase(Locale.getDefault())

                if (text != upperCaseText) {
                    textView.setText(upperCaseText)
                    textView.setSelection(upperCaseText.length)
                }
            }
        })
    }
}