package ru.gb.android.homework3.presentation.promo.di

import dagger.Component
import ru.gb.android.homework3.di.FragmentScope
import ru.gb.android.homework3.presentation.promo.PromoListFragment

@FragmentScope
//@Subcomponent
@Component(
  dependencies =[PromoDependencies::class]
)
interface PromoListComponent {
  // @Subcomponent.Factory
    @Component.Factory
    interface Factory{
        fun create(promoDependencies:PromoDependencies): PromoListComponent
    }
    fun inject(fragment: PromoListFragment)
}