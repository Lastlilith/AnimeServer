package com.imnidasoftware.di

import com.imnidasoftware.repository.HeroRepository
import com.imnidasoftware.repository.HeroRepositoryAlternative
import com.imnidasoftware.repository.HeroRepositoryImpl
import com.imnidasoftware.repository.HeroRepositoryImplAlt
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }

    single<HeroRepositoryAlternative> {
        HeroRepositoryImplAlt()
    }
}