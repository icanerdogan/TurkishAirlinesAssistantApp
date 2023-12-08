package com.ibrahimcanerdogan.turkishairlinesassistant.view.dependencyinjection

import com.ibrahimcanerdogan.turkishairlinesassistant.data.remote.APIService
import com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.calculate.flight.CalculateFlightMilesDataSource
import com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.calculate.flight.CalculateFlightMilesDataSourceImpl
import com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.port.PortDataSource
import com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.port.PortDataSourceImpl
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
}