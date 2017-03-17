package sidmeyer.sayhello;

import java.util.Calendar;

/**
 * @author Stas.
 */
public class SayHello {
	/**
	 * Prints hello message depends on day time.
	 */
	public static void sayHello() {
		switch (getDayTime()) {
			case NIGHT:
				sayGoodNight();
				break;
			case MORNING:
				sayGoodMorning();
				break;
			case DAY:
				sayGoodAfternoon();
				break;
			case EVENING:
				sayGoodEvening();
				break;
			default:
				System.out.print("Здравствуйте!\n");
		}
	}

	private static void sayGoodNight() {
		System.out.print("Доброй ночи!\n");
	}

	private static void sayGoodMorning() {
		System.out.print("Доброе утро!\n");
	}

	private static void sayGoodAfternoon() {
		System.out.print("Добрый день!\n");
	}

	private static void sayGoodEvening() {
		System.out.print("Добрый вечер!\n");
	}

	private static DayTime getDayTime() {
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if (hour == 23 || hour < 6) {
			return DayTime.NIGHT;
		} else if (hour >= 6 && hour < 9) {
			return DayTime.MORNING;
		} else if (hour >= 9 && hour < 16) {
			return DayTime.DAY;
		} else {
			return DayTime.EVENING;
		}
	}
}
