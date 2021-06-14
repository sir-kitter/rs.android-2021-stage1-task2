package subtask3

import kotlin.reflect.KClass
import java.time.LocalDate
import java.time.format.DateTimeFormatter


class Blocks {

    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any {
        return when (blockB) {
            String::class -> blockA.fold("") { acc, next ->
                if (next is String) acc + next else acc
            }
            Int::class -> blockA.fold(0) { acc, next ->
                if(next is Int) acc + next else acc
            }
            LocalDate::class -> {
                val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")
                return blockA.fold(LocalDate.MIN) { acc, next ->
                    if (next is LocalDate && next.isAfter(acc)) next else acc
                }.format(formatter)
            }
            else -> "Error"
        }
    }
}
