package multiplatform.io.reactivex

import multiplatform.io.reactivex.disposables.Disposable

expect interface ObservableSource<T> {
    fun subscribe(observer: Observer<in T>)
}

expect interface Emitter<T> {
    fun onNext(value: T)
     fun onError(error: Throwable)
     fun onComplete()
}

expect interface ObservableEmitter<T> : Emitter<T> {
    fun setDisposable(d: Disposable?)
//    fun setCancellable(c: Cancellable?)
    fun isDisposed(): Boolean
    fun serialize(): ObservableEmitter<T>
    fun tryOnError(t: Throwable): Boolean
}

expect val <T> ObservableEmitter<T>.isDisposed: Boolean


expect object Observables {
    fun <T> create(emitter: (ObservableEmitter<T>) -> Unit): Observable<T>
}

expect abstract class Observable<T> : ObservableSource<T> {
    fun startWith(t: T): Observable<T>
    fun buffer(count: Int, skip: Int): Observable<List<T>>
    fun <B> buffer(boundary: ObservableSource<B>): Observable<List<T>>
    fun mergeWith(other: ObservableSource<out T>): Observable<T>
}

expect inline fun<T> Observable<T>.filter(noinline predicate: (T) -> Boolean): Observable<T>

expect inline fun<T> Observable<T>.subscribe(noinline onNext: (T) -> Unit): Disposable

expect inline fun<T> Observable<T>.distinctUntilChanged(noinline comparer: (t1: T, t2: T) -> Boolean): Observable<T>

expect inline fun<T, R> Observable<T>.map(noinline mapper: (T) -> R): Observable<R>

expect inline fun<T, K> Observable<T>.groupBy(noinline keySelector: (T) -> K): Observable<GroupedObservable<K, T>>

expect inline fun<T, R> Observable<T>.flatMap(noinline mapper: (T) -> ObservableSource<out R>): Observable<R>

expect inline fun<T> Observable<T>.scan(noinline accumulator: (t1: T, t2: T) -> T): Observable<T>

expect inline fun <T, U> Observable<T>.flatMapIterable(noinline mapper: (t: T) -> Iterable<U>): Observable<U>

expect fun <T, U> Observable<T>.withLatestFrom(other: ObservableSource<U>): Observable<Pair<T, U>>

expect fun <T, U, R> Observable<T>.withLatestFrom(other: ObservableSource<out U>, combiner: (t: T, u: U) -> R): Observable<R>

expect interface Observer<T> {
    fun onNext(t: T)
    fun onComplete()
    fun onError(e: Throwable)
}

expect abstract class GroupedObservable<K, T>: Observable<T>


