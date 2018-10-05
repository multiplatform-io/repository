package multiplatform.io.reactivex.subjects

import io.reactivex.subjects.PublishSubject

actual typealias Subject<T> = io.reactivex.subjects.Subject<T>

actual typealias BehaviorSubject<T> = io.reactivex.subjects.BehaviorSubject<T>

actual typealias PublishSubject<T> = io.reactivex.subjects.PublishSubject<T>

actual object Subjects {
    actual fun <T> createBehaviorSubject() = BehaviorSubject.create<T>()
    actual fun <T> createBehaviorSubject(defaultValue: T) = BehaviorSubject.createDefault(defaultValue)
    actual fun <T> createPublishSubject() = PublishSubject.create<T>()
}

actual val <T> Subject<T>.value: T?
    get() = value