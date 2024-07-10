package kr.teams.android.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import kotlinx.coroutines.flow.Flow
import kr.teams.android.data.source.HomeCardPagingSource
import kr.teams.android.domain.model.HomeCardModel
import kr.teams.android.domain.repository.HomeCardRepository
import javax.inject.Inject

class HomeCardRepositoryImpl @Inject constructor(
    private val pagingSource: HomeCardPagingSource,
) : HomeCardRepository {
    override fun getPagedItems(): Flow<PagingData<HomeCardModel>> {
        return Pager(PagingConfig(pageSize = 20)) { pagingSource }.flow
    }
}