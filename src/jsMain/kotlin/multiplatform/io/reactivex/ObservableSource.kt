package multiplatform.io.reactivex

import multiplatform.io.reactivex.disposables.Disposable

actual interface ObservableSource<T> {
    actual fun subscribe(observer: Observer<in T>)
}

actual abstract class Observable<T> : ObservableSource<T> {
    actual fun startWith(t: T): Observable<T> {
        TODO("not implemented")
    }

    actual fun buffer(count: Int, skip: Int): Observable<List<T>> {
        TODO("not implemented")
    }

    actual fun <B> buffer(boundary: ObservableSource<B>): Observable<List<T>> {
        TODO("not implemented")
    }

    actual fun mergeWith(other: ObservableSource<out T>): Observable<T> {
        TODO("not implemented")
    }
}

actual inline fun <T> Observable<T>.filter(noinline predicate: (T) -> Boolean): Observable<T> {
    TODO("not implemented")
}

actual inline fun <T> Observable<T>.subscribe(noinline onNext: (T) -> Unit): Disposable {
    TODO("not implemented")
}

actual inline fun <T> Observable<T>.distinctUntilChanged(noinline comparer: (t1: T, t2: T) -> Boolean): Observable<T> {
    TODO("not implemented")
}

actual inline fun <T, R> Observable<T>.map(noinline mapper: (T) -> R): Observable<R> {
    TODO("not implemented")
}

actual inline fun <T, K> Observable<T>.groupBy(noinline keySelector: (T) -> K): Observable<GroupedObservable<K, T>> {
    TODO("not implemented")
}

actual inline fun <T, R> Observable<T>.flatMap(noinline mapper: (T) -> ObservableSource<out R>): Observable<R> {
    TODO("not implemented")
}

actual inline fun <T> Observable<T>.scan(noinline accumulator: (t1: T, t2: T) -> T): Observable<T> {
    TODO("not implemented")
}

actual inline fun <T, U> Observable<T>.flatMapIterable(noinline mapper: (t: T) -> Iterable<U>): Observable<U> {
    TODO("not implemented")
}

actual fun <T, U> Observable<T>.withLatestFrom(other: ObservableSource<U>): Observable<Pair<T, U>> {
    TODO("not implemented")
}

actual interface Observer<T> {
    actual fun onNext(t: T)
    actual fun onComplete()
}

actual abstract class GroupedObservable<K, T> : Observable<T>()

actual fun <T, U, R> Observable<T>.withLatestFrom(other: ObservableSource<out U>, combiner: (t: T, u: U) -> R): Observable<R> {
    TODO("not implemented")
}