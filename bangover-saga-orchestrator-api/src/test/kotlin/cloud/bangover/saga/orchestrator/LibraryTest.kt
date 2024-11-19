package cloud.bangover.saga.orchestrator

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class LibraryTest : FunSpec() {
    init {
        context("Тестирование библиотеки") {
            test("Простая проверка") {
                val library = Library()
                library.someLibraryMethod() shouldBe true
            }
        }
    }
}
