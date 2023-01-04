package com.imnidasoftware.di

import com.imnidasoftware.repository.HeroRepository
import com.imnidasoftware.repository.HeroRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }
}