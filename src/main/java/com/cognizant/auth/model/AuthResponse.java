package com.cognizant.auth.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * model class for authorization response
 * 
 * @Data is a convenient shortcut annotation that bundles the features
 *       of @ToString , @EqualsAndHashCode , @Getter / @Setter
 *       and @RequiredArgsConstructor together
 *
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AuthResponse {

	/**
	 * instance variables
	 */
	private String uid;
	private String name;
	private boolean isValid;
}
