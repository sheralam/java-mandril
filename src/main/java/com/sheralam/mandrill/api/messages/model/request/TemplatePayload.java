package com.sheralam.mandrill.api.messages.model.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
public class TemplatePayload extends Payload implements Serializable {

    private final static long serialVersionUID = 629126036398002490L;
    private String templateName;
    private TemplateContent templateContent;


    public TemplatePayload(String key) {
        super(key);
    }

    public TemplatePayload(String key, String templateName, TemplateContent templateContent) {
        super(key);
        this.templateName = templateName;
        this.templateContent = templateContent;
    }
}