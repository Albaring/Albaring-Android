package kr.teams.android.data.source

import androidx.paging.PagingSource
import androidx.paging.PagingState
import kr.teams.android.domain.model.HomeCardModel
import javax.inject.Inject

class HomeCardPagingSource @Inject constructor() : PagingSource<Int, HomeCardModel>() {

    private val totalItems = 4 // 총 항목 수를 4개로 제한

    override fun getRefreshKey(state: PagingState<Int, HomeCardModel>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, HomeCardModel> {
        try {
            val page = params.key ?: 1
            val startingIndex = (page - 1) * params.loadSize
            val itemsToLoad = minOf(params.loadSize, totalItems - startingIndex)

            if (startingIndex >= totalItems) {
                LoadResult.Page(
                    data = emptyList(),
                    prevKey = if (page > 1) page - 1 else null,
                    nextKey = null // 더 이상 로드할 항목이 없음
                )
            }

            // 더미
            val items = List(itemsToLoad) { index ->
                HomeCardModel(
                    id = startingIndex + index + 1,
                    title = "어떻게 하면 사회생활 잘하는 알바생이 될 수 있을까요?"
                )
            }

            return LoadResult.Page(
                data = items,
                prevKey = if (page > 1) page - 1 else null,
                nextKey = if (startingIndex + itemsToLoad < totalItems) page + 1 else null
            )
        } catch (e: Exception) {
            return LoadResult.Error(e)
        }
    }

}