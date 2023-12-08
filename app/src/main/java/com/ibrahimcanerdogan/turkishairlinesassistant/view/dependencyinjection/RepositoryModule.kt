package com.ibrahimcanerdogan.turkishairlinesassistant.view.dependencyinjection

import com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.calculate.flight.CalculateFlightMilesDataSource
import com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.calculate.flight.CalculateFlightMilesRepositoryImpl
import com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.port.PortDataSource
import com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.port.PortRepositoryImpl
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.repository.CalculateRepository
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.repository.PortRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideCalculateRepository(
        calculateFlightMilesDataSource: CalculateFlightMilesDataSource
    ) : CalculateRepository {
        return CalculateFlightMilesRepositoryImpl(calculateFlightMilesDataSource)
    }

    @Singleton
    @Provides
    fun providePortRepository(
        portDataSource: PortDataSource
    ) : PortRepository {
        return PortRepositoryImpl(portDataSource)
    }
}