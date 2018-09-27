package multiplatform.io.reactivex.disposables

expect interface Disposable {
    fun isDisposed(): Boolean
    fun dispose()
}

expect class CompositeDisposable(vararg resources: Disposable) : Disposable
