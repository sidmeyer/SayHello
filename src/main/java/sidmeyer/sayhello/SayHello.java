package sidmeyer.sayhello;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Calendar;

/**
 * @author Stas.
 */
public class SayHello {
	private static final Logger LOG = LogManager.getLogger("SayHello");
	/**
	 * Prints hello message depends on day time.
	 */
	public static void sayHello() {
		DayTime dayTime = getDayTime();
		switch (dayTime) {
			case NIGHT:
				LOG.info("Day time is NIGHT");
				sayGoodNight();
				break;
			case MORNING:
				LOG.info("Day time is MORNING");
				sayGoodMorning();
				break;
			case DAY:
				LOG.info("Day time is DAY");
				sayGoodDay();
				break;
			case EVENING:
				LOG.info("Day time is EVENING");
				sayGoodEvening();
				break;
			default:
				LOG.error("Unrecognized day time \"" + dayTime.toString() + "\". Print default message");
				sayDefaultMessage();
		}
	}

	private static void sayGoodNight() {
		LOG.debug("Print NIGHT message");
		System.out.print("Доброй ночи!\n");
	}

	private static void sayGoodMorning() {
		LOG.debug("Print MORNING message");
		System.out.print("Доброе утро!\n");
	}

	private static void sayGoodDay() {
		LOG.debug("Print DAY message");
		System.out.print("Добрый день!\n");
	}

	private static void sayGoodEvening() {
		LOG.debug("Print EVENING message");
		System.out.print("Добрый вечер!\n");
	}

	private static void sayDefaultMessage() {
		LOG.debug("Print default message");
		System.out.print("Здравствуйте!\n");
	}

	private static DayTime getDayTime() {
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		LOG.info("Hour: " + hour);
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
