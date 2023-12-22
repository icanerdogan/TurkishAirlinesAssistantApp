package com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.roundtrip

import android.os.Parcelable
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.Message
import kotlinx.parcelize.Parcelize

@Parcelize
data class TimetableRoundTripResponse(
    val data: TimetableRoundTripData,
    val message: Message,
    val requestId: String,
    val status: String
) : Parcelable

/*

{
   "status": "SUCCESS",
   "requestId": "000001862bb34a15-1157d2881",
   "message":
  {
     "code": "TK-0000",
     "description": "Request Processed Successfully."
  },
   "data":
  {
     "timeTableOTAResponse":
    {
       "extendedOTAAirScheduleRS": [
        {
           "extraOTAAirScheduleRS":
          {
             "extraOTAAirScheduleRSListType":
            {
               "flightExtraInfo": [
                {
                   "totalDuration": "P0Y0M0DT1H10M0S",
                   "flightDuration": "P0Y0M0DT1H10M0S",
                   "RPH": "0_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H10M0S",
                   "flightDuration": "P0Y0M0DT1H10M0S",
                   "RPH": "1_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H10M0S",
                   "flightDuration": "P0Y0M0DT1H10M0S",
                   "RPH": "2_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H10M0S",
                   "flightDuration": "P0Y0M0DT1H10M0S",
                   "RPH": "3_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H10M0S",
                   "flightDuration": "P0Y0M0DT1H10M0S",
                   "RPH": "4_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H0M0S",
                   "flightDuration": "P0Y0M0DT1H0M0S",
                   "RPH": "5_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H0M0S",
                   "flightDuration": "P0Y0M0DT1H0M0S",
                   "RPH": "6_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H10M0S",
                   "flightDuration": "P0Y0M0DT1H10M0S",
                   "RPH": "7_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H15M0S",
                   "flightDuration": "P0Y0M0DT1H15M0S",
                   "RPH": "8_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H10M0S",
                   "flightDuration": "P0Y0M0DT1H10M0S",
                   "RPH": "9_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H10M0S",
                   "flightDuration": "P0Y0M0DT1H10M0S",
                   "RPH": "10_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H10M0S",
                   "flightDuration": "P0Y0M0DT1H10M0S",
                   "RPH": "11_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H15M0S",
                   "flightDuration": "P0Y0M0DT1H15M0S",
                   "RPH": "12_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H10M0S",
                   "flightDuration": "P0Y0M0DT1H10M0S",
                   "RPH": "13_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H10M0S",
                   "flightDuration": "P0Y0M0DT1H10M0S",
                   "RPH": "14_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H10M0S",
                   "flightDuration": "P0Y0M0DT1H10M0S",
                   "RPH": "15_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H10M0S",
                   "flightDuration": "P0Y0M0DT1H10M0S",
                   "RPH": "16_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H15M0S",
                   "flightDuration": "P0Y0M0DT1H15M0S",
                   "RPH": "17_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H0M0S",
                   "flightDuration": "P0Y0M0DT1H0M0S",
                   "RPH": "18_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H10M0S",
                   "flightDuration": "P0Y0M0DT1H10M0S",
                   "RPH": "19_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H15M0S",
                   "flightDuration": "P0Y0M0DT1H15M0S",
                   "RPH": "20_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H15M0S",
                   "flightDuration": "P0Y0M0DT1H15M0S",
                   "RPH": "21_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H10M0S",
                   "flightDuration": "P0Y0M0DT1H10M0S",
                   "RPH": "22_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H0M0S",
                   "flightDuration": "P0Y0M0DT1H0M0S",
                   "RPH": "23_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H10M0S",
                   "flightDuration": "P0Y0M0DT1H10M0S",
                   "RPH": "24_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H10M0S",
                   "flightDuration": "P0Y0M0DT1H10M0S",
                   "RPH": "25_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H10M0S",
                   "flightDuration": "P0Y0M0DT1H10M0S",
                   "RPH": "26_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H10M0S",
                   "flightDuration": "P0Y0M0DT1H10M0S",
                   "RPH": "27_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H0M0S",
                   "flightDuration": "P0Y0M0DT1H0M0S",
                   "RPH": "28_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H0M0S",
                   "flightDuration": "P0Y0M0DT1H0M0S",
                   "RPH": "29_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H0M0S",
                   "flightDuration": "P0Y0M0DT1H0M0S",
                   "RPH": "30_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H10M0S",
                   "flightDuration": "P0Y0M0DT1H10M0S",
                   "RPH": "31_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                }
              ]
            }
          },
           "OTA_AirScheduleRS":
          {
             "OriginDestinationOptions":
            {
               "DestinationCode": "ESB",
               "OriginCode": "IST",
               "OriginDestinationOption": [
                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "ScheduleValidStartDate": "2023-12-23",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": ".234.67"
                          }
                        }
                      }
                    },
                     "RPH": "0_1",
                     "Equipment":
                    {
                       "Value": "BOEING B737-800",
                       "AirEquipType": "78D"
                    },
                     "DepartureDateTime": "2023-12-23T10:00:00",
                     "ArrivalDateTime": "2023-12-23T11:10:00",
                     "FlightNumber": "TK2138",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2138",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H10M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "ScheduleValidStartDate": "2023-12-25",
                     "ScheduleValidEndDate": "2023-12-25",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1......"
                          }
                        }
                      }
                    },
                     "RPH": "1_1",
                     "Equipment":
                    {
                       "Value": "UNKNOWN_PLANE",
                       "AirEquipType": "N78"
                    },
                     "DepartureDateTime": "2023-12-25T19:00:00",
                     "ArrivalDateTime": "2023-12-25T20:10:00",
                     "FlightNumber": "TK2178",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2178",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H10M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1234567"
                          }
                        }
                      }
                    },
                     "RPH": "2_1",
                     "Equipment":
                    {
                       "Value": "UNKNOWN_PLANE",
                       "AirEquipType": "R32"
                    },
                     "DepartureDateTime": "2023-12-22T15:00:00",
                     "ArrivalDateTime": "2023-12-22T16:10:00",
                     "FlightNumber": "TK2158",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2158",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H10M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "ScheduleValidStartDate": "2023-12-26",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": ".234..."
                          }
                        }
                      }
                    },
                     "RPH": "3_1",
                     "Equipment":
                    {
                       "Value": "BOEING 737-800",
                       "AirEquipType": "738"
                    },
                     "DepartureDateTime": "2023-12-26T16:00:00",
                     "ArrivalDateTime": "2023-12-26T17:10:00",
                     "FlightNumber": "TK2162",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2162",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H10M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": ".234567"
                          }
                        }
                      }
                    },
                     "RPH": "4_1",
                     "Equipment":
                    {
                       "Value": "BOEING B737-800",
                       "AirEquipType": "78D"
                    },
                     "DepartureDateTime": "2023-12-22T19:00:00",
                     "ArrivalDateTime": "2023-12-22T20:10:00",
                     "FlightNumber": "TK2178",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2178",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H10M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "SAW"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1234567"
                          }
                        }
                      }
                    },
                     "RPH": "5_1",
                     "Equipment":
                    {
                       "Value": "UNKNOWN_PLANE",
                       "AirEquipType": "7D3"
                    },
                     "DepartureDateTime": "2023-12-22T18:00:00",
                     "ArrivalDateTime": "2023-12-22T19:00:00",
                     "FlightNumber": "TK7256",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK7256",
                       "Value": "ANADOLUJET",
                       "Code": "AJ"
                    },
                     "JourneyDuration": "P0DT1H0M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "SAW"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-24",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "....5.7"
                          }
                        }
                      }
                    },
                     "RPH": "6_1",
                     "Equipment":
                    {
                       "Value": "UNKNOWN_PLANE",
                       "AirEquipType": "7D3"
                    },
                     "DepartureDateTime": "2023-12-22T14:20:00",
                     "ArrivalDateTime": "2023-12-22T15:20:00",
                     "FlightNumber": "TK7254",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK7254",
                       "Value": "ANADOLUJET",
                       "Code": "AJ"
                    },
                     "JourneyDuration": "P0DT1H0M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1234567"
                          }
                        }
                      }
                    },
                     "RPH": "7_1",
                     "Equipment":
                    {
                       "Value": "BOEING B737-800",
                       "AirEquipType": "78D"
                    },
                     "DepartureDateTime": "2023-12-22T12:00:00",
                     "ArrivalDateTime": "2023-12-22T13:10:00",
                     "FlightNumber": "TK2146",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2146",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H10M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "ScheduleValidStartDate": "2023-12-27",
                     "ScheduleValidEndDate": "2023-12-27",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "..3...."
                          }
                        }
                      }
                    },
                     "RPH": "8_1",
                     "Equipment":
                    {
                       "Value": "BOEING 737-800",
                       "AirEquipType": "738"
                    },
                     "DepartureDateTime": "2023-12-27T01:00:00",
                     "ArrivalDateTime": "2023-12-27T02:15:00",
                     "FlightNumber": "TK2186",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2186",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H15M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-25",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1...567"
                          }
                        }
                      }
                    },
                     "RPH": "9_1",
                     "Equipment":
                    {
                       "Value": "BOEING B737-800",
                       "AirEquipType": "78D"
                    },
                     "DepartureDateTime": "2023-12-22T16:00:00",
                     "ArrivalDateTime": "2023-12-22T17:10:00",
                     "FlightNumber": "TK2162",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2162",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H10M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1234567"
                          }
                        }
                      }
                    },
                     "RPH": "10_1",
                     "Equipment":
                    {
                       "Value": "BOEING B737-800",
                       "AirEquipType": "78D"
                    },
                     "DepartureDateTime": "2023-12-22T21:00:00",
                     "ArrivalDateTime": "2023-12-22T22:10:00",
                     "FlightNumber": "TK2182",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2182",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H10M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-27",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1.3.567"
                          }
                        }
                      }
                    },
                     "RPH": "11_1",
                     "Equipment":
                    {
                       "Value": "AIRBUS A321-231",
                       "AirEquipType": "32R"
                    },
                     "DepartureDateTime": "2023-12-22T13:00:00",
                     "ArrivalDateTime": "2023-12-22T14:10:00",
                     "FlightNumber": "TK2150",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2150",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H10M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-25",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1...5.."
                          }
                        }
                      }
                    },
                     "RPH": "12_1",
                     "Equipment":
                    {
                       "Value": "AIRBUS A319-100",
                       "AirEquipType": "316"
                    },
                     "DepartureDateTime": "2023-12-22T11:00:00",
                     "ArrivalDateTime": "2023-12-22T12:15:00",
                     "FlightNumber": "TK2118",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2118",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H15M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "ScheduleValidStartDate": "2023-12-26",
                     "ScheduleValidEndDate": "2023-12-26",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": ".2....."
                          }
                        }
                      }
                    },
                     "RPH": "13_1",
                     "Equipment":
                    {
                       "Value": "UNKNOWN_PLANE",
                       "AirEquipType": "N78"
                    },
                     "DepartureDateTime": "2023-12-26T13:00:00",
                     "ArrivalDateTime": "2023-12-26T14:10:00",
                     "FlightNumber": "TK2150",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2150",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H10M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1234567"
                          }
                        }
                      }
                    },
                     "RPH": "14_1",
                     "Equipment":
                    {
                       "Value": "BOEING B737-800",
                       "AirEquipType": "78D"
                    },
                     "DepartureDateTime": "2023-12-22T09:00:00",
                     "ArrivalDateTime": "2023-12-22T10:10:00",
                     "FlightNumber": "TK2134",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2134",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H10M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-22",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "....5.."
                          }
                        }
                      }
                    },
                     "RPH": "15_1",
                     "Equipment":
                    {
                       "Value": "BOEING B737-800",
                       "AirEquipType": "78D"
                    },
                     "DepartureDateTime": "2023-12-22T14:00:00",
                     "ArrivalDateTime": "2023-12-22T15:10:00",
                     "FlightNumber": "TK2152",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2152",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H10M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1234567"
                          }
                        }
                      }
                    },
                     "RPH": "16_1",
                     "Equipment":
                    {
                       "Value": "BOEING B737-800",
                       "AirEquipType": "78D"
                    },
                     "DepartureDateTime": "2023-12-22T23:00:00",
                     "ArrivalDateTime": "2023-12-23T00:10:00",
                     "FlightNumber": "TK2184",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2184",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H10M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1..4567"
                          }
                        }
                      }
                    },
                     "RPH": "17_1",
                     "Equipment":
                    {
                       "Value": "BOEING B737-800",
                       "AirEquipType": "78D"
                    },
                     "DepartureDateTime": "2023-12-22T01:00:00",
                     "ArrivalDateTime": "2023-12-22T02:15:00",
                     "FlightNumber": "TK2186",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2186",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H15M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "SAW"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1234567"
                          }
                        }
                      }
                    },
                     "RPH": "18_1",
                     "Equipment":
                    {
                       "Value": "UNKNOWN_PLANE",
                       "AirEquipType": "7D3"
                    },
                     "DepartureDateTime": "2023-12-22T06:40:00",
                     "ArrivalDateTime": "2023-12-22T07:40:00",
                     "FlightNumber": "TK7240",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK7240",
                       "Value": "ANADOLUJET",
                       "Code": "AJ"
                    },
                     "JourneyDuration": "P0DT1H0M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1234567"
                          }
                        }
                      }
                    },
                     "RPH": "19_1",
                     "Equipment":
                    {
                       "Value": "UNKNOWN_PLANE",
                       "AirEquipType": "77B"
                    },
                     "DepartureDateTime": "2023-12-22T08:00:00",
                     "ArrivalDateTime": "2023-12-22T09:10:00",
                     "FlightNumber": "TK2126",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2126",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H10M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "ScheduleValidStartDate": "2023-12-26",
                     "ScheduleValidEndDate": "2023-12-26",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": ".2....."
                          }
                        }
                      }
                    },
                     "RPH": "20_1",
                     "Equipment":
                    {
                       "Value": "BOEING 737-800",
                       "AirEquipType": "738"
                    },
                     "DepartureDateTime": "2023-12-26T02:00:00",
                     "ArrivalDateTime": "2023-12-26T03:15:00",
                     "FlightNumber": "TK2186",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2186",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H15M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1234567"
                          }
                        }
                      }
                    },
                     "RPH": "21_1",
                     "Equipment":
                    {
                       "Value": "UNKNOWN_PLANE",
                       "AirEquipType": "77B"
                    },
                     "DepartureDateTime": "2023-12-22T18:00:00",
                     "ArrivalDateTime": "2023-12-22T19:15:00",
                     "FlightNumber": "TK2170",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2170",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H15M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "ScheduleValidStartDate": "2023-12-23",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1234.67"
                          }
                        }
                      }
                    },
                     "RPH": "22_1",
                     "Equipment":
                    {
                       "Value": "UNKNOWN_PLANE",
                       "AirEquipType": "N78"
                    },
                     "DepartureDateTime": "2023-12-23T14:00:00",
                     "ArrivalDateTime": "2023-12-23T15:10:00",
                     "FlightNumber": "TK2152",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2152",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H10M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "SAW"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1234567"
                          }
                        }
                      }
                    },
                     "RPH": "23_1",
                     "Equipment":
                    {
                       "Value": "UNKNOWN_PLANE",
                       "AirEquipType": "7D3"
                    },
                     "DepartureDateTime": "2023-12-22T20:35:00",
                     "ArrivalDateTime": "2023-12-22T21:35:00",
                     "FlightNumber": "TK7248",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK7248",
                       "Value": "ANADOLUJET",
                       "Code": "AJ"
                    },
                     "JourneyDuration": "P0DT1H0M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "ScheduleValidStartDate": "2023-12-23",
                     "ScheduleValidEndDate": "2023-12-26",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": ".2...6."
                          }
                        }
                      }
                    },
                     "RPH": "24_1",
                     "Equipment":
                    {
                       "Value": "UNKNOWN_PLANE",
                       "AirEquipType": "N78"
                    },
                     "DepartureDateTime": "2023-12-23T07:00:00",
                     "ArrivalDateTime": "2023-12-23T08:10:00",
                     "FlightNumber": "TK2122",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2122",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H10M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-27",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1.3.5.7"
                          }
                        }
                      }
                    },
                     "RPH": "25_1",
                     "Equipment":
                    {
                       "Value": "BOEING B737-800",
                       "AirEquipType": "78D"
                    },
                     "DepartureDateTime": "2023-12-22T07:00:00",
                     "ArrivalDateTime": "2023-12-22T08:10:00",
                     "FlightNumber": "TK2122",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2122",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H10M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-27",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "123.567"
                          }
                        }
                      }
                    },
                     "RPH": "26_1",
                     "Equipment":
                    {
                       "Value": "BOEING B737-900ER",
                       "AirEquipType": "79B"
                    },
                     "DepartureDateTime": "2023-12-22T02:00:00",
                     "ArrivalDateTime": "2023-12-22T03:10:00",
                     "FlightNumber": "TK2192",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2192",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H10M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "ScheduleValidStartDate": "2023-12-28",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "...4..."
                          }
                        }
                      }
                    },
                     "RPH": "27_1",
                     "Equipment":
                    {
                       "Value": "A320-200",
                       "AirEquipType": "320"
                    },
                     "DepartureDateTime": "2023-12-28T13:00:00",
                     "ArrivalDateTime": "2023-12-28T14:10:00",
                     "FlightNumber": "TK2150",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2150",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H10M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "SAW"
                    },
                     "ScheduleValidStartDate": "2023-12-25",
                     "ScheduleValidEndDate": "2023-12-25",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1......"
                          }
                        }
                      }
                    },
                     "RPH": "28_1",
                     "Equipment":
                    {
                       "Value": "UNKNOWN_PLANE",
                       "AirEquipType": "7D3"
                    },
                     "DepartureDateTime": "2023-12-25T15:20:00",
                     "ArrivalDateTime": "2023-12-25T16:20:00",
                     "FlightNumber": "TK7252",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK7252",
                       "Value": "ANADOLUJET",
                       "Code": "AJ"
                    },
                     "JourneyDuration": "P0DT1H0M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "SAW"
                    },
                     "ScheduleValidStartDate": "2023-12-23",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": ".234.6."
                          }
                        }
                      }
                    },
                     "RPH": "29_1",
                     "Equipment":
                    {
                       "Value": "UNKNOWN_PLANE",
                       "AirEquipType": "7D3"
                    },
                     "DepartureDateTime": "2023-12-23T13:50:00",
                     "ArrivalDateTime": "2023-12-23T14:50:00",
                     "FlightNumber": "TK7254",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK7254",
                       "Value": "ANADOLUJET",
                       "Code": "AJ"
                    },
                     "JourneyDuration": "P0DT1H0M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "SAW"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1234567"
                          }
                        }
                      }
                    },
                     "RPH": "30_1",
                     "Equipment":
                    {
                       "Value": "UNKNOWN_PLANE",
                       "AirEquipType": "7D3"
                    },
                     "DepartureDateTime": "2023-12-22T10:05:00",
                     "ArrivalDateTime": "2023-12-22T11:05:00",
                     "FlightNumber": "TK7242",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK7242",
                       "Value": "ANADOLUJET",
                       "Code": "AJ"
                    },
                     "JourneyDuration": "P0DT1H0M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "ScheduleValidStartDate": "2023-12-28",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "...4..."
                          }
                        }
                      }
                    },
                     "RPH": "31_1",
                     "Equipment":
                    {
                       "Value": "BOEING B737-800",
                       "AirEquipType": "78D"
                    },
                     "DepartureDateTime": "2023-12-28T08:00:00",
                     "ArrivalDateTime": "2023-12-28T09:10:00",
                     "FlightNumber": "TK2122",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2122",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H10M0.000S"
                  }
                }
              ]
            },
             "Version": "0"
          }
        },

        {
           "extraOTAAirScheduleRS":
          {
             "extraOTAAirScheduleRSListType":
            {
               "flightExtraInfo": [
                {
                   "totalDuration": "P0Y0M0DT1H0M0S",
                   "flightDuration": "P0Y0M0DT1H0M0S",
                   "RPH": "0_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H20M0S",
                   "flightDuration": "P0Y0M0DT1H20M0S",
                   "RPH": "1_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H20M0S",
                   "flightDuration": "P0Y0M0DT1H20M0S",
                   "RPH": "2_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H20M0S",
                   "flightDuration": "P0Y0M0DT1H20M0S",
                   "RPH": "3_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H20M0S",
                   "flightDuration": "P0Y0M0DT1H20M0S",
                   "RPH": "4_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H20M0S",
                   "flightDuration": "P0Y0M0DT1H20M0S",
                   "RPH": "5_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H25M0S",
                   "flightDuration": "P0Y0M0DT1H25M0S",
                   "RPH": "6_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H0M0S",
                   "flightDuration": "P0Y0M0DT1H0M0S",
                   "RPH": "7_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H0M0S",
                   "flightDuration": "P0Y0M0DT1H0M0S",
                   "RPH": "8_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H0M0S",
                   "flightDuration": "P0Y0M0DT1H0M0S",
                   "RPH": "9_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H20M0S",
                   "flightDuration": "P0Y0M0DT1H20M0S",
                   "RPH": "10_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H20M0S",
                   "flightDuration": "P0Y0M0DT1H20M0S",
                   "RPH": "11_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H20M0S",
                   "flightDuration": "P0Y0M0DT1H20M0S",
                   "RPH": "12_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H15M0S",
                   "flightDuration": "P0Y0M0DT1H15M0S",
                   "RPH": "13_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H20M0S",
                   "flightDuration": "P0Y0M0DT1H20M0S",
                   "RPH": "14_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H0M0S",
                   "flightDuration": "P0Y0M0DT1H0M0S",
                   "RPH": "15_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H20M0S",
                   "flightDuration": "P0Y0M0DT1H20M0S",
                   "RPH": "16_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT0H0M0S",
                   "flightDuration": "P0Y0M0DT0H0M0S",
                   "RPH": "17_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H15M0S",
                   "flightDuration": "P0Y0M0DT1H15M0S",
                   "RPH": "18_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H20M0S",
                   "flightDuration": "P0Y0M0DT1H20M0S",
                   "RPH": "19_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H0M0S",
                   "flightDuration": "P0Y0M0DT1H0M0S",
                   "RPH": "20_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H20M0S",
                   "flightDuration": "P0Y0M0DT1H20M0S",
                   "RPH": "21_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H20M0S",
                   "flightDuration": "P0Y0M0DT1H20M0S",
                   "RPH": "22_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H20M0S",
                   "flightDuration": "P0Y0M0DT1H20M0S",
                   "RPH": "23_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H0M0S",
                   "flightDuration": "P0Y0M0DT1H0M0S",
                   "RPH": "24_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H15M0S",
                   "flightDuration": "P0Y0M0DT1H15M0S",
                   "RPH": "25_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H0M0S",
                   "flightDuration": "P0Y0M0DT1H0M0S",
                   "RPH": "26_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H20M0S",
                   "flightDuration": "P0Y0M0DT1H20M0S",
                   "RPH": "27_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H20M0S",
                   "flightDuration": "P0Y0M0DT1H20M0S",
                   "RPH": "28_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H20M0S",
                   "flightDuration": "P0Y0M0DT1H20M0S",
                   "RPH": "29_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H20M0S",
                   "flightDuration": "P0Y0M0DT1H20M0S",
                   "RPH": "30_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H0M0S",
                   "flightDuration": "P0Y0M0DT1H0M0S",
                   "RPH": "31_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H0M0S",
                   "flightDuration": "P0Y0M0DT1H0M0S",
                   "RPH": "32_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                },

                {
                   "totalDuration": "P0Y0M0DT1H25M0S",
                   "flightDuration": "P0Y0M0DT1H25M0S",
                   "RPH": "33_1",
                   "transferDuration": "P0Y0M0DT0H0M0S"
                }
              ]
            }
          },
           "OTA_AirScheduleRS":
          {
             "OriginDestinationOptions":
            {
               "DestinationCode": "IST",
               "OriginCode": "ESB",
               "OriginDestinationOption": [
                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "ScheduleValidStartDate": "2023-12-23",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "SAW"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": ".234.6."
                          }
                        }
                      }
                    },
                     "RPH": "0_1",
                     "Equipment":
                    {
                       "Value": "UNKNOWN_PLANE",
                       "AirEquipType": "7D3"
                    },
                     "DepartureDateTime": "2023-12-23T15:45:00",
                     "ArrivalDateTime": "2023-12-23T16:45:00",
                     "FlightNumber": "TK7255",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK7255",
                       "Value": "ANADOLUJET",
                       "Code": "AJ"
                    },
                     "JourneyDuration": "P0DT1H0M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1234567"
                          }
                        }
                      }
                    },
                     "RPH": "1_1",
                     "Equipment":
                    {
                       "Value": "BOEING B737-800",
                       "AirEquipType": "78D"
                    },
                     "DepartureDateTime": "2023-12-22T17:55:00",
                     "ArrivalDateTime": "2023-12-22T19:15:00",
                     "FlightNumber": "TK2163",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2163",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H20M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-22",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "....5.."
                          }
                        }
                      }
                    },
                     "RPH": "2_1",
                     "Equipment":
                    {
                       "Value": "BOEING B737-800",
                       "AirEquipType": "78D"
                    },
                     "DepartureDateTime": "2023-12-22T15:55:00",
                     "ArrivalDateTime": "2023-12-22T17:15:00",
                     "FlightNumber": "TK2153",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2153",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H20M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "ScheduleValidStartDate": "2023-12-24",
                     "ScheduleValidEndDate": "2023-12-25",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1.....7"
                          }
                        }
                      }
                    },
                     "RPH": "3_1",
                     "Equipment":
                    {
                       "Value": "BOEING B737-800",
                       "AirEquipType": "78D"
                    },
                     "DepartureDateTime": "2023-12-24T00:55:00",
                     "ArrivalDateTime": "2023-12-24T02:15:00",
                     "FlightNumber": "TK2185",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2185",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H20M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "ScheduleValidStartDate": "2023-12-28",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "...4..."
                          }
                        }
                      }
                    },
                     "RPH": "4_1",
                     "Equipment":
                    {
                       "Value": "A320-200",
                       "AirEquipType": "320"
                    },
                     "DepartureDateTime": "2023-12-28T14:55:00",
                     "ArrivalDateTime": "2023-12-28T16:15:00",
                     "FlightNumber": "TK2151",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2151",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H20M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-25",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1...5.."
                          }
                        }
                      }
                    },
                     "RPH": "5_1",
                     "Equipment":
                    {
                       "Value": "AIRBUS A319-100",
                       "AirEquipType": "316"
                    },
                     "DepartureDateTime": "2023-12-22T19:00:00",
                     "ArrivalDateTime": "2023-12-22T20:20:00",
                     "FlightNumber": "TK2119",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2119",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H20M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1234567"
                          }
                        }
                      }
                    },
                     "RPH": "6_1",
                     "Equipment":
                    {
                       "Value": "BOEING B737-800",
                       "AirEquipType": "78D"
                    },
                     "DepartureDateTime": "2023-12-22T22:55:00",
                     "ArrivalDateTime": "2023-12-23T00:20:00",
                     "FlightNumber": "TK2183",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2183",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H25M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "ScheduleValidStartDate": "2023-12-27",
                     "ScheduleValidEndDate": "2023-12-27",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "SAW"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "..3...."
                          }
                        }
                      }
                    },
                     "RPH": "7_1",
                     "Equipment":
                    {
                       "Value": "UNKNOWN_PLANE",
                       "AirEquipType": "7D3"
                    },
                     "DepartureDateTime": "2023-12-27T12:00:00",
                     "ArrivalDateTime": "2023-12-27T13:00:00",
                     "FlightNumber": "TK7245",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK7245",
                       "Value": "ANADOLUJET",
                       "Code": "AJ"
                    },
                     "JourneyDuration": "P0DT1H0M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "SAW"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1234567"
                          }
                        }
                      }
                    },
                     "RPH": "8_1",
                     "Equipment":
                    {
                       "Value": "UNKNOWN_PLANE",
                       "AirEquipType": "7D3"
                    },
                     "DepartureDateTime": "2023-12-22T08:30:00",
                     "ArrivalDateTime": "2023-12-22T09:30:00",
                     "FlightNumber": "TK7241",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK7241",
                       "Value": "ANADOLUJET",
                       "Code": "AJ"
                    },
                     "JourneyDuration": "P0DT1H0M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "SAW"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1234567"
                          }
                        }
                      }
                    },
                     "RPH": "9_1",
                     "Equipment":
                    {
                       "Value": "UNKNOWN_PLANE",
                       "AirEquipType": "7D3"
                    },
                     "DepartureDateTime": "2023-12-22T22:20:00",
                     "ArrivalDateTime": "2023-12-22T23:20:00",
                     "FlightNumber": "TK7249",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK7249",
                       "Value": "ANADOLUJET",
                       "Code": "AJ"
                    },
                     "JourneyDuration": "P0DT1H0M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1234567"
                          }
                        }
                      }
                    },
                     "RPH": "10_1",
                     "Equipment":
                    {
                       "Value": "UNKNOWN_PLANE",
                       "AirEquipType": "R32"
                    },
                     "DepartureDateTime": "2023-12-22T16:55:00",
                     "ArrivalDateTime": "2023-12-22T18:15:00",
                     "FlightNumber": "TK2159",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2159",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H20M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1.345.7"
                          }
                        }
                      }
                    },
                     "RPH": "11_1",
                     "Equipment":
                    {
                       "Value": "BOEING B737-800",
                       "AirEquipType": "78D"
                    },
                     "DepartureDateTime": "2023-12-22T08:55:00",
                     "ArrivalDateTime": "2023-12-22T10:15:00",
                     "FlightNumber": "TK2123",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2123",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H20M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "ScheduleValidStartDate": "2023-12-28",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "...4..."
                          }
                        }
                      }
                    },
                     "RPH": "12_1",
                     "Equipment":
                    {
                       "Value": "BOEING 737-800",
                       "AirEquipType": "738"
                    },
                     "DepartureDateTime": "2023-12-28T03:55:00",
                     "ArrivalDateTime": "2023-12-28T05:15:00",
                     "FlightNumber": "TK2185",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2185",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H20M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1234567"
                          }
                        }
                      }
                    },
                     "RPH": "13_1",
                     "Equipment":
                    {
                       "Value": "UNKNOWN_PLANE",
                       "AirEquipType": "77B"
                    },
                     "DepartureDateTime": "2023-12-22T10:40:00",
                     "ArrivalDateTime": "2023-12-22T11:55:00",
                     "FlightNumber": "TK2127",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2127",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H15M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-27",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1.3.567"
                          }
                        }
                      }
                    },
                     "RPH": "14_1",
                     "Equipment":
                    {
                       "Value": "AIRBUS A321-231",
                       "AirEquipType": "32R"
                    },
                     "DepartureDateTime": "2023-12-22T14:55:00",
                     "ArrivalDateTime": "2023-12-22T16:15:00",
                     "FlightNumber": "TK2151",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2151",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H20M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-24",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "SAW"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "....5.7"
                          }
                        }
                      }
                    },
                     "RPH": "15_1",
                     "Equipment":
                    {
                       "Value": "UNKNOWN_PLANE",
                       "AirEquipType": "7D3"
                    },
                     "DepartureDateTime": "2023-12-22T16:10:00",
                     "ArrivalDateTime": "2023-12-22T17:10:00",
                     "FlightNumber": "TK7255",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK7255",
                       "Value": "ANADOLUJET",
                       "Code": "AJ"
                    },
                     "JourneyDuration": "P0DT1H0M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "ScheduleValidStartDate": "2023-12-23",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": ".234.67"
                          }
                        }
                      }
                    },
                     "RPH": "16_1",
                     "Equipment":
                    {
                       "Value": "BOEING B737-800",
                       "AirEquipType": "78D"
                    },
                     "DepartureDateTime": "2023-12-23T11:55:00",
                     "ArrivalDateTime": "2023-12-23T13:15:00",
                     "FlightNumber": "TK2139",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2139",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H20M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-22",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "....5.."
                          }
                        }
                      }
                    },
                     "RPH": "17_1",
                     "Equipment":
                    {
                       "Value": "BOEING B737-800",
                       "AirEquipType": "78D"
                    },
                     "DepartureDateTime": "2023-12-22T13:55:00",
                     "ArrivalDateTime": "2023-12-22T13:55:00",
                     "FlightNumber": "TK2147",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2147",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT0H0M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "ScheduleValidStartDate": "2023-12-23",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1234.67"
                          }
                        }
                      }
                    },
                     "RPH": "18_1",
                     "Equipment":
                    {
                       "Value": "BOEING B737-800",
                       "AirEquipType": "78D"
                    },
                     "DepartureDateTime": "2023-12-23T13:55:00",
                     "ArrivalDateTime": "2023-12-23T15:10:00",
                     "FlightNumber": "TK2147",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2147",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H15M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "ScheduleValidStartDate": "2023-12-26",
                     "ScheduleValidEndDate": "2023-12-26",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": ".2....."
                          }
                        }
                      }
                    },
                     "RPH": "19_1",
                     "Equipment":
                    {
                       "Value": "UNKNOWN_PLANE",
                       "AirEquipType": "N78"
                    },
                     "DepartureDateTime": "2023-12-26T14:55:00",
                     "ArrivalDateTime": "2023-12-26T16:15:00",
                     "FlightNumber": "TK2151",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2151",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H20M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "SAW"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1234567"
                          }
                        }
                      }
                    },
                     "RPH": "20_1",
                     "Equipment":
                    {
                       "Value": "UNKNOWN_PLANE",
                       "AirEquipType": "7D3"
                    },
                     "DepartureDateTime": "2023-12-22T19:45:00",
                     "ArrivalDateTime": "2023-12-22T20:45:00",
                     "FlightNumber": "TK7257",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK7257",
                       "Value": "ANADOLUJET",
                       "Code": "AJ"
                    },
                     "JourneyDuration": "P0DT1H0M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": ".234567"
                          }
                        }
                      }
                    },
                     "RPH": "21_1",
                     "Equipment":
                    {
                       "Value": "BOEING B737-800",
                       "AirEquipType": "78D"
                    },
                     "DepartureDateTime": "2023-12-22T20:55:00",
                     "ArrivalDateTime": "2023-12-22T22:15:00",
                     "FlightNumber": "TK2179",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2179",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H20M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1234567"
                          }
                        }
                      }
                    },
                     "RPH": "22_1",
                     "Equipment":
                    {
                       "Value": "UNKNOWN_PLANE",
                       "AirEquipType": "77B"
                    },
                     "DepartureDateTime": "2023-12-22T20:45:00",
                     "ArrivalDateTime": "2023-12-22T22:05:00",
                     "FlightNumber": "TK2171",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2171",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H20M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "ScheduleValidStartDate": "2023-12-23",
                     "ScheduleValidEndDate": "2023-12-26",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": ".2...6."
                          }
                        }
                      }
                    },
                     "RPH": "23_1",
                     "Equipment":
                    {
                       "Value": "UNKNOWN_PLANE",
                       "AirEquipType": "N78"
                    },
                     "DepartureDateTime": "2023-12-23T08:55:00",
                     "ArrivalDateTime": "2023-12-23T10:15:00",
                     "FlightNumber": "TK2123",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2123",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H20M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "ScheduleValidStartDate": "2023-12-23",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "SAW"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1..4.67"
                          }
                        }
                      }
                    },
                     "RPH": "24_1",
                     "Equipment":
                    {
                       "Value": "UNKNOWN_PLANE",
                       "AirEquipType": "7D3"
                    },
                     "DepartureDateTime": "2023-12-23T12:00:00",
                     "ArrivalDateTime": "2023-12-23T13:00:00",
                     "FlightNumber": "TK7243",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK7243",
                       "Value": "ANADOLUJET",
                       "Code": "AJ"
                    },
                     "JourneyDuration": "P0DT1H0M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1234567"
                          }
                        }
                      }
                    },
                     "RPH": "25_1",
                     "Equipment":
                    {
                       "Value": "BOEING B737-900ER",
                       "AirEquipType": "79B"
                    },
                     "DepartureDateTime": "2023-12-22T06:35:00",
                     "ArrivalDateTime": "2023-12-22T07:50:00",
                     "FlightNumber": "TK2193",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2193",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H15M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "ScheduleValidStartDate": "2023-12-25",
                     "ScheduleValidEndDate": "2023-12-25",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "SAW"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1......"
                          }
                        }
                      }
                    },
                     "RPH": "26_1",
                     "Equipment":
                    {
                       "Value": "UNKNOWN_PLANE",
                       "AirEquipType": "7D3"
                    },
                     "DepartureDateTime": "2023-12-25T17:05:00",
                     "ArrivalDateTime": "2023-12-25T18:05:00",
                     "FlightNumber": "TK7253",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK7253",
                       "Value": "ANADOLUJET",
                       "Code": "AJ"
                    },
                     "JourneyDuration": "P0DT1H0M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "ScheduleValidStartDate": "2023-12-25",
                     "ScheduleValidEndDate": "2023-12-25",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1......"
                          }
                        }
                      }
                    },
                     "RPH": "27_1",
                     "Equipment":
                    {
                       "Value": "UNKNOWN_PLANE",
                       "AirEquipType": "N78"
                    },
                     "DepartureDateTime": "2023-12-25T20:55:00",
                     "ArrivalDateTime": "2023-12-25T22:15:00",
                     "FlightNumber": "TK2179",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2179",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H20M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1234567"
                          }
                        }
                      }
                    },
                     "RPH": "28_1",
                     "Equipment":
                    {
                       "Value": "BOEING B737-800",
                       "AirEquipType": "78D"
                    },
                     "DepartureDateTime": "2023-12-22T10:55:00",
                     "ArrivalDateTime": "2023-12-22T12:15:00",
                     "FlightNumber": "TK2135",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2135",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H20M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "ScheduleValidStartDate": "2023-12-23",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1234.67"
                          }
                        }
                      }
                    },
                     "RPH": "29_1",
                     "Equipment":
                    {
                       "Value": "UNKNOWN_PLANE",
                       "AirEquipType": "N78"
                    },
                     "DepartureDateTime": "2023-12-23T15:55:00",
                     "ArrivalDateTime": "2023-12-23T17:15:00",
                     "FlightNumber": "TK2153",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2153",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H20M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "ScheduleValidStartDate": "2023-12-26",
                     "ScheduleValidEndDate": "2023-12-27",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": ".23...."
                          }
                        }
                      }
                    },
                     "RPH": "30_1",
                     "Equipment":
                    {
                       "Value": "BOEING 737-800",
                       "AirEquipType": "738"
                    },
                     "DepartureDateTime": "2023-12-26T00:55:00",
                     "ArrivalDateTime": "2023-12-26T02:15:00",
                     "FlightNumber": "TK2185",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2185",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H20M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-22",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "SAW"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "....5.."
                          }
                        }
                      }
                    },
                     "RPH": "31_1",
                     "Equipment":
                    {
                       "Value": "UNKNOWN_PLANE",
                       "AirEquipType": "7D3"
                    },
                     "DepartureDateTime": "2023-12-22T11:45:00",
                     "ArrivalDateTime": "2023-12-22T12:45:00",
                     "FlightNumber": "TK7243",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK7243",
                       "Value": "ANADOLUJET",
                       "Code": "AJ"
                    },
                     "JourneyDuration": "P0DT1H0M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "ScheduleValidStartDate": "2023-12-26",
                     "ScheduleValidEndDate": "2023-12-26",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "SAW"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": ".2....."
                          }
                        }
                      }
                    },
                     "RPH": "32_1",
                     "Equipment":
                    {
                       "Value": "UNKNOWN_PLANE",
                       "AirEquipType": "7D3"
                    },
                     "DepartureDateTime": "2023-12-26T13:40:00",
                     "ArrivalDateTime": "2023-12-26T14:40:00",
                     "FlightNumber": "TK7247",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK7247",
                       "Value": "ANADOLUJET",
                       "Code": "AJ"
                    },
                     "JourneyDuration": "P0DT1H0M0.000S"
                  }
                },

                {
                   "FlightSegment":
                  {
                     "DepartureAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "ESB"
                    },
                     "ScheduleValidStartDate": "2023-12-22",
                     "ScheduleValidEndDate": "2023-12-28",
                     "ArrivalAirport":
                    {
                       "CodeContext": "IATA",
                       "LocationCode": "IST"
                    },
                     "MarketingAirline":
                    {
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "StopQuantity": "0",
                     "DaysOfOperation":
                    {
                       "OperationSchedule":
                      {
                         "OperationTimes":
                        {
                           "OperationTime":
                          {
                             "Text": "1234567"
                          }
                        }
                      }
                    },
                     "RPH": "33_1",
                     "Equipment":
                    {
                       "Value": "BOEING B737-800",
                       "AirEquipType": "78D"
                    },
                     "DepartureDateTime": "2023-12-22T04:20:00",
                     "ArrivalDateTime": "2023-12-22T05:45:00",
                     "FlightNumber": "TK2187",
                     "OperatingAirline":
                    {
                       "FlightNumber": "TK2187",
                       "Value": "TURKISH AIRLINES",
                       "Code": "TK"
                    },
                     "JourneyDuration": "P0DT1H25M0.000S"
                  }
                }
              ]
            },
             "Version": "0"
          }
        }
      ]
    }
  }
}


*/
