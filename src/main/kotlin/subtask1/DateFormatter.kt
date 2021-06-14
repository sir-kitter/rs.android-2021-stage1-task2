package subtask1

import java.time.LocalDate

class DateFormatter {
    private val days = listOf("понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье")
    private val months = listOf("января", "февраля", "марта", "апреля", "мая", "июня", "июля", "августа", "сентября",
        "октября", "ноября", "декабря")

    fun toTextDay(day: String, month: String, year: String): String {
        try {
            val date = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
            return "${date.dayOfMonth} ${months[date.monthValue - 1]}, ${days[date.dayOfWeek.value - 1]}"
        }
        catch(e: Throwable) {
            return "Такого дня не существует"
        }
    }
}
