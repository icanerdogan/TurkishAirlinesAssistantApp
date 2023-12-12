package com.ibrahimcanerdogan.turkishairlinesassistant.view.dependencyinjection

import com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase.PostAvailableFlightsUseCase
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase.PostCalculateFlightMilesUseCase
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase.PostPortUseCase
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase.PostReservationUseCase
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase.PostTimetableUseCase
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.available.AvailableFlightsViewModelFactory
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.calculate.CalculateViewModelFactory
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.port.PortViewModelFactory
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.reservation.ReservationViewModelFactory
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.timetable.TimetableViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ViewModelFactoryModule {

    @Singleton
    @Provides
    fun provideCalculateViewModelFactory(
        postCalculateFlightMilesUseCase: PostCalculateFlightMilesUseCase
    ) : CalculateViewModelFactory {
        return CalculateViewModelFactory(postCalculateFlightMilesUseCase)
    }

    @Singleton
    @Provides
    fun providePortViewModelFactory(
        postPortUseCase: PostPortUseCase
    ) : PortViewModelFactory {
        return PortViewModelFactory(postPortUseCase)
    }

    @Singleton
    @Provides
    fun provideReservationViewModelFactory(
        postReservationUseCase: PostReservationUseCase
    ) : ReservationViewModelFactory {
        return ReservationViewModelFactory(postReservationUseCase)
    }

    @Singleton
    @Provides
    fun provideAvailableFlightsViewModelFactory(
        postAvailableFlightsUseCase: PostAvailableFlightsUseCase
    ) : AvailableFlightsViewModelFactory {
        return AvailableFlightsViewModelFactory(postAvailableFlightsUseCase)
    }

    @Singleton
    @Provides
    fun provideTimetableViewModelFactory(
        postTimetableUseCase: PostTimetableUseCase
    ) : TimetableViewModelFactory {
        return TimetableViewModelFactory(postTimetableUseCase)
    }
}