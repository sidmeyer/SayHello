package sidmeyer.sayhello;

import java.util.Calendar;

/**
 * Created by Stas on 08.03.2017.
 */
public class SayHello {
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
				System.out.println("Здравствуйте!");
		}
	}

	private static void sayGoodNight() {
		System.out.println("Доброй ночи!");
	}

	private static void sayGoodMorning() {
		System.out.println("Доброе утро!");
	}

	private static void sayGoodAfternoon() {
		System.out.println("Добрый день!");
	}

	private static void sayGoodEvening() {
		System.out.println("Добрый вечер!");
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
