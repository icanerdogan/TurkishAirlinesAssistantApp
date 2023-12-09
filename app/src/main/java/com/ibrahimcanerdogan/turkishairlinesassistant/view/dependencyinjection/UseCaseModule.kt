package com.ibrahimcanerdogan.turkishairlinesassistant.view.dependencyinjection

import com.ibrahimcanerdogan.turkishairlinesassistant.domain.repository.CalculateRepository
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.repository.PortRepository
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase.PostCalculateFlightMilesUseCase
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase.PostPortUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Singleton
    @Provides
    fun providePostCalculateFlightUseCase(
        calculateRepository: CalculateRepository
    ) : PostCalculateFlightMilesUseCase {
        return PostCalculateFlightMilesUseCase(calculateRepository)
    }

    @Singleton
    @Provides
    fun providePostPortUseCase(
        portRepository: PortRepository
    ) : PostPortUseCase {
        return PostPortUseCase(portRepository)
    }
}