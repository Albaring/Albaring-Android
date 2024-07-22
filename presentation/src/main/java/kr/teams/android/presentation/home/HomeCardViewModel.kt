package kr.teams.android.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import dagger.hilt.android.lifecycle.HiltViewModel
import kr.teams.android.domain.usecase.GetPagedHomeCardsUseCase
import javax.inject.Inject

@HiltViewModel
class HomeCardViewModel @Inject constructor(
    private val getPagedHomeCardsUseCase: GetPagedHomeCardsUseCase,
) : ViewModel() {
    val items = getPagedHomeCardsUseCase().cachedIn(viewModelScope)
}
