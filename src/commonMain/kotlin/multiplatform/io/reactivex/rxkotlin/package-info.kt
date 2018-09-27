package multiplatform.io.reactivex.rxkotlin

import multiplatform.io.reactivex.Observable

expect object Observables {
    fun <T1,T2> combineLatest(source1: Observable<T1>, source2: Observable<T2>): Observable<Pair<T1, T2>>
    inline fun <T1,T2,R> combineLatest(source1: Observable<T1>, source2: Observable<T2>, crossinline combineFunction: (T1, T2) -> R) : Observable<R>

}
