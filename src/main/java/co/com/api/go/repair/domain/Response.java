package co.com.api.go.repair.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "message", "code", "uid" })
public class Response {

	@JsonProperty("message")
	private String message;
	@JsonProperty("code")
	private Long code;
	@JsonProperty("uid")
	private Long uid;

	@JsonProperty("message")
	public String getMessage() {
		return message;
	}

	@JsonProperty("message")
	public void setMessage(String message) {
		this.message = message;
	}

	@JsonProperty("code")
	public Long getCode() {
		return code;
	}

	@JsonProperty("code")
	public void setCode(Long code) {
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

	

}
