@file:Suppress("NOTHING_TO_INLINE")

package multiplatform.io.reactivex

import io.reactivex.disposables.Disposable
import io.reactivex.rxkotlin.withLatestFrom

actual typealias ObservableSource<T> = io.reactivex.ObservableSource<T>

actual typealias Observable<T> = io.reactivex.Observable<T>

actual typealias Observer<T> = io.reactivex.Observer<T>

actual typealias GroupedObservable<K, T> = io.reactivex.observables.GroupedObservable<K, T>

actual inline fun <T> Observable<T>.filter(noinline predicate: (T) -> Boolean): Observable<T> = filter(predicate)

actual inline fun <T> Observable<T>.subscribe(noinline onNext: (T) -> Unit): Disposable = subscribe(onNext)


actual inline fun <T, K> Observable<T>.groupBy(noinline keySelector: (T) -> K): Observable<GroupedObservable<K, T>> = groupBy(keySelector)

actual inline fun <T, R> Observable<T>.flatMap(noinline mapper: (T) -> ObservableSource<out R>): Observable<R> = flatMap(mapper)

actual inline fun <T> Observable<T>.distinctUntilChanged(noinline comparer: (t1: T, t2: T) -> Boolean): Observable<T> = distinctUntilChanged(comparer)

actual inline fun <T, R> Observable<T>.map(noinline mapper: (T) -> R): Observable<R> = map(mapper)

actual inline fun <T> Observable<T>.scan(noinline accumulator: (t1: T, t2: T) -> T): Observable<T> = scan(accumulator)

actual inline fun <T, U> Observable<T>.flatMapIterable(noinline mapper: (t: T) -> Iterable<U>): Observable<U> = flatMapIterable(mapper)

actual fun <T, U> Observable<T>.withLatestFrom(other: ObservableSource<U>): Observable<Pair<T, U>> = withLatestFrom(other)

actual fun <T, U, R> Observable<T>.withLatestFrom(other: ObservableSource<out U>, combiner: (t: T, u: U) -> R): Observable<R> = withLatestFrom(other, combiner)