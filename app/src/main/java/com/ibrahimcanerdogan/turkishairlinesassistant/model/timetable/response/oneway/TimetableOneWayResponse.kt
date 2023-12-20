package com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.oneway

import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.Message

data class TimetableOneWayResponse(
    val data: TimetableOneWayData,
    val message: Message,
    val requestId: String,
    val status: String
)

/*

{
   "status": "SUCCESS",
   "requestId": "000001862bae6e97-1153e3a1f",
   "message":
  {
     "code": "TK-0000",
     "description": "Request Processed Successfully."
  },
   "data":
  {
     "timeTableOTAResponse":
    {
       "extendedOTAAirScheduleRS":
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
                 "totalDuration": "P0Y0M0DT1H15M0S",
                 "flightDuration": "P0Y0M0DT1H15M0S",
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
                 "totalDuration": "P0Y0M0DT1H10M0S",
                 "flightDuration": "P0Y0M0DT1H10M0S",
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
                 "totalDuration": "P0Y0M0DT1H10M0S",
                 "flightDuration": "P0Y0M0DT1H10M0S",
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
                 "totalDuration": "P0Y0M0DT1H15M0S",
                 "flightDuration": "P0Y0M0DT1H15M0S",
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
                 "totalDuration": "P0Y0M0DT1H10M0S",
                 "flightDuration": "P0Y0M0DT1H10M0S",
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
                 "totalDuration": "P0Y0M0DT1H15M0S",
                 "flightDuration": "P0Y0M0DT1H15M0S",
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
                 "totalDuration": "P0Y0M0DT1H10M0S",
                 "flightDuration": "P0Y0M0DT1H10M0S",
                 "RPH": "17_1",
                 "transferDuration": "P0Y0M0DT0H0M0S"
              },

              {
                 "totalDuration": "P0Y0M0DT1H10M0S",
                 "flightDuration": "P0Y0M0DT1H10M0S",
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
                 "totalDuration": "P0Y0M0DT1H0M0S",
                 "flightDuration": "P0Y0M0DT1H0M0S",
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
                 "totalDuration": "P0Y0M0DT1H15M0S",
                 "flightDuration": "P0Y0M0DT1H15M0S",
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
                 "totalDuration": "P0Y0M0DT1H15M0S",
                 "flightDuration": "P0Y0M0DT1H15M0S",
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
                 "totalDuration": "P0Y0M0DT1H0M0S",
                 "flightDuration": "P0Y0M0DT1H0M0S",
                 "RPH": "27_1",
                 "transferDuration": "P0Y0M0DT0H0M0S"
              },

              {
                 "totalDuration": "P0Y0M0DT1H10M0S",
                 "flightDuration": "P0Y0M0DT1H10M0S",
                 "RPH": "28_1",
                 "transferDuration": "P0Y0M0DT0H0M0S"
              },

              {
                 "totalDuration": "P0Y0M0DT1H10M0S",
                 "flightDuration": "P0Y0M0DT1H10M0S",
                 "RPH": "29_1",
                 "transferDuration": "P0Y0M0DT0H0M0S"
              },

              {
                 "totalDuration": "P0Y0M0DT1H10M0S",
                 "flightDuration": "P0Y0M0DT1H10M0S",
                 "RPH": "30_1",
                 "transferDuration": "P0Y0M0DT0H0M0S"
              },

              {
                 "totalDuration": "P0Y0M0DT1H10M0S",
                 "flightDuration": "P0Y0M0DT1H10M0S",
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
                 "totalDuration": "P0Y0M0DT1H0M0S",
                 "flightDuration": "P0Y0M0DT1H0M0S",
                 "RPH": "33_1",
                 "transferDuration": "P0Y0M0DT0H0M0S"
              },

              {
                 "totalDuration": "P0Y0M0DT1H0M0S",
                 "flightDuration": "P0Y0M0DT1H0M0S",
                 "RPH": "34_1",
                 "transferDuration": "P0Y0M0DT0H0M0S"
              },

              {
                 "totalDuration": "P0Y0M0DT1H10M0S",
                 "flightDuration": "P0Y0M0DT1H10M0S",
                 "RPH": "35_1",
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
                   "ScheduleValidStartDate": "2023-12-26",
                   "ScheduleValidEndDate": "2023-12-31",
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
                   "DepartureDateTime": "2023-12-26T10:00:00",
                   "ArrivalDateTime": "2023-12-26T11:10:00",
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
                   "ScheduleValidStartDate": "2023-12-30",
                   "ScheduleValidEndDate": "2023-12-30",
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
                           "Text": ".....6."
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
                   "DepartureDateTime": "2023-12-30T02:15:00",
                   "ArrivalDateTime": "2023-12-30T03:30:00",
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
                   "RPH": "2_1",
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
                   "ScheduleValidStartDate": "2023-12-25",
                   "ScheduleValidEndDate": "2023-12-31",
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
                   "RPH": "3_1",
                   "Equipment":
                  {
                     "Value": "UNKNOWN_PLANE",
                     "AirEquipType": "R32"
                  },
                   "DepartureDateTime": "2023-12-25T15:00:00",
                   "ArrivalDateTime": "2023-12-25T16:10:00",
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
                   "RPH": "4_1",
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
                     "LocationCode": "SAW"
                  },
                   "ScheduleValidStartDate": "2023-12-25",
                   "ScheduleValidEndDate": "2023-12-31",
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
                   "DepartureDateTime": "2023-12-25T18:00:00",
                   "ArrivalDateTime": "2023-12-25T19:00:00",
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
                     "LocationCode": "IST"
                  },
                   "ScheduleValidStartDate": "2023-12-26",
                   "ScheduleValidEndDate": "2023-12-31",
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
                   "RPH": "6_1",
                   "Equipment":
                  {
                     "Value": "BOEING B737-800",
                     "AirEquipType": "78D"
                  },
                   "DepartureDateTime": "2023-12-26T19:00:00",
                   "ArrivalDateTime": "2023-12-26T20:10:00",
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
                   "ScheduleValidStartDate": "2023-12-29",
                   "ScheduleValidEndDate": "2023-12-31",
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
                   "RPH": "7_1",
                   "Equipment":
                  {
                     "Value": "UNKNOWN_PLANE",
                     "AirEquipType": "7D3"
                  },
                   "DepartureDateTime": "2023-12-29T14:20:00",
                   "ArrivalDateTime": "2023-12-29T15:20:00",
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
                   "ScheduleValidStartDate": "2023-12-29",
                   "ScheduleValidEndDate": "2023-12-29",
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
                   "RPH": "8_1",
                   "Equipment":
                  {
                     "Value": "BOEING B737-800",
                     "AirEquipType": "78D"
                  },
                   "DepartureDateTime": "2023-12-29T07:30:00",
                   "ArrivalDateTime": "2023-12-29T08:40:00",
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
                   "ScheduleValidStartDate": "2023-12-25",
                   "ScheduleValidEndDate": "2023-12-31",
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
                   "RPH": "9_1",
                   "Equipment":
                  {
                     "Value": "BOEING B737-800",
                     "AirEquipType": "78D"
                  },
                   "DepartureDateTime": "2023-12-25T12:00:00",
                   "ArrivalDateTime": "2023-12-25T13:10:00",
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
                   "RPH": "10_1",
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
                   "ScheduleValidStartDate": "2023-12-25",
                   "ScheduleValidEndDate": "2023-12-31",
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
                   "RPH": "11_1",
                   "Equipment":
                  {
                     "Value": "BOEING B737-800",
                     "AirEquipType": "78D"
                  },
                   "DepartureDateTime": "2023-12-25T16:00:00",
                   "ArrivalDateTime": "2023-12-25T17:10:00",
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
                   "ScheduleValidStartDate": "2023-12-31",
                   "ScheduleValidEndDate": "2023-12-31",
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
                           "Text": "......7"
                        }
                      }
                    }
                  },
                   "RPH": "12_1",
                   "Equipment":
                  {
                     "Value": "BOEING B737-800",
                     "AirEquipType": "78D"
                  },
                   "DepartureDateTime": "2023-12-31T09:20:00",
                   "ArrivalDateTime": "2023-12-31T10:30:00",
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
                   "ScheduleValidStartDate": "2023-12-25",
                   "ScheduleValidEndDate": "2023-12-31",
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
                   "RPH": "13_1",
                   "Equipment":
                  {
                     "Value": "BOEING B737-800",
                     "AirEquipType": "78D"
                  },
                   "DepartureDateTime": "2023-12-25T21:00:00",
                   "ArrivalDateTime": "2023-12-25T22:10:00",
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
                   "ScheduleValidStartDate": "2023-12-25",
                   "ScheduleValidEndDate": "2023-12-31",
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
                   "RPH": "14_1",
                   "Equipment":
                  {
                     "Value": "AIRBUS A321-231",
                     "AirEquipType": "32R"
                  },
                   "DepartureDateTime": "2023-12-25T13:00:00",
                   "ArrivalDateTime": "2023-12-25T14:10:00",
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
                   "ScheduleValidStartDate": "2023-12-25",
                   "ScheduleValidEndDate": "2023-12-29",
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
                   "RPH": "15_1",
                   "Equipment":
                  {
                     "Value": "AIRBUS A319-100",
                     "AirEquipType": "316"
                  },
                   "DepartureDateTime": "2023-12-25T11:00:00",
                   "ArrivalDateTime": "2023-12-25T12:15:00",
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
                   "RPH": "16_1",
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
                   "ScheduleValidStartDate": "2023-12-25",
                   "ScheduleValidEndDate": "2023-12-30",
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
                           "Text": "123456."
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
                   "DepartureDateTime": "2023-12-25T09:00:00",
                   "ArrivalDateTime": "2023-12-25T10:10:00",
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
                   "ScheduleValidStartDate": "2023-12-25",
                   "ScheduleValidEndDate": "2023-12-31",
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
                     "Value": "BOEING B737-800",
                     "AirEquipType": "78D"
                  },
                   "DepartureDateTime": "2023-12-25T23:00:00",
                   "ArrivalDateTime": "2023-12-26T00:10:00",
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
                   "ScheduleValidStartDate": "2023-12-29",
                   "ScheduleValidEndDate": "2023-12-29",
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
                   "RPH": "19_1",
                   "Equipment":
                  {
                     "Value": "BOEING B737-800",
                     "AirEquipType": "78D"
                  },
                   "DepartureDateTime": "2023-12-29T14:00:00",
                   "ArrivalDateTime": "2023-12-29T15:10:00",
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
                   "ScheduleValidStartDate": "2023-12-25",
                   "ScheduleValidEndDate": "2023-12-31",
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
                           "Text": "1..45.7"
                        }
                      }
                    }
                  },
                   "RPH": "20_1",
                   "Equipment":
                  {
                     "Value": "BOEING B737-800",
                     "AirEquipType": "78D"
                  },
                   "DepartureDateTime": "2023-12-25T01:00:00",
                   "ArrivalDateTime": "2023-12-25T02:15:00",
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
                   "ScheduleValidStartDate": "2023-12-25",
                   "ScheduleValidEndDate": "2023-12-31",
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
                     "AirEquipType": "7D3"
                  },
                   "DepartureDateTime": "2023-12-25T06:40:00",
                   "ArrivalDateTime": "2023-12-25T07:40:00",
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
                   "ScheduleValidStartDate": "2023-12-25",
                   "ScheduleValidEndDate": "2023-12-31",
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
                   "RPH": "22_1",
                   "Equipment":
                  {
                     "Value": "UNKNOWN_PLANE",
                     "AirEquipType": "77B"
                  },
                   "DepartureDateTime": "2023-12-25T08:00:00",
                   "ArrivalDateTime": "2023-12-25T09:10:00",
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
                   "RPH": "23_1",
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
                   "ScheduleValidStartDate": "2023-12-25",
                   "ScheduleValidEndDate": "2023-12-31",
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
                   "RPH": "24_1",
                   "Equipment":
                  {
                     "Value": "UNKNOWN_PLANE",
                     "AirEquipType": "N78"
                  },
                   "DepartureDateTime": "2023-12-25T14:00:00",
                   "ArrivalDateTime": "2023-12-25T15:10:00",
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
                   "ScheduleValidStartDate": "2023-12-25",
                   "ScheduleValidEndDate": "2023-12-31",
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
                   "RPH": "25_1",
                   "Equipment":
                  {
                     "Value": "UNKNOWN_PLANE",
                     "AirEquipType": "77B"
                  },
                   "DepartureDateTime": "2023-12-25T18:00:00",
                   "ArrivalDateTime": "2023-12-25T19:15:00",
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
                   "ScheduleValidStartDate": "2023-12-30",
                   "ScheduleValidEndDate": "2023-12-30",
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
                           "Text": ".....6."
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
                   "DepartureDateTime": "2023-12-30T02:20:00",
                   "ArrivalDateTime": "2023-12-30T03:30:00",
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
                     "LocationCode": "SAW"
                  },
                   "ScheduleValidStartDate": "2023-12-25",
                   "ScheduleValidEndDate": "2023-12-31",
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
                   "RPH": "27_1",
                   "Equipment":
                  {
                     "Value": "UNKNOWN_PLANE",
                     "AirEquipType": "7D3"
                  },
                   "DepartureDateTime": "2023-12-25T20:35:00",
                   "ArrivalDateTime": "2023-12-25T21:35:00",
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
                   "ScheduleValidStartDate": "2023-12-26",
                   "ScheduleValidEndDate": "2023-12-30",
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
                   "RPH": "28_1",
                   "Equipment":
                  {
                     "Value": "UNKNOWN_PLANE",
                     "AirEquipType": "N78"
                  },
                   "DepartureDateTime": "2023-12-26T07:00:00",
                   "ArrivalDateTime": "2023-12-26T08:10:00",
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
                   "ScheduleValidStartDate": "2023-12-25",
                   "ScheduleValidEndDate": "2023-12-31",
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
                           "Text": "1.3...7"
                        }
                      }
                    }
                  },
                   "RPH": "29_1",
                   "Equipment":
                  {
                     "Value": "BOEING B737-800",
                     "AirEquipType": "78D"
                  },
                   "DepartureDateTime": "2023-12-25T07:00:00",
                   "ArrivalDateTime": "2023-12-25T08:10:00",
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
                   "ScheduleValidStartDate": "2023-12-25",
                   "ScheduleValidEndDate": "2023-12-31",
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
                           "Text": "123.5.7"
                        }
                      }
                    }
                  },
                   "RPH": "30_1",
                   "Equipment":
                  {
                     "Value": "BOEING B737-900ER",
                     "AirEquipType": "79B"
                  },
                   "DepartureDateTime": "2023-12-25T02:00:00",
                   "ArrivalDateTime": "2023-12-25T03:10:00",
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
                   "RPH": "31_1",
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
                   "RPH": "32_1",
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
                   "ScheduleValidStartDate": "2023-12-26",
                   "ScheduleValidEndDate": "2023-12-30",
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
                   "RPH": "33_1",
                   "Equipment":
                  {
                     "Value": "UNKNOWN_PLANE",
                     "AirEquipType": "7D3"
                  },
                   "DepartureDateTime": "2023-12-26T13:50:00",
                   "ArrivalDateTime": "2023-12-26T14:50:00",
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
                   "ScheduleValidStartDate": "2023-12-25",
                   "ScheduleValidEndDate": "2023-12-31",
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
                   "RPH": "34_1",
                   "Equipment":
                  {
                     "Value": "UNKNOWN_PLANE",
                     "AirEquipType": "7D3"
                  },
                   "DepartureDateTime": "2023-12-25T10:05:00",
                   "ArrivalDateTime": "2023-12-25T11:05:00",
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
                   "RPH": "35_1",
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
      }
    }
  }
}

*/