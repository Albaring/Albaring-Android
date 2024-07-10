package kr.teams.android.domain.usecase

import androidx.paging.PagingData
import kotlinx.coroutines.flow.Flow
import kr.teams.android.domain.model.HomeCardModel
import kr.teams.android.domain.repository.HomeCardRepository
import javax.inject.Inject

class GetPagedHomeCardsUseCase @Inject constructor(
    private val repository: HomeCardRepository,
) {
    operator fun invoke(): Flow<PagingData<HomeCardModel>> = repository.getPagedItems()
}