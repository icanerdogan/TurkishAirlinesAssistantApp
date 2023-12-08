package com.ibrahimcanerdogan.turkishairlinesassistant.view.dependencyinjection

import com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.calculate.flight.CalculateFlightMilesDataSource
import com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.calculate.flight.CalculateFlightMilesRepositoryImpl
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.repository.CalculateRepository
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
}