package sidmeyer.sayhello;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Calendar;

/**
 * @author Stas.
 */
public class SayHello {
	static final Logger log = LogManager.getLogger("SayHello");
	/**
	 * Prints hello message depends on day time.
	 */
	public static void sayHello() {
		DayTime dayTime = getDayTime();
		switch (dayTime) {
			case NIGHT:
				log.info("Day time is NIGHT");
				sayGoodNight();
				break;
			case MORNING:
				log.info("Day time is MORNING");
				sayGoodMorning();
				break;
			case DAY:
				log.info("Day time is DAY");
				sayGoodDay();
				break;
			case EVENING:
				log.info("Day time is EVENING");
				sayGoodEvening();
				break;
			default:
				log.error("Unrecognized day time \"" + dayTime.toString() + "\". Print default message");
				sayDefaultMessage();
		}
	}

	private static void sayGoodNight() {
		log.debug("Print NIGHT message");
		System.out.print("Доброй ночи!\n");
	}

	private static void sayGoodMorning() {
		log.debug("Print MORNING message");
		System.out.print("Доброе утро!\n");
	}

	private static void sayGoodDay() {
		log.debug("Print DAY message");
		System.out.print("Добрый день!\n");
	}

	private static void sayGoodEvening() {
		log.debug("Print EVENING message");
		System.out.print("Добрый вечер!\n");
	}

	private static void sayDefaultMessage() {
		log.debug("Print default message");
		System.out.print("Здравствуйте!\n");
	}

	private static DayTime getDayTime() {
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		log.info("Hour: " + hour);
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
