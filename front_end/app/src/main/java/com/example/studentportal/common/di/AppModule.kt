package com.example.studentportal.common.di

import com.example.studentportal.common.service.serviceModule
import com.example.studentportal.home.service.repository.CourseRepository
import com.example.studentportal.notifications.service.repository.NotificationRepository
import org.koin.core.Koin
import org.koin.core.context.GlobalContext
import org.koin.dsl.module

val appModule = module {
    includes(serviceModule)
    includes(NotificationRepository.koinModule())
    includes(CourseRepository.koinModule())
}

val koin: Koin
    get() = GlobalContext.get()
