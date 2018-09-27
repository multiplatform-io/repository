package multiplatform.io.reactivex.subjects

import multiplatform.io.reactivex.Observable
import multiplatform.io.reactivex.Observer

expect abstract class Subject<T> : Observer<T>, Observable<T>

expect class BehaviorSubject<T> : Subject<T>

expect val<T> Subject<T>.value: T?

expect class PublishSubject<T> : Subject<T>

expect object Subjects {
    fun <T> createBehaviorSubject(): BehaviorSubject<T>

    fun <T> createBehaviorSubject(defaultValue: T): BehaviorSubject<T>

    fun <T> createPublishSubject(): PublishSubject<T>

}