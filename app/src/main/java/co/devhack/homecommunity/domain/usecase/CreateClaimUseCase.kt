package co.devhack.homecommunity.domain.usecase

import co.devhack.homecommunity.domain.model.Claim
import co.devhack.homecommunity.domain.repository.IClaimRepository
import io.reactivex.Observable
import io.reactivex.Scheduler

class CreateClaimUseCase(executorThread: Scheduler,
                         uiThread: Scheduler,
                         private val claimRepository: IClaimRepository) :
        UseCase<Int>(executorThread, uiThread) {


    override fun createObservable(): Observable<Int> {
        return claimRepository.add(this.claim)
    }

    lateinit var claim: Claim


}