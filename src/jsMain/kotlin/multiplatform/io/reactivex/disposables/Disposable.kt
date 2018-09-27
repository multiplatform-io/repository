package multiplatform.io.reactivex.disposables

actual interface Disposable {
    actual fun isDisposed(): Boolean
    actual fun dispose()
}

actual class CompositeDisposable actual constructor(vararg resources: Disposable) : Disposable {
    override fun isDisposed(): Boolean {
        TODO("not implemented")
    }

    override fun dispose() {
        TODO("not implemented")
    }
}