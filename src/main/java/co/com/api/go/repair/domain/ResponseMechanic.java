package co.com.api.go.repair.domain;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import co.com.api.go.repair.model.Client;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "message", "code", "uid", "mechanics" })
public class ResponseMechanic {
	
	@JsonProperty("message")
	private String message;
	@JsonProperty("code")
	private String code;
	@JsonProperty("uid")
	private Long uid;
	@JsonProperty("mechanics")
	private List<Client> mechanic = new ArrayList<>();

	@JsonProperty("message")
	public String getMessage() {
		return message;
	}

	@JsonProperty("message")
	public void setMessage(String message) {
		this.message = message;
	}

	@JsonProperty("code")
	public String getCode() {
		return code;
	}

	@JsonProperty("code")
	public void setCode(String code) {
		this.code = code;
	}

	@JsonProperty("uid")
	public Long getUid() {
		return uid;
	}

	@JsonProperty("uid")
	public void setUid(Long uid) {
		this.uid = uid;
	}

	@JsonProperty("mechanics")
	public List<Client> getMechanic() {
		return mechanic;
	}

	@JsonProperty("mechanics")
	public void setMechanic(List<Client> mechanic) {
		this.mechanic = mechanic;
	}
	
	

}
