package com.ibrahimcanerdogan.turkishairlinesassistant.view.dependencyinjection

import com.ibrahimcanerdogan.turkishairlinesassistant.data.remote.APIService
import com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.available.AvailableFlightsDataSource
import com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.available.AvailableFlightsDataSourceImpl
import com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.calculate.flight.CalculateFlightMilesDataSource
import com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.calculate.flight.CalculateFlightMilesDataSourceImpl
import com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.port.PortDataSource
import com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.port.PortDataSourceImpl
import com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.reservation.ReservationDataSource
import com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.reservation.ReservationDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteDataModule {

    @Singleton
    @Provides
    fun provideCalculateDataSource(
        apiService: APIService
    ) : CalculateFlightMilesDataSource {
        return CalculateFlightMilesDataSourceImpl(apiService)
    }

    @Singleton
    @Provides
    fun providePortDataSource(
        apiService: APIService
    ) : PortDataSource {
        return PortDataSourceImpl(apiService)
    }

    @Singleton
    @Provides
    fun provideReservationDataSource(
        apiService: APIService
    ) : ReservationDataSource {
        return ReservationDataSourceImpl(apiService)
    }

    @Singleton
    @Provides
    fun provideAvailableFlightsDataSource(
        apiService: APIService
    ) : AvailableFlightsDataSource {
        return AvailableFlightsDataSourceImpl(apiService)
    }
}