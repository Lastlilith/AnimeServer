package com.imnidasoftware.repository

import com.imnidasoftware.models.ApiResponse
import com.imnidasoftware.models.Hero

interface HeroRepositoryAlternative {

    val heroes: List<Hero>

    suspend fun getAllHeroes(page: Int = 1, limit: Int = 4): ApiResponse
    suspend fun searchHeroes(name: String?): ApiResponse
}