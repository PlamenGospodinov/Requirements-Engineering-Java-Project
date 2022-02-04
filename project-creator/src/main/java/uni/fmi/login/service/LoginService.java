package uni.fmi.login.service;

import java.util.Collections;
import java.util.List;

import uni.fmi.models.Participant;

public class LoginService {
	private static List<Participant> participantDb = Collections.singletonList(new Participant("Пламен","1234pass","leader"));
	public static String login(final String username, final String password) {
		if (username == null || password == null) {
			return "Въведете име и парола!";
		}
		boolean isParticipantExists = participantDb.stream()
				.anyMatch(u -> u.getUsername().equals(username) && u.getPassword().equals(password));
		return isParticipantExists ? "Успешно влязохте в систематa!" : "Грешни данни!";
	}
}

