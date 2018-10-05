package multiplatform.io.reactivex.subjects

import multiplatform.io.reactivex.Observable
import multiplatform.io.reactivex.Observer

actual abstract class Subject<T> : Observer<T>, Observable<T>()

actual class BehaviorSubject<T> : Subject<T>() {
    override fun onError(e: Throwable) {
        TODO("not implemented")
    }

    override fun subscribe(observer: Observer<in T>) {
        TODO("not implemented")
    }

    override fun onNext(t: T) {
        TODO("not implemented")
    }

    override fun onComplete() {
        TODO("not implemented")
    }
}

actual val <T> Subject<T>.value: T?
    get() = TODO("not implemented")

actual class PublishSubject<T> : Subject<T>() {
    override fun onError(e: Throwable) {
        TODO("not implemented")
    }

    override fun subscribe(observer: Observer<in T>) {
        TODO("not implemented")
    }

    override fun onNext(t: T) {
        TODO("not implemented")
    }

    override fun onComplete() {
        TODO("not implemented")
    }
}

actual object Subjects {
    actual fun <T> createBehaviorSubject(): BehaviorSubject<T> {
        TODO("not implemented")
    }

    actual fun <T> createBehaviorSubject(defaultValue: T): BehaviorSubject<T> {
        TODO("not implemented")
    }

    actual fun <T> createPublishSubject(): PublishSubject<T> {
        TODO("not implemented")
    }

}