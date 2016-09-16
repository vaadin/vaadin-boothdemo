package expo.domain;

import java.time.Instant;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * A POJO for handling email and name 
 */
public class EmailSubscription {

	private String email = "";
	private String name = "";
	private String title;
	private Instant joined = Instant.now();
	private Set<InterestType> interestTypes = new HashSet<InterestType>(
			Arrays.asList(InterestType.FreeProToolsTrial, InterestType.IntroductionVideo));

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Instant getJoined() {
		return joined;
	}

	public void setJoined(Instant joined) {
		this.joined = joined;
	}

	public Set<InterestType> getInterestTypes() {
		return interestTypes;
	}

	public void setInterestTypes(Set<InterestType> types) {
		this.interestTypes = types;
	}

	@Override
	public String toString() {
		return "Subscription{" + "email='" + email + '\'' + ", name='" + name + '\'' + ", title='" + title + '\''
				+ ", joined=" + joined + ", interestTypes=" + interestTypes + '}';
	}
}