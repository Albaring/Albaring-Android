package kr.teams.android.domain.repository

import kotlinx.coroutines.flow.Flow
import kr.teams.android.domain.model.HomeCardModel
import androidx.paging.PagingData

interface HomeCardRepository {
    fun getPagedItems(): Flow<PagingData<HomeCardModel>>
}