package podcast.auth.View.Register;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "status",
        "errorMessage"
})
@XmlRootElement(name = "registerResponse")
@Getter
@Setter
public class RegisterResponse {
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = false)
    protected String errorMessage;
}
